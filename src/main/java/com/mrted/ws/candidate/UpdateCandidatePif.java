
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateCandidatePif complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateCandidatePif">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formAnsweredDto" type="{http://ws.mrted.com/}formAnsweredDto" minOccurs="0" form="qualified"/>
 *         &lt;element name="candidateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCandidatePif", propOrder = {
    "formAnsweredDto",
    "candidateId"
})
public class UpdateCandidatePif {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected FormAnsweredDto formAnsweredDto;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long candidateId;

    /**
     * Gets the value of the formAnsweredDto property.
     * 
     * @return
     *     possible object is
     *     {@link FormAnsweredDto }
     *     
     */
    public FormAnsweredDto getFormAnsweredDto() {
        return formAnsweredDto;
    }

    /**
     * Sets the value of the formAnsweredDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormAnsweredDto }
     *     
     */
    public void setFormAnsweredDto(FormAnsweredDto value) {
        this.formAnsweredDto = value;
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

}
