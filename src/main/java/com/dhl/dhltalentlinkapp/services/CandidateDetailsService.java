package com.dhl.dhltalentlinkapp.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

import com.cronutils.utils.StringUtils;
import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.dao.StructuredFormQADto;
import com.dhl.dhltalentlinkapp.gradedetails.Gradedetails;
import com.mrted.ws.candidate.Answer;
import com.mrted.ws.candidate.ApplicationDto;
import com.mrted.ws.candidate.CandidateWebService;
import com.mrted.ws.candidate.CandidateWebService_Service;
import com.mrted.ws.candidate.ContractDto;
import com.mrted.ws.candidate.FreeFormFieldContract;
import com.mrted.ws.candidate.GenericLov;
import com.mrted.ws.candidate.GfDocument;
import com.mrted.ws.candidate.Profile;
import com.mrted.ws.candidate.StructuredDocument;
import com.mrted.ws.position.FreeFormFieldDto;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class CandidateDetailsService {

	private final static Logger LOGGER = LoggerManager.getLogger(CandidateDetailsService.class);

	CandidateWebService_Service candidateWebService = null;
	CandidateWebService candidateService = null;
	BindingProvider bindingProvider = null;

	public CandidateDetailsService() {

		candidateWebService = new CandidateWebService_Service();
		candidateService = candidateWebService.getCandidateWebServicePort();

		bindingProvider = (BindingProvider) candidateService;
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://api3.lumesse-talenthub.com/HRIS/SOAP/Candidate?api_key=686170a1-b10c-b79d-ae8c-9b9992c65ecb");
	}

	public static void main(String args[]) {

		CandidateDetailsService candidateService = new CandidateDetailsService();

		// candidateService.getYesterdaysDate();
		List<ApplicationDto> eligibleCandidates = candidateService.getAllHiredOfferedAcceptedCandidateDetails(true);
		// configService.getCandidateDetails(103713L);

//		List<ApplicationDto> eligibleCandidates = candidateService.getAllHiredOfferedAcceptedCandidateDetails(false);

		eligibleCandidates.forEach(a -> {
		
			System.out.println(a.getCandidateId());
			System.out.println(a.getStatus() + " ");
		

		});

	}

	public Profile getCandidateDetailsById(Long id) {

		LOGGER.info("### - Entering getCandidateDetails method ###");

		Profile profile = candidateService.getCandidateById(id, true, null);

		// StructuredDocument structuredDocument =
		// candidateService.getStructuredDocumentById(103713L);

		/*
		 * LOGGER.info(profile.getFirstname()); LOGGER.info(profile.getLastname());
		 * LOGGER.info(profile.getEmail());
		 * LOGGER.info(profile.getCreation().toString());
		 * LOGGER.info(profile.getStatus().getValueAttribute());
		 */
		/*
		 * LOGGER.info(structuredDocument.getId() + " id"); for (Answer answer :
		 * structuredDocument.getAnswers().getAnswer()) {
		 * LOGGER.info(answer.getFreeText());
		 * LOGGER.info(answer.getAssignedQuestion().getQuestionId() + "");
		 * LOGGER.info(answer.getAssignedQuestion().getId() + "");
		 * 
		 * }
		 */

		LOGGER.info("### - Exiting getCandidateDetails method ###");

		return profile;

	}

	public List<ApplicationDto> getAllHiredOfferedAcceptedCandidateDetails(boolean isForSDH) {
		LOGGER.info("### - Entering getAllHiredOfferedAcceptedCandidateDetails method ###");

		String[] allowedCandidateStatuses;

		if (isForSDH) {
			allowedCandidateStatuses = new String[] { "'Offer accepted'", "'Withdrawn'", "'Rejected'","'Hired'","'Resend SDH'"};
		} else {
			allowedCandidateStatuses = new String[] { "'PreHire form completed'", "'Withdrawn'", "'Resend'",
					"'Rejected'","'Hired'"};
		}

		int startPage = 1;
		int endPage = 5;
		List<ApplicationDto> applicationDto = new ArrayList<>();

		for (String status : allowedCandidateStatuses) {
			String statusFilter = "application.status=" + status;

			for (int pageNo = startPage; pageNo <= endPage; pageNo++) {
				try {
					List<ApplicationDto> currentPageApplications = candidateService.getApplications(pageNo,
							statusFilter, true);
					if (currentPageApplications != null && !currentPageApplications.isEmpty()) {
						applicationDto.addAll(currentPageApplications);
					}
				} catch (Exception e) {
					LOGGER.error("Error occurred while fetching applications: " + e.getMessage());
					e.printStackTrace();
				}
			}
		}

		LOGGER.info("HiredOfferedaccepted Applications size: " + applicationDto.size());

		LOGGER.info("### - Exiting getAllHiredOfferedAcceptedCandidateDetails method ###");

		return applicationDto;
	}

	public List<ApplicationDto> getAllHiredOfferedAcceptedCandidateDetailsOld(boolean isForSDH) {

		LOGGER.info("### - Entering getAllHiredOfferedAcceptedCandidateDetails method ###");

		List<ApplicationDto> applicationDto = new ArrayList<>();
		try {
			List<String> allowedCandidateStatus = Arrays.asList("PreHire form completed", "Withdrawn", "Resend",
					"Rejected");

			List<String> allowedCandidateStatusForSDH = Arrays.asList("Offer accepted", "Offered", "Withdrawn",
					"Rejected");

			int startPage = 1;
			int endPage = 5;

			XMLGregorianCalendar todaysDate = getTodaysDate();
			XMLGregorianCalendar yesterdaysDate = getYesterdaysDate();
			Set<Long> uniqueCandidateIds = new HashSet<Long>();

			if (isForSDH) {
				for (String status : allowedCandidateStatusForSDH) {
					LOGGER.info("Getting Applications With Status: " + status);
					for (int pageNo = startPage; pageNo <= endPage; pageNo++) {
						List<ApplicationDto> currentPageApplications = candidateService.getApplicationsByStatus(pageNo,
								status, todaysDate, false);
						if (currentPageApplications != null && currentPageApplications.size() > 0) {
							LOGGER.info("ApplicationList Size: : " + currentPageApplications.size());

							List<ApplicationDto> filteredApplications = new ArrayList<>();

							for (ApplicationDto application : currentPageApplications) {

								if (uniqueCandidateIds.add(application.getCandidateId())) {

									filteredApplications.add(application);
								}
							}
							applicationDto.addAll(filteredApplications);
						}
					}

					LOGGER.info("ApplicationList without duplicates for Todays Date: " + todaysDate + ", size: "
							+ applicationDto.size());

					for (int pageNo = startPage; pageNo <= endPage; pageNo++) {
						List<ApplicationDto> currentPageApplications = candidateService.getApplicationsByStatus(pageNo,
								status, yesterdaysDate, false);
						if (currentPageApplications != null && currentPageApplications.size() > 0) {
							LOGGER.info("ApplicationList Size: : " + currentPageApplications.size());

							List<ApplicationDto> filteredApplications = new ArrayList<>();

							for (ApplicationDto application : currentPageApplications) {

								if (uniqueCandidateIds.add(application.getCandidateId())) {

									filteredApplications.add(application);
								}
							}
							applicationDto.addAll(filteredApplications);
						}
					}
					LOGGER.info("ApplicationList without duplicates for Yesterdays Date: " + yesterdaysDate + ", size: "
							+ applicationDto.size());
				}

			} else {

				for (String status : allowedCandidateStatus) {
					LOGGER.info("Getting Applications With Status: " + status);
					for (int pageNo = startPage; pageNo <= endPage; pageNo++) {
						List<ApplicationDto> currentPageApplications = candidateService.getApplicationsByStatus(pageNo,
								status, todaysDate, false);
						if (currentPageApplications != null && currentPageApplications.size() > 0) {
							LOGGER.info("ApplicationList Size: : " + currentPageApplications.size());
							List<ApplicationDto> filteredApplications = new ArrayList<>();

							for (ApplicationDto application : currentPageApplications) {

								if (uniqueCandidateIds.add(application.getCandidateId())) {

									filteredApplications.add(application);
								}
							}
							if (filteredApplications.size() > 0)
								applicationDto.addAll(filteredApplications);
						}
					}
					LOGGER.info("ApplicationList without duplicates for Todays Date: " + todaysDate + ", size: "
							+ applicationDto.size());
					for (int pageNo = startPage; pageNo <= endPage; pageNo++) {
						List<ApplicationDto> currentPageApplications = candidateService.getApplicationsByStatus(pageNo,
								status, yesterdaysDate, false);
						if (currentPageApplications != null && currentPageApplications.size() > 0) {
							LOGGER.info("ApplicationList Size: : " + currentPageApplications.size());
							List<ApplicationDto> filteredApplications = new ArrayList<>();

							for (ApplicationDto application : currentPageApplications) {

								if (uniqueCandidateIds.add(application.getCandidateId())) {

									filteredApplications.add(application);
								}
							}
							applicationDto.addAll(filteredApplications);
						}
					}
					LOGGER.info("ApplicationList Size for Yesterdays Date: " + yesterdaysDate + ", size: "
							+ applicationDto.size());
				}

			}

			// List<ApplicationDto> eligibleCandidates = null;

			/*
			 * if (isForSDH) { eligibleCandidates = applicationDto.stream()
			 * .filter(candidate ->
			 * allowedCandidateStatusForSDH.contains(candidate.getStatus().toLowerCase()))
			 * .collect(Collectors.toList()); } else { eligibleCandidates =
			 * applicationDto.stream() .filter(candidate ->
			 * allowedCandidateStatus.contains(candidate.getStatus().toLowerCase()))
			 * .collect(Collectors.toList()); }
			 */
			LOGGER.info("HiredOfferedaccepted Applications size: " + applicationDto.size());

			LOGGER.info("### - Exiting getAllHiredOfferedAcceptedCandidateDetails method ###");

		} catch (Exception e) {
			LOGGER.error("Exception occured in getAllHiredOfferedAcceptedCandidateDetailsTest " + e.getMessage());
			e.printStackTrace();
		}
		return applicationDto;

	}

	public XMLGregorianCalendar getTodaysDate() {
		try {
			// Get the current date
			GregorianCalendar gregorianCalendar = new GregorianCalendar();

			gregorianCalendar.clear(GregorianCalendar.HOUR);
			gregorianCalendar.clear(GregorianCalendar.HOUR_OF_DAY);
			gregorianCalendar.clear(GregorianCalendar.MINUTE);
			gregorianCalendar.clear(GregorianCalendar.SECOND);
			gregorianCalendar.clear(GregorianCalendar.MILLISECOND);
			// Create a DatatypeFactory instance
			DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();

			// Create a XMLGregorianCalendar object representing the current date
			XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);

			// Print the XMLGregorianCalendar object
			System.out.println("XMLGregorianCalendar object2: " + xmlGregorianCalendar);
			return xmlGregorianCalendar;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public XMLGregorianCalendar getYesterdaysDate() {
		try {
			// Get the current date
			GregorianCalendar gregorianCalendar = new GregorianCalendar();

			gregorianCalendar.add(GregorianCalendar.DAY_OF_MONTH, -1); // Subtract one day

			gregorianCalendar.clear(GregorianCalendar.HOUR);
			gregorianCalendar.clear(GregorianCalendar.HOUR_OF_DAY);
			gregorianCalendar.clear(GregorianCalendar.MINUTE);
			gregorianCalendar.clear(GregorianCalendar.SECOND);
			gregorianCalendar.clear(GregorianCalendar.MILLISECOND);

			// Create a DatatypeFactory instance
			DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();

			// Create a XMLGregorianCalendar object representing yesterday's date
			XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);

			// Print the XMLGregorianCalendar object
			System.out.println("XMLGregorianCalendar object2: " + xmlGregorianCalendar);

			return xmlGregorianCalendar;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<StructuredFormQADto> getContractQADetailsByApplicationId(Long applicationId, Long candidateId) {

		LOGGER.info("### - Entering getContractQADetailsByApplicationId method ###");

		List<StructuredFormQADto> questionAnswerList = new ArrayList<StructuredFormQADto>();

		LOGGER.info(" ### applicationId: " + applicationId);

		List<ContractDto> contractDto = candidateService.getContractsByApplicationId(applicationId);

		LOGGER.info("contractDto size: " + contractDto.size());
		
		contractDto.forEach(contractDetails -> {

			LOGGER.info("contract id: "+contractDetails.getId());
			
			try {
				if (contractDetails.getFreeFormFields() != null) {

					List<FreeFormFieldContract> freeFormFieldContract = contractDetails.getFreeFormFields()
							.getFreeFormField();
					freeFormFieldContract.forEach(freeFormFieldDetails -> {

						StructuredFormQADto questionAnswerdto = new StructuredFormQADto();
						questionAnswerdto.setQuestion(freeFormFieldDetails.getValueAttribute());
						questionAnswerdto.setAnswer(freeFormFieldDetails.getValue());
						questionAnswerdto.setSource("Offer Form");
						LOGGER.info(freeFormFieldDetails.getName());
						LOGGER.info(freeFormFieldDetails.getValue());

						questionAnswerList.add(questionAnswerdto);

					});
				   }
				
					List<GenericLov> genericLov = contractDetails.getLovs().getLov();

					genericLov.forEach(lovDetails -> {

						StructuredFormQADto questionAnswerdto = new StructuredFormQADto();
						questionAnswerdto.setQuestion(lovDetails.getName());
						questionAnswerdto.setAnswer(lovDetails.getValueAttribute());
						questionAnswerdto.setSource("Offer Form");
						LOGGER.info(lovDetails.getName());
						LOGGER.info(lovDetails.getValueAttribute());
						questionAnswerList.add(questionAnswerdto);

					});

					StructuredFormQADto questionAnswerdto = new StructuredFormQADto();
					questionAnswerdto.setQuestion("Planned Start Date");
					if (contractDetails.getPlannedStartDate() != null)
						questionAnswerdto.setAnswer(contractDetails.getPlannedStartDate().toString());
					questionAnswerdto.setSource("Offer Form");

					questionAnswerList.add(questionAnswerdto);

					questionAnswerdto = new StructuredFormQADto();
					questionAnswerdto.setQuestion("Contract End Date");
					if (contractDetails.getPlannedEndDate() != null)
						questionAnswerdto.setAnswer(contractDetails.getPlannedEndDate().toString());
					questionAnswerdto.setSource("Offer Form");

					questionAnswerList.add(questionAnswerdto);

					questionAnswerdto = new StructuredFormQADto();
					questionAnswerdto.setQuestion("TalentLink Record ID");
					questionAnswerdto.setAnswer("talentlink_" + contractDetails.getId());
					questionAnswerdto.setSource("Offer Form");

					questionAnswerList.add(questionAnswerdto);

					// questionAnswerdto = new StructuredFormQADto();
					// questionAnswerdto.setQuestion("Probation Period");
					// questionAnswerdto.setAnswer(contractDetails.getProbationaryPeriod());
					// questionAnswerdto.setSource("Offer Form");

					questionAnswerList.add(questionAnswerdto);

					questionAnswerdto = new StructuredFormQADto();
					questionAnswerdto.setQuestion("Person ID");
					questionAnswerdto.setAnswer("TalentLink_" + candidateId); // changed from applicantId to candidateId
																				// after discussion with Manuella on
																				// Mar17th
																				// Call.
					questionAnswerdto.setSource("Offer Form");

					questionAnswerList.add(questionAnswerdto);

					if (contractDetails.getPermanentContract() != null
							&& contractDetails.getPermanentContract().getFixedSalary() != null) {
						questionAnswerdto = new StructuredFormQADto();
						questionAnswerdto.setQuestion("Salary Amount");
						questionAnswerdto
								.setAnswer(contractDetails.getPermanentContract().getFixedSalary().toPlainString());
						questionAnswerdto.setSource("Offer Form");

						questionAnswerList.add(questionAnswerdto);
					}

					if (contractDetails.getPermanentContract() != null
							&& contractDetails.getPermanentContract().getFixedSalaryCurrency() != null) {
						questionAnswerdto = new StructuredFormQADto();
						questionAnswerdto.setQuestion("Salary Currency");
						questionAnswerdto.setAnswer(
								contractDetails.getPermanentContract().getFixedSalaryCurrency().getValueAttribute());
						questionAnswerdto.setSource("Offer Form");

						questionAnswerList.add(questionAnswerdto);
					}

					if (contractDetails.getPermanentContract() != null
							&& contractDetails.getPermanentContract().getFixedSalaryPeriod() != null) {
						questionAnswerdto = new StructuredFormQADto();
						questionAnswerdto.setQuestion("Salary Period");
						questionAnswerdto.setAnswer(
								contractDetails.getPermanentContract().getFixedSalaryPeriod().getValueAttribute());
						questionAnswerdto.setSource("Offer Form");

						questionAnswerList.add(questionAnswerdto);
					}

					if (contractDetails.getSchedule() != null
							&& contractDetails.getSchedule().getWorkAmount() != null) {

						questionAnswerdto = new StructuredFormQADto();
						questionAnswerdto.setQuestion("Work Hours");
						questionAnswerdto.setAnswer(contractDetails.getSchedule().getWorkAmount() + "");
						questionAnswerdto.setSource("Offer Form");

						questionAnswerList.add(questionAnswerdto);
						
						LOGGER.info("work hours from contract: "+contractDetails.getSchedule().getWorkAmount());

						questionAnswerdto = new StructuredFormQADto();
						questionAnswerdto.setQuestion("Work Hours Frequency");
						questionAnswerdto
								.setAnswer(contractDetails.getSchedule().getWorkPeriod().getValueAttribute() + "");
						questionAnswerdto.setSource("Offer Form");
						questionAnswerList.add(questionAnswerdto);

					}

				
			} catch (Exception e) {
				LOGGER.error("Exception occured in getContractQADetailsByApplicationId applicationId: " + applicationId
						+ ", " + e.getMessage());
				e.printStackTrace();
			}
		}

		);

		LOGGER.info("### - Exiting getContractQADetailsByApplicationId method ###");

		return questionAnswerList;

	}

	public String getEmpIDFromStructuredDocumentById(Long candidateId) {
		LOGGER.info("### - Entering getEmpIDFromStructuredDocumentById method ###");
		String employeeId = "";
		try {
			StructuredDocument document = candidateService.getStructuredDocumentById(candidateId);

			LOGGER.info("Document Name: " + document.getName());

			for (Answer answer : document.getAnswers().getAnswer()) {
				if (answer.getAssignedQuestion() != null
						&& ("Employee ID".equals(answer.getAssignedQuestion().getUnlocalValue()))
						&& !StringUtils.isEmpty(answer.getFreeText())) {
					// && ("Employee Code".equals(answer.getAssignedQuestion().getUnlocalValue())))
					// {
					employeeId = answer.getFreeText();
					LOGGER.info("employeeId " + employeeId);
					break;
				}
			}
		} catch (Exception e) {
			LOGGER.error("Exception occured in getEmpIDFromStructuredDocumentById " + e.getMessage());
			e.printStackTrace();
		}

		LOGGER.info("### - Exiting getEmpIDFromStructuredDocumentById method ###");

		return employeeId;
	}

	public String getGlobalIDFromStructuredDocumentById(Long candidateId) {
		LOGGER.info("### - Entering getGlobalIDFromStructuredDocumentById method ###");
		String globalID = "";
		try {
			StructuredDocument document = candidateService.getStructuredDocumentById(candidateId);

			LOGGER.info("Document Name: " + document.getName());

			for (Answer answer : document.getAnswers().getAnswer()) {
				if (answer.getAssignedQuestion() != null
						&& ("Employee Code".equals(answer.getAssignedQuestion().getUnlocalValue()))) {
					// && ("Employee Code".equals(answer.getAssignedQuestion().getUnlocalValue())))
					// {
					globalID = answer.getFreeText();
					LOGGER.info("GID " + globalID);
					break;
				}
			}
		} catch (Exception e) {
			LOGGER.error("Exception occured in getGlobalIDFromStructuredDocumentById " + e.getMessage());
			e.printStackTrace();
		}

		LOGGER.info("### - Exiting getGlobalIDFromStructuredDocumentById method ###");

		return globalID;
	}

}
