package com.dhl.dhltalentlinkapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import javax.xml.ws.BindingProvider;

import com.dhl.dhltalentlinkapp.dao.StructuredFormQADto;
import com.mrted.ws.candidate.Answer;
import com.mrted.ws.candidate.ApplicationDto;
import com.mrted.ws.candidate.Profile;
import com.mrted.ws.candidate.StructuredDocument;
import com.mrted.ws.position.ConfLovDto;
import com.mrted.ws.position.ConfigurableFieldsDto;
import com.mrted.ws.position.FreeFormFieldDto;
import com.mrted.ws.position.PositionDto;
import com.mrted.ws.position.PositionWebService;
import com.mrted.ws.position.PositionWebService_Service;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class PositionDetailsService {

	private final static Logger LOGGER = LoggerManager.getLogger(PositionDetailsService.class);

	PositionWebService_Service positionDetailsWebService = null;
	PositionWebService positionService = null;
	BindingProvider bindingProvider = null;

	public PositionDetailsService() {

		positionDetailsWebService = new PositionWebService_Service();
		positionService = positionDetailsWebService.getPositionWebServicePort();

		bindingProvider = (BindingProvider) positionService;
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://api3.lumesse-talenthub.com/HRIS/SOAP/Position?api_key=686170a1-b10c-b79d-ae8c-9b9992c65ecb");
	}

	public static void main(String args[]) {

		PositionDetailsService positionService = new PositionDetailsService();

		// configService.getCandidateDetails(103713L);

		positionService.getRequisitinQADetailsByPositionId(10363L);

	}

	public List<StructuredFormQADto> getRequisitinQADetailsByPositionId(Long positionId) {

		LOGGER.info("### - Entering getRequisitinQADetailsByPositionId method ###");
		List<StructuredFormQADto> questionAnswerList = new ArrayList<StructuredFormQADto>();

		PositionDto positionDto = positionService.getPositionById(positionId);

		LOGGER.info(positionDto.getTitle());
		LOGGER.info(positionDto.getJobNumber());
		LOGGER.info(positionDto.getRequisitionNumber());

		LOGGER.info(positionDto.getCompany());

		List<FreeFormFieldDto> freeFormFieldDto = positionDto.getConfigurableFields().getFreeFormFields()
				.getFreeFormField();

		freeFormFieldDto.forEach(freeFormField -> {
			StructuredFormQADto questionAnswerdto = new StructuredFormQADto();

			questionAnswerdto.setQuestion(freeFormField.getKeyfield());
			questionAnswerdto.setAnswer(freeFormField.getValue());
			questionAnswerdto.setSource("Requisition Form");

			LOGGER.info(freeFormField.getKeyfield());
			LOGGER.info(freeFormField.getValue());

			questionAnswerList.add(questionAnswerdto);
		});

		List<ConfLovDto> confLovDto = positionDto.getConfigurableFields().getLovs().getLov();
		AtomicReference<Boolean> workHoursv2Exist = new AtomicReference<Boolean>(false);
		AtomicReference<Boolean> workHoursFreqv2Exist = new AtomicReference<Boolean>(false);

		confLovDto.forEach(confLov -> {
			StructuredFormQADto questionAnswerdto = new StructuredFormQADto();
			questionAnswerdto.setQuestion(confLov.getKeyname());
			questionAnswerdto.setAnswer(confLov.getValue());
			questionAnswerdto.setSource("Requisition Form");
			if (confLov.getKeyname().equals("Work Hours"))
				workHoursv2Exist.set(true);
			else if (confLov.getKeyname().equals("Work Hours Frequency"))
				workHoursFreqv2Exist.set(true);

			LOGGER.info(confLov.getKeyname());
			LOGGER.info(confLov.getValue());
			questionAnswerList.add(questionAnswerdto);

		});

		if (!workHoursv2Exist.get()) {
			if(positionDto.getWorkTime().getTimeCount()!=null) {
			StructuredFormQADto questionAnswerdto = new StructuredFormQADto();
			questionAnswerdto.setQuestion("Work Hours");
			questionAnswerdto.setAnswer(positionDto.getWorkTime().getTimeCount() + "");
			LOGGER.info("work hours v2222: "+positionDto.getWorkTime().getTimeCount());
			questionAnswerList.add(questionAnswerdto);
			}

		}

		if (!workHoursFreqv2Exist.get()) {			
			StructuredFormQADto questionAnswerdto = new StructuredFormQADto();
			questionAnswerdto.setQuestion("Work Hours Frequency");
			questionAnswerdto.setAnswer(positionDto.getWorkTime().getWorkPeriod());
			LOGGER.info("Work Period v2 2: "+positionDto.getWorkTime().getWorkPeriod());
			questionAnswerList.add(questionAnswerdto);
		}

		LOGGER.info("### - Exiting getRequisitinQADetailsByPositionId method ###");
		return questionAnswerList;

	}

}
