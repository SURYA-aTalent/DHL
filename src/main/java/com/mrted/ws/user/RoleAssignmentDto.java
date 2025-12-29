
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for roleAssignmentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roleAssignmentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://ws.mrted.com/}organizationDto" minOccurs="0"/>
 *         &lt;element name="role" type="{http://ws.mrted.com/}roleDto" minOccurs="0"/>
 *         &lt;element name="nameTranslation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roleAssignmentDto", propOrder = {
    "beginDate",
    "creationDate",
    "endDate",
    "organization",
    "role",
    "nameTranslation"
})
public class RoleAssignmentDto {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected OrganizationDto organization;
    protected RoleDto role;
    protected String nameTranslation;

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDto }
     *     
     */
    public OrganizationDto getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDto }
     *     
     */
    public void setOrganization(OrganizationDto value) {
        this.organization = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link RoleDto }
     *     
     */
    public RoleDto getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleDto }
     *     
     */
    public void setRole(RoleDto value) {
        this.role = value;
    }

    /**
     * Gets the value of the nameTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTranslation() {
        return nameTranslation;
    }

    /**
     * Sets the value of the nameTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTranslation(String value) {
        this.nameTranslation = value;
    }

}
