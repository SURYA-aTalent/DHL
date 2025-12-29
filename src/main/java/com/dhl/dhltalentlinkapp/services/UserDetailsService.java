package com.dhl.dhltalentlinkapp.services;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.dhl.dhltalentlinkapp.constants.CommonConstants;
import com.dhl.dhltalentlinkapp.dao.ManagerDetails;
import com.mrted.ws.user.DayOfWeek;
import com.mrted.ws.user.LangCode;
import com.mrted.ws.user.RecruitmentRole;
import com.mrted.ws.user.RequestByGetUsersDto;
import com.mrted.ws.user.UserDto;
import com.mrted.ws.user.UserExtDto;
import com.mrted.ws.user.UserStatus;
import com.mrted.ws.user.UserWebService;
import com.mrted.ws.user.UserWebService_Service;
import com.speedment.common.logger.Logger;
import com.speedment.common.logger.LoggerManager;

public class UserDetailsService {

	private final static Logger LOGGER = LoggerManager.getLogger(UserDetailsService.class);

	private UserWebService_Service userWebService = null;
	private UserWebService userService = null;
	private BindingProvider bindingProvider = null;
	private CloseableHttpClient httpclient = null;
	private String username = "DHL:bo_bundle_oracleint:BO";
	private String password = "oracleint1";

	String api_key = "686170a1-b10c-b79d-ae8c-9b9992c65ecb";

	String url = "https://apiproxy.shared.lumessetalentlink.com/tlk/rest/user/%userId%/userData?api_key=" + api_key;

	public UserDetailsService() {

		userWebService = new UserWebService_Service();
		userService = userWebService.getUserWebServicePort();

		bindingProvider = (BindingProvider) userService;
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://api3.lumesse-talenthub.com/User/SOAP/User?api_key=686170a1-b10c-b79d-ae8c-9b9992c65ecb");

		httpclient = HttpClients.createDefault();

	}

	public UserWebService getUserService() {
		return userService;
	}

	public void setUserService(UserWebService userService) {
		this.userService = userService;
	}

	public void addUser() {
		Holder<UserExtDto> user = new Holder<UserExtDto>();
		UserExtDto userExtDto = new UserExtDto();
		user.value = userExtDto;
		user.value.setFirstName("李柳静");
		user.value.setLastName("2870048");
		user.value.setEmail("mathan.kumar@atalent.com");
		user.value.setLogin("LILJ1");
		user.value.setLanguage(LangCode.CN);
		user.value.setTimeFormat("yyyy-mm-dd; hh:mm");
		user.value.setTimeZone("Asia/Singapore");
		user.value.setType("ADVANCED");
		user.value.setPassword("12345678");
		userService.createUser(user, "ACTIVATEUSERNOWWITHOUTSENDINGEMAILNOTIFICATION");

	}

	public static void main(String args[]) {

		UserDetailsService configService = new UserDetailsService();
//		Map<Long,String> myMap=new HashMap<Long,String>();

		

	}

	public void getUserDetails(Long id) {

		LOGGER.info("### - Entering getUserDetails method ###");

		UserDto userDto = userService.getUserById(id);

		LOGGER.info(userDto.getFirstName());
		LOGGER.info(userDto.getLastName());
		LOGGER.info(userDto.getEmail());

		LOGGER.info("### - Exiting getUserDetails method ###");

	}

	public String addNewUser(ManagerDetails detail) {
		String response = "Success";
		try {
			Holder<UserExtDto> user = new Holder<UserExtDto>();
			UserExtDto userExtDto = new UserExtDto();
			user.value = userExtDto;
			user.value.setFirstName(detail.getFirstName());
			user.value.setLastName(detail.getLastName());
			user.value.setEmail(detail.getEmail());
			user.value.setLogin(detail.getEmail().toLowerCase());
			user.value.setLanguage(LangCode.UK);
			user.value.setTimeFormat(CommonConstants.DEFAULT_TIME_FORMAT);
			user.value.setTimeZone(detail.getTimezone());
			user.value.setActive(true);
			user.value.setType(CommonConstants.USER_TYPE_MSS);
			detail.setPassword(RandomStringUtils.randomAlphanumeric(10));
			user.value.setPassword(detail.getPassword());
			userService.createUser(user, CommonConstants.ACTIVATE_NO_NOTIFICATION);// "ACTIVATEUSERNOWANDSENDEMAILNOTIFICATION");

			LOGGER.info("User Created: FIRSTNAME: " + detail.getFirstName() + ", LASTNAME: " + detail.getLastName()
					+ ", email: " + detail.getEmail() + ", Lang: EN ,Passw: " + detail.getPassword());

			UserDto userDto = getUserDetailsByLoginAndEmail(detail.getEmail().toLowerCase(), true, false);
			long userId = (userDto != null) ? userDto.getId() : 0;
			LOGGER.info("userId obtained: " + userId);
			detail.setUserId(userId);
			detail.setSource(CommonConstants.SOURCE_MYHR);
			detail.setEmailAsLoginFlag(true);
			response = response + "," + userId;

		} catch (Exception e) {
			LOGGER.error("Exception occured in addNewUser: " + detail.getFirstName() + ", message: " + e.getMessage());
			e.printStackTrace();
			try {
				if (e.getMessage().contains(CommonConstants.LOGIN_ALREADY_EXISTS_MSG)) {
					UserDto userDto = getUserDetailsByLoginAndEmail(detail.getEmail().toLowerCase(), true, false);
					long userId = (userDto != null) ? userDto.getId() : 0;

					if (!userDto.getEmail().equalsIgnoreCase(userDto.getLogin())) {
						detail.setEmailAsLoginFlag(false);
						detail.setLoginValue(userDto.getLogin());
					} else
						detail.setEmailAsLoginFlag(true);

					// updateUser(userId, detail.getEmail(), detail.getFirstName(),
					// detail.getLastName(),
					// detail.getTimezone(), detail.getEmailAsLoginFlag(),
					// detail.getLoginValue(),userDto.getType());
					detail.setUserType(userDto.getType());
					detail.setUserId(userId);
					detail.setSource(CommonConstants.SOURCE_TALENTLINK);
					detail.setPassword(null);
					response = response + "," + userId;
				} else if (e.getMessage().contains(CommonConstants.EMAIL_ALREADY_EXISTS_MSG)) {
					UserDto userDto = getUserDetailsByLoginAndEmail(detail.getEmail().toLowerCase(), false, true);
					long userId = (userDto != null) ? userDto.getId() : 0;

					if (!userDto.getEmail().equalsIgnoreCase(userDto.getLogin())) {
						detail.setEmailAsLoginFlag(false);
						detail.setLoginValue(userDto.getLogin());
					} else
						detail.setEmailAsLoginFlag(true);

					// updateUser(userId, detail.getEmail(), detail.getFirstName(),
					// detail.getLastName(),
					// detail.getTimezone(), detail.getEmailAsLoginFlag(),
					// detail.getLoginValue(),userDto.getType());

					detail.setUserType(userDto.getType());
					detail.setUserId(userId);
					detail.setSource(CommonConstants.SOURCE_TALENTLINK);
					detail.setPassword(null);
					response = response + "," + userId;
				} else {
					response = e.getMessage();
					throw e;
				}
			} catch (Exception e1) {
				LOGGER.error("Exception occured in addNewUser Update call " + e1.getMessage());
				e1.printStackTrace();
				response = e.getMessage();
				throw e;
			}

		}
		return response;

	}

	public UserDto getUserDetailsByLoginAndEmail(String email, boolean loginFlag, boolean emailFlag) {
		RequestByGetUsersDto requestByGetUsersDto = new RequestByGetUsersDto();
		requestByGetUsersDto.setUserStatus(UserStatus.ALL);
		if (loginFlag)
			requestByGetUsersDto.setLogin(email.toLowerCase());

		if (emailFlag)
			requestByGetUsersDto.setEmail(email);

		List<UserDto> userList = userService.getUsers(requestByGetUsersDto);

		for (UserDto dto : userList) {
			if (loginFlag) {
				if (dto.getLogin().equals(email.toLowerCase())) {
					LOGGER.info("Details in TLK: firstname: " + dto.getFirstName() + ", lastname: " + dto.getLastName()
							+ ", email: " + dto.getEmail() + ", login: " + dto.getLogin());
					return dto;
				}
			} else if (emailFlag) {
				if (dto.getEmail().equalsIgnoreCase(email)) {
					LOGGER.info("Details in TLK: firstname: " + dto.getFirstName() + ", lastname: " + dto.getLastName()
							+ ", email: " + dto.getEmail() + ", login: " + dto.getLogin());
					return dto;
				}
			}

		}
		if (userList != null && userList.size() > 0) {
			LOGGER.info("userList in TLK size: " + userList.size());
			LOGGER.info("Details in TLK: firstname: " + userList.get(0).getFirstName() + ", lastname: "
					+ userList.get(0).getLastName() + ", email: " + userList.get(0).getEmail() + ", login: "
					+ userList.get(0).getLogin());
			return userList.get(0);
		} else
			return null;
	}

	/*
	 * public static void doPut() throws IOException, InterruptedException { String
	 * username = "DHL Sandbox:bo_bundle_oracleint:BO"; String password =
	 * "oracleint1";
	 * 
	 * String api_key = "686170a1-b10c-b79d-ae8c-9b9992c65ecb";
	 * 
	 * String url =
	 * "https://apiproxy.shared.lumessetalentlink.com/tlk/rest/user/2898/userData?api_key="
	 * + api_key;
	 * 
	 * String data = "{" + "    \"userId\": \"2898\"," + // "    \"lovs\": [" + //
	 * "        {" + // "            \"nameLovId\": \"38758\"," + //
	 * "            \"valueLovId\": \"38758\"" + // "        }" + // "    ]," +
	 * "    \"fffs\": [" + "        {" + "            \"lovId\": \"38758\"," +
	 * "            \"value\": \"334\"" + "        }" + "    ]" + "}";
	 * 
	 * HttpClient client = HttpClient.newHttpClient(); HttpRequest request =
	 * HttpRequest.newBuilder().uri(URI.create(url)) .setHeader("Content-Type",
	 * "application/json").setHeader("username", username) .setHeader("password",
	 * password).PUT(HttpRequest.BodyPublishers.ofString(data)).build();
	 * 
	 * HttpResponse response = client.send(request,
	 * HttpResponse.BodyHandlers.ofString());
	 * 
	 * System.out.println(response.statusCode());
	 * System.out.println(response.body()); System.out.println(response.toString());
	 * }
	 */

	public void updateGid(String userId, String gidValue) {

		try {

			HttpPut httpPut = new HttpPut(url.replace("%userId%", userId));
			httpPut.setHeader("username", username);
			httpPut.setHeader("password", password);
			httpPut.setHeader("Content-type", "application/json");

			LOGGER.info("update user data Gid value: " + userId + ", gidValue: " + gidValue);

			String json = "{" + "\"userId\": \"" + userId + "\"," + "\"fffs\": [" + "{" + "\"lovId\": \""
					+ CommonConstants.GID_USER_DATA_ID + "\"," + "\"value\": \"" + gidValue + "\"" + "}" + "]" + "}";

			System.out.println(json);
			StringEntity stringEntity = new StringEntity(json);
			httpPut.setEntity(stringEntity);

			LOGGER.info("Executing request " + httpPut.getRequestLine());

			// Create a custom response handler
			ResponseHandler<String> responseHandler = response -> {
				int status = response.getStatusLine().getStatusCode();

				LOGGER.info("response status " + status);
				LOGGER.info("response status " + status);
				if (status >= 200 && status < 300) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity) : null;
				} else {
					Header[] headers = response.getAllHeaders();

					// Iterate over the headers and print their names and values
					for (Header header : headers) {
						System.out.println(header.getName() + ": " + header.getValue());
					}
					throw new ClientProtocolException("Unexpected response status: " + status);
				}
			};
			String responseBody = httpclient.execute(httpPut, responseHandler);
			LOGGER.info("----------------------------------------");
			LOGGER.info(responseBody);
		} catch (Exception e) {
			LOGGER.error("Exception occured in updateUserData " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void updateBusinessTitle(String userId, String businessTitle) {

		try {
			LOGGER.info("update user data businessTitle value: " + userId + ", businessTitle: " + businessTitle);

			HttpPut httpPut = new HttpPut(url.replace("%userId%", userId));
			httpPut.setHeader("username", username);
			httpPut.setHeader("password", password);
			httpPut.setHeader("Content-type", "application/json");

			String json = "{" + "\"userId\": \"" + userId + "\"," + "\"fffs\": [" + "{" + "\"lovId\": \""
					+ CommonConstants.BUSINESS_TITLE_USER_DATA_ID + "\"," + "\"value\": \"" + businessTitle + "\"" + "}"
					+ "]" + "}";

			StringEntity stringEntity = new StringEntity(json);
			httpPut.setEntity(stringEntity);

			LOGGER.info("Executing request " + httpPut.getRequestLine());

			// Create a custom response handler
			ResponseHandler<String> responseHandler = response -> {
				int status = response.getStatusLine().getStatusCode();
				LOGGER.info("response status " + status);
				if (status >= 200 && status < 300) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity) : null;
				} else {
					throw new ClientProtocolException("Unexpected response status: " + status);
				}
			};
			String responseBody = httpclient.execute(httpPut, responseHandler);
			LOGGER.info("----------------------------------------");
			LOGGER.info(responseBody);
		} catch (Exception e) {
			LOGGER.error("Exception occured in updateUserData businessTitle" + e.getMessage());
			e.printStackTrace();
		}
	}

	public void updateUserCountry(String userId, String userCountry) {

		try {
			LOGGER.info("update user data userCountry value: " + userId + ", userCountry: " + userCountry);

			HttpPut httpPut = new HttpPut(url.replace("%userId%", userId));
			httpPut.setHeader("username", username);
			httpPut.setHeader("password", password);
			httpPut.setHeader("Content-type", "application/json");

			String json = "{" + "\"userId\": \"" + userId + "\"," + "\"fffs\": [" + "{" + "\"lovId\": \""
					+ CommonConstants.USER_COUNTRY_USER_DATA_ID + "\"," + "\"value\": \"" + userCountry + "\"" + "}"
					+ "]" + "}";

			StringEntity stringEntity = new StringEntity(json);
			httpPut.setEntity(stringEntity);

			LOGGER.info("Executing request " + httpPut.getRequestLine());

			// Create a custom response handler
			ResponseHandler<String> responseHandler = response -> {
				int status = response.getStatusLine().getStatusCode();
				LOGGER.info("response status " + status);
				if (status >= 200 && status < 300) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity) : null;
				} else {
					throw new ClientProtocolException("Unexpected response status: " + status);
				}
			};
			String responseBody = httpclient.execute(httpPut, responseHandler);
			LOGGER.info("----------------------------------------");
			LOGGER.info(responseBody);
		} catch (Exception e) {
			LOGGER.error("Exception occured in updateUserData userCountry" + e.getMessage());
			e.printStackTrace();
		}
	}

	public UserDto getUserDetailsById(Long userId) {
		UserDto userDto = userService.getUserById(userId);
		return userDto;
	}

	public void updateUser(Long userId, String emailId, String firstname, String lastname, String timezone,
			boolean loginUpdateFlag, String loginValue, String userType) {

		try {
			UserExtDto user = new UserExtDto();
			user.setEmail(emailId);
			user.setFirstName(firstname);
			user.setId(userId);
			user.setLastName(lastname);
			if (loginUpdateFlag)
				user.setLogin(emailId);
			else
				user.setLogin(loginValue);

			user.setType(userType);
			// user.setCellphone(userDto.getCellphone());
			user.setActive(true);
			// user.setDateFormat("dd/MM/yyyy");
			user.setFirstDayOfWeek(DayOfWeek.MONDAY);
			user.setLanguage(LangCode.UK);
			// user.setTimeFormat("HH:mm");
			user.setTimeZone(timezone);
			// user.setRecruitmentRole(RecruitmentRole.HR_ADMINISTRATOR_OR_HR_GENERALIST);
			userService.updateUser(user);
			LOGGER.info("Successfully Updated user: " + userId + ", email: " + emailId + ", firstname: " + firstname);
		} catch (Exception e) {
			LOGGER.error("Exception occured while updating user " + userId + " .." + e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	public void deleteUser(Long userId, String emailId, String firstname, String lastname, String timezone,
			String userType) {

		try {
			UserExtDto user = new UserExtDto();
			user.setEmail(emailId);
			user.setFirstName(firstname);
			user.setId(userId);
			user.setLastName(lastname);
			user.setLogin(emailId);
			user.setType(userType);
			// user.setCellphone(userDto.getCellphone());
			user.setActive(false);
			// user.setDateFormat("dd/MM/yyyy");
			user.setFirstDayOfWeek(DayOfWeek.MONDAY);
			user.setLanguage(LangCode.UK);
			// user.setTimeFormat("HH:mm");
			user.setTimeZone(timezone);
			// user.setRecruitmentRole(RecruitmentRole.HR_ADMINISTRATOR_OR_HR_GENERALIST);

			userService.updateUser(user);
		} catch (Exception e) {
			LOGGER.info("Exception occured while updating user " + userId + ", as inactive.." + e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	/*public void deletePermanently(Long id, String login) {
		try {
			userService.deleteUser(id, login);
		} catch (Exception e) {
			LOGGER.info("Exception occured while Permanently deleting user " + id + e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}*/

	public void deleteUser(String emailId, String timezone) {

		try {

			RequestByGetUsersDto requestByGetUsersDto = new RequestByGetUsersDto();
			requestByGetUsersDto.setUserStatus(UserStatus.ALL);
			requestByGetUsersDto.setEmail(emailId);
			List<UserDto> userList = userService.getUsers(requestByGetUsersDto);
			UserDto userTobeDeleted = null;
			for (UserDto dto : userList) {
				if (dto.getEmail().equalsIgnoreCase(emailId)) {
					userTobeDeleted = dto;
					break;
				}
			}
			if (userList != null && userList.size() > 0)
				userTobeDeleted = userList.get(0);

			if (userTobeDeleted != null) {
				UserExtDto user = new UserExtDto();
				user.setEmail(userTobeDeleted.getEmail());
				user.setFirstName(userTobeDeleted.getFirstName());
				user.setId(userTobeDeleted.getId());
				user.setLastName(userTobeDeleted.getLastName());
				user.setLogin(userTobeDeleted.getLogin());
				user.setType(CommonConstants.USER_TYPE_MSS);
				// user.setCellphone(userDto.getCellphone());
				user.setActive(false);
				// user.setDateFormat("dd/MM/yyyy");
				user.setFirstDayOfWeek(DayOfWeek.MONDAY);
				user.setLanguage(LangCode.UK);
				// user.setTimeFormat("HH:mm");
				user.setTimeZone(timezone);
				// user.setRecruitmentRole(RecruitmentRole.HR_ADMINISTRATOR_OR_HR_GENERALIST);
				userService.updateUser(user);
				LOGGER.info("Successfully updated the user as inactive ");

			}
		} catch (Exception e) {
			LOGGER.info("Exception occured while updating user as inactive.." + e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	public void assignRolesToBeDeleted(Long userId, String roleName, String departmentId) {
		LOGGER.info("Entering assignRoles..");
		try {
			List<String> roles = new ArrayList<String>(Arrays.asList(roleName.split(",")));
			if (departmentId != null) {
				List<String> deptIds = new ArrayList<String>(Arrays.asList(departmentId.split(",")));

				for (String deptId : deptIds) {
					userService.assignRoles(userId, null, null, null, roles,
							Long.parseLong(deptId.trim().replace(".0", "")));
				}
			} else {
				userService.assignRoles(userId, null, null, null, roles, null);
			}
		} catch (Exception e) {
			LOGGER.error("Exception occured in assignRoles..." + e.getMessage());
			e.printStackTrace();
		}
		LOGGER.info("Exiting assignRoles..");
		// roles.add(roleName);

	}

	public void deleteRolesToBeDeleted(Long userId, String roleName, String departmentId) {
		LOGGER.info("Entering deleteRoles..");
		try {
			List<String> roles = new ArrayList<String>(Arrays.asList(roleName.split(",")));
			if (departmentId != null) {
				List<String> deptIds = new ArrayList<String>(Arrays.asList(departmentId.split(",")));
				for (String deptId : deptIds) {
					userService.deleteRoles(userId, null, null, null, roles, Long.parseLong(deptId.replace(".0", "")));
				}
			} else {
				userService.deleteRoles(userId, null, null, null, roles, null);
			}

		} catch (Exception e) {
			System.out.println("Exception in deleteRoles " + e.getMessage());

		}
		LOGGER.info("Exiting deleteRoles..");
	}

	public void updateApplicationStatus(String applicationId, String applicationStatus) {

		try {
			LOGGER.info(
					"Entering updateApplicationStatus: " + applicationId + ", applicationStatus: " + applicationStatus);
			String url1 = "https://apiproxy.shared.lumessetalentlink.com/tlk/rest/application/status?api_key="
					+ api_key;
			HttpPut httpPut = new HttpPut(url1);
			httpPut.setHeader("username", username);
			httpPut.setHeader("password", password);
			httpPut.setHeader("Content-type", "application/json");

			String json = "{\n" + "  \"newStatuses\": [\n" + "    {\n" + "      \"applicationId\": \"" + applicationId
					+ "\",\n" + "      \"targetStatus\": \"" + applicationStatus + "\",\n"
					+ "      \"reasonOfChange\": \"\",\n" + "      \"reasonOfCompletion\": \"\",\n"
					+ "      \"memo\": \"\",\n" + "      \"sendCancellationToCandidate\": false,\n"
					+ "      \"offerAccepted\": false\n" + "    }\n" + "  ]\n" + "}";

			StringEntity stringEntity = new StringEntity(json);
			httpPut.setEntity(stringEntity);

			LOGGER.info("Executing request " + httpPut.getRequestLine());

			// Create a custom response handler
			ResponseHandler<String> responseHandler = response -> {
				int status = response.getStatusLine().getStatusCode();
				LOGGER.info("response status " + status);
				if (status >= 200 && status < 300) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity) : null;
				} else {
					throw new ClientProtocolException("Unexpected response status: " + status);
				}
			};
			String responseBody = httpclient.execute(httpPut, responseHandler);
			LOGGER.info("----------------------------------------");
			LOGGER.info(responseBody);
			LOGGER.info(
					"Exiting updateApplicationStatus: " + applicationId + ", applicationStatus: " + applicationStatus);
		} catch (Exception e) {
			LOGGER.error("Exception occured in updateApplicationStatus " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void updateCandidateGidInTLK(String candidateId, String gidValue) {

		try {
			LOGGER.info("Entering updateCandidateGid for candidate: " + candidateId + ", GID: " + gidValue);
			String url1 = "https://apiproxy.shared.lumessetalentlink.com/tlk/rest/candidate/" + candidateId
					+ "/summary?api_key=" + api_key;
			HttpPut httpPut = new HttpPut(url1);
			httpPut.setHeader("username", username);
			httpPut.setHeader("password", password);
			httpPut.setHeader("Content-type", "application/json");

			String json = "{\n" + "  \"questionsAnswered\": [\n" + "    {\n" + "      \"assignedQuestionId\": 46,\n"
					+ "      \"questionId\":165,\n" + "      \"answerValue\": \"" + gidValue + "\"    \n" + "      \n"
					+ "    }\n" + "  ]\n" + "}";

			StringEntity stringEntity = new StringEntity(json);
			httpPut.setEntity(stringEntity);

			LOGGER.info("Executing request " + httpPut.getRequestLine());

			// Create a custom response handler
			ResponseHandler<String> responseHandler = response -> {
				int status = response.getStatusLine().getStatusCode();
				LOGGER.info("response status " + status);
				if (status >= 200 && status < 300) {
					HttpEntity entity = response.getEntity();
					return entity != null ? EntityUtils.toString(entity) : null;
				} else {
					throw new ClientProtocolException("Unexpected response status: " + status);
				}
			};
			String responseBody = httpclient.execute(httpPut, responseHandler);
			LOGGER.info("----------------------------------------");
			LOGGER.info(responseBody);
			LOGGER.info("Entering updateCandidateGid for candidate: " + candidateId + ", GID: " + gidValue);
		} catch (Exception e) {
			LOGGER.error("Exception occured in updateCandidateGid " + e.getMessage());
			e.printStackTrace();
		}
	}

}
