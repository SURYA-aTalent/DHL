package com.dhl.dhltalentlinkapp;

import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.dhl.dhltalentlinkapp.generated.GeneratedDhltalentlinkappConfiguration;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.LovSyncServiceJobImpl;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.MyhrTlinkFileDownloadImpl;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.MyhrTlinkSyncJobImpl;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.StatusReportJobImpl;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.TlinkMyhrFetchDtlsJobImpl;
import com.dhl.dhltalentlinkapp.job.servicetype.impl.TlinkSDHFetchDtlsJobImpl;
import com.dhl.dhltalentlinkapp.outbound.utils.export.AustraliaExportUtil;
import com.dhl.dhltalentlinkapp.outbound.utils.export.ExportUtil;
import com.dhl.dhltalentlinkapp.outbound.utils.export.ExportUtilsFactory;
import com.dhl.dhltalentlinkapp.outbound.utils.export.IndiaExportUtil;
import com.dhl.dhltalentlinkapp.outbound.utils.export.SingaporeExportUtil;
import com.dhl.dhltalentlinkapp.outbound.utils.export.sdh.SDHExportUtil;
import com.dhl.dhltalentlinkapp.outbound.utils.export.sdh.SDHExportUtilV2;
import com.dhl.dhltalentlinkapp.quartz.QuartsSchedulerListener;
import com.dhl.dhltalentlinkapp.quartz.QuartzSchedulerManager;
import com.dhl.dhltalentlinkapp.utils.ApiUtils;
import com.dhl.dhltalentlinkapp.utils.CSVReaderUtil;
import com.dhl.dhltalentlinkapp.utils.CSVWriterUtil;
import com.dhl.dhltalentlinkapp.utils.CommonUtils;
import com.dhl.dhltalentlinkapp.utils.EncryptDecryptUtil;
import com.dhl.dhltalentlinkapp.utils.ExcelUtil;
import com.dhl.dhltalentlinkapp.utils.SFTPUtil;

/**
 * The spring configuration file
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dhl
 */
@Configuration
public class DhltalentlinkappConfiguration extends GeneratedDhltalentlinkappConfiguration {

	@Bean
	public LovSyncServiceJobImpl getLovSyncServiceJobImpl(DhltalentlinkappApplication app) {
		return app.getOrThrow(LovSyncServiceJobImpl.class);
	}

	@Bean
	public MyhrTlinkSyncJobImpl getMyhrTlinkSyncJobImpl(DhltalentlinkappApplication app) {
		return app.getOrThrow(MyhrTlinkSyncJobImpl.class);
	}

	@Bean
	public MyhrTlinkFileDownloadImpl getMMyhrTlinkFileDownloadImpl(DhltalentlinkappApplication app) {
		return app.getOrThrow(MyhrTlinkFileDownloadImpl.class);
	}

	@Bean
	public StdSchedulerFactory getSchedulerFactory(DhltalentlinkappApplication app) {
		StdSchedulerFactory scheduleFactory = new StdSchedulerFactory();
		return scheduleFactory;
	}

	@Bean
	public QuartsSchedulerListener getQuartsSchedulerListener(DhltalentlinkappApplication app) {
		return app.getOrThrow(QuartsSchedulerListener.class);
	}

	@Bean
	public QuartzSchedulerManager getQuartzScheduler(DhltalentlinkappApplication app) {
		return app.getOrThrow(QuartzSchedulerManager.class);
	}

	@Bean
	public ApiUtils getApiUtils(DhltalentlinkappApplication app) {
		return app.getOrThrow(ApiUtils.class);
	}

	@Bean
	public CSVReaderUtil getCSVReaderUtil(DhltalentlinkappApplication app) {
		return app.getOrThrow(CSVReaderUtil.class);
	}

	@Bean
	public CSVWriterUtil getCSVWriterUtil(DhltalentlinkappApplication app) {
		return app.getOrThrow(CSVWriterUtil.class);
	}

	@Bean
	public SFTPUtil getSFTPUtil(DhltalentlinkappApplication app) {
		return app.getOrThrow(SFTPUtil.class);
	}

	@Bean
	public EncryptDecryptUtil getEncryptDecryptUtil(DhltalentlinkappApplication app) {
		return app.getOrThrow(EncryptDecryptUtil.class);
	}

	@Bean
	public ExcelUtil getExcelUtil(DhltalentlinkappApplication app) {
		return app.getOrThrow(ExcelUtil.class);
	}

	@Bean
	public CommonUtils getCommonUtils(DhltalentlinkappApplication app) {
		return app.getOrThrow(CommonUtils.class);
	}

	@Bean
	public StatusReportJobImpl getStatusReportJobImpl(DhltalentlinkappApplication app) {
		return app.getOrThrow(StatusReportJobImpl.class);
	}

	@Bean
	public TlinkMyhrFetchDtlsJobImpl getTlinkMyhrFetchDtlsJobImpl(DhltalentlinkappApplication app) {
		return app.getOrThrow(TlinkMyhrFetchDtlsJobImpl.class);
	}
	
	@Bean
	public TlinkSDHFetchDtlsJobImpl getTlinkSDHFetchDtlsJobImpl(DhltalentlinkappApplication app) {
		return app.getOrThrow(TlinkSDHFetchDtlsJobImpl.class);
	}

	@Bean
	public ExportUtil getExportUtil(DhltalentlinkappApplication app) {
		return app.getOrThrow(ExportUtil.class);
	}

	@Bean
	public AustraliaExportUtil getAustraliaExportUtil(DhltalentlinkappApplication app) {
		return app.getOrThrow(AustraliaExportUtil.class);
	}

	@Bean
	public IndiaExportUtil getIndiaExportUtil(DhltalentlinkappApplication app) {
		return app.getOrThrow(IndiaExportUtil.class);
	}

	@Bean
	public SingaporeExportUtil getSingaporeExportUtil(DhltalentlinkappApplication app) {
		return app.getOrThrow(SingaporeExportUtil.class);
	}

	@Bean
	public SDHExportUtil getSDHExportUtil(DhltalentlinkappApplication app) {
		return app.getOrThrow(SDHExportUtil.class);
	}

	@Bean
	public SDHExportUtilV2 getSDHExportUtilV2(DhltalentlinkappApplication app) {
		return app.getOrThrow(SDHExportUtilV2.class);
	}

	@Bean
	public ExportUtilsFactory getExportUtilsFactory(DhltalentlinkappApplication app) {
		return app.getOrThrow(ExportUtilsFactory.class);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}

}
