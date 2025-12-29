package com.dhl.dhltalentlinkapp.pojo;

public class ReportDetail {

	String fileName;
	int successCount;
	int errorCount;
	int totalCount;
	String fileStatus;
	String errorReportLocation;
	String fileDate;
	String fileReceivedDate;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(int successCount) {
		this.successCount = successCount;
	}

	public int getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(int errorCount) {
		this.errorCount = errorCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getErrorReportLocation() {
		return errorReportLocation;
	}

	public void setErrorReportLocation(String errorReportLocation) {
		this.errorReportLocation = errorReportLocation;
	}

	public String getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}	

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public String getFileReceivedDate() {
		return fileReceivedDate;
	}

	public void setFileReceivedDate(String fileReceivedDate) {
		this.fileReceivedDate = fileReceivedDate;
	}

	@Override
	public String toString() {
		return "ReportDetail [fileName=" + fileName + ", successCount=" + successCount + ", errorCount=" + errorCount
				+ ", totalCount=" + totalCount + ", fileStatus=" + fileStatus + ", errorReportLocation="
				+ errorReportLocation + ", uploadDate=" + fileDate + ", fileCreationDate=" + fileReceivedDate + "]";
	}	

}
