package com.dhl.dhltalentlinkapp;

import org.quartz.impl.StdSchedulerFactory;

import com.dhl.dhltalentlinkapp.generated.GeneratedDhltalentlinkappApplicationBuilder;
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
 * The default {@link com.speedment.runtime.core.ApplicationBuilder}
 * implementation class for the {@link com.speedment.runtime.config.Project}
 * named dhltalentlink-app.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dhl
 */
public final class DhltalentlinkappApplicationBuilder extends GeneratedDhltalentlinkappApplicationBuilder {

	public DhltalentlinkappApplicationBuilder() {
		withComponent(StdSchedulerFactory.class);
		withComponent(QuartsSchedulerListener.class);
		withComponent(LovSyncServiceJobImpl.class);
		withComponent(MyhrTlinkSyncJobImpl.class);
		withComponent(MyhrTlinkFileDownloadImpl.class);
		withComponent(QuartzSchedulerManager.class);
		withComponent(ApiUtils.class);
		withComponent(CSVReaderUtil.class);
		withComponent(SFTPUtil.class);
		withComponent(EncryptDecryptUtil.class);
		withComponent(CommonUtils.class);
		withComponent(ExcelUtil.class);
		withComponent(StatusReportJobImpl.class);
		withComponent(TlinkMyhrFetchDtlsJobImpl.class);
		withComponent(TlinkSDHFetchDtlsJobImpl.class);		
		withComponent(CSVWriterUtil.class);
		withComponent(ExportUtil.class);
		withComponent(AustraliaExportUtil.class);
		withComponent(IndiaExportUtil.class);		
		withComponent(SingaporeExportUtil.class);
		withComponent(SDHExportUtil.class);
		withComponent(SDHExportUtilV2.class);
		withComponent(ExportUtilsFactory.class);

	}

}
