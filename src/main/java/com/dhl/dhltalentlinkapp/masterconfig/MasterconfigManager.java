package com.dhl.dhltalentlinkapp.masterconfig;

import com.dhl.dhltalentlinkapp.masterconfig.generated.GeneratedMasterconfigManager;

/**
 * The main interface for the manager of every {@link
 * com.dhl.dhltalentlinkapp.masterconfig.Masterconfig} entity.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dhl
 */
public interface MasterconfigManager extends GeneratedMasterconfigManager {
	
	
	public String getValue(String configName);
	public Integer getIntValue(String configName);
}