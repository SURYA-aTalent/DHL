package com.dhl.dhltalentlinkapp.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;

import com.cronutils.utils.StringUtils;
import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.masterconfig.MasterconfigManager;
import com.dhl.dhltalentlinkapp.outbound.dao.export.AustraliaExportData;
import com.dhl.dhltalentlinkapp.outbound.dao.export.ExportData;
import com.dhl.dhltalentlinkapp.outbound.dao.export.IndiaExportData;

import com.dhl.dhltalentlinkapp.outbound.dao.export.SingaporeExportData;


import com.dhl.dhltalentlinkapp.outbound.dao.export.sdh.SDHExportData;
import com.dhl.dhltalentlinkapp.outbound.dao.export.sdh.SDHExportDataList;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PayrollRelationshipEmployee;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PayrollRelationshipEmployee.PayrollCostAttributes;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PayrollRelationshipEmployee.PayrollCostAttributes.PayrollCostAttributesDetails;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PersonEmailDetail;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PersonGID;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PersonGID.PersonGIDDetails;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PersonInfoDetail;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PersonInfoDetail.PersonInfoDetails;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PersonInfoName;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PersonInfoName.PersonName;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.AssignmentDetail;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.AssignmentSourceKeyBlock;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.AssignmentSourceKeyBlock.AsgSourceKey;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.DottedLineManager;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.DottedLineManager.DottedLineManagerPersonNumber;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.DottedLineManager.DottedLineManagerPersonNumber.DottedLineManagerGID;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.DottedLineManager.DottedLineManagerPersonNumber.DottedLineManagerGID.DottedLineManagerGIDDetails;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.DottedLineManager.DottedLineManagerPersonNumber.PersonManager;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.Location;
import com.dhl.dhltalentlinkapp.utils.DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.Location.LocationDetail;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvGenerator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class CSVWriterUtil {

	private final static Logger LOGGER = LoggerManager.getLogger(CSVWriterUtil.class);
	protected @Autowired MasterconfigManager masterConfigManager;
	private String exportFilePath = null;

	private String exportSDHFilePath = null;

	@PostConstruct
	public void initMethod() {

		exportFilePath = masterConfigManager.getValue(CommonConstants.EXPORT_FILE_LOCATION);
		exportSDHFilePath = masterConfigManager.getValue(CommonConstants.EXPORT_SDH_FILE_LOCATION);
	}

	public String writeExportData(String fileName, List<ExportData> exportDataList, String countryName) {

		LOGGER.info("Entering writeExportData..");
		String filePath = exportFilePath + fileName;
		// File csvOutputFile = new File("/home/mathan/Desktop/output.csv");
		try {
			File csvOutputFile = new File(filePath);
			Class schemaClass = null;
			if (CommonConstants.COUNTRY_AUSTRALIA.equals(countryName)) {
				schemaClass = AustraliaExportData.class;
			} else if (CommonConstants.COUNTRY_INDIA.equals(countryName)) {
				schemaClass = IndiaExportData.class;
			} else if (CommonConstants.COUNTRY_SINGAPORE.equals(countryName)) {
				schemaClass = SingaporeExportData.class;
			} else if (CommonConstants.EMPTY.equals(countryName)) {
				schemaClass = ExportData.class;
			}
			/*
			 * List<AustraliaExportData> list = new ArrayList<AustraliaExportData>();
			 * AustraliaExportData exportData = new AustraliaExportData();
			 * exportData.setFirst_name("Mathan"); exportData.setLast_name("Murugesan");
			 * 
			 * 
			 * AustraliaExportData exportData2 = new AustraliaExportData();
			 * exportData2.setFirst_name("MathanKumar");
			 * exportData2.setLast_name("Murugesan");
			 * 
			 * list.add(exportData); list.add(exportData2);
			 */

			CsvMapper mapper = new CsvMapper();
			mapper.enable(CsvGenerator.Feature.ALWAYS_QUOTE_STRINGS);

			CsvSchema schema = mapper.schemaFor(schemaClass).withHeader().withColumnSeparator('|');

			ObjectWriter myObjectWriter = mapper.writer(schema);

			FileOutputStream tempFileOutputStream = new FileOutputStream(csvOutputFile);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(tempFileOutputStream, 1024);
			OutputStreamWriter writerOutputStream = new OutputStreamWriter(bufferedOutputStream, "UTF-8");
			myObjectWriter.writeValue(writerOutputStream, exportDataList);
			LOGGER.info("Export Data File Created Successfully.. " + csvOutputFile.getPath());

			return filePath;

		} catch (Exception e) {
			LOGGER.error("Exception occured in writeExportData method " + e.getMessage());
			e.printStackTrace();
		}

		LOGGER.info("Exiting writeExportData..");
		return null;

	}

	public String writeExportDataForSDH(String fileName, List<SDHExportData> exportDataList) {

		LOGGER.info("Entering writeExportDataForSDH..");
		String filePath = exportSDHFilePath + fileName;
		// File csvOutputFile = new File("/home/mathan/Desktop/output.csv");
		try {
			File csvOutputFile = new File(filePath);
			Class schemaClass = SDHExportData.class;

			CsvMapper mapper = new CsvMapper();
			mapper.enable(CsvGenerator.Feature.ALWAYS_QUOTE_STRINGS);
			CsvSchema schema = mapper.schemaFor(schemaClass).withHeader().withColumnSeparator('|');

			ObjectWriter myObjectWriter = mapper.writer(schema);

			FileOutputStream tempFileOutputStream = new FileOutputStream(csvOutputFile);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(tempFileOutputStream, 1024);
			OutputStreamWriter writerOutputStream = new OutputStreamWriter(bufferedOutputStream, "UTF-8");
			myObjectWriter.writeValue(writerOutputStream, exportDataList);
			LOGGER.info("Export Data File Created Successfully.. " + csvOutputFile.getPath());

			return filePath;

		} catch (Exception e) {
			LOGGER.error("Exception occured in writeExportDataForSDH method " + e.getMessage());
			e.printStackTrace();
		}

		LOGGER.info("Exiting writeExportData..");
		return null;

	}

	public String writeExportDataXMLForSDH(String fileName, List<SDHExportData> exportDataList) {

		LOGGER.info("Entering writeExportDataXMLForSDH..");
		String filePath = exportSDHFilePath + fileName;
		//SDHExportDataList dataList = new SDHExportDataList();
		// File csvOutputFile = new File("/home/mathan/Desktop/output.csv");
		try {
			//dataList.setExportData(exportDataList);
			// Create a JAXB context
			JAXBContext context = JAXBContext.newInstance(DATADS.class);

			// Create a marshaller
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// Marshal the list of objects to XML
			marshaller.marshal(getSDHObject(exportDataList), new File(filePath));

			LOGGER.info("Export Data File Created Successfully.. " + filePath);

			return filePath;

		} catch (Exception e) {
			LOGGER.error("Exception occured in writeExportDataXMLForSDH method " + e.getMessage());
			e.printStackTrace();
		}

		LOGGER.info("Exiting writeExportDataXMLForSDH..");
		return null;

	}

	public DATADS getSDHObject(List<SDHExportData> exportDataList) {

		ObjectFactory factory = new ObjectFactory();
		DATADS mydataDS = factory.createDATADS();
		mydataDS.setARCHIVEACTIONID("");
		mydataDS.setDELIVERYOPTIONID("");
		mydataDS.setFLOWINSTANCENAME("");
		mydataDS.setPAYROLLACTIONID("");
		
		G1 g1 = new G1();
		mydataDS.setG1(g1);

		G2 g2 = new G2();
		g1.setG2(g2);
		g1.setPAYROLLACTIONID("");
		
		FILEFRAGMENT ffr = new FILEFRAGMENT();
		g2.setFILEFRAGMENT(ffr);

		DPDHLINTCHRISSDH2Synch dpdhl = new DPDHLINTCHRISSDH2Synch();
		ffr.setDPDHLINTCHRISSDH2Synch(dpdhl);
		dpdhl.worker = new ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker>();

		for (SDHExportData exportData : exportDataList) {
			Worker worker = new Worker();

			if(!StringUtils.isEmpty(exportData.getGid())){
				 PersonGID gid = new PersonGID();
				 PersonGIDDetails giddetails = new PersonGIDDetails();
				 giddetails.setExternalIdentifierNumber(exportData.getGid());
				 gid.setPersonGIDDetails(giddetails);

				 worker.personGID = new
				 ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PersonGID>();
				 worker.personGID.add(gid);
			}
			// PersonGID gid = new PersonGID();
			// PersonGIDDetails giddetails = new PersonGIDDetails();
			// giddetails.setExternalIdentifierNumber("1234");
			// gid.setPersonGIDDetails(giddetails);

			// worker.personGID = new
			// ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PersonGID>();
			// worker.personGID.add(gid);

			PersonInfoName infoname = new PersonInfoName();
			PersonName name = new PersonName();
			name.setFirstName(exportData.getFirstName());
			name.setLastName(exportData.getLastName());
			name.setKnownAs(exportData.getKnownAs());
			
			infoname.setPersonName(name);
			worker.personInfoName = new ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PersonInfoName>();
			worker.personInfoName.add(infoname);

			PersonInfoDetail detail = new PersonInfoDetail();
			PersonInfoDetails details = new PersonInfoDetails();
			details.setDateOfBirth(exportData.getDateofBirth());
			details.setPersonEffectiveStartDate(exportData.getPersonEffectiveStartDate());
			detail.setPersonInfoDetails(details);

			worker.personInfoDetail = new ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PersonInfoDetail>();
			worker.personInfoDetail.add(detail);

			WorkRelationship wr = new WorkRelationship();
			AssignmentDetail ad = new AssignmentDetail();
			ad.setSystemPersonType(exportData.getSystemPersonType());
			ad.setProposedUserPersonType(exportData.getProposedUserPersonType());
			ad.setCrestERCode(exportData.getCrestERCode());
			ad.setAssignmentStatusTypeCode(exportData.getAssignmentStatusTypeCode());
			ad.setLegalEmployerCode(exportData.getLegalEmployerCode());
			ad.setGlobalJobCode(exportData.getGlobalJobCode());
			ad.setGlobalDepartmentCode(exportData.getGlobalDepartmentCode());
			ad.setBusinessUnitName(exportData.getBusinessUnitName());
			ad.setProjectedStartDate(exportData.getProjectedStartDate());
			ad.setRelationshipDateStart(exportData.getRelationshipDateStart());
			ad.setPersonNumber(exportData.getPersonNumber());
			// ad.setAssignmentNumber("123");
			ad.setGradeCode(exportData.getGradeCode());
			ad.setBusinessTitle(exportData.getBusinessTitle());
			ad.setActionCode(exportData.getActionCode());
			ad.setReasonCode(exportData.getReasonCode());
			ad.setLocalAction(exportData.getLocalAction());
			ad.setLocalActionReason(exportData.getLocalActionReason());
			ad.setEmailAccountRequired(exportData.getEmailAccountRequired());			
			wr.setAssignmentDetail(ad);

			worker.workRelationship = new ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship>();
			worker.workRelationship.add(wr);

			DottedLineManager linemanager = new DottedLineManager();
			DottedLineManagerPersonNumber personNo = new DottedLineManagerPersonNumber();
			linemanager.dottedLineManagerPersonNumber = new ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.DottedLineManager.DottedLineManagerPersonNumber>();
			linemanager.dottedLineManagerPersonNumber.add(personNo);
			PersonManager manager = new PersonManager();
			manager.setPersonManagerType(exportData.getPersonManagerType());
			personNo.setPersonManager(manager);
			wr.dottedLineManager = new ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.DottedLineManager>();
			wr.dottedLineManager.add(linemanager);

			DottedLineManagerGID mgid = new DottedLineManagerGID();
			personNo.dottedLineManagerGID = new ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.DottedLineManager.DottedLineManagerPersonNumber.DottedLineManagerGID>();
			personNo.dottedLineManagerGID.add(mgid);
			DottedLineManagerGIDDetails digdetails = new DottedLineManagerGIDDetails();
			digdetails.setPersonManagerExternalIdentifierNumber(exportData.getPersonManagerExternalIdentifierNumber());
			mgid.setDottedLineManagerGIDDetails(digdetails);

			AssignmentSourceKeyBlock keyblock = new AssignmentSourceKeyBlock();
			AsgSourceKey key = new AsgSourceKey();
			key.setLocalSystem(exportData.getLocalSystem());
			keyblock.setAsgSourceKey(key);
			wr.assignmentSourceKeyBlock = new ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.AssignmentSourceKeyBlock>();
			wr.assignmentSourceKeyBlock.add(keyblock);

			Location loc = new Location();
			LocationDetail locDetail = new LocationDetail();
			locDetail.setLocalLocationCode(exportData.getLocalLocationCode());
			loc.setLocationDetail(locDetail);
			wr.location = new ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.WorkRelationship.Location>();
			wr.location.add(loc);

			PayrollRelationshipEmployee empRelation = new PayrollRelationshipEmployee();
			PayrollCostAttributes cost = new PayrollCostAttributes();
			PayrollCostAttributesDetails costDetails = new PayrollCostAttributesDetails();
			costDetails.setCostCenter(exportData.getCostCenter());
			cost.setPayrollCostAttributesDetails(costDetails);
			empRelation.payrollCostAttributes = new ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PayrollRelationshipEmployee.PayrollCostAttributes>();
			empRelation.payrollCostAttributes.add(cost);
			worker.payrollRelationshipEmployee = new ArrayList<DATADS.G1.G2.FILEFRAGMENT.DPDHLINTCHRISSDH2Synch.Worker.PayrollRelationshipEmployee>();
			worker.payrollRelationshipEmployee.add(empRelation);

			PersonEmailDetail email = new PersonEmailDetail();
			email.setEmailType(exportData.getEmailType());
			email.setEmailAddress(exportData.getEmailAddress());
			worker.setPersonEmailDetail(email);

			dpdhl.worker.add(worker);
		}

		/*
		 * JAXBContext jaxbContext; try { jaxbContext =
		 * JAXBContext.newInstance(DATADS.class);
		 * 
		 * Marshaller marshaller = jaxbContext.createMarshaller();
		 * marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 * 
		 * StringWriter writer = new StringWriter(); marshaller.marshal(ds, new
		 * File("/home/mathan/Desktop/output.csv"));
		 * 
		 * String xmlString = writer.toString(); System.out.println(xmlString); } catch
		 * (JAXBException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
		return mydataDS;
	}

	public static void main(String args[]) throws IOException {
		// set correct directory as output
		File csvOutputFile = new File("/home/mathan/Desktop/output.csv");

		List<ExportData> list = new ArrayList<ExportData>();
		AustraliaExportData exportData = new AustraliaExportData();
		exportData.setFirst_name("Mathan");
		exportData.setLast_name("Murugesan");

		AustraliaExportData exportData2 = new AustraliaExportData();
		exportData2.setFirst_name("MathanKumar");
		exportData2.setLast_name("Murugesan");

		list.add(exportData);
		list.add(exportData2);

		CsvMapper mapper = new CsvMapper();
		mapper.enable(CsvGenerator.Feature.ALWAYS_QUOTE_STRINGS);
		CsvSchema schema = mapper.schemaFor(AustraliaExportData.class).withHeader();

		ObjectWriter myObjectWriter = mapper.writer(schema);

		FileOutputStream tempFileOutputStream = new FileOutputStream(csvOutputFile);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(tempFileOutputStream, 1024);
		OutputStreamWriter writerOutputStream = new OutputStreamWriter(bufferedOutputStream, "UTF-8");		
		myObjectWriter.writeValue(writerOutputStream, list);
		
		
		SDHExportData sdhData = new SDHExportData();
		sdhData.setSystemPersonType(CommonConstants.DEFAULT_PERSON_TYPE);

		sdhData.setAssignmentStatusTypeCode("test");
		sdhData.setProposedUserPersonType(CommonConstants.REGULAR_EMPLOYEE);
		sdhData.setPersonManagerType(CommonConstants.LINE_MANAGER);
		sdhData.setBusinessUnitName(CommonConstants.DEFAULT_BUSINESS_UNIT);
		sdhData.setLocalSystem(CommonConstants.DEFAULT_LOCAL_SYSTEM);
		sdhData.setActionCode(CommonConstants.DEFAULT_ACTION_CODE);
		sdhData.setReasonCode(CommonConstants.DEFAULT_ACTION_CODE);
		sdhData.setEmailType(CommonConstants.DEFAULT_EMAIL_TYPE);
		sdhData.setLocalAction(CommonConstants.DEFAULT_ACTION_CODE);
		sdhData.setLocalActionReason(CommonConstants.DEFAULT_ACTION_CODE);
		sdhData.setEmailAccountRequired("Yes");
		sdhData.setKnownAs("test");
		
		List<SDHExportData> exportDataList = new ArrayList<SDHExportData>();
		exportDataList.add(sdhData);
		
		CSVWriterUtil util = new CSVWriterUtil();
		util.writeExportDataXMLForSDH("/home/mathan/Desktop/output.xml", exportDataList);
		
	}
}
