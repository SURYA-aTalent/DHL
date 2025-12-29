package com.dhl.dhltalentlinkapp.outbound.sdhexportdata;

import com.dhl.dhltalentlinkapp.outbound.dto.UpdateGidDto;
import com.dhl.dhltalentlinkapp.outbound.dto.UpdateGidResponseDto;
import com.dhl.dhltalentlinkapp.outbound.sdhexportdata.generated.GeneratedSdhexportdatadtlsController;
import com.dhl.dhltalentlinkapp.outbound.sdhexportdata.generated.GeneratedSdhexportdatadtlsController.SdhexportdatadtlsFilter;
import com.dhl.dhltalentlinkapp.outbound.sdhexportdata.generated.GeneratedSdhexportdatadtlsController.SdhexportdatadtlsSort;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;
import com.speedment.enterprise.plugins.spring.runtime.ControllerUtil;

import static java.util.stream.Collectors.toList;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.validation.Valid;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller logic
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dhl
 */
@RestController
public class SdhexportdatadtlsController extends GeneratedSdhexportdatadtlsController {
	private final static Logger LOGGER = LoggerManager.getLogger(SdhexportdatadtlsController.class);

	@PostMapping(path = "/updateGid", produces = "application/json")
	public UpdateGidResponseDto updateGid(@Valid @RequestBody UpdateGidDto updateGidDto) {
		
		LOGGER.info("Entering updateGid");

		UpdateGidResponseDto response = manager.updateCandidateGid(updateGidDto.getApplicantId(),
				updateGidDto.getGid());

		LOGGER.info("Exiting updateGid ");
		
		return response;
	}

	@GetMapping(path = "/getSDHExportDetails", produces = "text/html")
	public String get(@RequestParam(name = "filter", defaultValue = "[]") String filters,
			@RequestParam(name = "sort", defaultValue = "[]") String sorters,
			@RequestParam(value = "start", defaultValue = "0") long start,
			@RequestParam(value = "limit", defaultValue = "25") long limit) {

		sorters = "[{\"property\":\"sdhExportDataId\",\"direction\":\"DESC\"}]";
		limit = 999;
		String json = getHelper(ControllerUtil.parseFilters(filters, SdhexportdatadtlsFilter::new).collect(toList()),
				ControllerUtil.parseSorts(sorters, SdhexportdatadtlsSort::new).collect(toList()), start, limit);
		return convertToHTMLTable(json);
	}

	public static String convertToHTMLTable(String jsonResponse) {
		// System.out.println("json: "+jsonResponse);
		JSONArray jsonArray = new JSONArray(jsonResponse);

		StringBuilder htmlTable = new StringBuilder();
		htmlTable.append("<table id=\"employee-table\">");
		htmlTable.append("<thead>");
		htmlTable.append("<tr>");
		htmlTable.append("<th>First Name</th>");
		htmlTable.append("<th>Last Name</th>");
		htmlTable.append("<th>GID</th>");
		htmlTable.append("<th>Person Number</th>");
		htmlTable.append("<th>Exported Date (UTC)</th>");
		htmlTable.append("<th>Updated Date (UTC)</th>");
		htmlTable.append("</tr>");
		htmlTable.append("</thead>");
		htmlTable.append("<tbody>");

		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			htmlTable.append("<tr>");
			htmlTable.append("<td>").append(jsonObject.optString("firstName")).append("</td>");
			htmlTable.append("<td>").append(jsonObject.optString("lastName")).append("</td>");
			htmlTable.append("<td>").append(jsonObject.optString("gid")).append("</td>");
			htmlTable.append("<td>").append(jsonObject.optString("personNumber", "")).append("</td>");
			htmlTable.append("<td>").append(convertISTToUTC(jsonObject.optString("createdTime"))).append("</td>");
			htmlTable.append("<td>").append(convertISTToUTC(jsonObject.optString("updatedTime"))).append("</td>");
			// htmlTable.append("<td>").append(jsonObject.optString("offerWithdrawn","")).append("</td>");

			htmlTable.append("</tr>");
		}

		htmlTable.append("</tbody>");
		htmlTable.append("</table>");

		StringBuilder htmlBuilder = new StringBuilder();
		htmlBuilder.append("<!DOCTYPE html>");
		htmlBuilder.append("<html>");
		htmlBuilder.append("<head>");
		htmlBuilder.append("<meta charset=\"UTF-8\">");
		htmlBuilder.append("<title>Candidate Details</title>");
		htmlBuilder.append(
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.11.4/css/jquery.dataTables.css\">");
		htmlBuilder.append(
				"<style>table {border-collapse: collapse; width: 100%;border: 1px solid black;}th {background-color: #f2f2f2;border: 1px solid black;padding: 8px;text-align: left;}td {border: 1px solid black;padding: 8px;text-align: left;}.table-title {font-weight: bold;font-size: 18px;margin-bottom: 10px;}</style>");
		htmlBuilder.append("</head>");
		htmlBuilder.append("<body>");
		htmlBuilder.append("<div class=\"table-title\"><center>Candidate Information Exported to SDH</center></div>");
		htmlBuilder.append(htmlTable);
		htmlBuilder.append("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>");
		htmlBuilder.append("<script src=\"https://cdn.datatables.net/1.11.4/js/jquery.dataTables.js\"></script>");
		htmlBuilder.append("<script>");
		htmlBuilder.append("$(document).ready(function() {");
		htmlBuilder.append("var table = $('#employee-table').DataTable({\n" + " \"order\": []" + "  });");
		htmlBuilder.append("});");
		htmlBuilder.append("</script>");
		htmlBuilder.append("</body>");
		htmlBuilder.append("</html>");

		return htmlBuilder.toString();
	}
	
	public static String convertISTToUTC(String istDateTimeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S");

        try {
            LocalDateTime istDateTime = LocalDateTime.parse(istDateTimeString, formatter);

            // Set IST Zone ID
            ZoneId istZoneId = ZoneId.of("Asia/Kolkata");
            // Set UTC Zone ID
            ZoneId utcZoneId = ZoneId.of("UTC");

            // Convert to IST ZonedDateTime
            ZonedDateTime istZonedDateTime = ZonedDateTime.of(istDateTime, istZoneId);
            // Convert to UTC ZonedDateTime
            ZonedDateTime utcZonedDateTime = istZonedDateTime.withZoneSameInstant(utcZoneId);

            return formatter.format(utcZonedDateTime);
        } catch (Exception e) {
            // In case of any error (e.g., invalid input format), return the same input
            return istDateTimeString;
        }
    }

}