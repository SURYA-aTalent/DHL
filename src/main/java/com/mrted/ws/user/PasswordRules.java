
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passwordRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passwordRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://ws.mrted.com/}passwordRuleCode" minOccurs="0"/>
 *         &lt;element name="parameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toRemove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passwordRules", propOrder = {
    "code",
    "parameter",
    "description",
    "toRemove"
})
public class PasswordRules {

    @XmlSchemaType(name = "string")
    protected PasswordRuleCode code;
    protected String parameter;
    protected String description;
    protected Boolean toRemove;

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
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter(String value) {
        this.parameter = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the toRemove property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToRemove() {
        return toRemove;
    }

    /**
     * Sets the value of the toRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToRemove(Boolean value) {
        this.toRemove = value;
    }

}
