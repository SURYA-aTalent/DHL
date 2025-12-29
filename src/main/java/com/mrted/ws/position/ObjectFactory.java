
package com.mrted.ws.position;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mrted.ws.position package. 
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

    private final static QName _GetPositions_QNAME = new QName("http://ws.mrted.com/", "getPositions");
    private final static QName _GetPositionsByUser_QNAME = new QName("http://ws.mrted.com/", "getPositionsByUser");
    private final static QName _Onboarding_QNAME = new QName("http://ws.mrted.com/", "onboarding");
    private final static QName _GetOrganizationStructure_QNAME = new QName("http://ws.mrted.com/", "getOrganizationStructure");
    private final static QName _UpdatePositionResponse_QNAME = new QName("http://ws.mrted.com/", "updatePositionResponse");
    private final static QName _ComplexQuestion_QNAME = new QName("http://ws.mrted.com/", "complex-question");
    private final static QName _GetPositionByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getPositionByIdResponse");
    private final static QName _GetLocationsResponse_QNAME = new QName("http://ws.mrted.com/", "getLocationsResponse");
    private final static QName _CreatePosition_QNAME = new QName("http://ws.mrted.com/", "createPosition");
    private final static QName _GetPositionsByReqNumber_QNAME = new QName("http://ws.mrted.com/", "getPositionsByReqNumber");
    private final static QName _GetPositionsByReqNumberResponse_QNAME = new QName("http://ws.mrted.com/", "getPositionsByReqNumberResponse");
    private final static QName _Document_QNAME = new QName("http://ws.mrted.com/", "document");
    private final static QName _GetPositionsResponse_QNAME = new QName("http://ws.mrted.com/", "getPositionsResponse");
    private final static QName _OnboardingTeam_QNAME = new QName("http://ws.mrted.com/", "onboardingTeam");
    private final static QName _JobadTemplate_QNAME = new QName("http://ws.mrted.com/", "jobadTemplate");
    private final static QName _TotalCost_QNAME = new QName("http://ws.mrted.com/", "totalCost");
    private final static QName _User_QNAME = new QName("http://ws.mrted.com/", "user");
    private final static QName _AuthorizedRecruitment_QNAME = new QName("http://ws.mrted.com/", "authorizedRecruitment");
    private final static QName _GetPositionByExternalJobNumber_QNAME = new QName("http://ws.mrted.com/", "getPositionByExternalJobNumber");
    private final static QName _Position_QNAME = new QName("http://ws.mrted.com/", "position");
    private final static QName _Compensation_QNAME = new QName("http://ws.mrted.com/", "compensation");
    private final static QName _Location_QNAME = new QName("http://ws.mrted.com/", "location");
    private final static QName _GetLocations_QNAME = new QName("http://ws.mrted.com/", "getLocations");
    private final static QName _GetPositionsByUserResponse_QNAME = new QName("http://ws.mrted.com/", "getPositionsByUserResponse");
    private final static QName _GetPositionByTeamMemberResponse_QNAME = new QName("http://ws.mrted.com/", "getPositionByTeamMemberResponse");
    private final static QName _CreatePositionResponse_QNAME = new QName("http://ws.mrted.com/", "createPositionResponse");
    private final static QName _Organization_QNAME = new QName("http://ws.mrted.com/", "organization");
    private final static QName _GetPositionByTeamMember_QNAME = new QName("http://ws.mrted.com/", "getPositionByTeamMember");
    private final static QName _ConfigurableFields_QNAME = new QName("http://ws.mrted.com/", "configurableFields");
    private final static QName _Answer_QNAME = new QName("http://ws.mrted.com/", "answer");
    private final static QName _GetOrganizationStructureResponse_QNAME = new QName("http://ws.mrted.com/", "getOrganizationStructureResponse");
    private final static QName _StandardRate_QNAME = new QName("http://ws.mrted.com/", "standardRate");
    private final static QName _CustomField_QNAME = new QName("http://ws.mrted.com/", "customField");
    private final static QName _WorkTime_QNAME = new QName("http://ws.mrted.com/", "workTime");
    private final static QName _GetPositionsByObsId_QNAME = new QName("http://ws.mrted.com/", "getPositionsByObsId");
    private final static QName _GetPositionsByObsIdResponse_QNAME = new QName("http://ws.mrted.com/", "getPositionsByObsIdResponse");
    private final static QName _GetPositionByExternalJobNumberResponse_QNAME = new QName("http://ws.mrted.com/", "getPositionByExternalJobNumberResponse");
    private final static QName _FreeFormField_QNAME = new QName("http://ws.mrted.com/", "freeFormField");
    private final static QName _Question_QNAME = new QName("http://ws.mrted.com/", "question");
    private final static QName _GetPositionById_QNAME = new QName("http://ws.mrted.com/", "getPositionById");
    private final static QName _OpeningPosition_QNAME = new QName("http://ws.mrted.com/", "openingPosition");
    private final static QName _UpdatePosition_QNAME = new QName("http://ws.mrted.com/", "updatePosition");
    private final static QName _PositionTeam_QNAME = new QName("http://ws.mrted.com/", "positionTeam");
    private final static QName _ExpectedContractDates_QNAME = new QName("http://ws.mrted.com/", "expectedContractDates");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mrted.ws.position
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfPropertiesType }
     * 
     */
    public ConfPropertiesType createConfPropertiesType() {
        return new ConfPropertiesType();
    }

    /**
     * Create an instance of {@link ImagesType }
     * 
     */
    public ImagesType createImagesType() {
        return new ImagesType();
    }

    /**
     * Create an instance of {@link VideosType }
     * 
     */
    public VideosType createVideosType() {
        return new VideosType();
    }

    /**
     * Create an instance of {@link OrganizationStructureItemDto }
     * 
     */
    public OrganizationStructureItemDto createOrganizationStructureItemDto() {
        return new OrganizationStructureItemDto();
    }

    /**
     * Create an instance of {@link PositionDto }
     * 
     */
    public PositionDto createPositionDto() {
        return new PositionDto();
    }

    /**
     * Create an instance of {@link ConfigurableFieldsDto }
     * 
     */
    public ConfigurableFieldsDto createConfigurableFieldsDto() {
        return new ConfigurableFieldsDto();
    }

    /**
     * Create an instance of {@link AnswerDto }
     * 
     */
    public AnswerDto createAnswerDto() {
        return new AnswerDto();
    }

    /**
     * Create an instance of {@link ComplexAssignedQuestion }
     * 
     */
    public ComplexAssignedQuestion createComplexAssignedQuestion() {
        return new ComplexAssignedQuestion();
    }

    /**
     * Create an instance of {@link StructuredDocumentDto }
     * 
     */
    public StructuredDocumentDto createStructuredDocumentDto() {
        return new StructuredDocumentDto();
    }

    /**
     * Create an instance of {@link JobAdTemplateDto }
     * 
     */
    public JobAdTemplateDto createJobAdTemplateDto() {
        return new JobAdTemplateDto();
    }

    /**
     * Create an instance of {@link OnboardingTeam }
     * 
     */
    public OnboardingTeam createOnboardingTeam() {
        return new OnboardingTeam();
    }

    /**
     * Create an instance of {@link GetPositionsResponse }
     * 
     */
    public GetPositionsResponse createGetPositionsResponse() {
        return new GetPositionsResponse();
    }

    /**
     * Create an instance of {@link GetPositionsByReqNumberResponse }
     * 
     */
    public GetPositionsByReqNumberResponse createGetPositionsByReqNumberResponse() {
        return new GetPositionsByReqNumberResponse();
    }

    /**
     * Create an instance of {@link CreatePosition }
     * 
     */
    public CreatePosition createCreatePosition() {
        return new CreatePosition();
    }

    /**
     * Create an instance of {@link GetPositionsByReqNumber }
     * 
     */
    public GetPositionsByReqNumber createGetPositionsByReqNumber() {
        return new GetPositionsByReqNumber();
    }

    /**
     * Create an instance of {@link GetLocationsResponse }
     * 
     */
    public GetLocationsResponse createGetLocationsResponse() {
        return new GetLocationsResponse();
    }

    /**
     * Create an instance of {@link GetPositionByIdResponse }
     * 
     */
    public GetPositionByIdResponse createGetPositionByIdResponse() {
        return new GetPositionByIdResponse();
    }

    /**
     * Create an instance of {@link UpdatePositionResponse }
     * 
     */
    public UpdatePositionResponse createUpdatePositionResponse() {
        return new UpdatePositionResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationStructure }
     * 
     */
    public GetOrganizationStructure createGetOrganizationStructure() {
        return new GetOrganizationStructure();
    }

    /**
     * Create an instance of {@link GetPositions }
     * 
     */
    public GetPositions createGetPositions() {
        return new GetPositions();
    }

    /**
     * Create an instance of {@link GetPositionsByUser }
     * 
     */
    public GetPositionsByUser createGetPositionsByUser() {
        return new GetPositionsByUser();
    }

    /**
     * Create an instance of {@link OnboardingUserDTO }
     * 
     */
    public OnboardingUserDTO createOnboardingUserDTO() {
        return new OnboardingUserDTO();
    }

    /**
     * Create an instance of {@link ExpectedContractDates }
     * 
     */
    public ExpectedContractDates createExpectedContractDates() {
        return new ExpectedContractDates();
    }

    /**
     * Create an instance of {@link PositionTeam }
     * 
     */
    public PositionTeam createPositionTeam() {
        return new PositionTeam();
    }

    /**
     * Create an instance of {@link OpeningPositionDTO }
     * 
     */
    public OpeningPositionDTO createOpeningPositionDTO() {
        return new OpeningPositionDTO();
    }

    /**
     * Create an instance of {@link UpdatePosition }
     * 
     */
    public UpdatePosition createUpdatePosition() {
        return new UpdatePosition();
    }

    /**
     * Create an instance of {@link GetPositionById }
     * 
     */
    public GetPositionById createGetPositionById() {
        return new GetPositionById();
    }

    /**
     * Create an instance of {@link SimpleAssignedQuestion }
     * 
     */
    public SimpleAssignedQuestion createSimpleAssignedQuestion() {
        return new SimpleAssignedQuestion();
    }

    /**
     * Create an instance of {@link FreeFormFieldDto }
     * 
     */
    public FreeFormFieldDto createFreeFormFieldDto() {
        return new FreeFormFieldDto();
    }

    /**
     * Create an instance of {@link GetPositionsByObsIdResponse }
     * 
     */
    public GetPositionsByObsIdResponse createGetPositionsByObsIdResponse() {
        return new GetPositionsByObsIdResponse();
    }

    /**
     * Create an instance of {@link GetPositionByExternalJobNumberResponse }
     * 
     */
    public GetPositionByExternalJobNumberResponse createGetPositionByExternalJobNumberResponse() {
        return new GetPositionByExternalJobNumberResponse();
    }

    /**
     * Create an instance of {@link GetPositionsByObsId }
     * 
     */
    public GetPositionsByObsId createGetPositionsByObsId() {
        return new GetPositionsByObsId();
    }

    /**
     * Create an instance of {@link WorkTime }
     * 
     */
    public WorkTime createWorkTime() {
        return new WorkTime();
    }

    /**
     * Create an instance of {@link CustomField }
     * 
     */
    public CustomField createCustomField() {
        return new CustomField();
    }

    /**
     * Create an instance of {@link StandardRate }
     * 
     */
    public StandardRate createStandardRate() {
        return new StandardRate();
    }

    /**
     * Create an instance of {@link GetOrganizationStructureResponse }
     * 
     */
    public GetOrganizationStructureResponse createGetOrganizationStructureResponse() {
        return new GetOrganizationStructureResponse();
    }

    /**
     * Create an instance of {@link GetPositionByTeamMember }
     * 
     */
    public GetPositionByTeamMember createGetPositionByTeamMember() {
        return new GetPositionByTeamMember();
    }

    /**
     * Create an instance of {@link CreatePositionResponse }
     * 
     */
    public CreatePositionResponse createCreatePositionResponse() {
        return new CreatePositionResponse();
    }

    /**
     * Create an instance of {@link OrganizationDto }
     * 
     */
    public OrganizationDto createOrganizationDto() {
        return new OrganizationDto();
    }

    /**
     * Create an instance of {@link GetLocations }
     * 
     */
    public GetLocations createGetLocations() {
        return new GetLocations();
    }

    /**
     * Create an instance of {@link GetPositionsByUserResponse }
     * 
     */
    public GetPositionsByUserResponse createGetPositionsByUserResponse() {
        return new GetPositionsByUserResponse();
    }

    /**
     * Create an instance of {@link GetPositionByTeamMemberResponse }
     * 
     */
    public GetPositionByTeamMemberResponse createGetPositionByTeamMemberResponse() {
        return new GetPositionByTeamMemberResponse();
    }

    /**
     * Create an instance of {@link CompensationDto }
     * 
     */
    public CompensationDto createCompensationDto() {
        return new CompensationDto();
    }

    /**
     * Create an instance of {@link LocationDto }
     * 
     */
    public LocationDto createLocationDto() {
        return new LocationDto();
    }

    /**
     * Create an instance of {@link AuthorizedRecruitment }
     * 
     */
    public AuthorizedRecruitment createAuthorizedRecruitment() {
        return new AuthorizedRecruitment();
    }

    /**
     * Create an instance of {@link GetPositionByExternalJobNumber }
     * 
     */
    public GetPositionByExternalJobNumber createGetPositionByExternalJobNumber() {
        return new GetPositionByExternalJobNumber();
    }

    /**
     * Create an instance of {@link UserDto }
     * 
     */
    public UserDto createUserDto() {
        return new UserDto();
    }

    /**
     * Create an instance of {@link TotalCost }
     * 
     */
    public TotalCost createTotalCost() {
        return new TotalCost();
    }

    /**
     * Create an instance of {@link JobLocationDto }
     * 
     */
    public JobLocationDto createJobLocationDto() {
        return new JobLocationDto();
    }

    /**
     * Create an instance of {@link RequestbyobsidDto }
     * 
     */
    public RequestbyobsidDto createRequestbyobsidDto() {
        return new RequestbyobsidDto();
    }

    /**
     * Create an instance of {@link OrganizationStructureDto }
     * 
     */
    public OrganizationStructureDto createOrganizationStructureDto() {
        return new OrganizationStructureDto();
    }

    /**
     * Create an instance of {@link ApproverDto }
     * 
     */
    public ApproverDto createApproverDto() {
        return new ApproverDto();
    }

    /**
     * Create an instance of {@link PositionsByObsIdResponseDto }
     * 
     */
    public PositionsByObsIdResponseDto createPositionsByObsIdResponseDto() {
        return new PositionsByObsIdResponseDto();
    }

    /**
     * Create an instance of {@link Unit }
     * 
     */
    public Unit createUnit() {
        return new Unit();
    }

    /**
     * Create an instance of {@link AssignedImageDto }
     * 
     */
    public AssignedImageDto createAssignedImageDto() {
        return new AssignedImageDto();
    }

    /**
     * Create an instance of {@link ConfLovDto }
     * 
     */
    public ConfLovDto createConfLovDto() {
        return new ConfLovDto();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link TeamMemberDto }
     * 
     */
    public TeamMemberDto createTeamMemberDto() {
        return new TeamMemberDto();
    }

    /**
     * Create an instance of {@link RequestByTeamMemberDto }
     * 
     */
    public RequestByTeamMemberDto createRequestByTeamMemberDto() {
        return new RequestByTeamMemberDto();
    }

    /**
     * Create an instance of {@link AssignedVideoDto }
     * 
     */
    public AssignedVideoDto createAssignedVideoDto() {
        return new AssignedVideoDto();
    }

    /**
     * Create an instance of {@link RequestParamsDto }
     * 
     */
    public RequestParamsDto createRequestParamsDto() {
        return new RequestParamsDto();
    }

    /**
     * Create an instance of {@link JobAdField }
     * 
     */
    public JobAdField createJobAdField() {
        return new JobAdField();
    }

    /**
     * Create an instance of {@link ConfPropertiesType.Entry }
     * 
     */
    public ConfPropertiesType.Entry createConfPropertiesTypeEntry() {
        return new ConfPropertiesType.Entry();
    }

    /**
     * Create an instance of {@link ImagesType.Entry }
     * 
     */
    public ImagesType.Entry createImagesTypeEntry() {
        return new ImagesType.Entry();
    }

    /**
     * Create an instance of {@link VideosType.Entry }
     * 
     */
    public VideosType.Entry createVideosTypeEntry() {
        return new VideosType.Entry();
    }

    /**
     * Create an instance of {@link OrganizationStructureItemDto.SubDepartments }
     * 
     */
    public OrganizationStructureItemDto.SubDepartments createOrganizationStructureItemDtoSubDepartments() {
        return new OrganizationStructureItemDto.SubDepartments();
    }

    /**
     * Create an instance of {@link PositionDto.JobLocations }
     * 
     */
    public PositionDto.JobLocations createPositionDtoJobLocations() {
        return new PositionDto.JobLocations();
    }

    /**
     * Create an instance of {@link ConfigurableFieldsDto.FreeFormFields }
     * 
     */
    public ConfigurableFieldsDto.FreeFormFields createConfigurableFieldsDtoFreeFormFields() {
        return new ConfigurableFieldsDto.FreeFormFields();
    }

    /**
     * Create an instance of {@link ConfigurableFieldsDto.Lovs }
     * 
     */
    public ConfigurableFieldsDto.Lovs createConfigurableFieldsDtoLovs() {
        return new ConfigurableFieldsDto.Lovs();
    }

    /**
     * Create an instance of {@link AnswerDto.Values }
     * 
     */
    public AnswerDto.Values createAnswerDtoValues() {
        return new AnswerDto.Values();
    }

    /**
     * Create an instance of {@link ComplexAssignedQuestion.Children }
     * 
     */
    public ComplexAssignedQuestion.Children createComplexAssignedQuestionChildren() {
        return new ComplexAssignedQuestion.Children();
    }

    /**
     * Create an instance of {@link StructuredDocumentDto.Questions }
     * 
     */
    public StructuredDocumentDto.Questions createStructuredDocumentDtoQuestions() {
        return new StructuredDocumentDto.Questions();
    }

    /**
     * Create an instance of {@link JobAdTemplateDto.AdditionalDepartments }
     * 
     */
    public JobAdTemplateDto.AdditionalDepartments createJobAdTemplateDtoAdditionalDepartments() {
        return new JobAdTemplateDto.AdditionalDepartments();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositions")
    public JAXBElement<GetPositions> createGetPositions(GetPositions value) {
        return new JAXBElement<GetPositions>(_GetPositions_QNAME, GetPositions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionsByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionsByUser")
    public JAXBElement<GetPositionsByUser> createGetPositionsByUser(GetPositionsByUser value) {
        return new JAXBElement<GetPositionsByUser>(_GetPositionsByUser_QNAME, GetPositionsByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnboardingUserDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "onboarding")
    public JAXBElement<OnboardingUserDTO> createOnboarding(OnboardingUserDTO value) {
        return new JAXBElement<OnboardingUserDTO>(_Onboarding_QNAME, OnboardingUserDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getOrganizationStructure")
    public JAXBElement<GetOrganizationStructure> createGetOrganizationStructure(GetOrganizationStructure value) {
        return new JAXBElement<GetOrganizationStructure>(_GetOrganizationStructure_QNAME, GetOrganizationStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updatePositionResponse")
    public JAXBElement<UpdatePositionResponse> createUpdatePositionResponse(UpdatePositionResponse value) {
        return new JAXBElement<UpdatePositionResponse>(_UpdatePositionResponse_QNAME, UpdatePositionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexAssignedQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "complex-question")
    public JAXBElement<ComplexAssignedQuestion> createComplexQuestion(ComplexAssignedQuestion value) {
        return new JAXBElement<ComplexAssignedQuestion>(_ComplexQuestion_QNAME, ComplexAssignedQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionByIdResponse")
    public JAXBElement<GetPositionByIdResponse> createGetPositionByIdResponse(GetPositionByIdResponse value) {
        return new JAXBElement<GetPositionByIdResponse>(_GetPositionByIdResponse_QNAME, GetPositionByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getLocationsResponse")
    public JAXBElement<GetLocationsResponse> createGetLocationsResponse(GetLocationsResponse value) {
        return new JAXBElement<GetLocationsResponse>(_GetLocationsResponse_QNAME, GetLocationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "createPosition")
    public JAXBElement<CreatePosition> createCreatePosition(CreatePosition value) {
        return new JAXBElement<CreatePosition>(_CreatePosition_QNAME, CreatePosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionsByReqNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionsByReqNumber")
    public JAXBElement<GetPositionsByReqNumber> createGetPositionsByReqNumber(GetPositionsByReqNumber value) {
        return new JAXBElement<GetPositionsByReqNumber>(_GetPositionsByReqNumber_QNAME, GetPositionsByReqNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionsByReqNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionsByReqNumberResponse")
    public JAXBElement<GetPositionsByReqNumberResponse> createGetPositionsByReqNumberResponse(GetPositionsByReqNumberResponse value) {
        return new JAXBElement<GetPositionsByReqNumberResponse>(_GetPositionsByReqNumberResponse_QNAME, GetPositionsByReqNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredDocumentDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "document")
    public JAXBElement<StructuredDocumentDto> createDocument(StructuredDocumentDto value) {
        return new JAXBElement<StructuredDocumentDto>(_Document_QNAME, StructuredDocumentDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionsResponse")
    public JAXBElement<GetPositionsResponse> createGetPositionsResponse(GetPositionsResponse value) {
        return new JAXBElement<GetPositionsResponse>(_GetPositionsResponse_QNAME, GetPositionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnboardingTeam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "onboardingTeam")
    public JAXBElement<OnboardingTeam> createOnboardingTeam(OnboardingTeam value) {
        return new JAXBElement<OnboardingTeam>(_OnboardingTeam_QNAME, OnboardingTeam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobAdTemplateDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "jobadTemplate")
    public JAXBElement<JobAdTemplateDto> createJobadTemplate(JobAdTemplateDto value) {
        return new JAXBElement<JobAdTemplateDto>(_JobadTemplate_QNAME, JobAdTemplateDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalCost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "totalCost")
    public JAXBElement<TotalCost> createTotalCost(TotalCost value) {
        return new JAXBElement<TotalCost>(_TotalCost_QNAME, TotalCost.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizedRecruitment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "authorizedRecruitment")
    public JAXBElement<AuthorizedRecruitment> createAuthorizedRecruitment(AuthorizedRecruitment value) {
        return new JAXBElement<AuthorizedRecruitment>(_AuthorizedRecruitment_QNAME, AuthorizedRecruitment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionByExternalJobNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionByExternalJobNumber")
    public JAXBElement<GetPositionByExternalJobNumber> createGetPositionByExternalJobNumber(GetPositionByExternalJobNumber value) {
        return new JAXBElement<GetPositionByExternalJobNumber>(_GetPositionByExternalJobNumber_QNAME, GetPositionByExternalJobNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "position")
    public JAXBElement<PositionDto> createPosition(PositionDto value) {
        return new JAXBElement<PositionDto>(_Position_QNAME, PositionDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompensationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "compensation")
    public JAXBElement<CompensationDto> createCompensation(CompensationDto value) {
        return new JAXBElement<CompensationDto>(_Compensation_QNAME, CompensationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "location")
    public JAXBElement<LocationDto> createLocation(LocationDto value) {
        return new JAXBElement<LocationDto>(_Location_QNAME, LocationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getLocations")
    public JAXBElement<GetLocations> createGetLocations(GetLocations value) {
        return new JAXBElement<GetLocations>(_GetLocations_QNAME, GetLocations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionsByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionsByUserResponse")
    public JAXBElement<GetPositionsByUserResponse> createGetPositionsByUserResponse(GetPositionsByUserResponse value) {
        return new JAXBElement<GetPositionsByUserResponse>(_GetPositionsByUserResponse_QNAME, GetPositionsByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionByTeamMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionByTeamMemberResponse")
    public JAXBElement<GetPositionByTeamMemberResponse> createGetPositionByTeamMemberResponse(GetPositionByTeamMemberResponse value) {
        return new JAXBElement<GetPositionByTeamMemberResponse>(_GetPositionByTeamMemberResponse_QNAME, GetPositionByTeamMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "createPositionResponse")
    public JAXBElement<CreatePositionResponse> createCreatePositionResponse(CreatePositionResponse value) {
        return new JAXBElement<CreatePositionResponse>(_CreatePositionResponse_QNAME, CreatePositionResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionByTeamMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionByTeamMember")
    public JAXBElement<GetPositionByTeamMember> createGetPositionByTeamMember(GetPositionByTeamMember value) {
        return new JAXBElement<GetPositionByTeamMember>(_GetPositionByTeamMember_QNAME, GetPositionByTeamMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurableFieldsDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "configurableFields")
    public JAXBElement<ConfigurableFieldsDto> createConfigurableFields(ConfigurableFieldsDto value) {
        return new JAXBElement<ConfigurableFieldsDto>(_ConfigurableFields_QNAME, ConfigurableFieldsDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "answer")
    public JAXBElement<AnswerDto> createAnswer(AnswerDto value) {
        return new JAXBElement<AnswerDto>(_Answer_QNAME, AnswerDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationStructureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getOrganizationStructureResponse")
    public JAXBElement<GetOrganizationStructureResponse> createGetOrganizationStructureResponse(GetOrganizationStructureResponse value) {
        return new JAXBElement<GetOrganizationStructureResponse>(_GetOrganizationStructureResponse_QNAME, GetOrganizationStructureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "standardRate")
    public JAXBElement<StandardRate> createStandardRate(StandardRate value) {
        return new JAXBElement<StandardRate>(_StandardRate_QNAME, StandardRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "customField")
    public JAXBElement<CustomField> createCustomField(CustomField value) {
        return new JAXBElement<CustomField>(_CustomField_QNAME, CustomField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "workTime")
    public JAXBElement<WorkTime> createWorkTime(WorkTime value) {
        return new JAXBElement<WorkTime>(_WorkTime_QNAME, WorkTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionsByObsId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionsByObsId")
    public JAXBElement<GetPositionsByObsId> createGetPositionsByObsId(GetPositionsByObsId value) {
        return new JAXBElement<GetPositionsByObsId>(_GetPositionsByObsId_QNAME, GetPositionsByObsId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionsByObsIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionsByObsIdResponse")
    public JAXBElement<GetPositionsByObsIdResponse> createGetPositionsByObsIdResponse(GetPositionsByObsIdResponse value) {
        return new JAXBElement<GetPositionsByObsIdResponse>(_GetPositionsByObsIdResponse_QNAME, GetPositionsByObsIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionByExternalJobNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionByExternalJobNumberResponse")
    public JAXBElement<GetPositionByExternalJobNumberResponse> createGetPositionByExternalJobNumberResponse(GetPositionByExternalJobNumberResponse value) {
        return new JAXBElement<GetPositionByExternalJobNumberResponse>(_GetPositionByExternalJobNumberResponse_QNAME, GetPositionByExternalJobNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeFormFieldDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "freeFormField")
    public JAXBElement<FreeFormFieldDto> createFreeFormField(FreeFormFieldDto value) {
        return new JAXBElement<FreeFormFieldDto>(_FreeFormField_QNAME, FreeFormFieldDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleAssignedQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "question")
    public JAXBElement<SimpleAssignedQuestion> createQuestion(SimpleAssignedQuestion value) {
        return new JAXBElement<SimpleAssignedQuestion>(_Question_QNAME, SimpleAssignedQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getPositionById")
    public JAXBElement<GetPositionById> createGetPositionById(GetPositionById value) {
        return new JAXBElement<GetPositionById>(_GetPositionById_QNAME, GetPositionById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpeningPositionDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "openingPosition")
    public JAXBElement<OpeningPositionDTO> createOpeningPosition(OpeningPositionDTO value) {
        return new JAXBElement<OpeningPositionDTO>(_OpeningPosition_QNAME, OpeningPositionDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updatePosition")
    public JAXBElement<UpdatePosition> createUpdatePosition(UpdatePosition value) {
        return new JAXBElement<UpdatePosition>(_UpdatePosition_QNAME, UpdatePosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionTeam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "positionTeam")
    public JAXBElement<PositionTeam> createPositionTeam(PositionTeam value) {
        return new JAXBElement<PositionTeam>(_PositionTeam_QNAME, PositionTeam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpectedContractDates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "expectedContractDates")
    public JAXBElement<ExpectedContractDates> createExpectedContractDates(ExpectedContractDates value) {
        return new JAXBElement<ExpectedContractDates>(_ExpectedContractDates_QNAME, ExpectedContractDates.class, null, value);
    }

}
