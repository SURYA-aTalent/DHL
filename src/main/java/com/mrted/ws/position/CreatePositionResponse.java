
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPositionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createPositionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://ws.mrted.com/}positionDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPositionResponse", propOrder = {
    "position"
})
public class CreatePositionResponse {

    protected PositionDto position;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionDto }
     *     
     */
    public PositionDto getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionDto }
     *     
     */
    public void setPosition(PositionDto value) {
        this.position = value;
    }

}
