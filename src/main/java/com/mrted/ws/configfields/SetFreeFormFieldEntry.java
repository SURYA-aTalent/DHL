
package com.mrted.ws.configfields;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setFreeFormFieldEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setFreeFormFieldEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fff-data" type="{http://ws.mrted.com/}freeFormFieldEntryDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setFreeFormFieldEntry", propOrder = {
    "fffData"
})
public class SetFreeFormFieldEntry {

    @XmlElement(name = "fff-data")
    protected FreeFormFieldEntryDto fffData;

    /**
     * Gets the value of the fffData property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormFieldEntryDto }
     *     
     */
    public FreeFormFieldEntryDto getFffData() {
        return fffData;
    }

    /**
     * Sets the value of the fffData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormFieldEntryDto }
     *     
     */
    public void setFffData(FreeFormFieldEntryDto value) {
        this.fffData = value;
    }

}
