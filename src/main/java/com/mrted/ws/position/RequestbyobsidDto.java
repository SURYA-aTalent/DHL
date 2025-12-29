
package com.mrted.ws.position;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for requestbyobsidDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestbyobsidDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizationId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeSubLevels" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://ws.mrted.com/}status" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fromLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toLastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fromCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="requisitionType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="displayNumberOfPages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestbyobsidDto", propOrder = {
    "organizationId",
    "includeSubLevels",
    "pageNumber",
    "status",
    "fromLastUpdateDate",
    "toLastUpdateDate",
    "fromCreateDate",
    "toCreateDate",
    "requisitionType",
    "displayNumberOfPages"
})
public class RequestbyobsidDto {

    @XmlElement(type = Long.class)
    protected List<Long> organizationId;
    protected Boolean includeSubLevels;
    protected Integer pageNumber;
    @XmlSchemaType(name = "string")
    protected List<Status> status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromLastUpdateDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toLastUpdateDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromCreateDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toCreateDate;
    protected List<String> requisitionType;
    protected Boolean displayNumberOfPages;

    /**
     * Gets the value of the organizationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getOrganizationId() {
        if (organizationId == null) {
            organizationId = new ArrayList<Long>();
        }
        return this.organizationId;
    }

    /**
     * Gets the value of the includeSubLevels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSubLevels() {
        return includeSubLevels;
    }

    /**
     * Sets the value of the includeSubLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSubLevels(Boolean value) {
        this.includeSubLevels = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
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
     * Gets the value of the toLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToLastUpdateDate() {
        return toLastUpdateDate;
    }

    /**
     * Sets the value of the toLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToLastUpdateDate(XMLGregorianCalendar value) {
        this.toLastUpdateDate = value;
    }

    /**
     * Gets the value of the fromCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromCreateDate() {
        return fromCreateDate;
    }

    /**
     * Sets the value of the fromCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromCreateDate(XMLGregorianCalendar value) {
        this.fromCreateDate = value;
    }

    /**
     * Gets the value of the toCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToCreateDate() {
        return toCreateDate;
    }

    /**
     * Sets the value of the toCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToCreateDate(XMLGregorianCalendar value) {
        this.toCreateDate = value;
    }

    /**
     * Gets the value of the requisitionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requisitionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequisitionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequisitionType() {
        if (requisitionType == null) {
            requisitionType = new ArrayList<String>();
        }
        return this.requisitionType;
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

}
