
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getApplicationsByStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationsByStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="displayConsents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationsByStatus", propOrder = {
    "page",
    "status",
    "updatedAt",
    "displayConsents"
})
public class GetApplicationsByStatus {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Integer page;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String status;
    @XmlElement(namespace = "http://ws.mrted.com/")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Boolean displayConsents;

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPage(Integer value) {
        this.page = value;
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
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the displayConsents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayConsents() {
        return displayConsents;
    }

    /**
     * Sets the value of the displayConsents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayConsents(Boolean value) {
        this.displayConsents = value;
    }

}
