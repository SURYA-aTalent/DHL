package com.dhl.dhltalentlinkapp.quartz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.beans.factory.annotation.Autowired;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.job.impl.SchedulerJobImpl;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.LovSyncServiceJobImpl;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.MyhrTlinkFileDownloadImpl;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.MyhrTlinkSyncJobImpl;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.StatusReportJobImpl;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.TlinkMyhrFetchDtlsJobImpl;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.TlinkSDHFetchDtlsJobImpl;
import com.dhl.dhltalentlinkapp.masterconfig.MasterconfigManager;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class QuartzSchedulerManager {

	private @Autowired StdSchedulerFactory scheduleFactory;
	private @Autowired QuartsSchedulerListener quartzSchedulerListener;
	private Scheduler scheduler;

	private @Autowired MasterconfigManager masterConfigManager;
	private @Autowired LovSyncServiceJobImpl lovServiceJobImpl;

	private @Autowired MyhrTlinkFileDownloadImpl myhrTlinkFileDwnldJobImpl;

	private @Autowired MyhrTlinkSyncJobImpl myhrTlinkSyncJobImpl;

	private @Autowired StatusReportJobImpl statusReportJobImpl;
	
	private @Autowired TlinkMyhrFetchDtlsJobImpl tlinkMyhrfetchJobImpl;
	
	private @Autowired TlinkSDHFetchDtlsJobImpl tlinkSDHfetchJobImpl;

	private final static Logger LOGGER = LoggerManager.getLogger(QuartzSchedulerManager.class);

	public QuartzSchedulerManager() {

	}

	@PostConstruct
	public void initSchedulerManager() {
		try {
			LOGGER.info("#### Entering initSchedulerManager ####");

			// scheduleFactory = new StdSchedulerFactory();
			scheduler = scheduleFactory.getScheduler();
			// quartzSchedulerListener = new QuartsSchedulerListener();
			scheduler.getListenerManager().addSchedulerListener(quartzSchedulerListener);
			scheduler.start();
			LOGGER.info("#### Successfully Created QuartzSchedulerManager ####");

			LOGGER.info("#### Exiting initSchedulerManager ####");
		} catch (SchedulerException e) {
			LOGGER.info(
					"#### Exception occured while in initializing QuartzSchedulerManager " + e.getMessage() + " ####");
			e.printStackTrace();
		}
	}

	public boolean initializeLovSyncJob() {

		LOGGER.info("#### Entering initializeLovSyncJob ####");

		boolean isCreated = false;
		boolean jobIsActive = masterConfigManager.getValue(CommonConstants.LOV_JOB_STATUS)
				.equals(CommonConstants.ACTIVE) ? true : false;

		if (jobIsActive) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy-hh-mm-ss");
			try {
				String jobIdentity = "0" + CommonConstants.UNDERSCORE + "LOV_SYNC_JOB";

				// String cronString = masterConfig.ge"0 */2 * ? * *";

				String cronString = masterConfigManager.getValue(CommonConstants.LOV_JOB_CRON_STRING);

				JobDetail jobDetail = JobBuilder.newJob(SchedulerJobImpl.class).withIdentity(
						jobIdentity + CommonConstants.UNDERSCORE + formatter.format(new Date()), jobIdentity).build();

				CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(jobIdentity, jobIdentity)
						.withSchedule(CronScheduleBuilder.cronSchedule(cronString)).build();

				HashMap<String, String> inputMap = new HashMap<String, String>();
				inputMap.put(CommonConstants.SCHEDULE_ID, "0");

				jobDetail.getJobDataMap().put(CommonConstants.JOB_TYPE, lovServiceJobImpl);
				jobDetail.getJobDataMap().put(CommonConstants.INPUT_MAP, inputMap);
				jobDetail.getJobDataMap().put(CommonConstants.JOB_NAME, "LovSyncJob");
				jobDetail.getJobDataMap().put(CommonConstants.SCHEDULE_ID, "0");

				Date schDate = scheduler.scheduleJob(jobDetail, cronTrigger);

				LOGGER.info("#### Job with identity :" + jobIdentity + " scheduled successfully for date :"
						+ formatter.format(schDate) + " ####");

				isCreated = true;
			} catch (Exception e) {
				isCreated = false;
				LOGGER.error("#### Exception occured while scheduling job: " + e.getMessage() + " ####");
			}
		}
		LOGGER.info("#### LovSyncJob initialized: " + isCreated + " ####");
		LOGGER.info("#### Exiting initializeLovSyncJob ####");

		return isCreated;

	}

	public boolean initializeMyhrTlinkSyncJob() {

		LOGGER.info("#### Entering initializeMyhrTlinkSyncJob ####");

		boolean isCreated = false;
		boolean jobIsActive = masterConfigManager.getValue(CommonConstants.MYHR_TLINK_JOB_STATUS)
				.equals(CommonConstants.ACTIVE) ? true : false;

		if (jobIsActive) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy-hh-mm-ss");
			try {
				String jobIdentity = "2" + CommonConstants.UNDERSCORE + "MYHR_TLINK_SYNC_JOB";

				// String cronString = masterConfig.ge"0 */2 * ? * *";

				String cronString = masterConfigManager.getValue(CommonConstants.MYHR_TLINK_JOB_CRON_STRING);

				JobDetail jobDetail = JobBuilder.newJob(SchedulerJobImpl.class).withIdentity(
						jobIdentity + CommonConstants.UNDERSCORE + formatter.format(new Date()), jobIdentity).build();

				CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(jobIdentity, jobIdentity)
						.withSchedule(CronScheduleBuilder.cronSchedule(cronString)).build();

				HashMap<String, String> inputMap = new HashMap<String, String>();
				inputMap.put(CommonConstants.SCHEDULE_ID, "2");

				jobDetail.getJobDataMap().put(CommonConstants.JOB_TYPE, myhrTlinkSyncJobImpl);
				jobDetail.getJobDataMap().put(CommonConstants.INPUT_MAP, inputMap);
				jobDetail.getJobDataMap().put(CommonConstants.JOB_NAME, "MyHRTlinkSyncJob");
				jobDetail.getJobDataMap().put(CommonConstants.SCHEDULE_ID, "2");

				Date schDate = scheduler.scheduleJob(jobDetail, cronTrigger);

				LOGGER.info("#### Job with identity :" + jobIdentity + " scheduled successfully for date :"
						+ formatter.format(schDate) + " ####");

				isCreated = true;
			} catch (Exception e) {
				isCreated = false;
				LOGGER.error("#### Exception occured while scheduling job: " + e.getMessage() + " ####");
			}
		}

		LOGGER.info("#### MyhrTlinkSyncJob initialized: " + isCreated + " ####");
		LOGGER.info("#### Exiting initializeMyhrTlinkSyncJob ####");

		return isCreated;

	}

	public boolean initializeMyhrTlinkFileDownloadJob() {

		LOGGER.info("#### Entering initializeMyhrTlinkFileDownloadJob ####");

		boolean isCreated = false;
		boolean jobIsActive = masterConfigManager.getValue(CommonConstants.MYHR_TLINK_FILE_DWNLD_JOB_STATUS)
				.equals(CommonConstants.ACTIVE) ? true : false;

		if (jobIsActive) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy-hh-mm-ss");
			try {
				String jobIdentity = "1" + CommonConstants.UNDERSCORE + "MYHR_TLINK_FILE_DWNLD_JOB";

				// String cronString = masterConfig.ge"0 */2 * ? * *";

				String cronString = masterConfigManager.getValue(CommonConstants.MYHR_TLINK_FILE_DWNLD_JOB_CRON);

				JobDetail jobDetail = JobBuilder.newJob(SchedulerJobImpl.class).withIdentity(
						jobIdentity + CommonConstants.UNDERSCORE + formatter.format(new Date()), jobIdentity).build();

				CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(jobIdentity, jobIdentity)
						.withSchedule(CronScheduleBuilder.cronSchedule(cronString)).build();

				HashMap<String, String> inputMap = new HashMap<String, String>();
				inputMap.put(CommonConstants.SCHEDULE_ID, "1");

				jobDetail.getJobDataMap().put(CommonConstants.JOB_TYPE, myhrTlinkFileDwnldJobImpl);
				jobDetail.getJobDataMap().put(CommonConstants.INPUT_MAP, inputMap);
				jobDetail.getJobDataMap().put(CommonConstants.JOB_NAME, "MyHRTlinkFileDownloadJob");
				jobDetail.getJobDataMap().put(CommonConstants.SCHEDULE_ID, "1");

				Date schDate = scheduler.scheduleJob(jobDetail, cronTrigger);

				LOGGER.info("#### Job with identity :" + jobIdentity + " scheduled successfully for date :"
						+ formatter.format(schDate) + " ####");

				isCreated = true;
			} catch (Exception e) {
				isCreated = false;
				LOGGER.error("#### Exception occured while scheduling job: " + e.getMessage() + " ####");
			}
		}

		LOGGER.info("#### MyhrTlinkFileDownloadJob initialized: " + isCreated + " ####");
		LOGGER.info("#### Exiting initializeMyhrTlinkFileDownloadJob ####");

		return isCreated;

	}

	public boolean initializeStatusReportJob() {

		LOGGER.info("#### Entering initializeStatusReportJob ####");

		boolean isCreated = false;
		boolean jobIsActive = masterConfigManager.getValue(CommonConstants.MYHR_STATUS_REPORT_JOB_STATUS)
				.equals(CommonConstants.ACTIVE) ? true : false;

		if (jobIsActive) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy-hh-mm-ss");
			try {
				String jobIdentity = "3" + CommonConstants.UNDERSCORE + "MYHR_TLINK_REPORT_JOB";

				// String cronString = masterConfig.ge"0 */2 * ? * *";

				String cronString = masterConfigManager.getValue(CommonConstants.REPORT_JOB_CRON_STRING);

				JobDetail jobDetail = JobBuilder.newJob(SchedulerJobImpl.class).withIdentity(
						jobIdentity + CommonConstants.UNDERSCORE + formatter.format(new Date()), jobIdentity).build();

				CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(jobIdentity, jobIdentity)
						.withSchedule(CronScheduleBuilder.cronSchedule(cronString)).build();

				HashMap<String, String> inputMap = new HashMap<String, String>();
				inputMap.put(CommonConstants.SCHEDULE_ID, "3");

				jobDetail.getJobDataMap().put(CommonConstants.JOB_TYPE, statusReportJobImpl);
				jobDetail.getJobDataMap().put(CommonConstants.INPUT_MAP, inputMap);
				jobDetail.getJobDataMap().put(CommonConstants.JOB_NAME, "MyHRTlinkReportJob");
				jobDetail.getJobDataMap().put(CommonConstants.SCHEDULE_ID, "3");

				Date schDate = scheduler.scheduleJob(jobDetail, cronTrigger);

				LOGGER.info("#### Job with identity :" + jobIdentity + " scheduled successfully for date :"
						+ formatter.format(schDate) + " ####");

				isCreated = true;
			} catch (Exception e) {
				isCreated = false;
				LOGGER.error("#### Exception occured while scheduling job: " + e.getMessage() + " ####");
			}
		}

		LOGGER.info("#### initializeStatusReportJob initialized: " + isCreated + " ####");
		LOGGER.info("#### Exiting initializeStatusReportJob ####");

		return isCreated;

	}
	
	public boolean initializeTlkMyhrJob() {

		LOGGER.info("#### Entering initializeTlkMyhrJob ####");

		boolean isCreated = false;
		boolean jobIsActive = masterConfigManager.getValue(CommonConstants.TLK_MYHR_FETCH_JOB_STATUS)
				.equals(CommonConstants.ACTIVE) ? true : false;

		if (jobIsActive) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy-hh-mm-ss");
			try {
				String jobIdentity = "4" + CommonConstants.UNDERSCORE + "TLK_MYHR_FETCH_JOB";

				// String cronString = masterConfig.ge"0 */2 * ? * *";

				String cronString = masterConfigManager.getValue(CommonConstants.TLK_MYHR_FETCH_CRON_STRING);

				JobDetail jobDetail = JobBuilder.newJob(SchedulerJobImpl.class).withIdentity(
						jobIdentity + CommonConstants.UNDERSCORE + formatter.format(new Date()), jobIdentity).build();

				CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(jobIdentity, jobIdentity)
						.withSchedule(CronScheduleBuilder.cronSchedule(cronString)).build();

				HashMap<String, String> inputMap = new HashMap<String, String>();
				inputMap.put(CommonConstants.SCHEDULE_ID, "4");

				jobDetail.getJobDataMap().put(CommonConstants.JOB_TYPE, tlinkMyhrfetchJobImpl);
				jobDetail.getJobDataMap().put(CommonConstants.INPUT_MAP, inputMap);
				jobDetail.getJobDataMap().put(CommonConstants.JOB_NAME, "tlinkMyhrfetchJob");
				jobDetail.getJobDataMap().put(CommonConstants.SCHEDULE_ID, "4");

				Date schDate = scheduler.scheduleJob(jobDetail, cronTrigger);

				LOGGER.info("#### Job with identity :" + jobIdentity + " scheduled successfully for date :"
						+ formatter.format(schDate) + " ####");

				isCreated = true;
			} catch (Exception e) {
				isCreated = false;
				LOGGER.error("#### Exception occured while scheduling job: " + e.getMessage() + " ####");
			}
		}

		LOGGER.info("#### initializeTlkMyhrJob initialized: " + isCreated + " ####");
		LOGGER.info("#### Exiting initializeTlkMyhrJob ####");

		return isCreated;

	}
	
	public boolean initializeTlkSdhJob() {

		LOGGER.info("#### Entering initializeTlkSdhJob ####");

		boolean isCreated = false;
		boolean jobIsActive = masterConfigManager.getValue(CommonConstants.TLK_SDH_FETCH_JOB_STATUS)
				.equals(CommonConstants.ACTIVE) ? true : false;

		if (jobIsActive) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy-hh-mm-ss");
			try {
				String jobIdentity = "5" + CommonConstants.UNDERSCORE + "TLK_SDH_FETCH_JOB";

				// String cronString = masterConfig.ge"0 */2 * ? * *";

				String cronString = masterConfigManager.getValue(CommonConstants.TLK_SDH_FETCH_CRON_STRING);

				JobDetail jobDetail = JobBuilder.newJob(SchedulerJobImpl.class).withIdentity(
						jobIdentity + CommonConstants.UNDERSCORE + formatter.format(new Date()), jobIdentity).build();

				CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity(jobIdentity, jobIdentity)
						.withSchedule(CronScheduleBuilder.cronSchedule(cronString)).build();

				HashMap<String, String> inputMap = new HashMap<String, String>();
				inputMap.put(CommonConstants.SCHEDULE_ID, "4");

				jobDetail.getJobDataMap().put(CommonConstants.JOB_TYPE, tlinkSDHfetchJobImpl);
				jobDetail.getJobDataMap().put(CommonConstants.INPUT_MAP, inputMap);
				jobDetail.getJobDataMap().put(CommonConstants.JOB_NAME, "tlinkSDHFetchJob");
				jobDetail.getJobDataMap().put(CommonConstants.SCHEDULE_ID, "5");

				Date schDate = scheduler.scheduleJob(jobDetail, cronTrigger);

				LOGGER.info("#### Job with identity :" + jobIdentity + " scheduled successfully for date :"
						+ formatter.format(schDate) + " ####");

				isCreated = true;
			} catch (Exception e) {
				isCreated = false;
				LOGGER.error("#### Exception occured while scheduling job: " + e.getMessage() + " ####");
			}
		}

		LOGGER.info("#### initializeTlkSdhJob initialized: " + isCreated + " ####");
		LOGGER.info("#### Exiting initializeTlkSdhJob ####");

		return isCreated;

	}

	public void shutDown() {
		try {
			scheduler.shutdown(true);

		} catch (Exception e) {
			LOGGER.error("Exception occured while shutting down Scheduler " + e.getMessage());
			e.printStackTrace();

		}

	}

	public boolean isJobRunning(String jobName, String jobGroup) {

		boolean isJobRunning = false;

		LOGGER.info("#### Entering isJobRunning ####");

		try {
			TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);

			if (scheduler.checkExists(triggerKey)) {

				isJobRunning = true;
			}
		} catch (Exception e) {
			LOGGER.error("#### Exception occured in checking Job existence - (" + jobName + "," + jobGroup + ") - "
					+ e.getMessage() + " ###");
			e.printStackTrace();
			isJobRunning = false;
		}

		LOGGER.info("#### Exiting isJobRunning ####");

		return isJobRunning;
	}

	public boolean terminateJob(String jobName, String jobGroup) {

		boolean isJobStopped = false;

		LOGGER.info("#### Entering terminateJob ####");

		try {
			if (isJobRunning(jobName, jobGroup)) {
				TriggerKey triggerKey = TriggerKey.triggerKey(jobName, jobGroup);
				LOGGER.info("### Job Exists..Terminating Job ###");
				isJobStopped = scheduler.unscheduleJob(triggerKey); // trigger + job

				if (isJobStopped) {
					LOGGER.info("### Job Successfully Terminated ###");
				}
			}
		} catch (Exception e) {
			LOGGER.error("#### Exception occured in terminateJob - (" + jobName + "," + jobGroup + ") - "
					+ e.getMessage() + " ###");
			e.printStackTrace();
			isJobStopped = false;
		}

		LOGGER.info("#### Exiting terminateJob ####");

		return isJobStopped;

	}

	public ArrayList<QuartzBean> getScheduledJobDetails() {

		LOGGER.info("#### Entering getScheduledJobDetails ####");

		ArrayList<QuartzBean> quartzJobDetailsList = new ArrayList<QuartzBean>();
		QuartzBean quartzJobDetails = null;
		ObjectMapper mapper = new ObjectMapper();
		try {

			for (String groupName : scheduler.getJobGroupNames()) {

				LOGGER.info("#### Job GroupName " + groupName + " ###");
				for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
					quartzJobDetails = new QuartzBean();
					String jobName = jobKey.getName();
					String jobGroup = jobKey.getGroup();

					JobDetail detail = scheduler.getJobDetail(jobKey);
					List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);
					Date nextFireTime = triggers.get(0).getNextFireTime();
					Date prevFireTime = triggers.get(0).getPreviousFireTime();
					JobDataMap inputDataMap = detail.getJobDataMap();
					quartzJobDetails.setJobId(jobGroup.split("_")[0]);
					quartzJobDetails.setJobName(groupName.substring(jobName.indexOf("_") + 1));
					quartzJobDetails.setNextTriggerTime(nextFireTime + "");
					quartzJobDetails.setJobDataMap(
							mapper.writeValueAsString(inputDataMap.getWrappedMap().get(CommonConstants.INPUT_MAP)));
					quartzJobDetails.setPreviousTriggerTime(prevFireTime + "");

					LOGGER.info("#### [jobName] : " + groupName.substring(jobName.indexOf("_") + 1) + ",[groupName] : "
							+ jobGroup + ",[nextFireTime] :" + nextFireTime + ",[nextFireTime] :" + prevFireTime
							+ " ####");

					quartzJobDetailsList.add(quartzJobDetails);
				}

			}
		} catch (Exception e) {
			LOGGER.error("#### Exception occured in getScheduledJobDetails " + e.getMessage() + " ####");
			e.printStackTrace();
		}

		LOGGER.info("#### Exiting getScheduledJobDetails ####");

		return quartzJobDetailsList;
	}

}
