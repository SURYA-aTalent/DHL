package com.dhl.dhltalentlinkapp.outbound.dao.export.sdh;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SDHExportDataList {
	private List<SDHExportData> exportData;

	public List<SDHExportData> getExportData() {
		return exportData;
	}

	public void setExportData(List<SDHExportData> exportData) {
		this.exportData = exportData;
	}

}
