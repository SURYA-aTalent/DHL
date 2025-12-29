package com.dhl.dhltalentlinkapp.outbound.utils.export;

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
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

import javax.annotation.PostConstruct;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.cronutils.utils.StringUtils;
import com.dhl.dhltalentlinkapp.EmailServiceConfig;
import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.dao.StructuredFormQADto;
import com.dhl.dhltalentlinkapp.masterconfig.MasterconfigManager;
import com.dhl.dhltalentlinkapp.outbound.australiaexportdata.AustraliaexportdataImpl;
import com.dhl.dhltalentlinkapp.outbound.australiaexportdata.AustraliaexportdataManager;
import com.dhl.dhltalentlinkapp.outbound.basicexportdata.Basicexportdata;
import com.dhl.dhltalentlinkapp.outbound.basicexportdata.BasicexportdataImpl;
import com.dhl.dhltalentlinkapp.outbound.basicexportdata.BasicexportdataManager;
import com.dhl.dhltalentlinkapp.outbound.dao.export.AustraliaExportData;
import com.dhl.dhltalentlinkapp.outbound.dao.export.ExportData;
import com.dhl.dhltalentlinkapp.outbound.dao.export.IndiaExportData;
import com.dhl.dhltalentlinkapp.outbound.dao.export.SingaporeExportData;
import com.dhl.dhltalentlinkapp.outbound.dao.export.sdh.SDHExportData;
import com.dhl.dhltalentlinkapp.outbound.indiaexportdata.IndiaexportdataImpl;
import com.dhl.dhltalentlinkapp.outbound.indiaexportdata.IndiaexportdataManager;
import com.dhl.dhltalentlinkapp.outbound.indonesiaexportdata.IndonesiaexportdataManager;
import com.dhl.dhltalentlinkapp.outbound.malaysiaexportdata.MalaysiaexportdataManager;
import com.dhl.dhltalentlinkapp.outbound.resenddetails.Resenddetails;
import com.dhl.dhltalentlinkapp.outbound.resenddetails.ResenddetailsImpl;
import com.dhl.dhltalentlinkapp.outbound.resenddetails.ResenddetailsManager;
import com.dhl.dhltalentlinkapp.outbound.sdhexportdata.Sdhexportdatadtls;
import com.dhl.dhltalentlinkapp.outbound.sdhexportdata.SdhexportdatadtlsImpl;
import com.dhl.dhltalentlinkapp.outbound.sdhexportdata.SdhexportdatadtlsManager;
import com.dhl.dhltalentlinkapp.outbound.singaporeexportdata.SingaporeexportdataImpl;
import com.dhl.dhltalentlinkapp.outbound.singaporeexportdata.SingaporeexportdataManager;
import com.dhl.dhltalentlinkapp.outbound.vietnamexportdata.VietnamexportdataManager;
import com.dhl.dhltalentlinkapp.services.CandidateDetailsService;
import com.dhl.dhltalentlinkapp.services.DocumentService;
import com.dhl.dhltalentlinkapp.services.PositionDetailsService;
import com.dhl.dhltalentlinkapp.services.UserDetailsService;
import com.dhl.dhltalentlinkapp.utils.CSVWriterUtil;
import com.dhl.dhltalentlinkapp.utils.EncryptDecryptUtil;
import com.dhl.dhltalentlinkapp.utils.SFTPUtil;
import com.mrted.ws.candidate.ApplicationDto;
import com.mrted.ws.candidate.Profile;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class ExportUtil {

	private final static Logger LOGGER = LoggerManager.getLogger(ExportUtil.class);

	protected @Autowired CSVWriterUtil csvWriterUtil;
	protected @Autowired ExportUtilsFactory exportUtilsFactory;
	protected @Autowired MasterconfigManager masterConfigManager;
	protected SimpleDateFormat sdf, startDateFormat, expectedFormat;
	protected @Autowired EncryptDecryptUtil encryptDecryptUtil;
	protected @Autowired SFTPUtil sftpUtil;
	private @Autowired EmailServiceConfig emailService;
	protected Map<String, Integer> daysBeforeMap;
	List<String> encryptedFileList;
	Map<String, String> errorMap;
	Map<String, String> countryCodeMap;
	private String[] toAddressList;
	private String[] sdhToAddressList;
	private List<String> allowedFormNamesList;

	protected @Autowired ResenddetailsManager resendDetailsManager;

	private List<ExportData> australiaExportList, indiaExportList, indonesiaExportList, malaysiaExportList,
			singaporeExportList, vietnamExportList;

	private List<SDHExportData> sdhExportList;

	protected @Autowired BasicexportdataManager basicExportDataManager;
	protected @Autowired SdhexportdatadtlsManager sdhExportDataManager;
	protected @Autowired AustraliaexportdataManager australiaDataManager;
	protected @Autowired IndiaexportdataManager indiaDataManager;
	protected @Autowired IndonesiaexportdataManager indonesiaDataManager;
	protected @Autowired MalaysiaexportdataManager malaysiaDataManager;
	protected @Autowired SingaporeexportdataManager singaporeDataManager;
	protected @Autowired VietnamexportdataManager vietnamDataManager;

	private ValidatorFactory factory = null;
	private Validator validator = null;

	@PostConstruct
	public void initExportUtil() {

		sdf = new SimpleDateFormat(CommonConstants.SFTP_UPLOAD_DATE_FORMAT);
		startDateFormat = new SimpleDateFormat(CommonConstants.CONTRACT_START_DATE_FORMAT);
		expectedFormat = new SimpleDateFormat("yyyy/MM/dd");
		encryptedFileList = new ArrayList<String>();

		australiaExportList = new ArrayList<ExportData>();
		indiaExportList = new ArrayList<ExportData>();

		indonesiaExportList = new ArrayList<ExportData>();
		malaysiaExportList = new ArrayList<ExportData>();

		singaporeExportList = new ArrayList<ExportData>();
		vietnamExportList = new ArrayList<ExportData>();

		sdhExportList = new ArrayList<SDHExportData>();

		errorMap = new HashMap<String, String>();

		daysBeforeMap = new HashMap<String, Integer>();
		daysBeforeMap.put(CommonConstants.COUNTRY_AUSTRALIA,
				masterConfigManager.getIntValue(CommonConstants.AUSTRALIA_X_VALUE));
		daysBeforeMap.put(CommonConstants.COUNTRY_INDIA,
				masterConfigManager.getIntValue(CommonConstants.INDIA_X_VALUE));

		toAddressList = masterConfigManager.getValue(CommonConstants.OUTBOUND_TO_ADDRESS_LIST).split(",");
		sdhToAddressList = masterConfigManager.getValue(CommonConstants.OUTBOUND_TO_ADDRESS_LIST_SDH).split(",");
		allowedFormNamesList = Arrays
				.asList(masterConfigManager.getValue(CommonConstants.ALLOWED_FORM_NAMES_LIST).split(","));

		factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
		countryCodeMap = new HashMap<String, String>();
		countryCodeMap.put(CommonConstants.COUNTRY_AUSTRALIA, CommonConstants.COUNTRY_AUSTRALIA_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_INDIA, CommonConstants.COUNTRY_INDIA_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_SINGAPORE, CommonConstants.COUNTRY_SINGAPORE_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_MALAYSIA, CommonConstants.COUNTRY_MALAYSIA_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_INDONESIA, CommonConstants.COUNTRY_INDONESIA_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_VIETNAM, CommonConstants.COUNTRY_VIETNAM_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_VIETNAM, CommonConstants.COUNTRY_VIETNAM_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_VIETNAM_OLD, CommonConstants.COUNTRY_VIETNAM_CODE);
		
		countryCodeMap.put(CommonConstants.COUNTRY_NEW_ZEALAND, CommonConstants.COUNTRY_NEW_ZEALAND_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_PHILIPPINES, CommonConstants.COUNTRY_PHILIPPINES_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_KOREA, CommonConstants.COUNTRY_KOREA_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_JAPAN, CommonConstants.COUNTRY_JAPAN_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_TAIWAN, CommonConstants.COUNTRY_TAIWAN_CODE);
		countryCodeMap.put(CommonConstants.COUNTRY_THAILAND, CommonConstants.COUNTRY_THAILAND_CODE);
		
	}

	public boolean isDateCheckPassed(String contract_start_date_from_offer_form, int xDays) {

		try {
			SimpleDateFormat expectedFormat = new SimpleDateFormat("yyyy/MM/dd");
			Calendar startDate = Calendar.getInstance();
			startDate.setTime(expectedFormat.parse(contract_start_date_from_offer_form));
			startDate.set(Calendar.HOUR_OF_DAY, 24);
			startDate.set(Calendar.MINUTE, 0);
			startDate.set(Calendar.SECOND, 0);
			startDate.set(Calendar.MILLISECOND, 0);

			Calendar today = Calendar.getInstance();

			// Create a calendar for 10 days ago
			Calendar tenDaysAgo = Calendar.getInstance();
			tenDaysAgo.add(Calendar.DATE, -xDays);

			// Create a calendar for 30 days from now
			Calendar thirtyDaysFromNow = Calendar.getInstance();
			thirtyDaysFromNow.add(Calendar.DATE, 30);

			// Set the time of day to midnight for all calendars

			today.set(Calendar.HOUR_OF_DAY, 0);
			today.set(Calendar.MINUTE, 0);
			today.set(Calendar.SECOND, 0);
			today.set(Calendar.MILLISECOND, 0);

			tenDaysAgo.set(Calendar.HOUR_OF_DAY, 0);
			tenDaysAgo.set(Calendar.MINUTE, 0);
			tenDaysAgo.set(Calendar.SECOND, 0);
			tenDaysAgo.set(Calendar.MILLISECOND, 0);

			thirtyDaysFromNow.set(Calendar.HOUR_OF_DAY, 0);
			thirtyDaysFromNow.set(Calendar.MINUTE, 0);
			thirtyDaysFromNow.set(Calendar.SECOND, 0);
			thirtyDaysFromNow.set(Calendar.MILLISECOND, 0);

			System.out.println(startDate.getTime());
			System.out.println(tenDaysAgo.getTime());

			System.out.println(thirtyDaysFromNow.getTime());

			if (startDate.getTime().after(tenDaysAgo.getTime())
					&& startDate.getTime().before(thirtyDaysFromNow.getTime())) {
				System.out.println("Date Condition satisfied.."); // logic is: 30 days in the future, 10 days in the
																	// past
				return true;
			}

		} catch (Exception e) {
			System.out.println("Exception occured in isDateCheckPassed " + e.getMessage());
			e.printStackTrace();
		}

		return false; // true - temporary, false - permanent
	}

	public synchronized void fetchCandidateDetails() {

		LOGGER.info("Entering fetchCandidateDetails ");

		CandidateDetailsService candidateService = new CandidateDetailsService();
		DocumentService documentService = new DocumentService();
		PositionDetailsService positionDetailsService = new PositionDetailsService();
		UserDetailsService userService = new UserDetailsService();

		Map<String, String> applicationIdMap = new HashMap<String, String>();

		/*
		 * final List<String> allowedFormNames = Arrays.asList(
		 * "AU_White Collar (Long) + security protocol check + candidate information + Working Rights"
		 * , "*myHR - Application Forms for WC long forms",
		 * "Pre-Hire form for myHR test v3",
		 * "Pre-Hire form for myHR test v3 - Vietnam");
		 */

//		final List<String> allowedFormNames = Arrays.asList(				
		// "Pre-Hire form for myHR test v3",
		// "Pre-Hire form for myHR test v3 - Vietnam");

		final List<StructuredFormQADto> finalQuestAnswerList = new ArrayList<StructuredFormQADto>();

		List<ApplicationDto> selectedCandidates = candidateService.getAllHiredOfferedAcceptedCandidateDetails(false);

		List<ApplicationDto> finalSelectedCandidates = new ArrayList<ApplicationDto>();

		selectedCandidates.forEach(candidate -> {
			LOGGER.info("Candidate ID: " + candidate.getCandidateId());
			LOGGER.info("Candidate Status: " + candidate.getStatus());

			if (!CommonConstants.REJECTED_STATUS.equalsIgnoreCase(candidate.getStatus())
					&& !CommonConstants.WITHDRAWN_STATUS.equalsIgnoreCase(candidate.getStatus())) {
				if (!CommonConstants.HIRED_STATUS.equalsIgnoreCase(candidate.getStatus())) {
					finalSelectedCandidates.add(candidate);
				} else if (!isAlreadyProcessedRecord(candidate.getCandidateId() + "")) {
					finalSelectedCandidates.add(candidate);
				}

			} else if (isAlreadyProcessedRecord(candidate.getCandidateId() + "")) {
				finalSelectedCandidates.add(candidate);
			}

		});

		// System.exit(0);

		australiaExportList.clear();
		indiaExportList.clear();
		indonesiaExportList.clear();
		malaysiaExportList.clear();
		singaporeExportList.clear();
		vietnamExportList.clear();
		encryptedFileList.clear();
		errorMap.clear();

		

	
		finalSelectedCandidates.forEach(candidate -> {
			try {
			finalQuestAnswerList.clear();
			

			LOGGER.info("Candidate ID: " + candidate.getCandidateId());
			LOGGER.info("Candidate Status: " + candidate.getStatus());

			Profile candidateProfile = candidateService.getCandidateDetailsById(candidate.getCandidateId());

			String employeeID = candidateService.getEmpIDFromStructuredDocumentById(candidate.getCandidateId());

			String candidateGID = candidateService.getGlobalIDFromStructuredDocumentById(candidate.getCandidateId());

			LOGGER.info("FirstName: " + candidateProfile.getFirstname());
			LOGGER.info("LastName: " + candidateProfile.getLastname());
			LOGGER.info("Email: " + candidateProfile.getEmail());
			LOGGER.info("ApplicaitonId: " + candidateProfile.getApplicationId());
			LOGGER.info("employeeID: " + employeeID);
			LOGGER.info("candidateGID: " + candidateGID);

			List<Integer> structuredDocIds = documentService
					.getStructuredDocumentsIdsByCandidateId(candidate.getCandidateId(), allowedFormNamesList);

			if (documentService.getPreHireFormAvailability().containsKey(candidate.getCandidateId())
					&& documentService.getPreHireFormAvailability().get(candidate.getCandidateId())) {
				structuredDocIds.forEach(documentId -> {
					finalQuestAnswerList.addAll(documentService.getStructuredDocumentQAById((long) documentId));
				});

				finalQuestAnswerList
						.addAll(positionDetailsService.getRequisitinQADetailsByPositionId(candidate.getPositionId()));

				if (candidate.getDocuments().getDocument().size() > 0) {
					finalQuestAnswerList.addAll(candidateService.getContractQADetailsByApplicationId(
							candidate.getDocuments().getDocument().get(0).getApplicationId(),
							candidate.getCandidateId()));
				}

				finalQuestAnswerList.forEach(questAnswer -> {
					LOGGER.info("Source: " + questAnswer.getSource());
					LOGGER.info("Q: " + questAnswer.getQuestion());
					LOGGER.info("A: " + questAnswer.getAnswer());
				});
			} else {

				if (!CommonConstants.REJECTED_STATUS.equalsIgnoreCase(candidate.getStatus())) {
					String errorMsg = "NA" + " -> " + candidate.getStatus() + " -> Pre-Hire Form Not Completed";
					errorMap.put(candidateProfile.getFirstname() + "(" + candidate.getCandidateId() + ")", errorMsg);
				} else if (isAlreadyProcessedRecord(candidate.getCandidateId() + "")) {
					String errorMsg = "NA" + " -> " + candidate.getStatus() + " -> Pre-Hire Form Not Completed";
					errorMap.put(candidateProfile.getFirstname() + "(" + candidate.getCandidateId() + ")", errorMsg);

				}
			}

			LOGGER.info("documentService.getJobLocationCountry() " + documentService.getJobLocationCountry());

			if (!StringUtils.isEmpty(documentService.getJobLocationCountry())) {

				boolean preCheckFlag;
				boolean beanCheckFlag;
				String gid = "";
				switch (documentService.getJobLocationCountry()) {

				case CommonConstants.COUNTRY_AUSTRALIA:
					preCheckFlag = true;
					beanCheckFlag = true;

					AustraliaExportData australiaData = (AustraliaExportData) exportUtilsFactory
							.getUtilInstance(CommonConstants.COUNTRY_AUSTRALIA)
							.generateExportData(finalQuestAnswerList);

					if (!StringUtils.isEmpty(candidateGID)) {
						gid = candidateGID;
					} else {
						gid = getGidFromSDHData(australiaData.getPerson_id());
					}

					if (!StringUtils.isEmpty(gid))
						australiaData.setGid(gid);
					// else
					// australiaData.setGid(australiaData.getTalentlink_record_id());

					australiaData.setApplication_status(candidate.getStatus());

					if (candidate.getStatus().equals(CommonConstants.WITHDRAWN_STATUS))
						australiaData.setOfferWithdrawn(CommonConstants.YES_TEXT);

					if (!StringUtils.isEmpty(employeeID)) {
						australiaData.setMyHr_Person_Number(employeeID);
					}

					if (isSecondaryStatus(candidate.getStatus())) {

						if (CommonConstants.REJECTED_STATUS.equalsIgnoreCase(australiaData.getApplication_status())
								|| CommonConstants.WITHDRAWN_STATUS
										.equalsIgnoreCase(australiaData.getApplication_status())) {
							if (!isAlreadyProcessedRecordForWithdrawn(australiaData.getPerson_id(),
									australiaData.getTalentlink_record_id()))
								preCheckFlag = false;
							else
								preCheckFlag = addResendRejectedWithdrawnDetails(australiaData.getGid(),
										candidate.getStatus());

						} else
							preCheckFlag = addResendRejectedWithdrawnDetails(australiaData.getGid(),
									candidate.getStatus());
						LOGGER.info(
								"Add Candidate with status '" + candidate.getStatus() + "', response: " + preCheckFlag);
					}
					// australiaData.setStatus(candidate.getStatus());
					LOGGER.info("Status " + candidate.getStatus());

					if (candidate.getDocuments().getDocument().size() > 0)
						applicationIdMap.put(australiaData.getPerson_id(),
								candidate.getDocuments().getDocument().get(0).getApplicationId() + "");

					if (preCheckFlag) {

						beanCheckFlag = addBeanValidationErrors(australiaData, documentService.getJobLocationCountry(),
								candidate.getCandidateId());

						if (beanCheckFlag) {

							if (!StringUtils.isEmpty(australiaData.getLine_manager())) {
								if (isSecondaryStatus(candidate.getStatus())
										|| isDateCheckPassed(australiaData.getContract_start_date_from_offer_form(),
												daysBeforeMap.getOrDefault(CommonConstants.COUNTRY_AUSTRALIA, 10))) {

									if (!StringUtils.isEmpty(australiaData.getGid())) {
										LOGGER.info("Adding data to Australia file");
										australiaExportList.add(australiaData);
									} else {
										if (australiaData.getFirst_name() != null) {
											String errorMsg = documentService.getJobLocationCountry() + " -> "
													+ australiaData.getApplication_status()
													+ " -> No GID mapped for Candidate";
											errorMap.put(australiaData.getFirst_name() + "("
													+ candidate.getCandidateId() + ")", errorMsg);
										}
										LOGGER.info("No GID mapped for Candidate, Candidate name: "
												+ australiaData.getFirst_name());

									}
								} else {
									if (australiaData.getFirst_name() != null) {
										String errorMsg = documentService.getJobLocationCountry() + " -> "
												+ australiaData.getApplication_status()
												+ " -> Date Check Not Passed, start date: "
												+ australiaData.getContract_start_date_from_offer_form();
										errorMap.put(
												australiaData.getFirst_name() + "(" + candidate.getCandidateId() + ")",
												errorMsg);
									}
									LOGGER.info(
											"Date Check Not Passed, Candidate name: " + australiaData.getFirst_name());

								}

							} else {
								if (australiaData.getFirst_name() != null) {
									String errorMsg = documentService.getJobLocationCountry() + " -> "
											+ australiaData.getApplication_status()
											+ " -> No Gid Found For Line Manager";
									errorMap.put(australiaData.getFirst_name() + "(" + candidate.getCandidateId() + ")",
											errorMsg);
								}
								LOGGER.info("No Gid Found For Line Manager, candidate name: "
										+ australiaData.getFirst_name());
							}
						}
					}
					break;

				case CommonConstants.COUNTRY_INDIA:
					preCheckFlag = true;
					beanCheckFlag = true;

					IndiaExportData indiaData = (IndiaExportData) exportUtilsFactory
							.getUtilInstance(CommonConstants.COUNTRY_INDIA).generateExportData(finalQuestAnswerList);

					if (!StringUtils.isEmpty(candidateGID)) {
						gid = candidateGID;
					} else {
						gid = getGidFromSDHData(indiaData.getPerson_id());
					}

					if (!StringUtils.isEmpty(gid))
						indiaData.setGid(gid);
					// else
					// indiaData.setGid(indiaData.getTalentlink_record_id());

					indiaData.setApplication_status(candidate.getStatus());
					if (candidate.getStatus().equals(CommonConstants.WITHDRAWN_STATUS))
						indiaData.setOfferWithdrawn(CommonConstants.YES_TEXT);

					if (!StringUtils.isEmpty(employeeID)) {
						indiaData.setMyHr_Person_Number(employeeID);
					}

					if (isSecondaryStatus(candidate.getStatus())) {
						if (CommonConstants.REJECTED_STATUS.equalsIgnoreCase(indiaData.getApplication_status())
								|| CommonConstants.WITHDRAWN_STATUS
										.equalsIgnoreCase(indiaData.getApplication_status())) {
							if (!isAlreadyProcessedRecordForWithdrawn(indiaData.getPerson_id(),
									indiaData.getTalentlink_record_id()))
								preCheckFlag = false;
							else
								preCheckFlag = addResendRejectedWithdrawnDetails(indiaData.getGid(),
										candidate.getStatus());

						} else
							preCheckFlag = addResendRejectedWithdrawnDetails(indiaData.getGid(), candidate.getStatus());
						LOGGER.info(
								"Add Candidate with status '" + candidate.getStatus() + "', response: " + preCheckFlag);
					}

					if (candidate.getDocuments().getDocument().size() > 0)
						applicationIdMap.put(indiaData.getPerson_id(),
								candidate.getDocuments().getDocument().get(0).getApplicationId() + "");

					if (preCheckFlag) {

						beanCheckFlag = addBeanValidationErrors(indiaData, documentService.getJobLocationCountry(),
								candidate.getCandidateId());

						if (beanCheckFlag) {

							if (!StringUtils.isEmpty(indiaData.getLine_manager())) {
								if (isSecondaryStatus(candidate.getStatus())
										|| isDateCheckPassed(indiaData.getContract_start_date_from_offer_form(),
												daysBeforeMap.getOrDefault(CommonConstants.COUNTRY_INDIA, 10))) {

									if (!StringUtils.isEmpty(indiaData.getGid())) {
										LOGGER.info("Adding data to India file");
										indiaExportList.add(indiaData);
									} else {
										if (indiaData.getFirst_name() != null) {
											String errorMsg = documentService.getJobLocationCountry() + " -> "
													+ indiaData.getApplication_status()
													+ " -> No GID mapped for Candidate";
											errorMap.put(
													indiaData.getFirst_name() + "(" + candidate.getCandidateId() + ")",
													errorMsg);
										}
										LOGGER.info("No GID mapped for Candidate, Candidate name: "
												+ indiaData.getFirst_name());

									}
								} else {
									if (indiaData.getFirst_name() != null) {
										String errorMsg = documentService.getJobLocationCountry() + " -> "
												+ indiaData.getApplication_status()
												+ " -> Date Check Not Passed, start date: "
												+ indiaData.getContract_start_date_from_offer_form();
										errorMap.put(indiaData.getFirst_name() + "(" + candidate.getCandidateId() + ")",
												errorMsg);
									}
									LOGGER.info("Date Check Not Passed, Candidate name: " + indiaData.getFirst_name());

								}

							} else {
								if (indiaData.getFirst_name() != null) {
									String errorMsg = documentService.getJobLocationCountry() + " -> "
											+ indiaData.getApplication_status() + " -> No Gid Found For Line Manager";
									errorMap.put(indiaData.getFirst_name() + "(" + candidate.getCandidateId() + ")",
											errorMsg);
								}
								LOGGER.info(
										"No Gid Found For Line Manager, candidate name: " + indiaData.getFirst_name());
							}
						}
					}
					break;


				case CommonConstants.COUNTRY_SINGAPORE:
					preCheckFlag = true;
					beanCheckFlag = true;

					SingaporeExportData singaporeData = (SingaporeExportData) exportUtilsFactory
							.getUtilInstance(CommonConstants.COUNTRY_SINGAPORE)
							.generateExportData(finalQuestAnswerList);

					if (!StringUtils.isEmpty(candidateGID)) {
						gid = candidateGID;
					} else {
						gid = getGidFromSDHData(singaporeData.getPerson_id());
					}

					if (!StringUtils.isEmpty(gid))
						singaporeData.setGid(gid);
					// else
					// singaporeData.setGid(singaporeData.getTalentlink_record_id());

					singaporeData.setApplication_status(candidate.getStatus());

					if (candidate.getStatus().equals(CommonConstants.WITHDRAWN_STATUS))
						singaporeData.setOfferWithdrawn(CommonConstants.YES_TEXT);

					if (!StringUtils.isEmpty(employeeID)) {
						singaporeData.setMyHr_Person_Number(employeeID);
					}

					if (isSecondaryStatus(candidate.getStatus())) {
						if (CommonConstants.REJECTED_STATUS.equalsIgnoreCase(singaporeData.getApplication_status())
								|| CommonConstants.WITHDRAWN_STATUS
										.equalsIgnoreCase(singaporeData.getApplication_status())) {
							if (!isAlreadyProcessedRecordForWithdrawn(singaporeData.getPerson_id(),
									singaporeData.getTalentlink_record_id()))
								preCheckFlag = false;
							else
								preCheckFlag = addResendRejectedWithdrawnDetails(singaporeData.getGid(),
										candidate.getStatus());

						} else
							preCheckFlag = addResendRejectedWithdrawnDetails(singaporeData.getGid(),
									candidate.getStatus());
						LOGGER.info(
								"Add Candidate with status '" + candidate.getStatus() + "', response: " + preCheckFlag);
					}

					if (candidate.getDocuments().getDocument().size() > 0)
						applicationIdMap.put(singaporeData.getPerson_id(),
								candidate.getDocuments().getDocument().get(0).getApplicationId() + "");

					if (preCheckFlag) {

						beanCheckFlag = addBeanValidationErrors(singaporeData, documentService.getJobLocationCountry(),
								candidate.getCandidateId());

						if (beanCheckFlag) {
							if (!StringUtils.isEmpty(singaporeData.getLine_manager())) {

								if (isSecondaryStatus(candidate.getStatus())
										|| isDateCheckPassed(singaporeData.getContract_start_date_from_offer_form(),
												daysBeforeMap.getOrDefault(CommonConstants.COUNTRY_SINGAPORE, 10))) {

									if (!StringUtils.isEmpty(singaporeData.getGid())) {
										LOGGER.info("Adding data to SINGAPORE file");
										singaporeExportList.add(singaporeData);
									} else {
										if (singaporeData.getFirst_name() != null) {
											String errorMsg = documentService.getJobLocationCountry() + " -> "
													+ singaporeData.getApplication_status()
													+ " -> No GID mapped for Candidate";
											errorMap.put(singaporeData.getFirst_name() + "("
													+ candidate.getCandidateId() + ")", errorMsg);
										}
										LOGGER.info("No GID mapped for Candidate, Candidate name: "
												+ singaporeData.getFirst_name());

									}
								} else {
									if (singaporeData.getFirst_name() != null) {
										String errorMsg = documentService.getJobLocationCountry() + " -> "
												+ singaporeData.getApplication_status()
												+ " -> Date Check Not Passed, start date: "
												+ singaporeData.getContract_start_date_from_offer_form();
										errorMap.put(
												singaporeData.getFirst_name() + "(" + candidate.getCandidateId() + ")",
												errorMsg);
									}
									LOGGER.info(
											"Date Check Not Passed, Candidate name: " + singaporeData.getFirst_name());

								}

							} else {
								if (singaporeData.getFirst_name() != null) {
									String errorMsg = documentService.getJobLocationCountry() + " -> "
											+ singaporeData.getApplication_status()
											+ " -> No Gid Found For Line Manager";
									errorMap.put(singaporeData.getFirst_name() + "(" + candidate.getCandidateId() + ")",
											errorMsg);
								}
								LOGGER.info("No Gid Found For Line Manager, candidate name: "
										+ singaporeData.getFirst_name());
							}
						}
					}
				break;

				}
			}
			// }
			} catch (Exception e) {
				LOGGER.info("Exception occured: " + e.getMessage());
				e.printStackTrace();
			}
		});

		LOGGER.info("australiaExportList: " + australiaExportList.size());
		LOGGER.info("indiaExportList: " + indiaExportList.size());
		

		LOGGER.info("singaporeExportList: " + singaporeExportList.size());
		

		String fileName = "";
		String encryptedFileName = "";

		removedAlreadySentRecords(australiaExportList);
		removedAlreadySentRecords(indiaExportList);		
		removedAlreadySentRecords(singaporeExportList);


		LOGGER.info("Final australiaExportList: " + australiaExportList.size());
		LOGGER.info("Final indiaExportList: " + indiaExportList.size());
		LOGGER.info("Final singaporeExportList: " + singaporeExportList.size());


		if (australiaExportList.size() > 0) {
			updateCitizenShipValue(australiaExportList);

			for (ExportData exportData : australiaExportList) {
				if (applicationIdMap.containsKey(exportData.getPerson_id())) {
					if (exportData.getApplication_status().equals(CommonConstants.PRE_HIRE_COMPLETED_STATUS)) {
						userService.updateApplicationStatus(applicationIdMap.get(exportData.getPerson_id()),
								CommonConstants.OFFER_ACCEPTED_STATUS);
					}
				}
			}

			fileName = csvWriterUtil.writeExportData("Talentlink_MyHR_AU_Details_" + sdf.format(new Date()) + ".csv",
					australiaExportList, CommonConstants.COUNTRY_AUSTRALIA);

			insertExportDatainDB(australiaExportList, CommonConstants.COUNTRY_AUSTRALIA);

			encryptedFileName = encryptCountryFile(fileName);

			encryptedFileList.add(encryptedFileName);
			LOGGER.info("Australia File Created");
		}

		if (indiaExportList.size() > 0) {
			updateCitizenShipValue(indiaExportList);

			for (ExportData exportData : indiaExportList) {
				if (applicationIdMap.containsKey(exportData.getPerson_id())) {
					if (exportData.getApplication_status().equals(CommonConstants.PRE_HIRE_COMPLETED_STATUS)) {
						userService.updateApplicationStatus(applicationIdMap.get(exportData.getPerson_id()),
								CommonConstants.OFFER_ACCEPTED_STATUS);
					}
				}
			}

			fileName = csvWriterUtil.writeExportData("Talentlink_MyHR_IN_Details_" + sdf.format(new Date()) + ".csv",
					indiaExportList, CommonConstants.COUNTRY_INDIA);

			insertExportDatainDB(indiaExportList, CommonConstants.COUNTRY_INDIA);

			encryptedFileName = encryptCountryFile(fileName);

			encryptedFileList.add(encryptedFileName);
			LOGGER.info("India File Created");
		}

		

		if (singaporeExportList.size() > 0) {
			updateCitizenShipValue(singaporeExportList);

			for (ExportData exportData : singaporeExportList) {
				if (applicationIdMap.containsKey(exportData.getPerson_id())) {
					if (exportData.getApplication_status().equals(CommonConstants.PRE_HIRE_COMPLETED_STATUS)) {
						userService.updateApplicationStatus(applicationIdMap.get(exportData.getPerson_id()),
								CommonConstants.OFFER_ACCEPTED_STATUS);
					}
				}
			}

			fileName = csvWriterUtil.writeExportData("Talentlink_MyHR_SG_Details_" + sdf.format(new Date()) + ".csv",
					singaporeExportList, CommonConstants.COUNTRY_SINGAPORE);

			insertExportDatainDB(singaporeExportList, CommonConstants.COUNTRY_SINGAPORE);

			encryptedFileName = encryptCountryFile(fileName);

			encryptedFileList.add(encryptedFileName);
			LOGGER.info("singapore File Created");
		}
		

		LOGGER.info("Exiting fetchCandidateDetails");
	}

	public void updateCitizenShipValue(List<ExportData> exportList) {
		Map<String, String> replacementMap = createReplacementMap();

		for (ExportData exportData : exportList) {
			String citizenship = exportData.getCitizenship();
			String replacement = replacementMap.getOrDefault(citizenship, citizenship);
			exportData.setCitizenship(replacement);
		}
	}

	private Map<String, String> createReplacementMap() {
		Map<String, String> replacementMap = new HashMap<>();
		replacementMap.put("china", "China Mainland");
		replacementMap.put("Comoros", "Comores");
		replacementMap.put("Dem Rep Congo", "Democratic Republic of the Congo");
		replacementMap.put("FrenchGuiana", "French Guiana");
		replacementMap.put("FrenchPolynesia", "French Polynesia");
		replacementMap.put("Luxemburg", "Luxembourg");
		replacementMap.put("AN", "Netherlands Antilles");
		replacementMap.put("PuertoRico", "Puerto Rico");
		replacementMap.put("Moldavia", "Republic of Moldova");
		replacementMap.put("SaintHelena", "Saint Helena");
		replacementMap.put("Serbian", "Serbia");
		replacementMap.put("SouthSudan", "South Sudan");
		replacementMap.put("IM", "Isle of Man");
		replacementMap.put("Isle_of_Man", "Isle of Man");
		replacementMap.put("Macedonia", "Macedonia");
		replacementMap.put("GG", "Guernsey");

		return replacementMap;
	}

	private String getGidFromSDHData(String person_id) {
		try {
			Optional<Sdhexportdatadtls> sdhExportData = sdhExportDataManager.stream().filter(
					Sdhexportdatadtls.PERSON_NUMBER.isNotNull().and(Sdhexportdatadtls.PERSON_NUMBER.equal(person_id)))
					.findAny();
			if (sdhExportData.isPresent()) {
				if (sdhExportData.get().getGid().isPresent()) {
					LOGGER.info("Gid for Person_ID: " + sdhExportData.get().getGid().get());
					return sdhExportData.get().getGid().get();
				}
			}
			LOGGER.info("Gid for Person_ID not found..");
		} catch (Exception e) {
			LOGGER.error(
					"Exception occured in getGidFromSDHData for person_id " + person_id + ", error: " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	private boolean addBeanValidationErrors(ExportData exportData, String countryName, Long candidateId) {

		Set<ConstraintViolation<ExportData>> violations = validator.validate(exportData);

		if (violations.size() > 0) {
			String errorMsg = countryName + " -> " + exportData.getApplication_status() + " -> <br/>";
			for (ConstraintViolation<ExportData> violation : violations) {
				System.out.println(violation.getMessage());
				errorMsg = errorMsg + violation.getMessage() + "<br/><br/>";
			}

			if (!StringUtils.isEmpty(exportData.getWorking_hours())
					&& !StringUtils.isEmpty(exportData.getWorking_hours_frequency())) {
				boolean isValidWorkHours = validateWorkHours(Double.parseDouble(exportData.getWorking_hours()),
						exportData.getWorking_hours_frequency());
				if (!isValidWorkHours) {
					errorMsg = errorMsg + "Invalid Work_Hours value (" + exportData.getWorking_hours()
							+ ") for Work_Hour_Frequency (" + exportData.getWorking_hours_frequency() + ") "
							+ "<br/><br/>";
				}
			}

			if (!StringUtils.isEmpty(exportData.getPost_code())) {
				boolean isValidPostCode = validatePostCode(exportData.getPost_code(), exportData.getCountry());
				if (!isValidPostCode) {
					errorMsg = errorMsg + "Invalid Post Code value (" + exportData.getPost_code() + ") for "
							+ exportData.getCountry() + "<br/><br/>";
				}
			}

			if (exportData.getFirst_name() != null)
				errorMap.put(exportData.getFirst_name() + "(" + candidateId + ")", errorMsg);
			else
				LOGGER.info("ErrorMsg: " + errorMsg);

			return false;
		} else {
			boolean isErrorExist = false;
			String errorMsg = countryName + " -> " + exportData.getApplication_status() + " -> <br/>";
			if (!StringUtils.isEmpty(exportData.getWorking_hours())
					&& !StringUtils.isEmpty(exportData.getWorking_hours_frequency())) {

				boolean isValidWorkHours = validateWorkHours(Double.parseDouble(exportData.getWorking_hours()),
						exportData.getWorking_hours_frequency());

				if (!isValidWorkHours) {
					isErrorExist = true;
					errorMsg = errorMsg + "Invalid Work_Hours value (" + exportData.getWorking_hours()
							+ ") for Work_Hour_Frequency (" + exportData.getWorking_hours_frequency() + ") "
							+ "<br/><br/>";
				}
			}

			if (!StringUtils.isEmpty(exportData.getPost_code())) {

				boolean isValidPostCode = validatePostCode(exportData.getPost_code(), exportData.getCountry());
				if (!isValidPostCode) {
					isErrorExist = true;
					errorMsg = errorMsg + "Invalid Post Code value (" + exportData.getPost_code() + ")  for "
							+ exportData.getCountry() + "<br/><br/>";
				}
			}

			if (isErrorExist) {
				if (exportData.getFirst_name() != null)
					errorMap.put(exportData.getFirst_name() + "(" + candidateId + ")", errorMsg);
				else
					LOGGER.info("ErrorMsg: " + errorMsg);
				return false;
			}
		}

		return true;

	}

	private boolean validatePostCode(String pincode, String country) {
		try {
			switch (country) {

			case CommonConstants.COUNTRY_VIETNAM:
				if (pincode.length() != 6) {
					return false;
				}
				break;

			case CommonConstants.COUNTRY_VIETNAM_OLD:
				if (pincode.length() != 6) {
					return false;
				}
				break;

			case CommonConstants.COUNTRY_INDIA:
				if (pincode.length() != 6) {
					return false;
				}
				break;

			case CommonConstants.COUNTRY_INDONESIA:
				if (pincode.length() != 5) {
					return false;
				}
				break;

			case CommonConstants.COUNTRY_SINGAPORE:
				if (pincode.length() != 6) {
					return false;
				}
				break;

			case CommonConstants.COUNTRY_MALAYSIA:
				if (pincode.length() != 5) {
					return false;
				}
				break;

			default:
				return true;

			}

			return true;
		} catch (Exception e) {
			LOGGER.error("Exception occured in validatePostCode" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	private boolean validateWorkHours(double hours, String period) {

		boolean isValid = true;
		try {
			switch (period) {
			case "Day":
				isValid = hours >= 0 && hours < 24;
				break;
			case "Month":
				isValid = hours >= 0 && hours < 744; // assuming 31 days in a month
				break;
			case "Monthly":
				isValid = hours >= 0 && hours < 744; // assuming 31 days in a month
				break;
			case "Quarter":
				isValid = hours >= 0 && hours < 2232; // assuming 3 months in a quarter
				break;
			case "Week":
				isValid = hours >= 0 && hours < 168;
				break;
			case "Weekly":
				isValid = hours >= 0 && hours < 168;
				break;
			case "Year":
				isValid = hours >= 0 && hours < 8760; // assuming 365 days in a year
				break;
			case "Yearly":
				isValid = hours >= 0 && hours < 8760; // assuming 365 days in a year
				break;
			default:
				isValid = false;
				break;
			}
		} catch (Exception e) {
			LOGGER.error("Exception occured in validateWorkHours method " + e.getMessage());
			e.getMessage();
			isValid = false;
		}
		return isValid;
	}

	private boolean addBeanValidationErrorsForSDH(SDHExportData exportData, String countryName, Long candidateId) {

		Set<ConstraintViolation<SDHExportData>> violations = validator.validate(exportData);

		if (violations.size() > 0) {
			String errorMsg = countryName + " -> " + exportData.getAssignmentStatusTypeCode() + " -> <br/>";
			for (ConstraintViolation<SDHExportData> violation : violations) {
				System.out.println(violation.getMessage());
				errorMsg = errorMsg + violation.getMessage() + "<br/><br/>";
			}
			if (exportData.getFirstName() != null)
				errorMap.put(exportData.getFirstName() + "(" + candidateId + ")", errorMsg);
			else
				LOGGER.info("ErrorMsg: " + errorMsg);
			return false;
		}

		return true;

	}

	private boolean isSecondaryStatus(String status) {

		if (status.equalsIgnoreCase(CommonConstants.RESEND_STATUS)
				|| status.equalsIgnoreCase(CommonConstants.REJECTED_STATUS)
				|| status.equalsIgnoreCase(CommonConstants.WITHDRAWN_STATUS))
			return true;
		else
			return false;
	}

	public boolean isAlreadyProcessedRecord(String candidateId) {
		try {
			Optional<Basicexportdata> basicExportData = basicExportDataManager.stream()
					.filter(Basicexportdata.PERSON_ID.equal("TalentLink_" + candidateId)).findFirst();

			if (basicExportData.isPresent()) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			System.out.println("Exception occured in isAlreadyProcessedRecord method " + e.getMessage());
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean isAlreadyProcessedRecordForSDHWithdrawn(String candidateId) {
		try {
			Optional<Basicexportdata> basicExportData = basicExportDataManager.stream()
					.filter(Basicexportdata.PERSON_ID.equal("TalentLink_" + candidateId)).findFirst();

			if (basicExportData.isPresent()) {
				return true;
			} else if (isAlreadyProcessedRecordBySDH(candidateId)) {
				return true;
			} else 
				return false;
		} catch (Exception e) {
			System.out.println("Exception occured in isAlreadyProcessedRecordForSDHWithdrawn method " + e.getMessage());
			e.printStackTrace();
			return false;
		}

	}
	

	public boolean isAlreadyProcessedRecordForWithdrawn(String personId, String recordId) {
		try {
			Optional<Basicexportdata> basicExportData = basicExportDataManager.stream().filter(
					Basicexportdata.PERSON_ID.equal(personId).and(Basicexportdata.TALENTLINK_RECORD_ID.equal(recordId)))
					.findFirst();

			if (basicExportData.isPresent()) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			System.out.println("Exception occured in isAlreadyProcessedRecordForWithdrawn method " + e.getMessage());
			e.printStackTrace();
			return false;
		}

	}

	public boolean isAlreadyProcessedRecordBySDH(String candidateId) {
		try {

			Optional<Sdhexportdatadtls> sdhExportData = sdhExportDataManager.stream()
					.filter(Sdhexportdatadtls.PERSON_NUMBER.equal("TalentLink_" + candidateId)).findFirst();

			if (sdhExportData.isPresent()) {
				return true;
			} else
				return false;
		} catch (Exception e) {
			System.out.println("Exception occured in isAlreadyProcessedRecordBySDH method " + e.getMessage());
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean isAlreadyProcessedResendRecordBySDH(String candidateId) {
		try {

			long count = sdhExportDataManager.stream()
					.filter(Sdhexportdatadtls.PERSON_NUMBER.equal("TalentLink_" + candidateId)).count();
			
			LOGGER.info(candidateId+" - Count: "+count);
			
			return count == 1;
			
		} catch (Exception e) {
			System.out.println("Exception occured in isAlreadyProcessedResendRecordBySDH method " + e.getMessage());
			e.printStackTrace();
			return false;
		}

	}

	private void removedAlreadySentRecords(List<ExportData> exportList) {

		List<ExportData> finalExportList = new ArrayList<ExportData>(exportList);

		finalExportList.forEach(exportData -> {

			Optional<Basicexportdata> basicExportData = basicExportDataManager.stream()
					.filter(Basicexportdata.GID.equal(exportData.getGid())).findFirst();

			if (basicExportData.isPresent()) {
				Optional<Resenddetails> resendDetails = resendDetailsManager.stream().filter(Resenddetails.CANDIDATE_ID
						.equal(exportData.getGid()).and(Resenddetails.STATUS.equal(CommonConstants.ACTIVE)
				// .and(Resenddetails.CREATED_DATE.lessThan(Timestamp.valueOf(
				// new Timestamp(System.currentTimeMillis()).toLocalDateTime().minusDays(2))))
				)).findFirst();

				if (resendDetails.isPresent()) {
					resendDetails.get().setStatus(CommonConstants.IN_ACTIVE);
					resendDetailsManager.update(resendDetails.get());
					LOGGER.info("Added candidate id: " + exportData.getGid() + " to resend");

				} else {
					try {
						if (basicExportData.get().getFirstName().isPresent()
								&& basicExportData.get().getLastName().isPresent()
								&& basicExportData.get().getEmailAddress().isPresent()) {

							if (!(exportData.getFirst_name()
									.equalsIgnoreCase(basicExportData.get().getFirstName().get()))
									&& !(exportData.getLast_name()
											.equalsIgnoreCase(basicExportData.get().getLastName().get()))
									&& !(exportData.getEmail_address()
											.equalsIgnoreCase(basicExportData.get().getEmailAddress().get()))) {

								String errorMsg = exportData.getCountry() + " -> " + exportData.getApplication_status()
										+ " -> Duplicate GID, GID already assigned to candidate ("
										+ basicExportData.get().getPersonId().orElse("").replace("TalentLink_", "")
										+ ")";

								errorMap.put(exportData.getFirst_name() + "("
										+ exportData.getPerson_id().replace("TalentLink_", "") + ")", errorMsg);
							}

						}

					} catch (Exception e) {
						LOGGER.error("Exception occured in duplicate GID error Notification " + e.getMessage());
						e.printStackTrace();
					}

					exportList.remove(exportData);
				}
			}

		});
	}

	private void removedAlreadySentRecordsForSDH(List<SDHExportData> exportList) {

		List<SDHExportData> finalExportList = new ArrayList<SDHExportData>(exportList);

		finalExportList.forEach(exportData -> {
			
			Optional<Resenddetails> resendDetails = resendDetailsManager.stream().filter(Resenddetails.CANDIDATE_ID
					.equal(exportData.getPersonNumber().replace("TalentLink_","")+CommonConstants.SDH_SUFFIX).and(Resenddetails.STATUS.equal(CommonConstants.ACTIVE)		
			)).findFirst();

			if (resendDetails.isPresent()) {
				resendDetails.get().setStatus(CommonConstants.IN_ACTIVE);
				resendDetailsManager.update(resendDetails.get());
				LOGGER.info("Added candidate id: " + exportData.getPersonNumber() + " to resend");

			} else {
			
			Optional<Sdhexportdatadtls> sdhExportData = sdhExportDataManager
					.stream().filter(
							Sdhexportdatadtls.PERSON_NUMBER
									.equal(exportData.getPersonNumber()).and(
											Sdhexportdatadtls.ASSIGNMENT_STATUS_TYPE_CODE
													.equalIgnoreCase(CommonConstants.WITHDRAWN_STATUS)
													.or(Sdhexportdatadtls.ASSIGNMENT_STATUS_TYPE_CODE
															.equalIgnoreCase(CommonConstants.REJECTED_STATUS))))
					.findFirst();

			if (sdhExportData.isPresent()) {
				exportList.remove(exportData);
			}
			}
		});
	}

	private void insertExportDatainDB(List<ExportData> exportList, String countryName) {

		LOGGER.info("Entering insertExportDatainDB");

		exportList.forEach(exportDat -> {
			try {
				long basicDataId = addBasicExportData(exportDat, countryName);

				switch (countryName) {

				case CommonConstants.COUNTRY_AUSTRALIA:
					AustraliaExportData australiaExportData = (AustraliaExportData) exportDat;
					AustraliaexportdataImpl australiaDataImpl = new AustraliaexportdataImpl();
					australiaDataImpl.setBasicDataId(basicDataId);
					australiaDataImpl.setAddress1(australiaExportData.getAddress_1());
					australiaDataImpl.setAddress2(australiaExportData.getAddress_2());
					australiaDataImpl.setAddress3(australiaExportData.getAddress_3());
					australiaDataImpl
							.setApplicableEnterpriseAgreement(australiaExportData.getApplicable_enterprise_agreement());
					australiaDataImpl.setNationalIdentifier(australiaExportData.getNational_identifier());
					australiaDataImpl.setState(australiaExportData.getState());
					australiaDataImpl.setSuburb(australiaExportData.getSuburb());
					australiaDataImpl.setCreatedDate(new Timestamp(System.currentTimeMillis()));
					australiaDataManager.persist(australiaDataImpl);

					break;

				case CommonConstants.COUNTRY_INDIA:
					IndiaExportData indiaExportData = (IndiaExportData) exportDat;
					IndiaexportdataImpl indiaDataImpl = new IndiaexportdataImpl();
					indiaDataImpl.setBasicDataId(basicDataId);
					indiaDataImpl.setAddress1(indiaExportData.getAddress_1());
					indiaDataImpl.setAddress2(indiaExportData.getAddress_2());
					indiaDataImpl.setAddress3(indiaExportData.getAddress_3());
					indiaDataImpl.setCityOrTown(indiaExportData.getCity_or_town());
					indiaDataImpl.setCreatedDate(new Timestamp(System.currentTimeMillis()));
					indiaDataImpl.setNationalIdentifier(indiaExportData.getNational_identifier());
					indiaDataImpl.setState(indiaExportData.getState());
					indiaDataImpl.setPanCardNumber(indiaExportData.getState());
					indiaDataManager.persist(indiaDataImpl);
					break;

				

				case CommonConstants.COUNTRY_SINGAPORE:
					SingaporeExportData singaporeExportData = (SingaporeExportData) exportDat;
					SingaporeexportdataImpl singaporeDataImpl = new SingaporeexportdataImpl();
					singaporeDataImpl.setBasicDataId(basicDataId);
					singaporeDataImpl.setCreatedDate(new Timestamp(System.currentTimeMillis()));
					singaporeDataImpl.setBlockOrHouseNumber(singaporeExportData.getBlock_or_house_number());
					singaporeDataImpl.setBuildingName(singaporeExportData.getBuilding_name());
					singaporeDataImpl.setEthnicOrigin(singaporeExportData.getEthnic_origin());
					singaporeDataImpl.setLegalName(singaporeExportData.getLegal_name());
					singaporeDataImpl.setLevelUnitNumber(singaporeExportData.getLevel_unit_number());
					singaporeDataImpl.setLocalGrade(singaporeExportData.getLocal_grade());
					singaporeDataImpl.setNationalIdentifier(singaporeExportData.getNational_identifier());
					singaporeDataImpl.setReligion(singaporeExportData.getReligion());
					singaporeDataImpl.setStreetName(singaporeExportData.getStreet_name());
					singaporeDataImpl.setPermanentResident(singaporeExportData.getSingaporePermanentResident());
					singaporeDataImpl.setFin(singaporeExportData.getFin());
					singaporeDataManager.persist(singaporeDataImpl);

					break;
				

				}

			} catch (Exception e) {
				LOGGER.error("Exception occured in insertExportDatainDB method " + e.getMessage());
				e.printStackTrace();
			}
		});

		LOGGER.info("Exiting insertExportDatainDB");

	}

	private void insertSDHExportDatainDB(List<SDHExportData> exportList) {

		LOGGER.info("Entering insertSDHExportDatainDB");

		exportList.forEach(exportDat -> {
			try {
				long sdhDataId = addSDHExportData(exportDat);

				LOGGER.info("sdhexport data created id: " + sdhDataId);

			} catch (Exception e) {
				LOGGER.error("Exception occured in insertSDHExportDatainDB method " + e.getMessage());
				e.printStackTrace();
			}
		});

		LOGGER.info("Exiting insertSDHExportDatainDB");

	}

	private long addBasicExportData(ExportData exportDat, String countryName) {

		LOGGER.info("Entering addBasicExportData");

		BasicexportdataImpl basicDataImpl = new BasicexportdataImpl();
		long basic_data_id = 0;

		try {
			basicDataImpl.setAddressType(exportDat.getAddress_type());
			basicDataImpl.setAnalysis(exportDat.getAnalysis());
			basicDataImpl.setCareerLevelForJobPosting(exportDat.getCareer_level_for_job_posting());
			basicDataImpl.setCitizenship(exportDat.getCitizenship());
			basicDataImpl.setContactPhoneNumber(exportDat.getContact_phone_number());
			basicDataImpl.setContractEndDate(exportDat.getContract_end_date());
			basicDataImpl.setContractStartDateFromOfferForm(exportDat.getContract_start_date_from_offer_form());
			basicDataImpl.setContractType(exportDat.getContract_type());
			basicDataImpl.setContractTypeInOfferForm(exportDat.getContract_type_in_offer_form());
			basicDataImpl.setCountry(exportDat.getCountry());
			basicDataImpl.setCountryOfBirth(exportDat.getCountry_of_birth());
			basicDataImpl.setCreatedDate(new Timestamp(System.currentTimeMillis()));
			basicDataImpl.setDateOfBirth(exportDat.getDate_of_birth());
			basicDataImpl.setDepartment(exportDat.getDepartment());
			basicDataImpl.setDscJobCode(exportDat.getDsc_job_code());
			basicDataImpl.setDscLocationCode(exportDat.getDsc_location_code());
			basicDataImpl.setEmailAddress(exportDat.getEmail_address());
			basicDataImpl.setEmploymentTypeInOfferForm(exportDat.getEmployment_type_in_offer_form());
			basicDataImpl.setFirstName(exportDat.getFirst_name());
			basicDataImpl.setFunctionCode(exportDat.getFunction_code());
			basicDataImpl.setGid(exportDat.getGid());
			basicDataImpl.setIntercompany(exportDat.getIntercompany());
			basicDataImpl.setIsTheEmployeeFullyCharged(exportDat.getIs_the_employee_fully_charged());
			basicDataImpl.setIsTheEmployeesCostSplit(exportDat.getIs_the_employees_cost_split());
			basicDataImpl.setJobLocationCountry(countryName);
			basicDataImpl.setJobTitle(exportDat.getJob_title());
			basicDataImpl.setLastName(exportDat.getLast_name());
			basicDataImpl.setLegalEmployer(exportDat.getLegal_employer());
			basicDataImpl.setLineManager(exportDat.getLine_manager());
			basicDataImpl.setMiddleName(exportDat.getMiddle_name());
			basicDataImpl.setMyhrPositionCode(exportDat.getMyhr_position_code());
			basicDataImpl.setNoticePeriod(exportDat.getNotice_period());
			basicDataImpl.setNoticePeriodUnit(exportDat.getNotice_period_unit());
			basicDataImpl.setPayroll(exportDat.getPayroll());
			basicDataImpl.setPersonId(exportDat.getPerson_id());
			basicDataImpl.setPersonType(exportDat.getPerson_type());
			basicDataImpl.setPostCode(exportDat.getPost_code());
			basicDataImpl.setPreferredName(exportDat.getPreferred_name());
			basicDataImpl.setTimeAttendancePayrule(exportDat.getTimeAndAttendance());
			basicDataImpl.setProbationPeriod(exportDat.getProbation_period());
			basicDataImpl.setProbationPeriodUnit(exportDat.getProbation_period_unit());
			basicDataImpl.setRcsGrade(exportDat.getRcs_grade());
			basicDataImpl.setSalaryAmount(exportDat.getSalary_amount());
			basicDataImpl.setSalaryBasisInOfferForm(exportDat.getSalary_basis_in_offer_form());
			basicDataImpl.setSalaryCurrency(exportDat.getSalary_currency());
			basicDataImpl.setSalaryPeriod(exportDat.getSalary_period());
			basicDataImpl.setSex(exportDat.getSex());
			basicDataImpl.setShiftRequirement(exportDat.getShift_requirement());
			basicDataImpl.setTalentlinkRecordId(exportDat.getTalentlink_record_id());
			basicDataImpl.setWorkingFromHome(exportDat.getWorking_from_home());
			basicDataImpl.setWorkingHours(exportDat.getWorking_hours());
			basicDataImpl.setWorkingHoursFrequency(exportDat.getWorking_hours_frequency());
			basicDataImpl.setMyhrPersonNumber(exportDat.getMyHr_Person_Number());
			basicDataImpl.setOfferWithdrawn(exportDat.getOfferWithdrawn());

			Basicexportdata basicExportData = basicExportDataManager.persist(basicDataImpl);

			basic_data_id = basicExportData.getBasicDataId();

		} catch (Exception e) {
			LOGGER.error("Exception occured in addBasicExportData method " + e.getMessage());
			e.printStackTrace();
		}
		LOGGER.info("Exiting addBasicExportData");

		return basic_data_id;
	}

	private long addSDHExportData(SDHExportData exportData) {

		LOGGER.info("Entering addSDHExportData");

		SdhexportdatadtlsImpl sdhDataImpl = new SdhexportdatadtlsImpl();
		long sdh_data_id = 0;

		try {
			sdhDataImpl.setActionCode(exportData.getActionCode());
			sdhDataImpl.setAssignmentStatusTypeCode(exportData.getAssignmentStatusTypeCode());
			sdhDataImpl.setBusinessTitle(exportData.getBusinessTitle());
			sdhDataImpl.setBusinessUnitName(exportData.getBusinessUnitName());
			sdhDataImpl.setCostCenter(exportData.getCostCenter());
			sdhDataImpl.setCrestErcode(exportData.getCrestERCode());
			sdhDataImpl.setDateofBirth(exportData.getDateofBirth());
			sdhDataImpl.setEmailAddress(exportData.getEmailAddress());
			sdhDataImpl.setEmailType(exportData.getEmailType());
			sdhDataImpl.setFirstName(exportData.getFirstName());
			sdhDataImpl.setGlobalDepartmentCode(exportData.getGlobalDepartmentCode());
			sdhDataImpl.setGradeCode(exportData.getGradeCode());
			sdhDataImpl.setLastName(exportData.getLastName());
			sdhDataImpl.setLegalEmployerCode(exportData.getLegalEmployerCode());
			sdhDataImpl.setLocalLocationCode(exportData.getLocalLocationCode());
			sdhDataImpl.setLocalSystem(exportData.getLocalSystem());
			sdhDataImpl.setPersonManagerExternalIdentifierNumber(exportData.getPersonManagerExternalIdentifierNumber());
			sdhDataImpl.setPersonManagerType(exportData.getPersonManagerType());
			sdhDataImpl.setPersonNumber(exportData.getPersonNumber());
			sdhDataImpl.setProjectedStartDate(exportData.getProjectedStartDate());
			sdhDataImpl.setProposedUserPersonType(exportData.getProposedUserPersonType());
			sdhDataImpl.setReasonCode(exportData.getReasonCode());
			sdhDataImpl.setRelationshipDateStart(exportData.getRelationshipDateStart());
			sdhDataImpl.setSystemPersonType(exportData.getSystemPersonType());
			sdhDataImpl.setCreatedTime(new Timestamp(System.currentTimeMillis()));

			Sdhexportdatadtls sdhExportData = sdhExportDataManager.persist(sdhDataImpl);

			sdh_data_id = sdhExportData.getSdhExportDataId();

		} catch (Exception e) {
			LOGGER.error("Exception occured in addSDHExportData method " + e.getMessage());
			LOGGER.error(exportData.toString());
			e.printStackTrace();
		}
		LOGGER.info("Exiting addSDHExportData");

		return sdh_data_id;
	}

	public String encryptCountryFile(String filePath) {

		LOGGER.info("Entering encryptCountryFile");

		try {
			Path orginalPath = Paths.get(filePath);
			byte[] orginalData = Files.readAllBytes(orginalPath);
			byte[] encryptedData = encryptDecryptUtil.encrypt(orginalData);

			Path encryptedPath = Paths.get(filePath.replace(".csv", "_encrypted.csv"));

			Files.write(encryptedPath, encryptedData);

			return filePath.replace(".csv", "_encrypted.csv");

		} catch (Exception e) {
			LOGGER.error("Exception occured in encryptCountryFile method " + e.getMessage());
			e.printStackTrace();
		}
		LOGGER.info("Exiting encryptCountryFile");
		return null;

	}

	public String encryptSDHFile(String filePath, String fileName) {

		LOGGER.info("Entering encryptSDHFile");

		try {
			Path orginalPath = Paths.get(filePath);
			byte[] orginalData = Files.readAllBytes(orginalPath);
			byte[] encryptedData = encryptDecryptUtil.encryptForSDH(orginalData, fileName);

//			Path encryptedPath = Paths.get(filePath.replace(".csv", "_encrypted.csv"));
			Path encryptedPath = Paths.get(filePath.replace(".xml", "_encrypted.xml"));

			Files.write(encryptedPath, encryptedData);

			return filePath.replace(".xml", "_encrypted.xml");

		} catch (Exception e) {
			LOGGER.error("Exception occured in encryptCountryFile method " + e.getMessage());
			e.printStackTrace();
		}
		LOGGER.info("Exiting encryptCountryFile");
		return null;

	}

	public synchronized void sendEncryptedFilesToFTP(boolean isSDHData) {

		LOGGER.info("Entering sendEncryptedFilesToFTP");

		LOGGER.info("encryptedFileList size: " + encryptedFileList.size());

		if (encryptedFileList.size() > 0) {

			sftpUtil.uploadFilesToServer(encryptedFileList, isSDHData);
		}

		LOGGER.info("Exiting sendEncryptedFilesToFTP");
	}

	public boolean addResendRejectedWithdrawnDetails(String candidateId, String candidateStatus) {

		boolean response = false;
		LOGGER.info("Entering addResendRejectedWithdrawnDetails ");

		LOGGER.info("CandidateID: " + candidateId);

		if (candidateId != null) {
			try {

				Optional<Basicexportdata> basicExportData = basicExportDataManager.stream()
						.filter(Basicexportdata.GID.equal(candidateId)).findFirst();

				if (basicExportData.isPresent()) { // check whether candidate data already exported
					response = true;
					Optional<Resenddetails> resendDetailsDb = resendDetailsManager.stream()
							.filter(Resenddetails.CANDIDATE_ID.equal(candidateId)
									.and(Resenddetails.CANDIDATE_STATUS.equal(candidateStatus)))
							.findAny();

					if (resendDetailsDb.isPresent()) {
						LOGGER.info("Status: " + resendDetailsDb.get().getStatus().get());
						/*
						 * if
						 * (resendDetailsDb.get().getStatus().get().equals(CommonConstants.IN_ACTIVE)) {
						 * resendDetailsDb.get().setStatus(CommonConstants.ACTIVE);
						 * resendDetailsDb.get().setCreatedDate(new
						 * Timestamp(System.currentTimeMillis()));
						 * resendDetailsManager.update(resendDetailsDb.get());
						 * LOGGER.info("Successfully updated details"); response =
						 * "{\"message\":\"Candidate details successfully added in resend list\"," +
						 * "\"expected_date\":\"" + new
						 * Timestamp(System.currentTimeMillis()).toLocalDateTime().plusDays(2) + "\"}";
						 * } else { LOGGER.info("Details already exist in Active Status "); response =
						 * "{\"message\":\"Candidate details already added in resend list\"," +
						 * "\"expected_date\":\"" +
						 * resendDetailsDb.get().getCreatedDate().get().toLocalDateTime().plusDays(2) +
						 * "\"}"; }
						 */
						LOGGER.info("Details already exist in DB ");
						// response = "{\"message\":\"Candidate details already added" + "\"}";

					} else { // If not found in resend table, add new entry

						ResenddetailsImpl resendDetails = new ResenddetailsImpl();
						resendDetails.setCandidateId(candidateId);
						resendDetails.setStatus(CommonConstants.ACTIVE);
						resendDetails.setCandidateStatus(candidateStatus);
						resendDetails.setCreatedDate(new Timestamp(System.currentTimeMillis()));
						resendDetailsManager.persist(resendDetails);
						LOGGER.info("Successfully added details ");
						// response = "{\"message\":\"Candidate details successfully added in resend
						// list" + ","
//							+ "\"expected_date\":\""
						// + new Timestamp(System.currentTimeMillis()).toLocalDateTime().plusDays(2)
						// + "\"}";
					}

				} else {
					response = false;
					LOGGER.info("Candidate details not found");
				}

			} catch (Exception e) {

				LOGGER.error(
						"Exception occured in addResendDetails for status " + candidateStatus + ", " + e.getMessage());
				e.printStackTrace();

			}
		}
		LOGGER.info("Exiting addResendRejectedWithdrawnDetails ");
		return response;

	}
	
	public boolean addResendSDHDetails(String candidateId, String candidateStatus) {

		boolean response = false;
		LOGGER.info("Entering addResendSDHDetails ");

		LOGGER.info("SDH CandidateID: " + candidateId);

		if (candidateId != null) {
			try {

				if (isAlreadyProcessedRecordBySDH(candidateId)) { // check whether candidate data already exported
					response = true;
					Optional<Resenddetails> resendDetailsDb = resendDetailsManager.stream()
							.filter(Resenddetails.CANDIDATE_ID.equal(candidateId+CommonConstants.SDH_SUFFIX)
									.and(Resenddetails.CANDIDATE_STATUS.equal(candidateStatus)))
							.findAny();

					if (resendDetailsDb.isPresent()) {
						LOGGER.info("Status: " + resendDetailsDb.get().getStatus().get());						
						LOGGER.info("sdh resend Details already exist in DB ");

					} else { // If not found in resend table, add new entry

						ResenddetailsImpl resendDetails = new ResenddetailsImpl();
						resendDetails.setCandidateId(candidateId+CommonConstants.SDH_SUFFIX);
						resendDetails.setStatus(CommonConstants.ACTIVE);
						resendDetails.setCandidateStatus(candidateStatus);
						resendDetails.setCreatedDate(new Timestamp(System.currentTimeMillis()));
						resendDetailsManager.persist(resendDetails);
						LOGGER.info("Successfully added SDH Resend details ");
					}

				} else {
					response = false;
					LOGGER.info("Candidate details not found");
				}

			} catch (Exception e) {

				LOGGER.error(
						"Exception occured in addResendDetails for status " + candidateStatus + ", " + e.getMessage());
				e.printStackTrace();

			}
		}
		LOGGER.info("Exiting addResendRejectedWithdrawnDetails ");
		return response;

	}

	public synchronized void sendErrorReportMail(boolean isForSDH) {

		LOGGER.info("### Entering sendOutboundErrorReportMail method ####");
		if (errorMap.size() > 0) {
			try {
				String sftpEmailTemplate = "<!DOCTYPE html>\n" + "<html lang=\"en\">\n" + "<head>\n"
						+ "    <meta charset=\"UTF-8\">\n"
						+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
						+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
						+ "    <title>Table Design || Future Web</title>\n" + "<style>\n" + "    * {\n"
						+ "        margin: 0;\n" + "        padding: 0;\n" + "        box-sizing: border-box;\n"
						+ "    }\n" + "    body{\n" + "        font-family: Arial, Helvetica, sans-serif;\n"
						+ "        font-style: normal;\n" + "    }\n" + "    .main-container {\n"
						+ "        width: 100%;\n" + "        max-width: 1600px;\n" + "        background-color:#FFF;\n"
						+ "        margin: 20px auto;\n" + "        padding: 10px;\n" + "    }\n" + "    table {\n"
						+ "        width: 60%;\n" + "        border-collapse: collapse;\n"
						+ "        border: 1px solid grey;\n" + "    }\n" + "    thead th {\n"
						+ "        background-color:#42a5f5;\n" + "        color: #ffffff;\n"
						+ "        font-size: 13px;\n" + "        font-weight: 400;\n" + "        text-align: center;\n"
						+ "    }\n" + "    th{\n" + "        border-right: 1px solid grey;\n"
						+ "        padding: 15px 2px;\n" + "        overflow-wrap: break-word;\n"
						+ "        word-wrap: break-word;\n" + "        hyphens: auto;\n" + "        }\n" + "    td {\n"
						+ "        padding: 8px 2px;\n" + "        font-size: 12px;\n" + "        text-align: center;\n"
						+ "        border: 1px solid grey;\n" + "        overflow-wrap: anywhere;\n"
						+ "        word-wrap: anywhere;\n" + "        hyphens: auto;\n" + "    }\n"
						+ "    tr:nth-child(even) {\n" + "        background-color: #ffffff;\n" + "    }\n"
						+ "    tr:nth-child(odd) {\n" + "        background-color: #ffffff;\n" + "    }\n"
						+ "    tr:hover td {\n" + "        color: #44b478;\n" + "        cursor: pointer;\n"
						+ "        background-color: #dddddd;\n" + "    }\n" + "    td button {\n"
						+ "        border: none;\n" + "        padding: 4px 10px;\n" + "        border-radius: 20px;\n"
						+ "        background: #cff6dd;\n" + "        color: #1fa750;\n" + "        font-size: 12px;\n"
						+ "    }\n" + "    td button.send {\n" + "        border: none;\n"
						+ "        padding: 4px 2px;\n" + "        border-radius: 20px;\n"
						+ "        background: #cff6dd;\n" + "        color: #1fa750;\n" + "        min-width: 130px;\n"
						+ "    }\n" + "    td button.send .active {\n" + "        color: #1fa750;\n" + "    }\n"
						+ "    td button.send .active:after {\n" + "        background: #1fa750;\n" + "    }\n"
						+ "    td button.send span {\n" + "        position: relative;\n"
						+ "        border-radius: 30px;\n" + "        padding: 4px 10px 4px 8px;\n" + "    }\n"
						+ "    td button.send span::after{\n" + "        position: absolute;\n" + "        top: 7px;\n"
						+ "        left: 4px;\n" + "        width: 10px;\n" + "        height: 10px;\n"
						+ "        content: '';\n" + "        border-radius: 50%;\n" + "    }\n" + "\n"
						+ "    td button.notice {\n" + "        border: none;\n" + "        padding: 4px 10px;\n"
						+ "        border-radius: 20px;\n" + "        background: #fdf5dd;\n"
						+ "        color: #ff6d00;\n" + "    }\n" + "    td button.notice .active {\n"
						+ "        color:#ff6d00;\n" + "    }\n" + "    td button.notice .active:after {\n"
						+ "        background: #ff6d00;\n" + "    }\n" + "    td button.notice span {\n"
						+ "        position: relative;\n" + "        border-radius: 30px;\n"
						+ "        padding: 4px 10px 4px 8px;\n" + "    }\n" + "    td button.notice span::after {\n"
						+ "        position: absolute;\n" + "        top: 7px;\n" + "        left: 4px;\n"
						+ "        width: 10px;\n" + "        height: 10px;\n" + "        content: '';\n"
						+ "        border-radius: 50%;\n" + "    }\n" + "    td button.process {\n"
						+ "        border: none;\n" + "        padding: 4px 10px;\n" + "        border-radius: 20px;\n"
						+ "        background: #fdf5dd;\n" + "        color: #cfa00c;\n" + "    }\n"
						+ "    td button.failure {\n" + "        border: none;\n" + "        padding: 4px 10px;\n"
						+ "        border-radius: 20px;\n" + "        background: #e8b5b5;\n"
						+ "        color: #e14949;\n" + "    }\n" + "    td button.failure .active {\n"
						+ "     color: #e14949;\n" + "    }\n" + "    td button.failure .active:after {\n"
						+ "        background: #e14949;\n" + "    }\n" + "    td button.failure span {\n"
						+ "        position: relative;\n" + "        border-radius: 30px;\n"
						+ "        padding: 4px 10px 4px 8px;\n" + "    }\n" + "    td button.failure span::after{\n"
						+ "        position: absolute;\n" + "        top: 7px;\n" + "        left: 4px;\n"
						+ "        width: 10px;\n" + "        height: 10px;\n" + "        content: '';\n"
						+ "        border-radius: 50%;\n" + "    }\n" + "    td button.process .active {\n"
						+ "        color:#cfa00c;\n" + "    }\n" + "    td button.process .active:after {\n"
						+ "        background: #cfa00c;\n" + "    }\n" + "    td button.process span {\n"
						+ "        position: relative;\n" + "        border-radius: 30px;\n"
						+ "        padding: 4px 10px 4px 8px;\n" + "    }\n" + "    td button.process span::after{\n"
						+ "        position: absolute;\n" + "        top: 7px;\n" + "        left: 4px;\n"
						+ "        width: 10px;\n" + "        height: 10px;\n" + "        content: '';\n"
						+ "        border-radius: 50%;\n" + "    }\n" + "    .buttonDownload {\n"
						+ "        display: inline-block;\n" + "        position: relative;\n"
						+ "        padding: 10px 27px;\n" + "        background-color: green;\n"
						+ "        color: white;\n" + "        text-decoration: none;\n" + "        font-size: 12px;\n"
						+ "        text-align: center;\n" + "        text-indent: 15px;\n"
						+ "        border-radius: 5px;\n" + "        margin-top: 20px;\n" + "    }\n"
						+ "    .buttonDownload:hover {\n" + "        background-color: darkgreen;\n"
						+ "        color: white;\n" + "    }\n"
						+ "    .buttonDownload:before, .buttonDownload:after {\n" + "        content: ' ';\n"
						+ "        display: block;\n" + "        position: absolute;\n" + "        left: 15px;\n"
						+ "        top: 52%;\n" + "    }\n" + "    .buttonDownload:before {\n"
						+ "        width: 10px;\n" + "        height: 2px;\n" + "        border-style: solid;\n"
						+ "        border-width: 0 2px 2px;\n" + "    }\n" + "    .buttonDownload:after {\n"
						+ "        width: 0;\n" + "        height: 0;\n" + "        margin-left: 3px;\n"
						+ "        margin-top: -7px;\n" + "        border-style: solid;\n"
						+ "        border-width: 4px 4px 0 4px;\n" + "        border-color: transparent;\n"
						+ "        border-top-color: inherit;\n"
						+ "        animation: downloadArrow 2s linear infinite;\n"
						+ "        animation-play-state: paused;\n" + "    }\n" + "    .buttonDownload:hover:before {\n"
						+ "        border-color: #fff;\n" + "    }\n" + "    .buttonDownload:hover:after {\n"
						+ "        border-top-color: #fff;\n" + "        animation-play-state: running;\n" + "    }\n"
						+ "    @keyframes downloadArrow {\n" + "        0% {\n" + "            margin-top: -7px;\n"
						+ "            opacity: 1;\n" + "        }\n" + "        0.001% {\n"
						+ "            margin-top: -15px;\n" + "            opacity: 0;\n" + "        }\n"
						+ "        50% {\n" + "            opacity: 1;\n" + "        }\n" + "        100% {\n"
						+ "            margin-top: 0;\n" + "            opacity: 0;\n" + "        }\n" + "    }\n"
						+ "</style>\n" + "</head>\n" + " <body>\n" + "<div class=\"main-container\">\n" + " <br/>\n"
						+ "Hi Team, \n" + "<br/>\n" + "<br/>\n"
						+ "Please find the candidate details not exported today. \n" + "<br/>\n" + "<br/>\n"
						+ "  <table>\n" + "             <thead>\n" + "                <tr>\n"
						+ "                    <th>Candiadte Name(ID)</th>                   \n"
						+ "                    <th>Country</th>                   \n"
						+ "                    <th>Status</th>                   \n"
						+ "                    <th>Reason</th>\n" + "                </tr>\n" + "            </thead>\n"
						+ "            <tbody>";

				String sftpTemplateRowContent = "<tr>\n" + "<td><span class=\"active\"></span>candidateName</td>\n"
						+ "                    <td><span class=\"active\"></span>countryName</td>\n"
						+ "                    <td><span class=\"active\"></span>candidateStatus</td>\n"
						+ "                    <td><span class=\"active\"></span>candidateErrorStatus</td>\n"
						+ "                </tr>";

				String sftpTemplateEndContent = " </tbody>\n" + "        </table>\n" + "        <br/>\n"
						+ "                <br/>\n" + "\n";

				String endTemplateContent = "<br/><br/>Kindly send email to 'india@atalent.com' for any issues / concerns. \n"
						+ "<br/><br/><br/>\n" + "Thanks & Regards,<br/>\n" + "aTalent Dev Team\n" + "<hr/>\n"
						+ "\n<br/>"
						+ "Note: PLEASE DO NOT REPLY TO THIS MAIL. THIS IS AN AUTO GENERATED MAIL AND REPLIES TO THIS EMAIL ID ARE NOT ATTENDED.\n"
						+ "    </div>\n" + " </body>\n" + "</html>";

				String currentDateForEmail = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

				LOGGER.info("Error Map Size: " + errorMap.size());
				String countryName, status, errorMsg;
				for (String key : errorMap.keySet()) {

					LOGGER.info("key: " + key);
					LOGGER.info("value: " + errorMap.get(key));
					countryName = errorMap.get(key).split(" -> ")[0];
					status = errorMap.get(key).split(" -> ")[1];
					errorMsg = errorMap.get(key).split(" -> ")[2];
					sftpEmailTemplate = sftpEmailTemplate
							+ sftpTemplateRowContent.replace("candidateName", key).replace("countryName", countryName)
									.replace("candidateStatus", status).replace("candidateErrorStatus", errorMsg);

				}

				String finalHtmlText = sftpEmailTemplate + sftpTemplateEndContent + endTemplateContent;

				if (isForSDH) {
					emailService.sendEmail(sdhToAddressList,
							"TalentLink->SDH Error Notification - " + currentDateForEmail, finalHtmlText, null);

				} else {
					emailService.sendEmail(toAddressList,
							"TalentLink->MyHR Error Notification - " + currentDateForEmail, finalHtmlText, null);
				}
			} catch (Exception e) {
				LOGGER.info("### - Error occured in sendOutboundErrorReportMail method ### " + e.getMessage());
				e.printStackTrace();

			}
		}

		LOGGER.info("### - Exiting sendOutboundErrorReportMail method ###");

	}

	public synchronized void fetchCandidateDetailsForSDH() {

		LOGGER.info("Entering fetchCandidateDetailsForSDH ");

		CandidateDetailsService candidateService = new CandidateDetailsService();
		DocumentService documentService = new DocumentService();
		PositionDetailsService positionDetailsService = new PositionDetailsService();
		UserDetailsService userService = new UserDetailsService();
		

		Map<String, String> applicationIdMap = new HashMap<String, String>();

		final List<StructuredFormQADto> finalQuestAnswerList = new ArrayList<StructuredFormQADto>();

		List<ApplicationDto> selectedCandidates = candidateService.getAllHiredOfferedAcceptedCandidateDetails(true);

		List<ApplicationDto> finalSelectedCandidates = new ArrayList<ApplicationDto>();

		selectedCandidates.forEach(candidate -> {
			LOGGER.info("Candidate ID: " + candidate.getCandidateId());
			LOGGER.info("Candidate Status: " + candidate.getStatus());

			if (!CommonConstants.REJECTED_STATUS.equalsIgnoreCase(candidate.getStatus())
					&& !CommonConstants.WITHDRAWN_STATUS.equalsIgnoreCase(candidate.getStatus())
					&& !CommonConstants.RESEND_SDH.equalsIgnoreCase(candidate.getStatus())) {
				if (!isAlreadyProcessedRecordBySDH(candidate.getCandidateId() + "")) {
					finalSelectedCandidates.add(candidate);
				}

			} else if(CommonConstants.RESEND_SDH.equalsIgnoreCase(candidate.getStatus())) {
			
				if (isAlreadyProcessedResendRecordBySDH(candidate.getCandidateId() + "")) {
					finalSelectedCandidates.add(candidate);
				}
				
			} else if (isAlreadyProcessedRecordForSDHWithdrawn(candidate.getCandidateId() + "")) {
				finalSelectedCandidates.add(candidate);
			}

		});

		sdhExportList.clear();
		encryptedFileList.clear();
		errorMap.clear();
		AtomicReference<String> recordId = new AtomicReference<String>();

		finalSelectedCandidates.forEach(candidate -> {
			try {
			finalQuestAnswerList.clear();
			recordId.set("");
			// if (candidate.getCandidateId() == 103716) {
			// if (candidate.getCandidateId() == 103723) {
			// if (candidate.getCandidateId() == 103824) {

			LOGGER.info("Candidate ID: " + candidate.getCandidateId());
			LOGGER.info("Candidate Status: " + candidate.getStatus());

			Profile candidateProfile = candidateService.getCandidateDetailsById(candidate.getCandidateId());

			LOGGER.info("FirstName: " + candidateProfile.getFirstname());
			LOGGER.info("LastName: " + candidateProfile.getLastname());
			LOGGER.info("Email: " + candidateProfile.getEmail());
			LOGGER.info("ApplicaitonId: " + candidateProfile.getApplicationId());

			List<Integer> structuredDocIds = documentService
					.getStructuredDocumentsIdsByCandidateId(candidate.getCandidateId(), allowedFormNamesList);

			if (documentService.getPreHireFormAvailability().containsKey(candidate.getCandidateId())
					&& documentService.getPreHireFormAvailability().get(candidate.getCandidateId())) {

				structuredDocIds.forEach(documentId -> {
					finalQuestAnswerList.addAll(documentService.getStructuredDocumentQAById((long) documentId));
				});

				finalQuestAnswerList
						.addAll(positionDetailsService.getRequisitinQADetailsByPositionId(candidate.getPositionId()));

				if (candidate.getDocuments().getDocument().size() > 0) {
					finalQuestAnswerList.addAll(candidateService.getContractQADetailsByApplicationId(
							candidate.getDocuments().getDocument().get(0).getApplicationId(),
							candidate.getCandidateId()));
				}

				finalQuestAnswerList.forEach(questAnswer -> {
					LOGGER.info("Source: " + questAnswer.getSource());
					LOGGER.info("Q: " + questAnswer.getQuestion());
					LOGGER.info("A: " + questAnswer.getAnswer());

					if ("TalentLink Record ID".equals(questAnswer.getQuestion())) {
						recordId.set(questAnswer.getAnswer());
					}
				});

			} else {
				if (!CommonConstants.REJECTED_STATUS.equalsIgnoreCase(candidate.getStatus())) {
					String errorMsg = "NA" + " -> " + candidate.getStatus() + " -> Pre-Hire Form Not Completed";
					errorMap.put(candidateProfile.getFirstname() + "(" + candidate.getCandidateId() + ")", errorMsg);
				} else if (isAlreadyProcessedRecord(candidate.getCandidateId() + "")) {
					String errorMsg = "NA" + " -> " + candidate.getStatus() + " -> Pre-Hire Form Not Completed";
					errorMap.put(candidateProfile.getFirstname() + "(" + candidate.getCandidateId() + ")", errorMsg);

				}

			}

			LOGGER.info("documentService.getJobLocationCountry() " + documentService.getJobLocationCountry());

			if (!StringUtils.isEmpty(documentService.getJobLocationCountry())) {

					boolean preCheckFlag = true;
					boolean beanCheckFlag = true;
					SDHExportData sdhData = null;
					//String gid=null;
					if (CommonConstants.NON_MYHR_COUNTRIES_LIST.contains(documentService.getJobLocationCountry())) {
						sdhData = (SDHExportData) exportUtilsFactory.getUtilInstance(CommonConstants.NON_MYHR_COUNTRIES)
								.generateExportData(finalQuestAnswerList);
						
						sdhData.setSystemPersonType(CommonConstants.DEFAULT_PERSON_TYPE);
						// sdhData.setAssignment_status(CommonConstants.ACTIVE);
						sdhData.setAssignmentStatusTypeCode(candidate.getStatus());
						sdhData.setProposedUserPersonType(CommonConstants.REGULAR_EMPLOYEE);
						sdhData.setPersonManagerType(CommonConstants.LINE_MANAGER);
						sdhData.setBusinessUnitName(CommonConstants.DEFAULT_BUSINESS_UNIT);
						sdhData.setLocalSystem(CommonConstants.DEFAULT_LOCAL_SYSTEM);
						sdhData.setActionCode(CommonConstants.DEFAULT_ACTION_CODE);
						sdhData.setReasonCode(CommonConstants.DEFAULT_ACTION_CODE);
						sdhData.setEmailType(CommonConstants.DEFAULT_EMAIL_TYPE);
						sdhData.setLocalAction(CommonConstants.DEFAULT_ACTION_CODE);
						sdhData.setLocalActionReason(CommonConstants.DEFAULT_ACTION_CODE);
						sdhData.setGlobalDepartmentCode(CommonConstants.SDH_NON_MYHR_DEPT_CODE_PREFIX+""+countryCodeMap.get(documentService.getJobLocationCountry()));
						sdhData.setLocalLocationCode(CommonConstants.EMPTY);

						if (!StringUtils.isEmpty(sdhData.getGradeCode())) {
							sdhData.setGradeCode(sdhData.getGradeCode().replace(" ", "."));
						}

						if (!StringUtils.isEmpty(sdhData.getLegalEmployerCode())) {
							sdhData.setLegalEmployerCode(sdhData.getLegalEmployerCode());
						}

						if (!StringUtils.isEmpty(sdhData.getCostCenter())) {
							String[] codeArray = sdhData.getCostCenter().split("\\.");
							if (codeArray != null && codeArray.length > 0)
								sdhData.setCrestERCode(codeArray[0]);
							else
								LOGGER.info("crest_code_er not found from cost string, " + sdhData.getCostCenter());
						}

						
						
					} else {
						sdhData = (SDHExportData) exportUtilsFactory.getUtilInstance(CommonConstants.MYHR_COUNTRIES)
								.generateExportData(finalQuestAnswerList);
						
						sdhData.setSystemPersonType(CommonConstants.DEFAULT_PERSON_TYPE);
						// sdhData.setAssignment_status(CommonConstants.ACTIVE);
						sdhData.setAssignmentStatusTypeCode(candidate.getStatus());
						sdhData.setProposedUserPersonType(CommonConstants.REGULAR_EMPLOYEE);
						sdhData.setPersonManagerType(CommonConstants.LINE_MANAGER);
						sdhData.setBusinessUnitName(CommonConstants.DEFAULT_BUSINESS_UNIT);
						sdhData.setLocalSystem(CommonConstants.DEFAULT_LOCAL_SYSTEM);
						sdhData.setActionCode(CommonConstants.DEFAULT_ACTION_CODE);
						sdhData.setReasonCode(CommonConstants.DEFAULT_ACTION_CODE);
						sdhData.setEmailType(CommonConstants.DEFAULT_EMAIL_TYPE);
						sdhData.setLocalAction(CommonConstants.DEFAULT_ACTION_CODE);
						sdhData.setLocalActionReason(CommonConstants.DEFAULT_ACTION_CODE);

						if (!StringUtils.isEmpty(sdhData.getGradeCode())) {
							sdhData.setGradeCode(sdhData.getGradeCode().replace(" ", "."));
						}

						if (!StringUtils.isEmpty(sdhData.getLegalEmployerCode())) {
							sdhData.setLegalEmployerCode(sdhData.getLegalEmployerCode().substring(0, 4));
						}

						if (!StringUtils.isEmpty(sdhData.getCostCenter())) {
							String[] codeArray = sdhData.getCostCenter().split("\\.");
							if (codeArray != null && codeArray.length > 0)
								sdhData.setCrestERCode(codeArray[0]);
							else
								LOGGER.info("crest_code_er not found from cost string, " + sdhData.getCostCenter());
						}

						if (candidate.getDocuments().getDocument().size() > 0)
							applicationIdMap.put(sdhData.getPersonNumber(),
									candidate.getDocuments().getDocument().get(0).getApplicationId() + "");
						
						if (candidate.getStatus().equalsIgnoreCase(CommonConstants.WITHDRAWN_STATUS)) {
							
							/*String candidateGID = candidateService.getGlobalIDFromStructuredDocumentById(candidate.getCandidateId());
							if (!StringUtils.isEmpty(candidateGID)) {
								gid = candidateGID;
							} else {
								gid = getGidFromSDHData(sdhData.getPersonNumber());
							}
							if (!StringUtils.isEmpty(gid))
							{
								sdhData.setGid(gid);
							}
							 */
							preCheckFlag = isAlreadyProcessedRecordForWithdrawn(sdhData.getPersonNumber(), recordId.get());
							

						}
					}

					// sdhData.setLocalLocationCode(countryCodeMap.get(documentService.getJobLocationCountry()));

					// sdhData.setEmployee_employment_status(candidate.getStatus());
					// sdhData.setOrganizational_unit("SC1_" + sdhData.getLocation());					
					

				 if (candidate.getStatus().equalsIgnoreCase(CommonConstants.RESEND_SDH)) {						
						
						preCheckFlag = addResendSDHDetails(sdhData.getPersonNumber().replace("TalentLink_",""),
								candidate.getStatus());					

					} 

					if (preCheckFlag) {

						beanCheckFlag = addBeanValidationErrorsForSDH(sdhData, documentService.getJobLocationCountry(),
								candidate.getCandidateId());

						if (beanCheckFlag) {
							
							if (!StringUtils.isEmpty(sdhData.getPersonManagerExternalIdentifierNumber())) {								
								
							/*	if (candidate.getStatus().equalsIgnoreCase(CommonConstants.WITHDRAWN_STATUS)) {
									if (!StringUtils.isEmpty(sdhData.getGid())) {
										LOGGER.info("Adding data to SDH file");
										//sdhExportList.add(sdhData);
									} else {
										if (sdhData.getFirstName() != null) {
											String errorMsg = documentService.getJobLocationCountry() + " -> "
													+ sdhData.getAssignmentStatusTypeCode()
													+ " -> No Gid Found For Candidate";
											errorMap.put(sdhData.getFirstName() + "(" + candidate.getCandidateId() + ")",
													errorMsg);
										}
										LOGGER.info("No Gid found for candidate name: " + sdhData.getFirstName());
									}
								} else {*/
								LOGGER.info("Adding data to SDH file");
								sdhExportList.add(sdhData);
								//}
							} else {
								if (sdhData.getFirstName() != null) {
									String errorMsg = documentService.getJobLocationCountry() + " -> "
											+ sdhData.getAssignmentStatusTypeCode()
											+ " -> No Gid Found For Line Manager";
									errorMap.put(sdhData.getFirstName() + "(" + candidate.getCandidateId() + ")",
											errorMsg);
								}
								LOGGER.info("No Gid Found For Line Manager, candidate name: " + sdhData.getFirstName());
							}
						}
					}

				}
				 //}
			} catch (Exception e) {
				LOGGER.error("Exception occured " + e.getMessage());
			}
		});

		LOGGER.info("sdhExportList: " + sdhExportList.size());

		String fileName = "";
		String encryptedFileName = "";

		removedAlreadySentRecordsForSDH(sdhExportList);

		LOGGER.info("Final sdhExportList: " + sdhExportList.size());

		if (sdhExportList.size() > 0) {

			for (SDHExportData exportData : sdhExportList) {
				
				if (applicationIdMap.containsKey(exportData.getPersonNumber())) {
					if (!(exportData.getAssignmentStatusTypeCode().equalsIgnoreCase(CommonConstants.WITHDRAWN_STATUS))
							&& !(exportData.getAssignmentStatusTypeCode()
									.equalsIgnoreCase(CommonConstants.REJECTED_STATUS))
							&& !(exportData.getAssignmentStatusTypeCode()
									.equalsIgnoreCase(CommonConstants.HIRED_STATUS))) {
						userService.updateApplicationStatus(applicationIdMap.get(exportData.getPersonNumber()),
								CommonConstants.PRE_HIRE_COMPLETED_STATUS);
						exportData.setAssignmentStatusTypeCode(CommonConstants.SDH_PRE_HIRE_COMPLETED_STATUS);
					} else if (exportData.getAssignmentStatusTypeCode()
							.equalsIgnoreCase(CommonConstants.WITHDRAWN_STATUS)) {
						exportData.setAssignmentStatusTypeCode(CommonConstants.SDH_WITHDRAWN_STATUS);
					} else if (exportData.getAssignmentStatusTypeCode()
							.equalsIgnoreCase(CommonConstants.REJECTED_STATUS)) {
						exportData.setAssignmentStatusTypeCode(CommonConstants.SDH_REJECTED_STATUS);
					} else if (exportData.getAssignmentStatusTypeCode()
							.equalsIgnoreCase(CommonConstants.HIRED_STATUS)) {
						exportData.setAssignmentStatusTypeCode(CommonConstants.SDH_PRE_HIRE_COMPLETED_STATUS);
					}
				} else {					

					if (!(exportData.getAssignmentStatusTypeCode().equalsIgnoreCase(CommonConstants.WITHDRAWN_STATUS))
							&& !(exportData.getAssignmentStatusTypeCode()
									.equalsIgnoreCase(CommonConstants.REJECTED_STATUS))
							&& !(exportData.getAssignmentStatusTypeCode()
									.equalsIgnoreCase(CommonConstants.HIRED_STATUS))) {						
						exportData.setAssignmentStatusTypeCode(CommonConstants.SDH_PRE_HIRE_COMPLETED_STATUS);
					} else if (exportData.getAssignmentStatusTypeCode()
							.equalsIgnoreCase(CommonConstants.WITHDRAWN_STATUS)) {
						exportData.setAssignmentStatusTypeCode(CommonConstants.SDH_WITHDRAWN_STATUS);
					} else if (exportData.getAssignmentStatusTypeCode()
							.equalsIgnoreCase(CommonConstants.REJECTED_STATUS)) {
						exportData.setAssignmentStatusTypeCode(CommonConstants.SDH_REJECTED_STATUS);
					} else if (exportData.getAssignmentStatusTypeCode()
							.equalsIgnoreCase(CommonConstants.HIRED_STATUS)) {
						exportData.setAssignmentStatusTypeCode(CommonConstants.SDH_PRE_HIRE_COMPLETED_STATUS);
					} 
				
				}
			}

			// fileName = csvWriterUtil.writeExportDataForSDH("Talentlink_SDH_Details_" +
			// sdf.format(new Date()) + ".csv",
			// sdhExportList);
			String localFileName = "Talentlink_SDH_Details_" + sdf.format(new Date()) + ".xml";
			fileName = csvWriterUtil.writeExportDataXMLForSDH(localFileName, sdhExportList);

			insertSDHExportDatainDB(sdhExportList);

			encryptedFileName = encryptSDHFile(fileName, localFileName);

			encryptedFileList.add(encryptedFileName);
			LOGGER.info("SDH File Created");
		}

		LOGGER.info("Exiting fetchCandidateDetailsForSDH");
	}

}
