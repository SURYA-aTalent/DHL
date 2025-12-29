
package com.mrted.ws.candidate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mrted.ws.candidate package. 
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

    private final static QName _GetApplicationsResponse_QNAME = new QName("http://ws.mrted.com/", "getApplicationsResponse");
    private final static QName _GetContractsResponse_QNAME = new QName("http://ws.mrted.com/", "getContractsResponse");
    private final static QName _QuestionsAnswered_QNAME = new QName("http://ws.mrted.com/", "questionsAnswered");
    private final static QName _GetCandidateByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getCandidateByIdResponse");
    private final static QName _ListOfValues_QNAME = new QName("http://ws.mrted.com/", "listOfValues");
    private final static QName _Rate_QNAME = new QName("http://ws.mrted.com/", "rate");
    private final static QName _GetApplicationsByCandidateId_QNAME = new QName("http://ws.mrted.com/", "getApplicationsByCandidateId");
    private final static QName _GetTagsForType_QNAME = new QName("http://ws.mrted.com/", "getTagsForType");
    private final static QName _Candidate_QNAME = new QName("http://ws.mrted.com/", "candidate");
    private final static QName _AssignedQuestion_QNAME = new QName("http://ws.mrted.com/", "assignedQuestion");
    private final static QName _GetTagTypes_QNAME = new QName("http://ws.mrted.com/", "getTagTypes");
    private final static QName _GetApplicationsByJobResponse_QNAME = new QName("http://ws.mrted.com/", "getApplicationsByJobResponse");
    private final static QName _GetApplicationsByJob_QNAME = new QName("http://ws.mrted.com/", "getApplicationsByJob");
    private final static QName _LovValue_QNAME = new QName("http://ws.mrted.com/", "lovValue");
    private final static QName _AttachedFile_QNAME = new QName("http://ws.mrted.com/", "attachedFile");
    private final static QName _User_QNAME = new QName("http://ws.mrted.com/", "user");
    private final static QName _EditTagResponse_QNAME = new QName("http://ws.mrted.com/", "editTagResponse");
    private final static QName _GetApplicationsByCandidateIdResponse_QNAME = new QName("http://ws.mrted.com/", "getApplicationsByCandidateIdResponse");
    private final static QName _GetTaggedProfilesResponse_QNAME = new QName("http://ws.mrted.com/", "getTaggedProfilesResponse");
    private final static QName _DetailedApplicationDto_QNAME = new QName("http://ws.mrted.com/", "detailedApplicationDto");
    private final static QName _Application_QNAME = new QName("http://ws.mrted.com/", "application");
    private final static QName _Form_QNAME = new QName("http://ws.mrted.com/", "form");
    private final static QName _GetConsents_QNAME = new QName("http://ws.mrted.com/", "getConsents");
    private final static QName _GetContractsByApplicationIdResponse_QNAME = new QName("http://ws.mrted.com/", "getContractsByApplicationIdResponse");
    private final static QName _GetStructuredDocumentById_QNAME = new QName("http://ws.mrted.com/", "getStructuredDocumentById");
    private final static QName _Schedule_QNAME = new QName("http://ws.mrted.com/", "schedule");
    private final static QName _GetArchivedCandidatesResponse_QNAME = new QName("http://ws.mrted.com/", "getArchivedCandidatesResponse");
    private final static QName _ContractorContract_QNAME = new QName("http://ws.mrted.com/", "contractorContract");
    private final static QName _AcceptCandidateConsentResponse_QNAME = new QName("http://ws.mrted.com/", "acceptCandidateConsentResponse");
    private final static QName _RemoveTagResponse_QNAME = new QName("http://ws.mrted.com/", "removeTagResponse");
    private final static QName _AnswerValidation_QNAME = new QName("http://ws.mrted.com/", "answerValidation");
    private final static QName _FreeFormField_QNAME = new QName("http://ws.mrted.com/", "freeFormField");
    private final static QName _WebServiceException_QNAME = new QName("http://ws.mrted.com/", "WebServiceException");
    private final static QName _QuestionCompetencyCategory_QNAME = new QName("http://ws.mrted.com/", "questionCompetencyCategory");
    private final static QName _UpdateCandidatePifResponse_QNAME = new QName("http://ws.mrted.com/", "updateCandidatePifResponse");
    private final static QName _CreateCandidateViaJobNumberResponse_QNAME = new QName("http://ws.mrted.com/", "createCandidateViaJobNumberResponse");
    private final static QName _Tag_QNAME = new QName("http://ws.mrted.com/", "tag");
    private final static QName _GetStructuredDocumentByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getStructuredDocumentByIdResponse");
    private final static QName _AssignedOption_QNAME = new QName("http://ws.mrted.com/", "assignedOption");
    private final static QName _UploadAttachedFile_QNAME = new QName("http://ws.mrted.com/", "uploadAttachedFile");
    private final static QName _GetCurrentBoCpTemplateByTypeResponse_QNAME = new QName("http://ws.mrted.com/", "getCurrentBoCpTemplateByTypeResponse");
    private final static QName _GetArchivedCandidates_QNAME = new QName("http://ws.mrted.com/", "getArchivedCandidates");
    private final static QName _PersonalData_QNAME = new QName("http://ws.mrted.com/", "personalData");
    private final static QName _GetCandidateStructuredDocumentByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getCandidateStructuredDocumentByIdResponse");
    private final static QName _Option_QNAME = new QName("http://ws.mrted.com/", "option");
    private final static QName _CreateCandidateViaFolder_QNAME = new QName("http://ws.mrted.com/", "createCandidateViaFolder");
    private final static QName _DownloadAttachedFile_QNAME = new QName("http://ws.mrted.com/", "downloadAttachedFile");
    private final static QName _GetApplicationByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getApplicationByIdResponse");
    private final static QName _UploadAttachedFileResponse_QNAME = new QName("http://ws.mrted.com/", "uploadAttachedFileResponse");
    private final static QName _GetGfCandidateProfile_QNAME = new QName("http://ws.mrted.com/", "getGfCandidateProfile");
    private final static QName _GetGfCandidateProfileResponse_QNAME = new QName("http://ws.mrted.com/", "getGfCandidateProfileResponse");
    private final static QName _Candidateprofile_QNAME = new QName("http://ws.mrted.com/", "candidateprofile");
    private final static QName _RateUnit_QNAME = new QName("http://ws.mrted.com/", "rateUnit");
    private final static QName _FormAnswered_QNAME = new QName("http://ws.mrted.com/", "form-answered");
    private final static QName _GetCurrentBoCpTemplateByType_QNAME = new QName("http://ws.mrted.com/", "getCurrentBoCpTemplateByType");
    private final static QName _CreateCandidateViaJobNumber_QNAME = new QName("http://ws.mrted.com/", "createCandidateViaJobNumber");
    private final static QName _DownloadAttachedFileResponse_QNAME = new QName("http://ws.mrted.com/", "downloadAttachedFileResponse");
    private final static QName _GetCandidateHistoryResponse_QNAME = new QName("http://ws.mrted.com/", "getCandidateHistoryResponse");
    private final static QName _DetailedSearchCriteriaDto_QNAME = new QName("http://ws.mrted.com/", "detailedSearchCriteriaDto");
    private final static QName _StructuredDocument_QNAME = new QName("http://ws.mrted.com/", "structuredDocument");
    private final static QName _TagType_QNAME = new QName("http://ws.mrted.com/", "tagType");
    private final static QName _GetApplications_QNAME = new QName("http://ws.mrted.com/", "getApplications");
    private final static QName _GetTagsForTypeResponse_QNAME = new QName("http://ws.mrted.com/", "getTagsForTypeResponse");
    private final static QName _Lov_QNAME = new QName("http://ws.mrted.com/", "lov");
    private final static QName _CreateCandidateViaFolderResponse_QNAME = new QName("http://ws.mrted.com/", "createCandidateViaFolderResponse");
    private final static QName _RevokeCandidateConsent_QNAME = new QName("http://ws.mrted.com/", "revokeCandidateConsent");
    private final static QName _GetTagTypesResponse_QNAME = new QName("http://ws.mrted.com/", "getTagTypesResponse");
    private final static QName _ErrorInfo_QNAME = new QName("http://ws.mrted.com/", "errorInfo");
    private final static QName _Document_QNAME = new QName("http://ws.mrted.com/", "document");
    private final static QName _EditTag_QNAME = new QName("http://ws.mrted.com/", "editTag");
    private final static QName _GetApplicationsByStatus_QNAME = new QName("http://ws.mrted.com/", "getApplicationsByStatus");
    private final static QName _GetCandidatesResponse_QNAME = new QName("http://ws.mrted.com/", "getCandidatesResponse");
    private final static QName _Contractor_QNAME = new QName("http://ws.mrted.com/", "contractor");
    private final static QName _ApplicationFollowup_QNAME = new QName("http://ws.mrted.com/", "applicationFollowup");
    private final static QName _Answer_QNAME = new QName("http://ws.mrted.com/", "answer");
    private final static QName _QuestionLayout_QNAME = new QName("http://ws.mrted.com/", "questionLayout");
    private final static QName _GfDocument_QNAME = new QName("http://ws.mrted.com/", "gf_document");
    private final static QName _Filter_QNAME = new QName("http://ws.mrted.com/", "filter");
    private final static QName _UpdateCandidatePif_QNAME = new QName("http://ws.mrted.com/", "updateCandidatePif");
    private final static QName _GetCandidates_QNAME = new QName("http://ws.mrted.com/", "getCandidates");
    private final static QName _GetCandidateStructuredDocumentById_QNAME = new QName("http://ws.mrted.com/", "getCandidateStructuredDocumentById");
    private final static QName _Question_QNAME = new QName("http://ws.mrted.com/", "question");
    private final static QName _Address_QNAME = new QName("http://ws.mrted.com/", "address");
    private final static QName _GetTaggedProfiles_QNAME = new QName("http://ws.mrted.com/", "getTaggedProfiles");
    private final static QName _RevokeCandidateConsentResponse_QNAME = new QName("http://ws.mrted.com/", "revokeCandidateConsentResponse");
    private final static QName _Keyname_QNAME = new QName("http://ws.mrted.com/", "keyname");
    private final static QName _CreateCandidateViaOpeningResponse_QNAME = new QName("http://ws.mrted.com/", "createCandidateViaOpeningResponse");
    private final static QName _RemoveTag_QNAME = new QName("http://ws.mrted.com/", "removeTag");
    private final static QName _ComplexQuestion_QNAME = new QName("http://ws.mrted.com/", "complex-question");
    private final static QName _AddTagResponse_QNAME = new QName("http://ws.mrted.com/", "addTagResponse");
    private final static QName _GetApplicationById_QNAME = new QName("http://ws.mrted.com/", "getApplicationById");
    private final static QName _GetConsentsResponse_QNAME = new QName("http://ws.mrted.com/", "getConsentsResponse");
    private final static QName _AddTag_QNAME = new QName("http://ws.mrted.com/", "addTag");
    private final static QName _GetCandidateById_QNAME = new QName("http://ws.mrted.com/", "getCandidateById");
    private final static QName _GetContractsByApplicationId_QNAME = new QName("http://ws.mrted.com/", "getContractsByApplicationId");
    private final static QName _GetDetailedApplicants_QNAME = new QName("http://ws.mrted.com/", "getDetailedApplicants");
    private final static QName _FaultDetails_QNAME = new QName("http://ws.mrted.com/", "faultDetails");
    private final static QName _AcceptCandidateConsent_QNAME = new QName("http://ws.mrted.com/", "acceptCandidateConsent");
    private final static QName _PermanentContract_QNAME = new QName("http://ws.mrted.com/", "permanentContract");
    private final static QName _DpConsentDto_QNAME = new QName("http://ws.mrted.com/", "dpConsentDto");
    private final static QName _GetContracts_QNAME = new QName("http://ws.mrted.com/", "getContracts");
    private final static QName _GetCandidateHistory_QNAME = new QName("http://ws.mrted.com/", "getCandidateHistory");
    private final static QName _GetDetailedApplicantsResponse_QNAME = new QName("http://ws.mrted.com/", "getDetailedApplicantsResponse");
    private final static QName _SelectedOption_QNAME = new QName("http://ws.mrted.com/", "selectedOption");
    private final static QName _GetApplicationsByStatusResponse_QNAME = new QName("http://ws.mrted.com/", "getApplicationsByStatusResponse");
    private final static QName _CreateCandidateViaOpening_QNAME = new QName("http://ws.mrted.com/", "createCandidateViaOpening");
    private final static QName _Contract_QNAME = new QName("http://ws.mrted.com/", "contract");
    private final static QName _Profile_QNAME = new QName("http://ws.mrted.com/", "profile");
    private final static QName _AnsweredQuestion_QNAME = new QName("http://ws.mrted.com/", "answered-question");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mrted.ws.candidate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsentDto }
     * 
     */
    public ConsentDto createConsentDto() {
        return new ConsentDto();
    }

    /**
     * Create an instance of {@link AnswerDto }
     * 
     */
    public AnswerDto createAnswerDto() {
        return new AnswerDto();
    }

    /**
     * Create an instance of {@link CandidateHistoryDto }
     * 
     */
    public CandidateHistoryDto createCandidateHistoryDto() {
        return new CandidateHistoryDto();
    }

    /**
     * Create an instance of {@link StructuredDocumentDto }
     * 
     */
    public StructuredDocumentDto createStructuredDocumentDto() {
        return new StructuredDocumentDto();
    }

    /**
     * Create an instance of {@link AssignedQuestionDto }
     * 
     */
    public AssignedQuestionDto createAssignedQuestionDto() {
        return new AssignedQuestionDto();
    }

    /**
     * Create an instance of {@link CandidateIdsDTO }
     * 
     */
    public CandidateIdsDTO createCandidateIdsDTO() {
        return new CandidateIdsDTO();
    }

    /**
     * Create an instance of {@link AssignedOptionDto }
     * 
     */
    public AssignedOptionDto createAssignedOptionDto() {
        return new AssignedOptionDto();
    }

    /**
     * Create an instance of {@link FormDto }
     * 
     */
    public FormDto createFormDto() {
        return new FormDto();
    }

    /**
     * Create an instance of {@link ApplicationDto }
     * 
     */
    public ApplicationDto createApplicationDto() {
        return new ApplicationDto();
    }

    /**
     * Create an instance of {@link QuestionCompetencyCategoryDto }
     * 
     */
    public QuestionCompetencyCategoryDto createQuestionCompetencyCategoryDto() {
        return new QuestionCompetencyCategoryDto();
    }

    /**
     * Create an instance of {@link ListOfValuesDto }
     * 
     */
    public ListOfValuesDto createListOfValuesDto() {
        return new ListOfValuesDto();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link FaultDetails }
     * 
     */
    public FaultDetails createFaultDetails() {
        return new FaultDetails();
    }

    /**
     * Create an instance of {@link DpConsentDto }
     * 
     */
    public DpConsentDto createDpConsentDto() {
        return new DpConsentDto();
    }

    /**
     * Create an instance of {@link ProfileDto }
     * 
     */
    public ProfileDto createProfileDto() {
        return new ProfileDto();
    }

    /**
     * Create an instance of {@link ContractDto }
     * 
     */
    public ContractDto createContractDto() {
        return new ContractDto();
    }

    /**
     * Create an instance of {@link QuestionAnsweredDto }
     * 
     */
    public QuestionAnsweredDto createQuestionAnsweredDto() {
        return new QuestionAnsweredDto();
    }

    /**
     * Create an instance of {@link KeyNameDto }
     * 
     */
    public KeyNameDto createKeyNameDto() {
        return new KeyNameDto();
    }

    /**
     * Create an instance of {@link KeyNameDto.Labels }
     * 
     */
    public KeyNameDto.Labels createKeyNameDtoLabels() {
        return new KeyNameDto.Labels();
    }

    /**
     * Create an instance of {@link ComplexAssignedQuestion }
     * 
     */
    public ComplexAssignedQuestion createComplexAssignedQuestion() {
        return new ComplexAssignedQuestion();
    }

    /**
     * Create an instance of {@link GetCandidateById }
     * 
     */
    public GetCandidateById createGetCandidateById() {
        return new GetCandidateById();
    }

    /**
     * Create an instance of {@link AddTag }
     * 
     */
    public AddTag createAddTag() {
        return new AddTag();
    }

    /**
     * Create an instance of {@link GetApplicationById }
     * 
     */
    public GetApplicationById createGetApplicationById() {
        return new GetApplicationById();
    }

    /**
     * Create an instance of {@link GetConsentsResponse }
     * 
     */
    public GetConsentsResponse createGetConsentsResponse() {
        return new GetConsentsResponse();
    }

    /**
     * Create an instance of {@link AddTagResponse }
     * 
     */
    public AddTagResponse createAddTagResponse() {
        return new AddTagResponse();
    }

    /**
     * Create an instance of {@link CreateCandidateViaOpeningResponse }
     * 
     */
    public CreateCandidateViaOpeningResponse createCreateCandidateViaOpeningResponse() {
        return new CreateCandidateViaOpeningResponse();
    }

    /**
     * Create an instance of {@link RemoveTagByCandidateID }
     * 
     */
    public RemoveTagByCandidateID createRemoveTagByCandidateID() {
        return new RemoveTagByCandidateID();
    }

    /**
     * Create an instance of {@link RevokeCandidateConsentResponse }
     * 
     */
    public RevokeCandidateConsentResponse createRevokeCandidateConsentResponse() {
        return new RevokeCandidateConsentResponse();
    }

    /**
     * Create an instance of {@link CreateCandidateViaOpening }
     * 
     */
    public CreateCandidateViaOpening createCreateCandidateViaOpening() {
        return new CreateCandidateViaOpening();
    }

    /**
     * Create an instance of {@link GetApplicationsByStatusResponse }
     * 
     */
    public GetApplicationsByStatusResponse createGetApplicationsByStatusResponse() {
        return new GetApplicationsByStatusResponse();
    }

    /**
     * Create an instance of {@link GetDetailedApplicantsResponse }
     * 
     */
    public GetDetailedApplicantsResponse createGetDetailedApplicantsResponse() {
        return new GetDetailedApplicantsResponse();
    }

    /**
     * Create an instance of {@link SelectedOption }
     * 
     */
    public SelectedOption createSelectedOption() {
        return new SelectedOption();
    }

    /**
     * Create an instance of {@link GetCandidateHistory }
     * 
     */
    public GetCandidateHistory createGetCandidateHistory() {
        return new GetCandidateHistory();
    }

    /**
     * Create an instance of {@link GetContracts }
     * 
     */
    public GetContracts createGetContracts() {
        return new GetContracts();
    }

    /**
     * Create an instance of {@link PermanentContract }
     * 
     */
    public PermanentContract createPermanentContract() {
        return new PermanentContract();
    }

    /**
     * Create an instance of {@link AcceptCandidateConsent }
     * 
     */
    public AcceptCandidateConsent createAcceptCandidateConsent() {
        return new AcceptCandidateConsent();
    }

    /**
     * Create an instance of {@link GetDetailedApplicants }
     * 
     */
    public GetDetailedApplicants createGetDetailedApplicants() {
        return new GetDetailedApplicants();
    }

    /**
     * Create an instance of {@link GetContractsByApplicationId }
     * 
     */
    public GetContractsByApplicationId createGetContractsByApplicationId() {
        return new GetContractsByApplicationId();
    }

    /**
     * Create an instance of {@link Contractor }
     * 
     */
    public Contractor createContractor() {
        return new Contractor();
    }

    /**
     * Create an instance of {@link GetCandidatesResponse }
     * 
     */
    public GetCandidatesResponse createGetCandidatesResponse() {
        return new GetCandidatesResponse();
    }

    /**
     * Create an instance of {@link GetApplicationsByStatus }
     * 
     */
    public GetApplicationsByStatus createGetApplicationsByStatus() {
        return new GetApplicationsByStatus();
    }

    /**
     * Create an instance of {@link EditTagByCandidateID }
     * 
     */
    public EditTagByCandidateID createEditTagByCandidateID() {
        return new EditTagByCandidateID();
    }

    /**
     * Create an instance of {@link ErrorInfo }
     * 
     */
    public ErrorInfo createErrorInfo() {
        return new ErrorInfo();
    }

    /**
     * Create an instance of {@link RevokeCandidateConsent }
     * 
     */
    public RevokeCandidateConsent createRevokeCandidateConsent() {
        return new RevokeCandidateConsent();
    }

    /**
     * Create an instance of {@link GetTagTypesResponse }
     * 
     */
    public GetTagTypesResponse createGetTagTypesResponse() {
        return new GetTagTypesResponse();
    }

    /**
     * Create an instance of {@link CreateCandidateViaFolderResponse }
     * 
     */
    public CreateCandidateViaFolderResponse createCreateCandidateViaFolderResponse() {
        return new CreateCandidateViaFolderResponse();
    }

    /**
     * Create an instance of {@link GetTagsForTypeResponse }
     * 
     */
    public GetTagsForTypeResponse createGetTagsForTypeResponse() {
        return new GetTagsForTypeResponse();
    }

    /**
     * Create an instance of {@link GetApplications }
     * 
     */
    public GetApplications createGetApplications() {
        return new GetApplications();
    }

    /**
     * Create an instance of {@link TagType }
     * 
     */
    public TagType createTagType() {
        return new TagType();
    }

    /**
     * Create an instance of {@link DetailedSearchCriteriaDto }
     * 
     */
    public DetailedSearchCriteriaDto createDetailedSearchCriteriaDto() {
        return new DetailedSearchCriteriaDto();
    }

    /**
     * Create an instance of {@link StructuredDocument }
     * 
     */
    public StructuredDocument createStructuredDocument() {
        return new StructuredDocument();
    }

    /**
     * Create an instance of {@link GetCandidateHistoryResponse }
     * 
     */
    public GetCandidateHistoryResponse createGetCandidateHistoryResponse() {
        return new GetCandidateHistoryResponse();
    }

    /**
     * Create an instance of {@link CreateCandidateViaJobNumber }
     * 
     */
    public CreateCandidateViaJobNumber createCreateCandidateViaJobNumber() {
        return new CreateCandidateViaJobNumber();
    }

    /**
     * Create an instance of {@link DownloadAttachedFileResponse }
     * 
     */
    public DownloadAttachedFileResponse createDownloadAttachedFileResponse() {
        return new DownloadAttachedFileResponse();
    }

    /**
     * Create an instance of {@link GetCurrentBoCpTemplateByType }
     * 
     */
    public GetCurrentBoCpTemplateByType createGetCurrentBoCpTemplateByType() {
        return new GetCurrentBoCpTemplateByType();
    }

    /**
     * Create an instance of {@link FormAnsweredDto }
     * 
     */
    public FormAnsweredDto createFormAnsweredDto() {
        return new FormAnsweredDto();
    }

    /**
     * Create an instance of {@link GetTaggedProfiles }
     * 
     */
    public GetTaggedProfiles createGetTaggedProfiles() {
        return new GetTaggedProfiles();
    }

    /**
     * Create an instance of {@link AddressFDto }
     * 
     */
    public AddressFDto createAddressFDto() {
        return new AddressFDto();
    }

    /**
     * Create an instance of {@link SimpleAssignedQuestion }
     * 
     */
    public SimpleAssignedQuestion createSimpleAssignedQuestion() {
        return new SimpleAssignedQuestion();
    }

    /**
     * Create an instance of {@link GetCandidateStructuredDocumentById }
     * 
     */
    public GetCandidateStructuredDocumentById createGetCandidateStructuredDocumentById() {
        return new GetCandidateStructuredDocumentById();
    }

    /**
     * Create an instance of {@link GetCandidates }
     * 
     */
    public GetCandidates createGetCandidates() {
        return new GetCandidates();
    }

    /**
     * Create an instance of {@link UpdateCandidatePif }
     * 
     */
    public UpdateCandidatePif createUpdateCandidatePif() {
        return new UpdateCandidatePif();
    }

    /**
     * Create an instance of {@link ConsentSearchCriteriaDto }
     * 
     */
    public ConsentSearchCriteriaDto createConsentSearchCriteriaDto() {
        return new ConsentSearchCriteriaDto();
    }

    /**
     * Create an instance of {@link GfDocument }
     * 
     */
    public GfDocument createGfDocument() {
        return new GfDocument();
    }

    /**
     * Create an instance of {@link QuestionLayoutDto }
     * 
     */
    public QuestionLayoutDto createQuestionLayoutDto() {
        return new QuestionLayoutDto();
    }

    /**
     * Create an instance of {@link ApplicationFollowup }
     * 
     */
    public ApplicationFollowup createApplicationFollowup() {
        return new ApplicationFollowup();
    }

    /**
     * Create an instance of {@link GetCandidateStructuredDocumentByIdResponse }
     * 
     */
    public GetCandidateStructuredDocumentByIdResponse createGetCandidateStructuredDocumentByIdResponse() {
        return new GetCandidateStructuredDocumentByIdResponse();
    }

    /**
     * Create an instance of {@link GetArchivedCandidates }
     * 
     */
    public GetArchivedCandidates createGetArchivedCandidates() {
        return new GetArchivedCandidates();
    }

    /**
     * Create an instance of {@link PersonalDataDto }
     * 
     */
    public PersonalDataDto createPersonalDataDto() {
        return new PersonalDataDto();
    }

    /**
     * Create an instance of {@link GetCurrentBoCpTemplateByTypeResponse }
     * 
     */
    public GetCurrentBoCpTemplateByTypeResponse createGetCurrentBoCpTemplateByTypeResponse() {
        return new GetCurrentBoCpTemplateByTypeResponse();
    }

    /**
     * Create an instance of {@link UploadAttachedFile }
     * 
     */
    public UploadAttachedFile createUploadAttachedFile() {
        return new UploadAttachedFile();
    }

    /**
     * Create an instance of {@link GetStructuredDocumentByIdResponse }
     * 
     */
    public GetStructuredDocumentByIdResponse createGetStructuredDocumentByIdResponse() {
        return new GetStructuredDocumentByIdResponse();
    }

    /**
     * Create an instance of {@link Tag }
     * 
     */
    public Tag createTag() {
        return new Tag();
    }

    /**
     * Create an instance of {@link CreateCandidateViaJobNumberResponse }
     * 
     */
    public CreateCandidateViaJobNumberResponse createCreateCandidateViaJobNumberResponse() {
        return new CreateCandidateViaJobNumberResponse();
    }

    /**
     * Create an instance of {@link RateUnit }
     * 
     */
    public RateUnit createRateUnit() {
        return new RateUnit();
    }

    /**
     * Create an instance of {@link CandidateProfile }
     * 
     */
    public CandidateProfile createCandidateProfile() {
        return new CandidateProfile();
    }

    /**
     * Create an instance of {@link GetGfCandidateProfileResponse }
     * 
     */
    public GetGfCandidateProfileResponse createGetGfCandidateProfileResponse() {
        return new GetGfCandidateProfileResponse();
    }

    /**
     * Create an instance of {@link GetGfCandidateProfile }
     * 
     */
    public GetGfCandidateProfile createGetGfCandidateProfile() {
        return new GetGfCandidateProfile();
    }

    /**
     * Create an instance of {@link GetApplicationByIdResponse }
     * 
     */
    public GetApplicationByIdResponse createGetApplicationByIdResponse() {
        return new GetApplicationByIdResponse();
    }

    /**
     * Create an instance of {@link UploadAttachedFileResponse }
     * 
     */
    public UploadAttachedFileResponse createUploadAttachedFileResponse() {
        return new UploadAttachedFileResponse();
    }

    /**
     * Create an instance of {@link DownloadAttachedFile }
     * 
     */
    public DownloadAttachedFile createDownloadAttachedFile() {
        return new DownloadAttachedFile();
    }

    /**
     * Create an instance of {@link CreateCandidateViaFolder }
     * 
     */
    public CreateCandidateViaFolder createCreateCandidateViaFolder() {
        return new CreateCandidateViaFolder();
    }

    /**
     * Create an instance of {@link OptionDto }
     * 
     */
    public OptionDto createOptionDto() {
        return new OptionDto();
    }

    /**
     * Create an instance of {@link GetApplicationsByJob }
     * 
     */
    public GetApplicationsByJob createGetApplicationsByJob() {
        return new GetApplicationsByJob();
    }

    /**
     * Create an instance of {@link GetApplicationsByJobResponse }
     * 
     */
    public GetApplicationsByJobResponse createGetApplicationsByJobResponse() {
        return new GetApplicationsByJobResponse();
    }

    /**
     * Create an instance of {@link GetTagTypes }
     * 
     */
    public GetTagTypes createGetTagTypes() {
        return new GetTagTypes();
    }

    /**
     * Create an instance of {@link GetTagsForType }
     * 
     */
    public GetTagsForType createGetTagsForType() {
        return new GetTagsForType();
    }

    /**
     * Create an instance of {@link GetApplicationsByCandidateId }
     * 
     */
    public GetApplicationsByCandidateId createGetApplicationsByCandidateId() {
        return new GetApplicationsByCandidateId();
    }

    /**
     * Create an instance of {@link GetCandidateByIdResponse }
     * 
     */
    public GetCandidateByIdResponse createGetCandidateByIdResponse() {
        return new GetCandidateByIdResponse();
    }

    /**
     * Create an instance of {@link Rate }
     * 
     */
    public Rate createRate() {
        return new Rate();
    }

    /**
     * Create an instance of {@link GetContractsResponse }
     * 
     */
    public GetContractsResponse createGetContractsResponse() {
        return new GetContractsResponse();
    }

    /**
     * Create an instance of {@link QuestionsAnsweredDto }
     * 
     */
    public QuestionsAnsweredDto createQuestionsAnsweredDto() {
        return new QuestionsAnsweredDto();
    }

    /**
     * Create an instance of {@link GetApplicationsResponse }
     * 
     */
    public GetApplicationsResponse createGetApplicationsResponse() {
        return new GetApplicationsResponse();
    }

    /**
     * Create an instance of {@link UpdateCandidatePifResponse }
     * 
     */
    public UpdateCandidatePifResponse createUpdateCandidatePifResponse() {
        return new UpdateCandidatePifResponse();
    }

    /**
     * Create an instance of {@link FreeFormFieldContract }
     * 
     */
    public FreeFormFieldContract createFreeFormFieldContract() {
        return new FreeFormFieldContract();
    }

    /**
     * Create an instance of {@link AnswerValidationDto }
     * 
     */
    public AnswerValidationDto createAnswerValidationDto() {
        return new AnswerValidationDto();
    }

    /**
     * Create an instance of {@link RemoveTagByCandidateIDResponse }
     * 
     */
    public RemoveTagByCandidateIDResponse createRemoveTagByCandidateIDResponse() {
        return new RemoveTagByCandidateIDResponse();
    }

    /**
     * Create an instance of {@link AcceptCandidateConsentResponse }
     * 
     */
    public AcceptCandidateConsentResponse createAcceptCandidateConsentResponse() {
        return new AcceptCandidateConsentResponse();
    }

    /**
     * Create an instance of {@link ContractorContract }
     * 
     */
    public ContractorContract createContractorContract() {
        return new ContractorContract();
    }

    /**
     * Create an instance of {@link GetArchivedCandidatesResponse }
     * 
     */
    public GetArchivedCandidatesResponse createGetArchivedCandidatesResponse() {
        return new GetArchivedCandidatesResponse();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link GetStructuredDocumentById }
     * 
     */
    public GetStructuredDocumentById createGetStructuredDocumentById() {
        return new GetStructuredDocumentById();
    }

    /**
     * Create an instance of {@link GetContractsByApplicationIdResponse }
     * 
     */
    public GetContractsByApplicationIdResponse createGetContractsByApplicationIdResponse() {
        return new GetContractsByApplicationIdResponse();
    }

    /**
     * Create an instance of {@link GetConsents }
     * 
     */
    public GetConsents createGetConsents() {
        return new GetConsents();
    }

    /**
     * Create an instance of {@link DetailedApplicationDto }
     * 
     */
    public DetailedApplicationDto createDetailedApplicationDto() {
        return new DetailedApplicationDto();
    }

    /**
     * Create an instance of {@link GetTaggedProfilesResponse }
     * 
     */
    public GetTaggedProfilesResponse createGetTaggedProfilesResponse() {
        return new GetTaggedProfilesResponse();
    }

    /**
     * Create an instance of {@link GetApplicationsByCandidateIdResponse }
     * 
     */
    public GetApplicationsByCandidateIdResponse createGetApplicationsByCandidateIdResponse() {
        return new GetApplicationsByCandidateIdResponse();
    }

    /**
     * Create an instance of {@link EditTagByCandidateIDResponse }
     * 
     */
    public EditTagByCandidateIDResponse createEditTagByCandidateIDResponse() {
        return new EditTagByCandidateIDResponse();
    }

    /**
     * Create an instance of {@link UserDto }
     * 
     */
    public UserDto createUserDto() {
        return new UserDto();
    }

    /**
     * Create an instance of {@link AttachedFileDto }
     * 
     */
    public AttachedFileDto createAttachedFileDto() {
        return new AttachedFileDto();
    }

    /**
     * Create an instance of {@link SimpleLovValueDto }
     * 
     */
    public SimpleLovValueDto createSimpleLovValueDto() {
        return new SimpleLovValueDto();
    }

    /**
     * Create an instance of {@link RateType }
     * 
     */
    public RateType createRateType() {
        return new RateType();
    }

    /**
     * Create an instance of {@link CandidateHistoryEntryDto }
     * 
     */
    public CandidateHistoryEntryDto createCandidateHistoryEntryDto() {
        return new CandidateHistoryEntryDto();
    }

    /**
     * Create an instance of {@link WorkUnit }
     * 
     */
    public WorkUnit createWorkUnit() {
        return new WorkUnit();
    }

    /**
     * Create an instance of {@link ContractorType }
     * 
     */
    public ContractorType createContractorType() {
        return new ContractorType();
    }

    /**
     * Create an instance of {@link CompensationPeriod }
     * 
     */
    public CompensationPeriod createCompensationPeriod() {
        return new CompensationPeriod();
    }

    /**
     * Create an instance of {@link LocalizedValueDto }
     * 
     */
    public LocalizedValueDto createLocalizedValueDto() {
        return new LocalizedValueDto();
    }

    /**
     * Create an instance of {@link ApplicationSrcType }
     * 
     */
    public ApplicationSrcType createApplicationSrcType() {
        return new ApplicationSrcType();
    }

    /**
     * Create an instance of {@link ScheduleType }
     * 
     */
    public ScheduleType createScheduleType() {
        return new ScheduleType();
    }

    /**
     * Create an instance of {@link FormCategoryDto }
     * 
     */
    public FormCategoryDto createFormCategoryDto() {
        return new FormCategoryDto();
    }

    /**
     * Create an instance of {@link CandidateConsentSearchDto }
     * 
     */
    public CandidateConsentSearchDto createCandidateConsentSearchDto() {
        return new CandidateConsentSearchDto();
    }

    /**
     * Create an instance of {@link CandidateStatus }
     * 
     */
    public CandidateStatus createCandidateStatus() {
        return new CandidateStatus();
    }

    /**
     * Create an instance of {@link ArchivedCandidatesFiltersDto }
     * 
     */
    public ArchivedCandidatesFiltersDto createArchivedCandidatesFiltersDto() {
        return new ArchivedCandidatesFiltersDto();
    }

    /**
     * Create an instance of {@link CandidateHistoryFiltersDto }
     * 
     */
    public CandidateHistoryFiltersDto createCandidateHistoryFiltersDto() {
        return new CandidateHistoryFiltersDto();
    }

    /**
     * Create an instance of {@link DocumentBaseDto }
     * 
     */
    public DocumentBaseDto createDocumentBaseDto() {
        return new DocumentBaseDto();
    }

    /**
     * Create an instance of {@link FormContextDto }
     * 
     */
    public FormContextDto createFormContextDto() {
        return new FormContextDto();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link GenericLov }
     * 
     */
    public GenericLov createGenericLov() {
        return new GenericLov();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Sex }
     * 
     */
    public Sex createSex() {
        return new Sex();
    }

    /**
     * Create an instance of {@link Answer }
     * 
     */
    public Answer createAnswer() {
        return new Answer();
    }

    /**
     * Create an instance of {@link LocalizedValues }
     * 
     */
    public LocalizedValues createLocalizedValues() {
        return new LocalizedValues();
    }

    /**
     * Create an instance of {@link PersonalData }
     * 
     */
    public PersonalData createPersonalData() {
        return new PersonalData();
    }

    /**
     * Create an instance of {@link DataPrivacy }
     * 
     */
    public DataPrivacy createDataPrivacy() {
        return new DataPrivacy();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link AssignedOption }
     * 
     */
    public AssignedOption createAssignedOption() {
        return new AssignedOption();
    }

    /**
     * Create an instance of {@link LovValueDto }
     * 
     */
    public LovValueDto createLovValueDto() {
        return new LovValueDto();
    }

    /**
     * Create an instance of {@link ShortApplication }
     * 
     */
    public ShortApplication createShortApplication() {
        return new ShortApplication();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link LocationSearchCriteriaDto }
     * 
     */
    public LocationSearchCriteriaDto createLocationSearchCriteriaDto() {
        return new LocationSearchCriteriaDto();
    }

    /**
     * Create an instance of {@link CandidateConsentDto }
     * 
     */
    public CandidateConsentDto createCandidateConsentDto() {
        return new CandidateConsentDto();
    }

    /**
     * Create an instance of {@link CandidateSearchCriteriaDTO }
     * 
     */
    public CandidateSearchCriteriaDTO createCandidateSearchCriteriaDTO() {
        return new CandidateSearchCriteriaDTO();
    }

    /**
     * Create an instance of {@link WorkPeriod }
     * 
     */
    public WorkPeriod createWorkPeriod() {
        return new WorkPeriod();
    }

    /**
     * Create an instance of {@link RateUnitType }
     * 
     */
    public RateUnitType createRateUnitType() {
        return new RateUnitType();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link DefCondFrom }
     * 
     */
    public DefCondFrom createDefCondFrom() {
        return new DefCondFrom();
    }

    /**
     * Create an instance of {@link MaritalStatus }
     * 
     */
    public MaritalStatus createMaritalStatus() {
        return new MaritalStatus();
    }

    /**
     * Create an instance of {@link QuestionBaseDto }
     * 
     */
    public QuestionBaseDto createQuestionBaseDto() {
        return new QuestionBaseDto();
    }

    /**
     * Create an instance of {@link AssignedQuestion }
     * 
     */
    public AssignedQuestion createAssignedQuestion() {
        return new AssignedQuestion();
    }

    /**
     * Create an instance of {@link SourcingMedium }
     * 
     */
    public SourcingMedium createSourcingMedium() {
        return new SourcingMedium();
    }

    /**
     * Create an instance of {@link Citizenship }
     * 
     */
    public Citizenship createCitizenship() {
        return new Citizenship();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link CandidateHistorySearchCriteriaDto }
     * 
     */
    public CandidateHistorySearchCriteriaDto createCandidateHistorySearchCriteriaDto() {
        return new CandidateHistorySearchCriteriaDto();
    }

    /**
     * Create an instance of {@link ConsentDto.Department }
     * 
     */
    public ConsentDto.Department createConsentDtoDepartment() {
        return new ConsentDto.Department();
    }

    /**
     * Create an instance of {@link AnswerDto.Values }
     * 
     */
    public AnswerDto.Values createAnswerDtoValues() {
        return new AnswerDto.Values();
    }

    /**
     * Create an instance of {@link CandidateHistoryDto.CandidateHistoryEntries }
     * 
     */
    public CandidateHistoryDto.CandidateHistoryEntries createCandidateHistoryDtoCandidateHistoryEntries() {
        return new CandidateHistoryDto.CandidateHistoryEntries();
    }

    /**
     * Create an instance of {@link CandidateHistoryDto.ManualCandidateHistoryEntries }
     * 
     */
    public CandidateHistoryDto.ManualCandidateHistoryEntries createCandidateHistoryDtoManualCandidateHistoryEntries() {
        return new CandidateHistoryDto.ManualCandidateHistoryEntries();
    }

    /**
     * Create an instance of {@link StructuredDocumentDto.Questions }
     * 
     */
    public StructuredDocumentDto.Questions createStructuredDocumentDtoQuestions() {
        return new StructuredDocumentDto.Questions();
    }

    /**
     * Create an instance of {@link AssignedQuestionDto.AssignedOptions }
     * 
     */
    public AssignedQuestionDto.AssignedOptions createAssignedQuestionDtoAssignedOptions() {
        return new AssignedQuestionDto.AssignedOptions();
    }

    /**
     * Create an instance of {@link AssignedQuestionDto.Children }
     * 
     */
    public AssignedQuestionDto.Children createAssignedQuestionDtoChildren() {
        return new AssignedQuestionDto.Children();
    }

    /**
     * Create an instance of {@link CandidateIdsDTO.Result }
     * 
     */
    public CandidateIdsDTO.Result createCandidateIdsDTOResult() {
        return new CandidateIdsDTO.Result();
    }

    /**
     * Create an instance of {@link AssignedOptionDto.DependingQuestionIds }
     * 
     */
    public AssignedOptionDto.DependingQuestionIds createAssignedOptionDtoDependingQuestionIds() {
        return new AssignedOptionDto.DependingQuestionIds();
    }

    /**
     * Create an instance of {@link FormDto.CompetencyCategories }
     * 
     */
    public FormDto.CompetencyCategories createFormDtoCompetencyCategories() {
        return new FormDto.CompetencyCategories();
    }

    /**
     * Create an instance of {@link FormDto.AssignedQuestions }
     * 
     */
    public FormDto.AssignedQuestions createFormDtoAssignedQuestions() {
        return new FormDto.AssignedQuestions();
    }

    /**
     * Create an instance of {@link FormDto.Lovs }
     * 
     */
    public FormDto.Lovs createFormDtoLovs() {
        return new FormDto.Lovs();
    }

    /**
     * Create an instance of {@link ApplicationDto.ApplicationHistory }
     * 
     */
    public ApplicationDto.ApplicationHistory createApplicationDtoApplicationHistory() {
        return new ApplicationDto.ApplicationHistory();
    }

    /**
     * Create an instance of {@link ApplicationDto.Documents }
     * 
     */
    public ApplicationDto.Documents createApplicationDtoDocuments() {
        return new ApplicationDto.Documents();
    }

    /**
     * Create an instance of {@link ApplicationDto.CandidateConsents }
     * 
     */
    public ApplicationDto.CandidateConsents createApplicationDtoCandidateConsents() {
        return new ApplicationDto.CandidateConsents();
    }

    /**
     * Create an instance of {@link QuestionCompetencyCategoryDto.Options }
     * 
     */
    public QuestionCompetencyCategoryDto.Options createQuestionCompetencyCategoryDtoOptions() {
        return new QuestionCompetencyCategoryDto.Options();
    }

    /**
     * Create an instance of {@link ListOfValuesDto.Values }
     * 
     */
    public ListOfValuesDto.Values createListOfValuesDtoValues() {
        return new ListOfValuesDto.Values();
    }

    /**
     * Create an instance of {@link Profile.Tags }
     * 
     */
    public Profile.Tags createProfileTags() {
        return new Profile.Tags();
    }

    /**
     * Create an instance of {@link Profile.CandidateConsents }
     * 
     */
    public Profile.CandidateConsents createProfileCandidateConsents() {
        return new Profile.CandidateConsents();
    }

    /**
     * Create an instance of {@link FaultDetails.Errors }
     * 
     */
    public FaultDetails.Errors createFaultDetailsErrors() {
        return new FaultDetails.Errors();
    }

    /**
     * Create an instance of {@link DpConsentDto.Department }
     * 
     */
    public DpConsentDto.Department createDpConsentDtoDepartment() {
        return new DpConsentDto.Department();
    }

    /**
     * Create an instance of {@link ProfileDto.Tags }
     * 
     */
    public ProfileDto.Tags createProfileDtoTags() {
        return new ProfileDto.Tags();
    }

    /**
     * Create an instance of {@link ContractDto.ContractorRates }
     * 
     */
    public ContractDto.ContractorRates createContractDtoContractorRates() {
        return new ContractDto.ContractorRates();
    }

    /**
     * Create an instance of {@link ContractDto.FreeFormFields }
     * 
     */
    public ContractDto.FreeFormFields createContractDtoFreeFormFields() {
        return new ContractDto.FreeFormFields();
    }

    /**
     * Create an instance of {@link ContractDto.Lovs }
     * 
     */
    public ContractDto.Lovs createContractDtoLovs() {
        return new ContractDto.Lovs();
    }

    /**
     * Create an instance of {@link QuestionAnsweredDto.Children }
     * 
     */
    public QuestionAnsweredDto.Children createQuestionAnsweredDtoChildren() {
        return new QuestionAnsweredDto.Children();
    }

    /**
     * Create an instance of {@link QuestionAnsweredDto.SelectedAssignedOptionIds }
     * 
     */
    public QuestionAnsweredDto.SelectedAssignedOptionIds createQuestionAnsweredDtoSelectedAssignedOptionIds() {
        return new QuestionAnsweredDto.SelectedAssignedOptionIds();
    }

    /**
     * Create an instance of {@link KeyNameDto.Labels.Entry }
     * 
     */
    public KeyNameDto.Labels.Entry createKeyNameDtoLabelsEntry() {
        return new KeyNameDto.Labels.Entry();
    }

    /**
     * Create an instance of {@link ComplexAssignedQuestion.Children }
     * 
     */
    public ComplexAssignedQuestion.Children createComplexAssignedQuestionChildren() {
        return new ComplexAssignedQuestion.Children();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getApplicationsResponse")
    public JAXBElement<GetApplicationsResponse> createGetApplicationsResponse(GetApplicationsResponse value) {
        return new JAXBElement<GetApplicationsResponse>(_GetApplicationsResponse_QNAME, GetApplicationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getContractsResponse")
    public JAXBElement<GetContractsResponse> createGetContractsResponse(GetContractsResponse value) {
        return new JAXBElement<GetContractsResponse>(_GetContractsResponse_QNAME, GetContractsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuestionsAnsweredDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "questionsAnswered")
    public JAXBElement<QuestionsAnsweredDto> createQuestionsAnswered(QuestionsAnsweredDto value) {
        return new JAXBElement<QuestionsAnsweredDto>(_QuestionsAnswered_QNAME, QuestionsAnsweredDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCandidateByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCandidateByIdResponse")
    public JAXBElement<GetCandidateByIdResponse> createGetCandidateByIdResponse(GetCandidateByIdResponse value) {
        return new JAXBElement<GetCandidateByIdResponse>(_GetCandidateByIdResponse_QNAME, GetCandidateByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfValuesDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "listOfValues")
    public JAXBElement<ListOfValuesDto> createListOfValues(ListOfValuesDto value) {
        return new JAXBElement<ListOfValuesDto>(_ListOfValues_QNAME, ListOfValuesDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "rate")
    public JAXBElement<Rate> createRate(Rate value) {
        return new JAXBElement<Rate>(_Rate_QNAME, Rate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationsByCandidateId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getApplicationsByCandidateId")
    public JAXBElement<GetApplicationsByCandidateId> createGetApplicationsByCandidateId(GetApplicationsByCandidateId value) {
        return new JAXBElement<GetApplicationsByCandidateId>(_GetApplicationsByCandidateId_QNAME, GetApplicationsByCandidateId.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "candidate")
    public JAXBElement<Profile> createCandidate(Profile value) {
        return new JAXBElement<Profile>(_Candidate_QNAME, Profile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "assignedQuestion")
    public JAXBElement<Object> createAssignedQuestion(Object value) {
        return new JAXBElement<Object>(_AssignedQuestion_QNAME, Object.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationsByJobResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getApplicationsByJobResponse")
    public JAXBElement<GetApplicationsByJobResponse> createGetApplicationsByJobResponse(GetApplicationsByJobResponse value) {
        return new JAXBElement<GetApplicationsByJobResponse>(_GetApplicationsByJobResponse_QNAME, GetApplicationsByJobResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationsByJob }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getApplicationsByJob")
    public JAXBElement<GetApplicationsByJob> createGetApplicationsByJob(GetApplicationsByJob value) {
        return new JAXBElement<GetApplicationsByJob>(_GetApplicationsByJob_QNAME, GetApplicationsByJob.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "lovValue")
    public JAXBElement<Object> createLovValue(Object value) {
        return new JAXBElement<Object>(_LovValue_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachedFileDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "attachedFile")
    public JAXBElement<AttachedFileDto> createAttachedFile(AttachedFileDto value) {
        return new JAXBElement<AttachedFileDto>(_AttachedFile_QNAME, AttachedFileDto.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EditTagByCandidateIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "editTagResponse")
    public JAXBElement<EditTagByCandidateIDResponse> createEditTagResponse(EditTagByCandidateIDResponse value) {
        return new JAXBElement<EditTagByCandidateIDResponse>(_EditTagResponse_QNAME, EditTagByCandidateIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationsByCandidateIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getApplicationsByCandidateIdResponse")
    public JAXBElement<GetApplicationsByCandidateIdResponse> createGetApplicationsByCandidateIdResponse(GetApplicationsByCandidateIdResponse value) {
        return new JAXBElement<GetApplicationsByCandidateIdResponse>(_GetApplicationsByCandidateIdResponse_QNAME, GetApplicationsByCandidateIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaggedProfilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getTaggedProfilesResponse")
    public JAXBElement<GetTaggedProfilesResponse> createGetTaggedProfilesResponse(GetTaggedProfilesResponse value) {
        return new JAXBElement<GetTaggedProfilesResponse>(_GetTaggedProfilesResponse_QNAME, GetTaggedProfilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailedApplicationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "detailedApplicationDto")
    public JAXBElement<DetailedApplicationDto> createDetailedApplicationDto(DetailedApplicationDto value) {
        return new JAXBElement<DetailedApplicationDto>(_DetailedApplicationDto_QNAME, DetailedApplicationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "application")
    public JAXBElement<ApplicationDto> createApplication(ApplicationDto value) {
        return new JAXBElement<ApplicationDto>(_Application_QNAME, ApplicationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "form")
    public JAXBElement<FormDto> createForm(FormDto value) {
        return new JAXBElement<FormDto>(_Form_QNAME, FormDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getConsents")
    public JAXBElement<GetConsents> createGetConsents(GetConsents value) {
        return new JAXBElement<GetConsents>(_GetConsents_QNAME, GetConsents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractsByApplicationIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getContractsByApplicationIdResponse")
    public JAXBElement<GetContractsByApplicationIdResponse> createGetContractsByApplicationIdResponse(GetContractsByApplicationIdResponse value) {
        return new JAXBElement<GetContractsByApplicationIdResponse>(_GetContractsByApplicationIdResponse_QNAME, GetContractsByApplicationIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStructuredDocumentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getStructuredDocumentById")
    public JAXBElement<GetStructuredDocumentById> createGetStructuredDocumentById(GetStructuredDocumentById value) {
        return new JAXBElement<GetStructuredDocumentById>(_GetStructuredDocumentById_QNAME, GetStructuredDocumentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Schedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "schedule")
    public JAXBElement<Schedule> createSchedule(Schedule value) {
        return new JAXBElement<Schedule>(_Schedule_QNAME, Schedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArchivedCandidatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getArchivedCandidatesResponse")
    public JAXBElement<GetArchivedCandidatesResponse> createGetArchivedCandidatesResponse(GetArchivedCandidatesResponse value) {
        return new JAXBElement<GetArchivedCandidatesResponse>(_GetArchivedCandidatesResponse_QNAME, GetArchivedCandidatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractorContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "contractorContract")
    public JAXBElement<ContractorContract> createContractorContract(ContractorContract value) {
        return new JAXBElement<ContractorContract>(_ContractorContract_QNAME, ContractorContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptCandidateConsentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "acceptCandidateConsentResponse")
    public JAXBElement<AcceptCandidateConsentResponse> createAcceptCandidateConsentResponse(AcceptCandidateConsentResponse value) {
        return new JAXBElement<AcceptCandidateConsentResponse>(_AcceptCandidateConsentResponse_QNAME, AcceptCandidateConsentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTagByCandidateIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeTagResponse")
    public JAXBElement<RemoveTagByCandidateIDResponse> createRemoveTagResponse(RemoveTagByCandidateIDResponse value) {
        return new JAXBElement<RemoveTagByCandidateIDResponse>(_RemoveTagResponse_QNAME, RemoveTagByCandidateIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnswerValidationDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "answerValidation")
    public JAXBElement<AnswerValidationDto> createAnswerValidation(AnswerValidationDto value) {
        return new JAXBElement<AnswerValidationDto>(_AnswerValidation_QNAME, AnswerValidationDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeFormFieldContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "freeFormField")
    public JAXBElement<FreeFormFieldContract> createFreeFormField(FreeFormFieldContract value) {
        return new JAXBElement<FreeFormFieldContract>(_FreeFormField_QNAME, FreeFormFieldContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "WebServiceException")
    public JAXBElement<FaultDetails> createWebServiceException(FaultDetails value) {
        return new JAXBElement<FaultDetails>(_WebServiceException_QNAME, FaultDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuestionCompetencyCategoryDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "questionCompetencyCategory")
    public JAXBElement<QuestionCompetencyCategoryDto> createQuestionCompetencyCategory(QuestionCompetencyCategoryDto value) {
        return new JAXBElement<QuestionCompetencyCategoryDto>(_QuestionCompetencyCategory_QNAME, QuestionCompetencyCategoryDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCandidatePifResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updateCandidatePifResponse")
    public JAXBElement<UpdateCandidatePifResponse> createUpdateCandidatePifResponse(UpdateCandidatePifResponse value) {
        return new JAXBElement<UpdateCandidatePifResponse>(_UpdateCandidatePifResponse_QNAME, UpdateCandidatePifResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCandidateViaJobNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "createCandidateViaJobNumberResponse")
    public JAXBElement<CreateCandidateViaJobNumberResponse> createCreateCandidateViaJobNumberResponse(CreateCandidateViaJobNumberResponse value) {
        return new JAXBElement<CreateCandidateViaJobNumberResponse>(_CreateCandidateViaJobNumberResponse_QNAME, CreateCandidateViaJobNumberResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStructuredDocumentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getStructuredDocumentByIdResponse")
    public JAXBElement<GetStructuredDocumentByIdResponse> createGetStructuredDocumentByIdResponse(GetStructuredDocumentByIdResponse value) {
        return new JAXBElement<GetStructuredDocumentByIdResponse>(_GetStructuredDocumentByIdResponse_QNAME, GetStructuredDocumentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "assignedOption")
    public JAXBElement<Object> createAssignedOption(Object value) {
        return new JAXBElement<Object>(_AssignedOption_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadAttachedFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "uploadAttachedFile")
    public JAXBElement<UploadAttachedFile> createUploadAttachedFile(UploadAttachedFile value) {
        return new JAXBElement<UploadAttachedFile>(_UploadAttachedFile_QNAME, UploadAttachedFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentBoCpTemplateByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCurrentBoCpTemplateByTypeResponse")
    public JAXBElement<GetCurrentBoCpTemplateByTypeResponse> createGetCurrentBoCpTemplateByTypeResponse(GetCurrentBoCpTemplateByTypeResponse value) {
        return new JAXBElement<GetCurrentBoCpTemplateByTypeResponse>(_GetCurrentBoCpTemplateByTypeResponse_QNAME, GetCurrentBoCpTemplateByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArchivedCandidates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getArchivedCandidates")
    public JAXBElement<GetArchivedCandidates> createGetArchivedCandidates(GetArchivedCandidates value) {
        return new JAXBElement<GetArchivedCandidates>(_GetArchivedCandidates_QNAME, GetArchivedCandidates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalDataDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "personalData")
    public JAXBElement<PersonalDataDto> createPersonalData(PersonalDataDto value) {
        return new JAXBElement<PersonalDataDto>(_PersonalData_QNAME, PersonalDataDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCandidateStructuredDocumentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCandidateStructuredDocumentByIdResponse")
    public JAXBElement<GetCandidateStructuredDocumentByIdResponse> createGetCandidateStructuredDocumentByIdResponse(GetCandidateStructuredDocumentByIdResponse value) {
        return new JAXBElement<GetCandidateStructuredDocumentByIdResponse>(_GetCandidateStructuredDocumentByIdResponse_QNAME, GetCandidateStructuredDocumentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "option")
    public JAXBElement<OptionDto> createOption(OptionDto value) {
        return new JAXBElement<OptionDto>(_Option_QNAME, OptionDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCandidateViaFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "createCandidateViaFolder")
    public JAXBElement<CreateCandidateViaFolder> createCreateCandidateViaFolder(CreateCandidateViaFolder value) {
        return new JAXBElement<CreateCandidateViaFolder>(_CreateCandidateViaFolder_QNAME, CreateCandidateViaFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadAttachedFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "downloadAttachedFile")
    public JAXBElement<DownloadAttachedFile> createDownloadAttachedFile(DownloadAttachedFile value) {
        return new JAXBElement<DownloadAttachedFile>(_DownloadAttachedFile_QNAME, DownloadAttachedFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getApplicationByIdResponse")
    public JAXBElement<GetApplicationByIdResponse> createGetApplicationByIdResponse(GetApplicationByIdResponse value) {
        return new JAXBElement<GetApplicationByIdResponse>(_GetApplicationByIdResponse_QNAME, GetApplicationByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadAttachedFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "uploadAttachedFileResponse")
    public JAXBElement<UploadAttachedFileResponse> createUploadAttachedFileResponse(UploadAttachedFileResponse value) {
        return new JAXBElement<UploadAttachedFileResponse>(_UploadAttachedFileResponse_QNAME, UploadAttachedFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGfCandidateProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getGfCandidateProfile")
    public JAXBElement<GetGfCandidateProfile> createGetGfCandidateProfile(GetGfCandidateProfile value) {
        return new JAXBElement<GetGfCandidateProfile>(_GetGfCandidateProfile_QNAME, GetGfCandidateProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGfCandidateProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getGfCandidateProfileResponse")
    public JAXBElement<GetGfCandidateProfileResponse> createGetGfCandidateProfileResponse(GetGfCandidateProfileResponse value) {
        return new JAXBElement<GetGfCandidateProfileResponse>(_GetGfCandidateProfileResponse_QNAME, GetGfCandidateProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CandidateProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "candidateprofile")
    public JAXBElement<CandidateProfile> createCandidateprofile(CandidateProfile value) {
        return new JAXBElement<CandidateProfile>(_Candidateprofile_QNAME, CandidateProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "rateUnit")
    public JAXBElement<RateUnit> createRateUnit(RateUnit value) {
        return new JAXBElement<RateUnit>(_RateUnit_QNAME, RateUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormAnsweredDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "form-answered")
    public JAXBElement<FormAnsweredDto> createFormAnswered(FormAnsweredDto value) {
        return new JAXBElement<FormAnsweredDto>(_FormAnswered_QNAME, FormAnsweredDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentBoCpTemplateByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCurrentBoCpTemplateByType")
    public JAXBElement<GetCurrentBoCpTemplateByType> createGetCurrentBoCpTemplateByType(GetCurrentBoCpTemplateByType value) {
        return new JAXBElement<GetCurrentBoCpTemplateByType>(_GetCurrentBoCpTemplateByType_QNAME, GetCurrentBoCpTemplateByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCandidateViaJobNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "createCandidateViaJobNumber")
    public JAXBElement<CreateCandidateViaJobNumber> createCreateCandidateViaJobNumber(CreateCandidateViaJobNumber value) {
        return new JAXBElement<CreateCandidateViaJobNumber>(_CreateCandidateViaJobNumber_QNAME, CreateCandidateViaJobNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadAttachedFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "downloadAttachedFileResponse")
    public JAXBElement<DownloadAttachedFileResponse> createDownloadAttachedFileResponse(DownloadAttachedFileResponse value) {
        return new JAXBElement<DownloadAttachedFileResponse>(_DownloadAttachedFileResponse_QNAME, DownloadAttachedFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCandidateHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCandidateHistoryResponse")
    public JAXBElement<GetCandidateHistoryResponse> createGetCandidateHistoryResponse(GetCandidateHistoryResponse value) {
        return new JAXBElement<GetCandidateHistoryResponse>(_GetCandidateHistoryResponse_QNAME, GetCandidateHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailedSearchCriteriaDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "detailedSearchCriteriaDto")
    public JAXBElement<DetailedSearchCriteriaDto> createDetailedSearchCriteriaDto(DetailedSearchCriteriaDto value) {
        return new JAXBElement<DetailedSearchCriteriaDto>(_DetailedSearchCriteriaDto_QNAME, DetailedSearchCriteriaDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "structuredDocument")
    public JAXBElement<StructuredDocument> createStructuredDocument(StructuredDocument value) {
        return new JAXBElement<StructuredDocument>(_StructuredDocument_QNAME, StructuredDocument.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getApplications")
    public JAXBElement<GetApplications> createGetApplications(GetApplications value) {
        return new JAXBElement<GetApplications>(_GetApplications_QNAME, GetApplications.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "lov")
    public JAXBElement<Object> createLov(Object value) {
        return new JAXBElement<Object>(_Lov_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCandidateViaFolderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "createCandidateViaFolderResponse")
    public JAXBElement<CreateCandidateViaFolderResponse> createCreateCandidateViaFolderResponse(CreateCandidateViaFolderResponse value) {
        return new JAXBElement<CreateCandidateViaFolderResponse>(_CreateCandidateViaFolderResponse_QNAME, CreateCandidateViaFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeCandidateConsent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "revokeCandidateConsent")
    public JAXBElement<RevokeCandidateConsent> createRevokeCandidateConsent(RevokeCandidateConsent value) {
        return new JAXBElement<RevokeCandidateConsent>(_RevokeCandidateConsent_QNAME, RevokeCandidateConsent.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "errorInfo")
    public JAXBElement<ErrorInfo> createErrorInfo(ErrorInfo value) {
        return new JAXBElement<ErrorInfo>(_ErrorInfo_QNAME, ErrorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "document")
    public JAXBElement<Object> createDocument(Object value) {
        return new JAXBElement<Object>(_Document_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditTagByCandidateID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "editTag")
    public JAXBElement<EditTagByCandidateID> createEditTag(EditTagByCandidateID value) {
        return new JAXBElement<EditTagByCandidateID>(_EditTag_QNAME, EditTagByCandidateID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationsByStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getApplicationsByStatus")
    public JAXBElement<GetApplicationsByStatus> createGetApplicationsByStatus(GetApplicationsByStatus value) {
        return new JAXBElement<GetApplicationsByStatus>(_GetApplicationsByStatus_QNAME, GetApplicationsByStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCandidatesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCandidatesResponse")
    public JAXBElement<GetCandidatesResponse> createGetCandidatesResponse(GetCandidatesResponse value) {
        return new JAXBElement<GetCandidatesResponse>(_GetCandidatesResponse_QNAME, GetCandidatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contractor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "contractor")
    public JAXBElement<Contractor> createContractor(Contractor value) {
        return new JAXBElement<Contractor>(_Contractor_QNAME, Contractor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationFollowup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "applicationFollowup")
    public JAXBElement<ApplicationFollowup> createApplicationFollowup(ApplicationFollowup value) {
        return new JAXBElement<ApplicationFollowup>(_ApplicationFollowup_QNAME, ApplicationFollowup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "answer")
    public JAXBElement<Object> createAnswer(Object value) {
        return new JAXBElement<Object>(_Answer_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuestionLayoutDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "questionLayout")
    public JAXBElement<QuestionLayoutDto> createQuestionLayout(QuestionLayoutDto value) {
        return new JAXBElement<QuestionLayoutDto>(_QuestionLayout_QNAME, QuestionLayoutDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GfDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "gf_document")
    public JAXBElement<GfDocument> createGfDocument(GfDocument value) {
        return new JAXBElement<GfDocument>(_GfDocument_QNAME, GfDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsentSearchCriteriaDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "filter")
    public JAXBElement<ConsentSearchCriteriaDto> createFilter(ConsentSearchCriteriaDto value) {
        return new JAXBElement<ConsentSearchCriteriaDto>(_Filter_QNAME, ConsentSearchCriteriaDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCandidatePif }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updateCandidatePif")
    public JAXBElement<UpdateCandidatePif> createUpdateCandidatePif(UpdateCandidatePif value) {
        return new JAXBElement<UpdateCandidatePif>(_UpdateCandidatePif_QNAME, UpdateCandidatePif.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCandidates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCandidates")
    public JAXBElement<GetCandidates> createGetCandidates(GetCandidates value) {
        return new JAXBElement<GetCandidates>(_GetCandidates_QNAME, GetCandidates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCandidateStructuredDocumentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCandidateStructuredDocumentById")
    public JAXBElement<GetCandidateStructuredDocumentById> createGetCandidateStructuredDocumentById(GetCandidateStructuredDocumentById value) {
        return new JAXBElement<GetCandidateStructuredDocumentById>(_GetCandidateStructuredDocumentById_QNAME, GetCandidateStructuredDocumentById.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressFDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "address")
    public JAXBElement<AddressFDto> createAddress(AddressFDto value) {
        return new JAXBElement<AddressFDto>(_Address_QNAME, AddressFDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaggedProfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getTaggedProfiles")
    public JAXBElement<GetTaggedProfiles> createGetTaggedProfiles(GetTaggedProfiles value) {
        return new JAXBElement<GetTaggedProfiles>(_GetTaggedProfiles_QNAME, GetTaggedProfiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeCandidateConsentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "revokeCandidateConsentResponse")
    public JAXBElement<RevokeCandidateConsentResponse> createRevokeCandidateConsentResponse(RevokeCandidateConsentResponse value) {
        return new JAXBElement<RevokeCandidateConsentResponse>(_RevokeCandidateConsentResponse_QNAME, RevokeCandidateConsentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyNameDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "keyname")
    public JAXBElement<KeyNameDto> createKeyname(KeyNameDto value) {
        return new JAXBElement<KeyNameDto>(_Keyname_QNAME, KeyNameDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCandidateViaOpeningResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "createCandidateViaOpeningResponse")
    public JAXBElement<CreateCandidateViaOpeningResponse> createCreateCandidateViaOpeningResponse(CreateCandidateViaOpeningResponse value) {
        return new JAXBElement<CreateCandidateViaOpeningResponse>(_CreateCandidateViaOpeningResponse_QNAME, CreateCandidateViaOpeningResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTagByCandidateID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeTag")
    public JAXBElement<RemoveTagByCandidateID> createRemoveTag(RemoveTagByCandidateID value) {
        return new JAXBElement<RemoveTagByCandidateID>(_RemoveTag_QNAME, RemoveTagByCandidateID.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTagResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "addTagResponse")
    public JAXBElement<AddTagResponse> createAddTagResponse(AddTagResponse value) {
        return new JAXBElement<AddTagResponse>(_AddTagResponse_QNAME, AddTagResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getApplicationById")
    public JAXBElement<GetApplicationById> createGetApplicationById(GetApplicationById value) {
        return new JAXBElement<GetApplicationById>(_GetApplicationById_QNAME, GetApplicationById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getConsentsResponse")
    public JAXBElement<GetConsentsResponse> createGetConsentsResponse(GetConsentsResponse value) {
        return new JAXBElement<GetConsentsResponse>(_GetConsentsResponse_QNAME, GetConsentsResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCandidateById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCandidateById")
    public JAXBElement<GetCandidateById> createGetCandidateById(GetCandidateById value) {
        return new JAXBElement<GetCandidateById>(_GetCandidateById_QNAME, GetCandidateById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractsByApplicationId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getContractsByApplicationId")
    public JAXBElement<GetContractsByApplicationId> createGetContractsByApplicationId(GetContractsByApplicationId value) {
        return new JAXBElement<GetContractsByApplicationId>(_GetContractsByApplicationId_QNAME, GetContractsByApplicationId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailedApplicants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getDetailedApplicants")
    public JAXBElement<GetDetailedApplicants> createGetDetailedApplicants(GetDetailedApplicants value) {
        return new JAXBElement<GetDetailedApplicants>(_GetDetailedApplicants_QNAME, GetDetailedApplicants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "faultDetails")
    public JAXBElement<FaultDetails> createFaultDetails(FaultDetails value) {
        return new JAXBElement<FaultDetails>(_FaultDetails_QNAME, FaultDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptCandidateConsent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "acceptCandidateConsent")
    public JAXBElement<AcceptCandidateConsent> createAcceptCandidateConsent(AcceptCandidateConsent value) {
        return new JAXBElement<AcceptCandidateConsent>(_AcceptCandidateConsent_QNAME, AcceptCandidateConsent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PermanentContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "permanentContract")
    public JAXBElement<PermanentContract> createPermanentContract(PermanentContract value) {
        return new JAXBElement<PermanentContract>(_PermanentContract_QNAME, PermanentContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DpConsentDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "dpConsentDto")
    public JAXBElement<DpConsentDto> createDpConsentDto(DpConsentDto value) {
        return new JAXBElement<DpConsentDto>(_DpConsentDto_QNAME, DpConsentDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContracts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getContracts")
    public JAXBElement<GetContracts> createGetContracts(GetContracts value) {
        return new JAXBElement<GetContracts>(_GetContracts_QNAME, GetContracts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCandidateHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getCandidateHistory")
    public JAXBElement<GetCandidateHistory> createGetCandidateHistory(GetCandidateHistory value) {
        return new JAXBElement<GetCandidateHistory>(_GetCandidateHistory_QNAME, GetCandidateHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDetailedApplicantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getDetailedApplicantsResponse")
    public JAXBElement<GetDetailedApplicantsResponse> createGetDetailedApplicantsResponse(GetDetailedApplicantsResponse value) {
        return new JAXBElement<GetDetailedApplicantsResponse>(_GetDetailedApplicantsResponse_QNAME, GetDetailedApplicantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectedOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "selectedOption")
    public JAXBElement<SelectedOption> createSelectedOption(SelectedOption value) {
        return new JAXBElement<SelectedOption>(_SelectedOption_QNAME, SelectedOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApplicationsByStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getApplicationsByStatusResponse")
    public JAXBElement<GetApplicationsByStatusResponse> createGetApplicationsByStatusResponse(GetApplicationsByStatusResponse value) {
        return new JAXBElement<GetApplicationsByStatusResponse>(_GetApplicationsByStatusResponse_QNAME, GetApplicationsByStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCandidateViaOpening }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "createCandidateViaOpening")
    public JAXBElement<CreateCandidateViaOpening> createCreateCandidateViaOpening(CreateCandidateViaOpening value) {
        return new JAXBElement<CreateCandidateViaOpening>(_CreateCandidateViaOpening_QNAME, CreateCandidateViaOpening.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "contract")
    public JAXBElement<ContractDto> createContract(ContractDto value) {
        return new JAXBElement<ContractDto>(_Contract_QNAME, ContractDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "profile")
    public JAXBElement<ProfileDto> createProfile(ProfileDto value) {
        return new JAXBElement<ProfileDto>(_Profile_QNAME, ProfileDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuestionAnsweredDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "answered-question")
    public JAXBElement<QuestionAnsweredDto> createAnsweredQuestion(QuestionAnsweredDto value) {
        return new JAXBElement<QuestionAnsweredDto>(_AnsweredQuestion_QNAME, QuestionAnsweredDto.class, null, value);
    }

}
