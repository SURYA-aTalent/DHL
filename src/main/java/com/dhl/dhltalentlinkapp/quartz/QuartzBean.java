package com.dhl.dhltalentlinkapp.quartz;

public class QuartzBean {

	String jobId;
	String jobName;
	String nextTriggerTime;
	String previousTriggerTime;
	String jobDataMap;

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getNextTriggerTime() {
		return nextTriggerTime;
	}

	public void setNextTriggerTime(String nextTriggerTime) {
		this.nextTriggerTime = nextTriggerTime;
	}

	public String getPreviousTriggerTime() {
		return previousTriggerTime;
	}

	public void setPreviousTriggerTime(String previousTriggerTime) {
		this.previousTriggerTime = previousTriggerTime;
	}

	public String getJobDataMap() {
		return jobDataMap;
	}

	public void setJobDataMap(String jobDataMap) {
		this.jobDataMap = jobDataMap;
	}

	
}
