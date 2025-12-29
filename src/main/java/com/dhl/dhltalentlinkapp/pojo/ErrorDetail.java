package com.dhl.dhltalentlinkapp.pojo;

public class ErrorDetail {

	private long Row_Number;
	private String Error_Message;
	
	public long getRow_Number() {
		return Row_Number;
	}
	public void setRow_Number(long row_Number) {
		Row_Number = row_Number;
	}
	public String getError_Message() {
		return Error_Message;
	}
	public void setError_Message(String error_Message) {
		Error_Message = error_Message;
	}
	@Override
	public String toString() {
		return "ErrorDetail [Row_Number=" + Row_Number + ", Error_Message=" + Error_Message + "]";
	}

}
