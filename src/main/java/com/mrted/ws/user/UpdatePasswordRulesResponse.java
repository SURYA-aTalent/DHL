
package com.mrted.ws.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePasswordRulesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePasswordRulesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passwordRuleValidation" type="{http://ws.mrted.com/}passwordRuleValidation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePasswordRulesResponse", propOrder = {
    "passwordRuleValidation"
})
public class UpdatePasswordRulesResponse {

    protected List<PasswordRuleValidation> passwordRuleValidation;

    /**
     * Gets the value of the passwordRuleValidation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passwordRuleValidation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPasswordRuleValidation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PasswordRuleValidation }
     * 
     * 
     */
    public List<PasswordRuleValidation> getPasswordRuleValidation() {
        if (passwordRuleValidation == null) {
            passwordRuleValidation = new ArrayList<PasswordRuleValidation>();
        }
        return this.passwordRuleValidation;
    }

}
