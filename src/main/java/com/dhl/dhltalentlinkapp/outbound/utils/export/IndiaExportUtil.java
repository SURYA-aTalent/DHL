package com.dhl.dhltalentlinkapp.outbound.utils.export;

import static com.dhl.dhltalentlinkapp.constants.CommonConstants.ACTIVE;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.LOV_FIELD_ID_DSC_GLOBAL_JOB_CODE;
import static com.dhl.dhltalentlinkapp.constants.CommonConstants.LOV_FIELD_ID_LOCATION_CODE;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import org.springframework.beans.factory.annotation.Autowired;

import com.cronutils.utils.StringUtils;
import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.dao.StructuredFormQADto;
import com.dhl.dhltalentlinkapp.linkvaluedetails.Linkvaluedetails;
import com.dhl.dhltalentlinkapp.linkvaluedetails.LinkvaluedetailsManager;
import com.dhl.dhltalentlinkapp.lovdetails.Lovdetails;
import com.dhl.dhltalentlinkapp.lovdetails.LovdetailsManager;
import com.dhl.dhltalentlinkapp.outbound.dao.export.IndiaExportData;
import com.dhl.dhltalentlinkapp.services.LovHierarchyService;
import com.dhl.dhltalentlinkapp.tlkuserdetails.Tlkuserdetails;
import com.dhl.dhltalentlinkapp.tlkuserdetails.TlkuserdetailsManager;
import com.dhl.dhltalentlinkapp.utils.ApiUtils;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class IndiaExportUtil extends ExportDataUtil {

	private final static Logger LOGGER = LoggerManager.getLogger(IndiaExportUtil.class);

	protected @Autowired LovdetailsManager lovDetailsManager;
	protected @Autowired LinkvaluedetailsManager linkValueDetailsManager;
	protected @Autowired TlkuserdetailsManager userManager;

	protected LovHierarchyService myHierarchyService = null;
	private SimpleDateFormat sdf = null;
	private SimpleDateFormat expectedFormat = null;
	private SimpleDateFormat endDate_sdf = null;
	private SimpleDateFormat startDate_sdf = null;

	public IndiaExportUtil() {
		myHierarchyService = new LovHierarchyService();
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		expectedFormat = new SimpleDateFormat("yyyy/MM/dd");
		endDate_sdf = new SimpleDateFormat("yyyy-dd-MM");
		startDate_sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

	public IndiaExportData generateExportData(List<StructuredFormQADto> finalQuestAnswerList) {

		IndiaExportData exportData = new IndiaExportData();
		AtomicReference<String> dsc_global_name = new AtomicReference<String>();
		AtomicReference<String> dsc_location_name = new AtomicReference<String>();
		// AtomicReference<String> line_manager_full_name = new
		// AtomicReference<String>();

		finalQuestAnswerList.forEach(questAnswerDetails -> {

			switch (questAnswerDetails.getQuestion()) {

			case "First Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire")) {
					exportData.setFirst_name(questAnswerDetails.getAnswer());

					LOGGER.info("First Name, " + questAnswerDetails.getSource());
				}

				break;

			case "Last Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire")) {
					exportData.setLast_name(questAnswerDetails.getAnswer());
					LOGGER.info("Last Name, " + questAnswerDetails.getSource());
				}
				break;

			case "Middle Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire")) {
					exportData.setMiddle_name(questAnswerDetails.getAnswer());
					LOGGER.info("Middle Name, " + questAnswerDetails.getSource());
				}
				break;

			case "Preferred Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire")) {
					exportData.setPreferred_name(questAnswerDetails.getAnswer());
					LOGGER.info("Preferred Name, " + questAnswerDetails.getSource());
				}

				break;
				
			case "Preferred First Name":
				if (questAnswerDetails.getSource().contains("Pre-Hire")) {
					exportData.setPreferred_name(questAnswerDetails.getAnswer());
					LOGGER.info("Preferred First Name, " + questAnswerDetails.getSource());
				}

				break;

			case "Legal Employer":
				exportData.setLegal_employer(questAnswerDetails.getAnswer());
				LOGGER.info("Legal Employer, " + questAnswerDetails.getSource());
				break;

			case "Legal Employer v3":
				exportData.setLegal_employer(questAnswerDetails.getAnswer());
				LOGGER.info("Legal Employer v3, " + questAnswerDetails.getSource());
				break;

			case "Career Level Job Watch  Job World":
				exportData.setCareer_level_for_job_posting(questAnswerDetails.getAnswer());
				LOGGER.info("Career Level Job Watch  Job World, " + questAnswerDetails.getSource());
				break;

			case "Citizenships":
				exportData.setCitizenship(questAnswerDetails.getAnswer());
				LOGGER.info("Citizenships, " + questAnswerDetails.getSource());
				break;

			case "Citizenship":
				exportData.setCitizenship(questAnswerDetails.getAnswer());
				LOGGER.info("Citizenship, " + questAnswerDetails.getSource());
				break;

			case "Contact details":
				if (StringUtils.isEmpty(exportData.getContact_phone_number()))
					exportData.setContact_phone_number(questAnswerDetails.getAnswer());
				LOGGER.info("Contact details, " + questAnswerDetails.getSource());
				break;

			case "Phone (Mobile)":
				if (StringUtils.isEmpty(exportData.getContact_phone_number())) {
					exportData.setContact_phone_number(questAnswerDetails.getAnswer());
					LOGGER.info("Phone (Mobile), " + questAnswerDetails.getSource());
				}
				break;

			case "Contract End Date":
				try {
					exportData.setContract_end_date(
							expectedFormat.format(startDate_sdf.parse(questAnswerDetails.getAnswer())));
				} catch (Exception ex) {
					LOGGER.error("Exception occured in \"Contract End Date\" Assignment " + ex.getMessage());
					ex.printStackTrace();
				}
				LOGGER.info("Contract End Date, " + questAnswerDetails.getSource());
				break;

			case "Planned Start Date":
				try {
					exportData.setContract_start_date_from_offer_form(
							expectedFormat.format(startDate_sdf.parse(questAnswerDetails.getAnswer())));
				} catch (Exception ex) {
					LOGGER.error("Exception occured in \"Planned Start Date\" Assignment " + ex.getMessage());
					ex.printStackTrace();
				}
				LOGGER.info("Planned Start Date, " + questAnswerDetails.getSource());
				break;

			case "Contract Type Phenom":
				exportData.setContract_type(questAnswerDetails.getAnswer());
				exportData.setContract_type_in_offer_form(questAnswerDetails.getAnswer());
				LOGGER.info("Contract Type Phenom, " + questAnswerDetails.getSource());
				break;
				
			case "Contract Type":
				exportData.setContract_type(questAnswerDetails.getAnswer());
				exportData.setContract_type_in_offer_form(questAnswerDetails.getAnswer());
				LOGGER.info("Contract Type Phenom, " + questAnswerDetails.getSource());
				break;

			// case "Contract type v2":
			// exportData.setContract_type_in_offer_form(questAnswerDetails.getAnswer());
			// LOGGER.info("Contract type v2, "+questAnswerDetails.getSource());
			// break;

			// case "Country":
			// exportData.setCountry(removeLastComma(questAnswerDetails.getAnswer()));
			// break;

			case "Country of birth":
				exportData.setCountry_of_birth(removeLastComma(questAnswerDetails.getAnswer()));
				LOGGER.info("Country of birth, " + questAnswerDetails.getSource());
				break;

			case "Date of birth":
				try {
					exportData.setDate_of_birth(expectedFormat.format(sdf.parse(questAnswerDetails.getAnswer())));
				} catch (Exception ex) {
					LOGGER.error("Exception occured in \"Date of birth\" Assignment " + ex.getMessage());
					ex.printStackTrace();
				}
				LOGGER.info("Date of birth, " + questAnswerDetails.getSource());
				break;

			case "Working from home":
				exportData.setWorking_from_home(questAnswerDetails.getAnswer());
				LOGGER.info("Working from home, " + questAnswerDetails.getSource());
				break;

			case "Department Name":
				exportData.setDepartment(questAnswerDetails.getAnswer());
				LOGGER.info("Department Name v2, " + questAnswerDetails.getSource());
				break;

			case "Email Address":
				exportData.setEmail_address(questAnswerDetails.getAnswer());
				LOGGER.info("Email Address, " + questAnswerDetails.getSource());
				break;

			// case "Employment type":
			// exportData.setEmployment_type_in_offer_form(questAnswerDetails.getAnswer());
			// LOGGER.info("Employment type, "+questAnswerDetails.getSource());
			// break;

			case "Employment Type Job Watch  Job World":
				exportData.setEmployment_type_in_offer_form(questAnswerDetails.getAnswer());
				LOGGER.info("Employment type, " + questAnswerDetails.getSource());
				break;

			case "Function":
				exportData.setFunction_code(questAnswerDetails.getAnswer());
				LOGGER.info("Function, " + questAnswerDetails.getSource());
				break;

			case "GID":
				exportData.setGid(questAnswerDetails.getAnswer());
				LOGGER.info("GID, " + questAnswerDetails.getSource());
				break;

			case "Analysis":
				exportData.setAnalysis(questAnswerDetails.getAnswer());
				if (CommonConstants.DEFAULT_ZERO_VALUE.equals(exportData.getAnalysis()))
					exportData.setAnalysis("");
				LOGGER.info("Analysis, " + questAnswerDetails.getSource());
				break;

			case "Intercompany":
				exportData.setIntercompany(questAnswerDetails.getAnswer());
				if (CommonConstants.DEFAULT_ZERO_VALUE.equals(exportData.getIntercompany()))
					exportData.setIntercompany("");
				LOGGER.info("Intercompany, " + questAnswerDetails.getSource());
				break;

			case "Is the employees Cost split":
				if (questAnswerDetails.getSource().contains("Offer Form")) {
				exportData.setIs_the_employees_cost_split(questAnswerDetails.getAnswer());
				LOGGER.info("Is the employees Cost split, " + questAnswerDetails.getSource());
				}
				break;

			case "Is the employee fully charged to this department":
				if (questAnswerDetails.getSource().contains("Offer Form")) {
				exportData.setIs_the_employee_fully_charged(questAnswerDetails.getAnswer());
				LOGGER.info("Is the employee fully charged to this department, " + questAnswerDetails.getSource());
				}
				break;
				
			case "Is the employee fully charged to another department":
				if (questAnswerDetails.getSource().contains("Offer Form")) {
				exportData.setIs_the_employee_fully_charged(questAnswerDetails.getAnswer());
				LOGGER.info("Is the employee fully charged to this department, " + questAnswerDetails.getSource());
				}
				break;

			case "Job Title":
				exportData.setJob_title(questAnswerDetails.getAnswer());
				LOGGER.info("Job Title, " + questAnswerDetails.getSource());
				break;

			case "Notice period":
				exportData.setNotice_period(questAnswerDetails.getAnswer());
				LOGGER.info("Notice period, " + questAnswerDetails.getSource());
				break;
				
			case "Notice Period":
				exportData.setNotice_period(questAnswerDetails.getAnswer());
				LOGGER.info("Notice period, " + questAnswerDetails.getSource());
				break;

			case "Notice period unit":
				exportData.setNotice_period_unit(questAnswerDetails.getAnswer());
				LOGGER.info("Notice period unit, " + questAnswerDetails.getSource());
				break;

			case "Salary basis":
				if (CommonConstants.AU_SALARY_BASIS_WITHOUT_DOT.equals(questAnswerDetails.getAnswer()))
					exportData.setSalary_basis_in_offer_form(CommonConstants.AU_SALARY_BASIS_WITH_DOT);
				else
					exportData.setSalary_basis_in_offer_form(questAnswerDetails.getAnswer());
				LOGGER.info("Salary basis, " + questAnswerDetails.getSource());
				break;

			case "Payroll":
				exportData.setPayroll(questAnswerDetails.getAnswer());
				LOGGER.info("Payroll, " + questAnswerDetails.getSource());
				break;

			case "Person ID":
				exportData.setPerson_id(questAnswerDetails.getAnswer());
				LOGGER.info("Person ID, " + questAnswerDetails.getSource());
				break;

			case "Person Type":
				exportData.setPerson_type(questAnswerDetails.getAnswer().replace("  ", " - "));
				LOGGER.info("Person Type, " + questAnswerDetails.getSource());
				break;

			case "Probationary Period":
				exportData.setProbation_period(questAnswerDetails.getAnswer());
				LOGGER.info("Probationary Period, " + questAnswerDetails.getSource());
				break;

			case "Probationary Period Unit":
				exportData.setProbation_period_unit(questAnswerDetails.getAnswer());
				LOGGER.info("Probationary Period Unit, " + questAnswerDetails.getSource());
				break;

			case "RCS Grade v2":
				exportData.setRcs_grade(questAnswerDetails.getAnswer());
				LOGGER.info("RCS Grade v2, " + questAnswerDetails.getSource());
				break;

			case "RCS Grade":
				exportData.setRcs_grade(questAnswerDetails.getAnswer());
				LOGGER.info("RCS Grade v2, " + questAnswerDetails.getSource());
				break;

			case "Salary Amount":
				exportData.setSalary_amount(questAnswerDetails.getAnswer());
				LOGGER.info("Salary Amount, " + questAnswerDetails.getSource());
				break;

			case "Salary Currency":
				exportData.setSalary_currency(questAnswerDetails.getAnswer());
				LOGGER.info("Salary Currency, " + questAnswerDetails.getSource());
				break;

			case "Salary Period":
				exportData.setSalary_period(questAnswerDetails.getAnswer());
				LOGGER.info("Salary Period, " + questAnswerDetails.getSource());
				break;

			case "Sex":
				exportData.setSex(removeLastComma(questAnswerDetails.getAnswer()));
				LOGGER.info("Sex, " + questAnswerDetails.getSource());
				break;

			case "Shift Requirement":
				exportData.setShift_requirement(questAnswerDetails.getAnswer());
				LOGGER.info("Shift Requirement, " + questAnswerDetails.getSource());
				break;

			case "TalentLink Record ID":
				exportData.setTalentlink_record_id(questAnswerDetails.getAnswer());
				LOGGER.info("TalentLink Record ID, " + questAnswerDetails.getSource());
				break;

			case "Work Hours":
				if (!StringUtils.isEmpty(questAnswerDetails.getAnswer()))
					exportData.setWorking_hours(questAnswerDetails.getAnswer());
				LOGGER.info("Work Hours v2, " + questAnswerDetails.getSource());
				break;

			case "Work Hours Frequency":
				if (!StringUtils.isEmpty(questAnswerDetails.getAnswer()))
					exportData.setWorking_hours_frequency(questAnswerDetails.getAnswer());
				LOGGER.info("Work Hours Frequency v2, " + questAnswerDetails.getSource());
				break;

			case "Work Hours v3":
				if (!StringUtils.isEmpty(questAnswerDetails.getAnswer()))
					exportData.setWorking_hours(questAnswerDetails.getAnswer());
				LOGGER.info("Work Hours v3, " + questAnswerDetails.getSource());
				break;

			case "Work Hours Frequency v3":
				if (!StringUtils.isEmpty(questAnswerDetails.getAnswer()))
					exportData.setWorking_hours_frequency(questAnswerDetails.getAnswer());
				LOGGER.info("Work Hours Frequency v3, " + questAnswerDetails.getSource());
				break;

			case "MYHR Position Code":
				exportData.setMyhr_position_code(questAnswerDetails.getAnswer());
				if (CommonConstants.DEFAULT_PLEASE_SELECT_IF_NEEDED_CODE.equals(exportData.getMyhr_position_code()))
					exportData.setMyhr_position_code("");
				// LOGGER.info("MYHR Position Code v2, "+questAnswerDetails.getSource());
				break;

			case "DSC Global Job Name":
				dsc_global_name.set(questAnswerDetails.getAnswer());
				LOGGER.info("DSC Global Job Name v2, " + questAnswerDetails.getSource());
				break;

			case "Location Name":
				dsc_location_name.set(questAnswerDetails.getAnswer());
				LOGGER.info("Location Name v2, " + questAnswerDetails.getSource());
				break;

			case "Line Manager Full Name":
				// line_manager_full_name.set(questAnswerDetails.getAnswer());
				exportData.setLine_manager(questAnswerDetails.getAnswer());
				LOGGER.info("Line Manager, " + questAnswerDetails.getSource());
				break;

			case "Time and Attendance Payrule":
				if (!StringUtils.isEmpty(questAnswerDetails.getAnswer()))
					exportData.setTimeAndAttendance(questAnswerDetails.getAnswer());
				break;

			case "Country of residence":
				if (questAnswerDetails.getSource().contains("Pre-Hire")) {
					if (StringUtils.isEmpty(exportData.getCountry()))
						exportData.setCountry(removeLastComma(questAnswerDetails.getAnswer()));
				}
				LOGGER.info("Country of residence, " + questAnswerDetails.getSource());
				break;

			case "Type":
				if (questAnswerDetails.getSource().contains("Pre-Hire")) {
					if (StringUtils.isEmpty(exportData.getAddress_type()))
						exportData.setAddress_type(removeLastComma(questAnswerDetails.getAnswer()));
				}
				break;

			case "Post Code":
				if (questAnswerDetails.getSource().contains("Pre-Hire")) {
					if (StringUtils.isEmpty(exportData.getPost_code()))
						exportData.setPost_code(questAnswerDetails.getAnswer());
				}
				break;

			// India Specific Fields

			case "Address Line 1":
				if (StringUtils.isEmpty(exportData.getAddress_1()))
					exportData.setAddress_1(removeLastComma(questAnswerDetails.getAnswer()));
				break;

			case "Address Line 2":
				if (StringUtils.isEmpty(exportData.getAddress_2()))
					exportData.setAddress_2(removeLastComma(questAnswerDetails.getAnswer()));
				break;

			case "Address Line 3":
				if (StringUtils.isEmpty(exportData.getAddress_3()))
					exportData.setAddress_3(removeLastComma(questAnswerDetails.getAnswer()));
				break;

			case "State":
				if (StringUtils.isEmpty(exportData.getState()))
					exportData.setState(questAnswerDetails.getAnswer());

				break;

			case "City or Town":
				if (StringUtils.isEmpty(exportData.getCity_or_town()))
					exportData.setCity_or_town(questAnswerDetails.getAnswer());

				break;

			case "AADHAR Card":
				exportData.setNational_identifier(questAnswerDetails.getAnswer());
				LOGGER.info("National Identifier number, " + questAnswerDetails.getSource());
				break;
				
			case "PAN Card":
				exportData.setPan_card_number(questAnswerDetails.getAnswer());
				LOGGER.info("Pan Card Number, " + questAnswerDetails.getSource());
				break;

			}

		});

		try {
			if (dsc_global_name.get() != null) {
				Comparator<Linkvaluedetails> idComparator = Comparator.comparing(Linkvaluedetails::getLinkValueId)
						.reversed();
				String jobCode = "";
				Optional<Linkvaluedetails> linkValueDetails = linkValueDetailsManager.stream()
						.filter(Linkvaluedetails.TO_FIELD_NAME.equal("DSC_GLOBAL_JOB_CODE")
								.and(Linkvaluedetails.FROM_FIELD_NAME.equal("DSC_GLOBAL_JOB_NAME")
										.and(Linkvaluedetails.FROM_FIELD_VALUE.equal(dsc_global_name.get()))))
						.sorted(idComparator).findFirst();

				if (linkValueDetails.isPresent()) {
					if (linkValueDetails.get().getStatus().get().equals(ACTIVE)) {
						jobCode = linkValueDetails.get().getToFieldValue().get();
						exportData.setDsc_job_code(jobCode);
						LOGGER.info("jobCode: " + jobCode);
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
								LOV_FIELD_ID_DSC_GLOBAL_JOB_CODE);
						exportData.setDsc_job_code(jobCode);
						LOGGER.info("jobCode 2: " + jobCode);
					}

				}
			}

			if (dsc_location_name.get() != null && exportData.getDepartment() != null) {
				Comparator<Linkvaluedetails> idComparator = Comparator.comparing(Linkvaluedetails::getLinkValueId)
						.reversed();
				String locationCode = "";
				Optional<Linkvaluedetails> linkValueDetails = linkValueDetailsManager.stream()
						.filter(Linkvaluedetails.TO_FIELD_NAME.equal("LOCATION_CODE")
								.and(Linkvaluedetails.FROM_FIELD_NAME.equal("DEPARTMENT_NAME")
										.and(Linkvaluedetails.FROM_FIELD_VALUE.equal(exportData.getDepartment()))))
						.sorted(idComparator).findFirst();

				if (linkValueDetails.isPresent()) {
					if (linkValueDetails.get().getStatus().get().equals(ACTIVE)) {
						locationCode = linkValueDetails.get().getToFieldValue().get();
						exportData.setDsc_location_code(locationCode);
						LOGGER.info("locationCode: " + locationCode);
					}
				} else {
					Comparator<Lovdetails> lovValueidComparator = Comparator.comparing(Lovdetails::getLovValueDetailsId)
							.reversed();
					Optional<Lovdetails> lovDetails = lovDetailsManager.stream()
							.filter(Lovdetails.LOV_NAME.equal("DEPARTMENT_NAME")
									.and(Lovdetails.LOV_VALUE.equal(exportData.getDepartment())))
							.sorted(lovValueidComparator).findFirst();
					LOGGER.info(lovDetails.get().getLovName());
					LOGGER.info(lovDetails.get().getLovValueId() + "");
					if (lovDetails.isPresent()) {
						locationCode = myHierarchyService.getLovsByUnlockers(lovDetails.get().getLovValueId(),
								LOV_FIELD_ID_LOCATION_CODE);
						exportData.setDsc_location_code(locationCode);
						LOGGER.info("locationCode 2: " + locationCode);
					}

				}
			}

			try {
				if (!StringUtils.isEmpty(exportData.getMyhr_position_code())) {
					Optional<Lovdetails> lovDetails = lovDetailsManager.stream().filter(a -> {
						if (CommonConstants.COLUMN_HEADER_MYHR_POSITION_CODE.equals(a.getLovName())) {
							if (exportData.getMyhr_position_code().equals(a.getLovValue().replace("_", "")))
								return true;
							else
								return false;
						} else
							return false;

					}).findFirst();

					if (lovDetails.isPresent()) {
						LOGGER.info("MYHR Position Code with Underscore " + lovDetails.get().getLovValue());
						exportData.setMyhr_position_code(lovDetails.get().getLovValue());
					}

				}
			} catch (Exception e) {
				LOGGER.error("Exception occured while Myhr_position_code details");
				e.printStackTrace();

			}

			/*
			 * Optional<Tlkuserdetails> tlkuserdetails =
			 * userManager.stream().filter(userDetails -> { if (line_manager_full_name.get()
			 * .equals(userDetails.getFirstname().get() + " " +
			 * userDetails.getLastname().get())) return true; else return false;
			 * }).findFirst();
			 * 
			 * if (tlkuserdetails.isPresent()) { LOGGER.info("User Present " +
			 * line_manager_full_name.get()); if (tlkuserdetails.get().getGid().isPresent())
			 * { LOGGER.info("GID Present");
			 * exportData.setLine_manager(tlkuserdetails.get().getGid().get()); } else
			 * LOGGER.info("GID Not Present"); } else LOGGER.info("User Not Present: " +
			 * line_manager_full_name.get());
			 */
		} catch (Exception e) {
			LOGGER.error("Exception occured while preparing data for export " + e.getMessage());
			e.printStackTrace();
		}

		LOGGER.info("Final Data: " + exportData.toString());

		return exportData;

	}

}
