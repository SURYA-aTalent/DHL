
package com.mrted.ws.configfields;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setLOVLabelsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setLOVLabelsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.mrted.com/}lovLabelsDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setLOVLabelsResponse", propOrder = {
    "_return"
})
public class SetLOVLabelsResponse {

    @XmlElement(name = "return")
    protected LovLabelsDto _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link LovLabelsDto }
     *     
     */
    public LovLabelsDto getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovLabelsDto }
     *     
     */
    public void setReturn(LovLabelsDto value) {
        this._return = value;
    }

}
