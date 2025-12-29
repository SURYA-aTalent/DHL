package com.dhl.dhltalentlinkapp.pojo;

public class LinkUnlinkDetails {

	private String file_name;
	private String file_date;
	private String from_field_name;
	private String from_field_value;
	private String from_field_value_id;
	private String to_field_name;
	private String to_field_value;
	private String to_field_value_id;
	private String status;
	private String linkOrUnlinkStatus;
	
	
	
	public String getFrom_field_name() {
		return from_field_name;
	}
	public void setFrom_field_name(String from_field_name) {
		this.from_field_name = from_field_name;
	}
	public String getFrom_field_value() {
		return from_field_value;
	}
	public void setFrom_field_value(String from_field_value) {
		this.from_field_value = from_field_value;
	}
	public String getFrom_field_value_id() {
		return from_field_value_id;
	}
	public void setFrom_field_value_id(String from_field_value_id) {
		this.from_field_value_id = from_field_value_id;
	}
	public String getTo_field_name() {
		return to_field_name;
	}
	public void setTo_field_name(String to_field_name) {
		this.to_field_name = to_field_name;
	}
	public String getTo_field_value() {
		return to_field_value;
	}
	public void setTo_field_value(String to_field_value) {
		this.to_field_value = to_field_value;
	}
	public String getTo_field_value_id() {
		return to_field_value_id;
	}
	public void setTo_field_value_id(String to_field_value_id) {
		this.to_field_value_id = to_field_value_id;
	}
	public String getLinkOrUnlinkStatus() {
		return linkOrUnlinkStatus;
	}
	public void setLinkOrUnlinkStatus(String linkOrUnlink) {
		this.linkOrUnlinkStatus = linkOrUnlink;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_date() {
		return file_date;
	}
	public void setFile_date(String file_date) {
		this.file_date = file_date;
	}
	@Override
	public String toString() {
		return "LinkUnlinkDetails [from_field_name=" + from_field_name + ", from_field_value=" + from_field_value
				+ ", from_field_value_id=" + from_field_value_id + ", to_field_name=" + to_field_name
				+ ", to_field_value=" + to_field_value + ", to_field_value_id=" + to_field_value_id + ", linkOrUnlink="
				+ linkOrUnlinkStatus + ", fileName=" + file_name + ", fileDate=" + file_date + ", status=" + status + "]";
	}
	
}
