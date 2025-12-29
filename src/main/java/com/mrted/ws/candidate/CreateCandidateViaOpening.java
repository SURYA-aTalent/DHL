
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createCandidateViaOpening complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCandidateViaOpening">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.mrted.com/}candidate" minOccurs="0"/>
 *         &lt;element name="openingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCandidateViaOpening", propOrder = {
    "candidate",
    "openingId"
})
public class CreateCandidateViaOpening {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Profile candidate;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long openingId;

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
