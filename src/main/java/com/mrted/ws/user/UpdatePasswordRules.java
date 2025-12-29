
package com.mrted.ws.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updatePasswordRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updatePasswordRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passwordRules" type="{http://ws.mrted.com/}passwordRules" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePasswordRules", propOrder = {
    "passwordRules"
})
public class UpdatePasswordRules {

    protected List<PasswordRules> passwordRules;

    /**
     * Gets the value of the passwordRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passwordRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPasswordRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PasswordRules }
     * 
     * 
     */
    public List<PasswordRules> getPasswordRules() {
        if (passwordRules == null) {
            passwordRules = new ArrayList<PasswordRules>();
        }
        return this.passwordRules;
    }

}
