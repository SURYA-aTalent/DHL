package com.dhl.dhltalentlinkapp.quartz;

import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.SchedulerException;
import org.quartz.SchedulerListener;
import org.quartz.Trigger;
import org.quartz.TriggerKey;

import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class QuartsSchedulerListener implements SchedulerListener {

	private final static Logger LOGGER = LoggerManager.getLogger(QuartsSchedulerListener.class);

	@Override
	public void jobScheduled(Trigger trigger) {
		LOGGER.info("### JOB Scheduled ###");

	}

	@Override
	public void jobUnscheduled(TriggerKey triggerKey) {
		LOGGER.info("### JOB Unscheduled ###");
	}

	@Override
	public void triggerFinalized(Trigger trigger) {
		LOGGER.info("### JOB TriggerFinalized ###");

	}

	@Override
	public void triggerPaused(TriggerKey triggerKey) {
		LOGGER.info("### JOB TriggerPaused ###");

	}

	@Override
	public void triggersPaused(String triggerGroup) {
		LOGGER.info("### JOB TriggersPaused ###");

	}

	@Override
	public void triggerResumed(TriggerKey triggerKey) {
		LOGGER.info("### JOB TriggerResumed ###");

	}

	@Override
	public void triggersResumed(String triggerGroup) {
		LOGGER.info("### JOB TriggersResumed ###");

	}

	@Override
	public void jobAdded(JobDetail jobDetail) {
		LOGGER.info("### JOB Added ###");

	}

	@Override
	public void jobDeleted(JobKey jobKey) {
		LOGGER.info("### Job Deleted ###");

	}

	@Override
	public void jobPaused(JobKey jobKey) {

		LOGGER.info("### Job Paused ###");
	}

	@Override
	public void jobsPaused(String jobGroup) {
		LOGGER.info("### Jobs Paused ###");

	}

	@Override
	public void jobResumed(JobKey jobKey) {
		LOGGER.info("### Job Resumed ###");

	}

	@Override
	public void jobsResumed(String jobGroup) {
		LOGGER.info("### Jobs Resumed ###");

	}

	@Override
	public void schedulerError(String msg, SchedulerException cause) {
		LOGGER.info("### schedulerError ###");
		LOGGER.info("### msg: " + msg + ", cause: " + cause.getMessage() + "### ");

	}

	@Override
	public void schedulerInStandbyMode() {
		LOGGER.info("### schedulerInStandbyMode ###");

	}

	@Override
	public void schedulerStarted() {
		LOGGER.info("### Scheduler Started ###");

	}

	@Override
	public void schedulerStarting() {

		LOGGER.info("### Scheduler Starting ###");
	}

	@Override
	public void schedulerShutdown() {

		LOGGER.info("### Scheduler Shutdown ###");
	}

	@Override
	public void schedulerShuttingdown() {

		LOGGER.info("### Scheduler Shutting Down ###");
	}

	@Override
	public void schedulingDataCleared() {
		LOGGER.info("### Scheduling Data Cleared ###");

	}

}
