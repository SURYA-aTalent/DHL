
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCandidateById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCandidateById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="candidateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="displayConsents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="displayBoTags" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCandidateById", propOrder = {
    "candidateId",
    "displayConsents",
    "displayBoTags"
})
public class GetCandidateById {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long candidateId;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Boolean displayConsents;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Boolean displayBoTags;

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

    /**
     * Gets the value of the displayBoTags property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayBoTags() {
        return displayBoTags;
    }

    /**
     * Sets the value of the displayBoTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayBoTags(Boolean value) {
        this.displayBoTags = value;
    }

}
