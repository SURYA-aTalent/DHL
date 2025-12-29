package com.dhl.dhltalentlinkapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dhl.dhltalentlinkapp.quartz.QuartzSchedulerManager;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

@Component
public class SchedulerServiceInitializer {

	protected @Autowired QuartzSchedulerManager scheduleManager;
	private final static Logger LOGGER = LoggerManager.getLogger(SchedulerServiceInitializer.class);

	public SchedulerServiceInitializer() {

	}

	@PostConstruct
	public void init() {
		LOGGER.info("==================>Initializing Scheduler Service<==================");
		//scheduleManager.initializeLovSyncJob();
		scheduleManager.initializeMyhrTlinkFileDownloadJob();
		scheduleManager.initializeMyhrTlinkSyncJob();
		scheduleManager.initializeStatusReportJob();
		scheduleManager.initializeTlkMyhrJob();
		scheduleManager.initializeTlkSdhJob();
	}

	@PreDestroy
	public void destroy() {
		LOGGER.info("==================>Stopping Scheduler Service<==================");
		scheduleManager.shutDown();

	}

}
