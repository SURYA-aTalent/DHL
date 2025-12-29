
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revokeCandidateConsent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revokeCandidateConsent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consentId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *         &lt;element name="candidateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="consentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revokeCandidateConsent", propOrder = {
    "consentId",
    "candidateId",
    "applicationId",
    "comment",
    "consentType"
})
public class RevokeCandidateConsent {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected long consentId;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long candidateId;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long applicationId;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String comment;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String consentType;

    /**
     * Gets the value of the consentId property.
     * 
     */
    public long getConsentId() {
        return consentId;
    }

    /**
     * Sets the value of the consentId property.
     * 
     */
    public void setConsentId(long value) {
        this.consentId = value;
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the consentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentType() {
        return consentType;
    }

    /**
     * Sets the value of the consentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentType(String value) {
        this.consentType = value;
    }

}
