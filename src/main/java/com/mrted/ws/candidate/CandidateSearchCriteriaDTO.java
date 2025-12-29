
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
 * <p>Java class for candidateSearchCriteriaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="candidateSearchCriteriaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://ws.mrted.com/}status" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fromCreatedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="fromLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="displayNumberOfPages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="location" type="{http://ws.mrted.com/}LocationSearchCriteriaDto" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="candidateConsent" type="{http://ws.mrted.com/}candidateConsentSearchDto" minOccurs="0"/>
 *         &lt;element name="personalPool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sharedPoolId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidateSearchCriteriaDTO", propOrder = {
    "firstName",
    "lastName",
    "email",
    "phoneNumber",
    "status",
    "departmentId",
    "source",
    "fromCreatedDate",
    "fromLastUpdateDate",
    "displayNumberOfPages",
    "location",
    "company",
    "jobTitle",
    "createTime",
    "updateTime",
    "candidateConsent",
    "personalPool",
    "sharedPoolId"
})
public class CandidateSearchCriteriaDTO {

    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    @XmlSchemaType(name = "string")
    protected List<Status> status;
    @XmlElement(type = Long.class)
    protected List<Long> departmentId;
    protected List<String> source;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromCreatedDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromLastUpdateDate;
    protected Boolean displayNumberOfPages;
    protected LocationSearchCriteriaDto location;
    protected String company;
    protected String jobTitle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    protected CandidateConsentSearchDto candidateConsent;
    protected Boolean personalPool;
    @XmlElement(type = Long.class)
    protected List<Long> sharedPoolId;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Status }
     * 
     * 
     */
    public List<Status> getStatus() {
        if (status == null) {
            status = new ArrayList<Status>();
        }
        return this.status;
    }

    /**
     * Gets the value of the departmentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departmentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartmentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDepartmentId() {
        if (departmentId == null) {
            departmentId = new ArrayList<Long>();
        }
        return this.departmentId;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSource() {
        if (source == null) {
            source = new ArrayList<String>();
        }
        return this.source;
    }

    /**
     * Gets the value of the fromCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromCreatedDate() {
        return fromCreatedDate;
    }

    /**
     * Sets the value of the fromCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromCreatedDate(XMLGregorianCalendar value) {
        this.fromCreatedDate = value;
    }

    /**
     * Gets the value of the fromLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromLastUpdateDate() {
        return fromLastUpdateDate;
    }

    /**
     * Sets the value of the fromLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromLastUpdateDate(XMLGregorianCalendar value) {
        this.fromLastUpdateDate = value;
    }

    /**
     * Gets the value of the displayNumberOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayNumberOfPages() {
        return displayNumberOfPages;
    }

    /**
     * Sets the value of the displayNumberOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayNumberOfPages(Boolean value) {
        this.displayNumberOfPages = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchCriteriaDto }
     *     
     */
    public LocationSearchCriteriaDto getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchCriteriaDto }
     *     
     */
    public void setLocation(LocationSearchCriteriaDto value) {
        this.location = value;
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
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the candidateConsent property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateConsentSearchDto }
     *     
     */
    public CandidateConsentSearchDto getCandidateConsent() {
        return candidateConsent;
    }

    /**
     * Sets the value of the candidateConsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateConsentSearchDto }
     *     
     */
    public void setCandidateConsent(CandidateConsentSearchDto value) {
        this.candidateConsent = value;
    }

    /**
     * Gets the value of the personalPool property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonalPool() {
        return personalPool;
    }

    /**
     * Sets the value of the personalPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonalPool(Boolean value) {
        this.personalPool = value;
    }

    /**
     * Gets the value of the sharedPoolId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sharedPoolId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSharedPoolId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSharedPoolId() {
        if (sharedPoolId == null) {
            sharedPoolId = new ArrayList<Long>();
        }
        return this.sharedPoolId;
    }

}
