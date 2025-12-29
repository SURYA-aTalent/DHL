
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mrted.ws.lovhierarchy package. 
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

    private final static QName _GetWholeHierarchy_QNAME = new QName("http://ws.mrted.com/", "getWholeHierarchy");
    private final static QName _LinkHierarchyMembersResponse_QNAME = new QName("http://ws.mrted.com/", "linkHierarchyMembersResponse");
    private final static QName _GetLovsAvilableForHierarchingResponse_QNAME = new QName("http://ws.mrted.com/", "getLovsAvilableForHierarchingResponse");
    private final static QName _UpdateHierarchyMemberUnlockersResponse_QNAME = new QName("http://ws.mrted.com/", "updateHierarchyMemberUnlockersResponse");
    private final static QName _Hlov_QNAME = new QName("http://ws.mrted.com/", "hlov");
    private final static QName _MakeLovHierarchyMemberFromLov_QNAME = new QName("http://ws.mrted.com/", "makeLovHierarchyMemberFromLov");
    private final static QName _UpdateSingleHierarchyMemberResponse_QNAME = new QName("http://ws.mrted.com/", "updateSingleHierarchyMemberResponse");
    private final static QName _OperationResultDto_QNAME = new QName("http://ws.mrted.com/", "operationResultDto");
    private final static QName _UnLinkHierarchyMembers_QNAME = new QName("http://ws.mrted.com/", "unLinkHierarchyMembers");
    private final static QName _UpdateSingleHierarchyMember_QNAME = new QName("http://ws.mrted.com/", "updateSingleHierarchyMember");
    private final static QName _GetLovsByUnlockers_QNAME = new QName("http://ws.mrted.com/", "getLovsByUnlockers");
    private final static QName _GetWholeHierarchyResponse_QNAME = new QName("http://ws.mrted.com/", "getWholeHierarchyResponse");
    private final static QName _DeleteHierarchyMember_QNAME = new QName("http://ws.mrted.com/", "deleteHierarchyMember");
    private final static QName _GetLovHierarchyMemberById_QNAME = new QName("http://ws.mrted.com/", "getLovHierarchyMemberById");
    private final static QName _UnLinkHierarchyMembersResponse_QNAME = new QName("http://ws.mrted.com/", "unLinkHierarchyMembersResponse");
    private final static QName _GetLovsByUnlockersWithFilter_QNAME = new QName("http://ws.mrted.com/", "getLovsByUnlockersWithFilter");
    private final static QName _LovLabels_QNAME = new QName("http://ws.mrted.com/", "lov-labels");
    private final static QName _UpdateHierarchy_QNAME = new QName("http://ws.mrted.com/", "updateHierarchy");
    private final static QName _GetLovsByUnlockersWithFilterResponse_QNAME = new QName("http://ws.mrted.com/", "getLovsByUnlockersWithFilterResponse");
    private final static QName _UpdateHierarchyMemberUnlockers_QNAME = new QName("http://ws.mrted.com/", "updateHierarchyMemberUnlockers");
    private final static QName _DeleteHierarchyMemberResponse_QNAME = new QName("http://ws.mrted.com/", "deleteHierarchyMemberResponse");
    private final static QName _LinkHierarchyMembers_QNAME = new QName("http://ws.mrted.com/", "linkHierarchyMembers");
    private final static QName _UuidIdPairDto_QNAME = new QName("http://ws.mrted.com/", "uuidIdPairDto");
    private final static QName _UpdateHierarchyResponse_QNAME = new QName("http://ws.mrted.com/", "updateHierarchyResponse");
    private final static QName _MakeLovHierarchyMemberFromLovResponse_QNAME = new QName("http://ws.mrted.com/", "makeLovHierarchyMemberFromLovResponse");
    private final static QName _GenericLovForHierarchingDto_QNAME = new QName("http://ws.mrted.com/", "genericLovForHierarchingDto");
    private final static QName _Label_QNAME = new QName("http://ws.mrted.com/", "label");
    private final static QName _GetLovHierarchyMemberByIdResponse_QNAME = new QName("http://ws.mrted.com/", "getLovHierarchyMemberByIdResponse");
    private final static QName _GetLovsAvilableForHierarching_QNAME = new QName("http://ws.mrted.com/", "getLovsAvilableForHierarching");
    private final static QName _GetLovsByUnlockersResponse_QNAME = new QName("http://ws.mrted.com/", "getLovsByUnlockersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mrted.ws.lovhierarchy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LovHierarchyMemberDto }
     * 
     */
    public LovHierarchyMemberDto createLovHierarchyMemberDto() {
        return new LovHierarchyMemberDto();
    }

    /**
     * Create an instance of {@link UpdateHierarchy }
     * 
     */
    public UpdateHierarchy createUpdateHierarchy() {
        return new UpdateHierarchy();
    }

    /**
     * Create an instance of {@link LovLabelsDto }
     * 
     */
    public LovLabelsDto createLovLabelsDto() {
        return new LovLabelsDto();
    }

    /**
     * Create an instance of {@link GetLovsByUnlockersWithFilter }
     * 
     */
    public GetLovsByUnlockersWithFilter createGetLovsByUnlockersWithFilter() {
        return new GetLovsByUnlockersWithFilter();
    }

    /**
     * Create an instance of {@link UnLinkHierarchyMembersResponse }
     * 
     */
    public UnLinkHierarchyMembersResponse createUnLinkHierarchyMembersResponse() {
        return new UnLinkHierarchyMembersResponse();
    }

    /**
     * Create an instance of {@link GetLovHierarchyMemberById }
     * 
     */
    public GetLovHierarchyMemberById createGetLovHierarchyMemberById() {
        return new GetLovHierarchyMemberById();
    }

    /**
     * Create an instance of {@link DeleteHierarchyMember }
     * 
     */
    public DeleteHierarchyMember createDeleteHierarchyMember() {
        return new DeleteHierarchyMember();
    }

    /**
     * Create an instance of {@link GetWholeHierarchyResponse }
     * 
     */
    public GetWholeHierarchyResponse createGetWholeHierarchyResponse() {
        return new GetWholeHierarchyResponse();
    }

    /**
     * Create an instance of {@link GetLovsByUnlockers }
     * 
     */
    public GetLovsByUnlockers createGetLovsByUnlockers() {
        return new GetLovsByUnlockers();
    }

    /**
     * Create an instance of {@link UnLinkHierarchyMembers }
     * 
     */
    public UnLinkHierarchyMembers createUnLinkHierarchyMembers() {
        return new UnLinkHierarchyMembers();
    }

    /**
     * Create an instance of {@link UpdateSingleHierarchyMember }
     * 
     */
    public UpdateSingleHierarchyMember createUpdateSingleHierarchyMember() {
        return new UpdateSingleHierarchyMember();
    }

    /**
     * Create an instance of {@link OperationResultDto }
     * 
     */
    public OperationResultDto createOperationResultDto() {
        return new OperationResultDto();
    }

    /**
     * Create an instance of {@link MakeLovHierarchyMemberFromLov }
     * 
     */
    public MakeLovHierarchyMemberFromLov createMakeLovHierarchyMemberFromLov() {
        return new MakeLovHierarchyMemberFromLov();
    }

    /**
     * Create an instance of {@link UpdateSingleHierarchyMemberResponse }
     * 
     */
    public UpdateSingleHierarchyMemberResponse createUpdateSingleHierarchyMemberResponse() {
        return new UpdateSingleHierarchyMemberResponse();
    }

    /**
     * Create an instance of {@link UpdateHierarchyMemberUnlockersResponse }
     * 
     */
    public UpdateHierarchyMemberUnlockersResponse createUpdateHierarchyMemberUnlockersResponse() {
        return new UpdateHierarchyMemberUnlockersResponse();
    }

    /**
     * Create an instance of {@link GetLovsAvilableForHierarchingResponse }
     * 
     */
    public GetLovsAvilableForHierarchingResponse createGetLovsAvilableForHierarchingResponse() {
        return new GetLovsAvilableForHierarchingResponse();
    }

    /**
     * Create an instance of {@link LinkHierarchyMembersResponse }
     * 
     */
    public LinkHierarchyMembersResponse createLinkHierarchyMembersResponse() {
        return new LinkHierarchyMembersResponse();
    }

    /**
     * Create an instance of {@link GetWholeHierarchy }
     * 
     */
    public GetWholeHierarchy createGetWholeHierarchy() {
        return new GetWholeHierarchy();
    }

    /**
     * Create an instance of {@link GetLovsByUnlockersResponse }
     * 
     */
    public GetLovsByUnlockersResponse createGetLovsByUnlockersResponse() {
        return new GetLovsByUnlockersResponse();
    }

    /**
     * Create an instance of {@link GetLovsAvilableForHierarching }
     * 
     */
    public GetLovsAvilableForHierarching createGetLovsAvilableForHierarching() {
        return new GetLovsAvilableForHierarching();
    }

    /**
     * Create an instance of {@link GetLovHierarchyMemberByIdResponse }
     * 
     */
    public GetLovHierarchyMemberByIdResponse createGetLovHierarchyMemberByIdResponse() {
        return new GetLovHierarchyMemberByIdResponse();
    }

    /**
     * Create an instance of {@link LabelDto }
     * 
     */
    public LabelDto createLabelDto() {
        return new LabelDto();
    }

    /**
     * Create an instance of {@link GenericLovForHierarchingDto }
     * 
     */
    public GenericLovForHierarchingDto createGenericLovForHierarchingDto() {
        return new GenericLovForHierarchingDto();
    }

    /**
     * Create an instance of {@link MakeLovHierarchyMemberFromLovResponse }
     * 
     */
    public MakeLovHierarchyMemberFromLovResponse createMakeLovHierarchyMemberFromLovResponse() {
        return new MakeLovHierarchyMemberFromLovResponse();
    }

    /**
     * Create an instance of {@link UpdateHierarchyResponse }
     * 
     */
    public UpdateHierarchyResponse createUpdateHierarchyResponse() {
        return new UpdateHierarchyResponse();
    }

    /**
     * Create an instance of {@link UuidIdPairDto }
     * 
     */
    public UuidIdPairDto createUuidIdPairDto() {
        return new UuidIdPairDto();
    }

    /**
     * Create an instance of {@link LinkHierarchyMembers }
     * 
     */
    public LinkHierarchyMembers createLinkHierarchyMembers() {
        return new LinkHierarchyMembers();
    }

    /**
     * Create an instance of {@link DeleteHierarchyMemberResponse }
     * 
     */
    public DeleteHierarchyMemberResponse createDeleteHierarchyMemberResponse() {
        return new DeleteHierarchyMemberResponse();
    }

    /**
     * Create an instance of {@link UpdateHierarchyMemberUnlockers }
     * 
     */
    public UpdateHierarchyMemberUnlockers createUpdateHierarchyMemberUnlockers() {
        return new UpdateHierarchyMemberUnlockers();
    }

    /**
     * Create an instance of {@link GetLovsByUnlockersWithFilterResponse }
     * 
     */
    public GetLovsByUnlockersWithFilterResponse createGetLovsByUnlockersWithFilterResponse() {
        return new GetLovsByUnlockersWithFilterResponse();
    }

    /**
     * Create an instance of {@link Activators }
     * 
     */
    public Activators createActivators() {
        return new Activators();
    }

    /**
     * Create an instance of {@link LovHierarchyMemberDto.Departments }
     * 
     */
    public LovHierarchyMemberDto.Departments createLovHierarchyMemberDtoDepartments() {
        return new LovHierarchyMemberDto.Departments();
    }

    /**
     * Create an instance of {@link LovHierarchyMemberDto.Hparents }
     * 
     */
    public LovHierarchyMemberDto.Hparents createLovHierarchyMemberDtoHparents() {
        return new LovHierarchyMemberDto.Hparents();
    }

    /**
     * Create an instance of {@link LovHierarchyMemberDto.Vlovs }
     * 
     */
    public LovHierarchyMemberDto.Vlovs createLovHierarchyMemberDtoVlovs() {
        return new LovHierarchyMemberDto.Vlovs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWholeHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getWholeHierarchy")
    public JAXBElement<GetWholeHierarchy> createGetWholeHierarchy(GetWholeHierarchy value) {
        return new JAXBElement<GetWholeHierarchy>(_GetWholeHierarchy_QNAME, GetWholeHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkHierarchyMembersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "linkHierarchyMembersResponse")
    public JAXBElement<LinkHierarchyMembersResponse> createLinkHierarchyMembersResponse(LinkHierarchyMembersResponse value) {
        return new JAXBElement<LinkHierarchyMembersResponse>(_LinkHierarchyMembersResponse_QNAME, LinkHierarchyMembersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLovsAvilableForHierarchingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getLovsAvilableForHierarchingResponse")
    public JAXBElement<GetLovsAvilableForHierarchingResponse> createGetLovsAvilableForHierarchingResponse(GetLovsAvilableForHierarchingResponse value) {
        return new JAXBElement<GetLovsAvilableForHierarchingResponse>(_GetLovsAvilableForHierarchingResponse_QNAME, GetLovsAvilableForHierarchingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHierarchyMemberUnlockersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updateHierarchyMemberUnlockersResponse")
    public JAXBElement<UpdateHierarchyMemberUnlockersResponse> createUpdateHierarchyMemberUnlockersResponse(UpdateHierarchyMemberUnlockersResponse value) {
        return new JAXBElement<UpdateHierarchyMemberUnlockersResponse>(_UpdateHierarchyMemberUnlockersResponse_QNAME, UpdateHierarchyMemberUnlockersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LovHierarchyMemberDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "hlov")
    public JAXBElement<LovHierarchyMemberDto> createHlov(LovHierarchyMemberDto value) {
        return new JAXBElement<LovHierarchyMemberDto>(_Hlov_QNAME, LovHierarchyMemberDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeLovHierarchyMemberFromLov }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "makeLovHierarchyMemberFromLov")
    public JAXBElement<MakeLovHierarchyMemberFromLov> createMakeLovHierarchyMemberFromLov(MakeLovHierarchyMemberFromLov value) {
        return new JAXBElement<MakeLovHierarchyMemberFromLov>(_MakeLovHierarchyMemberFromLov_QNAME, MakeLovHierarchyMemberFromLov.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSingleHierarchyMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updateSingleHierarchyMemberResponse")
    public JAXBElement<UpdateSingleHierarchyMemberResponse> createUpdateSingleHierarchyMemberResponse(UpdateSingleHierarchyMemberResponse value) {
        return new JAXBElement<UpdateSingleHierarchyMemberResponse>(_UpdateSingleHierarchyMemberResponse_QNAME, UpdateSingleHierarchyMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResultDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "operationResultDto")
    public JAXBElement<OperationResultDto> createOperationResultDto(OperationResultDto value) {
        return new JAXBElement<OperationResultDto>(_OperationResultDto_QNAME, OperationResultDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnLinkHierarchyMembers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "unLinkHierarchyMembers")
    public JAXBElement<UnLinkHierarchyMembers> createUnLinkHierarchyMembers(UnLinkHierarchyMembers value) {
        return new JAXBElement<UnLinkHierarchyMembers>(_UnLinkHierarchyMembers_QNAME, UnLinkHierarchyMembers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSingleHierarchyMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updateSingleHierarchyMember")
    public JAXBElement<UpdateSingleHierarchyMember> createUpdateSingleHierarchyMember(UpdateSingleHierarchyMember value) {
        return new JAXBElement<UpdateSingleHierarchyMember>(_UpdateSingleHierarchyMember_QNAME, UpdateSingleHierarchyMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLovsByUnlockers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getLovsByUnlockers")
    public JAXBElement<GetLovsByUnlockers> createGetLovsByUnlockers(GetLovsByUnlockers value) {
        return new JAXBElement<GetLovsByUnlockers>(_GetLovsByUnlockers_QNAME, GetLovsByUnlockers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWholeHierarchyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getWholeHierarchyResponse")
    public JAXBElement<GetWholeHierarchyResponse> createGetWholeHierarchyResponse(GetWholeHierarchyResponse value) {
        return new JAXBElement<GetWholeHierarchyResponse>(_GetWholeHierarchyResponse_QNAME, GetWholeHierarchyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHierarchyMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "deleteHierarchyMember")
    public JAXBElement<DeleteHierarchyMember> createDeleteHierarchyMember(DeleteHierarchyMember value) {
        return new JAXBElement<DeleteHierarchyMember>(_DeleteHierarchyMember_QNAME, DeleteHierarchyMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLovHierarchyMemberById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getLovHierarchyMemberById")
    public JAXBElement<GetLovHierarchyMemberById> createGetLovHierarchyMemberById(GetLovHierarchyMemberById value) {
        return new JAXBElement<GetLovHierarchyMemberById>(_GetLovHierarchyMemberById_QNAME, GetLovHierarchyMemberById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnLinkHierarchyMembersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "unLinkHierarchyMembersResponse")
    public JAXBElement<UnLinkHierarchyMembersResponse> createUnLinkHierarchyMembersResponse(UnLinkHierarchyMembersResponse value) {
        return new JAXBElement<UnLinkHierarchyMembersResponse>(_UnLinkHierarchyMembersResponse_QNAME, UnLinkHierarchyMembersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLovsByUnlockersWithFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getLovsByUnlockersWithFilter")
    public JAXBElement<GetLovsByUnlockersWithFilter> createGetLovsByUnlockersWithFilter(GetLovsByUnlockersWithFilter value) {
        return new JAXBElement<GetLovsByUnlockersWithFilter>(_GetLovsByUnlockersWithFilter_QNAME, GetLovsByUnlockersWithFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LovLabelsDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "lov-labels")
    public JAXBElement<LovLabelsDto> createLovLabels(LovLabelsDto value) {
        return new JAXBElement<LovLabelsDto>(_LovLabels_QNAME, LovLabelsDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updateHierarchy")
    public JAXBElement<UpdateHierarchy> createUpdateHierarchy(UpdateHierarchy value) {
        return new JAXBElement<UpdateHierarchy>(_UpdateHierarchy_QNAME, UpdateHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLovsByUnlockersWithFilterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getLovsByUnlockersWithFilterResponse")
    public JAXBElement<GetLovsByUnlockersWithFilterResponse> createGetLovsByUnlockersWithFilterResponse(GetLovsByUnlockersWithFilterResponse value) {
        return new JAXBElement<GetLovsByUnlockersWithFilterResponse>(_GetLovsByUnlockersWithFilterResponse_QNAME, GetLovsByUnlockersWithFilterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHierarchyMemberUnlockers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updateHierarchyMemberUnlockers")
    public JAXBElement<UpdateHierarchyMemberUnlockers> createUpdateHierarchyMemberUnlockers(UpdateHierarchyMemberUnlockers value) {
        return new JAXBElement<UpdateHierarchyMemberUnlockers>(_UpdateHierarchyMemberUnlockers_QNAME, UpdateHierarchyMemberUnlockers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHierarchyMemberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "deleteHierarchyMemberResponse")
    public JAXBElement<DeleteHierarchyMemberResponse> createDeleteHierarchyMemberResponse(DeleteHierarchyMemberResponse value) {
        return new JAXBElement<DeleteHierarchyMemberResponse>(_DeleteHierarchyMemberResponse_QNAME, DeleteHierarchyMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkHierarchyMembers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "linkHierarchyMembers")
    public JAXBElement<LinkHierarchyMembers> createLinkHierarchyMembers(LinkHierarchyMembers value) {
        return new JAXBElement<LinkHierarchyMembers>(_LinkHierarchyMembers_QNAME, LinkHierarchyMembers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UuidIdPairDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "uuidIdPairDto")
    public JAXBElement<UuidIdPairDto> createUuidIdPairDto(UuidIdPairDto value) {
        return new JAXBElement<UuidIdPairDto>(_UuidIdPairDto_QNAME, UuidIdPairDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHierarchyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "updateHierarchyResponse")
    public JAXBElement<UpdateHierarchyResponse> createUpdateHierarchyResponse(UpdateHierarchyResponse value) {
        return new JAXBElement<UpdateHierarchyResponse>(_UpdateHierarchyResponse_QNAME, UpdateHierarchyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeLovHierarchyMemberFromLovResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "makeLovHierarchyMemberFromLovResponse")
    public JAXBElement<MakeLovHierarchyMemberFromLovResponse> createMakeLovHierarchyMemberFromLovResponse(MakeLovHierarchyMemberFromLovResponse value) {
        return new JAXBElement<MakeLovHierarchyMemberFromLovResponse>(_MakeLovHierarchyMemberFromLovResponse_QNAME, MakeLovHierarchyMemberFromLovResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericLovForHierarchingDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "genericLovForHierarchingDto")
    public JAXBElement<GenericLovForHierarchingDto> createGenericLovForHierarchingDto(GenericLovForHierarchingDto value) {
        return new JAXBElement<GenericLovForHierarchingDto>(_GenericLovForHierarchingDto_QNAME, GenericLovForHierarchingDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "label")
    public JAXBElement<LabelDto> createLabel(LabelDto value) {
        return new JAXBElement<LabelDto>(_Label_QNAME, LabelDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLovHierarchyMemberByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getLovHierarchyMemberByIdResponse")
    public JAXBElement<GetLovHierarchyMemberByIdResponse> createGetLovHierarchyMemberByIdResponse(GetLovHierarchyMemberByIdResponse value) {
        return new JAXBElement<GetLovHierarchyMemberByIdResponse>(_GetLovHierarchyMemberByIdResponse_QNAME, GetLovHierarchyMemberByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLovsAvilableForHierarching }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getLovsAvilableForHierarching")
    public JAXBElement<GetLovsAvilableForHierarching> createGetLovsAvilableForHierarching(GetLovsAvilableForHierarching value) {
        return new JAXBElement<GetLovsAvilableForHierarching>(_GetLovsAvilableForHierarching_QNAME, GetLovsAvilableForHierarching.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLovsByUnlockersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "getLovsByUnlockersResponse")
    public JAXBElement<GetLovsByUnlockersResponse> createGetLovsByUnlockersResponse(GetLovsByUnlockersResponse value) {
        return new JAXBElement<GetLovsByUnlockersResponse>(_GetLovsByUnlockersResponse_QNAME, GetLovsByUnlockersResponse.class, null, value);
    }

}
