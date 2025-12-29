package com.dhl.dhltalentlinkapp.job.servicetype.impl;

import java.util.List;
import java.util.Map;

import org.quartz.DisallowConcurrentExecution;
import org.springframework.beans.factory.annotation.Autowired;

import com.dhl.dhltalentlinkapp.inputfiledetails.Inputfiledetails;
import com.dhl.dhltalentlinkapp.job.servicetype.IServiceJob;
import com.dhl.dhltalentlinkapp.utils.CommonUtils;
import com.dhl.dhltalentlinkapp.utils.SFTPUtil;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;


public class MyhrTlinkFileDownloadImpl implements IServiceJob {

	private final static Logger LOGGER = LoggerManager.getLogger(MyhrTlinkFileDownloadImpl.class);

	protected @Autowired SFTPUtil sftpUtil;
	protected @Autowired CommonUtils commonUtil;

	@Override
	public void process(Map<String, String> inputMap, String jobId, String jobName) {

		LOGGER.info("### [" + jobId + "] - #############################");
		LOGGER.info("### [" + jobId + "] - Entering process method ###");

		try {

			List<Inputfiledetails> inputFileList = sftpUtil.downloadFilesForProcessing();
			
			if(inputFileList!=null && inputFileList.size()>0) {
				commonUtil.sendFileReceivedEmail(inputFileList);
			}

		} catch (Exception e) {
			LOGGER.error("### [" + jobId + "] - Exception occured in process method ###" + "\n" + e.getMessage());
			e.printStackTrace();
		}

		LOGGER.info("### [" + jobId + "] - Exiting process method ###");
		LOGGER.info("### [" + jobId + "] - #############################");

	}

}
