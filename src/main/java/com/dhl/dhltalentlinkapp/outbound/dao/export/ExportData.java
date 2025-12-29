package com.dhl.dhltalentlinkapp.outbound.dao.export;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExportData implements Data {

	@NotEmpty(message = "First_Name cannot be Empty")
	@JsonProperty("First_Name")
	String first_name;

	@NotEmpty(message = "Last_Name cannot be Empty")
	@JsonProperty("Last_Name")
	String last_name;

	@JsonProperty("Middle_Name")
	String middle_name;

	@JsonProperty("Preferred_Name")
	String preferred_name;

	//@NotEmpty(message = "Legal_Employer cannot be Empty")
	@JsonProperty("Legal_Employer")
	String legal_employer;

	@NotEmpty(message = "Line_Manager cannot be Empty")
	@JsonProperty("Line_Manager")
	String line_manager;

	@NotEmpty(message = "Address_Type cannot be Empty")
	@JsonProperty("Address_Type")
	String address_type;

	@NotEmpty(message = "Analysis cannot be Empty")
	@JsonProperty("Analysis")
	String analysis;

	@JsonProperty("Career_Level_for_Job_Posting")
	String career_level_for_job_posting;

	@NotEmpty(message = "Citizenship cannot be Empty")
	@JsonProperty("Citizenship")
	String citizenship;

	@NotEmpty(message = "Contact_Phone_Number cannot be Empty")
	@JsonProperty("Contact_Phone_Number")
	String contact_phone_number;

	@JsonProperty("Contract_End_Date")
	String contract_end_date;

	@JsonProperty("Contract_Start_Date_from_Offer_Form")
	String contract_start_date_from_offer_form;

	@JsonProperty("Contract_Type")
	String contract_type;

	@JsonProperty("Contract_Type_in_Offer_Form")
	String contract_type_in_offer_form;

	@NotEmpty(message = "Country cannot be Empty")
	@JsonProperty("Country")
	String country;

	@JsonProperty("Country_of_Birth")
	String country_of_birth;

	@NotEmpty(message = "DSC_Job_Code cannot be Empty")
	@JsonProperty("DSC_Job_Code")
	String dsc_job_code;

	@NotEmpty(message = "DSC_Location_Code cannot be Empty")
	@JsonProperty("DSC_Location_Code")
	String dsc_location_code;

	@JsonProperty("Date_of_Birth")
	String date_of_birth;

	@JsonProperty("Working_from_home")
	String working_from_home;

	@NotEmpty(message = "Department cannot be Empty")
	@JsonProperty("Department")
	String department;

	@NotEmpty(message = "Email_Address cannot be Empty")
	@JsonProperty("Email_Address")
	String email_address;

	@JsonProperty("Employment_Type_in_Offer_Form")
	String employment_type_in_offer_form;

	@NotEmpty(message = "Function_Code cannot be Empty")
	@JsonProperty("Function_Code")
	String function_code;

	@NotEmpty(message = "GID cannot be Empty")
	@JsonProperty("GID")
	String gid;

	@JsonProperty("Intercompany")
	String intercompany;

	@NotEmpty(message = "Is_the_employee's_cost_split cannot be Empty")
	@JsonProperty("Is_the_employee's_cost_split?")
	String is_the_employees_cost_split;

	@JsonProperty("Is_the_employee_fully_charged_to_another_department(s)?")
	String is_the_employee_fully_charged;

	@NotEmpty(message = "Job Title cannot be Empty")
	@JsonProperty("Job_Title")
	String job_title;

	@JsonProperty("Notice_Period")
	String notice_period;

	@JsonProperty("Notice_Period_Unit")
	String notice_period_unit;

	@NotEmpty(message = "Salary_Basis_in_Offer_Form cannot be Empty")
	@JsonProperty("Salary_Basis_in_Offer_Form")
	String salary_basis_in_offer_form;

	@JsonProperty("Payroll")
	String payroll;

	@JsonProperty("Person_ID")
	String person_id;

	@JsonProperty("Person_Type")
	String person_type;

	@JsonProperty("Post_Code")
	String post_code;

	@JsonProperty("Probation_Period")
	String probation_period;

	@JsonProperty("Probation_Period_Unit")
	String probation_period_unit;

	@JsonProperty("RCS_Grade")
	String rcs_grade;

	@JsonProperty("Salary_Amount")
	String salary_amount;

	@JsonProperty("Salary_Currency")
	String salary_currency;

	@JsonProperty("Salary_Period")
	String salary_period;

	@JsonProperty("Sex")
	String sex;

	@JsonProperty("Shift_Requirement")
	String shift_requirement;

	@JsonProperty("TalentLink_Record_ID")
	String talentlink_record_id;

	@NotEmpty(message = "Working_Hours cannot be Empty")
	@JsonProperty("Working_Hours")
	String working_hours;

	@NotEmpty(message = "Working_Hours_Frequency cannot be Empty")
	@JsonProperty("Working_Hours_Frequency")
	String working_hours_frequency;

	//@NotEmpty(message = "myHR_Position_Code cannot be Empty")
	@JsonProperty("myHR_Position_Code")
	String myhr_position_code;

	@JsonProperty("myHR Person Number")
	String myHr_Person_Number;

	@JsonProperty("Offer Withrawn")
	String offerWithdrawn;
	
	@JsonProperty("Time and Attendance Payrule")
	String timeAndAttendance;

	@JsonIgnore
	String application_status;

	public String getAddress_type() {
		return address_type;
	}

	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}

	public String getAnalysis() {
		return analysis;
	}

	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	public String getCareer_level_for_job_posting() {
		return career_level_for_job_posting;
	}

	public void setCareer_level_for_job_posting(String career_level_for_job_posting) {
		this.career_level_for_job_posting = career_level_for_job_posting;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getContact_phone_number() {
		return contact_phone_number;
	}

	public void setContact_phone_number(String contact_phone_number) {
		this.contact_phone_number = contact_phone_number;
	}

	public String getContract_end_date() {
		return contract_end_date;
	}

	public void setContract_end_date(String contract_end_date) {
		this.contract_end_date = contract_end_date;
	}

	public String getContract_start_date_from_offer_form() {
		return contract_start_date_from_offer_form;
	}

	public void setContract_start_date_from_offer_form(String contract_start_date_from_offer_form) {
		this.contract_start_date_from_offer_form = contract_start_date_from_offer_form;
	}

	public String getContract_type() {
		return contract_type;
	}

	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}

	public String getContract_type_in_offer_form() {
		return contract_type_in_offer_form;
	}

	public void setContract_type_in_offer_form(String contract_type_in_offer_form) {
		this.contract_type_in_offer_form = contract_type_in_offer_form;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry_of_birth() {
		return country_of_birth;
	}

	public void setCountry_of_birth(String country_of_birth) {
		this.country_of_birth = country_of_birth;
	}

	public String getDsc_job_code() {
		return dsc_job_code;
	}

	public void setDsc_job_code(String dsc_job_code) {
		this.dsc_job_code = dsc_job_code;
	}

	public String getDsc_location_code() {
		return dsc_location_code;
	}

	public void setDsc_location_code(String dsc_location_code) {
		this.dsc_location_code = dsc_location_code;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getWorking_from_home() {
		return working_from_home;
	}

	public void setWorking_from_home(String working_from_home) {
		this.working_from_home = working_from_home;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getEmployment_type_in_offer_form() {
		return employment_type_in_offer_form;
	}

	public void setEmployment_type_in_offer_form(String employment_type_in_offer_form) {
		this.employment_type_in_offer_form = employment_type_in_offer_form;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getFunction_code() {
		return function_code;
	}

	public void setFunction_code(String function_code) {
		this.function_code = function_code;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getIntercompany() {
		return intercompany;
	}

	public void setIntercompany(String intercompany) {
		this.intercompany = intercompany;
	}

	public String getIs_the_employees_cost_split() {
		return is_the_employees_cost_split;
	}

	public void setIs_the_employees_cost_split(String is_the_employees_cost_split) {
		this.is_the_employees_cost_split = is_the_employees_cost_split;
	}

	public String getIs_the_employee_fully_charged() {
		return is_the_employee_fully_charged;
	}

	public void setIs_the_employee_fully_charged(String is_the_employee_fully_charged_to_another_department) {
		this.is_the_employee_fully_charged = is_the_employee_fully_charged_to_another_department;
	}

	public String getSalary_basis_in_offer_form() {
		return salary_basis_in_offer_form;
	}

	public void setSalary_basis_in_offer_form(String salary_basis_in_offer_form) {
		this.salary_basis_in_offer_form = salary_basis_in_offer_form;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getLegal_employer() {
		return legal_employer;
	}

	public void setLegal_employer(String legal_employer) {
		this.legal_employer = legal_employer;
	}

	public String getLine_manager() {
		return line_manager;
	}

	public void setLine_manager(String line_manager) {
		this.line_manager = line_manager;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getNotice_period() {
		return notice_period;
	}

	public void setNotice_period(String notice_period) {
		this.notice_period = notice_period;
	}

	public String getNotice_period_unit() {
		return notice_period_unit;
	}

	public void setNotice_period_unit(String notice_period_unit) {
		this.notice_period_unit = notice_period_unit;
	}

	public String getPayroll() {
		return payroll;
	}

	public void setPayroll(String payroll) {
		this.payroll = payroll;
	}

	public String getPerson_id() {
		return person_id;
	}

	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}

	public String getPerson_type() {
		return person_type;
	}

	public void setPerson_type(String person_type) {
		this.person_type = person_type;
	}

	public String getPost_code() {
		return post_code;
	}

	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}

	public String getPreferred_name() {
		return preferred_name;
	}

	public void setPreferred_name(String preferred_name) {
		this.preferred_name = preferred_name;
	}

	public String getProbation_period() {
		return probation_period;
	}

	public void setProbation_period(String probation_period) {
		this.probation_period = probation_period;
	}

	public String getProbation_period_unit() {
		return probation_period_unit;
	}

	public void setProbation_period_unit(String probation_period_unit) {
		this.probation_period_unit = probation_period_unit;
	}

	public String getRcs_grade() {
		return rcs_grade;
	}

	public void setRcs_grade(String rcs_grade) {
		this.rcs_grade = rcs_grade;
	}

	public String getSalary_amount() {
		return salary_amount;
	}

	public void setSalary_amount(String salary_amount) {
		this.salary_amount = salary_amount;
	}

	public String getSalary_currency() {
		return salary_currency;
	}

	public void setSalary_currency(String salary_currency) {
		this.salary_currency = salary_currency;
	}

	public String getSalary_period() {
		return salary_period;
	}

	public void setSalary_period(String salary_period) {
		this.salary_period = salary_period;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getShift_requirement() {
		return shift_requirement;
	}

	public void setShift_requirement(String shift_requirement) {
		this.shift_requirement = shift_requirement;
	}

	public String getTalentlink_record_id() {
		return talentlink_record_id;
	}

	public void setTalentlink_record_id(String talentlink_record_id) {
		this.talentlink_record_id = talentlink_record_id;
	}

	public String getWorking_hours() {
		return working_hours;
	}

	public void setWorking_hours(String working_hours) {
		this.working_hours = working_hours;
	}

	public String getWorking_hours_frequency() {
		return working_hours_frequency;
	}

	public void setWorking_hours_frequency(String working_hours_frequency) {
		this.working_hours_frequency = working_hours_frequency;
	}

	public String getMyhr_position_code() {
		return myhr_position_code;
	}

	public void setMyhr_position_code(String myhr_position_code) {
		this.myhr_position_code = myhr_position_code;
	}

	public String getMyHr_Person_Number() {
		return myHr_Person_Number;
	}

	public void setMyHr_Person_Number(String myHr_Person_Number) {
		this.myHr_Person_Number = myHr_Person_Number;
	}

	public String getOfferWithdrawn() {
		return offerWithdrawn;
	}

	public void setOfferWithdrawn(String offerWithdrawn) {
		this.offerWithdrawn = offerWithdrawn;
	}

	public String getApplication_status() {
		return application_status;
	}

	public void setApplication_status(String application_status) {
		this.application_status = application_status;
	}

	public String getTimeAndAttendance() {
		return timeAndAttendance;
	}

	public void setTimeAndAttendance(String timeAndAttendance) {
		this.timeAndAttendance = timeAndAttendance;
	}

}
