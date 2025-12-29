package com.dhl.dhltalentlinkapp.services;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.dhl.dhltalentlinkapp.dao.StructuredFormQADto;
import com.dhl.dhltalentlinkapp.linkvaluedetails.Linkvaluedetails;
import com.dhl.dhltalentlinkapp.outbound.dao.export.AustraliaExportData;
import com.dhl.dhltalentlinkapp.outbound.dao.export.sdh.SDHExportData;
import com.dhl.dhltalentlinkapp.outbound.dao.export.sdh.SDHExportDataList;
import com.dhl.dhltalentlinkapp.utils.ApiUtils;
import com.mrted.ws.candidate.ApplicationDto;
import com.mrted.ws.candidate.Profile;
import com.mrted.ws.documents.GetDocumentsByCandidateIdResponse;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class OutboundTest {

	private final static Logger LOGGER = LoggerManager.getLogger(OutboundTest.class);
	
	
	public void display() {

		CandidateDetailsService candidateService = new CandidateDetailsService();
		DocumentService documentService = new DocumentService();
		PositionDetailsService positionDetailsService = new PositionDetailsService();

		final List<String> allowedFormNames = Arrays.asList(
				"AU_White Collar (Long) + security protocol check + candidate information + Working Rights",
				"*myHR - Application Forms for WC long forms", "Pre-Hire form for myHR test v3");

		final List<StructuredFormQADto> finalQuestAnswerList = new ArrayList<StructuredFormQADto>();

		List<ApplicationDto> selectedCandidates = candidateService.getAllHiredOfferedAcceptedCandidateDetails(false);

		selectedCandidates.forEach(candidate -> {

			if (candidate.getCandidateId() == 103716) {

				LOGGER.info("Candidate ID: " + candidate.getCandidateId());
				LOGGER.info("Candidate Status: " + candidate.getStatus());

				Profile candidateProfile = candidateService.getCandidateDetailsById(candidate.getCandidateId());

				LOGGER.info("FirstName: " + candidateProfile.getFirstname());
				LOGGER.info("LastName: " + candidateProfile.getLastname());
				LOGGER.info("Email: " + candidateProfile.getEmail());
				LOGGER.info("ApplicaitonId: " + candidateProfile.getApplicationId());

				List<Integer> structuredDocIds = documentService
						.getStructuredDocumentsIdsByCandidateId(candidate.getCandidateId(), allowedFormNames);

				structuredDocIds.forEach(documentId -> {
					finalQuestAnswerList.addAll(documentService.getStructuredDocumentQAById((long) documentId));
				});

				finalQuestAnswerList
						.addAll(positionDetailsService.getRequisitinQADetailsByPositionId(candidate.getPositionId()));

				if (candidate.getDocuments().getDocument().size() > 0) {
					finalQuestAnswerList.addAll(candidateService.getContractQADetailsByApplicationId(
							candidate.getDocuments().getDocument().get(0).getApplicationId(),candidate.getCandidateId()));
				}

			}
		});

		finalQuestAnswerList.forEach(questAnswer -> {
			LOGGER.info("Source: " + questAnswer.getSource());
			LOGGER.info("Q: " + questAnswer.getQuestion());
			LOGGER.info("A: " + questAnswer.getAnswer());
		});

		generateAustraliaExportData(finalQuestAnswerList);
		
		Comparator<Linkvaluedetails> idComparator = Comparator.comparing(Linkvaluedetails::getLinkValueId).reversed();
		
	
	}

	
	public static void main(String[] args) {
		
		String fileName="/home/mathan/Desktop/exportData.xml";
		SDHExportDataList dataList = new SDHExportDataList();
		List<SDHExportData> exportDataList=new ArrayList<SDHExportData>();

		ApiUtils utils = new ApiUtils();
		utils.lovIdMap.forEach((key,value)->{
			System.out.println(value.getLovName());
		});
		/*try {

			// Create a JAXB context
			JAXBContext context = JAXBContext.newInstance(SDHExportDataList.class);

			// Create a marshaller
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// Marshal the list of objects to XML
			marshaller.marshal(dataList, new File(fileName));

			LOGGER.info("Export Data File Created Successfully.. " + fileName);

			

		} catch (Exception e) {
			LOGGER.error("Exception occured in writeExportDataXMLForSDH method " + e.getMessage());
			e.printStackTrace();
		}
		*/
/*
		CandidateDetailsService candidateService = new CandidateDetailsService();
		DocumentService documentService = new DocumentService();
		PositionDetailsService positionDetailsService = new PositionDetailsService();

		final List<String> allowedFormNames = Arrays.asList(
				"AU_White Collar (Long) + security protocol check + candidate information + Working Rights",
				"*myHR - Application Forms for WC long forms", "Pre-Hire form for myHR test v3");

		final List<StructuredFormQADto> finalQuestAnswerList = new ArrayList<StructuredFormQADto>();

		List<ApplicationDto> selectedCandidates = candidateService.getAllHiredOfferedAcceptedCandidateDetails(false);

		selectedCandidates.forEach(candidate -> {

			if (candidate.getCandidateId() == 103716) {

				LOGGER.info("Candidate ID: " + candidate.getCandidateId());
				LOGGER.info("Candidate Status: " + candidate.getStatus());

				Profile candidateProfile = candidateService.getCandidateDetailsById(candidate.getCandidateId());

				LOGGER.info("FirstName: " + candidateProfile.getFirstname());
				LOGGER.info("LastName: " + candidateProfile.getLastname());
				LOGGER.info("Email: " + candidateProfile.getEmail());
				LOGGER.info("ApplicaitonId: " + candidateProfile.getApplicationId());

				List<Integer> structuredDocIds = documentService
						.getStructuredDocumentsIdsByCandidateId(candidate.getCandidateId(), allowedFormNames);

				structuredDocIds.forEach(documentId -> {
					finalQuestAnswerList.addAll(documentService.getStructuredDocumentQAById((long) documentId));
				});

				finalQuestAnswerList
						.addAll(positionDetailsService.getRequisitinQADetailsByPositionId(candidate.getPositionId()));

				if (candidate.getDocuments().getDocument().size() > 0) {
					finalQuestAnswerList.addAll(candidateService.getContractQADetailsByApplicationId(
							candidate.getDocuments().getDocument().get(0).getApplicationId(),candidate.getCandidateId()));
				}

			}
		});

		finalQuestAnswerList.forEach(questAnswer -> {
			LOGGER.info("Source: " + questAnswer.getSource());
			LOGGER.info("Q: " + questAnswer.getQuestion());
			LOGGER.info("A: " + questAnswer.getAnswer());
		});

		generateAustraliaExportData(finalQuestAnswerList);*/
	}

	private static void generateAustraliaExportData(List<StructuredFormQADto> finalQuestAnswerList) {
		AustraliaExportData exportData = new AustraliaExportData();

		finalQuestAnswerList.forEach(questAnswerDetails -> {

			switch (questAnswerDetails.getQuestion()) {

			case "First Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire"))
					exportData.setFirst_name(questAnswerDetails.getAnswer());
				break;

			case "Middle Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire"))
					exportData.setMiddle_name(questAnswerDetails.getAnswer());
				break;

			case "Last Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire"))
					exportData.setLast_name(questAnswerDetails.getAnswer());
				break;

			case "Preferred Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire"))
					exportData.setPreferred_name(questAnswerDetails.getAnswer());
				break;

			case "Date of birth":
				exportData.setDate_of_birth(questAnswerDetails.getAnswer());
				break;

			case "Country of birth":
				exportData.setCountry_of_birth(questAnswerDetails.getAnswer());
				break;

			case "Citizenships":
				exportData.setCitizenship(questAnswerDetails.getAnswer());
				break;

			case "Type":
				exportData.setAddress_type(questAnswerDetails.getAnswer());
				break;

			case "Address Line 1":
				exportData.setAddress_1(questAnswerDetails.getAnswer());
				break;

			case "Address Line 2":
				exportData.setAddress_2(questAnswerDetails.getAnswer());
				break;

			case "Address Line 3":
				exportData.setAddress_3(questAnswerDetails.getAnswer());
				break;

			case "Country":
				exportData.setCountry(questAnswerDetails.getAnswer());
				break;

			case "Post Code":
				exportData.setPost_code(questAnswerDetails.getAnswer());
				break;

			case "State":
				exportData.setState(questAnswerDetails.getAnswer());
				break;

			case "Suburb":
				exportData.setSuburb(questAnswerDetails.getAnswer());
				break;

			case "Contact details":
				exportData.setContact_phone_number(questAnswerDetails.getAnswer());
				break;

			case "Email Address":
				exportData.setEmail_address(questAnswerDetails.getAnswer());
				break;

			case "National Identifier number":
				exportData.setNational_identifier(questAnswerDetails.getAnswer());
				break;

			case "Sex":
				exportData.setSex(questAnswerDetails.getAnswer());
				break;

			case "Person ID":
				exportData.setPerson_id(questAnswerDetails.getAnswer());
				break;

			case "MYHR Position Code v2":
				exportData.setMyhr_position_code(questAnswerDetails.getAnswer());
				break;

			case "Job Title":
				exportData.setJob_title(questAnswerDetails.getAnswer());
				break;

			case "Working from home":
				exportData.setWorking_from_home(questAnswerDetails.getAnswer());
				break;

			case "Department Name v2":
				exportData.setDepartment(questAnswerDetails.getAnswer());
				break;

			case "Legal Employer":
				exportData.setLegal_employer(questAnswerDetails.getAnswer());
				break;

			case "Contract type v2":
				exportData.setContract_type(questAnswerDetails.getAnswer());
				break;

			case "Work Hours v2":
				exportData.setWorking_hours(questAnswerDetails.getAnswer());
				break;

			case "Work Hours Frequency v2":
				exportData.setWorking_hours_frequency(questAnswerDetails.getAnswer());
				break;

			case "Contract End Date":
				exportData.setContract_end_date(questAnswerDetails.getAnswer());
				break;

			case "Employment type":
				exportData.setEmployment_type_in_offer_form(questAnswerDetails.getAnswer());
				break;

			case "Career Level Job Watch  Job World":
				exportData.setCareer_level_for_job_posting(questAnswerDetails.getAnswer());
				break;

			case "RCS Grade v2":
				exportData.setRcs_grade(questAnswerDetails.getAnswer());
				break;

			case "Shift Requirement":
				exportData.setShift_requirement(questAnswerDetails.getAnswer());
				break;

			case "Planned Start Date":
				exportData.setContract_start_date_from_offer_form(questAnswerDetails.getAnswer());
				break;

			case "Is the employee fully charged to this department":
				exportData.setIs_the_employee_fully_charged(questAnswerDetails.getAnswer());
				break;

			case "Function":
				exportData.setFunction_code(questAnswerDetails.getAnswer());
				break;

			case "Analysis":
				exportData.setAnalysis(questAnswerDetails.getAnswer());
				break;

			case "Intercompany":
				exportData.setIntercompany(questAnswerDetails.getAnswer());
				break;

			case "Person Type":
				exportData.setPerson_type(questAnswerDetails.getAnswer());
				break;

			case "Is the employees Cost split":
				exportData.setIs_the_employees_cost_split(questAnswerDetails.getAnswer());
				break;

			case "Salary basis":
				exportData.setSalary_basis_in_offer_form(questAnswerDetails.getAnswer());
				break;

			case "Salary Amount":
				exportData.setSalary_amount(questAnswerDetails.getAnswer());
				break;

			case "Payroll":
				exportData.setPayroll(questAnswerDetails.getAnswer());
				break;

			case "TalentLink Record ID":
				exportData.setTalentlink_record_id(questAnswerDetails.getAnswer());
				break;

			case "Probation Period":
				exportData.setProbation_period(questAnswerDetails.getAnswer());
				break;

			case "Probation period unit":
				exportData.setProbation_period_unit(questAnswerDetails.getAnswer());
				break;

			case "Notice period":
				exportData.setNotice_period(questAnswerDetails.getAnswer());
				break;

			case "Notice period unit":
				exportData.setNotice_period_unit(questAnswerDetails.getAnswer());
				break;

			case "Applicable Enterprise Agreement":
				exportData.setApplicable_enterprise_agreement(questAnswerDetails.getAnswer());
				break;

			/*
			 * 1. Address Type - default Home - are we going to send only home address or we
			 * should include mailing address also ? (addressed) 2. GID - ?? - from where to fetch
			 * candidate GID. (no updates) 3. Person ID: should it be
			 * TalentLink_{{candidate_application_id}} confirmed...(addressed) 
			 * 4. DSC_Job_Code from DSC Global Job Name v2 - need to add logic 
			 * 5. DSC_Location_Code - from Location Name v2 - need to add logic 
			 * 7. Line Manager Full Name get gID from manager file and use it for Line Manager.- need to add logic , 
			 * 6. Working_Hours and Working_Hours_Frequency from requisition form: should we take timeCount as work hours and workUnit as
			 * work_hours_frequency ?? <workTime> <timeCount>15.0</timeCount>
			 * <workPeriod>Day</workPeriod> <workUnit>Days</workUnit> </workTime> if Work
			 * Hours Frequency v2 present thats priority.. else take values from workTime
			 * timecount and workPeriod. 
			 * 8. Salary Amount ?? should
			 * we take value from 'Salary &/or Other Benefits' from requisition form for
			 * Salary Amount ??" <permanentContract> <fixedSalary>4000</fixedSalary> 
			 * 9. need to change
			 * 
			 * Unit to Probation period unit in export file 10. need to change Unit to
			 * Notice period unit in export file
			 */

			}

		});
		
		

		LOGGER.info(exportData.toString());
	}

	private static String jaxbObjectToXML(GetDocumentsByCandidateIdResponse customer) {
		String xmlString = "";
		try {
			JAXBContext context = JAXBContext.newInstance(GetDocumentsByCandidateIdResponse.class);
			Marshaller m = context.createMarshaller();

			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

			StringWriter sw = new StringWriter();
			m.marshal(customer, sw);
			xmlString = sw.toString();

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return xmlString;
	}

}
