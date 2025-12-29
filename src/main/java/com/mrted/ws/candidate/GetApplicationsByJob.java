
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationsByJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationsByJob">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
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
@XmlType(name = "getApplicationsByJob", propOrder = {
    "jobId",
    "jobNumber",
    "page",
    "displayConsents"
})
public class GetApplicationsByJob {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long jobId;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String jobNumber;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Integer page;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Boolean displayConsents;

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJobId(Long value) {
        this.jobId = value;
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
