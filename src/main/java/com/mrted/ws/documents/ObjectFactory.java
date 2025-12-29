
package com.mrted.ws.documents;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mrted.ws.documents package. 
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

    private final static QName _GetDocumentsByCandidateId_QNAME = new QName("http://ws.mrted.com/", "getDocumentsByCandidateId");
    private final static QName _GetFormAnsweredByDocumentId_QNAME = new QName("http://ws.mrted.com/", "getFormAnsweredByDocumentId");
    private final static QName _GetFreeFormDocumentByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getFreeFormDocumentByIdResponse");
    private final static QName _FormAnswered_QNAME = new QName("http://ws.mrted.com/", "form-answered");
    private final static QName _DownloadAttachedFileResponse_QNAME = new QName("http://ws.mrted.com/", "downloadAttachedFileResponse");
    private final static QName _Tag_QNAME = new QName("http://ws.mrted.com/", "tag");
    private final static QName _FreeFormDocument_QNAME = new QName("http://ws.mrted.com/", "freeFormDocument");
    private final static QName _StructuredDocument_QNAME = new QName("http://ws.mrted.com/", "structuredDocument");
    private final static QName _TagType_QNAME = new QName("http://ws.mrted.com/", "tagType");
    private final static QName _QuestionsAnswered_QNAME = new QName("http://ws.mrted.com/", "questionsAnswered");
    private final static QName _GetTaggedDocuments_QNAME = new QName("http://ws.mrted.com/", "getTaggedDocuments");
    private final static QName _GetTagsForTypeResponse_QNAME = new QName("http://ws.mrted.com/", "getTagsForTypeResponse");
    private final static QName _ComplexQuestion_QNAME = new QName("http://ws.mrted.com/", "complex-question");
    private final static QName _GetMailDocumentById_QNAME = new QName("http://ws.mrted.com/", "getMailDocumentById");
    private final static QName _GetTagsForType_QNAME = new QName("http://ws.mrted.com/", "getTagsForType");
    private final static QName _GetStructuredDocumentByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getStructuredDocumentByIdResponse");
    private final static QName _AssignedQuestion_QNAME = new QName("http://ws.mrted.com/", "assignedQuestion");
    private final static QName _GetBasicStructuredDocumentDtoById_QNAME = new QName("http://ws.mrted.com/", "getBasicStructuredDocumentDtoById");
    private final static QName _AddTagResponse_QNAME = new QName("http://ws.mrted.com/", "addTagResponse");
    private final static QName _GetTagTypes_QNAME = new QName("http://ws.mrted.com/", "getTagTypes");
    private final static QName _AddTag_QNAME = new QName("http://ws.mrted.com/", "addTag");
    private final static QName _AssignedOption_QNAME = new QName("http://ws.mrted.com/", "assignedOption");
    private final static QName _GetTagTypesResponse_QNAME = new QName("http://ws.mrted.com/", "getTagTypesResponse");
    private final static QName _Document_QNAME = new QName("http://ws.mrted.com/", "document");
    private final static QName _GetDocumentsByApplicationId_QNAME = new QName("http://ws.mrted.com/", "getDocumentsByApplicationId");
    private final static QName _GetTaggedDocumentsResponse_QNAME = new QName("http://ws.mrted.com/", "getTaggedDocumentsResponse");
    private final static QName _GetDocumentsByApplicationIdResponse_QNAME = new QName("http://ws.mrted.com/", "getDocumentsByApplicationIdResponse");
    private final static QName _AttachedFile_QNAME = new QName("http://ws.mrted.com/", "attachedFile");
    private final static QName _DownloadAttachedFile_QNAME = new QName("http://ws.mrted.com/", "downloadAttachedFile");
    private final static QName _DownloadSharedDocumentResponse_QNAME = new QName("http://ws.mrted.com/", "downloadSharedDocumentResponse");
    private final static QName _GetBasicStructuredDocumentDtoByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getBasicStructuredDocumentDtoByIdResponse");
    private final static QName _Answer_QNAME = new QName("http://ws.mrted.com/", "answer");
    private final static QName _GetFreeFormDocumentById_QNAME = new QName("http://ws.mrted.com/", "getFreeFormDocumentById");
    private final static QName _GetMailDocumentByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getMailDocumentByIdResponse");
    private final static QName _GetStructuredDocumentById_QNAME = new QName("http://ws.mrted.com/", "getStructuredDocumentById");
    private final static QName _GfDocument_QNAME = new QName("http://ws.mrted.com/", "gf_document");
    private final static QName _MailDocument_QNAME = new QName("http://ws.mrted.com/", "mailDocument");
    private final static QName _SelectedOption_QNAME = new QName("http://ws.mrted.com/", "selectedOption");
    private final static QName _DownloadSharedDocument_QNAME = new QName("http://ws.mrted.com/", "downloadSharedDocument");
    private final static QName _GetDocumentsByEmployeeId_QNAME = new QName("http://ws.mrted.com/", "getDocumentsByEmployeeId");
    private final static QName _Question_QNAME = new QName("http://ws.mrted.com/", "question");
    private final static QName _AnsweredQuestion_QNAME = new QName("http://ws.mrted.com/", "answered-question");
    private final static QName _GetDocumentsByCandidateIdResponse_QNAME = new QName("http://ws.mrted.com/", "getDocumentsByCandidateIdResponse");
    private final static QName _GetFormAnsweredByDocumentIdResponse_QNAME = new QName("http://ws.mrted.com/", "getFormAnsweredByDocumentIdResponse");
    private final static QName _GetDocumentsByEmployeeIdResponse_QNAME = new QName("http://ws.mrted.com/", "getDocumentsByEmployeeIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mrted.ws.documents
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnswerDto }
     * 
     */
    public AnswerDto createAnswerDto() {
        return new AnswerDto();
    }

    /**
     * Create an instance of {@link StructuredDocumentDto }
     * 
     */
    public StructuredDocumentDto createStructuredDocumentDto() {
        return new StructuredDocumentDto();
    }

    /**
     * Create an instance of {@link MailDto }
     * 
     */
    public MailDto createMailDto() {
        return new MailDto();
    }

    /**
     * Create an instance of {@link QuestionAnsweredDto }
     * 
     */
    public QuestionAnsweredDto createQuestionAnsweredDto() {
        return new QuestionAnsweredDto();
    }

    /**
     * Create an instance of {@link ComplexAssignedQuestion }
     * 
     */
    public ComplexAssignedQuestion createComplexAssignedQuestion() {
        return new ComplexAssignedQuestion();
    }

    /**
     * Create an instance of {@link GetDocumentsByApplicationIdResponse }
     * 
     */
    public GetDocumentsByApplicationIdResponse createGetDocumentsByApplicationIdResponse() {
        return new GetDocumentsByApplicationIdResponse();
    }

    /**
     * Create an instance of {@link GetTaggedDocumentsResponse }
     * 
     */
    public GetTaggedDocumentsResponse createGetTaggedDocumentsResponse() {
        return new GetTaggedDocumentsResponse();
    }

    /**
     * Create an instance of {@link GetDocumentsByApplicationId }
     * 
     */
    public GetDocumentsByApplicationId createGetDocumentsByApplicationId() {
        return new GetDocumentsByApplicationId();
    }

    /**
     * Create an instance of {@link AssignedOption }
     * 
     */
    public AssignedOption createAssignedOption() {
        return new AssignedOption();
    }

    /**
     * Create an instance of {@link GetTagTypesResponse }
     * 
     */
    public GetTagTypesResponse createGetTagTypesResponse() {
        return new GetTagTypesResponse();
    }

    /**
     * Create an instance of {@link AddTag }
     * 
     */
    public AddTag createAddTag() {
        return new AddTag();
    }

    /**
     * Create an instance of {@link AddTagResponse }
     * 
     */
    public AddTagResponse createAddTagResponse() {
        return new AddTagResponse();
    }

    /**
     * Create an instance of {@link GetTagTypes }
     * 
     */
    public GetTagTypes createGetTagTypes() {
        return new GetTagTypes();
    }

    /**
     * Create an instance of {@link AssignedQuestion }
     * 
     */
    public AssignedQuestion createAssignedQuestion() {
        return new AssignedQuestion();
    }

    /**
     * Create an instance of {@link GetBasicStructuredDocumentDtoById }
     * 
     */
    public GetBasicStructuredDocumentDtoById createGetBasicStructuredDocumentDtoById() {
        return new GetBasicStructuredDocumentDtoById();
    }

    /**
     * Create an instance of {@link GetStructuredDocumentByIdResponse }
     * 
     */
    public GetStructuredDocumentByIdResponse createGetStructuredDocumentByIdResponse() {
        return new GetStructuredDocumentByIdResponse();
    }

    /**
     * Create an instance of {@link GetMailDocumentById }
     * 
     */
    public GetMailDocumentById createGetMailDocumentById() {
        return new GetMailDocumentById();
    }

    /**
     * Create an instance of {@link GetTagsForType }
     * 
     */
    public GetTagsForType createGetTagsForType() {
        return new GetTagsForType();
    }

    /**
     * Create an instance of {@link GetTaggedDocuments }
     * 
     */
    public GetTaggedDocuments createGetTaggedDocuments() {
        return new GetTaggedDocuments();
    }

    /**
     * Create an instance of {@link GetTagsForTypeResponse }
     * 
     */
    public GetTagsForTypeResponse createGetTagsForTypeResponse() {
        return new GetTagsForTypeResponse();
    }

    /**
     * Create an instance of {@link QuestionsAnsweredDto }
     * 
     */
    public QuestionsAnsweredDto createQuestionsAnsweredDto() {
        return new QuestionsAnsweredDto();
    }

    /**
     * Create an instance of {@link TagType }
     * 
     */
    public TagType createTagType() {
        return new TagType();
    }

    /**
     * Create an instance of {@link StructuredDocument }
     * 
     */
    public StructuredDocument createStructuredDocument() {
        return new StructuredDocument();
    }

    /**
     * Create an instance of {@link FreeFormDocumentDto }
     * 
     */
    public FreeFormDocumentDto createFreeFormDocumentDto() {
        return new FreeFormDocumentDto();
    }

    /**
     * Create an instance of {@link Tag }
     * 
     */
    public Tag createTag() {
        return new Tag();
    }

    /**
     * Create an instance of {@link DownloadAttachedFileResponse }
     * 
     */
    public DownloadAttachedFileResponse createDownloadAttachedFileResponse() {
        return new DownloadAttachedFileResponse();
    }

    /**
     * Create an instance of {@link FormAnsweredDto }
     * 
     */
    public FormAnsweredDto createFormAnsweredDto() {
        return new FormAnsweredDto();
    }

    /**
     * Create an instance of {@link GetDocumentsByCandidateId }
     * 
     */
    public GetDocumentsByCandidateId createGetDocumentsByCandidateId() {
        return new GetDocumentsByCandidateId();
    }

    /**
     * Create an instance of {@link GetFormAnsweredByDocumentId }
     * 
     */
    public GetFormAnsweredByDocumentId createGetFormAnsweredByDocumentId() {
        return new GetFormAnsweredByDocumentId();
    }

    /**
     * Create an instance of {@link GetFreeFormDocumentByIdResponse }
     * 
     */
    public GetFreeFormDocumentByIdResponse createGetFreeFormDocumentByIdResponse() {
        return new GetFreeFormDocumentByIdResponse();
    }

    /**
     * Create an instance of {@link GetDocumentsByEmployeeIdResponse }
     * 
     */
    public GetDocumentsByEmployeeIdResponse createGetDocumentsByEmployeeIdResponse() {
        return new GetDocumentsByEmployeeIdResponse();
    }

    /**
     * Create an instance of {@link GetFormAnsweredByDocumentIdResponse }
     * 
     */
    public GetFormAnsweredByDocumentIdResponse createGetFormAnsweredByDocumentIdResponse() {
        return new GetFormAnsweredByDocumentIdResponse();
    }

    /**
     * Create an instance of {@link GetDocumentsByCandidateIdResponse }
     * 
     */
    public GetDocumentsByCandidateIdResponse createGetDocumentsByCandidateIdResponse() {
        return new GetDocumentsByCandidateIdResponse();
    }

    /**
     * Create an instance of {@link SimpleAssignedQuestion }
     * 
     */
    public SimpleAssignedQuestion createSimpleAssignedQuestion() {
        return new SimpleAssignedQuestion();
    }

    /**
     * Create an instance of {@link GetDocumentsByEmployeeId }
     * 
     */
    public GetDocumentsByEmployeeId createGetDocumentsByEmployeeId() {
        return new GetDocumentsByEmployeeId();
    }

    /**
     * Create an instance of {@link DownloadSharedDocument }
     * 
     */
    public DownloadSharedDocument createDownloadSharedDocument() {
        return new DownloadSharedDocument();
    }

    /**
     * Create an instance of {@link SelectedOption }
     * 
     */
    public SelectedOption createSelectedOption() {
        return new SelectedOption();
    }

    /**
     * Create an instance of {@link GetStructuredDocumentById }
     * 
     */
    public GetStructuredDocumentById createGetStructuredDocumentById() {
        return new GetStructuredDocumentById();
    }

    /**
     * Create an instance of {@link GfDocument }
     * 
     */
    public GfDocument createGfDocument() {
        return new GfDocument();
    }

    /**
     * Create an instance of {@link GetFreeFormDocumentById }
     * 
     */
    public GetFreeFormDocumentById createGetFreeFormDocumentById() {
        return new GetFreeFormDocumentById();
    }

    /**
     * Create an instance of {@link GetMailDocumentByIdResponse }
     * 
     */
    public GetMailDocumentByIdResponse createGetMailDocumentByIdResponse() {
        return new GetMailDocumentByIdResponse();
    }

    /**
     * Create an instance of {@link GetBasicStructuredDocumentDtoByIdResponse }
     * 
     */
    public GetBasicStructuredDocumentDtoByIdResponse createGetBasicStructuredDocumentDtoByIdResponse() {
        return new GetBasicStructuredDocumentDtoByIdResponse();
    }

    /**
     * Create an instance of {@link DownloadSharedDocumentResponse }
     * 
     */
    public DownloadSharedDocumentResponse createDownloadSharedDocumentResponse() {
        return new DownloadSharedDocumentResponse();
    }

    /**
     * Create an instance of {@link DownloadAttachedFile }
     * 
     */
    public DownloadAttachedFile createDownloadAttachedFile() {
        return new DownloadAttachedFile();
    }

    /**
     * Create an instance of {@link AttachedFileDto }
     * 
     */
    public AttachedFileDto createAttachedFileDto() {
        return new AttachedFileDto();
    }

    /**
     * Create an instance of {@link LocalizedValues }
     * 
     */
    public LocalizedValues createLocalizedValues() {
        return new LocalizedValues();
    }

    /**
     * Create an instance of {@link LocalizedValueDto }
     * 
     */
    public LocalizedValueDto createLocalizedValueDto() {
        return new LocalizedValueDto();
    }

    /**
     * Create an instance of {@link DocumentBaseDto }
     * 
     */
    public DocumentBaseDto createDocumentBaseDto() {
        return new DocumentBaseDto();
    }

    /**
     * Create an instance of {@link Answer }
     * 
     */
    public Answer createAnswer() {
        return new Answer();
    }

    /**
     * Create an instance of {@link AnswerDto.Values }
     * 
     */
    public AnswerDto.Values createAnswerDtoValues() {
        return new AnswerDto.Values();
    }

    /**
     * Create an instance of {@link StructuredDocumentDto.Questions }
     * 
     */
    public StructuredDocumentDto.Questions createStructuredDocumentDtoQuestions() {
        return new StructuredDocumentDto.Questions();
    }

    /**
     * Create an instance of {@link MailDto.Attachments }
     * 
     */
    public MailDto.Attachments createMailDtoAttachments() {
        return new MailDto.Attachments();
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
     * Create an instance of {@link ComplexAssignedQuestion.Children }
     * 
     */
    public ComplexAssignedQuestion.Children createComplexAssignedQuestionChildren() {
        return new ComplexAssignedQuestion.Children();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentsByCandidateId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getDocumentsByCandidateId")
    public JAXBElement<GetDocumentsByCandidateId> createGetDocumentsByCandidateId(GetDocumentsByCandidateId value) {
        return new JAXBElement<GetDocumentsByCandidateId>(_GetDocumentsByCandidateId_QNAME, GetDocumentsByCandidateId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFormAnsweredByDocumentId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getFormAnsweredByDocumentId")
    public JAXBElement<GetFormAnsweredByDocumentId> createGetFormAnsweredByDocumentId(GetFormAnsweredByDocumentId value) {
        return new JAXBElement<GetFormAnsweredByDocumentId>(_GetFormAnsweredByDocumentId_QNAME, GetFormAnsweredByDocumentId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeFormDocumentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getFreeFormDocumentByIdResponse")
    public JAXBElement<GetFreeFormDocumentByIdResponse> createGetFreeFormDocumentByIdResponse(GetFreeFormDocumentByIdResponse value) {
        return new JAXBElement<GetFreeFormDocumentByIdResponse>(_GetFreeFormDocumentByIdResponse_QNAME, GetFreeFormDocumentByIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadAttachedFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "downloadAttachedFileResponse")
    public JAXBElement<DownloadAttachedFileResponse> createDownloadAttachedFileResponse(DownloadAttachedFileResponse value) {
        return new JAXBElement<DownloadAttachedFileResponse>(_DownloadAttachedFileResponse_QNAME, DownloadAttachedFileResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeFormDocumentDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "freeFormDocument")
    public JAXBElement<FreeFormDocumentDto> createFreeFormDocument(FreeFormDocumentDto value) {
        return new JAXBElement<FreeFormDocumentDto>(_FreeFormDocument_QNAME, FreeFormDocumentDto.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QuestionsAnsweredDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "questionsAnswered")
    public JAXBElement<QuestionsAnsweredDto> createQuestionsAnswered(QuestionsAnsweredDto value) {
        return new JAXBElement<QuestionsAnsweredDto>(_QuestionsAnswered_QNAME, QuestionsAnsweredDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaggedDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getTaggedDocuments")
    public JAXBElement<GetTaggedDocuments> createGetTaggedDocuments(GetTaggedDocuments value) {
        return new JAXBElement<GetTaggedDocuments>(_GetTaggedDocuments_QNAME, GetTaggedDocuments.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplexAssignedQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "complex-question")
    public JAXBElement<ComplexAssignedQuestion> createComplexQuestion(ComplexAssignedQuestion value) {
        return new JAXBElement<ComplexAssignedQuestion>(_ComplexQuestion_QNAME, ComplexAssignedQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailDocumentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getMailDocumentById")
    public JAXBElement<GetMailDocumentById> createGetMailDocumentById(GetMailDocumentById value) {
        return new JAXBElement<GetMailDocumentById>(_GetMailDocumentById_QNAME, GetMailDocumentById.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStructuredDocumentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getStructuredDocumentByIdResponse")
    public JAXBElement<GetStructuredDocumentByIdResponse> createGetStructuredDocumentByIdResponse(GetStructuredDocumentByIdResponse value) {
        return new JAXBElement<GetStructuredDocumentByIdResponse>(_GetStructuredDocumentByIdResponse_QNAME, GetStructuredDocumentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignedQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "assignedQuestion")
    public JAXBElement<AssignedQuestion> createAssignedQuestion(AssignedQuestion value) {
        return new JAXBElement<AssignedQuestion>(_AssignedQuestion_QNAME, AssignedQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBasicStructuredDocumentDtoById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getBasicStructuredDocumentDtoById")
    public JAXBElement<GetBasicStructuredDocumentDtoById> createGetBasicStructuredDocumentDtoById(GetBasicStructuredDocumentDtoById value) {
        return new JAXBElement<GetBasicStructuredDocumentDtoById>(_GetBasicStructuredDocumentDtoById_QNAME, GetBasicStructuredDocumentDtoById.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTagTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getTagTypes")
    public JAXBElement<GetTagTypes> createGetTagTypes(GetTagTypes value) {
        return new JAXBElement<GetTagTypes>(_GetTagTypes_QNAME, GetTagTypes.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignedOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "assignedOption")
    public JAXBElement<AssignedOption> createAssignedOption(AssignedOption value) {
        return new JAXBElement<AssignedOption>(_AssignedOption_QNAME, AssignedOption.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "document")
    public JAXBElement<Object> createDocument(Object value) {
        return new JAXBElement<Object>(_Document_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentsByApplicationId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getDocumentsByApplicationId")
    public JAXBElement<GetDocumentsByApplicationId> createGetDocumentsByApplicationId(GetDocumentsByApplicationId value) {
        return new JAXBElement<GetDocumentsByApplicationId>(_GetDocumentsByApplicationId_QNAME, GetDocumentsByApplicationId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaggedDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getTaggedDocumentsResponse")
    public JAXBElement<GetTaggedDocumentsResponse> createGetTaggedDocumentsResponse(GetTaggedDocumentsResponse value) {
        return new JAXBElement<GetTaggedDocumentsResponse>(_GetTaggedDocumentsResponse_QNAME, GetTaggedDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentsByApplicationIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getDocumentsByApplicationIdResponse")
    public JAXBElement<GetDocumentsByApplicationIdResponse> createGetDocumentsByApplicationIdResponse(GetDocumentsByApplicationIdResponse value) {
        return new JAXBElement<GetDocumentsByApplicationIdResponse>(_GetDocumentsByApplicationIdResponse_QNAME, GetDocumentsByApplicationIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadAttachedFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "downloadAttachedFile")
    public JAXBElement<DownloadAttachedFile> createDownloadAttachedFile(DownloadAttachedFile value) {
        return new JAXBElement<DownloadAttachedFile>(_DownloadAttachedFile_QNAME, DownloadAttachedFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadSharedDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "downloadSharedDocumentResponse")
    public JAXBElement<DownloadSharedDocumentResponse> createDownloadSharedDocumentResponse(DownloadSharedDocumentResponse value) {
        return new JAXBElement<DownloadSharedDocumentResponse>(_DownloadSharedDocumentResponse_QNAME, DownloadSharedDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBasicStructuredDocumentDtoByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getBasicStructuredDocumentDtoByIdResponse")
    public JAXBElement<GetBasicStructuredDocumentDtoByIdResponse> createGetBasicStructuredDocumentDtoByIdResponse(GetBasicStructuredDocumentDtoByIdResponse value) {
        return new JAXBElement<GetBasicStructuredDocumentDtoByIdResponse>(_GetBasicStructuredDocumentDtoByIdResponse_QNAME, GetBasicStructuredDocumentDtoByIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeFormDocumentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getFreeFormDocumentById")
    public JAXBElement<GetFreeFormDocumentById> createGetFreeFormDocumentById(GetFreeFormDocumentById value) {
        return new JAXBElement<GetFreeFormDocumentById>(_GetFreeFormDocumentById_QNAME, GetFreeFormDocumentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailDocumentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getMailDocumentByIdResponse")
    public JAXBElement<GetMailDocumentByIdResponse> createGetMailDocumentByIdResponse(GetMailDocumentByIdResponse value) {
        return new JAXBElement<GetMailDocumentByIdResponse>(_GetMailDocumentByIdResponse_QNAME, GetMailDocumentByIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GfDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "gf_document")
    public JAXBElement<GfDocument> createGfDocument(GfDocument value) {
        return new JAXBElement<GfDocument>(_GfDocument_QNAME, GfDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "mailDocument")
    public JAXBElement<MailDto> createMailDocument(MailDto value) {
        return new JAXBElement<MailDto>(_MailDocument_QNAME, MailDto.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadSharedDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "downloadSharedDocument")
    public JAXBElement<DownloadSharedDocument> createDownloadSharedDocument(DownloadSharedDocument value) {
        return new JAXBElement<DownloadSharedDocument>(_DownloadSharedDocument_QNAME, DownloadSharedDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentsByEmployeeId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getDocumentsByEmployeeId")
    public JAXBElement<GetDocumentsByEmployeeId> createGetDocumentsByEmployeeId(GetDocumentsByEmployeeId value) {
        return new JAXBElement<GetDocumentsByEmployeeId>(_GetDocumentsByEmployeeId_QNAME, GetDocumentsByEmployeeId.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QuestionAnsweredDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "answered-question")
    public JAXBElement<QuestionAnsweredDto> createAnsweredQuestion(QuestionAnsweredDto value) {
        return new JAXBElement<QuestionAnsweredDto>(_AnsweredQuestion_QNAME, QuestionAnsweredDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentsByCandidateIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getDocumentsByCandidateIdResponse")
    public JAXBElement<GetDocumentsByCandidateIdResponse> createGetDocumentsByCandidateIdResponse(GetDocumentsByCandidateIdResponse value) {
        return new JAXBElement<GetDocumentsByCandidateIdResponse>(_GetDocumentsByCandidateIdResponse_QNAME, GetDocumentsByCandidateIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFormAnsweredByDocumentIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getFormAnsweredByDocumentIdResponse")
    public JAXBElement<GetFormAnsweredByDocumentIdResponse> createGetFormAnsweredByDocumentIdResponse(GetFormAnsweredByDocumentIdResponse value) {
        return new JAXBElement<GetFormAnsweredByDocumentIdResponse>(_GetFormAnsweredByDocumentIdResponse_QNAME, GetFormAnsweredByDocumentIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentsByEmployeeIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getDocumentsByEmployeeIdResponse")
    public JAXBElement<GetDocumentsByEmployeeIdResponse> createGetDocumentsByEmployeeIdResponse(GetDocumentsByEmployeeIdResponse value) {
        return new JAXBElement<GetDocumentsByEmployeeIdResponse>(_GetDocumentsByEmployeeIdResponse_QNAME, GetDocumentsByEmployeeIdResponse.class, null, value);
    }

}
