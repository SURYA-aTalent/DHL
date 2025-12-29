
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passwordRuleValidation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passwordRuleValidation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://ws.mrted.com/}passwordRuleCode" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passwordRuleValidation", propOrder = {
    "code",
    "message"
})
public class PasswordRuleValidation {

    @XmlSchemaType(name = "string")
    protected PasswordRuleCode code;
    protected String message;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordRuleCode }
     *     
     */
    public PasswordRuleCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordRuleCode }
     *     
     */
    public void setCode(PasswordRuleCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
