package com.dhl.dhltalentlinkapp.inputfiledetails;

import static com.dhl.dhltalentlinkapp.constants.CommonConstants.attachmentText;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.endContent1;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.endContent2;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.inputHtml;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.rowContent;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.inputfiledetails.generated.GeneratedInputfiledetailsController;
import com.dhl.dhltalentlinkapp.inputfileerrordetails.Inputfileerrordetails;
import com.dhl.dhltalentlinkapp.inputfileerrordetails.InputfileerrordetailsManager;
import com.dhl.dhltalentlinkapp.masterconfig.MasterconfigManager;
import com.dhl.dhltalentlinkapp.outbound.utils.export.ExportUtil;
import com.dhl.dhltalentlinkapp.pojo.ReportDetail;
import com.dhl.dhltalentlinkapp.utils.ApiUtils;
import com.dhl.dhltalentlinkapp.utils.CommonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

/**
 * REST controller logic
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dhl
 */
@RestController
public class InputfiledetailsController extends GeneratedInputfiledetailsController {

	private @Autowired InputfiledetailsManager inputFileDetailsManager;
	private @Autowired InputfileerrordetailsManager inputFileErrorDetailsManager;
	private @Autowired MasterconfigManager masterConfigManager;
	private String localErrorFilePath;
	private @Autowired CommonUtils commonUtil;
	private @Autowired ApiUtils apiUtil;
	private @Autowired ExportUtil exportUtil;
	private final static Logger LOGGER = LoggerManager.getLogger(InputfiledetailsController.class);

	@PostConstruct
	public void initializeData() {

		localErrorFilePath = masterConfigManager.getValue(CommonConstants.LOCAL_ERROR_FILE_PATH);

	}

	@GetMapping("/webapiB")
	@ResponseBody
	@PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public String file(Authentication authentication) {
		Jwt jwt = (Jwt) authentication.getPrincipal();
		jwt.getClaims().forEach((k, v) -> {
			System.out.println(k);
		});
		return "Response from webApiB. email: " + jwt.getClaimAsString("unique_name") + ", Name: "
				+ jwt.getClaimAsString("name");
	}

	@GetMapping(path = "/adLogin", produces = "text/html")
	public String adLogin(@RequestParam("accessToken") String accessToken) {

		RestTemplate restTemplate = new RestTemplate();
		String result = "";
		try {
			HttpHeaders headers = new HttpHeaders();
			// headers.setContentType(MediaType.APPLICATION_JSON);

			headers.set("Authorization", "Bearer " + accessToken);

			HttpEntity<String> entity = new HttpEntity<>(null, headers);

			result = restTemplate.exchange("https://graph.microsoft.com/v1.0/me", HttpMethod.GET, entity, String.class)
					.getBody();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "Success" + result;
	}

	@GetMapping(path = "/viewReport", produces = "text/html")
	@PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public String showReport(@RequestParam("fileDate") String fileDate) {

		LOGGER.info("### Entering showReport method ###");

		String response = "";

		List<Inputfiledetails> processedInputFileDetails = inputFileDetailsManager.stream()
				.filter(Inputfiledetails.UPLOAD_DATE.equal(fileDate)).collect(Collectors.toList());

		if (processedInputFileDetails.size() > 0) {

			Map<Integer, ReportDetail> reportDetails = new HashMap<Integer, ReportDetail>();

			processedInputFileDetails.forEach(fileDetails -> {
				if (!reportDetails.containsKey(fileDetails.getFileId())) {
					ReportDetail reportDetail = new ReportDetail();
					reportDetail.setFileName(fileDetails.getFileName().get());
					reportDetail.setSuccessCount(fileDetails.getRecordCount().getAsInt());
					reportDetail.setTotalCount(reportDetail.getSuccessCount());
					reportDetail.setFileStatus(fileDetails.getStatus().get());
					reportDetail.setFileDate(fileDetails.getUploadDate().get());
					reportDetail.setFileReceivedDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a z")
							.format(fileDetails.getCreatedDate().get().getTime()));
					reportDetails.put(fileDetails.getFileId(), reportDetail);
				}
			});

			List<Integer> fileIds = reportDetails.keySet().stream().collect(Collectors.toList());

			System.out.println(fileIds);

			List<Inputfileerrordetails> inputFileErrorDetails = inputFileErrorDetailsManager.stream()
					.filter(Inputfileerrordetails.FILE_ID.in(fileIds)
					// .and(Inputfileerrordetails.EMAIL_STATUS.equal(CommonConstants.EMAIL_NOT_SENT))
					).collect(Collectors.toList());
			List<String> attachmentList = new ArrayList<String>();

			if (inputFileErrorDetails.size() > 0) {

				inputFileErrorDetails.forEach(fileDetails -> {
					if (reportDetails.containsKey(fileDetails.getFileId().getAsInt())) {
						ReportDetail reportDetail = reportDetails.get(fileDetails.getFileId().getAsInt());
						reportDetail.setErrorCount(fileDetails.getErrorCount().orElse(0));
						reportDetail.setTotalCount(reportDetail.getSuccessCount() + reportDetail.getErrorCount());
						reportDetail.setErrorReportLocation(fileDetails.getErrorFileName().get());

					}
					LOGGER.info(fileDetails.getFileId() + "\t" + fileDetails.getErrorCount().getAsInt());

				});
			}
			String finalRowContent = "";
			for (Map.Entry<Integer, ReportDetail> entry : reportDetails.entrySet()) {
				finalRowContent = finalRowContent + rowContent.replace("fileName", entry.getValue().getFileName())
						.replace("successCount", entry.getValue().getSuccessCount() + "")
						.replace("errorCount", entry.getValue().getErrorCount() + "")
						.replace("totalCount", entry.getValue().getTotalCount() + "")
						.replace("status", entry.getValue().getFileStatus() + "")
						.replace("statusClass",
								entry.getValue().getFileStatus().equals("READY") ? "process"
										: entry.getValue().getFileStatus().contains("SENT") ? "notice" : "" + "")
						.replace("fileDate", entry.getValue().getFileDate() + "")
						.replace("processedDate", entry.getValue().getFileReceivedDate() + "");

				if (entry.getValue().getErrorReportLocation() != null) {
					attachmentList.add(entry.getValue().getErrorReportLocation());
				}
			}

			LOGGER.info(inputHtml + finalRowContent + endContent1);

			Set<String> attachMentListSet = new LinkedHashSet<String>(attachmentList);

			String finalHtmlText = inputHtml.replace("dateSubmitted", fileDate) + finalRowContent + endContent1;

			if (attachMentListSet.size() > 0)
				finalHtmlText = finalHtmlText + attachmentText + endContent2;
			else
				finalHtmlText = finalHtmlText + endContent2;

			response = getHTMLReport("MyHR->TalentLink Status Report For " + fileDate, finalHtmlText,
					attachMentListSet);

		} else {
			LOGGER.info("No files received today ");
			response = "No files received for given date";
		}
		LOGGER.info("### Exiting process method ###");
		return response;
	}

	private String getHTMLReport(String subject, String finalHtmlText, Set<String> attachMentListSet) {

		String attachmentHref = "";

		for (String attachment : attachMentListSet) {
			attachmentHref = attachmentHref + "<br/><a target=\"_blank\" href=\"/dhltlkapi/downloadReport?fileName="
					+ attachment + "\">" + attachment + "</a>";
		}

		finalHtmlText = finalHtmlText.replace(attachmentText, " For More Details, Click below<br/>" + attachmentHref);
		finalHtmlText = finalHtmlText.replace("Hi Team,", "<b>" + subject + "</b>");
		finalHtmlText = finalHtmlText.replace("<hr/>", "");
		finalHtmlText = finalHtmlText.replace("Kindly send email to 'india@atalent.com' for any issues / concerns.", "")
				.replace("Thanks & Regards,", "").replace("aTalent Dev Team", "");
		finalHtmlText = finalHtmlText.replace(
				"Note: PLEASE DO NOT REPLY TO THIS MAIL. THIS IS AN AUTO GENERATED MAIL AND REPLIES TO THIS EMAIL ID ARE NOT ATTENDED.",
				"");
		return finalHtmlText;

	}

	@RequestMapping(value = "/downloadReport", method = RequestMethod.GET)
	@PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public ResponseEntity downloadFile(@RequestParam("fileName") String fileName, HttpServletRequest request)
			throws IOException {

		String contentType = null;
		File file = null;
		ByteArrayResource resource = null;
		byte[] data = null;
		Path path = null;
		ResponseEntity response = null;
		System.out.println("In download method....");
		try {
			if (!fileName.contains("..")) {
				System.out.println("Dir = " + localErrorFilePath + fileName);
				file = new File(localErrorFilePath + fileName);
				if (file.exists()) {
					contentType = request.getServletContext().getMimeType(file.getAbsolutePath());
					if (contentType == null) {
						contentType = "application/octet-stream";
					}
				}
				path = Paths.get(localErrorFilePath + fileName);
				data = Files.readAllBytes(path);
				resource = new ByteArrayResource(data);
				response = ResponseEntity.ok()
						.header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + path.getFileName().toString())
						.contentLength(data.length).body(resource);
			} else
				response = ResponseEntity.notFound().build();

		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
			e.printStackTrace();
			response = ResponseEntity.notFound().build();
		}
		return response;

	}

	@GetMapping(path = "/getConsolidatedReport", produces = "text/html")
	@PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public String getConsolidatedReport() {
		String response = "Report Sent Successfully";

		try {

			commonUtil.sendConsolidatedMailReport();

		} catch (Exception e) {

			LOGGER.error("Exception occured in getConsolidatedReport " + e.getMessage());
			e.printStackTrace();
			response = "Error while sending Consolidated Report, Contact Admin";

		}

		return response;
	}

	@GetMapping(path = "/getProcessedReport", produces = "text/html")
	@PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public String sendProcessedReport() {
		String response = "Report Sent Successfully";

		try {

			commonUtil.sendMailReport(true);

		} catch (Exception e) {

			LOGGER.error("Exception occured in getProcessedReport " + e.getMessage());
			e.printStackTrace();
			response = "Error while sending processed Report, Contact Admin";

		}

		return response;
	}

	@GetMapping(path = "/getFileStatus", produces = "application/json")
	@PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public String getFileStatus(@RequestParam("fileDate") String fileDate) {
		String response = "Report Sent Successfully";

		try {

			Map<Integer, ReportDetail> reportDetails = commonUtil.getStatusReportDetails(fileDate);

			ObjectMapper objectMapper = new ObjectMapper();

			try {
				String json = objectMapper
						.writeValueAsString(reportDetails.values().stream().collect(Collectors.toList()));
				System.out.println(json);
				return json;
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {

			LOGGER.error("Exception occured in getFileStatus " + e.getMessage());
			e.printStackTrace();
			response = "Error while getting filestatus, Contact Admin";

		}

		return response;
	}

	@GetMapping(path = "/getFileDates", produces = "application/json")
	@PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public String getUploadDates() {
		String response = "Report Sent Successfully";

		try {

			Map<Integer, ReportDetail> reportDetails = commonUtil.getStatusReportDetails("ALL");

			ObjectMapper objectMapper = new ObjectMapper();

			List<String> uploadDatesList = reportDetails.values().stream().map(ReportDetail::getFileDate).distinct()
					.collect(Collectors.toList());

			Collections.sort(uploadDatesList, Collections.reverseOrder());

			try {
				String json = objectMapper.writeValueAsString(uploadDatesList);
				System.out.println(json);
				return json;
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}

		} catch (Exception e) {

			LOGGER.error("Exception occured in getEmailReport " + e.getMessage());
			e.printStackTrace();
			response = "Error while sending report, Contact Admin";

		}

		return response;
	}

	@GetMapping(path = "/sendFileReceivedEmail", produces = "application/json")
	@PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public String sendFileReceivedEmail() {
		String response = "Mail Sent Successfully";

		try {

			List<Inputfiledetails> inputFileList = inputFileDetailsManager.stream()
					.filter(Inputfiledetails.STATUS.equal(CommonConstants.FILE_READY_STATUS))
					.collect(Collectors.toList());

			commonUtil.sendFileReceivedEmail(inputFileList);

		} catch (Exception e) {

			LOGGER.error("Exception occured in getEmailReport " + e.getMessage());
			e.printStackTrace();
			response = "Error while sending report, Contact Admin";

		}

		return response;
	}

	@GetMapping(path = "/updateGradeDetails", produces = "application/json")
//	@PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public String updateGradeDetails(@RequestParam("gradeType") String gradeType) {

		String res = "Job Submitted Successfully";

		new Thread() {
			public void run() {
				String response = "";
				try {
					if (CommonConstants.RCS_GRADE_TYPE.equals(gradeType))
						response = apiUtil.updateGradeDetails(CommonConstants.RCS_GRADE_TYPE);
					else if (CommonConstants.LOCAL_GRADE_TYPE.equals(gradeType))
						response = apiUtil.updateGradeDetails(CommonConstants.LOCAL_GRADE_TYPE);
					else
						response = "{\"response\":\"No such Grade type, Contact Admin\"}";

					LOGGER.info(response);

				} catch (Exception e) {

					LOGGER.error("Exception occured in updateGradeDetails " + e.getMessage());
					e.printStackTrace();
					response = "{\"response\":\"Error while updating GradeDetails, Contact Admin\"}";
					LOGGER.error(response);

				}

			}
		}.start();

		return res;
	}

//	@GetMapping(path = "/fetchDetails", produces = "application/json")
//	@PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public ResponseEntity<String> fetchDetails() {

		String res = "Job Submitted Successfully- ";

		new Thread() {
			public void run() {

				try {

					exportUtil.fetchCandidateDetails();
					exportUtil.sendEncryptedFilesToFTP(false);

				} catch (Exception e) {

					LOGGER.error("Exception occured in fetchDetails " + e.getMessage());
					e.printStackTrace();

				}

			}
		}.start();

		/*
		 * LOGGER.info("Authorization: " + authorization); if
		 * (!authorization.equals("mathan")) { return new
		 * ResponseEntity<String>("Forbidden", HttpStatus.FORBIDDEN); }
		 */

		return new ResponseEntity<String>(res, HttpStatus.OK);

	}

//	@PostMapping(path = "/resendDetails", produces = "application/json")
//	@PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public ResponseEntity<Boolean> addCandidatesToResendList(@RequestParam("candidateId") String candidateId) {

		LOGGER.info("candidateId: " + candidateId);

		boolean response = exportUtil.addResendRejectedWithdrawnDetails(candidateId,null);
		// exportUtil.fetchCandidateDetails();
		// exportUtil.sendEncryptedFilesToFTP();

		return new ResponseEntity<Boolean>(response, HttpStatus.OK);

	}

}