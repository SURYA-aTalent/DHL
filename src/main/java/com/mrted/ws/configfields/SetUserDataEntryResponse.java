
package com.mrted.ws.configfields;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setUserDataEntryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setUserDataEntryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lov-entry" type="{http://ws.mrted.com/}genericLovDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setUserDataEntryResponse", propOrder = {
    "lovEntry"
})
public class SetUserDataEntryResponse {

    @XmlElement(name = "lov-entry", namespace = "http://ws.mrted.com/")
    protected GenericLovDto lovEntry;

    /**
     * Gets the value of the lovEntry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericLovDto }
     *     
     */
    public GenericLovDto getLovEntry() {
        return lovEntry;
    }

    /**
     * Sets the value of the lovEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericLovDto }
     *     
     */
    public void setLovEntry(GenericLovDto value) {
        this.lovEntry = value;
    }

}
