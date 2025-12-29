
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://ws.mrted.com/}userExtDto" minOccurs="0"/>
 *         &lt;element name="activationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUser", propOrder = {
    "user",
    "activationType"
})
public class CreateUser {

    protected UserExtDto user;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String activationType;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserExtDto }
     *     
     */
    public UserExtDto getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserExtDto }
     *     
     */
    public void setUser(UserExtDto value) {
        this.user = value;
    }

    /**
     * Gets the value of the activationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationType() {
        return activationType;
    }

    /**
     * Sets the value of the activationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationType(String value) {
        this.activationType = value;
    }

}
