package com.dhl.dhltalentlinkapp.dao;

import java.util.concurrent.Callable;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.utils.ApiUtils;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class TlkApiProcessor implements Callable<String> {

	private ApiUtils apiUtilInstance;

	private FileDetails fileDetails;

	private int retryCount;

	private final static Logger LOGGER = LoggerManager.getLogger(TlkApiProcessor.class);

	private String action;

	public TlkApiProcessor(ApiUtils apiUtilInstance, FileDetails fileDetails, String action) {
		this.apiUtilInstance = apiUtilInstance;
		this.fileDetails = fileDetails;
		this.action = action;
		this.retryCount = 1;
	}

	@Override
	public String call() throws Exception {

		String response = null;
		try {

			response = processRequest();
		} catch (Exception e) {

			LOGGER.error("Exception occured in TlkApiProcessor " + e.getMessage());
			e.printStackTrace();

			retryCount++;
			if (retryCount <= 3) {
				try {
					Thread.sleep(180 * 1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				response = processRequest();
			}

		}
		return response;
	}

	public String processRequest() throws Exception {

		String response = null;

		switch (action) {

		case CommonConstants.ADD_UPDATE_MANAGER_DETAILS:
			apiUtilInstance.addNewUserDetails((ManagerDetails) fileDetails);
			break;

		case CommonConstants.ADD_UPDATE_DEPT_DETAILS:
			apiUtilInstance.linkOrUnlinkValues((DepartmentDetails) fileDetails, true);
			break;

		case CommonConstants.ADD_UPDATE_JOB_DETAILS:
			apiUtilInstance.linkOrUnlinkValues((JobDetails) fileDetails, true);

			break;

		case CommonConstants.ADD_UPDATE_LEGAL_DETAILS:
			apiUtilInstance.linkOrUnlinkValues((LegalEntityDetails) fileDetails, true);

			break;

		case CommonConstants.ADD_UPDATE_POS_DETAILS:
			apiUtilInstance.linkOrUnlinkValues((PositionDetails) fileDetails, true);
			break;

		// __________________________________________________________________

		case CommonConstants.REMOVE_MANAGER_DETAILS:
			apiUtilInstance.deleteUserDetails((ManagerDetails) fileDetails);
			break;

		case CommonConstants.REMOVE_DEPT_DETAILS:
			apiUtilInstance.linkOrUnlinkValues((DepartmentDetails) fileDetails, false);
			break;

		case CommonConstants.REMOVE_JOB_DETAILS:
			apiUtilInstance.linkOrUnlinkValues((JobDetails) fileDetails, false);

			break;

		case CommonConstants.REMOVE_LEGAL_DETAILS:
			apiUtilInstance.linkOrUnlinkValues((LegalEntityDetails) fileDetails, false);

			break;

		case CommonConstants.REMOVE_POS_DETAILS:
			apiUtilInstance.linkOrUnlinkValues((PositionDetails) fileDetails, false);
			break;
		}

		response = "SUCCESS";

		return response;

	}

}
