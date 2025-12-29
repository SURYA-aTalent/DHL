
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
@XmlType(name = "getApplications", propOrder = {
    "page",
    "filter",
    "displayConsents"
})
public class GetApplications {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Integer page;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String filter;
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
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
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
