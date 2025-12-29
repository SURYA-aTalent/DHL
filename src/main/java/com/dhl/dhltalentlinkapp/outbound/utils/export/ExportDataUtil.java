package com.dhl.dhltalentlinkapp.outbound.utils.export;

import java.util.List;

import com.dhl.dhltalentlinkapp.dao.StructuredFormQADto;
import com.dhl.dhltalentlinkapp.outbound.dao.export.Data;
import com.dhl.dhltalentlinkapp.outbound.dao.export.ExportData;

public abstract class ExportDataUtil {

	public abstract Data generateExportData(List<StructuredFormQADto> finalQuestAnswerList);

	public String removeLastComma(String originalString) {

		if (originalString!=null && originalString.charAt(originalString.length() - 1) == ',')
			return originalString.substring(0, originalString.length() - 1);
		else
			return originalString;
	}

}
