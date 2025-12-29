
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contractDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accepted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="acceptedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="alternativeApprovers" type="{http://ws.mrted.com/}userDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="approval" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="approved" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approverUser" type="{http://ws.mrted.com/}userDto" minOccurs="0"/>
 *         &lt;element name="bonusCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="candidate" type="{http://ws.mrted.com/}profileDto" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="communicationLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractSentOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contractSignedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contractor" type="{http://ws.mrted.com/}contractor" minOccurs="0"/>
 *         &lt;element name="contractorContract" type="{http://ws.mrted.com/}contractorContract" minOccurs="0"/>
 *         &lt;element name="contractorRates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rate" type="{http://ws.mrted.com/}rate" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="creation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creationUser" type="{http://ws.mrted.com/}userDto" minOccurs="0"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expenseReimbursed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="exportReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="freeFormFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="freeFormField" type="{http://ws.mrted.com/}freeFormFieldContract" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lovs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lov" type="{http://ws.mrted.com/}genericLov" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="offerSentOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="permanentContract" type="{http://ws.mrted.com/}permanentContract" minOccurs="0"/>
 *         &lt;element name="plannedEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="plannedStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="probationaryPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reassignTasks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reminderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="schedule" type="{http://ws.mrted.com/}schedule" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submitted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="taskNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taskOverdue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="timeZoneInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOfUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="update" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updateUser" type="{http://ws.mrted.com/}userDto" minOccurs="0"/>
 *         &lt;element name="vendorDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractDto", propOrder = {
    "accepted",
    "acceptedDate",
    "alternativeApprovers",
    "applicationId",
    "approval",
    "approved",
    "approverUser",
    "bonusCondition",
    "candidate",
    "comments",
    "communicationLang",
    "contractComment",
    "contractSentOn",
    "contractSignedOn",
    "contractor",
    "contractorContract",
    "contractorRates",
    "creation",
    "creationUser",
    "current",
    "dueDate",
    "expenseReimbursed",
    "exportReason",
    "extension",
    "freeFormFields",
    "id",
    "length",
    "lengthUnit",
    "lovs",
    "offerSentOn",
    "permanentContract",
    "plannedEndDate",
    "plannedStartDate",
    "probationaryPeriod",
    "reason",
    "reassignTasks",
    "reminderDate",
    "revision",
    "schedule",
    "status",
    "submitted",
    "taskNotification",
    "taskOverdue",
    "timeZoneInfo",
    "type",
    "typeOfUser",
    "update",
    "updateUser",
    "vendorDetails",
    "vendorName",
    "version"
})
public class ContractDto {

    protected Boolean accepted;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acceptedDate;
    @XmlElement(nillable = true)
    protected List<UserDto> alternativeApprovers;
    protected Long applicationId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approval;
    protected Boolean approved;
    protected UserDto approverUser;
    protected String bonusCondition;
    protected ProfileDto candidate;
    protected String comments;
    protected String communicationLang;
    protected String contractComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractSentOn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contractSignedOn;
    protected Contractor contractor;
    protected ContractorContract contractorContract;
    protected ContractDto.ContractorRates contractorRates;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creation;
    protected UserDto creationUser;
    protected Boolean current;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    protected Boolean expenseReimbursed;
    protected String exportReason;
    protected Integer extension;
    protected ContractDto.FreeFormFields freeFormFields;
    protected Long id;
    protected Float length;
    protected String lengthUnit;
    protected ContractDto.Lovs lovs;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offerSentOn;
    protected PermanentContract permanentContract;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedStartDate;
    protected String probationaryPeriod;
    protected String reason;
    protected Boolean reassignTasks;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reminderDate;
    protected Boolean revision;
    protected Schedule schedule;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitted;
    protected Boolean taskNotification;
    protected Long taskOverdue;
    protected String timeZoneInfo;
    protected String type;
    protected String typeOfUser;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar update;
    protected UserDto updateUser;
    protected String vendorDetails;
    protected String vendorName;
    protected Integer version;

    /**
     * Gets the value of the accepted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccepted(Boolean value) {
        this.accepted = value;
    }

    /**
     * Gets the value of the acceptedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptedDate() {
        return acceptedDate;
    }

    /**
     * Sets the value of the acceptedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcceptedDate(XMLGregorianCalendar value) {
        this.acceptedDate = value;
    }

    /**
     * Gets the value of the alternativeApprovers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeApprovers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeApprovers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDto }
     * 
     * 
     */
    public List<UserDto> getAlternativeApprovers() {
        if (alternativeApprovers == null) {
            alternativeApprovers = new ArrayList<UserDto>();
        }
        return this.alternativeApprovers;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the approval property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproval() {
        return approval;
    }

    /**
     * Sets the value of the approval property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproval(XMLGregorianCalendar value) {
        this.approval = value;
    }

    /**
     * Gets the value of the approved property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproved() {
        return approved;
    }

    /**
     * Sets the value of the approved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproved(Boolean value) {
        this.approved = value;
    }

    /**
     * Gets the value of the approverUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserDto }
     *     
     */
    public UserDto getApproverUser() {
        return approverUser;
    }

    /**
     * Sets the value of the approverUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDto }
     *     
     */
    public void setApproverUser(UserDto value) {
        this.approverUser = value;
    }

    /**
     * Gets the value of the bonusCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusCondition() {
        return bonusCondition;
    }

    /**
     * Sets the value of the bonusCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusCondition(String value) {
        this.bonusCondition = value;
    }

    /**
     * Gets the value of the candidate property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileDto }
     *     
     */
    public ProfileDto getCandidate() {
        return candidate;
    }

    /**
     * Sets the value of the candidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileDto }
     *     
     */
    public void setCandidate(ProfileDto value) {
        this.candidate = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the communicationLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationLang() {
        return communicationLang;
    }

    /**
     * Sets the value of the communicationLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationLang(String value) {
        this.communicationLang = value;
    }

    /**
     * Gets the value of the contractComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractComment() {
        return contractComment;
    }

    /**
     * Sets the value of the contractComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractComment(String value) {
        this.contractComment = value;
    }

    /**
     * Gets the value of the contractSentOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractSentOn() {
        return contractSentOn;
    }

    /**
     * Sets the value of the contractSentOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractSentOn(XMLGregorianCalendar value) {
        this.contractSentOn = value;
    }

    /**
     * Gets the value of the contractSignedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractSignedOn() {
        return contractSignedOn;
    }

    /**
     * Sets the value of the contractSignedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractSignedOn(XMLGregorianCalendar value) {
        this.contractSignedOn = value;
    }

    /**
     * Gets the value of the contractor property.
     * 
     * @return
     *     possible object is
     *     {@link Contractor }
     *     
     */
    public Contractor getContractor() {
        return contractor;
    }

    /**
     * Sets the value of the contractor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contractor }
     *     
     */
    public void setContractor(Contractor value) {
        this.contractor = value;
    }

    /**
     * Gets the value of the contractorContract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorContract }
     *     
     */
    public ContractorContract getContractorContract() {
        return contractorContract;
    }

    /**
     * Sets the value of the contractorContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorContract }
     *     
     */
    public void setContractorContract(ContractorContract value) {
        this.contractorContract = value;
    }

    /**
     * Gets the value of the contractorRates property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDto.ContractorRates }
     *     
     */
    public ContractDto.ContractorRates getContractorRates() {
        return contractorRates;
    }

    /**
     * Sets the value of the contractorRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDto.ContractorRates }
     *     
     */
    public void setContractorRates(ContractDto.ContractorRates value) {
        this.contractorRates = value;
    }

    /**
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreation(XMLGregorianCalendar value) {
        this.creation = value;
    }

    /**
     * Gets the value of the creationUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserDto }
     *     
     */
    public UserDto getCreationUser() {
        return creationUser;
    }

    /**
     * Sets the value of the creationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDto }
     *     
     */
    public void setCreationUser(UserDto value) {
        this.creationUser = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrent(Boolean value) {
        this.current = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the expenseReimbursed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpenseReimbursed() {
        return expenseReimbursed;
    }

    /**
     * Sets the value of the expenseReimbursed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpenseReimbursed(Boolean value) {
        this.expenseReimbursed = value;
    }

    /**
     * Gets the value of the exportReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportReason() {
        return exportReason;
    }

    /**
     * Sets the value of the exportReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportReason(String value) {
        this.exportReason = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExtension(Integer value) {
        this.extension = value;
    }

    /**
     * Gets the value of the freeFormFields property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDto.FreeFormFields }
     *     
     */
    public ContractDto.FreeFormFields getFreeFormFields() {
        return freeFormFields;
    }

    /**
     * Sets the value of the freeFormFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDto.FreeFormFields }
     *     
     */
    public void setFreeFormFields(ContractDto.FreeFormFields value) {
        this.freeFormFields = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLength(Float value) {
        this.length = value;
    }

    /**
     * Gets the value of the lengthUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * Sets the value of the lengthUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengthUnit(String value) {
        this.lengthUnit = value;
    }

    /**
     * Gets the value of the lovs property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDto.Lovs }
     *     
     */
    public ContractDto.Lovs getLovs() {
        return lovs;
    }

    /**
     * Sets the value of the lovs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDto.Lovs }
     *     
     */
    public void setLovs(ContractDto.Lovs value) {
        this.lovs = value;
    }

    /**
     * Gets the value of the offerSentOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOfferSentOn() {
        return offerSentOn;
    }

    /**
     * Sets the value of the offerSentOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOfferSentOn(XMLGregorianCalendar value) {
        this.offerSentOn = value;
    }

    /**
     * Gets the value of the permanentContract property.
     * 
     * @return
     *     possible object is
     *     {@link PermanentContract }
     *     
     */
    public PermanentContract getPermanentContract() {
        return permanentContract;
    }

    /**
     * Sets the value of the permanentContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermanentContract }
     *     
     */
    public void setPermanentContract(PermanentContract value) {
        this.permanentContract = value;
    }

    /**
     * Gets the value of the plannedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedEndDate() {
        return plannedEndDate;
    }

    /**
     * Sets the value of the plannedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedEndDate(XMLGregorianCalendar value) {
        this.plannedEndDate = value;
    }

    /**
     * Gets the value of the plannedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlannedStartDate() {
        return plannedStartDate;
    }

    /**
     * Sets the value of the plannedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlannedStartDate(XMLGregorianCalendar value) {
        this.plannedStartDate = value;
    }

    /**
     * Gets the value of the probationaryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbationaryPeriod() {
        return probationaryPeriod;
    }

    /**
     * Sets the value of the probationaryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbationaryPeriod(String value) {
        this.probationaryPeriod = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the reassignTasks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReassignTasks() {
        return reassignTasks;
    }

    /**
     * Sets the value of the reassignTasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReassignTasks(Boolean value) {
        this.reassignTasks = value;
    }

    /**
     * Gets the value of the reminderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReminderDate() {
        return reminderDate;
    }

    /**
     * Sets the value of the reminderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReminderDate(XMLGregorianCalendar value) {
        this.reminderDate = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevision(Boolean value) {
        this.revision = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setSchedule(Schedule value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the submitted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitted() {
        return submitted;
    }

    /**
     * Sets the value of the submitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitted(XMLGregorianCalendar value) {
        this.submitted = value;
    }

    /**
     * Gets the value of the taskNotification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaskNotification() {
        return taskNotification;
    }

    /**
     * Sets the value of the taskNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaskNotification(Boolean value) {
        this.taskNotification = value;
    }

    /**
     * Gets the value of the taskOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaskOverdue() {
        return taskOverdue;
    }

    /**
     * Sets the value of the taskOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaskOverdue(Long value) {
        this.taskOverdue = value;
    }

    /**
     * Gets the value of the timeZoneInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneInfo() {
        return timeZoneInfo;
    }

    /**
     * Sets the value of the timeZoneInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneInfo(String value) {
        this.timeZoneInfo = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeOfUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfUser() {
        return typeOfUser;
    }

    /**
     * Sets the value of the typeOfUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfUser(String value) {
        this.typeOfUser = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdate(XMLGregorianCalendar value) {
        this.update = value;
    }

    /**
     * Gets the value of the updateUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserDto }
     *     
     */
    public UserDto getUpdateUser() {
        return updateUser;
    }

    /**
     * Sets the value of the updateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDto }
     *     
     */
    public void setUpdateUser(UserDto value) {
        this.updateUser = value;
    }

    /**
     * Gets the value of the vendorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorDetails() {
        return vendorDetails;
    }

    /**
     * Sets the value of the vendorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorDetails(String value) {
        this.vendorDetails = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="rate" type="{http://ws.mrted.com/}rate" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rate"
    })
    public static class ContractorRates {

        protected List<Rate> rate;

        /**
         * Gets the value of the rate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rate }
         * 
         * 
         */
        public List<Rate> getRate() {
            if (rate == null) {
                rate = new ArrayList<Rate>();
            }
            return this.rate;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="freeFormField" type="{http://ws.mrted.com/}freeFormFieldContract" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "freeFormField"
    })
    public static class FreeFormFields {

        protected List<FreeFormFieldContract> freeFormField;

        /**
         * Gets the value of the freeFormField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeFormField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeFormField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeFormFieldContract }
         * 
         * 
         */
        public List<FreeFormFieldContract> getFreeFormField() {
            if (freeFormField == null) {
                freeFormField = new ArrayList<FreeFormFieldContract>();
            }
            return this.freeFormField;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="lov" type="{http://ws.mrted.com/}genericLov" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lov"
    })
    public static class Lovs {

        protected List<GenericLov> lov;

        /**
         * Gets the value of the lov property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lov property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLov().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GenericLov }
         * 
         * 
         */
        public List<GenericLov> getLov() {
            if (lov == null) {
                lov = new ArrayList<GenericLov>();
            }
            return this.lov;
        }

    }

}
