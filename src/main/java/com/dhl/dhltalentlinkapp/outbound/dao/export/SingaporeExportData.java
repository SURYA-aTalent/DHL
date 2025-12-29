package com.dhl.dhltalentlinkapp.outbound.dao.export;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "first_name", "middle_name", "last_name", "preferred_name", "legal_name", "date_of_birth",
		"country_of_birth", "citizenship", "address_type", "country", "post_code", "block_or_house_number",
		"street_name", "level_unit_number", "building_name", "contact_phone_number", "email_address",
		"national_identifier", "sex", "ethnic_origin", "religion", "gid", "person_id", "myhr_position_code",
		"dsc_job_code", "job_title", "dsc_location_code", "working_from_home", "department", "legal_employer",
		"contract_type", "working_hours", "working_hours_frequency", "contract_end_date",
		"employment_type_in_offer_form", "contract_type_in_offer_form", "career_level_for_job_posting", "rcs_grade",
		"local_grade", "shift_requirement", "line_manager", "contract_start_date_from_offer_form",
		"is_the_employee_fully_charged", "function_code", "analysis", "intercompany", "person_type",
		"is_the_employees_cost_split", "salary_basis_in_offer_form", "salary_amount", "salary_currency",
		"salary_period", "payroll", "talentlink_record_id", "probation_period", "probation_period_unit",
		"notice_period", "notice_period_unit","myHr_Person_Number","offerWithdrawn","timeAndAttendance","singaporePermanentResident","fin" })

public class SingaporeExportData extends ExportData {

	@JsonProperty("Legal_Name")
	String legal_name;

	@JsonProperty("Block_or_House_Number")
	String block_or_house_number;

	@JsonProperty("Street_Name")
	String street_name;

	@JsonProperty("Level_Unit_Number")
	String level_unit_number;

	@JsonProperty("Building_Name")
	String building_name;

	@JsonProperty("Local_Grade")
	String local_grade;

	//@NotEmpty(message = "National_Identifier cannot be Empty")
	@JsonProperty("National_Identifier")
	String national_identifier;

	@JsonProperty("Ethnic_Origin")
	String ethnic_origin;

	@JsonProperty("Religion")
	String religion;
	
	@JsonProperty("Singapore Permanent Resident")
	String singaporePermanentResident;
	
	@JsonProperty("FIN")
	String fin;

	public String getLegal_name() {
		return legal_name;
	}

	public void setLegal_name(String legal_name) {
		this.legal_name = legal_name;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getLevel_unit_number() {
		return level_unit_number;
	}

	public void setLevel_unit_number(String level_unit_number) {
		this.level_unit_number = level_unit_number;
	}

	public String getBuilding_name() {
		return building_name;
	}

	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}

	public String getLocal_grade() {
		return local_grade;
	}

	public void setLocal_grade(String local_grade) {
		this.local_grade = local_grade;
	}

	public String getNational_identifier() {
		return national_identifier;
	}

	public void setNational_identifier(String national_identifier) {
		this.national_identifier = national_identifier;
	}

	public String getEthnic_origin() {
		return ethnic_origin;
	}

	public void setEthnic_origin(String ethnic_origin) {
		this.ethnic_origin = ethnic_origin;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getBlock_or_house_number() {
		return block_or_house_number;
	}

	public void setBlock_or_house_number(String block_or_house_number) {
		this.block_or_house_number = block_or_house_number;
	}

	public String getSingaporePermanentResident() {
		return singaporePermanentResident;
	}

	public void setSingaporePermanentResident(String singaporePermanentResident) {
		this.singaporePermanentResident = singaporePermanentResident;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	@Override
	public String toString() {
		return "SingaporeExportData [legal_name=" + legal_name + ", block_or_house_number=" + block_or_house_number
				+ ", street_name=" + street_name + ", level_unit_number=" + level_unit_number + ", building_name="
				+ building_name + ", local_grade=" + local_grade + ", national_identifier=" + national_identifier
				+ ", ethnic_origin=" + ethnic_origin + ", religion=" + religion + ", singaporePermanentResident="
				+ singaporePermanentResident + ", fin=" + fin + ", first_name=" + first_name + ", last_name="
				+ last_name + ", middle_name=" + middle_name + ", preferred_name=" + preferred_name
				+ ", legal_employer=" + legal_employer + ", line_manager=" + line_manager + ", address_type="
				+ address_type + ", analysis=" + analysis + ", career_level_for_job_posting="
				+ career_level_for_job_posting + ", citizenship=" + citizenship + ", contact_phone_number="
				+ contact_phone_number + ", contract_end_date=" + contract_end_date
				+ ", contract_start_date_from_offer_form=" + contract_start_date_from_offer_form + ", contract_type="
				+ contract_type + ", contract_type_in_offer_form=" + contract_type_in_offer_form + ", country="
				+ country + ", country_of_birth=" + country_of_birth + ", dsc_job_code=" + dsc_job_code
				+ ", dsc_location_code=" + dsc_location_code + ", date_of_birth=" + date_of_birth
				+ ", working_from_home=" + working_from_home + ", department=" + department + ", email_address="
				+ email_address + ", employment_type_in_offer_form=" + employment_type_in_offer_form
				+ ", function_code=" + function_code + ", gid=" + gid + ", intercompany=" + intercompany
				+ ", is_the_employees_cost_split=" + is_the_employees_cost_split + ", is_the_employee_fully_charged="
				+ is_the_employee_fully_charged + ", job_title=" + job_title + ", notice_period=" + notice_period
				+ ", notice_period_unit=" + notice_period_unit + ", salary_basis_in_offer_form="
				+ salary_basis_in_offer_form + ", payroll=" + payroll + ", person_id=" + person_id + ", person_type="
				+ person_type + ", post_code=" + post_code + ", probation_period=" + probation_period
				+ ", probation_period_unit=" + probation_period_unit + ", rcs_grade=" + rcs_grade + ", salary_amount="
				+ salary_amount + ", salary_currency=" + salary_currency + ", salary_period=" + salary_period + ", sex="
				+ sex + ", shift_requirement=" + shift_requirement + ", talentlink_record_id=" + talentlink_record_id
				+ ", working_hours=" + working_hours + ", working_hours_frequency=" + working_hours_frequency
				+ ", myhr_position_code=" + myhr_position_code + ", myHr_Person_Number=" + myHr_Person_Number
				+ ", offerWithdrawn=" + offerWithdrawn + ", timeAndAttendance=" + timeAndAttendance
				+ ", application_status=" + application_status + "]";
	}

	

}
