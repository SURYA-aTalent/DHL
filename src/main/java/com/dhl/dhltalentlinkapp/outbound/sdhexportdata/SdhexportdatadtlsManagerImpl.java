package com.dhl.dhltalentlinkapp.outbound.sdhexportdata;

import java.sql.Timestamp;
import java.util.Comparator;
import java.util.Optional;

import com.dhl.dhltalentlinkapp.outbound.dto.UpdateGidResponseDto;
import com.dhl.dhltalentlinkapp.outbound.sdhexportdata.generated.GeneratedSdhexportdatadtlsManagerImpl;
import com.dhl.dhltalentlinkapp.services.UserDetailsService;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

/**
 * The default implementation for the manager of every
 * {@link com.dhl.dhltalentlinkapp.outbound.sdhexportdata.Sdhexportdatadtls}
 * entity.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dhl
 */
public final class SdhexportdatadtlsManagerImpl extends GeneratedSdhexportdatadtlsManagerImpl
		implements SdhexportdatadtlsManager {

	private final static Logger LOGGER = LoggerManager.getLogger(SdhexportdatadtlsManagerImpl.class);
	UserDetailsService userService = new UserDetailsService();
	@Override
	public UpdateGidResponseDto updateCandidateGid(String applicantId, String gid) {
		// String response = "{\"status\":\"success\",\"message\":\"Successfully Updated
		// Gid for applicantId: "
		// + applicantId + " \"}";
		UpdateGidResponseDto response = new UpdateGidResponseDto();
		LOGGER.info("Updating Gid for applicantId "+applicantId+", GID: "+gid);
		try {
			Optional<Sdhexportdatadtls> sdhExportData = this.stream()
					.filter(Sdhexportdatadtls.PERSON_NUMBER.equal(applicantId)).max(Comparator.comparing(Sdhexportdatadtls::getSdhExportDataId));
			
			if (sdhExportData.isPresent()) {
				sdhExportData.get().setGid(gid);
				sdhExportData.get().setUpdatedTime(new Timestamp(System.currentTimeMillis()));
				this.update(sdhExportData.get());
				response.setStatus("Success");
				response.setMessage("Successfully Updated Gid for applicantId: " + applicantId+" in DB");
				userService.updateCandidateGidInTLK(applicantId.replace("TalentLink_",""),gid);
				response.setMessage("Successfully Updated Gid for applicantId: " + applicantId+" in TLK");
			} else {
				LOGGER.info("No Data Found");
				response.setStatus("Failure");
				response.setMessage("No Data Found for applicantId: " + applicantId);
			}
		} catch (Exception e) {
			LOGGER.error("Exception occured while updating gid " + e.getMessage());
			e.printStackTrace();
			response.setStatus("Error");
			response.setMessage("Gid Update failed for applicantId: " + applicantId);

		}

		return response;

	}
}