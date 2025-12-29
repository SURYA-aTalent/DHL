package com.dhl.dhltalentlinkapp.outbound.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class UpdateGidDto implements Serializable {

	@NotEmpty
	String applicantId;

	@NotEmpty
	String gid;

	public String getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

}
