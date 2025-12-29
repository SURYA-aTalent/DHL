package com.dhl.dhltalentlinkapp.dao;

import javax.validation.constraints.NotEmpty;

public class JobDetails extends FileDetails {

	@NotEmpty(message = "DSC Global Job Code cannot be Empty")
	String dscGlobalJobCode;
	long dscGlobalJobCodeValueId;

	String dpdhlJobFunction;
	long dpdhlJobFunctionValueId;

	String dpdhlJobFamily;
	long dpdhlJobFamilyValueId;

	String dscGlobalJobName;
	long dscGlobalJobNameValueId;

	String careerStream;
	long careerStreamValueId;

	String careerLevel;
	long careerLevelValueId;

	String dpdhlJobCode;
	long dpdhlJobCodeValueId;


	@NotEmpty(message = "Active Status cannot be Empty")
	String activeStatus;

	public String getDscGlobalJobCode() {
		return dscGlobalJobCode;
	}
	public void setDscGlobalJobCode(String dscGlobalJobCode) {
		this.dscGlobalJobCode = dscGlobalJobCode;
	}
	
	public String getDpdhlJobFunction() {
		return dpdhlJobFunction;
	}
	public void setDpdhlJobFunction(String dpdhlJobFunction) {
		this.dpdhlJobFunction = dpdhlJobFunction;
	}
	public String getDpdhlJobFamily() {
		return dpdhlJobFamily;
	}
	public void setDpdhlJobFamily(String dpdhlJobFamily) {
		this.dpdhlJobFamily = dpdhlJobFamily;
	}
	public String getDscGlobalJobName() {
		return dscGlobalJobName;
	}
	public void setDscGlobalJobName(String dscGlobalJobName) {
		this.dscGlobalJobName = dscGlobalJobName;
	}
	public String getCareerStream() {
		return careerStream;
	}
	public void setCareerStream(String careerStream) {
		this.careerStream = careerStream;
	}
	public String getCareerLevel() {
		return careerLevel;
	}
	public void setCareerLevel(String careerLevel) {
		this.careerLevel = careerLevel;
	}
	public String getDpdhlJobCode() {
		return dpdhlJobCode;
	}
	public void setDpdhlJobCode(String dpdhlJobCode) {
		this.dpdhlJobCode = dpdhlJobCode;
	}
	
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	public long getDscGlobalJobCodeValueId() {
		return dscGlobalJobCodeValueId;
	}
	public void setDscGlobalJobCodeValueId(long dscGlobalJobCodeValueId) {
		this.dscGlobalJobCodeValueId = dscGlobalJobCodeValueId;
	}
	public long getDpdhlJobFunctionValueId() {
		return dpdhlJobFunctionValueId;
	}
	public void setDpdhlJobFunctionValueId(long dpdhlJobFunctionValueId) {
		this.dpdhlJobFunctionValueId = dpdhlJobFunctionValueId;
	}
	public long getDpdhlJobFamilyValueId() {
		return dpdhlJobFamilyValueId;
	}
	public void setDpdhlJobFamilyValueId(long dpdhlJobFamilyValueId) {
		this.dpdhlJobFamilyValueId = dpdhlJobFamilyValueId;
	}
	public long getDscGlobalJobNameValueId() {
		return dscGlobalJobNameValueId;
	}
	public void setDscGlobalJobNameValueId(long dscGlobalJobNameValueId) {
		this.dscGlobalJobNameValueId = dscGlobalJobNameValueId;
	}
	public long getCareerStreamValueId() {
		return careerStreamValueId;
	}
	public void setCareerStreamValueId(long careerStreamValueId) {
		this.careerStreamValueId = careerStreamValueId;
	}
	public long getCareerLevelValueId() {
		return careerLevelValueId;
	}
	public void setCareerLevelValueId(long careerLevelValueId) {
		this.careerLevelValueId = careerLevelValueId;
	}
	public long getDpdhlJobCodeValueId() {
		return dpdhlJobCodeValueId;
	}
	public void setDpdhlJobCodeValueId(long dpdhlJobCodeValueId) {
		this.dpdhlJobCodeValueId = dpdhlJobCodeValueId;
	}
	
	@Override
	public String toString() {
		return "JobDetails [dscGlobalJobCode=" + dscGlobalJobCode + ", dscGlobalJobCodeValueId="
				+ dscGlobalJobCodeValueId + ", dpdhlJobFunction=" + dpdhlJobFunction + ", dpdhlJobFunctionValueId="
				+ dpdhlJobFunctionValueId + ", dpdhlJobFamily=" + dpdhlJobFamily + ", dpdhlJobFamilyValueId="
				+ dpdhlJobFamilyValueId + ", dscGlobalJobName=" + dscGlobalJobName + ", dscGlobalJobNameValueId="
				+ dscGlobalJobNameValueId + ", careerStream=" + careerStream + ", careerStreamValueId="
				+ careerStreamValueId + ", careerLevel=" + careerLevel + ", careerLevelValueId=" + careerLevelValueId
				+ ", dpdhlJobCode=" + dpdhlJobCode + ", dpdhlJobCodeValueId=" + dpdhlJobCodeValueId				
				+ ", activeStatus=" + activeStatus + "]";
	}

	
	
	
}
