
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCandidateStructuredDocumentById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCandidateStructuredDocumentById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="candidateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="showLocalizedValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="localizedValueLangCode" type="{http://ws.mrted.com/}langCode" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCandidateStructuredDocumentById", propOrder = {
    "candidateId",
    "showLocalizedValue",
    "localizedValueLangCode"
})
public class GetCandidateStructuredDocumentById {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long candidateId;
    protected Boolean showLocalizedValue;
    @XmlElement(namespace = "http://ws.mrted.com/")
    @XmlSchemaType(name = "string")
    protected LangCode localizedValueLangCode;

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
     * Gets the value of the showLocalizedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLocalizedValue() {
        return showLocalizedValue;
    }

    /**
     * Sets the value of the showLocalizedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLocalizedValue(Boolean value) {
        this.showLocalizedValue = value;
    }

    /**
     * Gets the value of the localizedValueLangCode property.
     * 
     * @return
     *     possible object is
     *     {@link LangCode }
     *     
     */
    public LangCode getLocalizedValueLangCode() {
        return localizedValueLangCode;
    }

    /**
     * Sets the value of the localizedValueLangCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangCode }
     *     
     */
    public void setLocalizedValueLangCode(LangCode value) {
        this.localizedValueLangCode = value;
    }

}
