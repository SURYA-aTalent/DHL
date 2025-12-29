package com.dhl.dhltalentlinkapp.outbound.dto;

import java.io.Serializable;

public class UpdateGidResponseDto implements Serializable {

	String status;
	String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
