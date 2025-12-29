package com.dhl.dhltalentlinkapp.job.impl;

import java.util.Map;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.job.AbstractSchedulerJob;
import com.dhl.dhltalentlinkapp.job.servicetype.IServiceJob;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

@DisallowConcurrentExecution
public class SchedulerJobImpl extends AbstractSchedulerJob {

	private final static Logger LOGGER = LoggerManager.getLogger(SchedulerJobImpl.class);

	@SuppressWarnings("unchecked")
	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		LOGGER.info("#### Scheduled Job Triggered ####");
		IServiceJob serviceJob = null;
		Map<String, String> inputMap = null;
		String jobName="";
		String jobId="";
		try {
			JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();

			if (jobDataMap != null && jobDataMap.get(CommonConstants.JOB_TYPE) != null
					&& jobDataMap.get(CommonConstants.JOB_TYPE) instanceof IServiceJob) {
				
				serviceJob = ((IServiceJob) jobDataMap.get(CommonConstants.JOB_TYPE));
				inputMap = (Map<String, String>) jobDataMap.get(CommonConstants.INPUT_MAP);
				jobName = (String) jobDataMap.get(CommonConstants.JOB_NAME);
				jobId = (String) jobDataMap.get(CommonConstants.SCHEDULE_ID);
				LOGGER.info("#### Job Name ==> "+jobName+" ####");
				
				serviceJob.process(inputMap,jobId,jobName);
				
				
			}
		} catch (Throwable t) {
			LOGGER.error(this.getClass() + "Exception occured " + t.getMessage());

		}
		LOGGER.info("#### Scheduled Job Ended ####");
	}

}
