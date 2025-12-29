
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for applicationDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeApplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="applicationHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationFollowup" type="{http://ws.mrted.com/}applicationFollowup" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="archived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="candidateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="completionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="documents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="document" type="{http://ws.mrted.com/}documentBaseDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hasContracts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="shortListed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="srcChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcChannelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srcMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="update" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationDto", propOrder = {
    "activeApplication",
    "applicationDate",
    "applicationHistory",
    "archived",
    "candidateId",
    "completionReason",
    "creation",
    "documents",
    "hasContracts",
    "id",
    "memo",
    "positionId",
    "shortListed",
    "srcChannelName",
    "srcChannelType",
    "srcMedium",
    "status",
    "statusComment",
    "update",
    "candidateConsents"
})
public class ApplicationDto {

    protected Boolean activeApplication;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationDate;
    protected ApplicationDto.ApplicationHistory applicationHistory;
    protected Boolean archived;
    protected Long candidateId;
    protected String completionReason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creation;
    protected ApplicationDto.Documents documents;
    protected Boolean hasContracts;
    protected Long id;
    protected String memo;
    protected Long positionId;
    protected Boolean shortListed;
    protected String srcChannelName;
    protected String srcChannelType;
    protected String srcMedium;
    protected String status;
    protected String statusComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar update;
    protected ApplicationDto.CandidateConsents candidateConsents;

    /**
     * Gets the value of the activeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveApplication() {
        return activeApplication;
    }

    /**
     * Sets the value of the activeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveApplication(Boolean value) {
        this.activeApplication = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the applicationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDto.ApplicationHistory }
     *     
     */
    public ApplicationDto.ApplicationHistory getApplicationHistory() {
        return applicationHistory;
    }

    /**
     * Sets the value of the applicationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDto.ApplicationHistory }
     *     
     */
    public void setApplicationHistory(ApplicationDto.ApplicationHistory value) {
        this.applicationHistory = value;
    }

    /**
     * Gets the value of the archived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchived() {
        return archived;
    }

    /**
     * Sets the value of the archived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchived(Boolean value) {
        this.archived = value;
    }

    /**
     * Gets the value of the candidateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCandidateId() {
        return candidateId;
    }

    /**
     * Sets the value of the candidateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCandidateId(Long value) {
        this.candidateId = value;
    }

    /**
     * Gets the value of the completionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionReason() {
        return completionReason;
    }

    /**
     * Sets the value of the completionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionReason(String value) {
        this.completionReason = value;
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
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDto.Documents }
     *     
     */
    public ApplicationDto.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDto.Documents }
     *     
     */
    public void setDocuments(ApplicationDto.Documents value) {
        this.documents = value;
    }

    /**
     * Gets the value of the hasContracts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasContracts() {
        return hasContracts;
    }

    /**
     * Sets the value of the hasContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasContracts(Boolean value) {
        this.hasContracts = value;
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
     * Gets the value of the positionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPositionId(Long value) {
        this.positionId = value;
    }

    /**
     * Gets the value of the shortListed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShortListed() {
        return shortListed;
    }

    /**
     * Sets the value of the shortListed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShortListed(Boolean value) {
        this.shortListed = value;
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
     *     {@link String }
     *     
     */
    public String getSrcChannelType() {
        return srcChannelType;
    }

    /**
     * Sets the value of the srcChannelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcChannelType(String value) {
        this.srcChannelType = value;
    }

    /**
     * Gets the value of the srcMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcMedium() {
        return srcMedium;
    }

    /**
     * Sets the value of the srcMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcMedium(String value) {
        this.srcMedium = value;
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
     * Gets the value of the statusComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusComment() {
        return statusComment;
    }

    /**
     * Sets the value of the statusComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusComment(String value) {
        this.statusComment = value;
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
     * Gets the value of the candidateConsents property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDto.CandidateConsents }
     *     
     */
    public ApplicationDto.CandidateConsents getCandidateConsents() {
        return candidateConsents;
    }

    /**
     * Sets the value of the candidateConsents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDto.CandidateConsents }
     *     
     */
    public void setCandidateConsents(ApplicationDto.CandidateConsents value) {
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
     *         &lt;element name="applicationFollowup" type="{http://ws.mrted.com/}applicationFollowup" maxOccurs="unbounded" minOccurs="0"/>
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
        "applicationFollowup"
    })
    public static class ApplicationHistory {

        protected List<ApplicationFollowup> applicationFollowup;

        /**
         * Gets the value of the applicationFollowup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicationFollowup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApplicationFollowup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ApplicationFollowup }
         * 
         * 
         */
        public List<ApplicationFollowup> getApplicationFollowup() {
            if (applicationFollowup == null) {
                applicationFollowup = new ArrayList<ApplicationFollowup>();
            }
            return this.applicationFollowup;
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
     *         &lt;element name="document" type="{http://ws.mrted.com/}documentBaseDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "document"
    })
    public static class Documents {

        protected List<DocumentBaseDto> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentBaseDto }
         * 
         * 
         */
        public List<DocumentBaseDto> getDocument() {
            if (document == null) {
                document = new ArrayList<DocumentBaseDto>();
            }
            return this.document;
        }

    }

}
