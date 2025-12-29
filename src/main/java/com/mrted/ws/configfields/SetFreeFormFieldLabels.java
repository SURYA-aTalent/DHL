
package com.mrted.ws.configfields;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setFreeFormFieldLabels complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setFreeFormFieldLabels">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lov-labels" type="{http://ws.mrted.com/}lovLabelsDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setFreeFormFieldLabels", propOrder = {
    "lovLabels"
})
public class SetFreeFormFieldLabels {

    @XmlElement(name = "lov-labels")
    protected LovLabelsDto lovLabels;

    /**
     * Gets the value of the lovLabels property.
     * 
     * @return
     *     possible object is
     *     {@link LovLabelsDto }
     *     
     */
    public LovLabelsDto getLovLabels() {
        return lovLabels;
    }

    /**
     * Sets the value of the lovLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovLabelsDto }
     *     
     */
    public void setLovLabels(LovLabelsDto value) {
        this.lovLabels = value;
    }

}
