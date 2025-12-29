package com.dhl.dhltalentlinkapp.main;

import com.dhl.dhltalentlinkapp.utils.CSVReaderUtil;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.dhl.dhltalentlinkapp.dao.PositionDetails;
import com.dhl.dhltalentlinkapp.outbound.dao.export.AustraliaExportData;
import com.dhl.dhltalentlinkapp.outbound.dao.export.ExportData;
import com.dhl.dhltalentlinkapp.pojo.ErrorDetail;
import com.dhl.dhltalentlinkapp.utils.ApiUtils;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class DHLTalentLinkApplication {

	private final static Logger LOGGER = LoggerManager.getLogger(DHLTalentLinkApplication.class);

	public static void main(String[] args) {

//		CSVReaderUtil readerUtil = new CSVReaderUtil();
//		ApiUtils commonUtils = new ApiUtils();

		// readerUtil.loadCSVData();
//		readerUtil.displayData();

//		commonUtils.processNewOrChangedRecords();

//		commonUtils.processEndDatedRecords();
		ValidatorFactory factory = null;
		Validator validator = null;
		factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
		
		AustraliaExportData data = new AustraliaExportData(); 
		
		Set<ConstraintViolation<ExportData>> violations = validator.validate(data);
		if (violations.size() > 0) {
			for (ConstraintViolation<ExportData> violation : violations) {
				System.out.println(violation.getMessage());				
			}		
		}

	}

}
