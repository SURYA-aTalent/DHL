package com.dhl.dhltalentlinkapp.job.servicetype.impl;

public class LovSyncServiceJobImpl {/*implements IServiceJob 

	private final static Logger LOGGER = LoggerManager.getLogger(LovSyncServiceJobImpl.class);

	protected @Autowired QuartzSchedulerManager scheduleManager;

	protected @Autowired LovnamesManager lovNamesManager;

	@Override
	public void process(Map<String, String> inputMap, String jobId, String jobName) {

		LOGGER.info("### [" + jobId + "] - #############################");
		LOGGER.info("### [" + jobId + "] - Entering process method ###");

		LovWebService_Service myService = new LovWebService_Service();

		LovWebService service = myService.getLovWebServicePort();

		BindingProvider bindingProvider = (BindingProvider) service;
		//System.out.println(bindingProvider.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY));
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://api3.lumesse-talenthub.com/HRIS/SOAP/LOV?api_key=686170a1-b10c-b79d-ae8c-9b9992c65ecb");

		long beforeCount = lovNamesManager.stream().count();

		List<LovDto> myResponse = service.getLovNames(LovTypeCategory.SYSTEMCONFIGURABLE);
		for (LovDto dto : myResponse) {

			Optional<Lovnames> lovNameEntry = lovNamesManager.stream()
					.filter(Lovnames.LOV_NAME.equalIgnoreCase(dto.getLovName())).findFirst();

			if (!lovNameEntry.isPresent()) {
				Lovnames lovNames = new LovnamesImpl();

				lovNames.setLovName(dto.getLovName());
				lovNames.setLovTypeCategory(CommonConstants.SYSTEM_CONFIGURABLE);
				lovNames.setLovId(dto.getLovId().intValue());
				lovNames.setTypeName(dto.getTypeName().value());
				lovNames.setOrder(dto.getOrder());

				LOGGER.info("### [" + jobId + "] - Adding LovName: " + dto.getLovName());
				lovNamesManager.persist(lovNames);
			}

		}

		myResponse = service.getLovNames(LovTypeCategory.CONFIGURABLE);
		for (LovDto dto : myResponse) {
			Optional<Lovnames> lovNameEntry = lovNamesManager.stream()
					.filter(Lovnames.LOV_NAME.equalIgnoreCase(dto.getLovName())).findFirst();

			if (!lovNameEntry.isPresent()) {
				Lovnames lovNames = new LovnamesImpl();

				lovNames.setLovName(dto.getLovName());
				lovNames.setLovTypeCategory(CommonConstants.CONFIGURABLE);
				lovNames.setLovId(dto.getLovId().intValue());
				lovNames.setTypeName(dto.getTypeName().value());
				lovNames.setOrder(dto.getOrder());

				LOGGER.info("### [" + jobId + "] - Adding LovName: " + dto.getLovName());
				lovNamesManager.persist(lovNames);

			}

		}

		myResponse = service.getLovNames(LovTypeCategory.SYSTEMFIXED);
		for (LovDto dto : myResponse) {
			Optional<Lovnames> lovNameEntry = lovNamesManager.stream()
					.filter(Lovnames.LOV_NAME.equalIgnoreCase(dto.getLovName())).findFirst();

			if (!lovNameEntry.isPresent()) {
				Lovnames lovNames = new LovnamesImpl();

				lovNames.setLovName(dto.getLovName());
				lovNames.setLovTypeCategory(CommonConstants.SYSTEMFIXED);
				lovNames.setLovId(dto.getLovId().intValue());
				lovNames.setTypeName(dto.getTypeName().value());
				lovNames.setOrder(dto.getOrder());
				

				LOGGER.info("### [" + jobId + "] - Adding LovName: " + dto.getLovName());
				lovNamesManager.persist(lovNames);
			}

		}

		myResponse = service.getLovNames(LovTypeCategory.USERDATA);
		for (LovDto dto : myResponse) {
			Optional<Lovnames> lovNameEntry = lovNamesManager.stream()
					.filter(Lovnames.LOV_NAME.equalIgnoreCase(dto.getLovName())).findFirst();

			if (!lovNameEntry.isPresent()) {
				Lovnames lovNames = new LovnamesImpl();

				lovNames.setLovName(dto.getLovName());
				lovNames.setLovTypeCategory(CommonConstants.USERDATA);
				lovNames.setLovId(dto.getLovId().intValue());
				lovNames.setTypeName(dto.getTypeName().value());
				lovNames.setOrder(dto.getOrder());

				LOGGER.info("### [" + jobId + "] - Adding LovName: " + dto.getLovName());
				lovNamesManager.persist(lovNames);
			}

		}

		long afterCount = lovNamesManager.stream().count();

		long difference = afterCount - beforeCount;

		if (difference > 0)
			LOGGER.info("### [" + jobId + "] - Successfully Added " + difference + " entries in Lovnames table");

		LOGGER.info("### [" + jobId + "] - Exiting process method ###");
		LOGGER.info("### [" + jobId + "] - #############################");
	}
*/
}
