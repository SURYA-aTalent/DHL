package com.dhl.dhltalentlinkapp.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.apache.commons.codec.language.bm.Lang;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.mrted.ws.documents.LangCode;
import com.mrted.ws.documents.LocalizedValueDto;
import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.dao.StructuredFormQADto;
import com.mrted.ws.documents.Answer;
import com.mrted.ws.documents.AnswerDto;
import com.mrted.ws.documents.AnswerDto.Values;
import com.mrted.ws.documents.AssignedQuestion;
import com.mrted.ws.documents.AssignedQuestion2;
import com.mrted.ws.documents.ComplexAssignedQuestion;
import com.mrted.ws.documents.Document;
import com.mrted.ws.documents.DocumentWebService;
import com.mrted.ws.documents.DocumentWebService_Service;
import com.mrted.ws.documents.FormAnsweredDto;
import com.mrted.ws.documents.GfDocument;
import com.mrted.ws.documents.QuestionAnsweredDto;
import com.mrted.ws.documents.QuestionAnsweredDto.Children;
import com.mrted.ws.documents.QuestionsAnsweredDto;
import com.mrted.ws.documents.SelectedOption;
import com.mrted.ws.documents.SimpleAssignedQuestion;
import com.mrted.ws.documents.StructuredDocument;
import com.mrted.ws.documents.StructuredDocumentDto;
import com.mrted.ws.documents.StructuredDocumentDto.Questions;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;

public class DocumentService {

	private final static Logger LOGGER = LoggerManager.getLogger(DocumentService.class);

	DocumentWebService_Service documentWebService = null;
	DocumentWebService documentService = null;
	BindingProvider bindingProvider = null;
	private String jobLocationCountry = null;
	private Map<Long,Boolean> preHireFormAvailability = null;

	public DocumentService() {

		documentWebService = new DocumentWebService_Service();
		documentService = documentWebService.getDocumentWebServicePort();

		bindingProvider = (BindingProvider) documentService;
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://api3.lumesse-talenthub.com/HRIS/SOAP/Document?api_key=686170a1-b10c-b79d-ae8c-9b9992c65ecb");
		preHireFormAvailability = new HashMap<Long,Boolean>();
	}

	public static void main(String args[]) {
		final List<String> allowedFormNames = Arrays.asList(
				"AU_White Collar (Long) + security protocol check + candidate information + Working Rights",
				"*myHR - Application Forms for WC long forms");
		DocumentService documentService = new DocumentService();
		documentService.getStructuredDocumentQAById(786746L); // 786700L
		// List<Integer>
		// ids=configService.getStructuredDocumentsIdsByCandidateId(103716L,allowedFormNames);
		// LOGGER.info(ids+"");

	}

	public String getJobLocationCountry() {
		return jobLocationCountry;
	}
	
	public void setJobLocationCountry(String country) {
		this.jobLocationCountry = country;
	}

	public List<StructuredFormQADto> getStructuredDocumentQAById(Long documentId) {

		LOGGER.info("### - Entering getBasicStructuredDocumentDtoById method ###");

		StructuredDocument structuredDoc = documentService.getStructuredDocumentById(documentId, true, LangCode.UK);

		LOGGER.info("Candidate ID: " + structuredDoc.getCandidateId());
		LOGGER.info("Name: " + structuredDoc.getName());
		LOGGER.info("Form Creation Date: " + structuredDoc.getFormCreationDate());

		GfDocument gfDocument = structuredDoc.getAnswers();
		List<StructuredFormQADto> questionAnswerList = new ArrayList<StructuredFormQADto>();

		for (Answer answer : gfDocument.getAnswer()) {

			questionAnswerList.add(mapQuestionAndAnswer(answer, structuredDoc.getName()));

		}

		LOGGER.info("### - Exiting getBasicStructuredDocumentDtoById method ###");
		return questionAnswerList;
	}

	public List<Integer> getStructuredDocumentsIdsByCandidateId(Long id, List<String> allowedForms) {

		LOGGER.info("### - Entering getDocumentsByCandidateId method ###");

		List<Object> doc = documentService.getDocumentsByCandidateId(id);
		List<Integer> structuredIds = new ArrayList<Integer>();

		doc.forEach(dd -> {
			com.sun.org.apache.xerces.internal.dom.ElementNSImpl elements = (ElementNSImpl) dd;
			NodeList nodeList = elements.getChildNodes();
			String objectType = "";
			String documentId = "";
			String documentName = "";
			for (int i = 0; i < nodeList.getLength(); i++) {

				if (nodeList.item(i).getNodeName().equals("objectType"))
					objectType = nodeList.item(i).getTextContent();

				if (nodeList.item(i).getNodeName().equals("id"))
					documentId = nodeList.item(i).getTextContent();
				// LOGGER.info("Name: "+nodeList.item(i).getNodeName()+"");

				if (nodeList.item(i).getNodeName().equals("name"))
					documentName = nodeList.item(i).getTextContent();
			}

			// LOGGER.info(objectType);
			// LOGGER.info(documentId);
			// LOGGER.info(documentName);
			//LOGGER.info("----------------");
			if (objectType.equals("STRUCTURED") && allowedForms.contains(documentName)) {
				LOGGER.info("Adding: " + documentName);
				if(documentName.toLowerCase().contains("pre-hire")) {
					preHireFormAvailability.put(id,true);
				}					
				structuredIds.add(Integer.parseInt(documentId));
			}

		});

		LOGGER.info("### - Exiting getDocumentsByCandidateId method ###");
		return structuredIds;

	}

	private StructuredFormQADto mapQuestionAndAnswer(Answer formAnswer, String formName) {

		AssignedQuestion assignedQuestion = formAnswer.getAssignedQuestion();
		List<SelectedOption> selectedOptions = formAnswer.getSelectedOptions();

		StructuredFormQADto questionAnswerdto = new StructuredFormQADto();

		List<LocalizedValueDto> localizedValues = assignedQuestion.getLocalizedValues().getLocalizedValue();

		String question = "";
		;
		if (localizedValues.size() > 0) {
			question = localizedValues.get(0).getValue();
		}
		String answer = "";
		for (SelectedOption selectedOption : selectedOptions) {
			List<LocalizedValueDto> localizedOptionValues = selectedOption.getAssignedOption().getLocalizedValues()
					.getLocalizedValue();

			if (localizedOptionValues.size() > 0) {
				answer = answer + localizedOptionValues.get(0).getValue() + ",";
			}
		}

		if (answer.equals("")) {
			answer = formAnswer.getFreeText();
		}

		 if ((formName.contains("Pre-Hire")) &&	 question.contains("Job Location Country")) {
	
			answer = answer.replace(",", "");
			this.jobLocationCountry = answer;
			if(CommonConstants.COUNTRY_VIETNAM_OLD.equals(answer))
				this.jobLocationCountry = CommonConstants.COUNTRY_VIETNAM;
			LOGGER.info("################Question: " + question);
			LOGGER.info("################Answer: " + answer);
		} /*
			 * else if ((formName.equals("Pre-Hire form for myHR test v3 - Vietnam")) &&
			 * question.equals("Job Location Country")) { answer = answer.replace(",", "");
			 * this.jobLocationCountry = answer; LOGGER.info("################Question: " +
			 * question); LOGGER.info("################Answer: " + answer);
			 * 
			 * }
			 */

		 
		questionAnswerdto.setQuestion(question);
		questionAnswerdto.setAnswer(answer);
		questionAnswerdto.setSource(formName);

		return questionAnswerdto;
	}
	
	public Map<Long, Boolean> getPreHireFormAvailability() {
		return preHireFormAvailability;
	}

}
