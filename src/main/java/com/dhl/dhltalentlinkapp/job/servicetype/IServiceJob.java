package com.dhl.dhltalentlinkapp.job.servicetype;

import java.util.Map;

public interface IServiceJob {

	public void process(Map<String,String> inputMap,String jobId,String jobName);
}
