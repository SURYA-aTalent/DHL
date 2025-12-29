package com.dhl.dhltalentlinkapp.job.servicetype.impl;

import java.util.Map;

import org.quartz.DisallowConcurrentExecution;
import org.springframework.beans.factory.annotation.Autowired;

import com.dhl.dhltalentlinkapp.job.servicetype.IServiceJob;
import com.dhl.dhltalentlinkapp.outbound.utils.export.ExportUtil;
import com.dhl.dhltalentlinkapp.utils.CommonUtils;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class TlinkMyhrFetchDtlsJobImpl implements IServiceJob {

	protected @Autowired ExportUtil exportUtil;
	private final static Logger LOGGER = LoggerManager.getLogger(TlinkMyhrFetchDtlsJobImpl.class);

	@Override
	public void process(Map<String, String> inputMap, String jobId, String jobName) {

		LOGGER.info("### [" + jobId + "] - Entering TlinkMyhrFetchDtlsJobImpl Process method #############################");
		LOGGER.info("### [" + jobId + "] - 	#");

		try {

			exportUtil.fetchCandidateDetails();
			exportUtil.sendEncryptedFilesToFTP(false);
			exportUtil.sendErrorReportMail(false);

		} catch (Exception e) {

			LOGGER.error("Exception occured in Tlink Myhr Fetch Dtls Job" + e.getMessage());
			e.printStackTrace();

		}

		LOGGER.info("### [" + jobId + "] - Exiting TlinkMyhrFetchDtlsJobImpl process method ###");
	}

}
