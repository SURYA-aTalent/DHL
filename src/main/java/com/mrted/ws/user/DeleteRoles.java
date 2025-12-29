
package com.mrted.ws.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteRoles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteRoles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roleName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteRoles", propOrder = {
    "userId",
    "login",
    "email",
    "roleId",
    "roleName",
    "departmentId"
})
public class DeleteRoles {

    protected Long userId;
    protected String login;
    protected String email;
    @XmlElement(type = Long.class)
    protected List<Long> roleId;
    protected List<String> roleName;
    protected Long departmentId;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the roleId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRoleId() {
        if (roleId == null) {
            roleId = new ArrayList<Long>();
        }
        return this.roleId;
    }

    /**
     * Gets the value of the roleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoleName() {
        if (roleName == null) {
            roleName = new ArrayList<String>();
        }
        return this.roleName;
    }

    /**
     * Gets the value of the departmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the value of the departmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepartmentId(Long value) {
        this.departmentId = value;
    }

}
