
package com.mrted.ws.configfields;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mrted.ws.configfields package. 
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

    private final static QName _RemoveLOVEntryResponse_QNAME = new QName("http://ws.mrted.com/", "removeLOVEntryResponse");
    private final static QName _SetLOVEntry_QNAME = new QName("http://ws.mrted.com/", "setLOVEntry");
    private final static QName _RemoveFreeFormFieldEntry_QNAME = new QName("http://ws.mrted.com/", "removeFreeFormFieldEntry");
    private final static QName _FffData_QNAME = new QName("http://ws.mrted.com/", "fff-data");
    private final static QName _SetUserDataEntryResponse_QNAME = new QName("http://ws.mrted.com/", "setUserDataEntryResponse");
    private final static QName _SetLOVLabels_QNAME = new QName("http://ws.mrted.com/", "setLOVLabels");
    private final static QName _SetLOVEntryResponse_QNAME = new QName("http://ws.mrted.com/", "setLOVEntryResponse");
    private final static QName _SetFreeFormFieldLabelsResponse_QNAME = new QName("http://ws.mrted.com/", "setFreeFormFieldLabelsResponse");
    private final static QName _SetFreeFormFieldEntry_QNAME = new QName("http://ws.mrted.com/", "setFreeFormFieldEntry");
    private final static QName _SetFreeFormFieldLabels_QNAME = new QName("http://ws.mrted.com/", "setFreeFormFieldLabels");
    private final static QName _SetUserDataEntry_QNAME = new QName("http://ws.mrted.com/", "setUserDataEntry");
    private final static QName _OperationResultDto_QNAME = new QName("http://ws.mrted.com/", "operationResultDto");
    private final static QName _LovData_QNAME = new QName("http://ws.mrted.com/", "lov-data");
    private final static QName _Lov_QNAME = new QName("http://ws.mrted.com/", "lov");
    private final static QName _Label_QNAME = new QName("http://ws.mrted.com/", "label");
    private final static QName _SetUserDataLabelsResponse_QNAME = new QName("http://ws.mrted.com/", "setUserDataLabelsResponse");
    private final static QName _SetUserDataLabels_QNAME = new QName("http://ws.mrted.com/", "setUserDataLabels");
    private final static QName _RemoveFreeFormFieldEntryResponse_QNAME = new QName("http://ws.mrted.com/", "removeFreeFormFieldEntryResponse");
    private final static QName _RemoveUserDataEntryResponse_QNAME = new QName("http://ws.mrted.com/", "removeUserDataEntryResponse");
    private final static QName _LovLabels_QNAME = new QName("http://ws.mrted.com/", "lov-labels");
    private final static QName _RemoveLOVEntry_QNAME = new QName("http://ws.mrted.com/", "removeLOVEntry");
    private final static QName _SetFreeFormFieldEntryResponse_QNAME = new QName("http://ws.mrted.com/", "setFreeFormFieldEntryResponse");
    private final static QName _RemoveUserDataEntry_QNAME = new QName("http://ws.mrted.com/", "removeUserDataEntry");
    private final static QName _SetLOVLabelsResponse_QNAME = new QName("http://ws.mrted.com/", "setLOVLabelsResponse");
    private final static QName _GenericLovDtoNewDataValue_QNAME = new QName("", "new-data-value");
    private final static QName _GenericLovDtoLovId_QNAME = new QName("", "lov_id");
    private final static QName _GenericLovDtoNewValue_QNAME = new QName("", "new-value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mrted.ws.configfields
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveUserDataEntry }
     * 
     */
    public RemoveUserDataEntry createRemoveUserDataEntry() {
        return new RemoveUserDataEntry();
    }

    /**
     * Create an instance of {@link SetLOVLabelsResponse }
     * 
     */
    public SetLOVLabelsResponse createSetLOVLabelsResponse() {
        return new SetLOVLabelsResponse();
    }

    /**
     * Create an instance of {@link RemoveLOVEntry }
     * 
     */
    public RemoveLOVEntry createRemoveLOVEntry() {
        return new RemoveLOVEntry();
    }

    /**
     * Create an instance of {@link SetFreeFormFieldEntryResponse }
     * 
     */
    public SetFreeFormFieldEntryResponse createSetFreeFormFieldEntryResponse() {
        return new SetFreeFormFieldEntryResponse();
    }

    /**
     * Create an instance of {@link LovLabelsDto }
     * 
     */
    public LovLabelsDto createLovLabelsDto() {
        return new LovLabelsDto();
    }

    /**
     * Create an instance of {@link RemoveUserDataEntryResponse }
     * 
     */
    public RemoveUserDataEntryResponse createRemoveUserDataEntryResponse() {
        return new RemoveUserDataEntryResponse();
    }

    /**
     * Create an instance of {@link RemoveFreeFormFieldEntryResponse }
     * 
     */
    public RemoveFreeFormFieldEntryResponse createRemoveFreeFormFieldEntryResponse() {
        return new RemoveFreeFormFieldEntryResponse();
    }

    /**
     * Create an instance of {@link SetUserDataLabels }
     * 
     */
    public SetUserDataLabels createSetUserDataLabels() {
        return new SetUserDataLabels();
    }

    /**
     * Create an instance of {@link LabelDto }
     * 
     */
    public LabelDto createLabelDto() {
        return new LabelDto();
    }

    /**
     * Create an instance of {@link SetUserDataLabelsResponse }
     * 
     */
    public SetUserDataLabelsResponse createSetUserDataLabelsResponse() {
        return new SetUserDataLabelsResponse();
    }

    /**
     * Create an instance of {@link GenericLovDto }
     * 
     */
    public GenericLovDto createGenericLovDto() {
        return new GenericLovDto();
    }

    /**
     * Create an instance of {@link OperationResultDto }
     * 
     */
    public OperationResultDto createOperationResultDto() {
        return new OperationResultDto();
    }

    /**
     * Create an instance of {@link SetFreeFormFieldEntry }
     * 
     */
    public SetFreeFormFieldEntry createSetFreeFormFieldEntry() {
        return new SetFreeFormFieldEntry();
    }

    /**
     * Create an instance of {@link SetFreeFormFieldLabels }
     * 
     */
    public SetFreeFormFieldLabels createSetFreeFormFieldLabels() {
        return new SetFreeFormFieldLabels();
    }

    /**
     * Create an instance of {@link SetUserDataEntry }
     * 
     */
    public SetUserDataEntry createSetUserDataEntry() {
        return new SetUserDataEntry();
    }

    /**
     * Create an instance of {@link SetFreeFormFieldLabelsResponse }
     * 
     */
    public SetFreeFormFieldLabelsResponse createSetFreeFormFieldLabelsResponse() {
        return new SetFreeFormFieldLabelsResponse();
    }

    /**
     * Create an instance of {@link SetLOVEntryResponse }
     * 
     */
    public SetLOVEntryResponse createSetLOVEntryResponse() {
        return new SetLOVEntryResponse();
    }

    /**
     * Create an instance of {@link SetLOVLabels }
     * 
     */
    public SetLOVLabels createSetLOVLabels() {
        return new SetLOVLabels();
    }

    /**
     * Create an instance of {@link FreeFormFieldEntryDto }
     * 
     */
    public FreeFormFieldEntryDto createFreeFormFieldEntryDto() {
        return new FreeFormFieldEntryDto();
    }

    /**
     * Create an instance of {@link SetUserDataEntryResponse }
     * 
     */
    public SetUserDataEntryResponse createSetUserDataEntryResponse() {
        return new SetUserDataEntryResponse();
    }

    /**
     * Create an instance of {@link RemoveFreeFormFieldEntry }
     * 
     */
    public RemoveFreeFormFieldEntry createRemoveFreeFormFieldEntry() {
        return new RemoveFreeFormFieldEntry();
    }

    /**
     * Create an instance of {@link RemoveLOVEntryResponse }
     * 
     */
    public RemoveLOVEntryResponse createRemoveLOVEntryResponse() {
        return new RemoveLOVEntryResponse();
    }

    /**
     * Create an instance of {@link SetLOVEntry }
     * 
     */
    public SetLOVEntry createSetLOVEntry() {
        return new SetLOVEntry();
    }

    /**
     * Create an instance of {@link GenericLov }
     * 
     */
    public GenericLov createGenericLov() {
        return new GenericLov();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveLOVEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeLOVEntryResponse")
    public JAXBElement<RemoveLOVEntryResponse> createRemoveLOVEntryResponse(RemoveLOVEntryResponse value) {
        return new JAXBElement<RemoveLOVEntryResponse>(_RemoveLOVEntryResponse_QNAME, RemoveLOVEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLOVEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setLOVEntry")
    public JAXBElement<SetLOVEntry> createSetLOVEntry(SetLOVEntry value) {
        return new JAXBElement<SetLOVEntry>(_SetLOVEntry_QNAME, SetLOVEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFreeFormFieldEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeFreeFormFieldEntry")
    public JAXBElement<RemoveFreeFormFieldEntry> createRemoveFreeFormFieldEntry(RemoveFreeFormFieldEntry value) {
        return new JAXBElement<RemoveFreeFormFieldEntry>(_RemoveFreeFormFieldEntry_QNAME, RemoveFreeFormFieldEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeFormFieldEntryDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "fff-data")
    public JAXBElement<FreeFormFieldEntryDto> createFffData(FreeFormFieldEntryDto value) {
        return new JAXBElement<FreeFormFieldEntryDto>(_FffData_QNAME, FreeFormFieldEntryDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserDataEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setUserDataEntryResponse")
    public JAXBElement<SetUserDataEntryResponse> createSetUserDataEntryResponse(SetUserDataEntryResponse value) {
        return new JAXBElement<SetUserDataEntryResponse>(_SetUserDataEntryResponse_QNAME, SetUserDataEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLOVLabels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setLOVLabels")
    public JAXBElement<SetLOVLabels> createSetLOVLabels(SetLOVLabels value) {
        return new JAXBElement<SetLOVLabels>(_SetLOVLabels_QNAME, SetLOVLabels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLOVEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setLOVEntryResponse")
    public JAXBElement<SetLOVEntryResponse> createSetLOVEntryResponse(SetLOVEntryResponse value) {
        return new JAXBElement<SetLOVEntryResponse>(_SetLOVEntryResponse_QNAME, SetLOVEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFreeFormFieldLabelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setFreeFormFieldLabelsResponse")
    public JAXBElement<SetFreeFormFieldLabelsResponse> createSetFreeFormFieldLabelsResponse(SetFreeFormFieldLabelsResponse value) {
        return new JAXBElement<SetFreeFormFieldLabelsResponse>(_SetFreeFormFieldLabelsResponse_QNAME, SetFreeFormFieldLabelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFreeFormFieldEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setFreeFormFieldEntry")
    public JAXBElement<SetFreeFormFieldEntry> createSetFreeFormFieldEntry(SetFreeFormFieldEntry value) {
        return new JAXBElement<SetFreeFormFieldEntry>(_SetFreeFormFieldEntry_QNAME, SetFreeFormFieldEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFreeFormFieldLabels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setFreeFormFieldLabels")
    public JAXBElement<SetFreeFormFieldLabels> createSetFreeFormFieldLabels(SetFreeFormFieldLabels value) {
        return new JAXBElement<SetFreeFormFieldLabels>(_SetFreeFormFieldLabels_QNAME, SetFreeFormFieldLabels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserDataEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setUserDataEntry")
    public JAXBElement<SetUserDataEntry> createSetUserDataEntry(SetUserDataEntry value) {
        return new JAXBElement<SetUserDataEntry>(_SetUserDataEntry_QNAME, SetUserDataEntry.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericLovDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "lov-data")
    public JAXBElement<GenericLovDto> createLovData(GenericLovDto value) {
        return new JAXBElement<GenericLovDto>(_LovData_QNAME, GenericLovDto.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "label")
    public JAXBElement<LabelDto> createLabel(LabelDto value) {
        return new JAXBElement<LabelDto>(_Label_QNAME, LabelDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserDataLabelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setUserDataLabelsResponse")
    public JAXBElement<SetUserDataLabelsResponse> createSetUserDataLabelsResponse(SetUserDataLabelsResponse value) {
        return new JAXBElement<SetUserDataLabelsResponse>(_SetUserDataLabelsResponse_QNAME, SetUserDataLabelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetUserDataLabels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setUserDataLabels")
    public JAXBElement<SetUserDataLabels> createSetUserDataLabels(SetUserDataLabels value) {
        return new JAXBElement<SetUserDataLabels>(_SetUserDataLabels_QNAME, SetUserDataLabels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFreeFormFieldEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeFreeFormFieldEntryResponse")
    public JAXBElement<RemoveFreeFormFieldEntryResponse> createRemoveFreeFormFieldEntryResponse(RemoveFreeFormFieldEntryResponse value) {
        return new JAXBElement<RemoveFreeFormFieldEntryResponse>(_RemoveFreeFormFieldEntryResponse_QNAME, RemoveFreeFormFieldEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserDataEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeUserDataEntryResponse")
    public JAXBElement<RemoveUserDataEntryResponse> createRemoveUserDataEntryResponse(RemoveUserDataEntryResponse value) {
        return new JAXBElement<RemoveUserDataEntryResponse>(_RemoveUserDataEntryResponse_QNAME, RemoveUserDataEntryResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveLOVEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeLOVEntry")
    public JAXBElement<RemoveLOVEntry> createRemoveLOVEntry(RemoveLOVEntry value) {
        return new JAXBElement<RemoveLOVEntry>(_RemoveLOVEntry_QNAME, RemoveLOVEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFreeFormFieldEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setFreeFormFieldEntryResponse")
    public JAXBElement<SetFreeFormFieldEntryResponse> createSetFreeFormFieldEntryResponse(SetFreeFormFieldEntryResponse value) {
        return new JAXBElement<SetFreeFormFieldEntryResponse>(_SetFreeFormFieldEntryResponse_QNAME, SetFreeFormFieldEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserDataEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "removeUserDataEntry")
    public JAXBElement<RemoveUserDataEntry> createRemoveUserDataEntry(RemoveUserDataEntry value) {
        return new JAXBElement<RemoveUserDataEntry>(_RemoveUserDataEntry_QNAME, RemoveUserDataEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLOVLabelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mrted.com/", name = "setLOVLabelsResponse")
    public JAXBElement<SetLOVLabelsResponse> createSetLOVLabelsResponse(SetLOVLabelsResponse value) {
        return new JAXBElement<SetLOVLabelsResponse>(_SetLOVLabelsResponse_QNAME, SetLOVLabelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "new-data-value", scope = GenericLovDto.class)
    public JAXBElement<BigDecimal> createGenericLovDtoNewDataValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GenericLovDtoNewDataValue_QNAME, BigDecimal.class, GenericLovDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lov_id", scope = GenericLovDto.class)
    public JAXBElement<Long> createGenericLovDtoLovId(Long value) {
        return new JAXBElement<Long>(_GenericLovDtoLovId_QNAME, Long.class, GenericLovDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "new-value", scope = GenericLovDto.class)
    public JAXBElement<String> createGenericLovDtoNewValue(String value) {
        return new JAXBElement<String>(_GenericLovDtoNewValue_QNAME, String.class, GenericLovDto.class, value);
    }

}
