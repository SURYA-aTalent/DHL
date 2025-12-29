
package com.mrted.ws.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mrted.ws.user package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserExtByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getUserExtByIdResponse");
    private final static QName _RoleAssignment_QNAME = new QName("http://ws.mrted.com/", "roleAssignment");
    private final static QName _RemoveRoleAssignment_QNAME = new QName("http://ws.mrted.com/", "removeRoleAssignment");
    private final static QName _TagType_QNAME = new QName("http://ws.mrted.com/", "tagType");
    private final static QName _GetRightsWithLabels_QNAME = new QName("http://ws.mrted.com/", "getRightsWithLabels");
    private final static QName _GetTaggedUsersResponse_QNAME = new QName("http://ws.mrted.com/", "getTaggedUsersResponse");
    private final static QName _GetTagsForTypeResponse_QNAME = new QName("http://ws.mrted.com/", "getTagsForTypeResponse");
    private final static QName _GetTagsForType_QNAME = new QName("http://ws.mrted.com/", "getTagsForType");
    private final static QName _AssignRolesWithTag_QNAME = new QName("http://ws.mrted.com/", "assignRolesWithTag");
    private final static QName _GetGrantedPools_QNAME = new QName("http://ws.mrted.com/", "getGrantedPools");
    private final static QName _GetTagTypes_QNAME = new QName("http://ws.mrted.com/", "getTagTypes");
    private final static QName _ConfigureUserResponse_QNAME = new QName("http://ws.mrted.com/", "configureUserResponse");
    private final static QName _RemoveRolesWithTag_QNAME = new QName("http://ws.mrted.com/", "removeRolesWithTag");
    private final static QName _GetTagTypesResponse_QNAME = new QName("http://ws.mrted.com/", "getTagTypesResponse");
    private final static QName _UpdatePasswordRulesResponse_QNAME = new QName("http://ws.mrted.com/", "updatePasswordRulesResponse");
    private final static QName _GetRolesAssignedForUser_QNAME = new QName("http://ws.mrted.com/", "getRolesAssignedForUser");
    private final static QName _GetUserById_QNAME = new QName("http://ws.mrted.com/", "getUserById");
    private final static QName _Role_QNAME = new QName("http://ws.mrted.com/", "role");
    private final static QName _AssignRoles_QNAME = new QName("http://ws.mrted.com/", "assignRoles");
    private final static QName _ChangePasswordResponse_QNAME = new QName("http://ws.mrted.com/", "changePasswordResponse");
    private final static QName _UpdatePasswordRules_QNAME = new QName("http://ws.mrted.com/", "updatePasswordRules");
    private final static QName _DeactivateUser_QNAME = new QName("http://ws.mrted.com/", "deactivateUser");
    private final static QName _GetUsersResponse_QNAME = new QName("http://ws.mrted.com/", "getUsersResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://ws.mrted.com/", "deleteUserResponse");
    private final static QName _AssignRolesResponse_QNAME = new QName("http://ws.mrted.com/", "assignRolesResponse");
    private final static QName _User_QNAME = new QName("http://ws.mrted.com/", "user");
    private final static QName _GetUserData_QNAME = new QName("http://ws.mrted.com/", "getUserData");
    private final static QName _CreateUser_QNAME = new QName("http://ws.mrted.com/", "createUser");
    private final static QName _ClearAllRoleAssignmentsResponse_QNAME = new QName("http://ws.mrted.com/", "clearAllRoleAssignmentsResponse");
    private final static QName _Organization_QNAME = new QName("http://ws.mrted.com/", "organization");
    private final static QName _ActivateUserResponse_QNAME = new QName("http://ws.mrted.com/", "activateUserResponse");
    private final static QName _GetGrantedPoolsResponse_QNAME = new QName("http://ws.mrted.com/", "getGrantedPoolsResponse");
    private final static QName _GetPasswordRules_QNAME = new QName("http://ws.mrted.com/", "getPasswordRules");
    private final static QName _ChangePassword_QNAME = new QName("http://ws.mrted.com/", "changePassword");
    private final static QName _RemoveTagResponse_QNAME = new QName("http://ws.mrted.com/", "removeTagResponse");
    private final static QName _UserExt_QNAME = new QName("http://ws.mrted.com/", "userExt");
    private final static QName _UpdateUser_QNAME = new QName("http://ws.mrted.com/", "updateUser");
    private final static QName _GetUserDataResponse_QNAME = new QName("http://ws.mrted.com/", "getUserDataResponse");
    private final static QName _GetUserExtById_QNAME = new QName("http://ws.mrted.com/", "getUserExtById");
    private final static QName _CreateUserResponse_QNAME = new QName("http://ws.mrted.com/", "createUserResponse");
    private final static QName _ClearAllRoleAssignments_QNAME = new QName("http://ws.mrted.com/", "clearAllRoleAssignments");
    private final static QName _GetInactiveUsersResponse_QNAME = new QName("http://ws.mrted.com/", "getInactiveUsersResponse");
    private final static QName _DeactivateUserResponse_QNAME = new QName("http://ws.mrted.com/", "deactivateUserResponse");
    private final static QName _GetRightsForDepartmentAndCurrentUserResponse_QNAME = new QName("http://ws.mrted.com/", "getRightsForDepartmentAndCurrentUserResponse");
    private final static QName _GeneratePassword_QNAME = new QName("http://ws.mrted.com/", "generatePassword");
    private final static QName _GetCurrentUserExt_QNAME = new QName("http://ws.mrted.com/", "getCurrentUserExt");
    private final static QName _GetInactiveUsers_QNAME = new QName("http://ws.mrted.com/", "getInactiveUsers");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://ws.mrted.com/", "updateUserResponse");
    private final static QName _UserDataSoap_QNAME = new QName("http://ws.mrted.com/", "userDataSoap");
    private final static QName _Tag_QNAME = new QName("http://ws.mrted.com/", "tag");
    private final static QName _AssignRole_QNAME = new QName("http://ws.mrted.com/", "assignRole");
    private final static QName _GetRightsForDepartmentAndCurrentUser_QNAME = new QName("http://ws.mrted.com/", "getRightsForDepartmentAndCurrentUser");
    private final static QName _RemoveTag_QNAME = new QName("http://ws.mrted.com/", "removeTag");
    private final static QName _GetUsers_QNAME = new QName("http://ws.mrted.com/", "getUsers");
    private final static QName _GetRightsWithLabelsResponse_QNAME = new QName("http://ws.mrted.com/", "getRightsWithLabelsResponse");
    private final static QName _ActivateUser_QNAME = new QName("http://ws.mrted.com/", "activateUser");
    private final static QName _AssignRolesWithTagResponse_QNAME = new QName("http://ws.mrted.com/", "assignRolesWithTagResponse");
    private final static QName _AddTagResponse_QNAME = new QName("http://ws.mrted.com/", "addTagResponse");
    private final static QName _AddTag_QNAME = new QName("http://ws.mrted.com/", "addTag");
    private final static QName _ConfigureUser_QNAME = new QName("http://ws.mrted.com/", "configureUser");
    private final static QName _GetTaggedUsers_QNAME = new QName("http://ws.mrted.com/", "getTaggedUsers");
    private final static QName _RemoveRoleAssignmentResponse_QNAME = new QName("http://ws.mrted.com/", "removeRoleAssignmentResponse");
    private final static QName _GenerateTemporaryPassword_QNAME = new QName("http://ws.mrted.com/", "generateTemporaryPassword");
    private final static QName _GetCurrentUserExtResponse_QNAME = new QName("http://ws.mrted.com/", "getCurrentUserExtResponse");
    private final static QName _GetUserByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getUserByIdResponse");
    private final static QName _GenerateTemporaryPasswordResponse_QNAME = new QName("http://ws.mrted.com/", "generateTemporaryPasswordResponse");
    private final static QName _UserConfig_QNAME = new QName("http://ws.mrted.com/", "userConfig");
    private final static QName _RemoveFederationDataResponse_QNAME = new QName("http://ws.mrted.com/", "removeFederationDataResponse");
    private final static QName _DeleteRoles_QNAME = new QName("http://ws.mrted.com/", "deleteRoles");
    private final static QName _DeleteUser_QNAME = new QName("http://ws.mrted.com/", "deleteUser");
    private final static QName _RemoveFederationData_QNAME = new QName("http://ws.mrted.com/", "removeFederationData");
    private final static QName _GetPasswordRulesResponse_QNAME = new QName("http://ws.mrted.com/", "getPasswordRulesResponse");
    private final static QName _DeleteRolesResponse_QNAME = new QName("http://ws.mrted.com/", "deleteRolesResponse");
    private final static QName _RemoveRolesWithTagResponse_QNAME = new QName("http://ws.mrted.com/", "removeRolesWithTagResponse");
    private final static QName _AssignRoleResponse_QNAME = new QName("http://ws.mrted.com/", "assignRoleResponse");
    private final static QName _GeneratePasswordResponse_QNAME = new QName("http://ws.mrted.com/", "generatePasswordResponse");
    private final static QName _GetRolesAssignedForUserResponse_QNAME = new QName("http://ws.mrted.com/", "getRolesAssignedForUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mrted.ws.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoleDto }
     * 
     */
    public RoleDto createRoleDto() {
        return new RoleDto();
    }

    /**
     * Create an instance of {@link GenerateTemporaryPasswordResponse }
     * 
     */
    public GenerateTemporaryPasswordResponse createGenerateTemporaryPasswordResponse() {
        return new GenerateTemporaryPasswordResponse();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link GenerateTemporaryPassword }
     * 
     */
    public GenerateTemporaryPassword createGenerateTemporaryPassword() {
        return new GenerateTemporaryPassword();
    }

    /**
     * Create an instance of {@link GetCurrentUserExtResponse }
     * 
     */
    public GetCurrentUserExtResponse createGetCurrentUserExtResponse() {
        return new GetCurrentUserExtResponse();
    }

    /**
     * Create an instance of {@link RemoveRoleAssignmentResponse }
     * 
     */
    public RemoveRoleAssignmentResponse createRemoveRoleAssignmentResponse() {
        return new RemoveRoleAssignmentResponse();
    }

    /**
     * Create an instance of {@link AddTag }
     * 
     */
    public AddTag createAddTag() {
        return new AddTag();
    }

    /**
     * Create an instance of {@link ConfigureUser }
     * 
     */
    public ConfigureUser createConfigureUser() {
        return new ConfigureUser();
    }

    /**
     * Create an instance of {@link GetTaggedUsers }
     * 
     */
    public GetTaggedUsers createGetTaggedUsers() {
        return new GetTaggedUsers();
    }

    /**
     * Create an instance of {@link AddTagResponse }
     * 
     */
    public AddTagResponse createAddTagResponse() {
        return new AddTagResponse();
    }

    /**
     * Create an instance of {@link AssignRolesWithTagResponse }
     * 
     */
    public AssignRolesWithTagResponse createAssignRolesWithTagResponse() {
        return new AssignRolesWithTagResponse();
    }

    /**
     * Create an instance of {@link ActivateUser }
     * 
     */
    public ActivateUser createActivateUser() {
        return new ActivateUser();
    }

    /**
     * Create an instance of {@link GetRightsWithLabelsResponse }
     * 
     */
    public GetRightsWithLabelsResponse createGetRightsWithLabelsResponse() {
        return new GetRightsWithLabelsResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link RemoveTag }
     * 
     */
    public RemoveTag createRemoveTag() {
        return new RemoveTag();
    }

    /**
     * Create an instance of {@link AssignRole }
     * 
     */
    public AssignRole createAssignRole() {
        return new AssignRole();
    }

    /**
     * Create an instance of {@link GetRightsForDepartmentAndCurrentUser }
     * 
     */
    public GetRightsForDepartmentAndCurrentUser createGetRightsForDepartmentAndCurrentUser() {
        return new GetRightsForDepartmentAndCurrentUser();
    }

    /**
     * Create an instance of {@link Tag }
     * 
     */
    public Tag createTag() {
        return new Tag();
    }

    /**
     * Create an instance of {@link GetInactiveUsers }
     * 
     */
    public GetInactiveUsers createGetInactiveUsers() {
        return new GetInactiveUsers();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link UserDataSoapDto }
     * 
     */
    public UserDataSoapDto createUserDataSoapDto() {
        return new UserDataSoapDto();
    }

    /**
     * Create an instance of {@link GeneratePassword }
     * 
     */
    public GeneratePassword createGeneratePassword() {
        return new GeneratePassword();
    }

    /**
     * Create an instance of {@link GetCurrentUserExt }
     * 
     */
    public GetCurrentUserExt createGetCurrentUserExt() {
        return new GetCurrentUserExt();
    }

    /**
     * Create an instance of {@link DeactivateUserResponse }
     * 
     */
    public DeactivateUserResponse createDeactivateUserResponse() {
        return new DeactivateUserResponse();
    }

    /**
     * Create an instance of {@link GetRightsForDepartmentAndCurrentUserResponse }
     * 
     */
    public GetRightsForDepartmentAndCurrentUserResponse createGetRightsForDepartmentAndCurrentUserResponse() {
        return new GetRightsForDepartmentAndCurrentUserResponse();
    }

    /**
     * Create an instance of {@link GetRolesAssignedForUserResponse }
     * 
     */
    public GetRolesAssignedForUserResponse createGetRolesAssignedForUserResponse() {
        return new GetRolesAssignedForUserResponse();
    }

    /**
     * Create an instance of {@link GeneratePasswordResponse }
     * 
     */
    public GeneratePasswordResponse createGeneratePasswordResponse() {
        return new GeneratePasswordResponse();
    }

    /**
     * Create an instance of {@link AssignRoleResponse }
     * 
     */
    public AssignRoleResponse createAssignRoleResponse() {
        return new AssignRoleResponse();
    }

    /**
     * Create an instance of {@link RemoveRolesWithTagResponse }
     * 
     */
    public RemoveRolesWithTagResponse createRemoveRolesWithTagResponse() {
        return new RemoveRolesWithTagResponse();
    }

    /**
     * Create an instance of {@link GetPasswordRulesResponse }
     * 
     */
    public GetPasswordRulesResponse createGetPasswordRulesResponse() {
        return new GetPasswordRulesResponse();
    }

    /**
     * Create an instance of {@link DeleteRolesResponse }
     * 
     */
    public DeleteRolesResponse createDeleteRolesResponse() {
        return new DeleteRolesResponse();
    }

    /**
     * Create an instance of {@link RemoveFederationData }
     * 
     */
    public RemoveFederationData createRemoveFederationData() {
        return new RemoveFederationData();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link DeleteRoles }
     * 
     */
    public DeleteRoles createDeleteRoles() {
        return new DeleteRoles();
    }

    /**
     * Create an instance of {@link RemoveFederationDataResponse }
     * 
     */
    public RemoveFederationDataResponse createRemoveFederationDataResponse() {
        return new RemoveFederationDataResponse();
    }

    /**
     * Create an instance of {@link UserConfigParametersDto }
     * 
     */
    public UserConfigParametersDto createUserConfigParametersDto() {
        return new UserConfigParametersDto();
    }

    /**
     * Create an instance of {@link DeactivateUser }
     * 
     */
    public DeactivateUser createDeactivateUser() {
        return new DeactivateUser();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link UpdatePasswordRules }
     * 
     */
    public UpdatePasswordRules createUpdatePasswordRules() {
        return new UpdatePasswordRules();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link AssignRoles }
     * 
     */
    public AssignRoles createAssignRoles() {
        return new AssignRoles();
    }

    /**
     * Create an instance of {@link GetRolesAssignedForUser }
     * 
     */
    public GetRolesAssignedForUser createGetRolesAssignedForUser() {
        return new GetRolesAssignedForUser();
    }

    /**
     * Create an instance of {@link GetTagTypesResponse }
     * 
     */
    public GetTagTypesResponse createGetTagTypesResponse() {
        return new GetTagTypesResponse();
    }

    /**
     * Create an instance of {@link UpdatePasswordRulesResponse }
     * 
     */
    public UpdatePasswordRulesResponse createUpdatePasswordRulesResponse() {
        return new UpdatePasswordRulesResponse();
    }

    /**
     * Create an instance of {@link ConfigureUserResponse }
     * 
     */
    public ConfigureUserResponse createConfigureUserResponse() {
        return new ConfigureUserResponse();
    }

    /**
     * Create an instance of {@link RemoveRolesWithTag }
     * 
     */
    public RemoveRolesWithTag createRemoveRolesWithTag() {
        return new RemoveRolesWithTag();
    }

    /**
     * Create an instance of {@link GetGrantedPools }
     * 
     */
    public GetGrantedPools createGetGrantedPools() {
        return new GetGrantedPools();
    }

    /**
     * Create an instance of {@link GetTagTypes }
     * 
     */
    public GetTagTypes createGetTagTypes() {
        return new GetTagTypes();
    }

    /**
     * Create an instance of {@link AssignRolesWithTag }
     * 
     */
    public AssignRolesWithTag createAssignRolesWithTag() {
        return new AssignRolesWithTag();
    }

    /**
     * Create an instance of {@link GetTagsForType }
     * 
     */
    public GetTagsForType createGetTagsForType() {
        return new GetTagsForType();
    }

    /**
     * Create an instance of {@link GetTaggedUsersResponse }
     * 
     */
    public GetTaggedUsersResponse createGetTaggedUsersResponse() {
        return new GetTaggedUsersResponse();
    }

    /**
     * Create an instance of {@link GetTagsForTypeResponse }
     * 
     */
    public GetTagsForTypeResponse createGetTagsForTypeResponse() {
        return new GetTagsForTypeResponse();
    }

    /**
     * Create an instance of {@link RemoveRoleAssignment }
     * 
     */
    public RemoveRoleAssignment createRemoveRoleAssignment() {
        return new RemoveRoleAssignment();
    }

    /**
     * Create an instance of {@link TagType }
     * 
     */
    public TagType createTagType() {
        return new TagType();
    }

    /**
     * Create an instance of {@link GetRightsWithLabels }
     * 
     */
    public GetRightsWithLabels createGetRightsWithLabels() {
        return new GetRightsWithLabels();
    }

    /**
     * Create an instance of {@link RoleAssignmentDto }
     * 
     */
    public RoleAssignmentDto createRoleAssignmentDto() {
        return new RoleAssignmentDto();
    }

    /**
     * Create an instance of {@link GetUserExtByIdResponse }
     * 
     */
    public GetUserExtByIdResponse createGetUserExtByIdResponse() {
        return new GetUserExtByIdResponse();
    }

    /**
     * Create an instance of {@link GetInactiveUsersResponse }
     * 
     */
    public GetInactiveUsersResponse createGetInactiveUsersResponse() {
        return new GetInactiveUsersResponse();
    }

    /**
     * Create an instance of {@link ClearAllRoleAssignments }
     * 
     */
    public ClearAllRoleAssignments createClearAllRoleAssignments() {
        return new ClearAllRoleAssignments();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link GetUserDataResponse }
     * 
     */
    public GetUserDataResponse createGetUserDataResponse() {
        return new GetUserDataResponse();
    }

    /**
     * Create an instance of {@link GetUserExtById }
     * 
     */
    public GetUserExtById createGetUserExtById() {
        return new GetUserExtById();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link RemoveTagResponse }
     * 
     */
    public RemoveTagResponse createRemoveTagResponse() {
        return new RemoveTagResponse();
    }

    /**
     * Create an instance of {@link UserExtDto }
     * 
     */
    public UserExtDto createUserExtDto() {
        return new UserExtDto();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link GetGrantedPoolsResponse }
     * 
     */
    public GetGrantedPoolsResponse createGetGrantedPoolsResponse() {
        return new GetGrantedPoolsResponse();
    }

    /**
     * Create an instance of {@link GetPasswordRules }
     * 
     */
    public GetPasswordRules createGetPasswordRules() {
        return new GetPasswordRules();
    }

    /**
     * Create an instance of {@link ActivateUserResponse }
     * 
     */
    public ActivateUserResponse createActivateUserResponse() {
        return new ActivateUserResponse();
    }

    /**
     * Create an instance of {@link OrganizationDto }
     * 
     */
    public OrganizationDto createOrganizationDto() {
        return new OrganizationDto();
    }

    /**
     * Create an instance of {@link ClearAllRoleAssignmentsResponse }
     * 
     */
    public ClearAllRoleAssignmentsResponse createClearAllRoleAssignmentsResponse() {
        return new ClearAllRoleAssignmentsResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link GetUserData }
     * 
     */
    public GetUserData createGetUserData() {
        return new GetUserData();
    }

    /**
     * Create an instance of {@link UserDto }
     * 
     */
    public UserDto createUserDto() {
        return new UserDto();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link AssignRolesResponse }
     * 
     */
    public AssignRolesResponse createAssignRolesResponse() {
        return new AssignRolesResponse();
    }

    /**
     * Create an instance of {@link RequestByGetUsersDto }
     * 
     */
    public RequestByGetUsersDto createRequestByGetUsersDto() {
        return new RequestByGetUsersDto();
    }

    /**
     * Create an instance of {@link PasswordRules }
     * 
     */
    public PasswordRules createPasswordRules() {
        return new PasswordRules();
    }

    /**
     * Create an instance of {@link UserRightDto }
     * 
     */
    public UserRightDto createUserRightDto() {
        return new UserRightDto();
    }

    /**
     * Create an instance of {@link Unit }
     * 
     */
    public Unit createUnit() {
        return new Unit();
    }

    /**
     * Create an instance of {@link PasswordRuleValidation }
     * 
     */
    public PasswordRuleValidation createPasswordRuleValidation() {
        return new PasswordRuleValidation();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link RoleDto.Tags }
     * 
     */
    public RoleDto.Tags createRoleDtoTags() {
        return new RoleDto.Tags();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserExtByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getUserExtByIdResponse")
    public JAXBElement<GetUserExtByIdResponse> createGetUserExtByIdResponse(GetUserExtByIdResponse value) {
        return new JAXBElement<GetUserExtByIdResponse>(_GetUserExtByIdResponse_QNAME, GetUserExtByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleAssignmentDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "roleAssignment")
    public JAXBElement<RoleAssignmentDto> createRoleAssignment(RoleAssignmentDto value) {
        return new JAXBElement<RoleAssignmentDto>(_RoleAssignment_QNAME, RoleAssignmentDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRoleAssignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeRoleAssignment")
    public JAXBElement<RemoveRoleAssignment> createRemoveRoleAssignment(RemoveRoleAssignment value) {
        return new JAXBElement<RemoveRoleAssignment>(_RemoveRoleAssignment_QNAME, RemoveRoleAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TagType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "tagType")
    public JAXBElement<TagType> createTagType(TagType value) {
        return new JAXBElement<TagType>(_TagType_QNAME, TagType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRightsWithLabels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getRightsWithLabels")
    public JAXBElement<GetRightsWithLabels> createGetRightsWithLabels(GetRightsWithLabels value) {
        return new JAXBElement<GetRightsWithLabels>(_GetRightsWithLabels_QNAME, GetRightsWithLabels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaggedUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getTaggedUsersResponse")
    public JAXBElement<GetTaggedUsersResponse> createGetTaggedUsersResponse(GetTaggedUsersResponse value) {
        return new JAXBElement<GetTaggedUsersResponse>(_GetTaggedUsersResponse_QNAME, GetTaggedUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTagsForTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getTagsForTypeResponse")
    public JAXBElement<GetTagsForTypeResponse> createGetTagsForTypeResponse(GetTagsForTypeResponse value) {
        return new JAXBElement<GetTagsForTypeResponse>(_GetTagsForTypeResponse_QNAME, GetTagsForTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTagsForType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getTagsForType")
    public JAXBElement<GetTagsForType> createGetTagsForType(GetTagsForType value) {
        return new JAXBElement<GetTagsForType>(_GetTagsForType_QNAME, GetTagsForType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignRolesWithTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "assignRolesWithTag")
    public JAXBElement<AssignRolesWithTag> createAssignRolesWithTag(AssignRolesWithTag value) {
        return new JAXBElement<AssignRolesWithTag>(_AssignRolesWithTag_QNAME, AssignRolesWithTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedPools }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getGrantedPools")
    public JAXBElement<GetGrantedPools> createGetGrantedPools(GetGrantedPools value) {
        return new JAXBElement<GetGrantedPools>(_GetGrantedPools_QNAME, GetGrantedPools.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTagTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getTagTypes")
    public JAXBElement<GetTagTypes> createGetTagTypes(GetTagTypes value) {
        return new JAXBElement<GetTagTypes>(_GetTagTypes_QNAME, GetTagTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "configureUserResponse")
    public JAXBElement<ConfigureUserResponse> createConfigureUserResponse(ConfigureUserResponse value) {
        return new JAXBElement<ConfigureUserResponse>(_ConfigureUserResponse_QNAME, ConfigureUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRolesWithTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeRolesWithTag")
    public JAXBElement<RemoveRolesWithTag> createRemoveRolesWithTag(RemoveRolesWithTag value) {
        return new JAXBElement<RemoveRolesWithTag>(_RemoveRolesWithTag_QNAME, RemoveRolesWithTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTagTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getTagTypesResponse")
    public JAXBElement<GetTagTypesResponse> createGetTagTypesResponse(GetTagTypesResponse value) {
        return new JAXBElement<GetTagTypesResponse>(_GetTagTypesResponse_QNAME, GetTagTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePasswordRulesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updatePasswordRulesResponse")
    public JAXBElement<UpdatePasswordRulesResponse> createUpdatePasswordRulesResponse(UpdatePasswordRulesResponse value) {
        return new JAXBElement<UpdatePasswordRulesResponse>(_UpdatePasswordRulesResponse_QNAME, UpdatePasswordRulesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesAssignedForUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getRolesAssignedForUser")
    public JAXBElement<GetRolesAssignedForUser> createGetRolesAssignedForUser(GetRolesAssignedForUser value) {
        return new JAXBElement<GetRolesAssignedForUser>(_GetRolesAssignedForUser_QNAME, GetRolesAssignedForUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getUserById")
    public JAXBElement<GetUserById> createGetUserById(GetUserById value) {
        return new JAXBElement<GetUserById>(_GetUserById_QNAME, GetUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "role")
    public JAXBElement<RoleDto> createRole(RoleDto value) {
        return new JAXBElement<RoleDto>(_Role_QNAME, RoleDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "assignRoles")
    public JAXBElement<AssignRoles> createAssignRoles(AssignRoles value) {
        return new JAXBElement<AssignRoles>(_AssignRoles_QNAME, AssignRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "changePasswordResponse")
    public JAXBElement<ChangePasswordResponse> createChangePasswordResponse(ChangePasswordResponse value) {
        return new JAXBElement<ChangePasswordResponse>(_ChangePasswordResponse_QNAME, ChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePasswordRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updatePasswordRules")
    public JAXBElement<UpdatePasswordRules> createUpdatePasswordRules(UpdatePasswordRules value) {
        return new JAXBElement<UpdatePasswordRules>(_UpdatePasswordRules_QNAME, UpdatePasswordRules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "deactivateUser")
    public JAXBElement<DeactivateUser> createDeactivateUser(DeactivateUser value) {
        return new JAXBElement<DeactivateUser>(_DeactivateUser_QNAME, DeactivateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "assignRolesResponse")
    public JAXBElement<AssignRolesResponse> createAssignRolesResponse(AssignRolesResponse value) {
        return new JAXBElement<AssignRolesResponse>(_AssignRolesResponse_QNAME, AssignRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "user")
    public JAXBElement<UserDto> createUser(UserDto value) {
        return new JAXBElement<UserDto>(_User_QNAME, UserDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getUserData")
    public JAXBElement<GetUserData> createGetUserData(GetUserData value) {
        return new JAXBElement<GetUserData>(_GetUserData_QNAME, GetUserData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearAllRoleAssignmentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "clearAllRoleAssignmentsResponse")
    public JAXBElement<ClearAllRoleAssignmentsResponse> createClearAllRoleAssignmentsResponse(ClearAllRoleAssignmentsResponse value) {
        return new JAXBElement<ClearAllRoleAssignmentsResponse>(_ClearAllRoleAssignmentsResponse_QNAME, ClearAllRoleAssignmentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "organization")
    public JAXBElement<OrganizationDto> createOrganization(OrganizationDto value) {
        return new JAXBElement<OrganizationDto>(_Organization_QNAME, OrganizationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "activateUserResponse")
    public JAXBElement<ActivateUserResponse> createActivateUserResponse(ActivateUserResponse value) {
        return new JAXBElement<ActivateUserResponse>(_ActivateUserResponse_QNAME, ActivateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedPoolsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getGrantedPoolsResponse")
    public JAXBElement<GetGrantedPoolsResponse> createGetGrantedPoolsResponse(GetGrantedPoolsResponse value) {
        return new JAXBElement<GetGrantedPoolsResponse>(_GetGrantedPoolsResponse_QNAME, GetGrantedPoolsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPasswordRules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPasswordRules")
    public JAXBElement<GetPasswordRules> createGetPasswordRules(GetPasswordRules value) {
        return new JAXBElement<GetPasswordRules>(_GetPasswordRules_QNAME, GetPasswordRules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "changePassword")
    public JAXBElement<ChangePassword> createChangePassword(ChangePassword value) {
        return new JAXBElement<ChangePassword>(_ChangePassword_QNAME, ChangePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeTagResponse")
    public JAXBElement<RemoveTagResponse> createRemoveTagResponse(RemoveTagResponse value) {
        return new JAXBElement<RemoveTagResponse>(_RemoveTagResponse_QNAME, RemoveTagResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserExtDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "userExt")
    public JAXBElement<UserExtDto> createUserExt(UserExtDto value) {
        return new JAXBElement<UserExtDto>(_UserExt_QNAME, UserExtDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getUserDataResponse")
    public JAXBElement<GetUserDataResponse> createGetUserDataResponse(GetUserDataResponse value) {
        return new JAXBElement<GetUserDataResponse>(_GetUserDataResponse_QNAME, GetUserDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserExtById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getUserExtById")
    public JAXBElement<GetUserExtById> createGetUserExtById(GetUserExtById value) {
        return new JAXBElement<GetUserExtById>(_GetUserExtById_QNAME, GetUserExtById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearAllRoleAssignments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "clearAllRoleAssignments")
    public JAXBElement<ClearAllRoleAssignments> createClearAllRoleAssignments(ClearAllRoleAssignments value) {
        return new JAXBElement<ClearAllRoleAssignments>(_ClearAllRoleAssignments_QNAME, ClearAllRoleAssignments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInactiveUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getInactiveUsersResponse")
    public JAXBElement<GetInactiveUsersResponse> createGetInactiveUsersResponse(GetInactiveUsersResponse value) {
        return new JAXBElement<GetInactiveUsersResponse>(_GetInactiveUsersResponse_QNAME, GetInactiveUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "deactivateUserResponse")
    public JAXBElement<DeactivateUserResponse> createDeactivateUserResponse(DeactivateUserResponse value) {
        return new JAXBElement<DeactivateUserResponse>(_DeactivateUserResponse_QNAME, DeactivateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRightsForDepartmentAndCurrentUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getRightsForDepartmentAndCurrentUserResponse")
    public JAXBElement<GetRightsForDepartmentAndCurrentUserResponse> createGetRightsForDepartmentAndCurrentUserResponse(GetRightsForDepartmentAndCurrentUserResponse value) {
        return new JAXBElement<GetRightsForDepartmentAndCurrentUserResponse>(_GetRightsForDepartmentAndCurrentUserResponse_QNAME, GetRightsForDepartmentAndCurrentUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "generatePassword")
    public JAXBElement<GeneratePassword> createGeneratePassword(GeneratePassword value) {
        return new JAXBElement<GeneratePassword>(_GeneratePassword_QNAME, GeneratePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserExt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCurrentUserExt")
    public JAXBElement<GetCurrentUserExt> createGetCurrentUserExt(GetCurrentUserExt value) {
        return new JAXBElement<GetCurrentUserExt>(_GetCurrentUserExt_QNAME, GetCurrentUserExt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInactiveUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getInactiveUsers")
    public JAXBElement<GetInactiveUsers> createGetInactiveUsers(GetInactiveUsers value) {
        return new JAXBElement<GetInactiveUsers>(_GetInactiveUsers_QNAME, GetInactiveUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDataSoapDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "userDataSoap")
    public JAXBElement<UserDataSoapDto> createUserDataSoap(UserDataSoapDto value) {
        return new JAXBElement<UserDataSoapDto>(_UserDataSoap_QNAME, UserDataSoapDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "tag")
    public JAXBElement<Tag> createTag(Tag value) {
        return new JAXBElement<Tag>(_Tag_QNAME, Tag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "assignRole")
    public JAXBElement<AssignRole> createAssignRole(AssignRole value) {
        return new JAXBElement<AssignRole>(_AssignRole_QNAME, AssignRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRightsForDepartmentAndCurrentUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getRightsForDepartmentAndCurrentUser")
    public JAXBElement<GetRightsForDepartmentAndCurrentUser> createGetRightsForDepartmentAndCurrentUser(GetRightsForDepartmentAndCurrentUser value) {
        return new JAXBElement<GetRightsForDepartmentAndCurrentUser>(_GetRightsForDepartmentAndCurrentUser_QNAME, GetRightsForDepartmentAndCurrentUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeTag")
    public JAXBElement<RemoveTag> createRemoveTag(RemoveTag value) {
        return new JAXBElement<RemoveTag>(_RemoveTag_QNAME, RemoveTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRightsWithLabelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getRightsWithLabelsResponse")
    public JAXBElement<GetRightsWithLabelsResponse> createGetRightsWithLabelsResponse(GetRightsWithLabelsResponse value) {
        return new JAXBElement<GetRightsWithLabelsResponse>(_GetRightsWithLabelsResponse_QNAME, GetRightsWithLabelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "activateUser")
    public JAXBElement<ActivateUser> createActivateUser(ActivateUser value) {
        return new JAXBElement<ActivateUser>(_ActivateUser_QNAME, ActivateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignRolesWithTagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "assignRolesWithTagResponse")
    public JAXBElement<AssignRolesWithTagResponse> createAssignRolesWithTagResponse(AssignRolesWithTagResponse value) {
        return new JAXBElement<AssignRolesWithTagResponse>(_AssignRolesWithTagResponse_QNAME, AssignRolesWithTagResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "addTagResponse")
    public JAXBElement<AddTagResponse> createAddTagResponse(AddTagResponse value) {
        return new JAXBElement<AddTagResponse>(_AddTagResponse_QNAME, AddTagResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "addTag")
    public JAXBElement<AddTag> createAddTag(AddTag value) {
        return new JAXBElement<AddTag>(_AddTag_QNAME, AddTag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigureUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "configureUser")
    public JAXBElement<ConfigureUser> createConfigureUser(ConfigureUser value) {
        return new JAXBElement<ConfigureUser>(_ConfigureUser_QNAME, ConfigureUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaggedUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getTaggedUsers")
    public JAXBElement<GetTaggedUsers> createGetTaggedUsers(GetTaggedUsers value) {
        return new JAXBElement<GetTaggedUsers>(_GetTaggedUsers_QNAME, GetTaggedUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRoleAssignmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeRoleAssignmentResponse")
    public JAXBElement<RemoveRoleAssignmentResponse> createRemoveRoleAssignmentResponse(RemoveRoleAssignmentResponse value) {
        return new JAXBElement<RemoveRoleAssignmentResponse>(_RemoveRoleAssignmentResponse_QNAME, RemoveRoleAssignmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateTemporaryPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "generateTemporaryPassword")
    public JAXBElement<GenerateTemporaryPassword> createGenerateTemporaryPassword(GenerateTemporaryPassword value) {
        return new JAXBElement<GenerateTemporaryPassword>(_GenerateTemporaryPassword_QNAME, GenerateTemporaryPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserExtResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCurrentUserExtResponse")
    public JAXBElement<GetCurrentUserExtResponse> createGetCurrentUserExtResponse(GetCurrentUserExtResponse value) {
        return new JAXBElement<GetCurrentUserExtResponse>(_GetCurrentUserExtResponse_QNAME, GetCurrentUserExtResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getUserByIdResponse")
    public JAXBElement<GetUserByIdResponse> createGetUserByIdResponse(GetUserByIdResponse value) {
        return new JAXBElement<GetUserByIdResponse>(_GetUserByIdResponse_QNAME, GetUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateTemporaryPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "generateTemporaryPasswordResponse")
    public JAXBElement<GenerateTemporaryPasswordResponse> createGenerateTemporaryPasswordResponse(GenerateTemporaryPasswordResponse value) {
        return new JAXBElement<GenerateTemporaryPasswordResponse>(_GenerateTemporaryPasswordResponse_QNAME, GenerateTemporaryPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserConfigParametersDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "userConfig")
    public JAXBElement<UserConfigParametersDto> createUserConfig(UserConfigParametersDto value) {
        return new JAXBElement<UserConfigParametersDto>(_UserConfig_QNAME, UserConfigParametersDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFederationDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeFederationDataResponse")
    public JAXBElement<RemoveFederationDataResponse> createRemoveFederationDataResponse(RemoveFederationDataResponse value) {
        return new JAXBElement<RemoveFederationDataResponse>(_RemoveFederationDataResponse_QNAME, RemoveFederationDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "deleteRoles")
    public JAXBElement<DeleteRoles> createDeleteRoles(DeleteRoles value) {
        return new JAXBElement<DeleteRoles>(_DeleteRoles_QNAME, DeleteRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFederationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeFederationData")
    public JAXBElement<RemoveFederationData> createRemoveFederationData(RemoveFederationData value) {
        return new JAXBElement<RemoveFederationData>(_RemoveFederationData_QNAME, RemoveFederationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPasswordRulesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPasswordRulesResponse")
    public JAXBElement<GetPasswordRulesResponse> createGetPasswordRulesResponse(GetPasswordRulesResponse value) {
        return new JAXBElement<GetPasswordRulesResponse>(_GetPasswordRulesResponse_QNAME, GetPasswordRulesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "deleteRolesResponse")
    public JAXBElement<DeleteRolesResponse> createDeleteRolesResponse(DeleteRolesResponse value) {
        return new JAXBElement<DeleteRolesResponse>(_DeleteRolesResponse_QNAME, DeleteRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRolesWithTagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeRolesWithTagResponse")
    public JAXBElement<RemoveRolesWithTagResponse> createRemoveRolesWithTagResponse(RemoveRolesWithTagResponse value) {
        return new JAXBElement<RemoveRolesWithTagResponse>(_RemoveRolesWithTagResponse_QNAME, RemoveRolesWithTagResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "assignRoleResponse")
    public JAXBElement<AssignRoleResponse> createAssignRoleResponse(AssignRoleResponse value) {
        return new JAXBElement<AssignRoleResponse>(_AssignRoleResponse_QNAME, AssignRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "generatePasswordResponse")
    public JAXBElement<GeneratePasswordResponse> createGeneratePasswordResponse(GeneratePasswordResponse value) {
        return new JAXBElement<GeneratePasswordResponse>(_GeneratePasswordResponse_QNAME, GeneratePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesAssignedForUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getRolesAssignedForUserResponse")
    public JAXBElement<GetRolesAssignedForUserResponse> createGetRolesAssignedForUserResponse(GetRolesAssignedForUserResponse value) {
        return new JAXBElement<GetRolesAssignedForUserResponse>(_GetRolesAssignedForUserResponse_QNAME, GetRolesAssignedForUserResponse.class, null, value);
    }

}
