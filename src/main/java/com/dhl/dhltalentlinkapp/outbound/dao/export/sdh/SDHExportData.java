package com.dhl.dhltalentlinkapp.outbound.dao.export.sdh;

import javax.validation.constraints.NotEmpty;

import com.dhl.dhltalentlinkapp.outbound.dao.export.Data;

public class SDHExportData implements Data {

	String gid;

	@NotEmpty(message = "First_Name cannot be Empty")
	String FirstName;

	@NotEmpty(message = "Last_Name cannot be Empty")
	String LastName;

	@NotEmpty(message = "Date_Of_Birth cannot be Empty")	
	String DateofBirth;

	@NotEmpty(message = "System Person Type cannot be Empty")
	String SystemPersonType;

	@NotEmpty(message = "User Person_Type cannot be Empty")	
	String ProposedUserPersonType;

	// @NotEmpty(message = "Crest_Mr_Code cannot be Empty")
	// @XmlElement(name =  "Crest_Mr_Code")
	// String crest_mr_code;
	@NotEmpty(message = "CrestERCode cannot be Empty")	
	String CrestERCode;

	@NotEmpty(message = "Assignment_Status cannot be Empty")
	String AssignmentStatusTypeCode;

	@NotEmpty(message = "Legal_Employer Code cannot be Empty")
	String LegalEmployerCode;

	@NotEmpty(message = "Global_Job_Code cannot be Empty")
	String GlobalJobCode;

	@NotEmpty(message = "PersonManagerType cannot be Empty")
	String PersonManagerType;

	@NotEmpty(message = "PersonManagerExternalIdentifierNumber cannot be Empty")
	String PersonManagerExternalIdentifierNumber;

	@NotEmpty(message = "GlobalDepartmentCode cannot be Empty")
	String GlobalDepartmentCode;

	@NotEmpty(message = "BusinessUnitName cannot be Empty")
	String BusinessUnitName;

	@NotEmpty(message = "LocalSystem cannot be Empty")
	String LocalSystem;

	@NotEmpty(message = "ProjectedStartDate cannot be Empty")
	String ProjectedStartDate;

	@NotEmpty(message = "RelationshipDateStart cannot be Empty")
	String RelationshipDateStart;

	//@NotEmpty(message = "PersonEffectiveStartDate cannot be Empty")

	String PersonEffectiveStartDate;

	////@NotEmpty(message = "LocalLocationCode cannot be Empty")
	String LocalLocationCode;

	@NotEmpty(message = "PersonNumber cannot be Empty")
	String PersonNumber;

	@NotEmpty(message = "Global_RCS_Grade cannot be Empty")
	String GradeCode;

	@NotEmpty(message = "BusinessTitle cannot be Empty")	
	String BusinessTitle;

	@NotEmpty(message = "CostCenter cannot be Empty")
	String CostCenter;

	@NotEmpty(message = "ActionCode cannot be Empty")
	String ActionCode;

	@NotEmpty(message = "ReasonCode cannot be Empty")
	String ReasonCode;

	@NotEmpty(message = "EmailType cannot be Empty")
	String EmailType;

	@NotEmpty(message = "EmailAddress cannot be Empty")
	String EmailAddress;
	
	@NotEmpty(message = "LocalAction cannot be Empty")
	String LocalAction;
	
	@NotEmpty(message = "LocalActionReason cannot be Empty")
	String LocalActionReason;
	
	//@NotEmpty(message = "KnownAs cannot be Empty")
	String KnownAs;
	
	//@NotEmpty(message = "EmailAccountRequired cannot be Empty")
	String EmailAccountRequired;
	

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDateofBirth() {
		return DateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		DateofBirth = dateofBirth;
	}

	public String getSystemPersonType() {
		return SystemPersonType;
	}

	public void setSystemPersonType(String systemPersonType) {
		SystemPersonType = systemPersonType;
	}

	public String getProposedUserPersonType() {
		return ProposedUserPersonType;
	}

	public void setProposedUserPersonType(String proposedUserPersonType) {
		ProposedUserPersonType = proposedUserPersonType;
	}

	public String getCrestERCode() {
		return CrestERCode;
	}

	public void setCrestERCode(String crestERCode) {
		CrestERCode = crestERCode;
	}

	public String getAssignmentStatusTypeCode() {
		return AssignmentStatusTypeCode;
	}

	public void setAssignmentStatusTypeCode(String assignmentStatusTypeCode) {
		AssignmentStatusTypeCode = assignmentStatusTypeCode;
	}

	public String getLegalEmployerCode() {
		return LegalEmployerCode;
	}

	public void setLegalEmployerCode(String legalEmployerCode) {
		LegalEmployerCode = legalEmployerCode;
	}

	public String getGlobalJobCode() {
		return GlobalJobCode;
	}

	public void setGlobalJobCode(String globalJobCode) {
		GlobalJobCode = globalJobCode;
	}

	public String getPersonManagerType() {
		return PersonManagerType;
	}

	public void setPersonManagerType(String personManagerType) {
		PersonManagerType = personManagerType;
	}

	public String getPersonManagerExternalIdentifierNumber() {
		return PersonManagerExternalIdentifierNumber;
	}

	public void setPersonManagerExternalIdentifierNumber(String personManagerExternalIdentifierNumber) {
		PersonManagerExternalIdentifierNumber = personManagerExternalIdentifierNumber;
	}

	public String getGlobalDepartmentCode() {
		return GlobalDepartmentCode;
	}

	public void setGlobalDepartmentCode(String globalDepartmentCode) {
		GlobalDepartmentCode = globalDepartmentCode;
	}

	public String getBusinessUnitName() {
		return BusinessUnitName;
	}

	public void setBusinessUnitName(String businessUnitName) {
		BusinessUnitName = businessUnitName;
	}

	public String getLocalSystem() {
		return LocalSystem;
	}

	public void setLocalSystem(String localSystem) {
		LocalSystem = localSystem;
	}

	public String getProjectedStartDate() {
		return ProjectedStartDate;
	}

	public void setProjectedStartDate(String projectedStartDate) {
		ProjectedStartDate = projectedStartDate;
	}

	public String getRelationshipDateStart() {
		return RelationshipDateStart;
	}

	public void setRelationshipDateStart(String relationshipDateStart) {
		RelationshipDateStart = relationshipDateStart;
	}

	public String getPersonEffectiveStartDate() {
		return PersonEffectiveStartDate;
	}

	public void setPersonEffectiveStartDate(String personEffectiveStartDate) {
		PersonEffectiveStartDate = personEffectiveStartDate;
	}

	public String getLocalLocationCode() {
		return LocalLocationCode;
	}

	public void setLocalLocationCode(String localLocationCode) {
		LocalLocationCode = localLocationCode;
	}

	public String getPersonNumber() {
		return PersonNumber;
	}

	public void setPersonNumber(String personNumber) {
		PersonNumber = personNumber;
	}

	public String getGradeCode() {
		return GradeCode;
	}

	public void setGradeCode(String gradeCode) {
		GradeCode = gradeCode;
	}

	public String getBusinessTitle() {
		return BusinessTitle;
	}

	public void setBusinessTitle(String businessTitle) {
		BusinessTitle = businessTitle;
	}

	public String getCostCenter() {
		return CostCenter;
	}

	public void setCostCenter(String costCenter) {
		CostCenter = costCenter;
	}

	public String getActionCode() {
		return ActionCode;
	}

	public void setActionCode(String actionCode) {
		ActionCode = actionCode;
	}

	public String getReasonCode() {
		return ReasonCode;
	}

	public void setReasonCode(String reasonCode) {
		ReasonCode = reasonCode;
	}

	public String getEmailType() {
		return EmailType;
	}

	public void setEmailType(String emailType) {
		EmailType = emailType;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public String getLocalAction() {
		return LocalAction;
	}

	public void setLocalAction(String localAction) {
		LocalAction = localAction;
	}

	public String getLocalActionReason() {
		return LocalActionReason;
	}

	public void setLocalActionReason(String localActionReason) {
		LocalActionReason = localActionReason;
	}

	public String getKnownAs() {
		return KnownAs;
	}

	public void setKnownAs(String knownAs) {
		KnownAs = knownAs;
	}

	public String getEmailAccountRequired() {
		return EmailAccountRequired;
	}

	public void setEmailAccountRequired(String emailAccountRequired) {
		EmailAccountRequired = emailAccountRequired;
	}

	@Override
	public String toString() {
		return "SDHExportData [gid=" + gid + ", FirstName=" + FirstName + ", LastName=" + LastName + ", DateofBirth="
				+ DateofBirth + ", SystemPersonType=" + SystemPersonType + ", ProposedUserPersonType="
				+ ProposedUserPersonType + ", CrestERCode=" + CrestERCode + ", AssignmentStatusTypeCode="
				+ AssignmentStatusTypeCode + ", LegalEmployerCode=" + LegalEmployerCode + ", GlobalJobCode="
				+ GlobalJobCode + ", PersonManagerType=" + PersonManagerType
				+ ", PersonManagerExternalIdentifierNumber=" + PersonManagerExternalIdentifierNumber
				+ ", GlobalDepartmentCode=" + GlobalDepartmentCode + ", BusinessUnitName=" + BusinessUnitName
				+ ", LocalSystem=" + LocalSystem + ", ProjectedStartDate=" + ProjectedStartDate
				+ ", RelationshipDateStart=" + RelationshipDateStart + ", PersonEffectiveStartDate="
				+ PersonEffectiveStartDate + ", LocalLocationCode=" + LocalLocationCode + ", PersonNumber="
				+ PersonNumber + ", GradeCode=" + GradeCode + ", BusinessTitle=" + BusinessTitle + ", CostCenter="
				+ CostCenter + ", ActionCode=" + ActionCode + ", ReasonCode=" + ReasonCode + ", EmailType=" + EmailType
				+ ", EmailAddress=" + EmailAddress + ", LocalAction=" + LocalAction + ", LocalActionReason="
				+ LocalActionReason + ", KnownAs=" + KnownAs + ", EmailAccountRequired=" + EmailAccountRequired + "]";
	}

	



}
