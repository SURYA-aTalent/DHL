package com.dhl.dhltalentlinkapp.job.servicetype.impl;

import java.util.Map;

import org.quartz.DisallowConcurrentExecution;
import org.springframework.beans.factory.annotation.Autowired;

import com.dhl.dhltalentlinkapp.job.servicetype.IServiceJob;
import com.dhl.dhltalentlinkapp.outbound.utils.export.ExportUtil;
import com.dhl.dhltalentlinkapp.utils.CommonUtils;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class TlinkSDHFetchDtlsJobImpl implements IServiceJob {

	protected @Autowired ExportUtil exportUtil;
	private final static Logger LOGGER = LoggerManager.getLogger(TlinkSDHFetchDtlsJobImpl.class);

	@Override
	public void process(Map<String, String> inputMap, String jobId, String jobName) {

		LOGGER.info("### [" + jobId + "] - Entering TlinkSDHFetchDtlsJobImpl Process method #############################");
		LOGGER.info("### [" + jobId + "] - 	#");

		try {

			exportUtil.fetchCandidateDetailsForSDH();
			exportUtil.sendEncryptedFilesToFTP(true);
			exportUtil.sendErrorReportMail(true);

		} catch (Exception e) {

			LOGGER.error("Exception occured in Tlink SDH Fetch Dtls Job" + e.getMessage());
			e.printStackTrace();

		}

		LOGGER.info("### [" + jobId + "] - Exiting TlinkSDHFetchDtlsJobImpl process method ###");
	}

}
