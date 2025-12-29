package com.dhl.dhltalentlinkapp.outbound.utils.export.sdh;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.dao.StructuredFormQADto;
import com.dhl.dhltalentlinkapp.linkvaluedetails.LinkvaluedetailsManager;
import com.dhl.dhltalentlinkapp.lovdetails.LovdetailsManager;
import com.dhl.dhltalentlinkapp.outbound.dao.export.Data;
import com.dhl.dhltalentlinkapp.outbound.dao.export.sdh.SDHExportData;
import com.dhl.dhltalentlinkapp.outbound.utils.export.ExportDataUtil;
import com.dhl.dhltalentlinkapp.services.LovHierarchyService;
import com.dhl.dhltalentlinkapp.tlkuserdetails.TlkuserdetailsManager;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class SDHExportUtilV2 extends ExportDataUtil {

	private final static Logger LOGGER = LoggerManager.getLogger(SDHExportUtilV2.class);

	protected @Autowired LovdetailsManager lovDetailsManager;
	protected @Autowired LinkvaluedetailsManager linkValueDetailsManager;
	protected @Autowired TlkuserdetailsManager userManager;

	protected LovHierarchyService myHierarchyService = null;
	private SimpleDateFormat sdf = null;
	private SimpleDateFormat sdf2 = null;
	private SimpleDateFormat expectedFormat = null;
	private SimpleDateFormat endDate_sdf = null;

	public SDHExportUtilV2() {
		myHierarchyService = new LovHierarchyService();
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		expectedFormat = new SimpleDateFormat("yyyy/MM/dd");
		endDate_sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

	@Override
	public Data generateExportData(List<StructuredFormQADto> finalQuestAnswerList) {
		SDHExportData exportData = new SDHExportData();

		finalQuestAnswerList.forEach(questAnswerDetails -> {

			switch (questAnswerDetails.getQuestion().split("/")[0].replace("\u00A0", "").trim()) {

			case "First Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire"))
					if (!StringUtils.hasLength(exportData.getFirstName()))
						exportData.setFirstName(questAnswerDetails.getAnswer());
				break;

			case "Last Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire"))
					if (!StringUtils.hasLength(exportData.getLastName()))
						exportData.setLastName(questAnswerDetails.getAnswer());
				break;

			case "Preferred First Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire")) {
					if (!StringUtils.isEmpty(questAnswerDetails.getAnswer())) {
						if (!StringUtils.hasLength(exportData.getKnownAs()))
							exportData.setKnownAs(questAnswerDetails.getAnswer());

						LOGGER.info("Preferred First Name, KnownAs" + questAnswerDetails.getSource());
					}
				}

				break;

			case "Date of birth":
				try {
					if (questAnswerDetails.getSource().contains("Pre-Hire")) {
						if (!StringUtils.hasLength(exportData.getDateofBirth())) {
							String dateStr = questAnswerDetails.getAnswer().trim();
							LOGGER.info("$$$$ Date " + dateStr);
							if(dateStr.matches("\\d{2}/\\d{2}/\\d{4}")){
								LOGGER.info("Date Format matched, format d{2}/d{2}/d{4}: " + dateStr);
								exportData.setDateofBirth(expectedFormat.format(sdf.parse(dateStr)));
							} else if(dateStr.matches("\\d{4}/\\d{2}/\\d{2}")) {
								LOGGER.info("Date Format matched, format d{4}/d{2}/d{2}: " + dateStr);
								exportData.setDateofBirth(expectedFormat.format(sdf2.parse(dateStr)));
							} else {
								LOGGER.info("Date Format not matched, Date: " + dateStr);
							}							
							
						}
					}
				} catch (Exception ex) {
					LOGGER.error("Exception occured in \"Date of birth\" Assignment "+"dob: "+questAnswerDetails.getAnswer()+", message: " + ex.getMessage());
					ex.printStackTrace();
				}
				break;

			case "Does this role require a business email account":
				exportData.setEmailAccountRequired(questAnswerDetails.getAnswer());
				LOGGER.info("Email Account Required " + questAnswerDetails.getSource());
				break;

			case "Legal Entity CodeAPAC":
				 String answer = questAnswerDetails.getAnswer();
				    if (answer != null && answer.length() >= 4) {
				        String legalEmployerCode = answer.substring(0, 4);  // Extract the first 4 characters
				        exportData.setLegalEmployerCode(legalEmployerCode);
				    } 
				LOGGER.info("Legal Employer, " + questAnswerDetails.getSource());
				break;

			case "DPDHL Job Code 2":
				exportData.setGlobalJobCode(questAnswerDetails.getAnswer());
				LOGGER.info("DPDHL Job Code 2, " + questAnswerDetails.getSource());
				break;

			case "Line Manager Full Name v3":
				exportData.setPersonManagerExternalIdentifierNumber(questAnswerDetails.getAnswer());
				// line_manager_full_name.set(questAnswerDetails.getAnswer());
				LOGGER.info("Line Manager Name, " + questAnswerDetails.getSource());
				break;

			case "Planned Start Date":
				try {
					exportData.setProjectedStartDate(
							expectedFormat.format(endDate_sdf.parse(questAnswerDetails.getAnswer())));

					exportData.setRelationshipDateStart(
							expectedFormat.format(endDate_sdf.parse(questAnswerDetails.getAnswer())));

				} catch (Exception ex) {
					LOGGER.error("Exception occured in \"Planned Start Date\" Assignment " + ex.getMessage());
					ex.printStackTrace();
				}
				LOGGER.info("Planned Start Date, " + questAnswerDetails.getSource());
				break;

			case "Person ID":
				exportData.setPersonNumber(questAnswerDetails.getAnswer());

				LOGGER.info("Person ID, " + questAnswerDetails.getSource());
				break;

			case "RCS Grade":
				exportData.setGradeCode(questAnswerDetails.getAnswer());
				if (!StringUtils.isEmpty(questAnswerDetails.getAnswer()) && questAnswerDetails.getAnswer().equals("NA"))
					exportData.setGradeCode(CommonConstants.RCS_GRADE_NA_CODE);
				LOGGER.info("RCS Grade" + questAnswerDetails.getSource());
				break;
				
			case "RCS Grade RO":
				exportData.setGradeCode(questAnswerDetails.getAnswer());
				if (!StringUtils.isEmpty(questAnswerDetails.getAnswer()) && questAnswerDetails.getAnswer().equals("NA"))
					exportData.setGradeCode(CommonConstants.RCS_GRADE_NA_CODE);
				LOGGER.info("RCS Grade RO" + questAnswerDetails.getSource());
				break;
				
				

			case "DSC Global Job 2":
				exportData.setBusinessTitle(questAnswerDetails.getAnswer());
				LOGGER.info("DSC Global Job 2, " + questAnswerDetails.getSource());
				break;
				
			case "Job Title":
				exportData.setBusinessTitle(questAnswerDetails.getAnswer());
				LOGGER.info("Job Title, " + questAnswerDetails.getSource());
				break;

			case "Email Address":
				exportData.setEmailAddress(questAnswerDetails.getAnswer());
				LOGGER.info("Email Address, " + questAnswerDetails.getSource());
				break;

			case "Cost CentreAPAC":
				exportData.setCostCenter(questAnswerDetails.getAnswer());
				LOGGER.info("Cost Center, " + questAnswerDetails.getSource());
				break;

			}
		});


		LOGGER.info("Final Data: " + exportData.toString());

		return exportData;
	}	


}
