package com.dhl.dhltalentlinkapp.pojo;

public class LovDetails {

	String lovName;
	long lovId;
	long hiermemberid;

	public LovDetails(String lovName, long lovId, long hiermemberid) {
		this.lovId = lovId;
		this.lovName = lovName;
		this.hiermemberid = hiermemberid;
	}

	public String getLovName() {
		return lovName;
	}

	public void setLovName(String lovName) {
		this.lovName = lovName;
	}

	public long getLovId() {
		return lovId;
	}

	public void setLovId(long lovId) {
		this.lovId = lovId;
	}

	public long getHiermemberid() {
		return hiermemberid;
	}

	public void setHiermemberid(long hiermemberid) {
		this.hiermemberid = hiermemberid;
	}

}
