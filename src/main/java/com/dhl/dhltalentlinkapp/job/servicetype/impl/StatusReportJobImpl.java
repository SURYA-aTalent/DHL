package com.dhl.dhltalentlinkapp.job.servicetype.impl;

import java.util.Map;

import org.quartz.DisallowConcurrentExecution;
import org.springframework.beans.factory.annotation.Autowired;

import com.dhl.dhltalentlinkapp.job.servicetype.IServiceJob;
import com.dhl.dhltalentlinkapp.utils.CommonUtils;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;


public class StatusReportJobImpl implements IServiceJob {

	protected @Autowired CommonUtils commonUtil;
	private final static Logger LOGGER = LoggerManager.getLogger(StatusReportJobImpl.class);

	@Override
	public void process(Map<String, String> inputMap, String jobId, String jobName) {

		LOGGER.info("### [" + jobId + "] - #############################");
		LOGGER.info("### [" + jobId + "] - 	#");

		try {

			commonUtil.sendConsolidatedMailReport();

		} catch (Exception e) {

			LOGGER.error("Exception occured in email report job " + e.getMessage());
			e.printStackTrace();

		}

		LOGGER.info("### [" + jobId + "] - Exiting process method ###");
	}

}
