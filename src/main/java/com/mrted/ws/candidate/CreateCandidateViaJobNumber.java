
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createCandidateViaJobNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCandidateViaJobNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.mrted.com/}candidate" minOccurs="0"/>
 *         &lt;element name="jobNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCandidateViaJobNumber", propOrder = {
    "candidate",
    "jobNumber"
})
public class CreateCandidateViaJobNumber {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Profile candidate;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String jobNumber;

    /**
     * Gets the value of the candidate property.
     * 
     * @return
     *     possible object is
     *     {@link Profile }
     *     
     */
    public Profile getCandidate() {
        return candidate;
    }

    /**
     * Sets the value of the candidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile }
     *     
     */
    public void setCandidate(Profile value) {
        this.candidate = value;
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

}
