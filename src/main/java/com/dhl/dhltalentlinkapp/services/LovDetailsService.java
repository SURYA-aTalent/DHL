package com.dhl.dhltalentlinkapp.services;

public class LovDetailsService {

	/*
	 * 
	 * private final static Logger LOGGER =
	 * LoggerManager.getLogger(LovDetailsService.class); LovWebService_Service
	 * myService = null;
	 * 
	 * LovWebService service = null;
	 * 
	 * BindingProvider bindingProvider = null;
	 * 
	 * LovDetailsService() {
	 * 
	 * myService = new LovWebService_Service();
	 * 
	 * service = myService.getLovWebServicePort();
	 * 
	 * bindingProvider = (BindingProvider) service;
	 * 
	 * bindingProvider.getRequestContext().put(BindingProvider.
	 * ENDPOINT_ADDRESS_PROPERTY,
	 * "https://api3.lumesse-talenthub.com/HRIS/SOAP/LOV?api_key=686170a1-b10c-b79d-ae8c-9b9992c65ecb"
	 * );
	 * 
	 * }
	 * 
	 * public static void main(String args[]) { LovDetailsService lovService = new
	 * LovDetailsService(); lovService.getLovDetails(); }
	 * 
	 * public void getLovDetails() {
	 * 
	 * LOGGER.info("### Entering getLovDetails method ###");
	 * 
	 * LovWebService_Service myService = new LovWebService_Service();
	 * 
	 * LovWebService service = myService.getLovWebServicePort();
	 * 
	 * BindingProvider bindingProvider = (BindingProvider) service; //
	 * System.out.println(bindingProvider.getRequestContext().get(BindingProvider.
	 * ENDPOINT_ADDRESS_PROPERTY));
	 * bindingProvider.getRequestContext().put(BindingProvider.
	 * ENDPOINT_ADDRESS_PROPERTY,
	 * "https://api3.lumesse-talenthub.com/HRIS/SOAP/LOV?api_key=686170a1-b10c-b79d-ae8c-9b9992c65ecb"
	 * );
	 * 
	 * List<LovDto> myResponse =
	 * service.getLovNames(LovTypeCategory.SYSTEMCONFIGURABLE); for (LovDto dto :
	 * myResponse) {
	 * 
	 * Lovnames lovNames = new LovnamesImpl();
	 * 
	 * lovNames.setLovName(dto.getLovName());
	 * lovNames.setLovTypeCategory(CommonConstants.SYSTEM_CONFIGURABLE);
	 * lovNames.setLovId(dto.getLovId().intValue());
	 * lovNames.setTypeName(dto.getTypeName().value());
	 * lovNames.setOrder(dto.getOrder());
	 * 
	 * LOGGER.info("### SYSTEM_CONFIGURABLE LovName: " + dto.getLovName());
	 * 
	 * }
	 * 
	 * myResponse = service.getLovNames(LovTypeCategory.CONFIGURABLE); for (LovDto
	 * dto : myResponse) {
	 * 
	 * Lovnames lovNames = new LovnamesImpl();
	 * 
	 * lovNames.setLovName(dto.getLovName());
	 * lovNames.setLovTypeCategory(CommonConstants.CONFIGURABLE);
	 * lovNames.setLovId(dto.getLovId().intValue());
	 * lovNames.setTypeName(dto.getTypeName().value());
	 * lovNames.setOrder(dto.getOrder());
	 * 
	 * LOGGER.info("### CONFIGURABLE LovName: " + dto.getLovName());
	 * 
	 * }
	 * 
	 * myResponse = service.getLovNames(LovTypeCategory.SYSTEMFIXED); for (LovDto
	 * dto : myResponse) {
	 * 
	 * Lovnames lovNames = new LovnamesImpl();
	 * 
	 * lovNames.setLovName(dto.getLovName());
	 * lovNames.setLovTypeCategory(CommonConstants.SYSTEMFIXED);
	 * lovNames.setLovId(dto.getLovId().intValue());
	 * lovNames.setTypeName(dto.getTypeName().value());
	 * lovNames.setOrder(dto.getOrder());
	 * 
	 * LOGGER.info("### SYSTEMFIXED LovName: " + dto.getLovName());
	 * 
	 * }
	 * 
	 * myResponse = service.getLovNames(LovTypeCategory.USERDATA); for (LovDto dto :
	 * myResponse) {
	 * 
	 * Lovnames lovNames = new LovnamesImpl();
	 * 
	 * lovNames.setLovName(dto.getLovName());
	 * lovNames.setLovTypeCategory(CommonConstants.USERDATA);
	 * lovNames.setLovId(dto.getLovId().intValue());
	 * lovNames.setTypeName(dto.getTypeName().value());
	 * lovNames.setOrder(dto.getOrder());
	 * 
	 * LOGGER.info("### USERDATA LovName: " + dto.getLovName());
	 * 
	 * }
	 * 
	 * LOGGER.info("### Exiting getLovDetails method ###");
	 * 
	 * }
	 */
}
