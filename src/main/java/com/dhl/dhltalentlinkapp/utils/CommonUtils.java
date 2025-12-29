package com.dhl.dhltalentlinkapp.utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.*;

import com.dhl.dhltalentlinkapp.EmailServiceConfig;
import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.gradedetails.Gradedetails;
import com.dhl.dhltalentlinkapp.gradedetails.GradedetailsImpl;
import com.dhl.dhltalentlinkapp.gradedetails.GradedetailsManager;
import com.dhl.dhltalentlinkapp.inputfiledetails.Inputfiledetails;
import com.dhl.dhltalentlinkapp.inputfiledetails.InputfiledetailsManager;
import com.dhl.dhltalentlinkapp.inputfileerrordetails.Inputfileerrordetails;
import com.dhl.dhltalentlinkapp.inputfileerrordetails.InputfileerrordetailsImpl;
import com.dhl.dhltalentlinkapp.inputfileerrordetails.InputfileerrordetailsManager;
import com.dhl.dhltalentlinkapp.linkvaluedetails.Linkvaluedetails;
import com.dhl.dhltalentlinkapp.linkvaluedetails.LinkvaluedetailsManager;
import com.dhl.dhltalentlinkapp.masterconfig.MasterconfigManager;
import com.dhl.dhltalentlinkapp.pojo.ErrorDetail;
import com.dhl.dhltalentlinkapp.pojo.LinkUnlinkDetails;
import com.dhl.dhltalentlinkapp.pojo.ReportDetail;
import com.dhl.dhltalentlinkapp.poswithoutgrades.Poswithoutgrades;
import com.dhl.dhltalentlinkapp.poswithoutgrades.PoswithoutgradesImpl;
import com.dhl.dhltalentlinkapp.poswithoutgrades.PoswithoutgradesManager;
import com.dhl.dhltalentlinkapp.services.ConfigurableService;
import com.dhl.dhltalentlinkapp.services.LovHierarchyService;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;

public class CommonUtils {

	private String localErrorFilePath;
	private String localProcessedFilePath;
	private String localLinkDetailsFilePath;
	protected @Autowired MasterconfigManager masterConfigManager;
	protected @Autowired InputfileerrordetailsManager inputFileErrorDetailsManager;
	protected @Autowired ExcelUtil excelUtil;
	private @Autowired EmailServiceConfig emailService;
	public @Autowired InputfiledetailsManager inputFileDetailsManager;
	protected @Autowired LinkvaluedetailsManager linkValueDetailsManager;
	protected @Autowired GradedetailsManager gradeDetailsManager;
	protected @Autowired PoswithoutgradesManager posWithoutGradesManager;
	protected @Autowired JoinComponent joinComponent;
	private Set<String> rcsGradeList;
	private Set<String> localGradeList;
	private LovHierarchyService myHierarchyService = null;
	private ConfigurableService configurableService = null;
	
	private String[] toAddressList;

	private List<String> allowedCountries;
	private String localFilePath;

	private final static Logger LOGGER = LoggerManager.getLogger(CommonUtils.class);

	@PostConstruct
	public void initializeValues() {
		localErrorFilePath = masterConfigManager.getValue(CommonConstants.LOCAL_ERROR_FILE_PATH);
		localLinkDetailsFilePath = masterConfigManager.getValue(CommonConstants.LOCAL_LINK_DETAILS_FILE_PATH);
		localProcessedFilePath = masterConfigManager.getValue(CommonConstants.LOCAL_PROCESSED_FILE_PATH);
		toAddressList = masterConfigManager.getValue(CommonConstants.TO_ADDRESS_LIST).split(",");
		allowedCountries = Arrays.asList(masterConfigManager.getValue(CommonConstants.ALLOWED_COUNTRY_LIST).split(","));
		localFilePath = masterConfigManager.getValue(CommonConstants.SFTP_LOCAL_FILE_PATH);
		rcsGradeList = new HashSet<String>();
		localGradeList = new HashSet<String>();
		myHierarchyService = new LovHierarchyService();
		configurableService = new ConfigurableService();

	}

	public void createErrorDetailsFilesAndUpdateDB(String errorFileName,
			List<Map<String, List<ErrorDetail>>> errorMapList) {

		LOGGER.info("errorMapList size: " + errorMapList.size());

		errorMapList.forEach(errorMap -> {

			errorMap.forEach((fileName, errorMessages) -> {

				LOGGER.info("errorMessages size: " + errorMessages.size());

				LOGGER.info("keyName: " + fileName);
				String inputErrorFile = fileName.split("-")[0];
				int fileId = Integer.parseInt(fileName.split("-")[1]);
				LOGGER.info("sheetName: " + inputErrorFile.replace("myHR_TalentLink_", ""));

				excelUtil.writeToExcelInMultiSheets(localErrorFilePath + "myHR_TalentLink_" + errorFileName + ".xlsx",
						inputErrorFile.replace("myHR_TalentLink_", ""), errorMessages);

				int errorCount = (int) errorMessages.stream().filter(msg -> {
					if (msg.getError_Message() != null
							&& !(msg.getError_Message().contains(CommonConstants.SOAP_ERROR_MSG_KEYWORD))) {
						return true;
					} else
						return false;
				}).count();

				LOGGER.info("errorCount withut SOAP MSG" + errorCount);

				Inputfileerrordetails inputErrorDetails = new InputfileerrordetailsImpl();
				inputErrorDetails.setCreatedTime(new Timestamp(System.currentTimeMillis()));
				inputErrorDetails.setFileId(fileId);
				inputErrorDetails.setErrorFileName("myHR_TalentLink_" + errorFileName + ".xlsx");
				inputErrorDetails.setRemarks(inputErrorFile + " ");
				inputErrorDetails.setErrorCount(errorCount);
				inputErrorDetails.setEmailStatus(EMAIL_NOT_SENT);
				errorMessages.forEach(errorDetails -> {
					LOGGER.info("ErrorDetails: " + errorDetails);
				});
				inputFileErrorDetailsManager.persist(inputErrorDetails);
			});
		});

	}

	public void moveProcessedFile(String filePath) {

		try {

			Path orgFilePath = Paths.get(filePath);
			Path processedFilePath = Paths.get(localProcessedFilePath);
			LOGGER.info(orgFilePath.toString());
			LOGGER.info(processedFilePath.resolve(orgFilePath.getFileName()).toString());
			Files.move(orgFilePath, processedFilePath.resolve(orgFilePath.getFileName()));

		} catch (Exception e) {
			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

	public void sendMailReport(boolean adhocRequest) {

		LOGGER.info("### Entering sendMailReport method ####");

		boolean errorFlag = false;
		String detailsFile ="";
		boolean runFixJob = false;
		AtomicReference<Boolean> isManagerFilePresent = new AtomicReference<Boolean>(false);
		List<String> managerFileList=new ArrayList<String>();
		String localDecryptedFileLocation = "";

		String currentDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String currentDateForEmail = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

		List<Inputfiledetails> processedInputFileDetails = inputFileDetailsManager.stream()
				.filter(Inputfiledetails.STATUS.equal(CommonConstants.FILE_PROCESSED_STATUS))
				// .and
				// (Inputfiledetails.UPLOAD_DATE.equal("20220711"))
				.collect(Collectors.toList());

		if (processedInputFileDetails.size() > 0) {

			Map<Integer, ReportDetail> reportDetails = new HashMap<Integer, ReportDetail>();

			processedInputFileDetails.forEach(fileDetails -> {
				if (!reportDetails.containsKey(fileDetails.getFileId())) {
					ReportDetail reportDetail = new ReportDetail();
					reportDetail.setFileName(fileDetails.getFileName().get());
					reportDetail.setSuccessCount(
							fileDetails.getRecordCount().isPresent() ? fileDetails.getRecordCount().getAsInt() : 0);
					reportDetail.setTotalCount(reportDetail.getSuccessCount());
					reportDetail.setFileStatus(fileDetails.getStatus().get());
					reportDetail.setFileDate(fileDetails.getUploadDate().get());
					reportDetail.setFileReceivedDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a z")
							.format(fileDetails.getCreatedDate().get().getTime()));
					reportDetails.put(fileDetails.getFileId(), reportDetail);
					if(fileDetails.getFileName().get().contains(CommonConstants.MANAGER_DETAILS_TEXT)) {
						isManagerFilePresent.set(true);						
						managerFileList.add(localFilePath + fileDetails.getUploadDate().get() + "/"+fileDetails.getFileName().get());
					}
				}
			});

			List<Integer> fileIds = reportDetails.keySet().stream().collect(Collectors.toList());

			System.out.println(fileIds);

			// add logic to remove error messages having SOAP in message from total count to
			// tally the success and error count

			List<Inputfileerrordetails> inputFileErrorDetails = inputFileErrorDetailsManager.stream()
					.filter(Inputfileerrordetails.FILE_ID.in(fileIds)
							.and(Inputfileerrordetails.EMAIL_STATUS.equal(CommonConstants.EMAIL_NOT_SENT)))
					.collect(Collectors.toList());
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
					errorFlag = true;
					attachmentList.add(localErrorFilePath + entry.getValue().getErrorReportLocation());
				}
			}
			
			detailsFile = getLinkUnlinkValueDetails(fileIds);
			if (detailsFile != null && !detailsFile.isEmpty())				
				attachmentList.add(detailsFile);
				runFixJob = true;
			// LOGGER.info(inputHtml + finalRowContent + endContent1);

			Set<String> attachMentListSet = new LinkedHashSet<String>(attachmentList);

			String finalHtmlText = inputHtml.replace("dateSubmitted", currentDateForEmail) + finalRowContent
					+ endContent1;

			if (attachMentListSet.size() > 0) {
				if (errorFlag)
					finalHtmlText = finalHtmlText + attachmentTextWithErrorDetails + endContent2;
				else
					finalHtmlText = finalHtmlText + attachmentText + endContent2;
			} else
				finalHtmlText = finalHtmlText + endContent2;

			try {
				emailService.sendEmail(toAddressList, "MyHR->TalentLink Status Report For " + currentDateForEmail,
						finalHtmlText, attachMentListSet);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (!adhocRequest) {
				inputFileErrorDetailsManager.stream()
						.filter(Inputfileerrordetails.EMAIL_STATUS.equal(CommonConstants.EMAIL_NOT_SENT)
								.and(Inputfileerrordetails.FILE_ID.in(fileIds)))
						.map(Inputfileerrordetails.EMAIL_STATUS.setTo(CommonConstants.EMAIL_SENT))
						.forEach(inputFileErrorDetailsManager.updater());

				inputFileDetailsManager.stream()
						.filter(Inputfiledetails.STATUS.equal(CommonConstants.FILE_PROCESSED_STATUS)
								.and(Inputfiledetails.FILE_ID.in(fileIds)))
						.map(Inputfiledetails.STATUS.setTo(CommonConstants.EMAIL_SENT))
						.forEach(inputFileDetailsManager.updater());
			}
			
			if(runFixJob) {
				myHierarchyService.runFixJob(detailsFile);
				if(isManagerFilePresent.get()) {
					for(String managerFileName:managerFileList) {
					configurableService.runManagerFixJob(managerFileName,myHierarchyService);
					}
				}
			}

		} else {
			LOGGER.info("No files received today ");
		}
		LOGGER.info("### - Exiting sendMailReport method ###");

	}

	public List<String> getAllowedCountries() {
		return allowedCountries;
	}

	public String getLinkUnlinkValueDetails(List<Integer> fileIds) {

		String file_suffix = "";
		try {
			List<LinkUnlinkDetails> linkUnlinkDetailsList = new ArrayList<LinkUnlinkDetails>();

			List<String> uploadDateList = new ArrayList<String>();

			Join<Tuple2<Linkvaluedetails, Inputfiledetails>> join = joinComponent
					.from(linkValueDetailsManager.IDENTIFIER).where(Linkvaluedetails.FILE_ID.in(fileIds))
					.innerJoinOn(Inputfiledetails.FILE_ID).equal(Linkvaluedetails.FILE_ID).build(Tuples::of);

			AtomicReference<Boolean> isPresent = new AtomicReference<Boolean>(false);

			join.stream().forEach(linkFileDetails -> {

				LinkUnlinkDetails details = new LinkUnlinkDetails();
				details.setFrom_field_name(linkFileDetails.get0().getFromFieldName().get());
				details.setFrom_field_value(linkFileDetails.get0().getFromFieldValue().orElse(""));
				details.setTo_field_name(linkFileDetails.get0().getToFieldName().get());
				details.setTo_field_value(linkFileDetails.get0().getToFieldValue().orElse(""));
				details.setLinkOrUnlinkStatus(linkFileDetails.get0().getLinkUnlinkStatus().get());
				details.setStatus(linkFileDetails.get0().getStatus().get().equals(ACTIVE) ? "Linked" : "Unlinked");
				details.setFile_name(linkFileDetails.get1().getFileName().get());
				details.setFile_date(linkFileDetails.get1().getUploadDate().get());
				details.setFrom_field_value_id(linkFileDetails.get0().getFromFieldValueId().getAsLong() + "");
				details.setTo_field_value_id(linkFileDetails.get0().getToFieldValueId().getAsLong() + "");

				if (!uploadDateList.contains(linkFileDetails.get1().getUploadDate().get())) {
					uploadDateList.add(linkFileDetails.get1().getUploadDate().get());
				}
				isPresent.set(true);
				linkUnlinkDetailsList.add(details);

			});

			if (isPresent.get()) {
				file_suffix = String.join("_", uploadDateList);

				excelUtil.writeToExcelInMultiSheets(
						localLinkDetailsFilePath + "myHr_TalentLink_" + file_suffix + "_details.xlsx",
						"Link_Unlink_Details", linkUnlinkDetailsList);

				return localLinkDetailsFilePath + "myHr_TalentLink_" + file_suffix + "_details.xlsx";
			} else {
				return null;
			}
		} catch (Exception e) {
			LOGGER.error("Exception occured while creating details file.." + e.getMessage());
			e.printStackTrace();
			File file = new File(localLinkDetailsFilePath + "myHr_TalentLink_" + file_suffix + "_details.xlsx");
			if (file.exists())
				return localLinkDetailsFilePath + "myHr_TalentLink_" + file_suffix + "_details.xlsx";
			else
				return null;
		}
	}

	public Map<Integer, ReportDetail> getStatusReportDetails(String fileDate) {

		LOGGER.info("### Entering getStatusReportDetails method ####");

		Map<Integer, ReportDetail> reportDetails = new HashMap<Integer, ReportDetail>();

		List<Inputfiledetails> processedInputFileDetails = null;
		if ("ALL".equals(fileDate)) {
			processedInputFileDetails = inputFileDetailsManager.stream().collect(Collectors.toList());
		} else {
			processedInputFileDetails = inputFileDetailsManager.stream().filter// (Inputfiledetails.STATUS.equal(CommonConstants.FILE_PROCESSED_STATUS))
																				// .and
			(Inputfiledetails.UPLOAD_DATE.equal(fileDate)).collect(Collectors.toList());
		}

		if (processedInputFileDetails.size() > 0) {

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
					LOGGER.info(fileDetails.getFileId().getAsInt() + "\t" + fileDetails.getErrorCount().getAsInt());

				});
			}

		} else {
			LOGGER.info("No files received today ");
		}
		LOGGER.info("### - Exiting getStatusReportDetails method ###");

		return reportDetails;
	}

	public void sendFileReceivedEmail(List<Inputfiledetails> inputFileList) {

		LOGGER.info("### Entering sendFileReceivedEmail method ####");

		try {
			String sftpEmailTemplate = "<!DOCTYPE html>\n" + "<html lang=\"en\">\n" + "<head>\n"
					+ "    <meta charset=\"UTF-8\">\n"
					+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
					+ "    <title>Table Design || Future Web</title>\n" + "<style>\n" + "    * {\n"
					+ "        margin: 0;\n" + "        padding: 0;\n" + "        box-sizing: border-box;\n" + "    }\n"
					+ "    body{\n" + "        font-family: Arial, Helvetica, sans-serif;\n"
					+ "        font-style: normal;\n" + "    }\n" + "    .main-container {\n" + "        width: 100%;\n"
					+ "        max-width: 1600px;\n" + "        background-color:#FFF;\n"
					+ "        margin: 20px auto;\n" + "        padding: 10px;\n" + "    }\n" + "    table {\n"
					+ "        width: 60%;\n" + "        border-collapse: collapse;\n"
					+ "        border: 1px solid grey;\n" + "    }\n" + "    thead th {\n"
					+ "        background-color:#42a5f5;\n" + "        color: #ffffff;\n" + "        font-size: 13px;\n"
					+ "        font-weight: 400;\n" + "        text-align: center;\n" + "    }\n" + "    th{\n"
					+ "        border-right: 1px solid grey;\n" + "        padding: 15px 2px;\n"
					+ "        overflow-wrap: break-word;\n" + "        word-wrap: break-word;\n"
					+ "        hyphens: auto;\n" + "        }\n" + "    td {\n" + "        padding: 8px 2px;\n"
					+ "        font-size: 12px;\n" + "        text-align: center;\n"
					+ "        border: 1px solid grey;\n" + "        overflow-wrap: anywhere;\n"
					+ "        word-wrap: anywhere;\n" + "        hyphens: auto;\n" + "    }\n"
					+ "    tr:nth-child(even) {\n" + "        background-color: #ffffff;\n" + "    }\n"
					+ "    tr:nth-child(odd) {\n" + "        background-color: #ffffff;\n" + "    }\n"
					+ "    tr:hover td {\n" + "        color: #44b478;\n" + "        cursor: pointer;\n"
					+ "        background-color: #dddddd;\n" + "    }\n" + "    td button {\n"
					+ "        border: none;\n" + "        padding: 4px 10px;\n" + "        border-radius: 20px;\n"
					+ "        background: #cff6dd;\n" + "        color: #1fa750;\n" + "        font-size: 12px;\n"
					+ "    }\n" + "    td button.send {\n" + "        border: none;\n" + "        padding: 4px 2px;\n"
					+ "        border-radius: 20px;\n" + "        background: #cff6dd;\n" + "        color: #1fa750;\n"
					+ "        min-width: 130px;\n" + "    }\n" + "    td button.send .active {\n"
					+ "        color: #1fa750;\n" + "    }\n" + "    td button.send .active:after {\n"
					+ "        background: #1fa750;\n" + "    }\n" + "    td button.send span {\n"
					+ "        position: relative;\n" + "        border-radius: 30px;\n"
					+ "        padding: 4px 10px 4px 8px;\n" + "    }\n" + "    td button.send span::after{\n"
					+ "        position: absolute;\n" + "        top: 7px;\n" + "        left: 4px;\n"
					+ "        width: 10px;\n" + "        height: 10px;\n" + "        content: '';\n"
					+ "        border-radius: 50%;\n" + "    }\n" + "\n" + "    td button.notice {\n"
					+ "        border: none;\n" + "        padding: 4px 10px;\n" + "        border-radius: 20px;\n"
					+ "        background: #fdf5dd;\n" + "        color: #ff6d00;\n" + "    }\n"
					+ "    td button.notice .active {\n" + "        color:#ff6d00;\n" + "    }\n"
					+ "    td button.notice .active:after {\n" + "        background: #ff6d00;\n" + "    }\n"
					+ "    td button.notice span {\n" + "        position: relative;\n"
					+ "        border-radius: 30px;\n" + "        padding: 4px 10px 4px 8px;\n" + "    }\n"
					+ "    td button.notice span::after {\n" + "        position: absolute;\n" + "        top: 7px;\n"
					+ "        left: 4px;\n" + "        width: 10px;\n" + "        height: 10px;\n"
					+ "        content: '';\n" + "        border-radius: 50%;\n" + "    }\n"
					+ "    td button.process {\n" + "        border: none;\n" + "        padding: 4px 10px;\n"
					+ "        border-radius: 20px;\n" + "        background: #fdf5dd;\n" + "        color: #cfa00c;\n"
					+ "    }\n" + "    td button.failure {\n" + "        border: none;\n"
					+ "        padding: 4px 10px;\n" + "        border-radius: 20px;\n"
					+ "        background: #e8b5b5;\n" + "        color: #e14949;\n" + "    }\n"
					+ "    td button.failure .active {\n" + "     color: #e14949;\n" + "    }\n"
					+ "    td button.failure .active:after {\n" + "        background: #e14949;\n" + "    }\n"
					+ "    td button.failure span {\n" + "        position: relative;\n"
					+ "        border-radius: 30px;\n" + "        padding: 4px 10px 4px 8px;\n" + "    }\n"
					+ "    td button.failure span::after{\n" + "        position: absolute;\n" + "        top: 7px;\n"
					+ "        left: 4px;\n" + "        width: 10px;\n" + "        height: 10px;\n"
					+ "        content: '';\n" + "        border-radius: 50%;\n" + "    }\n"
					+ "    td button.process .active {\n" + "        color:#cfa00c;\n" + "    }\n"
					+ "    td button.process .active:after {\n" + "        background: #cfa00c;\n" + "    }\n"
					+ "    td button.process span {\n" + "        position: relative;\n"
					+ "        border-radius: 30px;\n" + "        padding: 4px 10px 4px 8px;\n" + "    }\n"
					+ "    td button.process span::after{\n" + "        position: absolute;\n" + "        top: 7px;\n"
					+ "        left: 4px;\n" + "        width: 10px;\n" + "        height: 10px;\n"
					+ "        content: '';\n" + "        border-radius: 50%;\n" + "    }\n" + "    .buttonDownload {\n"
					+ "        display: inline-block;\n" + "        position: relative;\n"
					+ "        padding: 10px 27px;\n" + "        background-color: green;\n" + "        color: white;\n"
					+ "        text-decoration: none;\n" + "        font-size: 12px;\n"
					+ "        text-align: center;\n" + "        text-indent: 15px;\n" + "        border-radius: 5px;\n"
					+ "        margin-top: 20px;\n" + "    }\n" + "    .buttonDownload:hover {\n"
					+ "        background-color: darkgreen;\n" + "        color: white;\n" + "    }\n"
					+ "    .buttonDownload:before, .buttonDownload:after {\n" + "        content: ' ';\n"
					+ "        display: block;\n" + "        position: absolute;\n" + "        left: 15px;\n"
					+ "        top: 52%;\n" + "    }\n" + "    .buttonDownload:before {\n" + "        width: 10px;\n"
					+ "        height: 2px;\n" + "        border-style: solid;\n" + "        border-width: 0 2px 2px;\n"
					+ "    }\n" + "    .buttonDownload:after {\n" + "        width: 0;\n" + "        height: 0;\n"
					+ "        margin-left: 3px;\n" + "        margin-top: -7px;\n" + "        border-style: solid;\n"
					+ "        border-width: 4px 4px 0 4px;\n" + "        border-color: transparent;\n"
					+ "        border-top-color: inherit;\n" + "        animation: downloadArrow 2s linear infinite;\n"
					+ "        animation-play-state: paused;\n" + "    }\n" + "    .buttonDownload:hover:before {\n"
					+ "        border-color: #fff;\n" + "    }\n" + "    .buttonDownload:hover:after {\n"
					+ "        border-top-color: #fff;\n" + "        animation-play-state: running;\n" + "    }\n"
					+ "    @keyframes downloadArrow {\n" + "        0% {\n" + "            margin-top: -7px;\n"
					+ "            opacity: 1;\n" + "        }\n" + "        0.001% {\n"
					+ "            margin-top: -15px;\n" + "            opacity: 0;\n" + "        }\n"
					+ "        50% {\n" + "            opacity: 1;\n" + "        }\n" + "        100% {\n"
					+ "            margin-top: 0;\n" + "            opacity: 0;\n" + "        }\n" + "    }\n"
					+ "</style>\n" + "</head>\n" + " <body>\n" + "  <div class=\"main-container\">" + "Hi Team, \n"
					+ "<br/>\n" + "<br/>\n"
					+ "We would like to acknowledge that we have received below files in our SFTP server for processing. \n"
					+ "<br/>\n" + "<br/>\n" + "  <table>\n" + "             <thead>\n" + "                <tr>\n"
					+ "                    <th>File Name</th>                   \n"
					+ "                    <th>Status</th>\n" + "                </tr>\n" + "            </thead>\n"
					+ "            <tbody>";

			String sftpTemplateRowContent = "<tr>\n" + "                    <td>fileName</td>\n"
					+ "                    <td><button class=\"send\"> <span class=\"active\"></span>READY TO BE PROCESSED</button></td>\n"
					+ "                </tr>";

			String sftpTemplateEndContent = " </tbody>\n" + "        </table>\n" + "        <br/>\n"
					+ "                <br/>\n" + "We will send notification once the files are processed. \n";

			String endTemplateContent = "<br/><br/>Kindly send email to 'india@atalent.com' for any issues / concerns. \n"
					+ "<br/><br/><br/>\n" + "Thanks & Regards,<br/>\n" + "aTalent Dev Team\n" + "<hr/>\n" + "\n<br/>"
					+ "Note: PLEASE DO NOT REPLY TO THIS MAIL. THIS IS AN AUTO GENERATED MAIL AND REPLIES TO THIS EMAIL ID ARE NOT ATTENDED.\n"
					+ "    </div>\n" + " </body>\n" + "</html>";

			String currentDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
			String currentDateForEmail = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

			for (int i = 0; i < inputFileList.size(); i++) {

				sftpEmailTemplate = sftpEmailTemplate
						+ sftpTemplateRowContent.replace("fileName", inputFileList.get(i).getFileName().get());

			}

			String finalHtmlText = sftpEmailTemplate + sftpTemplateEndContent + endTemplateContent;

			emailService.sendEmail(toAddressList, "MyHR->TalentLink SFTP Notification - " + currentDateForEmail,
					finalHtmlText, null);
		} catch (Exception e) {
			LOGGER.info("### - Error occured in sendFileReceivedEmail method ### " + e.getMessage());
			e.printStackTrace();

		}

		LOGGER.info("### - Exiting sendFileReceivedEmail method ###");

	}

	public void sendConsolidatedMailReport() {

		LOGGER.info("### Entering sendConsolidatedMailReport method ####");

		String currentDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String currentDateForEmail = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

		Calendar startTime = Calendar.getInstance();
		startTime.set(Calendar.HOUR_OF_DAY, 00);
		startTime.set(Calendar.MINUTE, 00);
		startTime.set(Calendar.SECOND, 00);
		startTime.set(Calendar.MILLISECOND, 00);

		startTime.add(Calendar.DATE, -1);
		startTime.set(Calendar.HOUR_OF_DAY, 17);
		startTime.set(Calendar.MINUTE, 30);

		Calendar currentTime = Calendar.getInstance();
		currentTime.setTime(new Date());

		List<Inputfiledetails> processedInputFileDetails = inputFileDetailsManager.stream().filter
		// (Inputfiledetails.STATUS.equal(CommonConstants.FILE_PROCESSED_STATUS))
		// .and
		(Inputfiledetails.CREATED_DATE.between(new Timestamp(startTime.getTimeInMillis()),
				new Timestamp(System.currentTimeMillis()))).collect(Collectors.toList());

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
					attachmentList.add(localErrorFilePath + entry.getValue().getErrorReportLocation());
				}
			}

			LOGGER.info(inputHtml + finalRowContent + endContent1);

			Set<String> attachMentListSet = new LinkedHashSet<String>(attachmentList);

			String finalHtmlText = inputHtml.replace("dateSubmitted", currentDateForEmail) + finalRowContent
					+ endContent1;

			if (attachMentListSet.size() > 0)
				finalHtmlText = finalHtmlText + attachmentText + endContent2;
			else
				finalHtmlText = finalHtmlText + endContent2;

			try {
				emailService.sendEmail(toAddressList,
						"MyHR->TalentLink Consolidated Status Report For " + currentDateForEmail, finalHtmlText,
						attachMentListSet);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			/*
			 * if (!adhocRequest) { inputFileErrorDetailsManager.stream()
			 * .filter(Inputfileerrordetails.EMAIL_STATUS.equal(CommonConstants.
			 * EMAIL_NOT_SENT) .and(Inputfileerrordetails.FILE_ID.in(fileIds)))
			 * .map(Inputfileerrordetails.EMAIL_STATUS.setTo(CommonConstants.EMAIL_SENT))
			 * .forEach(inputFileErrorDetailsManager.updater());
			 * 
			 * inputFileDetailsManager.stream()
			 * .filter(Inputfiledetails.STATUS.equal(CommonConstants.FILE_PROCESSED_STATUS)
			 * .and(Inputfiledetails.FILE_ID.in(fileIds)))
			 * .map(Inputfiledetails.STATUS.setTo(CommonConstants.EMAIL_SENT))
			 * .forEach(inputFileDetailsManager.updater()); }
			 */

		} else {
			LOGGER.info("No files received today ");
		}
		LOGGER.info("### - Exiting sendConsolidatedMailReport method ###");

	}

	public Set<String> getAllRCSGradeValues() {

		if (rcsGradeList.isEmpty()) {

			Set<String> rcsGrades = gradeDetailsManager.stream()
					.filter(Gradedetails.GRADE_TYPE.equal(CommonConstants.RCS_GRADE_TYPE))
					.map(details -> details.getGradeValue().get()).collect(Collectors.toSet());

			if (rcsGrades != null && rcsGrades.size() > 0)
				rcsGradeList.addAll(rcsGrades);
		}
		LOGGER.info(rcsGradeList.toString());

		return rcsGradeList;
	}

	public Set<String> getAllLocalGradeValues() {

		if (localGradeList.isEmpty()) {

			Set<String> localGrades = gradeDetailsManager.stream()
					.filter(Gradedetails.GRADE_TYPE.equal(CommonConstants.LOCAL_GRADE_TYPE))
					.map(details -> details.getGradeValue().get()).collect(Collectors.toSet());

			if (localGrades != null && localGrades.size() > 0)
				localGradeList.addAll(localGrades);
		}
		LOGGER.info(localGradeList.toString());
		return localGradeList;
	}

	public void resetGradeCacheValues() {

		rcsGradeList.clear();
		localGradeList.clear();

	}

	public void addPositionWithoutGradeDetails(String myhrPositionCode, String gradeType) {

		LOGGER.info("In addPositionWithoutGradeDetails ");
		Optional<Poswithoutgrades> posWithoutGradeDetails = posWithoutGradesManager.stream()
				.filter(Poswithoutgrades.POSITION_CODE.equal(myhrPositionCode)).findAny();

		if (posWithoutGradeDetails.isPresent()) {
			if (CommonConstants.RCS_GRADE_TYPE.equals(gradeType)) {
				if (posWithoutGradeDetails.get().getRcsGrade() != 0) {

					posWithoutGradeDetails.get().setRcsGrade(0);
					posWithoutGradeDetails.get().setUpdateTime(new Timestamp(System.currentTimeMillis()));
					posWithoutGradesManager.update(posWithoutGradeDetails.get());

				}
			} else if (CommonConstants.LOCAL_GRADE_TYPE.equals(gradeType)) {
				if (posWithoutGradeDetails.get().getLocalGrade() != 0) {

					posWithoutGradeDetails.get().setLocalGrade(0);
					posWithoutGradeDetails.get().setUpdateTime(new Timestamp(System.currentTimeMillis()));
					posWithoutGradesManager.update(posWithoutGradeDetails.get());

				}
			}
		} else {
			Poswithoutgrades positionWithoutGradeDetails = new PoswithoutgradesImpl();
			positionWithoutGradeDetails.setPositionCode(myhrPositionCode);

			if (CommonConstants.LOCAL_GRADE_TYPE.equals(gradeType)) {
				positionWithoutGradeDetails.setLocalGrade(0);
				positionWithoutGradeDetails.setRcsGrade(-1);
			} else {
				positionWithoutGradeDetails.setRcsGrade(0);
				positionWithoutGradeDetails.setLocalGrade(-1);

			}
			positionWithoutGradeDetails.setUpdateTime(new Timestamp(System.currentTimeMillis()));
			posWithoutGradesManager.persist(positionWithoutGradeDetails);
		}

	}

	public void removePositionWithoutGradeDetails(String myhrPositionCode, String gradeType, int fileId) {

		LOGGER.info("In removePositionWithoutGradeDetails with gradeType " + gradeType);
		Optional<Poswithoutgrades> posWithoutGradeDetails = posWithoutGradesManager.stream()
				.filter(Poswithoutgrades.POSITION_CODE.equal(myhrPositionCode)).findAny();

		if (posWithoutGradeDetails.isPresent()) {
			LOGGER.info("posWithoutGradeDetails exists " + myhrPositionCode);

			if (CommonConstants.RCS_GRADE_TYPE.equals(gradeType)) {
				if (posWithoutGradeDetails.get().getRcsGrade() == 0) {
					LOGGER.info("updating rcsgrade from 0 to 1");
					posWithoutGradeDetails.get().setRcsGrade(1);
					posWithoutGradeDetails.get().setUpdateTime(new Timestamp(System.currentTimeMillis()));
					posWithoutGradesManager.update(posWithoutGradeDetails.get());
				}
			} else if (CommonConstants.LOCAL_GRADE_TYPE.equals(gradeType)) {
				if (posWithoutGradeDetails.get().getLocalGrade() == 0) {
					LOGGER.info("updating local grade from 0 to 1");
					posWithoutGradeDetails.get().setLocalGrade(1);
					posWithoutGradeDetails.get().setUpdateTime(new Timestamp(System.currentTimeMillis()));
					posWithoutGradesManager.update(posWithoutGradeDetails.get());
				}
			}
		}

	}

	public void removePositionWithoutGradeDetails(String myhrPositionCode) {

		LOGGER.info("In removePositionWithoutGradeDetails, myhrPositionCode: " + myhrPositionCode);

		Optional<Poswithoutgrades> posWithoutGradeDetails = posWithoutGradesManager.stream()
				.filter(Poswithoutgrades.POSITION_CODE.equal(myhrPositionCode)).findAny();

		if (posWithoutGradeDetails.isPresent()) {
			posWithoutGradesManager.remove(posWithoutGradeDetails.get());

		}
	}

}
