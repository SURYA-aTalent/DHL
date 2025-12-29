package com.dhl.dhltalentlinkapp.utils;

import static com.dhl.dhltalentlinkapp.constants.CommonConstants.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.cronutils.utils.StringUtils;
import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.dao.DepartmentDetails;
import com.dhl.dhltalentlinkapp.dao.JobDetails;
import com.dhl.dhltalentlinkapp.dao.LegalEntityDetails;
import com.dhl.dhltalentlinkapp.dao.ManagerDetails;
import com.dhl.dhltalentlinkapp.dao.PositionDetails;
import com.dhl.dhltalentlinkapp.dao.TlkApiProcessor;
import com.dhl.dhltalentlinkapp.enums.RecordStatus;
import com.dhl.dhltalentlinkapp.inputfiledetails.Inputfiledetails;
import com.dhl.dhltalentlinkapp.inputfiledetails.InputfiledetailsImpl;
import com.dhl.dhltalentlinkapp.inputfiledetails.InputfiledetailsManager;
import com.dhl.dhltalentlinkapp.linkvaluedetails.Linkvaluedetails;
import com.dhl.dhltalentlinkapp.linkvaluedetails.LinkvaluedetailsImpl;
import com.dhl.dhltalentlinkapp.linkvaluedetails.LinkvaluedetailsManager;
import com.dhl.dhltalentlinkapp.lovdetails.Lovdetails;
import com.dhl.dhltalentlinkapp.lovdetails.LovdetailsImpl;
import com.dhl.dhltalentlinkapp.lovdetails.LovdetailsManager;
import com.dhl.dhltalentlinkapp.pojo.DeptUpdateResp;
import com.dhl.dhltalentlinkapp.pojo.ErrorDetail;
import com.dhl.dhltalentlinkapp.pojo.LovDetails;
import com.dhl.dhltalentlinkapp.poswithoutgrades.Poswithoutgrades;
import com.dhl.dhltalentlinkapp.poswithoutgrades.PoswithoutgradesManager;
import com.dhl.dhltalentlinkapp.services.ConfigurableService;
import com.dhl.dhltalentlinkapp.services.LovHierarchyService;
import com.dhl.dhltalentlinkapp.services.UserDetailsService;
import com.dhl.dhltalentlinkapp.tlkuserdetails.Tlkuserdetails;
import com.dhl.dhltalentlinkapp.tlkuserdetails.TlkuserdetailsImpl;
import com.dhl.dhltalentlinkapp.tlkuserdetails.TlkuserdetailsManager;
import com.mrted.ws.user.UserDto;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class ApiUtils {

	public Map<String, LovDetails> lovIdMap = null;
	private ConfigurableService configService = null;

	private UserDetailsService userService = null;

	private List<ErrorDetail> errorList = null;

	private LovHierarchyService myHierarchyService = null;
	private final static Logger LOGGER = LoggerManager.getLogger(ApiUtils.class);

	protected @Autowired LovdetailsManager lovDetailsManager;
	protected @Autowired LinkvaluedetailsManager linkValueDetailsManager;
	protected @Autowired PoswithoutgradesManager posWithoutGradesManager;
	public @Autowired InputfiledetailsManager inputFileDetailsManager;
	protected @Autowired CSVReaderUtil readerUtil;
	protected @Autowired CommonUtils commonUtil;
	protected @Autowired TlkuserdetailsManager userManager;
	private SimpleDateFormat sdf;

	public static int retryCount = 1;
	public static long setLovEntryCount = 0;
	public static long setLovLabelCount = 0;
	public static long setLinkValueCount = 0;
	public static long setUnLinkValueCount = 0;

	public static int numThreads = 5; // max 10 threads
	public static ExecutorService executor;

	public ApiUtils() {

		lovIdMap = new HashMap<String, LovDetails>();
		configService = new ConfigurableService();
		myHierarchyService = new LovHierarchyService();
		userService = new UserDetailsService();

		executor = Executors.newFixedThreadPool(numThreads);
		sdf = new SimpleDateFormat(CommonConstants.UPLOAD_DATE_FORMAT);

		lovIdMap.put(COLUMN_HEADER_COUNTRY,
				new LovDetails(LOV_FIELD_NAME_COUNTRY, LOV_FIELD_ID_COUNTRY, LOV_FIELD_MEMBER_ID_COUNTRY));
		lovIdMap.put(COLUMN_HEADER_LEGAL_ENTITY, new LovDetails(LOV_FIELD_NAME_LEGAL_ENTITY, LOV_FIELD_ID_LEGAL_ENTITY,
				LOV_FIELD_MEMBER_ID_LEGAL_ENTITY));
		lovIdMap.put(COLUMN_HEADER_LEGAL_ENTITY_OLD, new LovDetails(LOV_FIELD_NAME_LEGAL_ENTITY_OLD,
				LOV_FIELD_ID_LEGAL_ENTITY_OLD, LOV_FIELD_MEMBER_ID_LEGAL_ENTITY_OLD));
		lovIdMap.put(COLUMN_HEADER_DEPARTMENT_NAME, new LovDetails(LOV_FIELD_NAME_DEPARTMENT_NAME,
				LOV_FIELD_ID_DEPARTMENT_NAME, LOV_FIELD_MEMBER_ID_DEPARTMENT_NAME));
		lovIdMap.put(COLUMN_HEADER_ORG_UNIT,
				new LovDetails(LOV_FIELD_NAME_ORG_UNIT, LOV_FIELD_ID_ORG_UNIT, LOV_FIELD_MEMBER_ID_ORG_UNIT));
		lovIdMap.put(COLUMN_HEADER_LOCATION_CODE, new LovDetails(LOV_FIELD_NAME_LOCATION_CODE,
				LOV_FIELD_ID_LOCATION_CODE, LOV_FIELD_MEMBER_ID_LOCATION_CODE));
		lovIdMap.put(COLUMN_HEADER_SECTOR,
				new LovDetails(LOV_FIELD_NAME_SECTOR, LOV_FIELD_ID_SECTOR, LOV_FIELD_MEMBER_ID_SECTOR));
		lovIdMap.put(COLUMN_HEADER_DEPARTMENT_COST_STRING, new LovDetails(LOV_FIELD_NAME_DEPARTMENT_COST_STRING,
				LOV_FIELD_ID_DEPARTMENT_COST_STRING, LOV_FIELD_MEMBER_ID_DEPARTMENT_COST_STRING));
		lovIdMap.put(COLUMN_HEADER_DSC_GLOBAL_JOB_CODE, new LovDetails(LOV_FIELD_NAME_DSC_GLOBAL_JOB_CODE,
				LOV_FIELD_ID_DSC_GLOBAL_JOB_CODE, LOV_FIELD_MEMBER_ID_DSC_GLOBAL_JOB_CODE));
		lovIdMap.put(COLUMN_HEADER_DSC_GLOBAL_JOB_CODE_2, new LovDetails(LOV_FIELD_NAME_DSC_GLOBAL_JOB_CODE,
				LOV_FIELD_ID_DSC_GLOBAL_JOB_CODE, LOV_FIELD_MEMBER_ID_DSC_GLOBAL_JOB_CODE));
		lovIdMap.put(COLUMN_HEADER_DPDHL_JOB_FUNCTION, new LovDetails(LOV_FIELD_NAME_DPDHL_JOB_FUNCTION,
				LOV_FIELD_ID_DPDHL_JOB_FUNCTION, LOV_FIELD_MEMBER_ID_DPDHL_JOB_FUNCTION));
		lovIdMap.put(COLUMN_HEADER_DPDHL_JOB_FAMILY, new LovDetails(LOV_FIELD_NAME_DPDHL_JOB_FAMILY,
				LOV_FIELD_ID_DPDHL_JOB_FAMILY, LOV_FIELD_MEMBER_ID_DPDHL_JOB_FAMILY));
		lovIdMap.put(COLUMN_HEADER_DSC_GLOBAL_JOB_NAME, new LovDetails(LOV_FIELD_NAME_DSC_GLOBAL_JOB_NAME,
				LOV_FIELD_ID_DSC_GLOBAL_JOB_NAME, LOV_FIELD_MEMBER_ID_DSC_GLOBAL_JOB_NAME));

		lovIdMap.put(COLUMN_HEADER_POSITION,
				new LovDetails(LOV_FIELD_NAME_POSITION, LOV_FIELD_ID_POSITION, LOV_FIELD_MEMBER_ID_POSITION));

		lovIdMap.put(COLUMN_HEADER_CAREER_STREAM, new LovDetails(LOV_FIELD_NAME_CAREER_STREAM,
				LOV_FIELD_ID_CAREER_STREAM, LOV_FIELD_MEMBER_ID_CAREER_STREAM));
		lovIdMap.put(COLUMN_HEADER_CAREER_LEVEL, new LovDetails(LOV_FIELD_NAME_CAREER_LEVEL, LOV_FIELD_ID_CAREER_LEVEL,
				LOV_FIELD_MEMBER_ID_CAREER_LEVEL));
		lovIdMap.put(COLUMN_HEADER_DPDHL_JOB_CODE, new LovDetails(LOV_FIELD_NAME_DPDHL_JOB_CODE,
				LOV_FIELD_ID_DPDHL_JOB_CODE, LOV_FIELD_MEMBER_ID_DPDHL_JOB_CODE));
		lovIdMap.put(COLUMN_HEADER_MYHR_POSITION_CODE, new LovDetails(LOV_FIELD_NAME_MYHR_POSITION_CODE,
				LOV_FIELD_ID_MYHR_POSITION_CODE, LOV_FIELD_MEMBER_ID_MYHR_POSITION_CODE));
		lovIdMap.put(COLUMN_HEADER_POSITION_NAME, new LovDetails(LOV_FIELD_NAME_POSITION_NAME,
				LOV_FIELD_ID_POSITION_NAME, LOV_FIELD_MEMBER_ID_POSITION_NAME));

		// lovIdMap.put(COLUMN_HEADER_JOB_TEMPLATE_TITLE, new
		// LovDetails(LOV_FIELD_NAME_JOB_TEMPLATE_TITLE,
		// LOV_FIELD_ID_JOB_TEMPLATE_TITLE, LOV_FIELD_MEMBER_ID_JOB_TEMPLATE_TITLE));
		lovIdMap.put(COLUMN_HEADER_WORK_HOURS,
				new LovDetails(LOV_FIELD_NAME_WORK_HOURS, LOV_FIELD_ID_WORK_HOURS, LOV_FIELD_MEMBER_ID_WORK_HOURS));
		lovIdMap.put(COLUMN_HEADER_WORK_HOURS_FREQUENCY, new LovDetails(LOV_FIELD_NAME_WORK_HOURS_FREQUENCY,
				LOV_FIELD_ID_WORK_HOURS_FREQUENCY, LOV_FIELD_MEMBER_ID_WORK_HOURS_FREQUENCY));
		lovIdMap.put(COLUMN_HEADER_RCS_GRADE,
				new LovDetails(LOV_FIELD_NAME_RCS_GRADE, LOV_FIELD_ID_RCS_GRADE, LOV_FIELD_MEMBER_ID_RCS_GRADE));
		lovIdMap.put(COLUMN_HEADER_LOCAL_GRADE,
				new LovDetails(LOV_FIELD_NAME_LOCAL_GRADE, LOV_FIELD_ID_LOCAL_GRADE, LOV_FIELD_MEMBER_ID_LOCAL_GRADE));
		lovIdMap.put(COLUMN_HEADER_FULL_VS_PART_TIME, new LovDetails(LOV_FIELD_NAME_FULL_VS_PART_TIME,
				LOV_FIELD_ID_FULL_VS_PART_TIME, LOV_FIELD_MEMBER_ID_FULL_VS_PART_TIME));

		lovIdMap.put(COLUMN_HEADER_DEPARTMENT_ID, new LovDetails(LOV_FIELD_NAME_DEPARTMENT_ID,
				LOV_FIELD_ID_DEPARTMENT_ID, LOV_FIELD_MEMBER_ID_DEPARTMENT_ID));
		lovIdMap.put(COLUMN_HEADER_LOCATION_NAME, new LovDetails(LOV_FIELD_NAME_LOCATION_NAME,
				LOV_FIELD_ID_LOCATION_NAME, LOV_FIELD_MEMBER_ID_LOCATION_NAME));
		lovIdMap.put(COLUMN_HEADER_FACILITY_ID,
				new LovDetails(LOV_FIELD_NAME_FACILITY_ID, LOV_FIELD_ID_FACILITY_ID, LOV_FIELD_MEMBER_ID_FACILITY_ID));
		lovIdMap.put(COLUMN_HEADER_INTERNAL_DEPT_FILTER_BY, new LovDetails(LOV_FIELD_NAME_DEPT_FILTER_BY,
				LOV_FIELD_ID_DEPT_FILTER_BY, LOV_FIELD_MEMBER_ID_DEPT_FILTER_BY));
		lovIdMap.put(COLUMN_HEADER_GLOBAL_LOCATION_NAME, new LovDetails(LOV_FIELD_NAME_GLOBAL_LOCATION_NAME,
				LOV_FIELD_ID_GLOBAL_LOCATION_NAME, LOV_FIELD_MEMBER_ID_GLOBAL_LOCATION_NAME));

		lovIdMap.put(COLUMN_HEADER_LINE_MANAGER, new LovDetails(LOV_FIELD_NAME_LINE_MANAGER, LOV_FIELD_ID_LINE_MANAGER,
				LOV_FIELD_MEMBER_ID_LINE_MANAGER));

		lovIdMap.put(COLUMN_HEADER_LINE_MANAGER_POSITION, new LovDetails(LOV_FIELD_NAME_LINE_MANAGER_POSITION,
				LOV_FIELD_ID_LINE_MANAGER_POSITION, LOV_FIELD_MEMBER_ID_LINE_MANAGER_POSITION));

	}

	public boolean isEntryAlreadyAdded(String name, String value) {
		return false;
	}

	public Long addLovEntryAndLabel(String lovName, String lovValue) {
		Long vLovId = 0L;
		try {
			vLovId = configService.setLovEntry(lovIdMap.get(lovName).getLovName(), lovValue.replaceAll("_", ""),
					lovIdMap.get(lovName).getLovId(), lovValue.replaceAll("_", ""));
			setLovEntryCount++;
			configService.setLovLabel(lovIdMap.get(lovName).getLovName(), lovValue.replaceAll("_", ""),
					CONFIGURABLE_LOV, LANGUAGE_UK, lovValue, true);
			setLovLabelCount++;
			LOGGER.info("addLovEntryAndLabel: " + lovName + ", " + lovValue + ", " + vLovId);
		} catch (Exception e) {
			LOGGER.error("Exception occured in addLovEntryAndLabel " + e.getMessage());
			e.printStackTrace();
			throw e;
		}
		return vLovId;
	}

	public Long updateLovEntryAndLabel(String lovName, String oldlovValue, String newlovValue) {
		Long vLovId = 0L;
		try {
			vLovId = configService.setLovEntry(lovIdMap.get(lovName).getLovName(), oldlovValue,
					lovIdMap.get(lovName).getLovId(), newlovValue);
			setLovEntryCount++;
			configService.setLovLabel(lovIdMap.get(lovName).getLovName(), newlovValue, CONFIGURABLE_LOV, LANGUAGE_UK,
					newlovValue, true);
			setLovLabelCount++;
			LOGGER.info("updateLovEntryAndLabel: lovName: " + lovName + "oldlovValue: " + oldlovValue + " newLovValue: "
					+ newlovValue + " vLovId: " + vLovId);
		} catch (Exception e) {
			LOGGER.error("Exception occured in updateLovEntryAndLabel " + e.getMessage());
			e.printStackTrace();
			throw e;
		}
		return vLovId;
	}

	public String linkOrUnlinkValues(String lovName, long vlovId1, long vlovId2, boolean linkFlag) {
		String response = "false";

		if (vlovId1 != 0 && vlovId2 != 0) {
			boolean isAlreadyinDB = isAlreadyLinkedOrUnlinked(lovName, vlovId1, vlovId2, linkFlag);
			if (linkFlag) {

				if (!isAlreadyinDB) {
					boolean result = myHierarchyService.updateHierarchyMemberUnlockers(
							lovIdMap.get(lovName).getHiermemberid(), lovIdMap.get(lovName).getLovId(), vlovId1,
							vlovId2);
					setLinkValueCount++;
					return result + "";
				} else
					return "Already Linked";
			} else {
				if (!isAlreadyinDB) {
					boolean result = myHierarchyService.unLinkHierarchyMemberId(lovIdMap.get(lovName).getHiermemberid(),
							lovIdMap.get(lovName).getLovId(), vlovId1, vlovId2);
					setUnLinkValueCount++;
					return result + "";
				} else
					return "Already UnLinked";
			}
		} else {
			LOGGER.info("No ValueID found for lovName " + lovName);
			return "false";
		}

	}

	boolean isAlreadyLinkedOrUnlinked(String lovName, long vlovId1, long vlovId2, boolean linkFlag) {

		Comparator<Linkvaluedetails> idComparator = Comparator.comparing(Linkvaluedetails::getLinkValueId).reversed();
		boolean response = false;
		String statusValue = linkFlag ? ACTIVE : IN_ACTIVE;

		Optional<Linkvaluedetails> linkValueDetails = linkValueDetailsManager.stream()
				.filter(Linkvaluedetails.TO_FIELD_NAME.equal(lovName)
						.and(Linkvaluedetails.TO_FIELD_VALUE_ID.equal(vlovId1)
								.and(Linkvaluedetails.FROM_FIELD_VALUE_ID.equal(vlovId2))))
				.sorted(idComparator).findFirst();

		if (linkValueDetails.isPresent()) {
			response = linkValueDetails.get().getStatus().get().equals(statusValue);
		} else {
			response = false;
		}

		LOGGER.info("### isAlreadyLinkedOrUnlinked - " + response + "####");
		return response;
	}

	public Long getLovValueId(String lovName, String lovValue, int fileId) {

		if (!StringUtils.isEmpty(lovValue)) {
			long lovValueIdFromDB = getLovValueIdFromDB(lovName, lovValue);
			boolean isPresentInDB = (lovValueIdFromDB != 0) ? true : false;

			if (!isPresentInDB && !StringUtils.isEmpty(lovValue)) {
				long lovValueId = addLovEntryAndLabel(lovName, lovValue);
				addLovValueDetails(lovName, lovValue, lovValueId, fileId);
				return lovValueId;
			} else if (isPresentInDB) {
				LOGGER.info("Value Present in DB (" + lovValueIdFromDB + ")");
				return lovValueIdFromDB;
			} else {
				LOGGER.info("No Value found for lovName " + lovName);
			}

			return 0L;
		} else
			return 0L;
	}

	public Long updateAndGetLovValueId(String lovName, String newLovValue, String oldLovValue, int fileId) {

		long lovValueIdFromDB = getLovValueIdFromDB(lovName, oldLovValue);
		boolean isPresentInDB = (lovValueIdFromDB != 0) ? true : false;

		if (!StringUtils.isEmpty(newLovValue)) {
			long lovValueId = updateLovEntryAndLabel(lovName, oldLovValue, newLovValue);
			updateLovValueDetails(lovName, oldLovValue, newLovValue, lovValueId, fileId);
			return lovValueId;
		} else if (isPresentInDB) {
			LOGGER.info("Value Present in DB (" + lovValueIdFromDB + ")");
			return lovValueIdFromDB;
		} else {
			LOGGER.info("No Value found for lovName " + lovName);
		}

		return 0L;
	}

	public void addLovValueDetails(String lovName, String lovValue, long lovValueId, int fileId) {
		try {
			Lovdetails lovDetails = new LovdetailsImpl();
			lovDetails.setLovName(lovName);
			lovDetails.setLovValue(lovValue);
			lovDetails.setLovValueId(lovValueId);
			lovDetails.setFileId(fileId);
			lovDetails.setCreatedAt(new Timestamp(System.currentTimeMillis()));
			lovDetailsManager.persist(lovDetails);
		} catch (Exception e) {
			LOGGER.error("Exception occured in addLovValueDetails " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void updateLovValueDetails(String lovName, String oldlovValue, String newlovValue, long lovValueId,
			int fileId) {
		try {
			Optional<Lovdetails> lovDetails = lovDetailsManager.stream()
					.filter(Lovdetails.LOV_NAME.equal(lovName).and(
							Lovdetails.LOV_VALUE.equal(oldlovValue).and(Lovdetails.LOV_VALUE_ID.equal(lovValueId))))
					.findFirst();

			if (lovDetails.isPresent()) {
				Lovdetails existinglovDetails = lovDetails.get();
				existinglovDetails.setLovValue(newlovValue);
				lovDetailsManager.update(existinglovDetails);
				LOGGER.info("lov value details updated, lovName: " + lovName + ", lovValue: " + oldlovValue
						+ ", newlovValue: " + newlovValue + ", lovVaueId: " + lovValueId);
			} else {
				LOGGER.info("lov value details not found for lovname: " + lovName + ", lovValue: " + oldlovValue
						+ " lovVaueId: " + lovValueId);
			}

		} catch (Exception e) {
			LOGGER.error("Exception occured in updateLovValueDetails " + e.getMessage());
			e.printStackTrace();
		}
	}

	public long getLovValueIdFromDB(String lovName, String lovValue) {

		if (!StringUtils.isEmpty(lovValue)) {
			Optional<Lovdetails> lovDetails = lovDetailsManager.stream()
					.filter(Lovdetails.LOV_NAME.equal(lovName).and(Lovdetails.LOV_VALUE.equal(lovValue))).findFirst();

			if (lovDetails.isPresent()) {
				return Integer.parseInt(lovDetails.get().getLovValueId() + "");
			} else
				return 0;
		} else
			return 0;
	}

	public void linkOrUnlinkValues(PositionDetails positionDetails, boolean linkFlag) {

		try {
			String linkOrUnlinkResponse = "false";
			int fileId = positionDetails.getFileId();

			String linkOrUnlinkText = linkFlag ? TEXT_LINK_VALUE : TEXT_UN_LINK_VALUE;

			positionDetails.setMyhrPositionCodeValueId(getLovValueId(COLUMN_HEADER_MYHR_POSITION_CODE,
					positionDetails.getMyhrPositionCode(), positionDetails.getFileId()));

			positionDetails.setPositionNameValueId(getLovValueId(COLUMN_HEADER_POSITION_NAME,
					positionDetails.getPositionName(), positionDetails.getFileId()));

			positionDetails.setLegalEntityValueId(getLovValueId(COLUMN_HEADER_LEGAL_ENTITY,
					positionDetails.getLegalEntity(), positionDetails.getFileId()));

			positionDetails.setCountryValueId(
					getLovValueId(COLUMN_HEADER_COUNTRY, positionDetails.getCountry(), positionDetails.getFileId()));

			positionDetails.setDscGlobalJobCodeValueId(getLovValueId(COLUMN_HEADER_DSC_GLOBAL_JOB_CODE,
					positionDetails.getDscGlobalJobCode(), positionDetails.getFileId()));

			positionDetails.setDscglobaljobNameValueId(getLovValueId(COLUMN_HEADER_DSC_GLOBAL_JOB_NAME,
					positionDetails.getDscglobaljobName(), positionDetails.getFileId()));

			positionDetails.setPositionValueId(
					getLovValueId(COLUMN_HEADER_POSITION, positionDetails.getPosition(), positionDetails.getFileId()));

			// positionDetails.setJobTemplateTitleValueId(getLovValueId(COLUMN_HEADER_JOB_TEMPLATE_TITLE,
			// positionDetails.getJobTemplateTitle(), positionDetails.getFileId()));
			positionDetails.setDepartmentNameValueId(getLovValueId(COLUMN_HEADER_DEPARTMENT_NAME,
					positionDetails.getDepartmentName(), positionDetails.getFileId()));
			positionDetails.setWorkHoursValueId(getLovValueId(COLUMN_HEADER_WORK_HOURS, positionDetails.getWorkHours(),
					positionDetails.getFileId()));
			positionDetails.setWorkHoursFrequencyValueId(getLovValueId(COLUMN_HEADER_WORK_HOURS_FREQUENCY,
					positionDetails.getWorkHoursFrequency(), positionDetails.getFileId()));

			positionDetails.setRcsGradeValueId(
					getLovValueId(COLUMN_HEADER_RCS_GRADE, positionDetails.getRcsGrade(), positionDetails.getFileId()));

			positionDetails.setLocalGradeValueId(getLovValueId(COLUMN_HEADER_LOCAL_GRADE,
					positionDetails.getLocalGrade(), positionDetails.getFileId()));

			positionDetails.setFullVsPartTimeValueId(getLovValueId(COLUMN_HEADER_FULL_VS_PART_TIME,
					positionDetails.getFullVsPartTime(), positionDetails.getFileId()));

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_POSITION_NAME,
					positionDetails.getPositionNameValueId(), positionDetails.getMyhrPositionCodeValueId(), linkFlag);

			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_POSITION_NAME,
					positionDetails.getPositionName(), positionDetails.getPositionNameValueId(),
					COLUMN_HEADER_MYHR_POSITION_CODE, positionDetails.getMyhrPositionCode(),
					positionDetails.getMyhrPositionCodeValueId(), linkOrUnlinkResponse, linkFlag);

			// fix to avoid country and please select unlink issue
			if (!positionDetails.getMyhrPositionCode().contains(DEFAULT_PLEASE_SELECT_POSITION_CODE)) {

				linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_MYHR_POSITION_CODE,
						positionDetails.getMyhrPositionCodeValueId(), positionDetails.getCountryValueId(), linkFlag);

				displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_MYHR_POSITION_CODE,
						positionDetails.getMyhrPositionCode(), positionDetails.getMyhrPositionCodeValueId(),
						COLUMN_HEADER_COUNTRY, positionDetails.getCountry(), positionDetails.getCountryValueId(),
						linkOrUnlinkResponse, linkFlag);
			} else {
				if (linkFlag) {
					linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_MYHR_POSITION_CODE,
							positionDetails.getMyhrPositionCodeValueId(), positionDetails.getCountryValueId(),
							linkFlag);

					displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_MYHR_POSITION_CODE,
							positionDetails.getMyhrPositionCode(), positionDetails.getMyhrPositionCodeValueId(),
							COLUMN_HEADER_COUNTRY, positionDetails.getCountry(), positionDetails.getCountryValueId(),
							linkOrUnlinkResponse, linkFlag);

				}
			}
			/*
			 * linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_COUNTRY,
			 * positionDetails.getCountryValueId(),
			 * positionDetails.getMyhrPositionCodeValueId(), linkFlag);
			 * 
			 * displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_COUNTRY,
			 * positionDetails.getCountry(), positionDetails.getCountryValueId(),
			 * COLUMN_HEADER_MYHR_POSITION_CODE, positionDetails.getMyhrPositionCode(),
			 * positionDetails.getMyhrPositionCodeValueId(), linkOrUnlinkResponse,
			 * linkFlag);
			 */

			/*
			 * linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_DSC_GLOBAL_JOB_CODE,
			 * positionDetails.getDscGlobalJobCodeValueId(),
			 * positionDetails.getMyhrPositionCodeValueId(), linkFlag);
			 * displayAndAddLinkDetails(fileId, linkOrUnlinkText,
			 * COLUMN_HEADER_DSC_GLOBAL_JOB_CODE, positionDetails.getDscGlobalJobCode(),
			 * positionDetails.getDscGlobalJobCodeValueId(),
			 * COLUMN_HEADER_MYHR_POSITION_CODE, positionDetails.getMyhrPositionCode(),
			 * positionDetails.getMyhrPositionCodeValueId(), linkOrUnlinkResponse,
			 * linkFlag);
			 */

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_DSC_GLOBAL_JOB_NAME,
					positionDetails.getDscglobaljobNameValueId(), positionDetails.getMyhrPositionCodeValueId(),
					linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_DSC_GLOBAL_JOB_NAME,
					positionDetails.getDscglobaljobName(), positionDetails.getDscglobaljobNameValueId(),
					COLUMN_HEADER_MYHR_POSITION_CODE, positionDetails.getMyhrPositionCode(),
					positionDetails.getMyhrPositionCodeValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_POSITION, positionDetails.getPositionValueId(),
					positionDetails.getMyhrPositionCodeValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_POSITION, positionDetails.getPosition(),
					positionDetails.getPositionValueId(), COLUMN_HEADER_MYHR_POSITION_CODE,
					positionDetails.getMyhrPositionCode(), positionDetails.getMyhrPositionCodeValueId(),
					linkOrUnlinkResponse, linkFlag);

			if (positionDetails.getMyhrPositionCode().contains(DEFAULT_PLEASE_SELECT_POSITION_CODE)) {

				if (!StringUtils.isEmpty(positionDetails.getCountry())
						&& !StringUtils.isEmpty(positionDetails.getDepartmentName())) {

					positionDetails.setDepartmentFilterBy(DEPT_FILTER_BY_PREFIX_VALUE + positionDetails.getCountry());
					positionDetails.setDepartmentFilterByValueId(getLovValueId(COLUMN_HEADER_INTERNAL_DEPT_FILTER_BY,
							positionDetails.getDepartmentFilterBy(), positionDetails.getFileId()));

					linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_DEPARTMENT_NAME,
							positionDetails.getDepartmentNameValueId(), positionDetails.getDepartmentFilterByValueId(),
							linkFlag);
					displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_DEPARTMENT_NAME,
							positionDetails.getDepartmentName(), positionDetails.getDepartmentNameValueId(),
							COLUMN_HEADER_INTERNAL_DEPT_FILTER_BY, positionDetails.getDepartmentFilterBy(),
							positionDetails.getDepartmentFilterByValueId(), linkOrUnlinkResponse, linkFlag);

					if (linkFlag) {

						boolean isCountryAllowed = commonUtil.getAllowedCountries().stream()
								.anyMatch(country -> country.equalsIgnoreCase(positionDetails.getCountry()));

						if (isCountryAllowed) {

							linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_INTERNAL_DEPT_FILTER_BY,
									positionDetails.getDepartmentFilterByValueId(),
									positionDetails.getMyhrPositionCodeValueId(), linkFlag);
							displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_INTERNAL_DEPT_FILTER_BY,
									positionDetails.getDepartmentFilterBy(),
									positionDetails.getDepartmentFilterByValueId(), COLUMN_HEADER_MYHR_POSITION_CODE,
									positionDetails.getMyhrPositionCode(), positionDetails.getMyhrPositionCodeValueId(),
									linkOrUnlinkResponse, linkFlag);
						} else {
							LOGGER.info(
									"###################### Received a New Country Not in Allowed List, Country Name: "
											+ positionDetails.getCountry() + " #####################");
						}
					}

				}

			} else {

				positionDetails.setDepartmentFilterBy(positionDetails.getMyhrPositionCode());

				positionDetails.setDepartmentFilterByValueId(getLovValueId(COLUMN_HEADER_INTERNAL_DEPT_FILTER_BY,
						positionDetails.getDepartmentFilterBy(), positionDetails.getFileId()));

				linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_INTERNAL_DEPT_FILTER_BY,
						positionDetails.getDepartmentFilterByValueId(), positionDetails.getMyhrPositionCodeValueId(),
						linkFlag);
				displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_INTERNAL_DEPT_FILTER_BY,
						positionDetails.getDepartmentFilterBy(), positionDetails.getDepartmentFilterByValueId(),
						COLUMN_HEADER_MYHR_POSITION_CODE, positionDetails.getMyhrPositionCode(),
						positionDetails.getMyhrPositionCodeValueId(), linkOrUnlinkResponse, linkFlag);

				linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_DEPARTMENT_NAME,
						positionDetails.getDepartmentNameValueId(), positionDetails.getDepartmentFilterByValueId(),
						linkFlag);
				displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_DEPARTMENT_NAME,
						positionDetails.getDepartmentName(), positionDetails.getDepartmentNameValueId(),
						COLUMN_HEADER_INTERNAL_DEPT_FILTER_BY, positionDetails.getDepartmentFilterBy(),
						positionDetails.getDepartmentFilterByValueId(), linkOrUnlinkResponse, linkFlag);

			}

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_WORK_HOURS, positionDetails.getWorkHoursValueId(),
					positionDetails.getMyhrPositionCodeValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_WORK_HOURS, positionDetails.getWorkHours(),
					positionDetails.getWorkHoursValueId(), COLUMN_HEADER_MYHR_POSITION_CODE,
					positionDetails.getMyhrPositionCode(), positionDetails.getMyhrPositionCodeValueId(),
					linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_WORK_HOURS_FREQUENCY,
					positionDetails.getWorkHoursFrequencyValueId(), positionDetails.getMyhrPositionCodeValueId(),
					linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_WORK_HOURS_FREQUENCY,
					positionDetails.getWorkHoursFrequency(), positionDetails.getWorkHoursFrequencyValueId(),
					COLUMN_HEADER_MYHR_POSITION_CODE, positionDetails.getMyhrPositionCode(),
					positionDetails.getMyhrPositionCodeValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_FULL_VS_PART_TIME,
					positionDetails.getFullVsPartTimeValueId(), positionDetails.getMyhrPositionCodeValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_FULL_VS_PART_TIME,
					positionDetails.getFullVsPartTime(), positionDetails.getFullVsPartTimeValueId(),
					COLUMN_HEADER_MYHR_POSITION_CODE, positionDetails.getMyhrPositionCode(),
					positionDetails.getMyhrPositionCodeValueId(), linkOrUnlinkResponse, linkFlag);

			if (StringUtils.isEmpty(positionDetails.getRcsGrade())
					&& !positionDetails.getMyhrPositionCode().contains(DEFAULT_PLEASE_SELECT_POSITION_CODE)) {

				if (linkFlag)
					commonUtil.addPositionWithoutGradeDetails(positionDetails.getMyhrPositionCode(),
							CommonConstants.RCS_GRADE_TYPE);

				Set<String> rcsGradeList = commonUtil.getAllRCSGradeValues();

				rcsGradeList.forEach(rcsGrade -> {

					positionDetails.setRcsGradeValueId(
							getLovValueId(COLUMN_HEADER_RCS_GRADE, rcsGrade, positionDetails.getFileId()));

					String locallinkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_RCS_GRADE,
							positionDetails.getRcsGradeValueId(), positionDetails.getMyhrPositionCodeValueId(),
							linkFlag);

					displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_RCS_GRADE, rcsGrade,
							positionDetails.getRcsGradeValueId(), COLUMN_HEADER_MYHR_POSITION_CODE,
							positionDetails.getMyhrPositionCode(), positionDetails.getMyhrPositionCodeValueId(),
							locallinkOrUnlinkResponse, linkFlag);

				});

			} else {

				if (linkFlag)
					removePositionWithoutGradeDetails(positionDetails.getMyhrPositionCode(),
							CommonConstants.RCS_GRADE_TYPE, fileId);

				linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_RCS_GRADE, positionDetails.getRcsGradeValueId(),
						positionDetails.getMyhrPositionCodeValueId(), linkFlag);

				displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_RCS_GRADE,
						positionDetails.getRcsGrade(), positionDetails.getRcsGradeValueId(),
						COLUMN_HEADER_MYHR_POSITION_CODE, positionDetails.getMyhrPositionCode(),
						positionDetails.getMyhrPositionCodeValueId(), linkOrUnlinkResponse, linkFlag);

			}

			if (CommonConstants.COUNTRY_SINGAPORE.equalsIgnoreCase(positionDetails.getCountry())) {

				if (StringUtils.isEmpty(positionDetails.getLocalGrade())) {

					if (linkFlag)
						commonUtil.addPositionWithoutGradeDetails(positionDetails.getMyhrPositionCode(),
								CommonConstants.LOCAL_GRADE_TYPE);

					Set<String> localGradeList = commonUtil.getAllLocalGradeValues();

					localGradeList.forEach(localGrade -> {

						positionDetails.setLocalGradeValueId(
								getLovValueId(COLUMN_HEADER_LOCAL_GRADE, localGrade, positionDetails.getFileId()));

						String locallinkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LOCAL_GRADE,
								positionDetails.getLocalGradeValueId(), positionDetails.getMyhrPositionCodeValueId(),
								linkFlag);
						displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_LOCAL_GRADE, localGrade,
								positionDetails.getLocalGradeValueId(), COLUMN_HEADER_MYHR_POSITION_CODE,
								positionDetails.getMyhrPositionCode(), positionDetails.getMyhrPositionCodeValueId(),
								locallinkOrUnlinkResponse, linkFlag);

					});

				} else {

					if (linkFlag)
						commonUtil.removePositionWithoutGradeDetails(positionDetails.getMyhrPositionCode(),
								CommonConstants.LOCAL_GRADE_TYPE, fileId);

					linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LOCAL_GRADE,
							positionDetails.getLocalGradeValueId(), positionDetails.getMyhrPositionCodeValueId(),
							linkFlag);
					displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_LOCAL_GRADE,
							positionDetails.getLocalGrade(), positionDetails.getLocalGradeValueId(),
							COLUMN_HEADER_MYHR_POSITION_CODE, positionDetails.getMyhrPositionCode(),
							positionDetails.getMyhrPositionCodeValueId(), linkOrUnlinkResponse, linkFlag);

				}
			}

			if (!linkFlag) {
				commonUtil.removePositionWithoutGradeDetails(positionDetails.getMyhrPositionCode());
			}

		} catch (Exception e) {
			LOGGER.error("Exception occured in linkOrUnlinkValues " + e.getMessage());
			e.printStackTrace();

			/*
			 * retryCount++; if (retryCount <= 3) { try { Thread.sleep(300 * 1000); } catch
			 * (InterruptedException e1) { // TODO Auto-generated catch block
			 * e1.printStackTrace(); } linkOrUnlinkValues(positionDetails, linkFlag); }
			 */
			throw e;

		}

	}

	private void removePositionWithoutGradeDetails(String myhrPositionCode, String gradeType, int fileId) {

		commonUtil.removePositionWithoutGradeDetails(myhrPositionCode, gradeType, fileId);

		unlinkDefaultGrades(myhrPositionCode, gradeType, fileId);

	}

	public void linkOrUnlinkValues(LegalEntityDetails legalEntityDetails, boolean linkFlag) {

		try {
			String linkOrUnlinkResponse = "false";
			int fileId = legalEntityDetails.getFileId();

			String linkOrUnlinkText = linkFlag ? TEXT_LINK_VALUE : TEXT_UN_LINK_VALUE;

			legalEntityDetails.setCountryValueId(getLovValueId(COLUMN_HEADER_COUNTRY, legalEntityDetails.getCountry(),
					legalEntityDetails.getFileId()));
			legalEntityDetails.setLegalEntityValueId(getLovValueId(COLUMN_HEADER_LEGAL_ENTITY_OLD,
					legalEntityDetails.getLegalEntity(), legalEntityDetails.getFileId()));

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LEGAL_ENTITY_OLD,
					legalEntityDetails.getLegalEntityValueId(), legalEntityDetails.getCountryValueId(), linkFlag);

			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_LEGAL_ENTITY_OLD,
					legalEntityDetails.getLegalEntity(), legalEntityDetails.getLegalEntityValueId(),
					COLUMN_HEADER_COUNTRY, legalEntityDetails.getCountry(), legalEntityDetails.getCountryValueId(),
					linkOrUnlinkResponse, linkFlag);

		} catch (Exception e) {
			LOGGER.error("Exception occured in linkOrUnlinkValues " + e.getMessage());
			e.printStackTrace();

			/*
			 * retryCount++; if (retryCount <= 3) { try { Thread.sleep(300 * 1000); } catch
			 * (InterruptedException e1) { // TODO Auto-generated catch block
			 * e1.printStackTrace(); } linkOrUnlinkValues(legalEntityDetails, linkFlag); }
			 */
			throw e;

		}
	}

	public void linkOrUnlinkValues(ManagerDetails managerDetails, boolean linkFlag) {

		try {

			String linkOrUnlinkResponse = "false";
			int fileId = managerDetails.getFileId();

			String linkOrUnlinkText = linkFlag ? TEXT_LINK_VALUE : TEXT_UN_LINK_VALUE;

			managerDetails.setBusinessTitleValueId(getLovValueId(COLUMN_HEADER_BUSINESSTITLE,
					managerDetails.getBusinessTitle(), managerDetails.getFileId()));
			managerDetails.setCountryValueId(
					getLovValueId(COLUMN_HEADER_COUNTRY, managerDetails.getCountry(), managerDetails.getFileId()));
			managerDetails.setEmailValueId(
					getLovValueId(COLUMN_HEADER_EMAIL, managerDetails.getEmail(), managerDetails.getFileId()));
			managerDetails.setFirstNameValueId(
					getLovValueId(COLUMN_HEADER_FIRST_NAME, managerDetails.getFirstName(), managerDetails.getFileId()));
			managerDetails.setLastNameValueId(
					getLovValueId(COLUMN_HEADER_LAST_NAME, managerDetails.getLastName(), managerDetails.getFileId()));
			managerDetails.setGidValueId(
					getLovValueId(COLUMN_HEADER_GID, managerDetails.getGid(), managerDetails.getFileId()));
			managerDetails.setTimezoneValueId(
					getLovValueId(COLUMN_HEADER_TIMEZONE, managerDetails.getTimezone(), managerDetails.getFileId()));
			managerDetails.setActiveStatusValueId(getLovValueId(COLUMN_HEADER_ACTIVE_STATUS,
					managerDetails.getActiveStatus(), managerDetails.getFileId()));

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_GID, managerDetails.getGidValueId(),
					managerDetails.getCountryValueId(), linkFlag);

			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_GID, managerDetails.getGid(),
					managerDetails.getGidValueId(), COLUMN_HEADER_COUNTRY, managerDetails.getCountry(),
					managerDetails.getCountryValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_BUSINESSTITLE,
					managerDetails.getBusinessTitleValueId(), managerDetails.getGidValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_BUSINESSTITLE,
					managerDetails.getBusinessTitle(), managerDetails.getBusinessTitleValueId(), COLUMN_HEADER_GID,
					managerDetails.getGid(), managerDetails.getGidValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_EMAIL, managerDetails.getEmailValueId(),
					managerDetails.getGidValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_EMAIL, managerDetails.getEmail(),
					managerDetails.getEmailValueId(), COLUMN_HEADER_GID, managerDetails.getGid(),
					managerDetails.getGidValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_FIRST_NAME, managerDetails.getFirstNameValueId(),
					managerDetails.getGidValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_FIRST_NAME, managerDetails.getFirstName(),
					managerDetails.getFirstNameValueId(), COLUMN_HEADER_GID, managerDetails.getGid(),
					managerDetails.getGidValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LAST_NAME, managerDetails.getLastNameValueId(),
					managerDetails.getGidValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_LAST_NAME, managerDetails.getLastName(),
					managerDetails.getLastNameValueId(), COLUMN_HEADER_GID, managerDetails.getGid(),
					managerDetails.getGidValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_TIMEZONE, managerDetails.getTimezoneValueId(),
					managerDetails.getGidValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_TIMEZONE, managerDetails.getTimezone(),
					managerDetails.getTimezoneValueId(), COLUMN_HEADER_GID, managerDetails.getGid(),
					managerDetails.getGidValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_ACTIVE_STATUS,
					managerDetails.getActiveStatusValueId(), managerDetails.getGidValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_ACTIVE_STATUS,
					managerDetails.getActiveStatus(), managerDetails.getActiveStatusValueId(), COLUMN_HEADER_GID,
					managerDetails.getGid(), managerDetails.getGidValueId(), linkOrUnlinkResponse, linkFlag);

		} catch (Exception e) {
			LOGGER.error("Exception occured in linkOrUnlinkValues " + e.getMessage());
			e.printStackTrace();

			/*
			 * retryCount++; if (retryCount <= 3) { try { Thread.sleep(300 * 1000); } catch
			 * (InterruptedException e1) { // TODO Auto-generated catch block
			 * e1.printStackTrace(); } linkOrUnlinkValues(managerDetails, linkFlag); }
			 */
			throw e;

		}
	}

	public void linkOrUnlinkValues(DepartmentDetails departmentDetails, boolean linkFlag) {

		try {
			String linkOrUnlinkResponse = "false";
			int fileId = departmentDetails.getFileId();

			String linkOrUnlinkText = linkFlag ? TEXT_LINK_VALUE : TEXT_UN_LINK_VALUE;
			DeptUpdateResp deptUpdateResp = isDepartmentNameUpdated(departmentDetails.getDepartmentId(),
					departmentDetails.getDepartmentName());

			departmentDetails.setDepartmentIdValueId(getLovValueId(COLUMN_HEADER_DEPARTMENT_ID,
					departmentDetails.getDepartmentId(), departmentDetails.getFileId()));

			if (deptUpdateResp.isUpdated()) {

				departmentDetails.setDepartmentNameValueId(
						updateAndGetLovValueId(COLUMN_HEADER_DEPARTMENT_NAME, departmentDetails.getDepartmentName(),
								deptUpdateResp.getCurrentDeptNameValue(), departmentDetails.getFileId()));

			} else if (deptUpdateResp.isValuePresent()) {

				departmentDetails.setDepartmentNameValueId(deptUpdateResp.getDeptNameValueId());

			} else {
				departmentDetails.setDepartmentNameValueId(getLovValueId(COLUMN_HEADER_DEPARTMENT_NAME,
						departmentDetails.getDepartmentName(), departmentDetails.getFileId()));
			}

			departmentDetails.setOrgUnitValueId(getLovValueId(COLUMN_HEADER_ORG_UNIT, departmentDetails.getOrgUnit(),
					departmentDetails.getFileId()));
			departmentDetails.setLocationCodeValueId(getLovValueId(COLUMN_HEADER_LOCATION_CODE,
					departmentDetails.getLocationCode(), departmentDetails.getFileId()));
			departmentDetails.setLocationNameValueId(getLovValueId(COLUMN_HEADER_LOCATION_NAME,
					departmentDetails.getLocationName(), departmentDetails.getFileId()));
			departmentDetails.setFacilityIdValueId(getLovValueId(COLUMN_HEADER_FACILITY_ID,
					departmentDetails.getFacilityId(), departmentDetails.getFileId()));
			departmentDetails.setSectorValueId(
					getLovValueId(COLUMN_HEADER_SECTOR, departmentDetails.getSector(), departmentDetails.getFileId()));
			departmentDetails.setDeptCostStringValueId(getLovValueId(COLUMN_HEADER_DEPARTMENT_COST_STRING,
					departmentDetails.getDeptCostString(), departmentDetails.getFileId()));
			departmentDetails.setLegalEntityValueId(getLovValueId(COLUMN_HEADER_LEGAL_ENTITY,
					departmentDetails.getLegalEntity(), departmentDetails.getFileId()));

			departmentDetails.setCountryValueId(getLovValueId(COLUMN_HEADER_COUNTRY, departmentDetails.getCountry(),
					departmentDetails.getFileId()));

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_DEPARTMENT_ID,
					departmentDetails.getDepartmentIdValueId(), departmentDetails.getDepartmentNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_DEPARTMENT_ID,
					departmentDetails.getDepartmentId(), departmentDetails.getDepartmentIdValueId(),
					COLUMN_HEADER_DEPARTMENT_NAME, departmentDetails.getDepartmentName(),
					departmentDetails.getDepartmentNameValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_ORG_UNIT, departmentDetails.getOrgUnitValueId(),
					departmentDetails.getDepartmentNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_ORG_UNIT, departmentDetails.getOrgUnit(),
					departmentDetails.getOrgUnitValueId(), COLUMN_HEADER_DEPARTMENT_NAME,
					departmentDetails.getDepartmentName(), departmentDetails.getDepartmentNameValueId(),
					linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LOCATION_CODE,
					departmentDetails.getLocationCodeValueId(), departmentDetails.getDepartmentNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_LOCATION_CODE,
					departmentDetails.getLocationCode(), departmentDetails.getLocationCodeValueId(),
					COLUMN_HEADER_DEPARTMENT_NAME, departmentDetails.getDepartmentName(),
					departmentDetails.getDepartmentNameValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LOCATION_NAME,
					departmentDetails.getLocationNameValueId(), departmentDetails.getDepartmentNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_LOCATION_NAME,
					departmentDetails.getLocationName(), departmentDetails.getLocationNameValueId(),
					COLUMN_HEADER_DEPARTMENT_NAME, departmentDetails.getDepartmentName(),
					departmentDetails.getDepartmentNameValueId(), linkOrUnlinkResponse, linkFlag);

			if (linkFlag) {

				departmentDetails.setGlobalLocationName(departmentDetails.getLocationName());

				departmentDetails.setGlobalLocationNameValueId(getLovValueId(COLUMN_HEADER_GLOBAL_LOCATION_NAME,
						departmentDetails.getGlobalLocationName(), departmentDetails.getFileId()));

				linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_GLOBAL_LOCATION_NAME,
						departmentDetails.getGlobalLocationNameValueId(), departmentDetails.getCountryValueId(),
						linkFlag);
				displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_GLOBAL_LOCATION_NAME,
						departmentDetails.getGlobalLocationName(), departmentDetails.getGlobalLocationNameValueId(),
						COLUMN_HEADER_COUNTRY, departmentDetails.getCountry(), departmentDetails.getCountryValueId(),
						linkOrUnlinkResponse, linkFlag);

				// LOGGER.info("condition:
				// "+(departmentDetails.getDepartmentName().contains(GLOBAL_BUSINESS_DEPT_NAME)
				// ||
				// departmentDetails.getDepartmentName().contains(CommonConstants.NEW_BUSINESS_DEPT_NAME)));

				if (departmentDetails.getDepartmentName().contains(GLOBAL_BUSINESS_DEPT_NAME)
						|| departmentDetails.getDepartmentName().contains(CommonConstants.NEW_BUSINESS_DEPT_NAME)) {

					LOGGER.info("Adding values for Global and New Business Department Names");
					// adding TBC to the Global Location List

					departmentDetails.setGlobalLocationName(CommonConstants.LOCATION_TBC);
					departmentDetails.setGlobalLocationNameValueId(getLovValueId(COLUMN_HEADER_GLOBAL_LOCATION_NAME,
							departmentDetails.getGlobalLocationName(), departmentDetails.getFileId()));

					linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_GLOBAL_LOCATION_NAME,
							departmentDetails.getGlobalLocationNameValueId(), departmentDetails.getCountryValueId(),
							linkFlag);
					displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_GLOBAL_LOCATION_NAME,
							departmentDetails.getGlobalLocationName(), departmentDetails.getGlobalLocationNameValueId(),
							COLUMN_HEADER_COUNTRY, departmentDetails.getCountry(),
							departmentDetails.getCountryValueId(), linkOrUnlinkResponse, linkFlag);

					// adding GLOBAL to the Global Location List

					departmentDetails.setGlobalLocationName(CommonConstants.LOCATION_GLOBAL);
					departmentDetails.setGlobalLocationNameValueId(getLovValueId(COLUMN_HEADER_GLOBAL_LOCATION_NAME,
							departmentDetails.getGlobalLocationName(), departmentDetails.getFileId()));

					linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_GLOBAL_LOCATION_NAME,
							departmentDetails.getGlobalLocationNameValueId(), departmentDetails.getCountryValueId(),
							linkFlag);
					displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_GLOBAL_LOCATION_NAME,
							departmentDetails.getGlobalLocationName(), departmentDetails.getGlobalLocationNameValueId(),
							COLUMN_HEADER_COUNTRY, departmentDetails.getCountry(),
							departmentDetails.getCountryValueId(), linkOrUnlinkResponse, linkFlag);

					// adding TBC to the Location List

					departmentDetails.setLocationNameValueId(getLovValueId(COLUMN_HEADER_LOCATION_NAME,
							CommonConstants.LOCATION_TBC, departmentDetails.getFileId()));

					linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LOCATION_NAME,
							departmentDetails.getLocationNameValueId(), departmentDetails.getDepartmentNameValueId(),
							linkFlag);
					displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_LOCATION_NAME,
							CommonConstants.LOCATION_TBC, departmentDetails.getLocationNameValueId(),
							COLUMN_HEADER_DEPARTMENT_NAME, departmentDetails.getDepartmentName(),
							departmentDetails.getDepartmentNameValueId(), linkOrUnlinkResponse, linkFlag);

					// adding GLOBAL to the Location List
					departmentDetails.setLocationNameValueId(getLovValueId(COLUMN_HEADER_LOCATION_NAME,
							CommonConstants.LOCATION_GLOBAL, departmentDetails.getFileId()));

					linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LOCATION_NAME,
							departmentDetails.getLocationNameValueId(), departmentDetails.getDepartmentNameValueId(),
							linkFlag);
					displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_LOCATION_NAME,
							CommonConstants.LOCATION_GLOBAL, departmentDetails.getLocationNameValueId(),
							COLUMN_HEADER_DEPARTMENT_NAME, departmentDetails.getDepartmentName(),
							departmentDetails.getDepartmentNameValueId(), linkOrUnlinkResponse, linkFlag);
				}

			}

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_FACILITY_ID,
					departmentDetails.getFacilityIdValueId(), departmentDetails.getDepartmentNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_FACILITY_ID,
					departmentDetails.getFacilityId(), departmentDetails.getFacilityIdValueId(),
					COLUMN_HEADER_DEPARTMENT_NAME, departmentDetails.getDepartmentName(),
					departmentDetails.getDepartmentNameValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_SECTOR, departmentDetails.getSectorValueId(),
					departmentDetails.getDepartmentNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_SECTOR, departmentDetails.getSector(),
					departmentDetails.getSectorValueId(), COLUMN_HEADER_DEPARTMENT_NAME,
					departmentDetails.getDepartmentName(), departmentDetails.getDepartmentNameValueId(),
					linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_DEPARTMENT_COST_STRING,
					departmentDetails.getDeptCostStringValueId(), departmentDetails.getDepartmentNameValueId(),
					linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_DEPARTMENT_COST_STRING,
					departmentDetails.getDeptCostString(), departmentDetails.getDeptCostStringValueId(),
					COLUMN_HEADER_DEPARTMENT_NAME, departmentDetails.getDepartmentName(),
					departmentDetails.getDepartmentNameValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LEGAL_ENTITY,
					departmentDetails.getLegalEntityValueId(), departmentDetails.getDepartmentNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_LEGAL_ENTITY,
					departmentDetails.getLegalEntity(), departmentDetails.getLegalEntityValueId(),
					COLUMN_HEADER_DEPARTMENT_NAME, departmentDetails.getDepartmentName(),
					departmentDetails.getDepartmentNameValueId(), linkOrUnlinkResponse, linkFlag);

		} catch (Exception e) {
			LOGGER.error("Exception occured in linkOrUnlinkValues " + e.getMessage());
			e.printStackTrace();

			/*
			 * retryCount++; if (retryCount <= 3) { try { Thread.sleep(300 * 1000); } catch
			 * (InterruptedException e1) { // TODO Auto-generated catch block
			 * e1.printStackTrace(); } linkOrUnlinkValues(departmentDetails, linkFlag); }
			 */
			throw e;

		}
	}

	private DeptUpdateResp isDepartmentNameUpdated(String deptId, String deptName) {

		DeptUpdateResp resp = new DeptUpdateResp();

		Comparator<Linkvaluedetails> idComparator = Comparator.comparing(Linkvaluedetails::getLinkValueId).reversed();

		Optional<Linkvaluedetails> linkValueDetails = linkValueDetailsManager
				.stream().filter(
						Linkvaluedetails.FROM_FIELD_NAME.equal(COLUMN_HEADER_DEPARTMENT_NAME)
								.and(Linkvaluedetails.TO_FIELD_NAME.equal(COLUMN_HEADER_DEPARTMENT_ID)
										.and(Linkvaluedetails.TO_FIELD_VALUE.equal(deptId))))
				.sorted(idComparator).findFirst();

		if (linkValueDetails.isPresent()) {
			LOGGER.info("DEPARTMENT NAME FROM DB: " + linkValueDetails.get().getFromFieldValue().get());
			LOGGER.info("DEPARTMENT NAME FROM FILE " + deptName);
			if (linkValueDetails.get().getFromFieldValue().get().equals(deptName)) {
				resp.setUpdated(false);
				resp.setValuePresent(true);
				resp.setDeptIdValueid(linkValueDetails.get().getToFieldValueId().getAsLong());
				resp.setDeptNameValueId(linkValueDetails.get().getFromFieldValueId().getAsLong());
				LOGGER.info(resp.toString());
				return resp;
			} else {
				resp.setUpdated(true);
				resp.setDeptIdValueid(linkValueDetails.get().getToFieldValueId().getAsLong());
				resp.setDeptNameValueId(linkValueDetails.get().getFromFieldValueId().getAsLong());
				resp.setCurrentDeptNameValue(linkValueDetails.get().getFromFieldValue().get());
				resp.setValuePresent(true);
				LOGGER.info(resp.toString());
				return resp;
			}

		} else {
			resp.setUpdated(false);
			resp.setValuePresent(false);
			LOGGER.info(resp.toString());
			return resp;
		}

	}

	public void linkOrUnlinkValues(JobDetails jobDetails, boolean linkFlag) {

		try {
			String linkOrUnlinkResponse = "false";
			int fileId = jobDetails.getFileId();

			String linkOrUnlinkText = linkFlag ? TEXT_LINK_VALUE : TEXT_UN_LINK_VALUE;

			jobDetails.setCareerLevelValueId(
					getLovValueId(COLUMN_HEADER_CAREER_LEVEL, jobDetails.getCareerLevel(), jobDetails.getFileId()));
			jobDetails.setCareerStreamValueId(
					getLovValueId(COLUMN_HEADER_CAREER_STREAM, jobDetails.getCareerStream(), jobDetails.getFileId()));
			jobDetails.setDpdhlJobCodeValueId(
					getLovValueId(COLUMN_HEADER_DPDHL_JOB_CODE, jobDetails.getDpdhlJobCode(), jobDetails.getFileId()));
			jobDetails.setDpdhlJobFamilyValueId(getLovValueId(COLUMN_HEADER_DPDHL_JOB_FAMILY,
					jobDetails.getDpdhlJobFamily(), jobDetails.getFileId()));
			jobDetails.setDpdhlJobFunctionValueId(getLovValueId(COLUMN_HEADER_DPDHL_JOB_FUNCTION,
					jobDetails.getDpdhlJobFunction(), jobDetails.getFileId()));
			jobDetails.setDscGlobalJobCodeValueId(getLovValueId(COLUMN_HEADER_DSC_GLOBAL_JOB_CODE,
					jobDetails.getDscGlobalJobCode(), jobDetails.getFileId()));
			jobDetails.setDscGlobalJobNameValueId(getLovValueId(COLUMN_HEADER_DSC_GLOBAL_JOB_NAME,
					jobDetails.getDscGlobalJobName(), jobDetails.getFileId()));

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_CAREER_LEVEL, jobDetails.getCareerLevelValueId(),
					jobDetails.getDscGlobalJobNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_CAREER_LEVEL, jobDetails.getCareerLevel(),
					jobDetails.getCareerLevelValueId(), COLUMN_HEADER_DSC_GLOBAL_JOB_NAME,
					jobDetails.getDscGlobalJobName(), jobDetails.getDscGlobalJobNameValueId(), linkOrUnlinkResponse,
					linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_CAREER_STREAM, jobDetails.getCareerStreamValueId(),
					jobDetails.getDscGlobalJobNameValueId(), linkFlag);

			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_CAREER_STREAM,
					jobDetails.getCareerStream(), jobDetails.getCareerStreamValueId(),
					COLUMN_HEADER_DSC_GLOBAL_JOB_NAME, jobDetails.getDscGlobalJobName(),
					jobDetails.getDscGlobalJobNameValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_DPDHL_JOB_CODE, jobDetails.getDpdhlJobCodeValueId(),
					jobDetails.getDscGlobalJobNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_DPDHL_JOB_CODE,
					jobDetails.getDpdhlJobCode(), jobDetails.getDpdhlJobCodeValueId(),
					COLUMN_HEADER_DSC_GLOBAL_JOB_NAME, jobDetails.getDscGlobalJobName(),
					jobDetails.getDscGlobalJobNameValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_DPDHL_JOB_FAMILY,
					jobDetails.getDpdhlJobFamilyValueId(), jobDetails.getDscGlobalJobNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_DPDHL_JOB_FAMILY,
					jobDetails.getDpdhlJobFamily(), jobDetails.getDpdhlJobFamilyValueId(),
					COLUMN_HEADER_DSC_GLOBAL_JOB_NAME, jobDetails.getDscGlobalJobName(),
					jobDetails.getDscGlobalJobNameValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_DPDHL_JOB_FUNCTION,
					jobDetails.getDpdhlJobFunctionValueId(), jobDetails.getDscGlobalJobNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_DPDHL_JOB_FUNCTION,
					jobDetails.getDpdhlJobFunction(), jobDetails.getDpdhlJobFunctionValueId(),
					COLUMN_HEADER_DSC_GLOBAL_JOB_NAME, jobDetails.getDscGlobalJobName(),
					jobDetails.getDscGlobalJobNameValueId(), linkOrUnlinkResponse, linkFlag);

			linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_DSC_GLOBAL_JOB_CODE,
					jobDetails.getDscGlobalJobCodeValueId(), jobDetails.getDscGlobalJobNameValueId(), linkFlag);
			displayAndAddLinkDetails(fileId, linkOrUnlinkText, COLUMN_HEADER_DSC_GLOBAL_JOB_CODE,
					jobDetails.getDscGlobalJobCode(), jobDetails.getDscGlobalJobCodeValueId(),
					COLUMN_HEADER_DSC_GLOBAL_JOB_NAME, jobDetails.getDscGlobalJobName(),
					jobDetails.getDscGlobalJobNameValueId(), linkOrUnlinkResponse, linkFlag);

		} catch (Exception e) {
			LOGGER.error("Exception occured in linkOrUnlinkValues " + e.getMessage());
			e.printStackTrace();

			/*
			 * retryCount++; if (retryCount <= 3) { try { Thread.sleep(300 * 1000); } catch
			 * (InterruptedException e1) { // TODO Auto-generated catch block
			 * e1.printStackTrace(); } linkOrUnlinkValues(jobDetails, linkFlag); }
			 */

		}

	}

	public void processNewOrChangedRecords() {

		LOGGER.info("######## Entering processNewOrChangedRecords method ########");
		resetStatsCountValues();
		CompletionService<String> compService = new ExecutorCompletionService<>(executor);
		LOGGER.info("Process Manager Details");
		LOGGER.info("___________________________________________________________________________");
		List<ManagerDetails> managerDetailsList = readerUtil.getManagerDetailsList(RecordStatus.NEW_OR_CHANGE);
		LOGGER.info("Manager Details With Active Status Yes: " + managerDetailsList.size());

		for (ManagerDetails managerDetails : managerDetailsList) {
			try {
				TlkApiProcessor taskProcessor = new TlkApiProcessor(this, managerDetails,
						CommonConstants.ADD_UPDATE_MANAGER_DETAILS);
				compService.submit(taskProcessor);
			} catch (Exception e) {
				LOGGER.error("Exception occured while submitting task to thread " + e.getMessage());
				e.printStackTrace();
			}
			// LOGGER.debug(managerDetails.toString());
		}

		showProgressDetails(compService, managerDetailsList.size());

		LOGGER.info("___________________________________________________________________________");

		LOGGER.info("Process LegalEntity Details");
		LOGGER.info("___________________________________________________________________________");
		List<LegalEntityDetails> legalDetailsList = readerUtil.getLegalEntityDetailsList(RecordStatus.NEW_OR_CHANGE);
		LOGGER.info("Legal Details Count With Active Status Yes: " + legalDetailsList.size());

		for (LegalEntityDetails legalEntityDetails : legalDetailsList) {
			// retryCount = 1;
			try {
				TlkApiProcessor taskProcessor = new TlkApiProcessor(this, legalEntityDetails,
						CommonConstants.ADD_UPDATE_LEGAL_DETAILS);
				compService.submit(taskProcessor);
			} catch (Exception e) {
				LOGGER.error("Exception occured while submitting task to thread " + e.getMessage());
				e.printStackTrace();
			}

			// LOGGER.debug(legalEntityDetails.toString());
		}

		showProgressDetails(compService, legalDetailsList.size());

		LOGGER.info("___________________________________________________________________________");

		LOGGER.info("Process Department Details");
		LOGGER.info("___________________________________________________________________________");
		List<DepartmentDetails> deptDetailsList = readerUtil.getDepartmentDetailsList(RecordStatus.NEW_OR_CHANGE);
		LOGGER.info("Department Details Count With Active Status Yes: " + deptDetailsList.size());

		for (DepartmentDetails departmentDetails : deptDetailsList) {
			// retryCount = 1;
			try {
				TlkApiProcessor taskProcessor = new TlkApiProcessor(this, departmentDetails,
						CommonConstants.ADD_UPDATE_DEPT_DETAILS);
				compService.submit(taskProcessor);
			} catch (Exception e) {
				LOGGER.error("Exception occured while submitting task to thread " + e.getMessage());
				e.printStackTrace();
			}

			// linkOrUnlinkValues(departmentDetails, true);
			// LOGGER.debug(departmentDetails.toString());
		}

		showProgressDetails(compService, deptDetailsList.size());

		LOGGER.info("___________________________________________________________________________");

		LOGGER.info("Process Job Details");
		LOGGER.info("___________________________________________________________________________");
		List<JobDetails> jobDetailsList = readerUtil.getJobDetailsList(RecordStatus.NEW_OR_CHANGE);
		LOGGER.info("Job Details Count With Active Status Yes: " + jobDetailsList.size());

		for (JobDetails jobDetails : jobDetailsList) {
			// retryCount = 1;
			try {
				TlkApiProcessor taskProcessor = new TlkApiProcessor(this, jobDetails,
						CommonConstants.ADD_UPDATE_JOB_DETAILS);
				compService.submit(taskProcessor);
			} catch (Exception e) {
				LOGGER.error("Exception occured while submitting task to thread " + e.getMessage());
				e.printStackTrace();
			}

			// linkOrUnlinkValues(jobDetails, true);
			// LOGGER.debug(jobDetails.toString());
		}

		showProgressDetails(compService, jobDetailsList.size());

		LOGGER.info("___________________________________________________________________________");

		LOGGER.info("Process Position Details");
		commonUtil.resetGradeCacheValues();
		LOGGER.info("___________________________________________________________________________");
		List<PositionDetails> positionDetailsList = readerUtil.getPositionDetailsList(RecordStatus.NEW_OR_CHANGE);
		LOGGER.info("Position Details Count With Active Status Yes: " + positionDetailsList.size());

		for (PositionDetails positionDetails : positionDetailsList) {
			// retryCount = 1;
			try {
				TlkApiProcessor taskProcessor = new TlkApiProcessor(this, positionDetails,
						CommonConstants.ADD_UPDATE_POS_DETAILS);
				compService.submit(taskProcessor);
			} catch (Exception e) {
				LOGGER.error("Exception occured while submitting task to thread " + e.getMessage());
				e.printStackTrace();
			}

			// linkOrUnlinkValues(positionDetails, true);
			// LOGGER.debug(positionDetails.toString());
		}

		showProgressDetails(compService, positionDetailsList.size());

		LOGGER.info("___________________________________________________________________________");

		LOGGER.info("######## Exiting processNewOrChangedRecords method ########");
	}

	private void showProgressDetails(CompletionService<String> compService, int totalCount) {

		Future<String> future;
		String result;
		int count = 0;
		LOGGER.info("Successfully submitted all requests ");
		for (int i = 0; i < totalCount; i++) {

			try {
				future = compService.take();
				result = future.get();
				if ("SUCCESS".equals(result))
					count++;
				if (count % 50 == 0)
					LOGGER.info("Progress Details: " + count + "/" + totalCount + " Completed");
			} catch (Exception e) {
				LOGGER.error("Exception occured while getting task response " + e.getMessage());
				e.printStackTrace();
			}
		}
		LOGGER.info("Final Progress Details: " + count + "/" + totalCount + " Completed");

	}

	public void processEndDatedRecords() {

		LOGGER.info("######## Entering processEndDatedRecords method ########");
		CompletionService<String> compService = new ExecutorCompletionService<>(executor);
		LOGGER.info("Process Manager Details");
		LOGGER.info("___________________________________________________________________________");
		List<ManagerDetails> managerDetailsList = readerUtil.getManagerDetailsList(RecordStatus.ENDED);
		LOGGER.info("Manager Details Count With Active Status No: " + managerDetailsList.size());

		for (ManagerDetails managerDetails : managerDetailsList) {
			try {
				TlkApiProcessor taskProcessor = new TlkApiProcessor(this, managerDetails,
						CommonConstants.REMOVE_MANAGER_DETAILS);
				compService.submit(taskProcessor);
			} catch (Exception e) {
				LOGGER.error("Exception occured while submitting task to thread " + e.getMessage());
				e.printStackTrace();
			}
			// LOGGER.debug(managerDetails.toString());
		}

		showProgressDetails(compService, managerDetailsList.size());

		LOGGER.info("___________________________________________________________________________");

		LOGGER.info("Process Position Details");
		commonUtil.resetGradeCacheValues();
		LOGGER.info("___________________________________________________________________________");
		List<PositionDetails> positionDetailsList = readerUtil.getPositionDetailsList(RecordStatus.ENDED);
		LOGGER.info("Position Details Count With Active Status No: " + positionDetailsList.size());

		for (PositionDetails positionDetails : positionDetailsList) {
			// retryCount = 1;
			try {
				TlkApiProcessor taskProcessor = new TlkApiProcessor(this, positionDetails,
						CommonConstants.REMOVE_POS_DETAILS);
				compService.submit(taskProcessor);
			} catch (Exception e) {
				LOGGER.error("Exception occured while submitting task to thread " + e.getMessage());
				e.printStackTrace();
			}

			// linkOrUnlinkValues(positionDetails, true);
			// LOGGER.debug(positionDetails.toString());
		}

		showProgressDetails(compService, positionDetailsList.size());

		LOGGER.info("___________________________________________________________________________");

		LOGGER.info("Process Department Details");
		LOGGER.info("___________________________________________________________________________");
		List<DepartmentDetails> deptDetailsList = readerUtil.getDepartmentDetailsList(RecordStatus.ENDED);
		LOGGER.info("Department Details Count With Active Status No: " + deptDetailsList.size());

		for (DepartmentDetails departmentDetails : deptDetailsList) {
			// retryCount = 1;
			try {
				TlkApiProcessor taskProcessor = new TlkApiProcessor(this, departmentDetails,
						CommonConstants.REMOVE_DEPT_DETAILS);
				compService.submit(taskProcessor);
			} catch (Exception e) {
				LOGGER.error("Exception occured while submitting task to thread " + e.getMessage());
				e.printStackTrace();
			}

			// linkOrUnlinkValues(departmentDetails, true);
			// LOGGER.debug(departmentDetails.toString());
		}

		showProgressDetails(compService, deptDetailsList.size());

		LOGGER.info("___________________________________________________________________________");

		LOGGER.info("Process Job Details");
		LOGGER.info("___________________________________________________________________________");
		List<JobDetails> jobDetailsList = readerUtil.getJobDetailsList(RecordStatus.ENDED);
		LOGGER.info("Job Details Count With Active Status No: " + jobDetailsList.size());

		for (JobDetails jobDetails : jobDetailsList) {
			// retryCount = 1;
			try {
				TlkApiProcessor taskProcessor = new TlkApiProcessor(this, jobDetails,
						CommonConstants.REMOVE_JOB_DETAILS);
				compService.submit(taskProcessor);
			} catch (Exception e) {
				LOGGER.error("Exception occured while submitting task to thread " + e.getMessage());
				e.printStackTrace();
			}

			// linkOrUnlinkValues(jobDetails, true);
			// LOGGER.debug(jobDetails.toString());
		}

		showProgressDetails(compService, jobDetailsList.size());

		LOGGER.info("___________________________________________________________________________");

		LOGGER.info("Process LegalEntity Details");
		LOGGER.info("___________________________________________________________________________");
		List<LegalEntityDetails> legalDetailsList = readerUtil.getLegalEntityDetailsList(RecordStatus.ENDED);
		LOGGER.info("Legal Details Count With Active Status No: " + legalDetailsList.size());

		for (LegalEntityDetails legalEntityDetails : legalDetailsList) {
			// retryCount = 1;
			try {
				TlkApiProcessor taskProcessor = new TlkApiProcessor(this, legalEntityDetails,
						CommonConstants.REMOVE_LEGAL_DETAILS);
				compService.submit(taskProcessor);
			} catch (Exception e) {
				LOGGER.error("Exception occured while submitting task to thread " + e.getMessage());
				e.printStackTrace();
			}

			// LOGGER.debug(legalEntityDetails.toString());
		}

		showProgressDetails(compService, legalDetailsList.size());

		LOGGER.info("___________________________________________________________________________");

		LOGGER.info("######## Exiting processEndDatedRecords method ########");

	}

	public void addNewUserDetails(ManagerDetails managerDetails) {

		LOGGER.info("######## Entering addNewUserDetails method ########");

		Optional<Tlkuserdetails> user = null;
		boolean gidFlag = false;

		if (!StringUtils.isEmpty(managerDetails.getGid())) {
			LOGGER.info("managerDetails.getGid() " + managerDetails.getGid());
			user = userManager.stream().filter(Tlkuserdetails.GID.equal(managerDetails.getGid())).findAny();
		}
		if (user == null || !user.isPresent()) {
			user = userManager.stream().filter(Tlkuserdetails.EMAIL.equal(managerDetails.getEmail())).findAny();
		} else
			gidFlag = true;

		if (user == null || !user.isPresent()) {
			try {
				String response = addNewUser(managerDetails);
				LOGGER.info("response: " + response);
				if (!response.contains("Success")) {
					if (!readerUtil.getManagerDetailsErrorMap().containsKey(managerDetails.getFileName())) {
						errorList = new ArrayList<ErrorDetail>();
						readerUtil.getManagerDetailsErrorMap().put(managerDetails.getFileName(), errorList);
					}
					ErrorDetail errorDetail = new ErrorDetail();
					errorDetail.setError_Message(response);
					errorDetail.setRow_Number(managerDetails.getRowNumber());
					readerUtil.getManagerDetailsErrorMap().get(managerDetails.getFileName()).add(errorDetail);
				} else {

					if (!StringUtils.isEmpty(managerDetails.getGid()) && gidFlag == false) {
						userService.updateGid(response.replace("Success,", ""), managerDetails.getGid());
					}

					if (!StringUtils.isEmpty(managerDetails.getBusinessTitle())) {
						userService.updateBusinessTitle(response.replace("Success,", ""),
								managerDetails.getBusinessTitle());
					}

					if (!StringUtils.isEmpty(managerDetails.getCountry())) {
						userService.updateUserCountry(response.replace("Success,", ""), managerDetails.getCountry());
					}

					Tlkuserdetails userDetails = getTlkUserDetails(managerDetails);

					userManager.persist(userDetails);

					if (!StringUtils.isEmpty(managerDetails.getGid())) {

						managerDetails.setGidValueId(addManagerDetailsInLov(managerDetails));
						managerDetails.setBusinessTitleValueId(getLovValueId(COLUMN_HEADER_LINE_MANAGER_POSITION,
								managerDetails.getBusinessTitle(), managerDetails.getFileId()));

						getOldBusinessValueIdAndUnlink(managerDetails.getGidValueId(),
								managerDetails.getBusinessTitle(), managerDetails.getFileId());

						String linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LINE_MANAGER_POSITION,
								managerDetails.getBusinessTitleValueId(), managerDetails.getGidValueId(), true);

						displayAndAddLinkDetails(managerDetails.getFileId(), TEXT_LINK_VALUE,
								COLUMN_HEADER_LINE_MANAGER_POSITION, managerDetails.getBusinessTitle(),
								managerDetails.getBusinessTitleValueId(), COLUMN_HEADER_LINE_MANAGER,
								managerDetails.getGid(), managerDetails.getGidValueId(), linkOrUnlinkResponse, true);
					}

				}
			} catch (Exception e) {
				LOGGER.info("Exception occured in adding new user " + e.getMessage());
				e.printStackTrace();
			}

		} else {
			LOGGER.info("User already added, userId: " + user.get().getUserId() + ", Updating values ");
			try {

				UserDto userDto = userService.getUserDetailsById(Long.parseLong(user.get().getUserId() + ""));

				if (!user.get().getLogin().get().equalsIgnoreCase(user.get().getEmail().get())) {
					managerDetails.setEmailAsLoginFlag(false);
					managerDetails.setLoginValue(user.get().getLogin().get());
				} else
					managerDetails.setEmailAsLoginFlag(true);

				userService.updateUser(Long.parseLong(user.get().getUserId() + ""), managerDetails.getEmail(),
						managerDetails.getFirstName(), managerDetails.getLastName(), managerDetails.getTimezone(),
						managerDetails.getEmailAsLoginFlag(), managerDetails.getLoginValue(), userDto.getType());

				if (!StringUtils.isEmpty(managerDetails.getGid()) && gidFlag == false) {
					userService.updateGid(user.get().getUserId() + "", managerDetails.getGid());
				}

				if (!StringUtils.isEmpty(managerDetails.getBusinessTitle())) {
					userService.updateBusinessTitle(user.get().getUserId() + "", managerDetails.getBusinessTitle());
				}

				if (!StringUtils.isEmpty(managerDetails.getCountry())) {
					userService.updateUserCountry(user.get().getUserId() + "", managerDetails.getCountry());
				}

				Tlkuserdetails userDetails = getTlkUserDetails(managerDetails);// Source alone need to be handled..
				userDetails.setUserId(user.get().getUserId());
				userDetails.setSource(user.get().getSource().get());
				userDetails.setUsertype(userDto.getType());
				userManager.update(userDetails);

				// userService.deleteRoles(Long.parseLong(userDetails.getUserId() + ""),
				// CommonConstants.STANDARD_RECRUITER,
				// CommonConstants.ORGANIZATION_DEPARTMENT_IDS);
				// userService.assignRoles(Long.parseLong(userDetails.getUserId() + ""),
				// CommonConstants.STANDARD_RECRUITER,
				// CommonConstants.ORGANIZATION_DEPARTMENT_IDS);

				if (!StringUtils.isEmpty(managerDetails.getGid())) {
					managerDetails.setGidValueId(addManagerDetailsInLov(managerDetails));
					managerDetails.setBusinessTitleValueId(getLovValueId(COLUMN_HEADER_LINE_MANAGER_POSITION,
							managerDetails.getBusinessTitle(), managerDetails.getFileId()));

					getOldBusinessValueIdAndUnlink(managerDetails.getGidValueId(),
							managerDetails.getBusinessTitle(), managerDetails.getFileId());
					
					String linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LINE_MANAGER_POSITION,
							managerDetails.getBusinessTitleValueId(), managerDetails.getGidValueId(), true);

					displayAndAddLinkDetails(managerDetails.getFileId(), TEXT_LINK_VALUE,
							COLUMN_HEADER_LINE_MANAGER_POSITION, managerDetails.getBusinessTitle(),
							managerDetails.getBusinessTitleValueId(), COLUMN_HEADER_LINE_MANAGER,
							managerDetails.getGid(), managerDetails.getGidValueId(), linkOrUnlinkResponse, true);
				}

			} catch (Exception e) {

				LOGGER.error("Exception occurred while updating user " + user.get().getUserId());
				e.printStackTrace();
				if (!readerUtil.getManagerDetailsErrorMap().containsKey(managerDetails.getFileName())) {
					errorList = new ArrayList<ErrorDetail>();
					readerUtil.getManagerDetailsErrorMap().put(managerDetails.getFileName(), errorList);
				}
				ErrorDetail errorDetail = new ErrorDetail();
				errorDetail.setError_Message(e.getMessage());
				errorDetail.setRow_Number(managerDetails.getRowNumber());
				readerUtil.getManagerDetailsErrorMap().get(managerDetails.getFileName()).add(errorDetail);
			}

		}
		LOGGER.info("######## Exiting addNewUserDetails method ########");
	}

	private void getOldBusinessValueIdAndUnlink(long gidValueId, String newPositionName, int fileId) {

		LOGGER.info("######## Entering getOldBusinessValueIdAndUnlink method ########");

		Comparator<Linkvaluedetails> idComparator = Comparator.comparing(Linkvaluedetails::getLinkValueId).reversed();

		Optional<Linkvaluedetails> linkValueDetails = linkValueDetailsManager.stream()
				.filter(Linkvaluedetails.FROM_FIELD_NAME.equal(COLUMN_HEADER_LINE_MANAGER)
						.and(Linkvaluedetails.TO_FIELD_NAME.equal(COLUMN_HEADER_LINE_MANAGER_POSITION)
								.and(Linkvaluedetails.FROM_FIELD_VALUE_ID.equal(gidValueId)).and(Linkvaluedetails.STATUS.equal(ACTIVE))))
				.sorted(idComparator).findFirst();

		if (linkValueDetails.isPresent()) {

			if (linkValueDetails.get().getToFieldValue().get().equals(newPositionName)) {

				LOGGER.info("Old Position Title is same as new");

			} else {
				LOGGER.info("Old Position Title is different");
				
				String linkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LINE_MANAGER_POSITION,
						linkValueDetails.get().getToFieldValueId().getAsLong(), gidValueId, false);

				displayAndAddLinkDetails(fileId, TEXT_UN_LINK_VALUE, COLUMN_HEADER_LINE_MANAGER_POSITION,
						linkValueDetails.get().getToFieldValue().get(),
						linkValueDetails.get().getToFieldValueId().getAsLong(), COLUMN_HEADER_LINE_MANAGER,
						linkValueDetails.get().getFromFieldValue().get(), gidValueId, linkOrUnlinkResponse, false);

			}

		}
		LOGGER.info("######## Exiting getOldBusinessValueIdAndUnlink method ########");

	}

	private long addManagerDetailsInLov(ManagerDetails managerDetails) {

		LOGGER.info("######## Entering addManagerDetailsInLov method ########");
		long vLovId = 0L;
//		long lovValueIdFromDB = getLovValueIdFromDB(COLUMN_HEADER_LINE_MANAGER, managerDetails.getGid());
		// boolean isPresentInDB = (lovValueIdFromDB != 0) ? true : false;

		// if (!isPresentInDB) {
		try {
			vLovId = configService.setLovEntry(lovIdMap.get(COLUMN_HEADER_LINE_MANAGER).getLovName(),
					managerDetails.getGid(), lovIdMap.get(COLUMN_HEADER_LINE_MANAGER).getLovId(),
					managerDetails.getGid());
			setLovEntryCount++;
			configService.setLovLabel(lovIdMap.get(COLUMN_HEADER_LINE_MANAGER).getLovName(), managerDetails.getGid(),
					CONFIGURABLE_LOV, LANGUAGE_UK, managerDetails.getFirstName() + " " + managerDetails.getLastName(),
					true);
			setLovLabelCount++;
			LOGGER.info("addLovEntryAndLabel: " + COLUMN_HEADER_LINE_MANAGER + ", " + managerDetails.getGid() + ", "
					+ vLovId);

			// addLovValueDetails(COLUMN_HEADER_LINE_MANAGER, managerDetails.getGid(),
			// vLovId, managerDetails.getFileId());

		} catch (Exception e) {
			LOGGER.error("Exception occured in addLovEntryAndLabel For Line Manager" + e.getMessage());
			e.printStackTrace();
			// throw e;
		}
		// } else {
		// LOGGER.info("Value Present in DB (" + lovValueIdFromDB + ")");
		// }

		LOGGER.info("######## Exiting addManagerDetailsInLov method ########");
		return vLovId;
	}

	private Tlkuserdetails getTlkUserDetails(ManagerDetails managerDetails) {

		Tlkuserdetails userDetails = new TlkuserdetailsImpl();
		userDetails.setFirstname(managerDetails.getFirstName());
		userDetails.setLastname(managerDetails.getLastName());
		userDetails.setEmail(managerDetails.getEmail());

		if (managerDetails.getEmailAsLoginFlag())
			userDetails.setLogin(managerDetails.getEmail());
		else
			userDetails.setLogin(managerDetails.getLoginValue());

		userDetails.setTimezone(managerDetails.getTimezone());
		userDetails.setTimeformat(DEFAULT_TIME_FORMAT);
		userDetails.setLanguage(UK);
		userDetails.setPassword(managerDetails.getPassword());

		if (!StringUtils.isEmpty(managerDetails.getGid())) {
			userDetails.setGid(managerDetails.getGid());
		}
		if (!StringUtils.isEmpty(managerDetails.getBusinessTitle())) {
			userDetails.setBusinesstitle(managerDetails.getBusinessTitle());
		}
		if (StringUtils.isEmpty(managerDetails.getUserType())) {
			userDetails.setUsertype(USER_TYPE_MSS);
		} else
			userDetails.setUsertype(managerDetails.getUserType());

		userDetails.setCreatedTime(new Timestamp(System.currentTimeMillis()));
		userDetails.setUserId((int) managerDetails.getUserId());
		userDetails.setCountry(managerDetails.getCountry());
		userDetails.setActiveStatus(CommonConstants.ACTIVE_YES);
		if (!StringUtils.isEmpty(managerDetails.getSource()))
			userDetails.setSource(managerDetails.getSource());
		userDetails.setUpdatedTime(new Timestamp(System.currentTimeMillis()));

		return userDetails;
	}

	private Tlkuserdetails getTlkUserDetailsToDelete(UserDto managerDetails) {

		Tlkuserdetails userDetails = new TlkuserdetailsImpl();
		userDetails.setFirstname(managerDetails.getFirstName());
		userDetails.setLastname(managerDetails.getLastName());
		userDetails.setEmail(managerDetails.getEmail());
		userDetails.setLogin(managerDetails.getLogin());
		userDetails.setTimeformat(DEFAULT_TIME_FORMAT);
		userDetails.setLanguage(UK);
		// userDetails.setPassword(managerDetails.getPassword());
		userDetails.setUsertype(managerDetails.getType());
		userDetails.setCreatedTime(new Timestamp(System.currentTimeMillis()));
		userDetails.setUserId(managerDetails.getId().intValue());
		userDetails.setActiveStatus(CommonConstants.ACTIVE_NO);
		userDetails.setSource(SOURCE_TALENTLINK);
		userDetails.setUpdatedTime(new Timestamp(System.currentTimeMillis()));
		return userDetails;
	}

	private String addNewUser(ManagerDetails managerDetails) {
		String response = "";
		int retryCount = 0;
		while (retryCount < 3) {
			try {
				response = userService.addNewUser(managerDetails);
				// userService.assignRoles(managerDetails.getUserId(),
				// CommonConstants.STANDARD_RECRUITER,
				// CommonConstants.ORGANIZATION_DEPARTMENT_IDS);
				break;
			} catch (Exception e) {
				LOGGER.error("Exception occured in addNewUser ,userEmail: " + managerDetails.getEmail() + ", message: "
						+ e.getMessage());
				e.printStackTrace();
				response = "Exception occured in addNewUser " + e.getMessage();
			}
			retryCount++;
		}

		return response;
	}

	public void deleteUserDetails(ManagerDetails managerDetails) {

		LOGGER.info("######## Entering deleteUserDetails method ########");

		int retryCount = 0;
		boolean isDeleted = false;
		String errorMessage = "";
		while (retryCount < 3) {

			Optional<Tlkuserdetails> user = userManager.stream()
					.filter(Tlkuserdetails.GID.equal(managerDetails.getGid())).findAny();

			if (!user.isPresent()) {
				user = userManager.stream().filter(Tlkuserdetails.EMAIL.equal(managerDetails.getEmail())).findAny();
			}

			try {
				if (!user.isPresent()) {

					LOGGER.info("User not found in DB, trying to delete user after adding in db, email: "
							+ managerDetails.getEmail());

					UserDto dto = userService.getUserDetailsByLoginAndEmail(managerDetails.getEmail(), false, true);

					if (dto != null) {
						LOGGER.info("User found in TLK - " + dto.getEmail());
						userService.deleteUser(managerDetails.getEmail(), managerDetails.getTimezone());

						Tlkuserdetails userDetails = getTlkUserDetailsToDelete(dto);
						userManager.persist(userDetails);
					} else {
						LOGGER.info("User not found in TLK - " + managerDetails.getEmail());
					}

				} else {

					LOGGER.info("User found in DB, trying to delete user " + managerDetails.getEmail());
					UserDto dto = userService.getUserDetailsById(Long.parseLong(user.get().getUserId() + ""));

					userService.deleteUser(Long.parseLong(user.get().getUserId() + ""), managerDetails.getEmail(),
							managerDetails.getFirstName(), managerDetails.getLastName(), managerDetails.getTimezone(),
							dto.getType());
					user.get().setActiveStatus(CommonConstants.ACTIVE_NO);
					userManager.update(user.get());
				}
				isDeleted = true;

				if (!StringUtils.isEmpty(managerDetails.getGid())) {
					removeManagerDetailsInLov(managerDetails);
				}

				break;
			} catch (Exception e) {
				LOGGER.error("Exception occurred while deleting user " + managerDetails.getEmail());
				errorMessage = e.getMessage();
				e.printStackTrace();
				isDeleted = false;
			}
			retryCount++;

		}
		if (isDeleted == false) {
			if (!readerUtil.getManagerDetailsErrorMap().containsKey(managerDetails.getFileName())) {
				errorList = new ArrayList<ErrorDetail>();
				readerUtil.getManagerDetailsErrorMap().put(managerDetails.getFileName(), errorList);
			}
			ErrorDetail errorDetail = new ErrorDetail();
			errorDetail.setError_Message(errorMessage);
			errorDetail.setRow_Number(managerDetails.getRowNumber());
			readerUtil.getManagerDetailsErrorMap().get(managerDetails.getFileName()).add(errorDetail);
		}

		LOGGER.info("User Deleted: " + isDeleted);

		LOGGER.info("######## Exiting deleteUserDetails method ########");

	}

	private void removeManagerDetailsInLov(ManagerDetails managerDetails) {

		LOGGER.info("######## Entering removeManagerDetailsInLov method ########");

		try {
			configService.removeLovEntry(COLUMN_HEADER_LINE_MANAGER, managerDetails.getGid(),
					lovIdMap.get(COLUMN_HEADER_LINE_MANAGER).getLovId());

		} catch (Exception e) {
			LOGGER.error("Exception occured in removeManagerDetailsInLov For Line Manager" + e.getMessage());
			e.printStackTrace();
			// throw e;
		}

		LOGGER.info("######## Exiting removeManagerDetailsInLov method ########");

	}

	private void resetStatsCountValues() {
		setLinkValueCount = 0;
		setLovEntryCount = 0;
		setLinkValueCount = 0;
		setUnLinkValueCount = 0;

	}

	public void displayAndAddLinkDetails(int fileId, String linkOrUnlinkText, String toField, String toFieldValue,
			long toFieldValueId, String fromField, String fromFieldValue, long fromFieldValueId,
			String linkUnlinkStatus, boolean linkFlag) {

		LOGGER.info(linkOrUnlinkText + fromField + " (" + fromFieldValue + ") <==> " + toField + "(" + toFieldValue
				+ ") => " + linkUnlinkStatus);
		try {
			Linkvaluedetails linkDetails = new LinkvaluedetailsImpl();

			if (linkFlag) {
				linkDetails.setStatus(ACTIVE);

			} else {
				linkDetails.setStatus(IN_ACTIVE);
			}

			linkDetails.setFileId(fileId);
			linkDetails.setFromFieldName(fromField);
			linkDetails.setFromFieldValue(fromFieldValue);
			linkDetails.setFromFieldValueId(fromFieldValueId);
			linkDetails.setToFieldName(toField);
			linkDetails.setToFieldValue(toFieldValue);
			linkDetails.setToFieldValueId(toFieldValueId);
			linkDetails.setLinkUnlinkStatus(linkUnlinkStatus);
			linkDetails.setCreatedTime(new Timestamp(System.currentTimeMillis()));
			linkValueDetailsManager.persist(linkDetails);

		} catch (Exception e) {
			LOGGER.error("Exception occured while adding linkvalue details " + e.getMessage());
			e.printStackTrace();
		}

	}

	public String updateGradeDetails(String gradeType) {

		LOGGER.info("In updateGradeDetails " + gradeType);
		AtomicInteger oldFileId = new AtomicInteger(-1);
		AtomicInteger newFileId = new AtomicInteger();

		Comparator<Inputfiledetails> idComparator = Comparator.comparing(Inputfiledetails::getFileId).reversed();

		Optional<Inputfiledetails> oldUpdateFileDetails = inputFileDetailsManager.stream()
				.filter(Inputfiledetails.FILE_NAME.contains("Update " + gradeType + " Grade")).sorted(idComparator)
				.findFirst();

		if (oldUpdateFileDetails.isPresent())
			oldFileId.set(oldUpdateFileDetails.get().getFileId());

		LOGGER.info("Old file Id: " + oldFileId);

		Inputfiledetails updateFileDetails = new InputfiledetailsImpl();

		updateFileDetails.setFileName("Update " + gradeType + " Grade");
		updateFileDetails.setStatus(CommonConstants.EMAIL_SENT);
		LOGGER.info(sdf.format(new Date()));
		updateFileDetails.setUploadDate(sdf.format(new Date()));
		LOGGER.info(new Timestamp(System.currentTimeMillis()) + "");
		updateFileDetails.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		updateFileDetails = inputFileDetailsManager.persist(updateFileDetails);

		newFileId.set(updateFileDetails.getFileId());

		boolean linkFlag = true;
		String response = "{\"response\":\"SUCCESSFULLY UPDATED THE GRADES - " + gradeType + "\"}";

		String linkOrUnlinkText = linkFlag ? TEXT_LINK_VALUE : TEXT_UN_LINK_VALUE;

		try {

			commonUtil.resetGradeCacheValues();

			if (CommonConstants.RCS_GRADE_TYPE.equals(gradeType)) {

				Set<String> rcsGradeList = commonUtil.getAllRCSGradeValues();

				List<Poswithoutgrades> positionCodeDetails = posWithoutGradesManager.stream()
						.filter(Poswithoutgrades.RCS_GRADE.equal(0)).collect(Collectors.toList());

				positionCodeDetails.forEach(posCodeDetails -> {

					PositionDetails positionDetails = new PositionDetails();
					positionDetails.setMyhrPositionCode(posCodeDetails.getPositionCode());
					positionDetails.setFileId(newFileId.get());

					positionDetails.setMyhrPositionCodeValueId(getLovValueId(COLUMN_HEADER_MYHR_POSITION_CODE,
							positionDetails.getMyhrPositionCode(), positionDetails.getFileId()));

					linkValueDetailsManager.stream()
							.filter(Linkvaluedetails.FROM_FIELD_NAME
									.equal(CommonConstants.COLUMN_HEADER_MYHR_POSITION_CODE)
									.and(Linkvaluedetails.FILE_ID.equal(oldFileId.get()))
									.and(Linkvaluedetails.FROM_FIELD_VALUE.equal(posCodeDetails.getPositionCode()))
									.and(Linkvaluedetails.TO_FIELD_NAME.equal(CommonConstants.COLUMN_HEADER_RCS_GRADE)
											.and(Linkvaluedetails.STATUS.equal(CommonConstants.ACTIVE))))
							.forEach(linkvaluedetails -> {

								if (!rcsGradeList.contains(linkvaluedetails.getToFieldValue().get())) {
									LOGGER.info("Unlink rcs grade " + linkvaluedetails.getToFieldValue().get());

									positionDetails.setRcsGradeValueId(getLovValueId(COLUMN_HEADER_RCS_GRADE,
											linkvaluedetails.getToFieldValue().get(), positionDetails.getFileId()));

									String locallinkOrUnlinkResponse = linkOrUnlinkValuesForUpdate(
											COLUMN_HEADER_RCS_GRADE, positionDetails.getRcsGradeValueId(),
											positionDetails.getMyhrPositionCodeValueId(), false);

									displayAndAddLinkDetails(positionDetails.getFileId(), TEXT_UN_LINK_VALUE,
											COLUMN_HEADER_RCS_GRADE, linkvaluedetails.getToFieldValue().get(),
											positionDetails.getRcsGradeValueId(), COLUMN_HEADER_MYHR_POSITION_CODE,
											positionDetails.getMyhrPositionCode(),
											positionDetails.getMyhrPositionCodeValueId(), locallinkOrUnlinkResponse,
											false);
								}

							});

					rcsGradeList.forEach(rcsGrade -> {

						Long rcsGradeValueId = getLovValueId(COLUMN_HEADER_RCS_GRADE, rcsGrade,
								positionDetails.getFileId());

						String locallinkOrUnlinkResponse = linkOrUnlinkValuesForUpdate(COLUMN_HEADER_RCS_GRADE,
								rcsGradeValueId, positionDetails.getMyhrPositionCodeValueId(), linkFlag);

						displayAndAddLinkDetails(positionDetails.getFileId(), linkOrUnlinkText, COLUMN_HEADER_RCS_GRADE,
								rcsGrade, rcsGradeValueId, COLUMN_HEADER_MYHR_POSITION_CODE,
								positionDetails.getMyhrPositionCode(), positionDetails.getMyhrPositionCodeValueId(),
								locallinkOrUnlinkResponse, linkFlag);

					});

				});

			} else if (CommonConstants.LOCAL_GRADE_TYPE.equals(gradeType)) {

				Set<String> localGradeList = commonUtil.getAllLocalGradeValues();

				List<Poswithoutgrades> positionCodeDetails = posWithoutGradesManager.stream()
						.filter(Poswithoutgrades.LOCAL_GRADE.equal(0)).collect(Collectors.toList());

				positionCodeDetails.forEach(posCodeDetails -> {

					PositionDetails positionDetails = new PositionDetails();
					positionDetails.setMyhrPositionCode(posCodeDetails.getPositionCode());
					positionDetails.setFileId(newFileId.get());
					positionDetails.setMyhrPositionCodeValueId(getLovValueId(COLUMN_HEADER_MYHR_POSITION_CODE,
							positionDetails.getMyhrPositionCode(), positionDetails.getFileId()));

					linkValueDetailsManager.stream()
							.filter(Linkvaluedetails.FROM_FIELD_NAME
									.equal(CommonConstants.COLUMN_HEADER_MYHR_POSITION_CODE)
									.and(Linkvaluedetails.FILE_ID.equal(oldFileId.get()))
									.and(Linkvaluedetails.FROM_FIELD_VALUE.equal(posCodeDetails.getPositionCode()))
									.and(Linkvaluedetails.TO_FIELD_NAME.equal(CommonConstants.COLUMN_HEADER_LOCAL_GRADE)
											.and(Linkvaluedetails.STATUS.equal(CommonConstants.ACTIVE))))
							.forEach(linkvaluedetails -> {

								if (!localGradeList.contains(linkvaluedetails.getToFieldValue().get())) {
									LOGGER.info("Unlink local grade " + linkvaluedetails.getToFieldValue().get());

									positionDetails.setLocalGradeValueId(getLovValueId(COLUMN_HEADER_LOCAL_GRADE,
											linkvaluedetails.getToFieldValue().get(), positionDetails.getFileId()));

									String locallinkOrUnlinkResponse = linkOrUnlinkValuesForUpdate(
											COLUMN_HEADER_LOCAL_GRADE, positionDetails.getLocalGradeValueId(),
											positionDetails.getMyhrPositionCodeValueId(), false);
									displayAndAddLinkDetails(positionDetails.getFileId(), TEXT_UN_LINK_VALUE,
											COLUMN_HEADER_LOCAL_GRADE, linkvaluedetails.getToFieldValue().get(),
											positionDetails.getLocalGradeValueId(), COLUMN_HEADER_MYHR_POSITION_CODE,
											positionDetails.getMyhrPositionCode(),
											positionDetails.getMyhrPositionCodeValueId(), locallinkOrUnlinkResponse,
											false);

								}

							});

					localGradeList.forEach(localGrade -> {

						Long localGradeValueId = getLovValueId(COLUMN_HEADER_LOCAL_GRADE, localGrade,
								positionDetails.getFileId());

						String locallinkOrUnlinkResponse = linkOrUnlinkValuesForUpdate(COLUMN_HEADER_LOCAL_GRADE,
								localGradeValueId, positionDetails.getMyhrPositionCodeValueId(), linkFlag);
						displayAndAddLinkDetails(positionDetails.getFileId(), linkOrUnlinkText,
								COLUMN_HEADER_LOCAL_GRADE, localGrade, localGradeValueId,
								COLUMN_HEADER_MYHR_POSITION_CODE, positionDetails.getMyhrPositionCode(),
								positionDetails.getMyhrPositionCodeValueId(), locallinkOrUnlinkResponse, linkFlag);

					});

				});
			}

		} catch (Exception e) {
			LOGGER.info("Exception occured in updateGradeDetails " + e.getMessage());
			e.printStackTrace();
			response = "{\"response\":\"Exception occured while updating the Grade details " + gradeType + " "
					+ e.getMessage() + "\"}";
		}
		return response;
	}

	public String linkOrUnlinkValuesForUpdate(String lovName, long vlovId1, long vlovId2, boolean linkFlag) {
		String response = "";
		int retryCount = 0;
		while (retryCount < 3) {
			try {
				response = linkOrUnlinkValues(lovName, vlovId1, vlovId2, linkFlag);
				break;
			} catch (Exception e) {
				LOGGER.error("Exception occured in linkOrUnlinkValuesForUpdate " + e.getMessage());
				e.printStackTrace();
			}
			retryCount++;
		}
		return response;
	}

	public void unlinkDefaultGrades(String positionCode, String gradeType, int fileId) {

		PositionDetails positionDetails = new PositionDetails();
		positionDetails.setMyhrPositionCode(positionCode);
		positionDetails.setFileId(fileId);
		positionDetails.setMyhrPositionCodeValueId(getLovValueId(COLUMN_HEADER_MYHR_POSITION_CODE,
				positionDetails.getMyhrPositionCode(), positionDetails.getFileId()));

		if (CommonConstants.RCS_GRADE_TYPE.equals(gradeType)) {

			Set<String> rcsGradeList = commonUtil.getAllRCSGradeValues();

			rcsGradeList.forEach(rcsGrade -> {

				positionDetails.setRcsGradeValueId(
						getLovValueId(COLUMN_HEADER_RCS_GRADE, rcsGrade, positionDetails.getFileId()));

				String locallinkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_RCS_GRADE,
						positionDetails.getRcsGradeValueId(), positionDetails.getMyhrPositionCodeValueId(), false);

				displayAndAddLinkDetails(positionDetails.getFileId(), TEXT_UN_LINK_VALUE, COLUMN_HEADER_RCS_GRADE,
						rcsGrade, positionDetails.getRcsGradeValueId(), COLUMN_HEADER_MYHR_POSITION_CODE,
						positionDetails.getMyhrPositionCode(), positionDetails.getMyhrPositionCodeValueId(),
						locallinkOrUnlinkResponse, false);

			});

		} else if (CommonConstants.LOCAL_GRADE_TYPE.equals(gradeType)) {

			Set<String> localGradeList = commonUtil.getAllLocalGradeValues();

			localGradeList.forEach(localGrade -> {

				positionDetails.setLocalGradeValueId(
						getLovValueId(COLUMN_HEADER_LOCAL_GRADE, localGrade, positionDetails.getFileId()));

				String locallinkOrUnlinkResponse = linkOrUnlinkValues(COLUMN_HEADER_LOCAL_GRADE,
						positionDetails.getLocalGradeValueId(), positionDetails.getMyhrPositionCodeValueId(), false);
				displayAndAddLinkDetails(positionDetails.getFileId(), TEXT_UN_LINK_VALUE, COLUMN_HEADER_LOCAL_GRADE,
						localGrade, positionDetails.getLocalGradeValueId(), COLUMN_HEADER_MYHR_POSITION_CODE,
						positionDetails.getMyhrPositionCode(), positionDetails.getMyhrPositionCodeValueId(),
						locallinkOrUnlinkResponse, false);

			});

		}

	}
}
