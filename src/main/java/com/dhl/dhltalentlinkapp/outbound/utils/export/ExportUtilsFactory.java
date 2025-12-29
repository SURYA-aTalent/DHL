package com.dhl.dhltalentlinkapp.outbound.utils.export;

import org.springframework.beans.factory.annotation.Autowired;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.outbound.utils.export.sdh.SDHExportUtil;
import com.dhl.dhltalentlinkapp.outbound.utils.export.sdh.SDHExportUtilV2;

public class ExportUtilsFactory {

	private @Autowired AustraliaExportUtil australiaExportUtil;
	private @Autowired IndiaExportUtil indiaExportUtil;	
	private @Autowired SingaporeExportUtil singaporeExportUtil;	
	private @Autowired SDHExportUtil sdhExportUtil;
	private @Autowired SDHExportUtilV2 sdhExportUtilv2;

	public ExportDataUtil getUtilInstance(String countryName) {

		if (countryName.equals(CommonConstants.COUNTRY_AUSTRALIA)) {
			return australiaExportUtil;
		} else if (countryName.equals(CommonConstants.COUNTRY_INDIA)) {
			return indiaExportUtil;
		}else if (countryName.equals(CommonConstants.COUNTRY_SINGAPORE)) {
			return singaporeExportUtil;
		} else if (countryName.equals(CommonConstants.MYHR_COUNTRIES)) {
			return sdhExportUtil;
		} else if (countryName.equals(CommonConstants.NON_MYHR_COUNTRIES)) {
			return sdhExportUtilv2;
		}

		return null;

	}

}
