
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for openingPositionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="openingPositionDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="positionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "openingPositionDTO", propOrder = {
    "positionId",
    "positionTitle"
})
public class OpeningPositionDTO {

    protected Long positionId;
    protected String positionTitle;

    /**
     * Gets the value of the positionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPositionId(Long value) {
        this.positionId = value;
    }

    /**
     * Gets the value of the positionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionTitle() {
        return positionTitle;
    }

    /**
     * Sets the value of the positionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionTitle(String value) {
        this.positionTitle = value;
    }

}
