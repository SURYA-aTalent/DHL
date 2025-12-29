package com.dhl.dhltalentlinkapp.utils;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import static com.dhl.dhltalentlinkapp.constants.CommonConstants.*;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.dao.DepartmentDetails;
import com.dhl.dhltalentlinkapp.dao.JobDetails;
import com.dhl.dhltalentlinkapp.dao.LegalEntityDetails;
import com.dhl.dhltalentlinkapp.dao.ManagerDetails;
import com.dhl.dhltalentlinkapp.dao.PositionDetails;
import com.dhl.dhltalentlinkapp.enums.RecordStatus;
import com.dhl.dhltalentlinkapp.pojo.ErrorDetail;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class CSVReaderUtil {

	private List<DepartmentDetails> departmentDetailsList = null;
	private List<LegalEntityDetails> legalEntityDetailsList = null;
	private List<JobDetails> jobDetailsList = null;
	private List<ManagerDetails> managerDetailsList = null;
	private List<PositionDetails> positionDetailsList = null;

	private Map<String, List<ErrorDetail>> departmentDetailsErrorMap = null;
	private Map<String, List<ErrorDetail>> legalEntityDetailsErrorMap = null;
	private Map<String, List<ErrorDetail>> jobDetailsErrorMap = null;
	private Map<String, List<ErrorDetail>> managerDetailsErrorMap = null;
	private Map<String, List<ErrorDetail>> positionDetailsErrorMap = null;
	private List<Map<String, List<ErrorDetail>>> errorMapList = null;

	private ValidatorFactory factory = null;
	private Validator validator = null;

	private final static Logger LOGGER = LoggerManager.getLogger(CSVReaderUtil.class);

	@PostConstruct
	public void initializeData() {

		departmentDetailsList = new ArrayList<DepartmentDetails>();
		legalEntityDetailsList = new ArrayList<LegalEntityDetails>();
		jobDetailsList = new ArrayList<JobDetails>();
		managerDetailsList = new ArrayList<ManagerDetails>();
		positionDetailsList = new ArrayList<PositionDetails>();

		departmentDetailsErrorMap = new HashMap<String, List<ErrorDetail>>();
		legalEntityDetailsErrorMap = new HashMap<String, List<ErrorDetail>>();
		jobDetailsErrorMap = new HashMap<String, List<ErrorDetail>>();
		managerDetailsErrorMap = new HashMap<String, List<ErrorDetail>>();
		positionDetailsErrorMap = new HashMap<String, List<ErrorDetail>>();
		errorMapList = new ArrayList<Map<String, List<ErrorDetail>>>();

		errorMapList.add(departmentDetailsErrorMap);
		errorMapList.add(legalEntityDetailsErrorMap);
		errorMapList.add(jobDetailsErrorMap);
		errorMapList.add(managerDetailsErrorMap);
		errorMapList.add(positionDetailsErrorMap);

		factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();

	}

	public int loadJobDetailsData(String fileName, int fileId) {
		List<JobDetails> jobDtlsList =readJobDetails(fileName, fileId); 
		jobDetailsList.addAll(jobDtlsList);
		return jobDtlsList.size();
	}

	public int loadDepartmentDetails(String fileName, int fileId) {
		List<DepartmentDetails> deptDetailsList=readDepartmentDetails(fileName, fileId);
		departmentDetailsList.addAll(deptDetailsList);
		return deptDetailsList.size();
	}

	public int loadLegalEntityDetailsData(String fileName, int fileId) {
		List<LegalEntityDetails> legalEntityDtlsList=readLegalEntityDetails(fileName, fileId);
		legalEntityDetailsList.addAll(legalEntityDtlsList);
		return legalEntityDtlsList.size();
	}

	public int loadManagerDetailsData(String fileName, int fileId) {

		List<ManagerDetails> managerDtlsList=readManagerDetails(fileName, fileId);
    	managerDetailsList.addAll(managerDtlsList);
		return managerDtlsList.size();
	}

	public int loadPositionDetailsListData(String fileName, int fileId) {
		List<PositionDetails> positionDtlsList=readPositionDetails(fileName, fileId);
		positionDetailsList.addAll(positionDtlsList);
		return positionDtlsList.size();
	}

	public void clearListAndMapDetails() {

		jobDetailsList.clear();
		managerDetailsList.clear();
		positionDetailsList.clear();
		departmentDetailsList.clear();
		legalEntityDetailsList.clear();

		departmentDetailsErrorMap.clear();
		legalEntityDetailsErrorMap.clear();
		jobDetailsErrorMap.clear();
		managerDetailsErrorMap.clear();
		positionDetailsErrorMap.clear();

	}

	public void displayData() {

		LOGGER.info("\n_____________________Position Details______________________________________________________\n");

		for (PositionDetails positionDetails : positionDetailsList) {
			LOGGER.info(positionDetails.toString());
		}
		LOGGER.info(
				"\n_____________________Position Details______________________________________________________\n\n");

		LOGGER.info(
				"\n_____________________Department Details______________________________________________________\n");

		for (DepartmentDetails departmentDetails : departmentDetailsList) {
			LOGGER.info(departmentDetails.toString());
		}
		LOGGER.info(
				"\n_____________________Department Details______________________________________________________\n\n");

		LOGGER.info(
				"\n_____________________Legal Entity Details______________________________________________________\n");
		for (LegalEntityDetails legalEntityDetails : legalEntityDetailsList) {
			LOGGER.info(legalEntityDetails.toString());
		}
		LOGGER.info(
				"\n_____________________Legal Entity Details______________________________________________________\n\n");

		LOGGER.info("\n_____________________Job Details______________________________________________________\n");
		for (JobDetails jobDetails : jobDetailsList) {
			LOGGER.info(jobDetails.toString());
		}
		LOGGER.info("\n_____________________Job Details______________________________________________________\n\n");

		LOGGER.info("\n______________________Manager Details_____________________________________________________\n");
		for (ManagerDetails managerDetails : managerDetailsList) {
			LOGGER.info(managerDetails.toString());
		}
		LOGGER.info("\n_____________________Manager Details______________________________________________________\n\n");

	}

	public List<DepartmentDetails> getDepartmentDetailsList(RecordStatus status) {

		if (status.equals(RecordStatus.ALL))
			return departmentDetailsList;
		else if (status.equals(RecordStatus.NEW_OR_CHANGE))
			return departmentDetailsList.stream().filter(deptDetails -> {
				return ACTIVE_YES.equalsIgnoreCase(deptDetails.getActive());
			}).collect(Collectors.toList());
		else if (status.equals(RecordStatus.ENDED))
			return departmentDetailsList.stream().filter(deptDetails -> {
				return ACTIVE_NO.equalsIgnoreCase(deptDetails.getActive());
			}).collect(Collectors.toList());
		else
			return null;
	}

	public List<LegalEntityDetails> getLegalEntityDetailsList(RecordStatus status) {
		if (status.equals(RecordStatus.ALL))
			return legalEntityDetailsList;
		else if (status.equals(RecordStatus.NEW_OR_CHANGE))
			return legalEntityDetailsList.stream().filter(legalEntityDetails -> {
				return ACTIVE_YES.equalsIgnoreCase(legalEntityDetails.getActiveStatus());
			}).collect(Collectors.toList());
		else if (status.equals(RecordStatus.ENDED))
			return legalEntityDetailsList.stream().filter(legalEntityDetails -> {
				return ACTIVE_NO.equalsIgnoreCase(legalEntityDetails.getActiveStatus());
			}).collect(Collectors.toList());
		else
			return null;

	}

	public List<JobDetails> getJobDetailsList(RecordStatus status) {

		if (status.equals(RecordStatus.ALL))
			return jobDetailsList;
		else if (status.equals(RecordStatus.NEW_OR_CHANGE))
			return jobDetailsList.stream().filter(jobDetails -> {
				return ACTIVE_YES.equalsIgnoreCase(jobDetails.getActiveStatus());
			}).collect(Collectors.toList());
		else if (status.equals(RecordStatus.ENDED))
			return jobDetailsList.stream().filter(jobDetails -> {
				return ACTIVE_NO.equalsIgnoreCase(jobDetails.getActiveStatus());
			}).collect(Collectors.toList());
		else
			return null;

	}

	public List<ManagerDetails> getManagerDetailsList(RecordStatus status) {

		if (status.equals(RecordStatus.ALL))
			return managerDetailsList;
		else if (status.equals(RecordStatus.NEW_OR_CHANGE))
			return managerDetailsList.stream().filter(managerDetails -> {
				return ACTIVE_YES.equalsIgnoreCase(managerDetails.getActiveStatus());
			}).collect(Collectors.toList());
		else if (status.equals(RecordStatus.ENDED))
			return managerDetailsList.stream().filter(managerDetails -> {
				return ACTIVE_NO.equalsIgnoreCase(managerDetails.getActiveStatus());
			}).collect(Collectors.toList());
		else
			return null;

	}

	public List<PositionDetails> getPositionDetailsList(RecordStatus status) {

		if (status.equals(RecordStatus.ALL))
			return positionDetailsList;
		else if (status.equals(RecordStatus.NEW_OR_CHANGE))
			return positionDetailsList.stream().filter(positionDetails -> {
				return ACTIVE_YES.equalsIgnoreCase(positionDetails.getActiveStatus());
			}).collect(Collectors.toList());
		else if (status.equals(RecordStatus.ENDED))
			return positionDetailsList.stream().filter(positionDetails -> {
				return ACTIVE_NO.equalsIgnoreCase(positionDetails.getActiveStatus());
			}).collect(Collectors.toList());
		else
			return null;

	}

	public List<PositionDetails> readPositionDetails(String fileName, int fileId) {

		Reader in = null;
		List<PositionDetails> positionDetailsList = null;

		PositionDetails positionDetails = null;
		String key = null;
		try {
			key = fileName.substring(fileName.lastIndexOf("/") + 1) + "-" + fileId;
			positionDetailsList = new ArrayList<PositionDetails>();

			in = new FileReader(fileName);

			Iterable<CSVRecord> records = CSVFormat.RFC4180.builder().setHeader(POSITION_FILE_HEADERS)
					.setSkipHeaderRecord(true).build().parse(in);
			List<ErrorDetail> errorList = null;

			for (CSVRecord record : records) {

				try {
					String positionCode = record.get("MYHR_POSITION_CODE");
					String positionName = record.get("POSITION_NAME");
					String legalEntity = record.get("LEGAL_ENTITY");
					String country = record.get("Country");
					String dscglobalJobCode = record.get("DSC_GLOBAL_JOB_CODE");
				//	String jobTemplateTitle = record.get("JOB_TEMPLATE_TITLE");
					String dscglobaljobName=record.get("DSC_GLOBAL_JOB_Name");
					String position= record.get("Position");					
					String departmentName = record.get("DEPARTMENT_NAME");
					String workHours = record.get("WORK_HOURS");
					String workHoursFrequencey = record.get("WORK_HOURS_FREQUENCY");
					String rcsGrade = record.get("RCS_GRADE");
					String localGrade = record.get("Local_GRADE");
					String fullVsPartTime = record.get("Full time vs Part time");
					String activeStatus = record.get("ACTIVE_STATUS");

					positionDetails = new PositionDetails();
					positionDetails.setMyhrPositionCode(positionCode);
					positionDetails.setPositionName(positionName);
					positionDetails.setLegalEntity(legalEntity);
					positionDetails.setDscGlobalJobCode(dscglobalJobCode);
				//	positionDetails.setJobTemplateTitle(jobTemplateTitle);
					positionDetails.setDepartmentName(departmentName);
					positionDetails.setWorkHours(workHours);
					positionDetails.setWorkHoursFrequency(workHoursFrequencey);
					positionDetails.setRcsGrade(rcsGrade);
					positionDetails.setActiveStatus(activeStatus);
					positionDetails.setFileId(fileId);
					
					positionDetails.setCountry(country);
					positionDetails.setLocalGrade(localGrade);
					//positionDetails.setLocalGrade("");
					positionDetails.setFullVsPartTime(fullVsPartTime);
					positionDetails.setDscglobaljobName(dscglobaljobName);
					positionDetails.setPosition(position);
	
					Set<ConstraintViolation<PositionDetails>> violations = validator.validate(positionDetails);

					if (violations.size() > 0) {
						if (!positionDetailsErrorMap.containsKey(key)) {
							errorList = new ArrayList<ErrorDetail>();
							positionDetailsErrorMap.put(key, errorList);
						}
						for (ConstraintViolation<PositionDetails> violation : violations) {
							LOGGER.debug(violation.getMessage());
							ErrorDetail errorDetail = new ErrorDetail();
							errorDetail.setError_Message(violation.getMessage());
							errorDetail.setRow_Number(record.getRecordNumber());
							errorList.add(errorDetail);
						}
					} else {
						positionDetailsList.add(positionDetails);
					}
				} catch (Exception e) {
					LOGGER.error("Error occured in readPositionDetails " + e.getMessage());
					if (!positionDetailsErrorMap.containsKey(key)) {
						errorList = new ArrayList<ErrorDetail>();
						positionDetailsErrorMap.put(key, errorList);
					}
					ErrorDetail errorDetail = new ErrorDetail();
					errorDetail.setError_Message(e.getMessage());
					errorDetail.setRow_Number(record.getRecordNumber());
					errorList.add(errorDetail);
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			LOGGER.error("Error occured in readPositionDetails " + e.getMessage());
			e.printStackTrace();
		}
		return positionDetailsList;

	}

	public List<DepartmentDetails> readDepartmentDetails(String fileName, int fileId) {

		Reader in = null;
		List<DepartmentDetails> departmentDetailsList = null;

		DepartmentDetails deptDetails = null;
		String key = null;
		try {
			key = fileName.substring(fileName.lastIndexOf("/") + 1) + "-" + fileId;
			departmentDetailsList = new ArrayList<DepartmentDetails>();

			in = new FileReader(fileName);

			Iterable<CSVRecord> records = CSVFormat.RFC4180.builder().setHeader(DEPT_FILE_HEADERS)
					.setSkipHeaderRecord(true).build().parse(in);
			List<ErrorDetail> errorList = null;

			for (CSVRecord record : records) {
				try {
					String deptId=record.get("Department ID Unique");					
					String departmentName = record.get("DEPARTMENT_NAME");
					String orgUnit = record.get("ORG_UNIT");
					String locationCode = record.get("LOCATION_CODE");
					String locationName = record.get("LOCATION_NAME");
					String facilityId = record.get("FACILITY_ID");
					String sector = record.get("SECTOR");
					String deptCostString = record.get("DEPARTMENT_COST_STRING");
					String legalEntity = record.get("LEGAL_ENTITY");
					String country = record.get("Country");
					String active = record.get("Active");

					deptDetails = new DepartmentDetails();
					deptDetails.setDepartmentId(deptId);
					deptDetails.setLegalEntity(legalEntity);
					deptDetails.setDepartmentName(departmentName);
					deptDetails.setOrgUnit(orgUnit);
					deptDetails.setDeptCostString(deptCostString);
					deptDetails.setLocationCode(locationCode);
					deptDetails.setSector(sector);
					deptDetails.setActive(active);
					deptDetails.setFileId(fileId);
					deptDetails.setCountry(country);
					
					deptDetails.setLocationName(locationName);
					deptDetails.setFacilityId(facilityId);
					

					Set<ConstraintViolation<DepartmentDetails>> violations = validator.validate(deptDetails);

					if (violations.size() > 0) {

						if (!departmentDetailsErrorMap.containsKey(key)) {
							errorList = new ArrayList<ErrorDetail>();
							departmentDetailsErrorMap.put(key, errorList);
						}
						for (ConstraintViolation<DepartmentDetails> violation : violations) {
							LOGGER.debug(violation.getMessage());
							ErrorDetail errorDetail = new ErrorDetail();
							errorDetail.setError_Message(violation.getMessage());
							errorDetail.setRow_Number(record.getRecordNumber());
							errorList.add(errorDetail);
						}
					} else {
						departmentDetailsList.add(deptDetails);
					}
				} catch (Exception e) {
					LOGGER.error("Error occured in readDepartmentDetails " + e.getMessage());
					if (!departmentDetailsErrorMap.containsKey(key)) {
						errorList = new ArrayList<ErrorDetail>();
						departmentDetailsErrorMap.put(key, errorList);
					}
					ErrorDetail errorDetail = new ErrorDetail();
					errorDetail.setError_Message(e.getMessage());
					errorDetail.setRow_Number(record.getRecordNumber());
					errorList.add(errorDetail);
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			LOGGER.error("Error occured in readDepartmentDetails " + e.getMessage());
			e.printStackTrace();
		}
		return departmentDetailsList;

	}

	public List<LegalEntityDetails> readLegalEntityDetails(String fileName, int fileId) {

		Reader in = null;
		List<LegalEntityDetails> legalEntityDetailsList = null;

		LegalEntityDetails legalEntityDetails = null;
		String key = null;
		try {
			key = fileName.substring(fileName.lastIndexOf("/") + 1) + "-" + fileId;
			legalEntityDetailsList = new ArrayList<LegalEntityDetails>();

			in = new FileReader(fileName);

			Iterable<CSVRecord> records = CSVFormat.RFC4180.builder().setHeader(LEGAL_ENTITY_FILE_HEADERS)
					.setSkipHeaderRecord(true).build().parse(in);

			List<ErrorDetail> errorList = null;

			for (CSVRecord record : records) {
				try {
					String legalEntity = record.get("LEGAL_ENTITY");
					String countryName = record.get("COUNTRY");
					String activeStatus = record.get("ACTIVE_STATUS");

					legalEntityDetails = new LegalEntityDetails();
					legalEntityDetails.setLegalEntity(legalEntity);
					legalEntityDetails.setCountry(countryName);
					legalEntityDetails.setActiveStatus(activeStatus);
					legalEntityDetails.setFileId(fileId);

					Set<ConstraintViolation<LegalEntityDetails>> violations = validator.validate(legalEntityDetails);

					if (violations.size() > 0) {
						if (!legalEntityDetailsErrorMap.containsKey(key)) {
							errorList = new ArrayList<ErrorDetail>();
							legalEntityDetailsErrorMap.put(key, errorList);
						}
						for (ConstraintViolation<LegalEntityDetails> violation : violations) {
							LOGGER.debug(violation.getMessage());
							ErrorDetail errorDetail = new ErrorDetail();
							errorDetail.setError_Message(violation.getMessage());
							errorDetail.setRow_Number(record.getRecordNumber());
							errorList.add(errorDetail);

						}
					} else {
						legalEntityDetailsList.add(legalEntityDetails);
					}

				} catch (Exception e) {
					LOGGER.error("Error occured in readLegalEntityDetails " + e.getMessage());
					if (!legalEntityDetailsErrorMap.containsKey(key)) {
						errorList = new ArrayList<ErrorDetail>();
						legalEntityDetailsErrorMap.put(key, errorList);
					}
					ErrorDetail errorDetail = new ErrorDetail();
					errorDetail.setError_Message(e.getMessage());
					errorDetail.setRow_Number(record.getRecordNumber());
					errorList.add(errorDetail);
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			LOGGER.error("Error occured in readLegalEntityDetails " + e.getMessage());
			e.printStackTrace();
		}
		return legalEntityDetailsList;

	}

	public List<JobDetails> readJobDetails(String fileName, int fileId) {

		Reader in = null;
		List<JobDetails> jobDetailsList = null;

		JobDetails jobDetails = null;
		String key = null;

		try {
			key = fileName.substring(fileName.lastIndexOf("/") + 1) + "-" + fileId;
			jobDetailsList = new ArrayList<JobDetails>();

			in = new FileReader(fileName);

			Iterable<CSVRecord> records = CSVFormat.RFC4180.builder().setHeader(JOB_FILE_HEADERS)
					.setSkipHeaderRecord(true).build().parse(in);

			List<ErrorDetail> errorList = null;

			for (CSVRecord record : records) {

				try {
					String dscGlobalJobCode = record.get("DSC_GLOBAL_JOB_CODE");
					String dpdhlJobFunction = record.get("DPDHL_JOB_FUNCTION");
					String dpdhlJobFamily = record.get("DPDHL_JOB_FAMILY");
					String dscGlobalJobName = record.get("DSC_GLOBAL_JOB_NAME");
					String careerStream = record.get("CAREER_STREAM");
					String careerLevel = record.get("CAREER_LEVEL");
					String dpdhlJobCode = record.get("DPDHL_JOB_CODE");

					//String myHrPositionCode = record.get("MYHR_POSITION_CODE");
					String activeStatus = record.get("ACTIVE_STATUS");

					jobDetails = new JobDetails();
					jobDetails.setDscGlobalJobCode(dscGlobalJobCode);
					jobDetails.setDpdhlJobFunction(dpdhlJobFunction);

					jobDetails.setDpdhlJobFamily(dpdhlJobFamily);
					jobDetails.setDscGlobalJobName(dscGlobalJobName);

					jobDetails.setCareerStream(careerStream);
					jobDetails.setCareerLevel(careerLevel);
					jobDetails.setDpdhlJobCode(dpdhlJobCode);
					
					jobDetails.setActiveStatus(activeStatus);
					jobDetails.setFileId(fileId);
					
					Set<ConstraintViolation<JobDetails>> violations = validator.validate(jobDetails);

					if (violations.size() > 0) {

						if (!jobDetailsErrorMap.containsKey(key)) {
							errorList = new ArrayList<ErrorDetail>();
							jobDetailsErrorMap.put(key, errorList);
						}

						for (ConstraintViolation<JobDetails> violation : violations) {
							LOGGER.debug(violation.getMessage());
							ErrorDetail errorDetail = new ErrorDetail();
							errorDetail.setError_Message(violation.getMessage());
							errorDetail.setRow_Number(record.getRecordNumber());
							errorList.add(errorDetail);
						}
					} else {
						jobDetailsList.add(jobDetails);
					}
				} catch (Exception e) {
					LOGGER.error("Error occured in readJobDetails " + e.getMessage());
					if (!jobDetailsErrorMap.containsKey(key)) {
						errorList = new ArrayList<ErrorDetail>();
						jobDetailsErrorMap.put(key, errorList);
					}
					ErrorDetail errorDetail = new ErrorDetail();
					errorDetail.setError_Message(e.getMessage());
					errorDetail.setRow_Number(record.getRecordNumber());
					errorList.add(errorDetail);
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			LOGGER.error("Error occured in readJobDetails " + e.getMessage());
			e.printStackTrace();
		}
		return jobDetailsList;

	}

	public List<ManagerDetails> readManagerDetails(String fileName, int fileId) {

		Reader in = null;
		List<ManagerDetails> managerDetailsList = null;

		ManagerDetails managerDetails = null;
		String key = null;
		try {
			key = fileName.substring(fileName.lastIndexOf("/") + 1) + "-" + fileId;
			managerDetailsList = new ArrayList<ManagerDetails>();

			in = new FileReader(fileName);

			Iterable<CSVRecord> records = CSVFormat.RFC4180.builder().setHeader(MANAGER_FILE_HEADERS)
					.setSkipHeaderRecord(true).build().parse(in);

			List<ErrorDetail> errorList = null;

			for (CSVRecord record : records) {

				try {
					String gid = record.get("GID");
					String firstName = record.get("FIRST_NAME");
					String lastName = record.get("LAST_NAME");
					String email = record.get("EMAIL").trim();
					String businessTitle = record.get("BUSINESSTITLE");
					String country = record.get("COUNTRY");
					String timezone = record.get("TIMEZONE");
					String activeStatus = record.get("ACTIVE_STATUS");

					managerDetails = new ManagerDetails();
					managerDetails.setGid(gid);
					managerDetails.setFirstName(firstName);
					managerDetails.setLastName(lastName);
					managerDetails.setEmail(email);
					managerDetails.setBusinessTitle(businessTitle);
					managerDetails.setCountry(country);
					managerDetails.setTimezone(timezone);
					managerDetails.setActiveStatus(activeStatus);
					managerDetails.setFileId(fileId);
					managerDetails.setFileName(key);
					managerDetails.setRowNumber(record.getRecordNumber());

					Set<ConstraintViolation<ManagerDetails>> violations = validator.validate(managerDetails);
					System.out.println(managerDetails+" "+violations.size());
					if (violations.size() > 0) {

						if (!managerDetailsErrorMap.containsKey(key)) {
							errorList = new ArrayList<ErrorDetail>();
							managerDetailsErrorMap.put(key, errorList);
							}

						for (ConstraintViolation<ManagerDetails> violation : violations) {
							System.out.println(violation.getMessage());
							ErrorDetail errorDetail = new ErrorDetail();
							errorDetail.setError_Message(violation.getMessage());
							errorDetail.setRow_Number(record.getRecordNumber());
							errorList.add(errorDetail);
						}
					} else {
						managerDetailsList.add(managerDetails);
					}
				} catch (Exception e) {
					
					LOGGER.error("Error occured in readManagerDetails " + e.getMessage());
					if (!managerDetailsErrorMap.containsKey(key)) {
						errorList = new ArrayList<ErrorDetail>();
						managerDetailsErrorMap.put(key, errorList);
					}
					ErrorDetail errorDetail = new ErrorDetail();
					errorDetail.setError_Message(e.getMessage());
					errorDetail.setRow_Number(record.getRecordNumber());
					errorList.add(errorDetail);
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			LOGGER.error("Error occured in readManagerDetails " + e.getMessage());
			e.printStackTrace();
		}
		return managerDetailsList;

	}

	public static void main(String[] args) {

		CSVReaderUtil readerUtil = new CSVReaderUtil();

		List<DepartmentDetails> departmentDetailsList = readerUtil.readDepartmentDetails(
				"/home/mathan/Documents/aTalent/DHL/Composite Files/Changes and End Date/File Department_C - myHR_TalentLink_DEPT_2022030714546.csv",
				1);

		List<LegalEntityDetails> legalEntityDetailsList = readerUtil.readLegalEntityDetails(
				"/home/mathan/Documents/aTalent/DHL/Composite Files/Changes and End Date/File LegalEntity_C - myHR_TalentLink_COUNTRYANDLEGAL_2022030714546.csv",
				2);

		List<JobDetails> jobDetailsList = readerUtil.readJobDetails(
				"/home/mathan/Documents/aTalent/DHL/Composite Files/Changes and End Date/File Job_C - myHR_TalentLink_JOB_2022030714546.csv",
				3);

		List<ManagerDetails> managerDetailsList = readerUtil.readManagerDetails(
				"/home/mathan/Documents/aTalent/DHL/Composite Files/Changes and End Date/File Manager_C - myHR_TalentLink_MANAGER_2022030714546.csv",
				4);

		List<PositionDetails> positionDetailsList = readerUtil.readPositionDetails(
				"/home/mathan/Documents/aTalent/DHL/Composite Files/Changes and End Date/File Position_C - myHR_TalentLink_POSCODE_DETAILS_2022030714546.csv",
				5);

		LOGGER.info("\n_____________________Position Details______________________________________________________\n");

		for (PositionDetails positionDetails : positionDetailsList) {
			LOGGER.info(positionDetails.toString());
		}

		LOGGER.info(
				"\n_____________________Department Details______________________________________________________\n");

		for (DepartmentDetails departmentDetails : departmentDetailsList) {
			LOGGER.info(departmentDetails.toString());
		}

		LOGGER.info(
				"\n_____________________Legal Entity Details______________________________________________________\n");
		for (LegalEntityDetails legalEntityDetails : legalEntityDetailsList) {
			LOGGER.info(legalEntityDetails.toString());
		}

		LOGGER.info("\n_____________________Job Details______________________________________________________\n");
		for (JobDetails jobDetails : jobDetailsList) {
			LOGGER.info(jobDetails.toString());
		}

		LOGGER.info("\n______________________Manager Details___________________________\n");
		for (ManagerDetails managerDetails : managerDetailsList) {
			LOGGER.info(managerDetails.toString());
		}
	}

	public void displayValidationErrorDetails() {

		LOGGER.info("\n______________________Department Details_________________________\n");
		departmentDetailsErrorMap.forEach((fileName, errorMessages) -> {
			LOGGER.info("FileName: " + fileName);
			errorMessages.forEach(errorDetails -> {
				LOGGER.info("ErrorMessage: " + errorDetails);
			});
		});

		LOGGER.info("\n______________________LegalEntity Details_________________________\n");
		legalEntityDetailsErrorMap.forEach((fileName, errorMessages) -> {
			LOGGER.info("FileName: " + fileName);
			errorMessages.forEach(errorDetails -> {
				LOGGER.info("ErrorMessage: " + errorDetails);
			});
		});

		LOGGER.info("\n______________________Position Details_________________________\n");
		positionDetailsErrorMap.forEach((fileName, errorMessages) -> {
			LOGGER.info("FileName: " + fileName);
			errorMessages.forEach(errorDetails -> {
				LOGGER.info("ErrorMessage: " + errorDetails);
			});
		});

		LOGGER.info("\n______________________Job Details_________________________\n");
		jobDetailsErrorMap.forEach((fileName, errorMessages) -> {
			LOGGER.info("FileName: " + fileName);
			errorMessages.forEach(errorDetails -> {
				LOGGER.info("ErrorMessage: " + errorDetails);
			});
		});

		LOGGER.info("\n______________________Manager Details_________________________\n");
		managerDetailsErrorMap.forEach((fileName, errorMessages) -> {
			LOGGER.info("FileName: " + fileName);
			errorMessages.forEach(errorDetails -> {
				LOGGER.info("ErrorMessage: " + errorDetails);
			});
		});

	}

	public Map<String, List<ErrorDetail>> getDepartmentDetailsErrorMap() {
		return departmentDetailsErrorMap;
	}

	public Map<String, List<ErrorDetail>> getLegalEntityDetailsErrorMap() {
		return legalEntityDetailsErrorMap;
	}

	public Map<String, List<ErrorDetail>> getJobDetailsErrorMap() {
		return jobDetailsErrorMap;
	}

	public Map<String, List<ErrorDetail>> getManagerDetailsErrorMap() {
		return managerDetailsErrorMap;
	}

	public Map<String, List<ErrorDetail>> getPositionDetailsErrorMap() {
		return positionDetailsErrorMap;
	}

	public List<Map<String, List<ErrorDetail>>> getErrorMapList() {

		return errorMapList;
	}

	public void addDecryptErrorDetail(String fileName, int fileId, String errorMessage) {

		List<ErrorDetail> errorList = null;

		String key = fileName.substring(fileName.lastIndexOf("/") + 1) + "-" + fileId;

		if (fileName.contains(CommonConstants.DEPARTMENT_TEXT)) {

			if (!departmentDetailsErrorMap.containsKey(key)) {
				errorList = new ArrayList<ErrorDetail>();
				departmentDetailsErrorMap.put(key, errorList);
			}

			ErrorDetail errorDetail = new ErrorDetail();
			errorDetail.setError_Message("Error occured while reading input file " + errorMessage);
			errorDetail.setRow_Number(0);
			departmentDetailsErrorMap.get(key).add(errorDetail);

		} else if (fileName.contains(CommonConstants.LEGAL_DETAILS_TEXT)) {

			if (!legalEntityDetailsErrorMap.containsKey(key)) {
				errorList = new ArrayList<ErrorDetail>();
				legalEntityDetailsErrorMap.put(key, errorList);
			}

			ErrorDetail errorDetail = new ErrorDetail();
			errorDetail.setError_Message("Error occured during Decryption " + errorMessage);
			errorDetail.setRow_Number(0);
			legalEntityDetailsErrorMap.get(key).add(errorDetail);

		} else if (fileName.contains(CommonConstants.MANAGER_DETAILS_TEXT)) {

			if (!managerDetailsErrorMap.containsKey(key)) {
				errorList = new ArrayList<ErrorDetail>();
				managerDetailsErrorMap.put(key, errorList);
			}

			ErrorDetail errorDetail = new ErrorDetail();
			errorDetail.setError_Message("Error occured during Decryption " + errorMessage);
			errorDetail.setRow_Number(0);
			managerDetailsErrorMap.get(key).add(errorDetail);

		} else if (fileName.contains(CommonConstants.JOB_DETAILS_TEXT)) {

			if (!jobDetailsErrorMap.containsKey(key)) {
				errorList = new ArrayList<ErrorDetail>();
				jobDetailsErrorMap.put(key, errorList);
			}

			ErrorDetail errorDetail = new ErrorDetail();
			errorDetail.setError_Message("Error occured during Decryption " + errorMessage);
			errorDetail.setRow_Number(0);
			jobDetailsErrorMap.get(key).add(errorDetail);

		} else if (fileName.contains(CommonConstants.POS_DETAILS_TEXT)) {

			if (!positionDetailsErrorMap.containsKey(key)) {
				errorList = new ArrayList<ErrorDetail>();
				positionDetailsErrorMap.put(key, errorList);
			}

			ErrorDetail errorDetail = new ErrorDetail();
			errorDetail.setError_Message("Error occured during Decryption " + errorMessage);
			errorDetail.setRow_Number(0);
			positionDetailsErrorMap.get(key).add(errorDetail);

		}
	}

	

}
