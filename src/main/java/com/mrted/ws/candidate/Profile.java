
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="academicTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://ws.mrted.com/}address" minOccurs="0"/>
 *         &lt;element name="anonymous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="creation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataPrivacy" type="{http://ws.mrted.com/}dataPrivacy" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foldersName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="initialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legacyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkedInId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalData" type="{http://ws.mrted.com/}personalData" minOccurs="0"/>
 *         &lt;element name="position" type="{http://ws.mrted.com/}position" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://ws.mrted.com/}reference" minOccurs="0"/>
 *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourcingMedium" type="{http://ws.mrted.com/}sourcingMedium" minOccurs="0"/>
 *         &lt;element name="srcChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcChannelType" type="{http://ws.mrted.com/}applicationSrcType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://ws.mrted.com/}candidateStatus" minOccurs="0"/>
 *         &lt;element name="tags" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tag" type="{http://ws.mrted.com/}tag" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uiLanguage" type="{http://ws.mrted.com/}language" minOccurs="0"/>
 *         &lt;element name="update" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="formOfAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="candidateConsents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="candidateConsent" type="{http://ws.mrted.com/}candidateConsentDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profile", propOrder = {
    "academicTitle",
    "address",
    "anonymous",
    "creation",
    "dataPrivacy",
    "email",
    "firstname",
    "foldersName",
    "id",
    "initialType",
    "lastname",
    "legacyId",
    "linkedInId",
    "memo",
    "middlename",
    "personalData",
    "position",
    "reference",
    "socialSecurityNumber",
    "sourcingMedium",
    "srcChannelName",
    "srcChannelType",
    "status",
    "tags",
    "type",
    "uiLanguage",
    "update",
    "applicationId",
    "formOfAddress",
    "candidateConsents"
})
public class Profile
    extends BaseEntity
{

    protected String academicTitle;
    protected Address address;
    protected boolean anonymous;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creation;
    protected DataPrivacy dataPrivacy;
    protected String email;
    protected String firstname;
    protected List<String> foldersName;
    protected Long id;
    protected String initialType;
    protected String lastname;
    protected String legacyId;
    protected String linkedInId;
    protected String memo;
    protected String middlename;
    protected PersonalData personalData;
    protected Position position;
    protected Reference reference;
    protected String socialSecurityNumber;
    protected SourcingMedium sourcingMedium;
    protected String srcChannelName;
    protected ApplicationSrcType srcChannelType;
    protected CandidateStatus status;
    protected Profile.Tags tags;
    protected String type;
    protected Language uiLanguage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar update;
    protected Long applicationId;
    protected String formOfAddress;
    protected Profile.CandidateConsents candidateConsents;

    /**
     * Gets the value of the academicTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicTitle() {
        return academicTitle;
    }

    /**
     * Sets the value of the academicTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicTitle(String value) {
        this.academicTitle = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the anonymous property.
     * 
     */
    public boolean isAnonymous() {
        return anonymous;
    }

    /**
     * Sets the value of the anonymous property.
     * 
     */
    public void setAnonymous(boolean value) {
        this.anonymous = value;
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
     * Gets the value of the dataPrivacy property.
     * 
     * @return
     *     possible object is
     *     {@link DataPrivacy }
     *     
     */
    public DataPrivacy getDataPrivacy() {
        return dataPrivacy;
    }

    /**
     * Sets the value of the dataPrivacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPrivacy }
     *     
     */
    public void setDataPrivacy(DataPrivacy value) {
        this.dataPrivacy = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the foldersName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foldersName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoldersName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFoldersName() {
        if (foldersName == null) {
            foldersName = new ArrayList<String>();
        }
        return this.foldersName;
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
     * Gets the value of the initialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialType() {
        return initialType;
    }

    /**
     * Sets the value of the initialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialType(String value) {
        this.initialType = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the legacyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyId() {
        return legacyId;
    }

    /**
     * Sets the value of the legacyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyId(String value) {
        this.legacyId = value;
    }

    /**
     * Gets the value of the linkedInId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedInId() {
        return linkedInId;
    }

    /**
     * Sets the value of the linkedInId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedInId(String value) {
        this.linkedInId = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the personalData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalData }
     *     
     */
    public PersonalData getPersonalData() {
        return personalData;
    }

    /**
     * Sets the value of the personalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalData }
     *     
     */
    public void setPersonalData(PersonalData value) {
        this.personalData = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link Reference }
     *     
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference }
     *     
     */
    public void setReference(Reference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the socialSecurityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Sets the value of the socialSecurityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialSecurityNumber(String value) {
        this.socialSecurityNumber = value;
    }

    /**
     * Gets the value of the sourcingMedium property.
     * 
     * @return
     *     possible object is
     *     {@link SourcingMedium }
     *     
     */
    public SourcingMedium getSourcingMedium() {
        return sourcingMedium;
    }

    /**
     * Sets the value of the sourcingMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourcingMedium }
     *     
     */
    public void setSourcingMedium(SourcingMedium value) {
        this.sourcingMedium = value;
    }

    /**
     * Gets the value of the srcChannelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcChannelName() {
        return srcChannelName;
    }

    /**
     * Sets the value of the srcChannelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcChannelName(String value) {
        this.srcChannelName = value;
    }

    /**
     * Gets the value of the srcChannelType property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSrcType }
     *     
     */
    public ApplicationSrcType getSrcChannelType() {
        return srcChannelType;
    }

    /**
     * Sets the value of the srcChannelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSrcType }
     *     
     */
    public void setSrcChannelType(ApplicationSrcType value) {
        this.srcChannelType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateStatus }
     *     
     */
    public CandidateStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateStatus }
     *     
     */
    public void setStatus(CandidateStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.Tags }
     *     
     */
    public Profile.Tags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Tags }
     *     
     */
    public void setTags(Profile.Tags value) {
        this.tags = value;
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
     * Gets the value of the uiLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getUiLanguage() {
        return uiLanguage;
    }

    /**
     * Sets the value of the uiLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setUiLanguage(Language value) {
        this.uiLanguage = value;
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
     * Gets the value of the formOfAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOfAddress() {
        return formOfAddress;
    }

    /**
     * Sets the value of the formOfAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOfAddress(String value) {
        this.formOfAddress = value;
    }

    /**
     * Gets the value of the candidateConsents property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.CandidateConsents }
     *     
     */
    public Profile.CandidateConsents getCandidateConsents() {
        return candidateConsents;
    }

    /**
     * Sets the value of the candidateConsents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.CandidateConsents }
     *     
     */
    public void setCandidateConsents(Profile.CandidateConsents value) {
        this.candidateConsents = value;
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
     *         &lt;element name="candidateConsent" type="{http://ws.mrted.com/}candidateConsentDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "candidateConsent"
    })
    public static class CandidateConsents {

        protected List<CandidateConsentDto> candidateConsent;

        /**
         * Gets the value of the candidateConsent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the candidateConsent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCandidateConsent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CandidateConsentDto }
         * 
         * 
         */
        public List<CandidateConsentDto> getCandidateConsent() {
            if (candidateConsent == null) {
                candidateConsent = new ArrayList<CandidateConsentDto>();
            }
            return this.candidateConsent;
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
     *         &lt;element name="tag" type="{http://ws.mrted.com/}tag" maxOccurs="unbounded" minOccurs="0"/>
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
        "tag"
    })
    public static class Tags {

        protected List<Tag> tag;

        /**
         * Gets the value of the tag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Tag }
         * 
         * 
         */
        public List<Tag> getTag() {
            if (tag == null) {
                tag = new ArrayList<Tag>();
            }
            return this.tag;
        }

    }

}
