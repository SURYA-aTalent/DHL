package com.dhl.dhltalentlinkapp.gradedetails;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.gradedetails.generated.GeneratedGradedetailsController;
import com.dhl.dhltalentlinkapp.utils.CommonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

/**
 * REST controller logic
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dhl
 */
@RestController
public class GradedetailsController extends GeneratedGradedetailsController {
	private @Autowired CommonUtils commonUtil;
	private final static Logger LOGGER = LoggerManager.getLogger(GradedetailsController.class);

	@GetMapping(path = "/getGradeDetails", produces = "application/json")
	// @PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public String getGradeDetails(@RequestParam("gradeType") String gradeType) {
		String response = "";
		Map<String, List<String>> gradeList = null;
		LOGGER.info("Entering getGradeDetails ");
		try {

			if (CommonConstants.ALL.equals(gradeType)) {
				gradeList = manager.stream().collect(Collectors.groupingBy(details -> details.getGradeType().get(),
						Collectors.mapping(details -> details.getGradeValue().get(), Collectors.toList())));
			} else if (CommonConstants.RCS_GRADE_TYPE.equals(gradeType)) {
				gradeList = manager.stream().filter(Gradedetails.GRADE_TYPE.equal(CommonConstants.RCS_GRADE_TYPE))
						.collect(Collectors.groupingBy(details -> details.getGradeType().get(),
								Collectors.mapping(details -> details.getGradeValue().get(), Collectors.toList())));
			} else if (CommonConstants.LOCAL_GRADE_TYPE.equals(gradeType)) {
				gradeList = manager.stream().filter(Gradedetails.GRADE_TYPE.equal(CommonConstants.LOCAL_GRADE_TYPE))
						.collect(Collectors.groupingBy(details -> details.getGradeType().get(),
								Collectors.mapping(details -> details.getGradeValue().get(), Collectors.toList())));
			}

			ObjectMapper objectMapper = new ObjectMapper();

			response = objectMapper.writeValueAsString(gradeList);
			LOGGER.info(response);

		} catch (Exception e) {

			LOGGER.error("Exception occured in getGradeDetails " + e.getMessage());
			e.printStackTrace();
			response = "Error while getting grade details, Contact Admin";

		}
		LOGGER.info("Exiting getGradeDetails ");

		return response;
	}

	@GetMapping(path = "/addGradeDetails", produces = "application/json")
	// @PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public String addGradeDetails(@RequestParam("gradeType") String gradeType,
			@RequestParam("gradeValue") String gradeValue) {
		String response = "";
		LOGGER.info("Entering addGradeDetails ");

		LOGGER.info("gradeType " + gradeType);
		LOGGER.info("gradeValue " + gradeValue);

		try {

			Optional<Gradedetails> gradeDetails = manager.stream()
					.filter(Gradedetails.GRADE_TYPE.equal(gradeType).and(Gradedetails.GRADE_VALUE.equal(gradeValue)))
					.findAny();
			if (gradeDetails.isPresent()) {
				response = "{\"response\":\"Value " + gradeValue + " already present as " + gradeType + " Grade\"}";
			} else {
				Gradedetails details = new GradedetailsImpl();
				details.setGradeType(gradeType);
				details.setGradeValue(gradeValue);
				details.setCreateTime(new Timestamp(System.currentTimeMillis()));
				manager.persist(details);
				response = "{\"response\":\"Value " + gradeValue + " added as " + gradeType + " Grade\"}";
			}

			LOGGER.info(response);

		} catch (Exception e) {

			LOGGER.error("Exception occured in addGradeDetails " + e.getMessage());
			e.printStackTrace();
			response = "Error while adding grade details, Contact Admin";

		}
		LOGGER.info("Exiting addGradeDetails ");

		return response;
	}
	
	
	@GetMapping(path = "/removeGradeDetails", produces = "application/json")
	// @PreAuthorize("hasAuthority('SCOPE_DHLReport.Read')")
	public String removeGradeDetails(@RequestParam("gradeType") String gradeType,
			@RequestParam("gradeValue") String gradeValue) {
		String response = "";
		LOGGER.info("Entering removeGradeDetails ");

		LOGGER.info("gradeType " + gradeType);
		LOGGER.info("gradeValue " + gradeValue);

		try {

			Optional<Gradedetails> gradeDetails = manager.stream()
					.filter(Gradedetails.GRADE_TYPE.equal(gradeType).and(Gradedetails.GRADE_VALUE.equal(gradeValue)))
					.findAny();
			if (gradeDetails.isPresent()) {
				manager.remove(gradeDetails.get());
				response = "{\"response\":\"Value: " + gradeValue + ", Type: "+gradeType+" removed successfully\"}";
			} else {				
				response = "{\"response\":\"No Such Value Present\"}";
			}

			LOGGER.info(response);

		} catch (Exception e) {

			LOGGER.error("Exception occured in removeGradeDetails " + e.getMessage());
			e.printStackTrace();
			response = "Error while removing grade details, Contact Admin";

		}
		LOGGER.info("Exiting removeGradeDetails ");

		return response;
	}
}