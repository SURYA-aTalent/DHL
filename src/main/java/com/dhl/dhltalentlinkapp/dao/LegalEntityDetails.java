package com.dhl.dhltalentlinkapp.dao;

import javax.validation.constraints.NotEmpty;

public class LegalEntityDetails extends FileDetails{

	@NotEmpty(message = "Legal Entity cannot be Empty")
	String legalEntity;
	long legalEntityValueId;
	
	@NotEmpty(message = "Country cannot be Empty")
	String country;
	long countryValueId;
	
	@NotEmpty(message = "Active Status cannot be Empty")
	String activeStatus;

	public String getLegalEntity() {
		return legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public long getLegalEntityValueId() {
		return legalEntityValueId;
	}

	public void setLegalEntityValueId(long legalEntityValueId) {
		this.legalEntityValueId = legalEntityValueId;
	}

	public long getCountryValueId() {
		return countryValueId;
	}

	public void setCountryValueId(long countryValueId) {
		this.countryValueId = countryValueId;
	}

	@Override
	public String toString() {
		return "LegalEntityDetails [legalEntity=" + legalEntity + ", legalEntityValueId=" + legalEntityValueId
				+ ", country=" + country + ", countryValueId=" + countryValueId + ", activeStatus=" + activeStatus
				+ "]";
	}

	

}
