package com.dhl.dhltalentlinkapp.outbound.utils.export.sdh;

import static com.dhl.dhltalentlinkapp.constants.CommonConstants.ACTIVE;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.LOV_FIELD_ID_DEPARTMENT_COST_STRING;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.LOV_FIELD_ID_DPDHL_JOB_CODE;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.LOV_FIELD_ID_LEGAL_ENTITY;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.LOV_FIELD_ID_ORG_UNIT;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.LOV_FIELD_ID_LOCATION_CODE;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.dao.StructuredFormQADto;
import com.dhl.dhltalentlinkapp.linkvaluedetails.Linkvaluedetails;
import com.dhl.dhltalentlinkapp.linkvaluedetails.LinkvaluedetailsManager;
import com.dhl.dhltalentlinkapp.lovdetails.Lovdetails;
import com.dhl.dhltalentlinkapp.lovdetails.LovdetailsManager;
import com.dhl.dhltalentlinkapp.outbound.dao.export.Data;
import com.dhl.dhltalentlinkapp.outbound.dao.export.sdh.SDHExportData;
import com.dhl.dhltalentlinkapp.outbound.utils.export.ExportDataUtil;
import com.dhl.dhltalentlinkapp.services.LovHierarchyService;
import com.dhl.dhltalentlinkapp.tlkuserdetails.Tlkuserdetails;
import com.dhl.dhltalentlinkapp.tlkuserdetails.TlkuserdetailsManager;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class SDHExportUtil extends ExportDataUtil {

	private final static Logger LOGGER = LoggerManager.getLogger(SDHExportUtil.class);

	protected @Autowired LovdetailsManager lovDetailsManager;
	protected @Autowired LinkvaluedetailsManager linkValueDetailsManager;
	protected @Autowired TlkuserdetailsManager userManager;

	protected LovHierarchyService myHierarchyService = null;
	private SimpleDateFormat sdf = null;
	private SimpleDateFormat expectedFormat = null;
	private SimpleDateFormat endDate_sdf = null;

	public SDHExportUtil() {
		myHierarchyService = new LovHierarchyService();
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		expectedFormat = new SimpleDateFormat("yyyy/MM/dd");
		endDate_sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

	@Override
	public Data generateExportData(List<StructuredFormQADto> finalQuestAnswerList) {
		SDHExportData exportData = new SDHExportData();
		AtomicReference<String> dsc_global_name = new AtomicReference<String>();
		AtomicReference<String> functionCode = new AtomicReference<String>();
		AtomicReference<String> intercompanyCode = new AtomicReference<String>();
		AtomicReference<String> analysisCode = new AtomicReference<String>();
		
		// AtomicReference<String> line_manager_full_name = new
		// AtomicReference<String>();

		finalQuestAnswerList.forEach(questAnswerDetails -> {

			switch (questAnswerDetails.getQuestion()) {

			case "First Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire"))
					if(!StringUtils.hasLength(exportData.getFirstName()))
						exportData.setFirstName(questAnswerDetails.getAnswer());
				break;

			case "Last Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire"))
					if(!StringUtils.hasLength(exportData.getLastName()))
						exportData.setLastName(questAnswerDetails.getAnswer());
				break;
				
			case "Preferred First Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire")) {
					if(!StringUtils.isEmpty(questAnswerDetails.getAnswer())){
						if(!StringUtils.hasLength(exportData.getKnownAs()))
							exportData.setKnownAs(questAnswerDetails.getAnswer());
						
					LOGGER.info("Preferred First Name, KnownAs" + questAnswerDetails.getSource());
					}
					}				

				break;
				
			case "Preferred Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire")) {
					if(!StringUtils.isEmpty(questAnswerDetails.getAnswer())){
						if(!StringUtils.hasLength(exportData.getKnownAs()))
							exportData.setKnownAs(questAnswerDetails.getAnswer());
						LOGGER.info("Preferred Name, KnownAs" + questAnswerDetails.getSource());
					}				
				}
				break;
				
			case "Does this role require a business email account":				
					exportData.setEmailAccountRequired(questAnswerDetails.getAnswer());
					LOGGER.info("Email Account Required " + questAnswerDetails.getSource());
					break;				

			case "Date of birth":
				try {
					if(!StringUtils.hasLength(exportData.getDateofBirth()))
						exportData.setDateofBirth(expectedFormat.format(sdf.parse(questAnswerDetails.getAnswer())));
				} catch (Exception ex) {
					LOGGER.error("Exception occured in \"Date of birth\" Assignment " + ex.getMessage());
					ex.printStackTrace();
				}
				break;

			/*
			 * case "Person Type":
			 * exportData.setPerson_type(questAnswerDetails.getAnswer().replace("  "," - "))
			 * ; LOGGER.info("Person Type, "+questAnswerDetails.getSource()); break;
			 */

			case "Legal Employer":
				exportData.setLegalEmployerCode(questAnswerDetails.getAnswer());
				LOGGER.info("Legal Employer, " + questAnswerDetails.getSource());
				break;

			case "DSC Global Job Name":
				dsc_global_name.set(questAnswerDetails.getAnswer());
				LOGGER.info("DSC Global Job Name, " + questAnswerDetails.getSource());
				break;

			case "Line Manager Full Name":
				exportData.setPersonManagerExternalIdentifierNumber(questAnswerDetails.getAnswer());
				//line_manager_full_name.set(questAnswerDetails.getAnswer());
				LOGGER.info("Line Manager, " + questAnswerDetails.getSource());
				break;
				
			//case "Line Manager Full Name":
				//exportData.setPersonManagerExternalIdentifierNumber(questAnswerDetails.getAnswer());
				//line_manager_full_name.set(questAnswerDetails.getAnswer());
				//LOGGER.info("Line Manager Full Name, " + questAnswerDetails.getSource());
				//break;

			case "Department Name":
				exportData.setGlobalDepartmentCode(questAnswerDetails.getAnswer());
				LOGGER.info("Department Name, " + questAnswerDetails.getSource());
				break;

			case "Planned Start Date":
				try {
					exportData.setProjectedStartDate(expectedFormat.format(endDate_sdf.parse(questAnswerDetails.getAnswer())));

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
				if(!StringUtils.isEmpty(questAnswerDetails.getAnswer())&& questAnswerDetails.getAnswer().equals("NA"))
					exportData.setGradeCode(CommonConstants.RCS_GRADE_NA_CODE);
				
				LOGGER.info("RCS Grade v2, " + questAnswerDetails.getSource());
				break;

			case "Job Title":
				exportData.setBusinessTitle(questAnswerDetails.getAnswer());
				LOGGER.info("Job Title, " + questAnswerDetails.getSource());
				break;
				
			case "Email Address":
				exportData.setEmailAddress(questAnswerDetails.getAnswer());
				LOGGER.info("Email Address, "+questAnswerDetails.getSource());
				break;
				
			case "Function":
				functionCode.set(questAnswerDetails.getAnswer());
				LOGGER.info("Function, " + questAnswerDetails.getSource());
				break;
				
			case "Intercompany":
				intercompanyCode.set(questAnswerDetails.getAnswer());
				LOGGER.info("Function, " + questAnswerDetails.getSource());
				break;
			
			case "Analysis":
				analysisCode.set(questAnswerDetails.getAnswer());
				LOGGER.info("Analysis, " + questAnswerDetails.getSource());
				break;
			

			}
		});
		
		if (dsc_global_name.get() != null) {
			Comparator<Linkvaluedetails> idComparator = Comparator.comparing(Linkvaluedetails::getLinkValueId)
					.reversed();
			String jobCode = "";
			Optional<Linkvaluedetails> linkValueDetails = linkValueDetailsManager.stream()
					.filter(Linkvaluedetails.TO_FIELD_NAME.equal("DPDHL_JOB_CODE")
							.and(Linkvaluedetails.FROM_FIELD_NAME.equal("DSC_GLOBAL_JOB_NAME")
									.and(Linkvaluedetails.FROM_FIELD_VALUE.equal(dsc_global_name.get()))))
					.sorted(idComparator).findFirst();

			if (linkValueDetails.isPresent()) {
				if (linkValueDetails.get().getStatus().get().equals(ACTIVE)) {
					jobCode = linkValueDetails.get().getToFieldValue().get();
					exportData.setGlobalJobCode(jobCode);
					LOGGER.info("DPDHL_JOB_CODE: " + jobCode);
				}
			} else {
				Comparator<Lovdetails> lovValueidComparator = Comparator.comparing(Lovdetails::getLovValueDetailsId)
						.reversed();
				Optional<Lovdetails> lovDetails = lovDetailsManager.stream()
						.filter(Lovdetails.LOV_NAME.equal("DSC_GLOBAL_JOB_NAME")
								.and(Lovdetails.LOV_VALUE.equal(dsc_global_name.get())))
						.sorted(lovValueidComparator).findFirst();
				LOGGER.info(lovDetails.get().getLovName());
				LOGGER.info(lovDetails.get().getLovValueId() + "");
				if (lovDetails.isPresent()) {
					jobCode = myHierarchyService.getLovsByUnlockers(lovDetails.get().getLovValueId(),
							LOV_FIELD_ID_DPDHL_JOB_CODE);
					exportData.setGlobalJobCode(jobCode);
					LOGGER.info("DPDHL_JOB_CODE 2: " + jobCode);
				}

			}
		}

		if (exportData.getGlobalDepartmentCode() != null) {
			Comparator<Linkvaluedetails> idComparator = Comparator.comparing(Linkvaluedetails::getLinkValueId)
					.reversed();
			String costCenter = "";
			Optional<Linkvaluedetails> linkValueDetails = linkValueDetailsManager.stream()
					.filter(Linkvaluedetails.TO_FIELD_NAME.equal("DEPARTMENT_COST_STRING")
							.and(Linkvaluedetails.FROM_FIELD_NAME.equal("DEPARTMENT_NAME")
									.and(Linkvaluedetails.FROM_FIELD_VALUE.equal(exportData.getGlobalDepartmentCode()))))
					.sorted(idComparator).findFirst();

			if (linkValueDetails.isPresent()) {
				if (linkValueDetails.get().getStatus().get().equals(ACTIVE)) {
					costCenter = linkValueDetails.get().getToFieldValue().get();
					String analysis = analysisCode.get();
					String interCompany= intercompanyCode.get();
					String function = functionCode.get();
					LOGGER.info("analysis: " + analysis);
					LOGGER.info("interCompany: " + interCompany);
					LOGGER.info("function: " + function);
					
					if (StringUtils.hasLength(analysis) && StringUtils.hasLength(analysis) && StringUtils.hasLength(analysis)) {
						LOGGER.info(costCenter+"."+function+"."+interCompany+"."+analysis);	
						exportData.setCostCenter(costCenter+"."+function+"."+interCompany+"."+analysis);
					}
					else
						exportData.setCostCenter(costCenter);
					
					LOGGER.info("costCenter: " + costCenter);
				}
			} else {
				Comparator<Lovdetails> lovValueidComparator = Comparator.comparing(Lovdetails::getLovValueDetailsId)
						.reversed();
				Optional<Lovdetails> lovDetails = lovDetailsManager.stream()
						.filter(Lovdetails.LOV_NAME.equal("DEPARTMENT_NAME")
								.and(Lovdetails.LOV_VALUE.equal(exportData.getGlobalDepartmentCode())))
						.sorted(lovValueidComparator).findFirst();
				LOGGER.info(lovDetails.get().getLovName());
				LOGGER.info(lovDetails.get().getLovValueId() + "");
				if (lovDetails.isPresent()) {
					costCenter = myHierarchyService.getLovsByUnlockers(lovDetails.get().getLovValueId(),
							LOV_FIELD_ID_DEPARTMENT_COST_STRING);
					
					String analysis = analysisCode.get();
					String interCompany= intercompanyCode.get();
					String function = functionCode.get();
					LOGGER.info("analysis: " + analysis);
					LOGGER.info("interCompany: " + interCompany);
					LOGGER.info("function: " + function);
					
					if (StringUtils.hasLength(analysis) && StringUtils.hasLength(analysis) && StringUtils.hasLength(analysis)) {
						LOGGER.info(costCenter+"."+function+"."+interCompany+"."+analysis);	
						exportData.setCostCenter(costCenter+"."+function+"."+interCompany+"."+analysis);
					}
					else
						exportData.setCostCenter(costCenter);
					
					LOGGER.info("costCenter 2: " + costCenter);
				}

			}
		}
		
		if (exportData.getGlobalDepartmentCode() != null) {
			Comparator<Linkvaluedetails> idComparator = Comparator.comparing(Linkvaluedetails::getLinkValueId)
					.reversed();
			String locationCode = "";
			Optional<Linkvaluedetails> linkValueDetails = linkValueDetailsManager.stream()
					.filter(Linkvaluedetails.TO_FIELD_NAME.equal("LOCATION_CODE")
							.and(Linkvaluedetails.FROM_FIELD_NAME.equal("DEPARTMENT_NAME")
									.and(Linkvaluedetails.FROM_FIELD_VALUE.equal(exportData.getGlobalDepartmentCode()))))
					.sorted(idComparator).findFirst();

			if (linkValueDetails.isPresent() && linkValueDetails.get().getStatus().get().equals(ACTIVE) && StringUtils.hasLength(linkValueDetails.get().getToFieldValue().get())) {			
					locationCode = linkValueDetails.get().getToFieldValue().get();
					exportData.setLocalLocationCode(locationCode);
					LOGGER.info("locationCode: " + locationCode);			
			} else {
				Comparator<Lovdetails> lovValueidComparator = Comparator.comparing(Lovdetails::getLovValueDetailsId)
						.reversed();
				Optional<Lovdetails> lovDetails = lovDetailsManager.stream()
						.filter(Lovdetails.LOV_NAME.equal("DEPARTMENT_NAME")
								.and(Lovdetails.LOV_VALUE.equal(exportData.getGlobalDepartmentCode())))
						.sorted(lovValueidComparator).findFirst();
				LOGGER.info(lovDetails.get().getLovName());
				LOGGER.info(lovDetails.get().getLovValueId() + "");
				if (lovDetails.isPresent()) {
					locationCode = myHierarchyService.getLovsByUnlockers(lovDetails.get().getLovValueId(),
							LOV_FIELD_ID_LOCATION_CODE);
					exportData.setLocalLocationCode(locationCode);
					LOGGER.info("locationCode 2: " + locationCode);
				}

			}
		}

		if (exportData.getLegalEmployerCode() == null && exportData.getGlobalDepartmentCode() != null) {
			Comparator<Linkvaluedetails> idComparator = Comparator.comparing(Linkvaluedetails::getLinkValueId)
					.reversed();
			String legalEntityCode = "";
			Optional<Linkvaluedetails> linkValueDetails = linkValueDetailsManager.stream()
					.filter(Linkvaluedetails.TO_FIELD_NAME.equal("LEGAL_ENTITY")
							.and(Linkvaluedetails.FROM_FIELD_NAME.equal("DEPARTMENT_NAME")
									.and(Linkvaluedetails.FROM_FIELD_VALUE.equal(exportData.getGlobalDepartmentCode()))))
					.sorted(idComparator).findFirst();

			if (linkValueDetails.isPresent()) {
				if (linkValueDetails.get().getStatus().get().equals(ACTIVE)) {
					legalEntityCode = linkValueDetails.get().getToFieldValue().get();
					exportData.setLegalEmployerCode(legalEntityCode);
					LOGGER.info("legalEntityCode: " + legalEntityCode);
				}
			} else {
				Comparator<Lovdetails> lovValueidComparator = Comparator.comparing(Lovdetails::getLovValueDetailsId)
						.reversed();
				Optional<Lovdetails> lovDetails = lovDetailsManager.stream()
						.filter(Lovdetails.LOV_NAME.equal("DEPARTMENT_NAME")
								.and(Lovdetails.LOV_VALUE.equal(exportData.getGlobalDepartmentCode())))
						.sorted(lovValueidComparator).findFirst();
				LOGGER.info(lovDetails.get().getLovName());
				LOGGER.info(lovDetails.get().getLovValueId() + "");
				if (lovDetails.isPresent()) {
					legalEntityCode = myHierarchyService.getLovsByUnlockers(lovDetails.get().getLovValueId(),
							LOV_FIELD_ID_LEGAL_ENTITY);
					exportData.setLegalEmployerCode(legalEntityCode);
					LOGGER.info("legalEntityCode 2: " + legalEntityCode);
				}

			}
		}
		
		if (exportData.getGlobalDepartmentCode() != null) {
			Comparator<Linkvaluedetails> idComparator = Comparator.comparing(Linkvaluedetails::getLinkValueId)
					.reversed();
			String orgUnit = "";
			Optional<Linkvaluedetails> linkValueDetails = linkValueDetailsManager.stream()
					.filter(Linkvaluedetails.TO_FIELD_NAME.equal("ORG_UNIT")
							.and(Linkvaluedetails.FROM_FIELD_NAME.equal("DEPARTMENT_NAME")
									.and(Linkvaluedetails.FROM_FIELD_VALUE.equal(exportData.getGlobalDepartmentCode()))))
					.sorted(idComparator).findFirst();

			if (linkValueDetails.isPresent()) {
				if (linkValueDetails.get().getStatus().get().equals(ACTIVE)) {
					orgUnit = linkValueDetails.get().getToFieldValue().get();
					exportData.setGlobalDepartmentCode(orgUnit);
					LOGGER.info("GlobalDepartmentCode: " + orgUnit);
				}
			} else {
				Comparator<Lovdetails> lovValueidComparator = Comparator.comparing(Lovdetails::getLovValueDetailsId)
						.reversed();
				Optional<Lovdetails> lovDetails = lovDetailsManager.stream()
						.filter(Lovdetails.LOV_NAME.equal("DEPARTMENT_NAME")
								.and(Lovdetails.LOV_VALUE.equal(exportData.getGlobalDepartmentCode())))
						.sorted(lovValueidComparator).findFirst();
				LOGGER.info(lovDetails.get().getLovName());
				LOGGER.info(lovDetails.get().getLovValueId() + "");
				if (lovDetails.isPresent()) {
					orgUnit = myHierarchyService.getLovsByUnlockers(lovDetails.get().getLovValueId(),
							LOV_FIELD_ID_ORG_UNIT);
					exportData.setGlobalDepartmentCode(orgUnit);
					LOGGER.info("GlobalDepartmentCode 2: " + orgUnit);
				}

			}
		}

/*
		if (line_manager_full_name.get() != null) {
			Optional<Tlkuserdetails> tlkuserdetails = userManager.stream().filter(userDetails -> {

				if (line_manager_full_name.get()
						.equals(userDetails.getFirstname().get() + " " + userDetails.getLastname().get()))
					return true;
				else
					return false;
			}).findFirst();

			if (tlkuserdetails.isPresent()) {
				LOGGER.info("User Present " + line_manager_full_name.get());
				if (tlkuserdetails.get().getGid().isPresent()) {
					LOGGER.info("GID Present");
					exportData.setPersonManagerExternalIdentifierNumber(tlkuserdetails.get().getGid().get());
				} else
					LOGGER.info("GID Not Present");
			} else
				LOGGER.info("User Not Present: " + line_manager_full_name.get());
		} else {
			LOGGER.info("Line Manager Details Not available");
		}*/
		LOGGER.info("Final Data: " + exportData.toString());

		return exportData;
	}

}
