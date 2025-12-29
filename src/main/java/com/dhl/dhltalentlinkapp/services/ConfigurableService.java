package com.dhl.dhltalentlinkapp.services;

import static com.dhl.dhltalentlinkapp.constants.CommonConstants.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;

import com.cronutils.utils.StringUtils;
import com.dhl.dhltalentlinkapp.dao.ManagerDetails;
import com.dhl.dhltalentlinkapp.pojo.LovDetails;
import com.dhl.dhltalentlinkapp.utils.ApiUtils;
import com.dhl.dhltalentlinkapp.utils.CSVReaderUtil;
import com.mrted.ws.configfields.ConfigurableFieldWebService;
import com.mrted.ws.configfields.ConfigurableFieldWebService_Service;
import com.mrted.ws.configfields.GenericLovDto;
import com.mrted.ws.configfields.LabelDto;
import com.mrted.ws.configfields.LovLabelsDto;

import com.mrted.ws.configfields.ObjectFactory;
import com.mrted.ws.configfields.OperationResultDto;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class ConfigurableService {

	private final static Logger LOGGER = LoggerManager.getLogger(ConfigurableService.class);

	ConfigurableFieldWebService_Service configWebService = null;
	ConfigurableFieldWebService configService = null;

	BindingProvider bindingProvider = null;

	public ConfigurableService() {

		configWebService = new ConfigurableFieldWebService_Service();
		configService = configWebService.getConfigurableFieldWebServicePort();

		bindingProvider = (BindingProvider) configService;
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://api5.lumesse-talenthub.com/HRIS/SOAP/ConfigurableFields?api_key=686170a1-b10c-b79d-ae8c-9b9992c65ecb");
	}

	public static void main(String args[]) {

	
		ConfigurableService configService = new ConfigurableService();
		LovHierarchyService myHierarchyService = new LovHierarchyService();

		ApiUtils apiUtils = new ApiUtils();
		CSVReaderUtil csvReaderUtil = new CSVReaderUtil();
		csvReaderUtil.initializeData();
		List<ManagerDetails> managerDtlsList = csvReaderUtil.readManagerDetails("/home/mathan/Desktop/Aug3/myHR_TalentLink_MANAGER_DETAILS_2023080284032.csv",
				0);
		System.out.println(managerDtlsList.size());
		
		System.exit(0);
		int i = 1;
		
		Map<Long,Long> myMap=new HashMap<Long,Long>();
		
		myMap.put(49260L,49263L);
		myMap.put(52777L,52783L);
		myMap.put(51878L,47829L);
		myMap.put(51596L,49816L);
		myMap.put(49250L,49252L);
		myMap.put(50722L,50725L);
		myMap.put(49394L,49395L);
		myMap.put(100537L,47881L);
		myMap.put(49555L,49557L);
		myMap.put(52452L,49939L);
		myMap.put(49232L,49227L);
		myMap.put(49426L,49428L);
		myMap.put(51013L,51018L);
		myMap.put(48788L,48789L);
		myMap.put(50936L,50939L);
		myMap.put(51993L,51940L);
		myMap.put(50844L,50005L);
		myMap.put(50487L,50488L);
		myMap.put(50981L,50983L);
		myMap.put(51214L,47647L);
		myMap.put(51831L,50617L);
		myMap.put(51591L,51592L);
		myMap.put(50717L,50721L);
		myMap.put(49459L,49273L);
		myMap.put(52359L,52362L);
		myMap.put(51978L,51985L);
		myMap.put(50772L,50777L);
		myMap.put(53517L,53519L);
		myMap.put(52354L,48539L);
		myMap.put(52584L,47647L);
		myMap.put(52306L,51012L);
		myMap.put(52014L,47647L);
		myMap.put(51973L,51012L);
		myMap.put(49307L,49310L);
		myMap.put(53339L,50601L);
		myMap.put(50966L,50601L);
		myMap.put(48172L,48177L);
		myMap.put(51122L,50802L);
		myMap.put(55274L,50601L);
		myMap.put(51405L,50084L);
		myMap.put(106898L,106900L);
		myMap.put(52943L,50067L);
		myMap.put(47520L,47508L);
		myMap.put(47520L,47508L);
		myMap.put(103708L,103721L);
		myMap.put(53017L,53020L);
		myMap.put(51742L,51746L);
		myMap.put(52710L,48153L);
		myMap.put(52467L,52470L);
		myMap.put(52192L,52195L);
		myMap.put(52583L,50601L);
		myMap.put(52238L,52239L);
		myMap.put(52626L,50601L);
		myMap.put(52386L,50601L);
		myMap.put(51956L,51961L);
		myMap.put(52490L,50611L);
		myMap.put(52165L,51012L);
		myMap.put(51936L,51940L);
		myMap.put(53210L,50601L);
		myMap.put(53382L,50643L);
		myMap.put(52862L,51787L);
		myMap.put(53415L,51787L);
		myMap.put(53252L,53254L);
		myMap.put(53217L,50028L);
		myMap.put(52744L,52748L);
		myMap.put(95427L,95430L);
		myMap.put(48745L,47863L);
		myMap.put(48355L,48359L);
		myMap.put(53311L,51012L);
		myMap.put(53186L,50846L);
		myMap.put(51567L,51570L);
		myMap.put(53285L,50601L);
		myMap.put(49051L,49053L);
		myMap.put(51410L,49939L);
		myMap.put(53044L,50601L);
		myMap.put(53514L,51012L);
		myMap.put(53476L,51012L);
		myMap.put(53253L,51012L);
		myMap.put(52190L,52196L);
		myMap.put(53526L,51012L);
		myMap.put(53195L,50028L);
		myMap.put(53468L,51012L);
		myMap.put(52836L,51012L);
		myMap.put(48569L,48521L);
		myMap.put(53021L,51012L);
		myMap.put(53419L,51012L);
		myMap.put(52973L,51787L);
		myMap.put(53885L,53886L);
		myMap.put(52857L,50643L);
		myMap.put(53925L,50644L);
		myMap.put(54133L,53197L);
		myMap.put(53568L,51012L);
		myMap.put(53742L,53197L);
		myMap.put(53086L,50028L);
		myMap.put(52914L,52916L);
		myMap.put(53266L,51548L);
		myMap.put(53509L,51012L);
		myMap.put(54049L,54052L);
		myMap.put(52953L,51012L);
		myMap.put(51009L,51012L);
		myMap.put(54195L,51012L);
		myMap.put(53817L,51012L);
		myMap.put(49365L,49206L);
		myMap.put(105556L,105564L);
		myMap.put(95436L,50601L);
		myMap.put(53862L,53867L);
		myMap.put(53889L,51787L);
		myMap.put(48547L,48553L);
		myMap.put(53683L,53685L);
		myMap.put(53656L,50601L);
		myMap.put(54094L,50028L);
		myMap.put(49410L,48038L);
		myMap.put(48109L,48112L);
		myMap.put(54364L,50610L);
		myMap.put(53529L,53532L);
		myMap.put(53968L,51042L);
		myMap.put(53936L,51012L);
		myMap.put(53621L,50036L);
		myMap.put(54059L,50601L);
		myMap.put(54003L,51012L);
		myMap.put(49283L,49285L);
		myMap.put(47960L,47961L);
		myMap.put(104300L,104306L);
		myMap.put(53751L,50601L);
		myMap.put(50021L,47829L);
		myMap.put(49720L,47570L);
		myMap.put(53776L,50643L);
		myMap.put(53944L,51012L);
		myMap.put(104268L,51581L);
		myMap.put(53677L,47987L);
		myMap.put(54632L,52959L);
		myMap.put(54535L,51012L);
		myMap.put(54293L,51012L);
		myMap.put(54630L,51787L);
		myMap.put(54579L,51012L);
		myMap.put(48509L,48510L);
		myMap.put(54224L,47994L);
		myMap.put(100320L,100323L);
		myMap.put(54273L,51108L);
		myMap.put(54362L,50601L);
		myMap.put(49664L,49040L);
		myMap.put(49660L,49551L);
		myMap.put(54269L,51012L);
		myMap.put(49693L,49694L);
		myMap.put(54336L,48050L);
		myMap.put(54601L,50601L);
		myMap.put(54256L,52196L);
		myMap.put(49717L,49721L);
		myMap.put(104565L,51581L);
		myMap.put(54623L,49987L);
		myMap.put(49865L,49867L);
		myMap.put(49881L,49886L);
		myMap.put(49908L,49249L);
		myMap.put(50054L,50056L);
		myMap.put(49997L,49998L);
		myMap.put(50119L,50124L);
		myMap.put(104666L,104673L);
		myMap.put(54789L,50643L);
		myMap.put(50110L,50112L);
		myMap.put(54780L,51302L);
		myMap.put(104683L,49987L);
		myMap.put(54788L,50643L);
		myMap.put(50269L,49227L);
		myMap.put(95321L,49845L);
		myMap.put(54807L,54808L);
		myMap.put(54811L,50794L);
		myMap.put(50317L,49206L);
		myMap.put(54795L,51787L);
		myMap.put(54679L,51787L);
		myMap.put(50352L,50354L);
		myMap.put(54681L,50028L);
		myMap.put(54961L,50028L);
		myMap.put(54911L,54912L);
		myMap.put(55021L,55024L);
		myMap.put(50457L,50459L);
		myMap.put(55074L,50611L);
		myMap.put(55084L,50601L);
		myMap.put(55043L,47829L);
		myMap.put(54901L,48153L);
		myMap.put(104890L,103581L);
		myMap.put(50511L,49521L);
		myMap.put(50518L,49305L);
		myMap.put(54980L,48228L);
		myMap.put(55009L,51042L);
		myMap.put(55353L,55355L);
		myMap.put(95045L,95046L);
		myMap.put(104961L,104965L);
		myMap.put(55094L,55098L);
		myMap.put(55102L,53192L);
		myMap.put(105560L,52706L);
		myMap.put(55210L,50601L);
		myMap.put(55307L,51787L);
		myMap.put(55402L,55407L);
		myMap.put(55453L,55455L);
		myMap.put(55433L,49987L);
		myMap.put(55472L,51787L);
		myMap.put(55474L,50601L);
		myMap.put(55557L,50028L);
		myMap.put(95057L,50028L);
		myMap.put(95059L,50028L);
		myMap.put(55615L,55616L);
		myMap.put(55634L,50028L);
		myMap.put(105490L,105494L);

		
		AtomicReference<Integer> count= new AtomicReference<Integer>(1);
myMap.forEach((vLovId1,vLovId2)->{

	boolean linkOrUnlinkResponse = myHierarchyService.unLinkHierarchyMemberId(
			apiUtils.lovIdMap.get(COLUMN_HEADER_LINE_MANAGER_POSITION).getHiermemberid(),
			apiUtils.lovIdMap.get(COLUMN_HEADER_LINE_MANAGER_POSITION).getLovId(), vLovId2, vLovId1);

	System.out.println("linkOrUnlinkResponse " + linkOrUnlinkResponse);
	System.out.println("Completed: "+count.get());
	count.set(count.get()+1);	
});
	

		/*
		 * 
		 * 
		 * if(i>=182) {
		 * 
		 * System.out.println("Name: "+managerDetails.getFirstName() + " " +
		 * managerDetails.getLastName());
		 * System.out.println("Gid: "+managerDetails.getGid());
		 * 
		 * System.out.println("I: "+i);
		 * 
		 * Long vLovId =
		 * configService.setLovEntry(apiUtils.lovIdMap.get(COLUMN_HEADER_LINE_MANAGER).
		 * getLovName(), managerDetails.getGid(),
		 * apiUtils.lovIdMap.get(COLUMN_HEADER_LINE_MANAGER).getLovId(),
		 * managerDetails.getGid()); //setLovEntryCount++;
		 * //configService.setLovLabel(apiUtils.lovIdMap.get(COLUMN_HEADER_LINE_MANAGER)
		 * .getLovName(), managerDetails.getGid(), // CONFIGURABLE_LOV, LANGUAGE_UK,
		 * managerDetails.getFirstName() + " " + managerDetails.getLastName(), // true);
		 * 
		 * System.out.println("Gid: "+managerDetails.getBusinessTitle());
		 * 
		 * Long vLovId2 = configService.setLovEntry(apiUtils.lovIdMap.get(
		 * COLUMN_HEADER_LINE_MANAGER_POSITION).getLovName(),
		 * managerDetails.getBusinessTitle().replaceAll("_", ""),
		 * apiUtils.lovIdMap.get(COLUMN_HEADER_LINE_MANAGER_POSITION).getLovId(),
		 * managerDetails.getBusinessTitle().replaceAll("_", ""));
		 * 
		 * configService.setLovLabel(apiUtils.lovIdMap.get(
		 * COLUMN_HEADER_LINE_MANAGER_POSITION).getLovName(),
		 * managerDetails.getBusinessTitle().replaceAll("_", ""), CONFIGURABLE_LOV,
		 * LANGUAGE_UK, managerDetails.getBusinessTitle(), true);
		 * 
		 * 
		 * boolean linkOrUnlinkResponse =
		 * myHierarchyService.updateHierarchyMemberUnlockers(
		 * apiUtils.lovIdMap.get(COLUMN_HEADER_LINE_MANAGER_POSITION).getHiermemberid(),
		 * apiUtils.lovIdMap.get(COLUMN_HEADER_LINE_MANAGER_POSITION).getLovId(),
		 * vLovId2, vLovId);
		 * 
		 * System.out.println("linkOrUnlinkResponse "+linkOrUnlinkResponse);
		 * 
		 * }
		 * 
		 * i++;
		 * 
		 * if(i==2000) break; //break;
		 * 
		 * String[] numbers = {"10009322"};
		 */

		// configService.removeLovEntry("Line Manager Full Name", numbers[0],47059L);
		/*
		 * for(int i=10;i<=99;i++) { configService.setLovEntry("Analysis", i+"",
		 * 46897L,i+""); configService.setLovLabel("Analysis", i+"", "ConfLOV",
		 * "UK",i+"", true); }
		 */

		/*
		 * for (int i=1;i<=365;i++) { configService.setLovEntry("Probationary Period",
		 * i+"", 46985L,i+""); configService.setLovLabel("Probationary Period", i+"",
		 * "ConfLOV", "UK",i+"", true); }
		 */
		// configService.removeLovEntry("Line Manager","475245", 128537L);

		// configService.setLovEntry("DepartmentNamev2",, locationNames[i], 74700L);
		// configService.setLovEntry("DepartmentNamev2","Test Department1", 46939L,"Test
		// Department1");
		// configService.setLovLabel("DepartmentNamev2","Test Department1",
		// "ConfLOV","UK","Test Department1", true);
		//
		//

	}

	public void runManagerFixJob(String managerFileName, LovHierarchyService myHierarchyService) {

		try {
			LOGGER.info("Entering runManagerFixJob ");
			Map<String, LovDetails> lovIdMap = new HashMap<String, LovDetails>();

			lovIdMap.put(COLUMN_HEADER_LINE_MANAGER, new LovDetails(LOV_FIELD_NAME_LINE_MANAGER,
					LOV_FIELD_ID_LINE_MANAGER, LOV_FIELD_MEMBER_ID_LINE_MANAGER));

			lovIdMap.put(COLUMN_HEADER_LINE_MANAGER_POSITION, new LovDetails(LOV_FIELD_NAME_LINE_MANAGER_POSITION,
					LOV_FIELD_ID_LINE_MANAGER_POSITION, LOV_FIELD_MEMBER_ID_LINE_MANAGER_POSITION));

			CSVReaderUtil csvReaderUtil = new CSVReaderUtil();
			csvReaderUtil.initializeData();
			List<ManagerDetails> managerDtlsList = csvReaderUtil.readManagerDetails(managerFileName, 0);

			List<ManagerDetails> managerDtlsList2 = managerDtlsList.stream().filter(managerDetails -> {
				return ACTIVE_YES.equalsIgnoreCase(managerDetails.getActiveStatus());
			}).collect(Collectors.toList());

			System.out.println(managerDtlsList2.size());

			for (ManagerDetails managerDetails : managerDtlsList2) {

				System.out.println(managerDetails.getFirstName() + " " + managerDetails.getLastName());
				System.out.println(managerDetails.getGid());

				Long vLovId = setLovEntry(lovIdMap.get(COLUMN_HEADER_LINE_MANAGER).getLovName(),
						managerDetails.getGid(), lovIdMap.get(COLUMN_HEADER_LINE_MANAGER).getLovId(),
						managerDetails.getGid());

				setLovLabel(lovIdMap.get(COLUMN_HEADER_LINE_MANAGER).getLovName(), managerDetails.getGid(),
						CONFIGURABLE_LOV, LANGUAGE_UK,
						managerDetails.getFirstName() + " " + managerDetails.getLastName(), true);

				Long vLovId2 = setLovEntry(lovIdMap.get(COLUMN_HEADER_LINE_MANAGER_POSITION).getLovName(),
						managerDetails.getBusinessTitle().replaceAll("_", ""),
						lovIdMap.get(COLUMN_HEADER_LINE_MANAGER_POSITION).getLovId(),
						managerDetails.getBusinessTitle().replaceAll("_", ""));

				setLovLabel(lovIdMap.get(COLUMN_HEADER_LINE_MANAGER_POSITION).getLovName(),
						managerDetails.getBusinessTitle().replaceAll("_", ""), CONFIGURABLE_LOV, LANGUAGE_UK,
						managerDetails.getBusinessTitle(), true);

				boolean linkOrUnlinkResponse = myHierarchyService.updateHierarchyMemberUnlockers(
						lovIdMap.get(COLUMN_HEADER_LINE_MANAGER_POSITION).getHiermemberid(),
						lovIdMap.get(COLUMN_HEADER_LINE_MANAGER_POSITION).getLovId(), vLovId2, vLovId);

				LOGGER.info("linkOrUnlinkResponse " + linkOrUnlinkResponse);

			}
		} catch (Exception e) {
			LOGGER.error("Exception occured in runManagerFixJob job " + e.getMessage());
			e.printStackTrace();
		}

		LOGGER.info("Exiting runManagerFixJob");

	}

	public Long setLovEntry(String name, String value, Long id, String newVal) {

		LOGGER.debug("### - Entering setLovEntry method ###");

		GenericLovDto lovData = new GenericLovDto();
		lovData.setName(name);
		lovData.setValue(value);

		ObjectFactory objectFactory = new ObjectFactory();
		JAXBElement<String> newValue = objectFactory.createGenericLovDtoNewValue(newVal);
		lovData.setNewValue(newValue);

		JAXBElement<Long> lovId = objectFactory.createGenericLovDtoLovId(id);
		lovData.setLovId(lovId);

		GenericLovDto lovEntryResponse = configService.setLOVEntry(lovData);

		LOGGER.debug("### - LovId:  " + lovEntryResponse.getLovId().getValue() + " ###");
		LOGGER.debug("### - Name:  " + lovEntryResponse.getName() + " ###");
		LOGGER.debug("### - Value:  " + lovEntryResponse.getValue() + " ###");
		LOGGER.debug("### - New Value:  " + lovEntryResponse.getNewValue().getValue() + " ###");

		LOGGER.debug("### - Exiting setLovEntry method ###");

		return lovEntryResponse.getLovId().getValue();
	}

	public void setLovLabel(String name, String value, String type, String language, String languageValue,
			boolean overwrite) {

		LOGGER.debug("### - Entering setLovLabel method ###");

		LovLabelsDto lovLabelData = new LovLabelsDto();
		lovLabelData.setName(name);
		lovLabelData.setValue(value);
		lovLabelData.setType(type);

		LabelDto labelLanguageData = new LabelDto();
		labelLanguageData.setLanguage(language);
		labelLanguageData.setValue(languageValue);
		
		lovLabelData.getLabel().add(labelLanguageData);

		lovLabelData.setOverwrite(true);
		
		/*labelLanguageData = new LabelDto();
		labelLanguageData.setLanguage("CN");
		labelLanguageData.setValue(languageValue);
		
		lovLabelData.getLabel().add(labelLanguageData);
		
		labelLanguageData = new LabelDto();
		labelLanguageData.setLanguage("TH");
		labelLanguageData.setValue(languageValue);
		
		lovLabelData.getLabel().add(labelLanguageData);
		
		labelLanguageData = new LabelDto();
		labelLanguageData.setLanguage("JA");
		labelLanguageData.setValue(languageValue);
		
		lovLabelData.getLabel().add(labelLanguageData);
		
		labelLanguageData = new LabelDto();
		labelLanguageData.setLanguage("KO");
		labelLanguageData.setValue(languageValue);
		
		lovLabelData.getLabel().add(labelLanguageData);
		

		labelLanguageData = new LabelDto();
		labelLanguageData.setLanguage("TW");
		labelLanguageData.setValue(languageValue);
		
		lovLabelData.getLabel().add(labelLanguageData);


		labelLanguageData = new LabelDto();
		labelLanguageData.setLanguage("VI");
		labelLanguageData.setValue(languageValue);
		
		lovLabelData.getLabel().add(labelLanguageData);
		
		labelLanguageData = new LabelDto();
		labelLanguageData.setLanguage("ID");
		labelLanguageData.setValue(languageValue);
		
		lovLabelData.getLabel().add(labelLanguageData);

		lovLabelData.setOverwrite(true);
		
*/		

		LovLabelsDto lovLabelResponse = configService.setLOVLabels(lovLabelData);

		LOGGER.debug("### - Type:  " + lovLabelResponse.getType() + " ###");
		LOGGER.debug("### - Name:  " + lovLabelResponse.getName() + " ###");
		LOGGER.debug("### - Value:  " + lovLabelResponse.getValue() + " ###");
		for (LabelDto labelDto : lovLabelResponse.getLabel()) {
			LOGGER.debug("### - Language:  " + labelDto.getLanguage() + " ###");
			LOGGER.debug("### - Language Value:  " + labelDto.getValue() + " ###");
		}

		LOGGER.debug("### - Exiting setLovLabel method ###");
	}

	public boolean removeLovEntry(String name, String value, Long id) {

		LOGGER.info("### - Entering removeLovEntry method ###");
		boolean result = false;
		try {
			GenericLovDto lovData = new GenericLovDto();
			lovData.setName(name);
			lovData.setValue(value);

			ObjectFactory objectFactory = new ObjectFactory();
			JAXBElement<Long> lovId = objectFactory.createGenericLovDtoLovId(id);
			// lovData.setLovId(lovId);
			// lovData.setHidden(true);

			OperationResultDto resultDto = configService.removeLOVEntry(lovData);
			result = resultDto.isSuccess();
			LOGGER.info("### - isSuccess:  " + resultDto.isSuccess() + " ###");
		} catch (Exception e) {
			LOGGER.error("Exception occured in removeLovEntry " + e.getMessage());
		}

		LOGGER.info("### - Exiting removeLovEntry method ###");

		return result;
	}
}