
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateHistoryFiltersDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="candidateHistoryFiltersDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manualOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidateHistoryFiltersDto", propOrder = {
    "applicationId",
    "jobNumber",
    "manualOnly",
    "openingId"
})
public class CandidateHistoryFiltersDto {

    protected Long applicationId;
    protected String jobNumber;
    protected boolean manualOnly;
    protected Long openingId;

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
     * Gets the value of the manualOnly property.
     * 
     */
    public boolean isManualOnly() {
        return manualOnly;
    }

    /**
     * Sets the value of the manualOnly property.
     * 
     */
    public void setManualOnly(boolean value) {
        this.manualOnly = value;
    }

    /**
     * Gets the value of the openingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOpeningId() {
        return openingId;
    }

    /**
     * Sets the value of the openingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOpeningId(Long value) {
        this.openingId = value;
    }

}
