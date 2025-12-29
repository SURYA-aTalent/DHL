package com.dhl.dhltalentlinkapp.job.servicetype.impl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.dhl.dhltalentlinkapp.apihitdetails.Apihitdetails;
import com.dhl.dhltalentlinkapp.apihitdetails.ApihitdetailsImpl;
import com.dhl.dhltalentlinkapp.apihitdetails.ApihitdetailsManager;
import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.inputfiledetails.Inputfiledetails;
import com.dhl.dhltalentlinkapp.inputfiledetails.InputfiledetailsManager;
import com.dhl.dhltalentlinkapp.inputfileerrordetails.InputfileerrordetailsManager;
import com.dhl.dhltalentlinkapp.job.servicetype.IServiceJob;
import com.dhl.dhltalentlinkapp.lovdetails.LovdetailsManager;
import com.dhl.dhltalentlinkapp.masterconfig.MasterconfigManager;
import com.dhl.dhltalentlinkapp.utils.ApiUtils;
import com.dhl.dhltalentlinkapp.utils.CSVReaderUtil;
import com.dhl.dhltalentlinkapp.utils.CommonUtils;
import com.dhl.dhltalentlinkapp.utils.EncryptDecryptUtil;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;


public class MyhrTlinkSyncJobImpl implements IServiceJob {

	private final static Logger LOGGER = LoggerManager.getLogger(MyhrTlinkSyncJobImpl.class);

	protected @Autowired ApiUtils apiUtils;
	protected @Autowired LovdetailsManager lovDetailsManager;
	protected @Autowired CSVReaderUtil readerUtil;
	protected @Autowired EncryptDecryptUtil encryptDecryptUtil;
	protected @Autowired CommonUtils commonUtil;

	protected @Autowired InputfiledetailsManager inputFileDetailsManager;
	protected @Autowired InputfileerrordetailsManager inputFileErrorDetailsManager;
	protected @Autowired MasterconfigManager masterConfigManager;
	protected @Autowired ApihitdetailsManager apiHitDetailsManager;
	private String localFilePath;

	@PostConstruct
	public void initializeData() {

		localFilePath = masterConfigManager.getValue(CommonConstants.SFTP_LOCAL_FILE_PATH);
	}

	@Override
	public void process(Map<String, String> inputMap, String jobId, String jobName) {

		LOGGER.info("### [" + jobId + "] - #############################");
		LOGGER.info("### [" + jobId + "] - Entering process method ###");
		AtomicReference<Boolean> processedFlag = new AtomicReference<Boolean>(false);
		try {
			
			Map<String, List<Inputfiledetails>> inputFileDetails = inputFileDetailsManager.stream()
					.filter(Inputfiledetails.STATUS.equal(CommonConstants.FILE_READY_STATUS))
					.collect(Collectors.groupingBy(Inputfiledetails.UPLOAD_DATE));

			inputFileDetails.forEach((uploadDate, fileList) -> {
				readerUtil.clearListAndMapDetails();

				try {
					String localDecryptedFileLocation = localFilePath + uploadDate + "/";
					Files.createDirectories(Paths.get(localDecryptedFileLocation));

					fileList.forEach(fileDetails -> {

						String fileName = fileDetails.getFileName().get();
						int successCount=0;

						boolean decryptFlag=encryptDecryptUtil.decryptFile(localFilePath + fileName, localDecryptedFileLocation + fileName);
						
						if(decryptFlag) {

						if (fileName.contains(CommonConstants.DEPARTMENT_TEXT)) {
							successCount=readerUtil.loadDepartmentDetails(localDecryptedFileLocation + fileName,
									fileDetails.getFileId());

						} else if (fileName.contains(CommonConstants.LEGAL_DETAILS_TEXT)) {		
							LOGGER.info("Not Processing Legal Entity File");
							//successCount=readerUtil.loadLegalEntityDetailsData(localDecryptedFileLocation + fileName,
								//	fileDetails.getFileId());

						} else if (fileName.contains(CommonConstants.MANAGER_DETAILS_TEXT)) {
							successCount=readerUtil.loadManagerDetailsData(localDecryptedFileLocation + fileName,
									fileDetails.getFileId());

						} else if (fileName.contains(CommonConstants.JOB_DETAILS_TEXT)) {
							successCount=readerUtil.loadJobDetailsData(localDecryptedFileLocation + fileName,
									fileDetails.getFileId());

						} else if (fileName.contains(CommonConstants.POS_DETAILS_TEXT)) {
							successCount=readerUtil.loadPositionDetailsListData(localDecryptedFileLocation + fileName,
									fileDetails.getFileId());
						}
						} else {
							readerUtil.addDecryptErrorDetail(fileName,fileDetails.getFileId(),encryptDecryptUtil.getErrorMessage());
						}
						
						fileDetails.setRecordCount(successCount);						
						inputFileDetailsManager.update(fileDetails);
						commonUtil.moveProcessedFile(localFilePath + fileName);
						
					});
					// readerUtil.displayData();
					//readerUtil.displayValidationErrorDetails();
					
					 apiUtils.processNewOrChangedRecords();
					 apiUtils.processEndDatedRecords();
					 
					 Apihitdetails apiHitDetails=new ApihitdetailsImpl();
					 apiHitDetails.setUploadDate(uploadDate);
					 apiHitDetails.setFilesCount((long) fileList.size());
					 apiHitDetails.setSetLovEntryCount(apiUtils.setLovEntryCount);
					 apiHitDetails.setSetLovLabelCount(apiUtils.setLovLabelCount);
					 apiHitDetails.setLinkValueCount(apiUtils.setLinkValueCount);
					 apiHitDetails.setUnlinkValueCount(apiUtils.setUnLinkValueCount);
					 apiHitDetails.setUpdatedTime(new Timestamp(System.currentTimeMillis()));
					 
					 apiHitDetailsManager.persist(apiHitDetails);
					 
					 commonUtil.createErrorDetailsFilesAndUpdateDB(uploadDate,readerUtil.getErrorMapList());

					 inputFileDetailsManager.stream()
							.filter(Inputfiledetails.STATUS.equal(CommonConstants.FILE_READY_STATUS)
									.and(Inputfiledetails.UPLOAD_DATE.equal(uploadDate)))
							.map(Inputfiledetails.STATUS.setTo(CommonConstants.FILE_PROCESSED_STATUS))					
							.forEach(inputFileDetailsManager.updater());
					 
					 processedFlag.set(true);

				} catch (Exception e) {
					LOGGER.error(
							"### [" + jobId + "] - Exception occured in process method ###" + "\n" + e.getMessage());
					e.printStackTrace();
				}
			});

			if(processedFlag.get()==true) {
				commonUtil.sendMailReport(false);
			}
			
		} catch (Exception e) {
			LOGGER.error("### [" + jobId + "] - Exception occured in process method ###" + "\n" + e.getMessage());
			e.printStackTrace();
		}

		LOGGER.info("### [" + jobId + "] - Exiting process method ###");
		LOGGER.info("### [" + jobId + "] - #############################");

	}

}
