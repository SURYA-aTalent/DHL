package com.dhl.dhltalentlinkapp.outbound.sdhexportdata;

import com.dhl.dhltalentlinkapp.outbound.dto.UpdateGidResponseDto;
import com.dhl.dhltalentlinkapp.outbound.sdhexportdata.generated.GeneratedSdhexportdatadtlsManager;

/**
 * The main interface for the manager of every
 * {@link com.dhl.dhltalentlinkapp.outbound.sdhexportdata.Sdhexportdatadtls}
 * entity.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dhl
 */
public interface SdhexportdatadtlsManager extends GeneratedSdhexportdatadtlsManager {

	UpdateGidResponseDto updateCandidateGid(String applicantId, String gid);

}