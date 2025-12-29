package com.dhl.dhltalentlinkapp.dao;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class ManagerDetails extends FileDetails{

	String gid;
	long gidValueId;

	@NotEmpty(message = "First Name cannot be Empty")
	String firstName;
	long firstNameValueId;

	@NotEmpty(message = "Last Name cannot be Empty")
	String lastName;
	long lastNameValueId;

	@NotEmpty(message = "Email Id cannot be Empty")
	@Email(message = "Email should be valid")
	String email;
	
	long emailValueId;

	String businessTitle;
	long businessTitleValueId;

	String country;
	long countryValueId;

	String timezone;
	long timezoneValueId;
	
	String source;
	
	boolean emailAsLoginFlag;
	
	String loginValue;

	@NotEmpty(message = "Active Status cannot be Empty")
	String activeStatus;
	long activeStatusValueId;
	
	long rowNumber;

	String password;
	
	String userType;
	
	
	long userId;
	
	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBusinessTitle() {
		return businessTitle;
	}

	public void setBusinessTitle(String businessTitle) {
		this.businessTitle = businessTitle;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public long getGidValueId() {
		return gidValueId;
	}

	public void setGidValueId(long gidValueId) {
		this.gidValueId = gidValueId;
	}

	public long getFirstNameValueId() {
		return firstNameValueId;
	}

	public void setFirstNameValueId(long firstNameValueId) {
		this.firstNameValueId = firstNameValueId;
	}

	public long getLastNameValueId() {
		return lastNameValueId;
	}

	public void setLastNameValueId(long lastNameValueId) {
		this.lastNameValueId = lastNameValueId;
	}

	public long getEmailValueId() {
		return emailValueId;
	}

	public void setEmailValueId(long emailValueId) {
		this.emailValueId = emailValueId;
	}

	public long getBusinessTitleValueId() {
		return businessTitleValueId;
	}

	public void setBusinessTitleValueId(long businessTitleValueId) {
		this.businessTitleValueId = businessTitleValueId;
	}

	public long getCountryValueId() {
		return countryValueId;
	}

	public void setCountryValueId(long countryValueId) {
		this.countryValueId = countryValueId;
	}

	public long getTimezoneValueId() {
		return timezoneValueId;
	}

	public void setTimezoneValueId(long timezoneValueId) {
		this.timezoneValueId = timezoneValueId;
	}

	public long getActiveStatusValueId() {
		return activeStatusValueId;
	}

	public void setActiveStatusValueId(long activeStatusValueId) {
		this.activeStatusValueId = activeStatusValueId;
	}

	
	public long getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(long rowNumber) {
		this.rowNumber = rowNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public boolean getEmailAsLoginFlag() {
		return emailAsLoginFlag;
	}

	public void setEmailAsLoginFlag(boolean emailAsLoginFlag) {
		this.emailAsLoginFlag = emailAsLoginFlag;
	}

	public String getLoginValue() {
		return loginValue;
	}

	public void setLoginValue(String loginValue) {
		this.loginValue = loginValue;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "ManagerDetails [gid=" + gid + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", businessTitle=" + businessTitle + ", country=" + country + ", timezone=" + timezone
				+ ", activeStatus=" + activeStatus + ", rowNumber=" + rowNumber + ", password=" + password + ", userId="
				+ userId + ", userType="
						+ userType + "]";
	}

	



	

}
