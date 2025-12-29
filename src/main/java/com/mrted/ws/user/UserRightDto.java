
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userRightDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userRightDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="right" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userRightDto", propOrder = {
    "right",
    "label"
})
public class UserRightDto {

    protected Long right;
    protected String label;

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRight(Long value) {
        this.right = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

}
