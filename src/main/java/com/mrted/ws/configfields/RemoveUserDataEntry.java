
package com.mrted.ws.configfields;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeUserDataEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeUserDataEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lov-data" type="{http://ws.mrted.com/}genericLovDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeUserDataEntry", propOrder = {
    "lovData"
})
public class RemoveUserDataEntry {

    @XmlElement(name = "lov-data")
    protected GenericLovDto lovData;

    /**
     * Gets the value of the lovData property.
     * 
     * @return
     *     possible object is
     *     {@link GenericLovDto }
     *     
     */
    public GenericLovDto getLovData() {
        return lovData;
    }

    /**
     * Sets the value of the lovData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericLovDto }
     *     
     */
    public void setLovData(GenericLovDto value) {
        this.lovData = value;
    }

}
