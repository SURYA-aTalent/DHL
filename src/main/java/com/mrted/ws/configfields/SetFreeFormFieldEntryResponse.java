
package com.mrted.ws.configfields;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setFreeFormFieldEntryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setFreeFormFieldEntryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fff-entry" type="{http://ws.mrted.com/}freeFormFieldEntryDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setFreeFormFieldEntryResponse", propOrder = {
    "fffEntry"
})
public class SetFreeFormFieldEntryResponse {

    @XmlElement(name = "fff-entry", namespace = "http://ws.mrted.com/")
    protected FreeFormFieldEntryDto fffEntry;

    /**
     * Gets the value of the fffEntry property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormFieldEntryDto }
     *     
     */
    public FreeFormFieldEntryDto getFffEntry() {
        return fffEntry;
    }

    /**
     * Sets the value of the fffEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormFieldEntryDto }
     *     
     */
    public void setFffEntry(FreeFormFieldEntryDto value) {
        this.fffEntry = value;
    }

}
