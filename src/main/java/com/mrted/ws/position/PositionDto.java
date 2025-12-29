
package com.mrted.ws.position;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for positionDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="areaOfResponsibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizedRecruitment" type="{http://ws.mrted.com/}authorizedRecruitment" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compensation" type="{http://ws.mrted.com/}compensationDto" minOccurs="0"/>
 *         &lt;element name="configurableFields" type="{http://ws.mrted.com/}configurableFieldsDto" minOccurs="0"/>
 *         &lt;element name="contractComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customField" type="{http://ws.mrted.com/}customField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descriptionTemplate" type="{http://ws.mrted.com/}jobAdTemplateDto" minOccurs="0"/>
 *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://ws.mrted.com/}duration" minOccurs="0"/>
 *         &lt;element name="expectedContractDates" type="{http://ws.mrted.com/}expectedContractDates" minOccurs="0"/>
 *         &lt;element name="generalApplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="headCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="location" type="{http://ws.mrted.com/}locationDto" minOccurs="0"/>
 *         &lt;element name="onboarding" type="{http://ws.mrted.com/}onboardingTeam" minOccurs="0"/>
 *         &lt;element name="openingPosition" type="{http://ws.mrted.com/}openingPositionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://ws.mrted.com/}organizationDto" minOccurs="0"/>
 *         &lt;element name="plainText" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="positionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profileDocument" type="{http://ws.mrted.com/}structuredDocumentDto" minOccurs="0"/>
 *         &lt;element name="renewal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requisitionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standardRate" type="{http://ws.mrted.com/}standardRate" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="team" type="{http://ws.mrted.com/}positionTeam" minOccurs="0"/>
 *         &lt;element name="teamComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCost" type="{http://ws.mrted.com/}totalCost" minOccurs="0"/>
 *         &lt;element name="workTime" type="{http://ws.mrted.com/}workTime" minOccurs="0"/>
 *         &lt;element name="encryptApplicants" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultJobLocation" type="{http://ws.mrted.com/}jobLocationDto" minOccurs="0"/>
 *         &lt;element name="jobLocations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="jobLocation" type="{http://ws.mrted.com/}jobLocationDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionDto", propOrder = {
    "areaOfResponsibility",
    "authorizedRecruitment",
    "company",
    "compensation",
    "configurableFields",
    "contractComments",
    "contractType",
    "costCenter",
    "created",
    "customField",
    "descriptionTemplate",
    "dueDate",
    "duration",
    "expectedContractDates",
    "generalApplication",
    "headCount",
    "id",
    "jobNumber",
    "lastUpdate",
    "location",
    "onboarding",
    "openingPosition",
    "organization",
    "plainText",
    "positionType",
    "profileDocument",
    "renewal",
    "requisitionNumber",
    "scheduleType",
    "standardRate",
    "status",
    "team",
    "teamComments",
    "title",
    "totalCost",
    "workTime",
    "encryptApplicants",
    "defaultJobLocation",
    "jobLocations"
})
public class PositionDto {

    protected String areaOfResponsibility;
    protected AuthorizedRecruitment authorizedRecruitment;
    protected String company;
    protected CompensationDto compensation;
    protected ConfigurableFieldsDto configurableFields;
    protected String contractComments;
    protected String contractType;
    protected String costCenter;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    protected List<CustomField> customField;
    protected JobAdTemplateDto descriptionTemplate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    protected Duration duration;
    protected ExpectedContractDates expectedContractDates;
    protected Boolean generalApplication;
    protected Long headCount;
    protected Long id;
    protected String jobNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    protected LocationDto location;
    protected OnboardingTeam onboarding;
    protected List<OpeningPositionDTO> openingPosition;
    protected OrganizationDto organization;
    protected boolean plainText;
    protected String positionType;
    protected StructuredDocumentDto profileDocument;
    protected Boolean renewal;
    protected String requisitionNumber;
    protected String scheduleType;
    protected StandardRate standardRate;
    protected String status;
    protected PositionTeam team;
    protected String teamComments;
    protected String title;
    protected TotalCost totalCost;
    protected WorkTime workTime;
    protected Boolean encryptApplicants;
    protected JobLocationDto defaultJobLocation;
    protected PositionDto.JobLocations jobLocations;

    /**
     * Gets the value of the areaOfResponsibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaOfResponsibility() {
        return areaOfResponsibility;
    }

    /**
     * Sets the value of the areaOfResponsibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaOfResponsibility(String value) {
        this.areaOfResponsibility = value;
    }

    /**
     * Gets the value of the authorizedRecruitment property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizedRecruitment }
     *     
     */
    public AuthorizedRecruitment getAuthorizedRecruitment() {
        return authorizedRecruitment;
    }

    /**
     * Sets the value of the authorizedRecruitment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizedRecruitment }
     *     
     */
    public void setAuthorizedRecruitment(AuthorizedRecruitment value) {
        this.authorizedRecruitment = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the compensation property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationDto }
     *     
     */
    public CompensationDto getCompensation() {
        return compensation;
    }

    /**
     * Sets the value of the compensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationDto }
     *     
     */
    public void setCompensation(CompensationDto value) {
        this.compensation = value;
    }

    /**
     * Gets the value of the configurableFields property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurableFieldsDto }
     *     
     */
    public ConfigurableFieldsDto getConfigurableFields() {
        return configurableFields;
    }

    /**
     * Sets the value of the configurableFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurableFieldsDto }
     *     
     */
    public void setConfigurableFields(ConfigurableFieldsDto value) {
        this.configurableFields = value;
    }

    /**
     * Gets the value of the contractComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractComments() {
        return contractComments;
    }

    /**
     * Sets the value of the contractComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractComments(String value) {
        this.contractComments = value;
    }

    /**
     * Gets the value of the contractType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractType(String value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the customField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomField() {
        if (customField == null) {
            customField = new ArrayList<CustomField>();
        }
        return this.customField;
    }

    /**
     * Gets the value of the descriptionTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link JobAdTemplateDto }
     *     
     */
    public JobAdTemplateDto getDescriptionTemplate() {
        return descriptionTemplate;
    }

    /**
     * Sets the value of the descriptionTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobAdTemplateDto }
     *     
     */
    public void setDescriptionTemplate(JobAdTemplateDto value) {
        this.descriptionTemplate = value;
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
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the expectedContractDates property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedContractDates }
     *     
     */
    public ExpectedContractDates getExpectedContractDates() {
        return expectedContractDates;
    }

    /**
     * Sets the value of the expectedContractDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedContractDates }
     *     
     */
    public void setExpectedContractDates(ExpectedContractDates value) {
        this.expectedContractDates = value;
    }

    /**
     * Gets the value of the generalApplication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeneralApplication() {
        return generalApplication;
    }

    /**
     * Sets the value of the generalApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeneralApplication(Boolean value) {
        this.generalApplication = value;
    }

    /**
     * Gets the value of the headCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeadCount() {
        return headCount;
    }

    /**
     * Sets the value of the headCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeadCount(Long value) {
        this.headCount = value;
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
     * Gets the value of the jobNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * Sets the value of the jobNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNumber(String value) {
        this.jobNumber = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDto }
     *     
     */
    public LocationDto getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDto }
     *     
     */
    public void setLocation(LocationDto value) {
        this.location = value;
    }

    /**
     * Gets the value of the onboarding property.
     * 
     * @return
     *     possible object is
     *     {@link OnboardingTeam }
     *     
     */
    public OnboardingTeam getOnboarding() {
        return onboarding;
    }

    /**
     * Sets the value of the onboarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnboardingTeam }
     *     
     */
    public void setOnboarding(OnboardingTeam value) {
        this.onboarding = value;
    }

    /**
     * Gets the value of the openingPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openingPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpeningPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpeningPositionDTO }
     * 
     * 
     */
    public List<OpeningPositionDTO> getOpeningPosition() {
        if (openingPosition == null) {
            openingPosition = new ArrayList<OpeningPositionDTO>();
        }
        return this.openingPosition;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDto }
     *     
     */
    public OrganizationDto getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDto }
     *     
     */
    public void setOrganization(OrganizationDto value) {
        this.organization = value;
    }

    /**
     * Gets the value of the plainText property.
     * 
     */
    public boolean isPlainText() {
        return plainText;
    }

    /**
     * Sets the value of the plainText property.
     * 
     */
    public void setPlainText(boolean value) {
        this.plainText = value;
    }

    /**
     * Gets the value of the positionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionType() {
        return positionType;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionType(String value) {
        this.positionType = value;
    }

    /**
     * Gets the value of the profileDocument property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDocumentDto }
     *     
     */
    public StructuredDocumentDto getProfileDocument() {
        return profileDocument;
    }

    /**
     * Sets the value of the profileDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDocumentDto }
     *     
     */
    public void setProfileDocument(StructuredDocumentDto value) {
        this.profileDocument = value;
    }

    /**
     * Gets the value of the renewal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRenewal() {
        return renewal;
    }

    /**
     * Sets the value of the renewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenewal(Boolean value) {
        this.renewal = value;
    }

    /**
     * Gets the value of the requisitionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequisitionNumber() {
        return requisitionNumber;
    }

    /**
     * Sets the value of the requisitionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequisitionNumber(String value) {
        this.requisitionNumber = value;
    }

    /**
     * Gets the value of the scheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleType() {
        return scheduleType;
    }

    /**
     * Sets the value of the scheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleType(String value) {
        this.scheduleType = value;
    }

    /**
     * Gets the value of the standardRate property.
     * 
     * @return
     *     possible object is
     *     {@link StandardRate }
     *     
     */
    public StandardRate getStandardRate() {
        return standardRate;
    }

    /**
     * Sets the value of the standardRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardRate }
     *     
     */
    public void setStandardRate(StandardRate value) {
        this.standardRate = value;
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
     * Gets the value of the team property.
     * 
     * @return
     *     possible object is
     *     {@link PositionTeam }
     *     
     */
    public PositionTeam getTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionTeam }
     *     
     */
    public void setTeam(PositionTeam value) {
        this.team = value;
    }

    /**
     * Gets the value of the teamComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamComments() {
        return teamComments;
    }

    /**
     * Sets the value of the teamComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamComments(String value) {
        this.teamComments = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCost }
     *     
     */
    public TotalCost getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCost }
     *     
     */
    public void setTotalCost(TotalCost value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the workTime property.
     * 
     * @return
     *     possible object is
     *     {@link WorkTime }
     *     
     */
    public WorkTime getWorkTime() {
        return workTime;
    }

    /**
     * Sets the value of the workTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkTime }
     *     
     */
    public void setWorkTime(WorkTime value) {
        this.workTime = value;
    }

    /**
     * Gets the value of the encryptApplicants property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryptApplicants() {
        return encryptApplicants;
    }

    /**
     * Sets the value of the encryptApplicants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptApplicants(Boolean value) {
        this.encryptApplicants = value;
    }

    /**
     * Gets the value of the defaultJobLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JobLocationDto }
     *     
     */
    public JobLocationDto getDefaultJobLocation() {
        return defaultJobLocation;
    }

    /**
     * Sets the value of the defaultJobLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobLocationDto }
     *     
     */
    public void setDefaultJobLocation(JobLocationDto value) {
        this.defaultJobLocation = value;
    }

    /**
     * Gets the value of the jobLocations property.
     * 
     * @return
     *     possible object is
     *     {@link PositionDto.JobLocations }
     *     
     */
    public PositionDto.JobLocations getJobLocations() {
        return jobLocations;
    }

    /**
     * Sets the value of the jobLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionDto.JobLocations }
     *     
     */
    public void setJobLocations(PositionDto.JobLocations value) {
        this.jobLocations = value;
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
     *         &lt;element name="jobLocation" type="{http://ws.mrted.com/}jobLocationDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "jobLocation"
    })
    public static class JobLocations {

        protected List<JobLocationDto> jobLocation;

        /**
         * Gets the value of the jobLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jobLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJobLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JobLocationDto }
         * 
         * 
         */
        public List<JobLocationDto> getJobLocation() {
            if (jobLocation == null) {
                jobLocation = new ArrayList<JobLocationDto>();
            }
            return this.jobLocation;
        }

    }

}
