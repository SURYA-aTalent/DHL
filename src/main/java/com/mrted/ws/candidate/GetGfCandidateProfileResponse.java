
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGfCandidateProfileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGfCandidateProfileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://ws.mrted.com/}candidateProfile" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGfCandidateProfileResponse", propOrder = {
    "type"
})
public class GetGfCandidateProfileResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected CandidateProfile type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateProfile }
     *     
     */
    public CandidateProfile getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateProfile }
     *     
     */
    public void setType(CandidateProfile value) {
        this.type = value;
    }

}
