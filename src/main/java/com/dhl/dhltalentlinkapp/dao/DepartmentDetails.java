package com.dhl.dhltalentlinkapp.dao;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class DepartmentDetails extends FileDetails{

	String legalEntity;
	long legalEntityValueId;

	@NotEmpty(message = "Department Name cannot be Empty")
	String departmentName;
	long departmentNameValueId;
	
	@NotEmpty(message = "Department ID cannot be Empty")
	String departmentId;
	long departmentIdValueId;

	String orgUnit;
	long orgUnitValueId;

	String locationCode;
	long locationCodeValueId;

	String deptCostString;
	long deptCostStringValueId;
	
	String sector;
	long sectorValueId;
	
	String locationName;
	long locationNameValueId;
	
	String globalLocationName;
	long globalLocationNameValueId;
	
	String facilityId;
	long facilityIdValueId;
	
	String country;
	long countryValueId;
	

	@NotEmpty(message = "Active Status cannot be Empty")
	@Pattern(regexp ="(yes|no|YES|NO|Yes|No)")
	String active;

	public String getLegalEntity() {
		return legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getOrgUnit() {
		return orgUnit;
	}

	public void setOrgUnit(String orgUnit) {
		this.orgUnit = orgUnit;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getDeptCostString() {
		return deptCostString;
	}

	public void setDeptCostString(String deptCostString) {
		this.deptCostString = deptCostString;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public long getLegalEntityValueId() {
		return legalEntityValueId;
	}

	public void setLegalEntityValueId(long legalEntityValueId) {
		this.legalEntityValueId = legalEntityValueId;
	}

	public long getDepartmentNameValueId() {
		return departmentNameValueId;
	}

	public void setDepartmentNameValueId(long departmentNameValueId) {
		this.departmentNameValueId = departmentNameValueId;
	}

	public long getOrgUnitValueId() {
		return orgUnitValueId;
	}

	public void setOrgUnitValueId(long orgUnitValueId) {
		this.orgUnitValueId = orgUnitValueId;
	}

	public long getLocationCodeValueId() {
		return locationCodeValueId;
	}

	public void setLocationCodeValueId(long locationCodeValueId) {
		this.locationCodeValueId = locationCodeValueId;
	}

	public long getDeptCostStringValueId() {
		return deptCostStringValueId;
	}

	public void setDeptCostStringValueId(long deptCostStringValueId) {
		this.deptCostStringValueId = deptCostStringValueId;
	}

	public long getSectorValueId() {
		return sectorValueId;
	}

	public void setSectorValueId(long sectorValueId) {
		this.sectorValueId = sectorValueId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public long getDepartmentIdValueId() {
		return departmentIdValueId;
	}

	public void setDepartmentIdValueId(long departmentIdValueId) {
		this.departmentIdValueId = departmentIdValueId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public long getLocationNameValueId() {
		return locationNameValueId;
	}

	public void setLocationNameValueId(long locationNameValueId) {
		this.locationNameValueId = locationNameValueId;
	}

	public String getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}

	public long getFacilityIdValueId() {
		return facilityIdValueId;
	}

	public void setFacilityIdValueId(long facilityIdValueId) {
		this.facilityIdValueId = facilityIdValueId;
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

	public String getGlobalLocationName() {
		return globalLocationName;
	}

	public void setGlobalLocationName(String globalLocationName) {
		this.globalLocationName = globalLocationName;
	}

	public long getGlobalLocationNameValueId() {
		return globalLocationNameValueId;
	}

	public void setGlobalLocationNameValueId(long globalLocationNameValueId) {
		this.globalLocationNameValueId = globalLocationNameValueId;
	}
	

}
