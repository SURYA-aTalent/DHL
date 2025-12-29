
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeRolesWithTag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeRolesWithTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tagTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentIdList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeRolesWithTag", propOrder = {
    "userId",
    "tagName",
    "tagTypeName",
    "departmentIdList"
})
public class RemoveRolesWithTag {

    protected Long userId;
    protected String tagName;
    protected String tagTypeName;
    protected String departmentIdList;

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
     * Gets the value of the tagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Sets the value of the tagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

    /**
     * Gets the value of the tagTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagTypeName() {
        return tagTypeName;
    }

    /**
     * Sets the value of the tagTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagTypeName(String value) {
        this.tagTypeName = value;
    }

    /**
     * Gets the value of the departmentIdList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentIdList() {
        return departmentIdList;
    }

    /**
     * Sets the value of the departmentIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentIdList(String value) {
        this.departmentIdList = value;
    }

}
