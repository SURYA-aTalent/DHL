package com.dhl.dhltalentlinkapp.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Properties;
import java.util.Vector;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.cronutils.utils.StringUtils;
import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.inputfiledetails.Inputfiledetails;
import com.dhl.dhltalentlinkapp.inputfiledetails.InputfiledetailsImpl;
import com.dhl.dhltalentlinkapp.inputfiledetails.InputfiledetailsManager;
import com.dhl.dhltalentlinkapp.inputfiledetails.UploadDateComparator;
import com.dhl.dhltalentlinkapp.masterconfig.MasterconfigManager;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class SFTPUtil {

	protected @Autowired InputfiledetailsManager inputFileDetailsManager;
	protected @Autowired MasterconfigManager masterConfigManager;
	private final static Logger LOGGER = LoggerManager.getLogger(SFTPUtil.class);
	private String sftpHost;
	private Integer sftpPort;
	private String sftpUserName;
	private String sftpPassword;
	private String localFilePath;
	private String remoteFilePath;
	private String remoteSubmittedFilePath;
	private String remoteOutboundFilePath;
	private String remoteOutboundFilePathForSDH;
	private UploadDateComparator uploadComparator;
	
	private String sftpSDHHost;	
	private String sftpSDHUserName;
	private String sftpSDHPassword;
	
	private SimpleDateFormat sdf;
	private JSch jsch;

	@PostConstruct
	public void initializeValues() {

		sftpHost = masterConfigManager.getValue(CommonConstants.SFTP_HOST);
		sftpPort = masterConfigManager.getIntValue(CommonConstants.SFTP_PORT);
		sftpUserName = masterConfigManager.getValue(CommonConstants.SFTP_USERNAME);
		sftpPassword = masterConfigManager.getValue(CommonConstants.SFTP_PASSWORD);
		
		sftpSDHHost = masterConfigManager.getValue(CommonConstants.SDH_SFTP_HOST);
		sftpSDHUserName = masterConfigManager.getValue(CommonConstants.SDH_SFTP_USERNAME);
		sftpSDHPassword = masterConfigManager.getValue(CommonConstants.SDH_SFTP_PASSWORD);
		
		localFilePath = masterConfigManager.getValue(CommonConstants.SFTP_LOCAL_FILE_PATH);
		remoteFilePath = masterConfigManager.getValue(CommonConstants.SFTP_REMOTE_FILE_PATH);
		remoteSubmittedFilePath = masterConfigManager.getValue(CommonConstants.SFTP_REMOTE_SUBMITTED_FILE_PATH);
		remoteOutboundFilePath = masterConfigManager.getValue(CommonConstants.SFTP_REMOTE_OUTBOOUND_FILE_PATH);
		remoteOutboundFilePathForSDH = masterConfigManager
				.getValue(CommonConstants.SFTP_REMOTE_OUTBOOUND_SDH_FILE_PATH);
		jsch = new JSch();
		sdf = new SimpleDateFormat(CommonConstants.UPLOAD_DATE_FORMAT);
		uploadComparator = new UploadDateComparator();

	}

	public List<Inputfiledetails> downloadFilesForProcessing() {

		Session session = null;
		Channel channel = null;
		final ChannelSftp channelSftp;
		Inputfiledetails inputFileDtls = null;
		List<Inputfiledetails> inputFileList = null;
		Date lastUploadDate = null;
		Date fileDate = null;

		String fileName = "";
		String fileDateStr = "";

		try {

			session = jsch.getSession(sftpUserName, sftpHost, sftpPort);
			session.setPassword(sftpPassword);
			Properties config = new Properties();
			config.put(CommonConstants.SFTP_STRICT_HOST_CHECKING, CommonConstants.NO_TEXT);
			session.setConfig(config);
			session.connect();
			channel = session.openChannel(CommonConstants.SFTP_CHANNEL_NAME);
			channel.connect();
			channelSftp = (ChannelSftp) channel;
			channelSftp.cd(remoteFilePath);

			Vector filelist = channelSftp.ls(remoteFilePath);

			LOGGER.info("File List Size: " + filelist.size());

			if (filelist.size() > 0) {
				inputFileDtls = new InputfiledetailsImpl();
				inputFileList = new ArrayList<Inputfiledetails>();
				List<String> validProcessedStatus = new ArrayList<String>();
				validProcessedStatus.add(CommonConstants.FILE_PROCESSED_STATUS);
				validProcessedStatus.add(CommonConstants.EMAIL_SENT);

				Comparator<Inputfiledetails> idComparator = Comparator.comparing(Inputfiledetails::getFileId)
						.reversed();
				Optional<Inputfiledetails> lastProcessedinputFileDetails = inputFileDetailsManager.stream()
						.filter(Inputfiledetails.STATUS.in(validProcessedStatus)).sorted(idComparator).findFirst();

				if (lastProcessedinputFileDetails.isPresent())
					lastUploadDate = sdf.parse(lastProcessedinputFileDetails.get().getUploadDate().get());

				LOGGER.info("lastUploadDate: " + lastUploadDate);

				for (int i = 0; i < filelist.size(); i++) {
					LsEntry entry = (LsEntry) filelist.get(i);
					fileName = entry.getFilename();
					if (!StringUtils.isEmpty(fileName.replaceAll("\\.", CommonConstants.EMPTY_VALUE))) {

						fileDateStr = getFileDate(fileName);
						fileDate = sdf.parse(fileDateStr);
						LOGGER.info("fileName: " + fileName);
						LOGGER.info("fileDateStr: " + fileDateStr);
						if ((lastUploadDate != null && fileDate.after(lastUploadDate))
								|| (lastUploadDate != null && fileDate.equals(lastUploadDate))
								|| (lastUploadDate == null)) {
							channelSftp.get(remoteFilePath + fileName, localFilePath + fileName);
							inputFileDtls = new InputfiledetailsImpl();
							inputFileDtls.setFileName(fileName);
							inputFileDtls.setUploadDate(fileDateStr);
							inputFileDtls.setStatus(CommonConstants.FILE_READY_STATUS);
							inputFileList.add(inputFileDtls);

						}
					}
				}

				inputFileList.sort(uploadComparator);
				inputFileList.forEach(inputFile -> {
					inputFile.setCreatedDate(new Timestamp(System.currentTimeMillis()));
					inputFileDetailsManager.persist(inputFile);
					try {
						channelSftp.rename(remoteFilePath + inputFile.getFileName().get(),
								remoteSubmittedFilePath + inputFile.getFileName().get());
					} catch (SftpException e) {
						LOGGER.error("Exception occured while moving file " + inputFile.getFileName().get() + " "
								+ e.getMessage());
						e.printStackTrace();
					}
				});
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (session != null)
				session.disconnect();
			if (channel != null)
				channel.disconnect();
		}

		return inputFileList;
	}

	private static String getFileDate(String filename) {

		LOGGER.debug("#### Entering getFileDate ####");
		String response = null;
		try {
			String dateString = filename.substring(filename.lastIndexOf(CommonConstants.UNDER_SCORE) + 1);
			String finalFileDate = dateString.replace(dateString.substring(dateString.lastIndexOf(CommonConstants.DOT)),
					"");
			LOGGER.debug(filename + "->" + finalFileDate);
			if (finalFileDate.length() >= 8)
				response = finalFileDate.substring(0, 8);

			LOGGER.debug(finalFileDate.substring(0, 8));
		} catch (Exception e) {
			LOGGER.error("Exception occured in getFileDate" + e.getMessage());
			e.printStackTrace();
		}
		LOGGER.debug("#### Exiting getFileDate ####");

		return response;

	}

	public void uploadFilesToServer(List<String> filesToUpload, boolean isSDHData) {

		LOGGER.info("Entering in uploadFilesToServer method");

		Session session = null;
		Channel channel = null;
		final ChannelSftp channelSftp;
		if (!isSDHData) {
			try {

				session = jsch.getSession(sftpUserName, sftpHost, sftpPort);
				session.setPassword(sftpPassword);
				Properties config = new Properties();
				config.put(CommonConstants.SFTP_STRICT_HOST_CHECKING, CommonConstants.NO_TEXT);
				session.setConfig(config);
				session.connect();
				channel = session.openChannel(CommonConstants.SFTP_CHANNEL_NAME);
				channel.connect();
				channelSftp = (ChannelSftp) channel;
				filesToUpload.forEach(fileLocation -> {
					String fileName = fileLocation.substring(fileLocation.lastIndexOf("/") + 1);
					fileName = fileName.replace("_encrypted", "");
					try {
						LOGGER.info("fileLocation: " + fileLocation + ", remoteLocation: " + remoteOutboundFilePath
								+ fileName);
						channelSftp.put(fileLocation, remoteOutboundFilePath + fileName);

					} catch (SftpException e) {
						LOGGER.error("Exception occured in SDH uploadFilesToServer.." + e.getMessage());
						e.printStackTrace();
					}
				});

				channelSftp.exit();
			} catch (Exception ex) {
				LOGGER.error("Exception occured in myHR uploadFilesToServer" + ex.getMessage());
				ex.printStackTrace();
			} finally {
				if (session != null)
					session.disconnect();
				if (channel != null)
					channel.disconnect();
			}
		} else {

			try {

				session = jsch.getSession(sftpSDHUserName, sftpSDHHost, sftpPort);
				session.setPassword(sftpSDHPassword);
				Properties config = new Properties();
				config.put(CommonConstants.SFTP_STRICT_HOST_CHECKING, CommonConstants.NO_TEXT);
				session.setConfig(config);
				session.connect();
				channel = session.openChannel(CommonConstants.SFTP_CHANNEL_NAME);
				channel.connect();
				channelSftp = (ChannelSftp) channel;
				filesToUpload.forEach(fileLocation -> {
					String fileName = fileLocation.substring(fileLocation.lastIndexOf("/") + 1);
					fileName = fileName.replace("_encrypted", "");
					try {

						LOGGER.info("fileLocation: " + fileLocation + ", remoteLocation: "
								+ remoteOutboundFilePathForSDH + fileName);
						channelSftp.put(fileLocation, remoteOutboundFilePathForSDH + fileName);

					} catch (SftpException e) {
						LOGGER.error("Exception occured in SDH uploadFilesToServer.." + e.getMessage());
						e.printStackTrace();
					}
				});

				channelSftp.exit();
			} catch (Exception ex) {
				LOGGER.error("Exception occured in SDH uploadFilesToServer" + ex.getMessage());
				ex.printStackTrace();
			} finally {
				if (session != null)
					session.disconnect();
				if (channel != null)
					channel.disconnect();
			}

		}

		LOGGER.info("Exiting in uploadFilesToServer method");

	}

}
