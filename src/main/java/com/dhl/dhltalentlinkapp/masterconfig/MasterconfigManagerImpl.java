package com.dhl.dhltalentlinkapp.masterconfig;


import java.util.Optional;

import com.dhl.dhltalentlinkapp.masterconfig.generated.GeneratedMasterconfigManagerImpl;

/**
 * The default implementation for the manager of every {@link
 * com.dhl.dhltalentlinkapp.masterconfig.Masterconfig} entity.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dhl
 */
public final class MasterconfigManagerImpl 
extends GeneratedMasterconfigManagerImpl 
implements MasterconfigManager {
	
	@Override
	public String getValue(String configName) {

		Optional<Masterconfig> configDetails = this.stream().filter(Masterconfig.CONFIG_NAME.equal(configName))
				.findFirst();
		String response = "";
		if (configDetails.isPresent()) {
			response = configDetails.get().getConfigValue();
		}

		return response;
	}

	@Override
	public Integer getIntValue(String configName) {

		Optional<Masterconfig> configDetails = this.stream().filter(Masterconfig.CONFIG_NAME.equal(configName))
				.findFirst();
		int response = 0;
		if (configDetails.isPresent()) {
			response = Integer.parseInt(configDetails.get().getConfigValue());
		}

		return response;
	}
	
	
}