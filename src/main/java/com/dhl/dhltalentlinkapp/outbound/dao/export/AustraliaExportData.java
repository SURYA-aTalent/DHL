package com.dhl.dhltalentlinkapp.outbound.dao.export;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "first_name", "middle_name", "last_name", "preferred_name", "date_of_birth", "country_of_birth",
		"citizenship", "address_type", "address_1", "address_2", "address_3", "country", "post_code", "state", "suburb",
		"contact_phone_number", "email_address", "national_identifier", "sex", "gid", "person_id", "myhr_position_code",
		"dsc_job_code", "job_title", "dsc_location_code", "working_from_home", "department", "legal_employer",
		"contract_type", "working_hours", "working_hours_frequency", "contract_end_date",
		"employment_type_in_offer_form", "contract_type_in_offer_form", "career_level_for_job_posting", "rcs_grade",
		"shift_requirement", "line_manager", "contract_start_date_from_offer_form", "is_the_employee_fully_charged",
		"function_code", "analysis", "intercompany", "person_type", "is_the_employees_cost_split",
		"salary_basis_in_offer_form", "salary_amount", "salary_currency", "salary_period", "payroll",
		"talentlink_record_id", "probation_period", "probation_period_unit", "notice_period", "notice_period_unit",
		"applicable_enterprise_agreement","myHr_Person_Number","offerWithdrawn","timeAndAttendance" })


public class AustraliaExportData extends ExportData {

	@NotEmpty(message = "Address_1 cannot be Empty")
	@JsonProperty("Address_1")
	String address_1;

	@JsonProperty("Address_2")
	String address_2;

	@JsonProperty("Address_3")
	String address_3;

	@JsonProperty("State")
	String state;

	@JsonProperty("Suburb")
	String suburb;

	//@NotEmpty(message = "Applicable_Enterprise_Agreement cannot be Empty")
	@JsonProperty("Applicable_Enterprise_Agreement")
	String applicable_enterprise_agreement;

	//@NotEmpty(message = "Tax File Number cannot be Empty")
	@JsonProperty("Tax_File_Number ")
	String national_identifier;	
	

	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}

	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}

	public String getAddress_3() {
		return address_3;
	}

	public void setAddress_3(String address_3) {
		this.address_3 = address_3;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getApplicable_enterprise_agreement() {
		return applicable_enterprise_agreement;
	}

	public void setApplicable_enterprise_agreement(String applicable_enterprise_agreement) {
		this.applicable_enterprise_agreement = applicable_enterprise_agreement;
	}

	public String getNational_identifier() {
		return national_identifier;
	}

	public void setNational_identifier(String national_identifier) {
		this.national_identifier = national_identifier;
	}

	@Override
	public String toString() {
		return "AustraliaExportData [address_1=" + address_1 + ", address_2=" + address_2 + ", address_3=" + address_3
				+ ", state=" + state + ", suburb=" + suburb + ", applicable_enterprise_agreement="
				+ applicable_enterprise_agreement + ", national_identifier=" + national_identifier + ", first_name="
				+ first_name + ", last_name=" + last_name + ", middle_name=" + middle_name + ", preferred_name="
				+ preferred_name + ", legal_employer=" + legal_employer + ", line_manager=" + line_manager
				+ ", address_type=" + address_type + ", analysis=" + analysis + ", career_level_for_job_posting="
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
				+ ", myhr_position_code=" + myhr_position_code + "]";
	}

}
