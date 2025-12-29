package com.dhl.dhltalentlinkapp.pojo;

public class DeptUpdateResp {

	boolean isUpdated;
	long deptIdValueid;
	long deptNameValueId;
	String currentDeptNameValue;
	boolean isValuePresent;

	public boolean isUpdated() {
		return isUpdated;
	}

	public void setUpdated(boolean isUpdated) {
		this.isUpdated = isUpdated;
	}

	public long getDeptIdValueid() {
		return deptIdValueid;
	}

	public void setDeptIdValueid(long deptIdValueid) {
		this.deptIdValueid = deptIdValueid;
	}

	public long getDeptNameValueId() {
		return deptNameValueId;
	}

	public void setDeptNameValueId(long deptNameValueId) {
		this.deptNameValueId = deptNameValueId;
	}

	public boolean isValuePresent() {
		return isValuePresent;
	}

	public void setValuePresent(boolean isValuePresent) {
		this.isValuePresent = isValuePresent;
	}

	public String getCurrentDeptNameValue() {
		return currentDeptNameValue;
	}

	public void setCurrentDeptNameValue(String currentDeptNameValue) {
		this.currentDeptNameValue = currentDeptNameValue;
	}

	@Override
	public String toString() {
		return "DeptUpdateResp [isUpdated=" + isUpdated + ", deptIdValueid=" + deptIdValueid + ", deptNameValueId="
				+ deptNameValueId + ", currentDeptNameValue=" + currentDeptNameValue + ", isValuePresent="
				+ isValuePresent + "]";
	}		

}
