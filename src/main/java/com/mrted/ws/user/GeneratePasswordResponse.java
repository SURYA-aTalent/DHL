
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generatePasswordResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generatePasswordResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generatedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generatePasswordResponse", propOrder = {
    "generatedPassword"
})
public class GeneratePasswordResponse {

    protected String generatedPassword;

    /**
     * Gets the value of the generatedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneratedPassword() {
        return generatedPassword;
    }

    /**
     * Sets the value of the generatedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneratedPassword(String value) {
        this.generatedPassword = value;
    }

}
