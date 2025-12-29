package com.dhl.dhltalentlinkapp.dao;

import javax.validation.constraints.NotEmpty;

public class PositionDetails extends FileDetails{

	@NotEmpty(message = "Position code cannot be Empty")
	String myhrPositionCode;
	
	long myhrPositionCodeValueId;

	String positionName;
	long positionNameValueId;

	//@NotEmpty(message = "Legal Entity cannot be Empty")
	String legalEntity;
	long legalEntityValueId;

	String dscGlobalJobCode;
	long dscGlobalJobCodeValueId;

	//String jobTemplateTitle;
	//long jobTemplateTitleValueId;

	String departmentName;
	long departmentNameValueId;

	String workHours;
	long workHoursValueId;

	String workHoursFrequency;
	long workHoursFrequencyValueId;

	String rcsGrade;
	long rcsGradeValueId;
	
	String country;
	long countryValueId;
	
	String dscglobaljobName;
	long dscglobaljobNameValueId;
	
	String position;
	long positionValueId;
	
	String localGrade;
	long localGradeValueId;
	
	String fullVsPartTime;
	long fullVsPartTimeValueId;
	
	String departmentFilterBy;
	long departmentFilterByValueId;
	
	

	@NotEmpty(message = "Active status cannot be Empty")
	String activeStatus;

	public String getMyhrPositionCode() {
		return myhrPositionCode;
	}

	public void setMyhrPositionCode(String myhrPositionCode) {
		this.myhrPositionCode = myhrPositionCode;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positinName) {
		this.positionName = positinName;
	}

	public String getLegalEntity() {
		return legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	public String getDscGlobalJobCode() {
		return dscGlobalJobCode;
	}

	public void setDscGlobalJobCode(String dscGlobalJobCode) {
		this.dscGlobalJobCode = dscGlobalJobCode;
	}

	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getWorkHours() {
		return workHours;
	}

	public void setWorkHours(String workHours) {
		this.workHours = workHours;
	}

	public String getWorkHoursFrequency() {
		return workHoursFrequency;
	}

	public void setWorkHoursFrequency(String workHoursFrequency) {
		this.workHoursFrequency = workHoursFrequency;
	}

	public String getRcsGrade() {
		return rcsGrade;
	}

	public void setRcsGrade(String rcsGrade) {
		this.rcsGrade = rcsGrade;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public long getMyhrPositionCodeValueId() {
		return myhrPositionCodeValueId;
	}

	public void setMyhrPositionCodeValueId(long myhrPositionCodeValueId) {
		this.myhrPositionCodeValueId = myhrPositionCodeValueId;
	}

	public long getPositionNameValueId() {
		return positionNameValueId;
	}

	public void setPositionNameValueId(long positionNameValueId) {
		this.positionNameValueId = positionNameValueId;
	}

	public long getLegalEntityValueId() {
		return legalEntityValueId;
	}

	public void setLegalEntityValueId(long legalEntityValueId) {
		this.legalEntityValueId = legalEntityValueId;
	}

	public long getDscGlobalJobCodeValueId() {
		return dscGlobalJobCodeValueId;
	}

	public void setDscGlobalJobCodeValueId(long dscGlobalJobCodeValueId) {
		this.dscGlobalJobCodeValueId = dscGlobalJobCodeValueId;
	}

	public long getDepartmentNameValueId() {
		return departmentNameValueId;
	}

	public void setDepartmentNameValueId(long departmentNameValueId) {
		this.departmentNameValueId = departmentNameValueId;
	}

	public long getWorkHoursValueId() {
		return workHoursValueId;
	}

	public void setWorkHoursValueId(long workHoursValueId) {
		this.workHoursValueId = workHoursValueId;
	}

	public long getWorkHoursFrequencyValueId() {
		return workHoursFrequencyValueId;
	}

	public void setWorkHoursFrequencyValueId(long workHoursFrequencyValueId) {
		this.workHoursFrequencyValueId = workHoursFrequencyValueId;
	}

	public long getRcsGradeValueId() {
		return rcsGradeValueId;
	}

	public void setRcsGradeValueId(long rcsGradeValueId) {
		this.rcsGradeValueId = rcsGradeValueId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getCountryValueId() {
		return countryValueId;
	}

	public void setCountryValueId(long countryValueId) {
		this.countryValueId = countryValueId;
	}

	public String getDscglobaljobName() {
		return dscglobaljobName;
	}

	public void setDscglobaljobName(String dscglobaljobName) {
		this.dscglobaljobName = dscglobaljobName;
	}

	public long getDscglobaljobNameValueId() {
		return dscglobaljobNameValueId;
	}

	public void setDscglobaljobNameValueId(long dscglobaljobNameValueId) {
		this.dscglobaljobNameValueId = dscglobaljobNameValueId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public long getPositionValueId() {
		return positionValueId;
	}

	public void setPositionValueId(long positionValueId) {
		this.positionValueId = positionValueId;
	}

	public String getLocalGrade() {
		return localGrade;
	}

	public void setLocalGrade(String localGrade) {
		this.localGrade = localGrade;
	}

	public long getLocalGradeValueId() {
		return localGradeValueId;
	}

	public void setLocalGradeValueId(long localGradeValueId) {
		this.localGradeValueId = localGradeValueId;
	}

	public String getFullVsPartTime() {
		return fullVsPartTime;
	}

	public void setFullVsPartTime(String fullVsPartTime) {
		this.fullVsPartTime = fullVsPartTime;
	}

	public long getFullVsPartTimeValueId() {
		return fullVsPartTimeValueId;
	}

	public void setFullVsPartTimeValueId(long fullVsPartTimeValueId) {
		this.fullVsPartTimeValueId = fullVsPartTimeValueId;
	}	

	public String getDepartmentFilterBy() {
		return departmentFilterBy;
	}

	public void setDepartmentFilterBy(String departmentFilterBy) {
		this.departmentFilterBy = departmentFilterBy;
	}

	public long getDepartmentFilterByValueId() {
		return departmentFilterByValueId;
	}

	public void setDepartmentFilterByValueId(long departmentFilterByValueId) {
		this.departmentFilterByValueId = departmentFilterByValueId;
	}

	@Override
	public String toString() {
		return "PositionDetails [myhrPositionCode=" + myhrPositionCode + ", myhrPositionCodeValueId="
				+ myhrPositionCodeValueId + ", positionName=" + positionName + ", positionNameValueId="
				+ positionNameValueId + ", legalEntity=" + legalEntity + ", legalEntityValueId=" + legalEntityValueId
				+ ", dscGlobalJobCode=" + dscGlobalJobCode + ", dscGlobalJobCodeValueId=" + dscGlobalJobCodeValueId
				+ ", departmentName=" + departmentName + ", departmentNameValueId=" + departmentNameValueId
				+ ", workHours=" + workHours + ", workHoursValueId=" + workHoursValueId + ", workHoursFrequency="
				+ workHoursFrequency + ", workHoursFrequencyValueId=" + workHoursFrequencyValueId + ", rcsGrade="
				+ rcsGrade + ", rcsGradeValueId=" + rcsGradeValueId + ", country=" + country + ", countryValueId="
				+ countryValueId + ", dscglobaljobName=" + dscglobaljobName + ", dscglobaljobNameValueId="
				+ dscglobaljobNameValueId + ", position=" + position + ", positionValueId=" + positionValueId
				+ ", localGrade=" + localGrade + ", localGradeValueId=" + localGradeValueId + ", fullVsPartTime="
				+ fullVsPartTime + ", fullVsPartTimeValueId=" + fullVsPartTimeValueId + ", activeStatus=" + activeStatus
				+ "]";
	}


}
