package com.dhl.dhltalentlinkapp.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.ws.BindingProvider;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.pojo.LinkUnlinkDetails;
import com.mrted.ws.lovhierarchy.Activators;
import com.mrted.ws.lovhierarchy.GenericLovForHierarchingDto;
import com.mrted.ws.lovhierarchy.LovHierarchyMemberDto;
import com.mrted.ws.lovhierarchy.LovHierarchyMemberDto.Vlovs;
import com.mrted.ws.lovhierarchy.LovHierarchyWebService;
import com.mrted.ws.lovhierarchy.LovHierarchyWebService_Service;
import com.mrted.ws.lovhierarchy.OperationResultDto;
import com.mrted.ws.lovhierarchy.UuidIdPairDto;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class LovHierarchyService {
	private final static Logger LOGGER = LoggerManager.getLogger(LovHierarchyService.class);

	LovHierarchyWebService_Service hierarchyWebService = null;
	LovHierarchyWebService hierarchyService = null;
	LovHierarchyService service = null;
	BindingProvider bindingProvider = null;

	public LovHierarchyService() {

		hierarchyWebService = new LovHierarchyWebService_Service();
		hierarchyService = hierarchyWebService.getLovHierarchyWebServicePort();
		bindingProvider = (BindingProvider) hierarchyService;
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://api5.lumesse-talenthub.com/HRIS/SOAP/LovHierarchy?api_key=686170a1-b10c-b79d-ae8c-9b9992c65ecb");
	}

	public void runFixJob(String fileLocation) {
		LOGGER.info("Entering runFixJob...");
		try {
			FileInputStream file = new FileInputStream(new File(fileLocation));

			Workbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheetAt(0); // assuming the sheet index is 0
			ArrayList<LinkUnlinkDetails> rows = new ArrayList<LinkUnlinkDetails>();
			for (Row row : sheet) {

				LinkUnlinkDetails excelRow = new LinkUnlinkDetails();
				excelRow.setFile_name(row.getCell(0).getStringCellValue());
				excelRow.setFile_date(row.getCell(1).getStringCellValue());
				excelRow.setFrom_field_name(row.getCell(2).getStringCellValue());
				excelRow.setFrom_field_value((row.getCell(3) != null) ? row.getCell(3).getStringCellValue() : "");
				excelRow.setFrom_field_value_id(row.getCell(4).getStringCellValue());
				excelRow.setTo_field_name(row.getCell(5).getStringCellValue());
				excelRow.setTo_field_value((row.getCell(6) != null) ? row.getCell(6).getStringCellValue() : "");
				excelRow.setTo_field_value_id(row.getCell(7).getStringCellValue());
				excelRow.setStatus(row.getCell(8).getStringCellValue());
				excelRow.setLinkOrUnlinkStatus(row.getCell(9).getStringCellValue());

				rows.add(excelRow);
			}

			Map<String, Long> fieldToMemberIdMap = new HashMap<>();

			fieldToMemberIdMap.put("DEPARTMENT_NAME", CommonConstants.LOV_FIELD_MEMBER_ID_DEPARTMENT_NAME);
			fieldToMemberIdMap.put("POSITION_NAME", CommonConstants.LOV_FIELD_MEMBER_ID_POSITION_NAME);
			fieldToMemberIdMap.put("RCS_GRADE", CommonConstants.LOV_FIELD_MEMBER_ID_RCS_GRADE);
			fieldToMemberIdMap.put("POSITION", CommonConstants.LOV_FIELD_MEMBER_ID_POSITION);
			fieldToMemberIdMap.put("DSC_GLOBAL_JOB_NAME", CommonConstants.LOV_FIELD_MEMBER_ID_DSC_GLOBAL_JOB_NAME);
			fieldToMemberIdMap.put("Full time vs Part time", CommonConstants.LOV_FIELD_MEMBER_ID_FULL_VS_PART_TIME);
			fieldToMemberIdMap.put("Line Manager Position", CommonConstants.LOV_FIELD_MEMBER_ID_LINE_MANAGER_POSITION);
			fieldToMemberIdMap.put("LEGAL_ENTITY", CommonConstants.LOV_FIELD_MEMBER_ID_LEGAL_ENTITY);
			
			fixFileLinkGaps(rows, fieldToMemberIdMap);

		} catch (Exception e) {
			LOGGER.error("Exception occured in runFixJob: " + e.getMessage());
			e.printStackTrace();
		}
		LOGGER.info("Exiting runFixJob...");
	}

	public static void main(String args[]) {
		
		ConfigurableService configService = new ConfigurableService();
        Long childId = configService.setLovEntry("DPDHL Job Code 2", "500.514.128", 143418L, "500.514.128");
        configService.setLovLabel("DPDHL Job Code 2", "500.514.128", "ConfLOV", "UK", "500.514.128", true);

        
		

		/*
		 * String excelFilePath
		 * ="/home/mathan/Documents/aTalent/DHL/new countries/Production/input5_updated.xlsx"
		 * ; // Change to your Excel file path
		 * 
		 * try (FileInputStream fis = new FileInputStream(excelFilePath); Workbook
		 * workbook = new XSSFWorkbook(fis)) {
		 * 
		 * Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
		 * 
		 * LovHierarchyService myHierarchyService = new LovHierarchyService();
		 * ConfigurableService configService = new ConfigurableService(); int i = 0;
		 * 
		 * for (Row row : sheet) { Cell gid = row.getCell(0); // dsc_global_job column
		 * Cell fullName = row.getCell(1); // dsc_global_job_code column
		 * 
		 * String gidNumber = "";
		 * 
		 * // Check the cell type and handle accordingly if (gid.getCellType() ==
		 * CellType.STRING) { gidNumber = gid.getStringCellValue(); } else if
		 * (gid.getCellType() == CellType.NUMERIC) { gidNumber = String.valueOf((int)
		 * gid.getNumericCellValue()); // Convert numeric to string } String
		 * fullNameString = fullName.getStringCellValue();
		 * 
		 * // Perform the operations as per the task Long parentId =
		 * configService.setLovEntry("Line Manager Full Name v3", gidNumber, 149317L,
		 * gidNumber); configService.setLovLabel("Line Manager Full Name v3", gidNumber,
		 * "ConfLOV", "UK", fullNameString, true);
		 * 
		 * //Long childId = configService.setLovEntry("DSC Global Job Code 2",
		 * dscGlobalJobCode, 144539L, dscGlobalJobCode);
		 * //configService.setLovLabel("DSC Global Job Code 2", dscGlobalJobCode,
		 * "ConfLOV", "UK", dscGlobalJobCode, true);
		 * 
		 * //Long childId = configService.setLovEntry("DPDHL Job Code 2",
		 * dscGlobalJobCode, 143418L, dscGlobalJobCode);
		 * //configService.setLovLabel("DPDHL Job Code 2", dscGlobalJobCode, "ConfLOV",
		 * "UK", dscGlobalJobCode, true);
		 * 
		 * //myHierarchyService.updateHierarchyMemberUnlockers(260, 150837, childId,
		 * parentId); i++; System.out.println(i+" - Completed "+gidNumber+" ==> "+
		 * fullNameString); // if (i==1) //7 break;
		 * 
		 * }
		 * 
		 * System.out.println("Process completed successfully!");
		 * 
		 * } catch (IOException e) { e.printStackTrace(); }
		 */

	}

	public void checkRCSGrades() {

		LovHierarchyService myHierarchyService = new LovHierarchyService();

		/*
		 * 1. Get values from position file, pos_name, rcs grade values and save it in
		 * final_input.xlsx 2. Get the postname and pos_id from table and save it in
		 * POS_CODE_IDS.xlsx 3. Update the member id and rcs grade value ids in code
		 * 
		 */

		try {
			FileInputStream file = new FileInputStream(
					// new
					// File("/home/mathan/Documents/aTalent/DHL/April24/myHr_TalentLink_20230411_details.xlsx"));
					new File("/home/mathan/Desktop/July17/final_input.xlsx"));

			Workbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheetAt(0); // assuming the sheet index is 0
			ArrayList<LinkUnlinkDetails> rows = new ArrayList<LinkUnlinkDetails>();
			DataFormatter dataFormatter = new DataFormatter();
			Map<String, List<String>> myMap = new HashMap<String, List<String>>();

			Map<String, Long> myCodeMap = new HashMap<String, Long>();

			myCodeMap.put("RCS B", 46997L);
			myCodeMap.put("RCS E", 47000L);
			myCodeMap.put("RCS J", 47005L);
			myCodeMap.put("RCS N", 47009L);
			myCodeMap.put("RCS C", 46998L);
			myCodeMap.put("RCS L", 47007L);
			myCodeMap.put("RCS P", 47011L);
			myCodeMap.put("RCS K", 47006L);
			myCodeMap.put("NA", 95197L);
			myCodeMap.put("RCS D", 46999L);
			myCodeMap.put("RCS G", 47002L);
			myCodeMap.put("RCS H", 47003L);
			myCodeMap.put("RCS I", 47004L);
			myCodeMap.put("RCS F", 47001L);
			myCodeMap.put("RCS M", 47008L);
			myCodeMap.put("RCS A", 46996L);
			myCodeMap.put("RCS O", 47010L);

			for (Row row : sheet) {

				String rcsValue = dataFormatter.formatCellValue(row.getCell(1));
				String posValue = dataFormatter.formatCellValue(row.getCell(0)).replaceAll("_", "");

				if (myMap.containsKey(rcsValue)) {
					myMap.get(rcsValue).add(posValue);
				} else {
					List<String> posList = new ArrayList<String>();
					posList.add(posValue);
					myMap.put(rcsValue, posList);
				}
			}
			workbook.close();
			file.close();

			FileInputStream file2 = new FileInputStream(
					// new
					// File("/home/mathan/Documents/aTalent/DHL/April24/myHr_TalentLink_20230411_details.xlsx"));
					new File("/home/mathan/Desktop/July17/POS_CODE_IDS.xlsx"));
			Workbook workbook2 = new XSSFWorkbook(file2);
			Sheet sheet2 = workbook2.getSheetAt(0); // assuming the sheet index is 0
			Map<String, String> positionIDMap = new HashMap<String, String>();

			for (Row row : sheet2) {
				if (!"".equals(dataFormatter.formatCellValue(row.getCell(0)))) {
					String posValue = dataFormatter.formatCellValue(row.getCell(0)).replaceAll("_", "");
					String posID = dataFormatter.formatCellValue(row.getCell(1));

					if (positionIDMap.containsKey(posValue)) {
						LOGGER.info("Duplicate.. " + posValue);
					} else {
						positionIDMap.put(posValue, posID);
					}
				}
			}
			workbook2.close();
			file2.close();
			// LOGGER.info(myMap);
			// LOGGER.info(positionIDMap);

			List<UuidIdPairDto> uuidPairList = null;
			List<String> myList = null;

			List<String> missingList = new ArrayList<String>();
			for (String key : myMap.keySet()) {

				LOGGER.info("Key: " + key);
				missingList = myHierarchyService.getMissingList(myHierarchyService, myMap, positionIDMap, key,
						myCodeMap.get(key));
				LOGGER.info("MissingList: " + missingList);
				/*
				 * if (!missingList.isEmpty()) { boolean response =
				 * myHierarchyService.updateHierarchyMemberUnlockersForMissingEntries(
				 * CommonConstants.LOV_FIELD_MEMBER_ID_RCS_GRADE,
				 * CommonConstants.LOV_FIELD_ID_RCS_GRADE, myCodeMap.get(key), missingList);
				 * LOGGER.info("Response: " + response); //break; }
				 */
				LOGGER.info("--------------------------------------");

			}

		} catch (

		IOException e) {
			e.printStackTrace();
		}

	}

	List<String> getMissingList(LovHierarchyService myHierarchyService, Map<String, List<String>> myMap,
			Map<String, String> positionMap, String key, Long lovID) {

		List<String> missingList = new ArrayList<String>();

		List<UuidIdPairDto> uuidPairList = myHierarchyService
				.getUuidPairForHierarchyMemberById(CommonConstants.LOV_FIELD_MEMBER_ID_RCS_GRADE, lovID);
		List<String> myList = uuidPairList.stream()
				.map(uid -> uid.getUuid().replaceAll("MYHR Position Code/", "").toString())
				.collect(Collectors.toList());
		myMap.get(key).forEach(a -> {
			if (!myList.contains(a) && positionMap.containsKey(a)) {
				missingList.add(positionMap.get(a));
				// LOGGER.info(a);
			}
		});
		return missingList;
	}

	private static void fixManagerFileLinkGaps(LovHierarchyService myHierarchyService,
			ArrayList<LinkUnlinkDetails> rows) {
		Map<String, List<String>> toFieldToFromFieldValueIdMap = null;

		LOGGER.info("Line Manager Position...............");

		toFieldToFromFieldValueIdMap = rows.stream().filter(row -> row.getStatus().equals("Linked"))
				.filter(row -> row.getTo_field_name().equals("Line Manager Position"))
				.collect(Collectors.groupingBy(row -> row.getTo_field_value() + ",," + row.getTo_field_value_id(),
						Collectors.mapping(LinkUnlinkDetails::getFrom_field_value_id, Collectors.toList())));

		for (Map.Entry<String, List<String>> entry : toFieldToFromFieldValueIdMap.entrySet()) {
			List<String> missingList = new ArrayList<String>();
			if (!entry.getKey().split(",,")[1].equals("0")) {
				// LOGGER.info(entry.getKey()+" "+"Key: " +
				// entry.getKey().split(",,")[1]);
				List<UuidIdPairDto> uuidPairList = myHierarchyService.getUuidPairForHierarchyMemberById(
						CommonConstants.LOV_FIELD_MEMBER_ID_LINE_MANAGER_POSITION,
						Long.parseLong(entry.getKey().split(",,")[1]));
				if (uuidPairList != null) {
					List<String> myList = uuidPairList.stream().map(uid -> uid.getId().toString())
							.collect(Collectors.toList());
					// LOGGER.info("myList: "+myList);
					entry.getValue().forEach(a -> {
						// LOGGER.info("a: "+a);
						if (!myList.contains(a)) {
							missingList.add(a);
							// LOGGER.info(a);
						}
					});
				} else {
					missingList.addAll(entry.getValue());
					// LOGGER.info(entry.getValue());
				}
				if (!missingList.isEmpty())
					LOGGER.info("Missing List: " + missingList);
				// if(!missingList.isEmpty())
				// LOGGER.info("Response:
				// "+myHierarchyService.updateHierarchyMemberUnlockersForMissingEntries(CommonConstants.LOV_FIELD_MEMBER_ID_LINE_MANAGER_POSITION,
				// CommonConstants.LOV_FIELD_ID_LINE_MANAGER_POSITION,
				// Long.parseLong(entry.getKey().split(",,")[1]), missingList));

				// LOGGER.info("$$$$$$$$$$$$$$$$$$$$");

			}
			// LOGGER.info("Key: " + entry.getKey() + ", Value: " +
			// entry.getValue());
		}

	}

	private static Long getFieldIdByFieldName(String fieldName) {
		Map<String, Long> fieldNameToFieldIdMap = new HashMap<>();
		fieldNameToFieldIdMap.put("DEPARTMENT_FILTER_BY", CommonConstants.LOV_FIELD_ID_DEPT_FILTER_BY);
		fieldNameToFieldIdMap.put("DEPARTMENT_NAME", CommonConstants.LOV_FIELD_ID_DEPARTMENT_NAME);
		fieldNameToFieldIdMap.put("WORK_HOURS", CommonConstants.LOV_FIELD_ID_WORK_HOURS);
		fieldNameToFieldIdMap.put("WORK_HOURS_FREQUENCY", CommonConstants.LOV_FIELD_ID_WORK_HOURS_FREQUENCY);
		fieldNameToFieldIdMap.put("Full time vs Part time", CommonConstants.LOV_FIELD_ID_FULL_VS_PART_TIME);
		fieldNameToFieldIdMap.put("MYHR_POSITION_CODE", CommonConstants.LOV_FIELD_ID_MYHR_POSITION_CODE);
		fieldNameToFieldIdMap.put("POSITION_NAME", CommonConstants.LOV_FIELD_ID_POSITION_NAME);
		fieldNameToFieldIdMap.put("RCS_GRADE", CommonConstants.LOV_FIELD_ID_RCS_GRADE);
		fieldNameToFieldIdMap.put("POSITION", CommonConstants.LOV_FIELD_ID_POSITION);
		fieldNameToFieldIdMap.put("DSC_GLOBAL_JOB_NAME", CommonConstants.LOV_FIELD_ID_DSC_GLOBAL_JOB_NAME);
		fieldNameToFieldIdMap.put("Department ID Unique", CommonConstants.LOV_FIELD_ID_DEPARTMENT_ID);
		fieldNameToFieldIdMap.put("ORG_UNIT", CommonConstants.LOV_FIELD_ID_ORG_UNIT);
		fieldNameToFieldIdMap.put("LOCATION_CODE", CommonConstants.LOV_FIELD_ID_LOCATION_CODE);
		fieldNameToFieldIdMap.put("Location_Name", CommonConstants.LOV_FIELD_ID_LOCATION_NAME);
		fieldNameToFieldIdMap.put("Global_Location_Name", CommonConstants.LOV_FIELD_ID_GLOBAL_LOCATION_NAME);
		fieldNameToFieldIdMap.put("Facility_ID", CommonConstants.LOV_FIELD_ID_FACILITY_ID);
		fieldNameToFieldIdMap.put("SECTOR", CommonConstants.LOV_FIELD_ID_SECTOR);
		fieldNameToFieldIdMap.put("DEPARTMENT_COST_STRING", CommonConstants.LOV_FIELD_ID_DEPARTMENT_COST_STRING);
		fieldNameToFieldIdMap.put("LEGAL_ENTITY", CommonConstants.LOV_FIELD_ID_LEGAL_ENTITY);
		fieldNameToFieldIdMap.put("Line Manager Position", CommonConstants.LOV_FIELD_ID_LINE_MANAGER_POSITION);
		fieldNameToFieldIdMap.put("Line Manager", CommonConstants.LOV_FIELD_ID_LINE_MANAGER);
		return fieldNameToFieldIdMap.get(fieldName);
	}

	private void fixFileLinkGaps(ArrayList<LinkUnlinkDetails> rows, Map<String, Long> fieldToMemberIdMap) {
		Map<String, List<String>> toFieldToFromFieldValueIdMap = null;

		for (Map.Entry<String, Long> fieldEntry : fieldToMemberIdMap.entrySet()) {
			LOGGER.info(fieldEntry.getKey() + "................");

			toFieldToFromFieldValueIdMap = rows.stream().filter(row -> row.getStatus().equals("Linked"))
					.filter(row -> row.getTo_field_name().equals(fieldEntry.getKey()))
					.collect(Collectors.groupingBy(row -> row.getTo_field_value() + ",," + row.getTo_field_value_id(),
							Collectors.mapping(LinkUnlinkDetails::getFrom_field_value_id, Collectors.toList())));

			for (Map.Entry<String, List<String>> entry : toFieldToFromFieldValueIdMap.entrySet()) {
				List<String> missingList = new ArrayList<>();

				if (!entry.getKey().split(",,")[1].equals("0")) {
					LOGGER.info(entry.getKey() + " " + "Key: " + entry.getKey().split(",,")[1]);
					List<UuidIdPairDto> uuidPairList = getUuidPairForHierarchyMemberById(fieldEntry.getValue(),
							Long.parseLong(entry.getKey().split(",,")[1]));

					if (uuidPairList != null) {
						List<String> myList = uuidPairList.stream().map(uid -> uid.getId().toString())
								.collect(Collectors.toList());

						entry.getValue().forEach(a -> {
							if (!myList.contains(a) && !"0".equals(a)) {
								missingList.add(a);
							}
						});
					} else {
						missingList.addAll(entry.getValue());
					}
					
					while (missingList.contains("0")) {
					    missingList.remove("0");
					}

					LOGGER.info("Missing List: " + missingList);

					if (!missingList.isEmpty()) {
						LOGGER.info("Response: " + updateHierarchyMemberUnlockersForMissingEntries(
								fieldEntry.getValue(), getFieldIdByFieldName(fieldEntry.getKey() + ""),
								Long.parseLong(entry.getKey().split(",,")[1]), missingList));
					}

					LOGGER.info("$$$$$$$$$$$$$$$$$$$$");
				}
			}
		}

	}

	public boolean updateHierarchyMemberUnlockers(long hierarchyMemberId, long id, long vLovId, long vLovActivatorId) {

		LOGGER.debug("### - Entering updateHierarchyMemberUnlockers method ###");

		LovHierarchyMemberDto hierarchyMemberDto = new LovHierarchyMemberDto();
		Vlovs vLovs = new Vlovs();
		GenericLovForHierarchingDto genericLovDto = new GenericLovForHierarchingDto();
		genericLovDto.setId(vLovId);

		Activators activators = new Activators();

		List<UuidIdPairDto> uuidPairList = getUuidPairForHierarchyMemberById(hierarchyMemberId, vLovId);
		if (uuidPairList != null) {
			for (UuidIdPairDto pairDto : uuidPairList) {
				if (pairDto.getId() != vLovActivatorId) {
					activators.getVlov().add(pairDto);
				}
			}
		}
		if (vLovActivatorId != 0) {
			UuidIdPairDto uuIdPair = new UuidIdPairDto();
			uuIdPair.setId(vLovActivatorId);
			activators.getVlov().add(uuIdPair);
		}

		genericLovDto.getActivators().add(activators);

		vLovs.getVlov().add(genericLovDto);

		hierarchyMemberDto.setHiermemberid(hierarchyMemberId);
		hierarchyMemberDto.setId(id);
		hierarchyMemberDto.setVlovs(vLovs);

		OperationResultDto operationResultResponse = hierarchyService
				.updateHierarchyMemberUnlockers(hierarchyMemberDto);

		LOGGER.debug("### - Details:  " + operationResultResponse.isSuccess() + " ###");

		LOGGER.debug("### - Exiting updateHierarchyMemberUnlockers method ###");

		return operationResultResponse.isSuccess();
	}
	
	
	public boolean updateHierarchyMemberUnlockersForMissingEntries(long hierarchyMemberId, long id, long vLovId,
			List<String> vLovActivatorId) {

		LOGGER.debug("### - Entering updateHierarchyMemberUnlockers method ###");

		LovHierarchyMemberDto hierarchyMemberDto = new LovHierarchyMemberDto();
		Vlovs vLovs = new Vlovs();
		GenericLovForHierarchingDto genericLovDto = new GenericLovForHierarchingDto();
		genericLovDto.setId(vLovId);

		Activators activators = new Activators();

		List<UuidIdPairDto> uuidPairList = getUuidPairForHierarchyMemberById(hierarchyMemberId, vLovId);
		if (uuidPairList != null) {
			for (UuidIdPairDto pairDto : uuidPairList) {
				if (!vLovActivatorId.contains(pairDto.getId() + "")) {
					activators.getVlov().add(pairDto);
				}
			}
		}
		if (vLovActivatorId.size() != 0) {
			for (int i = 0; i < vLovActivatorId.size(); i++) {
				UuidIdPairDto uuIdPair = new UuidIdPairDto();
				uuIdPair.setId(Long.parseLong(vLovActivatorId.get(i)));
				activators.getVlov().add(uuIdPair);
			}
		}

		genericLovDto.getActivators().add(activators);

		vLovs.getVlov().add(genericLovDto);

		hierarchyMemberDto.setHiermemberid(hierarchyMemberId);
		hierarchyMemberDto.setId(id);
		hierarchyMemberDto.setVlovs(vLovs);

		OperationResultDto operationResultResponse = hierarchyService
				.updateHierarchyMemberUnlockers(hierarchyMemberDto);

		LOGGER.debug("### - Details:  " + operationResultResponse.isSuccess() + " ###");

		LOGGER.debug("### - Exiting updateHierarchyMemberUnlockers method ###");

		return operationResultResponse.isSuccess();
	}

	public void getWholeHierarchy(Integer lovType, Long departmentId) {

		LOGGER.debug("### - Entering getWholeHierarchy method ###");

		List<LovHierarchyMemberDto> lovHierarchyMemberList = hierarchyService.getWholeHierarchy(lovType, departmentId);

		for (LovHierarchyMemberDto memberDto : lovHierarchyMemberList) {
			LOGGER.debug("### - Name:  " + memberDto.getName() + " ###");
			LOGGER.debug("### - HierarchymemberId:  " + memberDto.getHiermemberid() + " ###");
			LOGGER.debug("### - Hlov:  " + memberDto.getHparents().getHlov().size() + " ###");

			for (LovHierarchyMemberDto parentMemberDto : memberDto.getHparents().getHlov()) {
				LOGGER.debug("######### - Name:  " + parentMemberDto.getName() + " ###");
				LOGGER.debug("######### - HierarchymemberId:  " + parentMemberDto.getHiermemberid() + " ###");
				LOGGER.debug("######### - Hlov:  "
						+ ((parentMemberDto.getHparents() != null && parentMemberDto.getHparents().getHlov() != null)
								? parentMemberDto.getHparents().getHlov().size()
								: 0)
						+ " ###");
			}
		}

		LOGGER.debug("### - Exiting getWholeHierarchy method ###");
	}

	public List<UuidIdPairDto> getUuidPairForHierarchyMemberById(long hierarchyMemberId, long vlovId) {

		LOGGER.debug("### - Entering getHierarchyMemberById method ###");

		LovHierarchyMemberDto lovHierarchyMemberDto = hierarchyService.getLovHierarchyMemberById(hierarchyMemberId);

		LOGGER.debug("### - Name:  " + lovHierarchyMemberDto.getName() + " ###");
		LOGGER.debug("### - HierarchymemberId:  " + lovHierarchyMemberDto.getHiermemberid() + " ###");
		LOGGER.debug("### - Hlov:  " + lovHierarchyMemberDto.getHparents().getHlov().size() + " ###");

		for (LovHierarchyMemberDto parentMemberDto : lovHierarchyMemberDto.getHparents().getHlov()) {
			LOGGER.debug("######### - Name:  " + parentMemberDto.getName() + " ###");
			LOGGER.debug("######### - HierarchymemberId:  " + parentMemberDto.getHiermemberid() + " ###");
			LOGGER.debug("######### - Hlov:  "
					+ ((parentMemberDto.getHparents() != null && parentMemberDto.getHparents().getHlov() != null)
							? parentMemberDto.getHparents().getHlov().size()
							: 0)
					+ " ###");
		}

		Vlovs vLov = lovHierarchyMemberDto.getVlovs();
		for (GenericLovForHierarchingDto vlovDto : vLov.getVlov()) {
			LOGGER.debug("######### - vlov Name:  " + vlovDto.getName() + " ###");
			LOGGER.debug("######### - vlov Id:  " + vlovDto.getId() + " ###");
			LOGGER.debug("######### - vlov Activator:  " + vlovDto.getActivators().size() + " ###");
			for (Activators activators : vlovDto.getActivators()) {
				for (UuidIdPairDto pairDto : activators.getVlov()) {
					LOGGER.debug("######### - pairDto Id:  " + pairDto.getId() + " ###");
					LOGGER.debug("######### - pairDto Uuid:  " + pairDto.getUuid() + " ###");
				}
			}
			if (vlovId == vlovDto.getId() && vlovDto.getActivators().size() >= 1) {
				return vlovDto.getActivators().get(0).getVlov();
			}
		}

		LOGGER.debug("### - Exiting getWholeHierarchy method ###");
		return null;
	}

	public boolean unLinkHierarchyMemberId(long hierarchyMemberId, long id, long vLovId, long vLovActivatorId) {

		LOGGER.debug("### - Entering unLinkHierarchyMemberId method ###");

		LovHierarchyMemberDto hierarchyMemberDto = new LovHierarchyMemberDto();
		Vlovs vLovs = new Vlovs();
		GenericLovForHierarchingDto genericLovDto = new GenericLovForHierarchingDto();
		genericLovDto.setId(vLovId);

		Activators activators = new Activators();
		List<UuidIdPairDto> uuidPairList = getUuidPairForHierarchyMemberById(hierarchyMemberId, vLovId);

		if (uuidPairList != null) {
			for (UuidIdPairDto pairDto : uuidPairList) {
				if (pairDto.getId() != vLovActivatorId) {
					activators.getVlov().add(pairDto);
				}
			}
		}

		genericLovDto.getActivators().add(activators);

		vLovs.getVlov().add(genericLovDto);

		hierarchyMemberDto.setHiermemberid(hierarchyMemberId);
		hierarchyMemberDto.setId(id);
		hierarchyMemberDto.setVlovs(vLovs);

		OperationResultDto operationResultResponse = hierarchyService
				.updateHierarchyMemberUnlockers(hierarchyMemberDto);

		LOGGER.debug("### - Details:  " + operationResultResponse.isSuccess() + " ###");

		LOGGER.debug("### - Exiting unLinkHierarchyMemberId method ###");

		return operationResultResponse.isSuccess();
	}

	public String getLovsByUnlockers(Long parentLov, Long destinationLovId) {

		LOGGER.debug("### - Entering getLovsByUnlokers method ###");

		List<Long> parentLovId = new ArrayList<Long>();
		parentLovId.add(parentLov);
		String value = "";

		List<GenericLovForHierarchingDto> genericLovForHierarchingDto = hierarchyService
				.getLovsByUnlockers(destinationLovId, parentLovId, null);

		if (genericLovForHierarchingDto.size() > 0) {
			value = genericLovForHierarchingDto.get(0).getName();
			LOGGER.info("value " + value);
		}

		LOGGER.debug("### - Exiting getLovsByUnlokers method ###");
		return value;
	}

}
