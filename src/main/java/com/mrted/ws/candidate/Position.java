
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for position complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="position">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="compensation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="positionStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "position", propOrder = {
    "company",
    "companyStartDate",
    "compensation",
    "employeeCode",
    "location",
    "managerName",
    "position",
    "positionEndDate",
    "positionStartDate"
})
public class Position {

    protected String company;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar companyStartDate;
    protected String compensation;
    protected String employeeCode;
    protected String location;
    protected String managerName;
    protected String position;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar positionEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar positionStartDate;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the companyStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompanyStartDate() {
        return companyStartDate;
    }

    /**
     * Sets the value of the companyStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompanyStartDate(XMLGregorianCalendar value) {
        this.companyStartDate = value;
    }

    /**
     * Gets the value of the compensation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompensation() {
        return compensation;
    }

    /**
     * Sets the value of the compensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompensation(String value) {
        this.compensation = value;
    }

    /**
     * Gets the value of the employeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeCode() {
        return employeeCode;
    }

    /**
     * Sets the value of the employeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeCode(String value) {
        this.employeeCode = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the managerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * Sets the value of the managerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerName(String value) {
        this.managerName = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the positionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPositionEndDate() {
        return positionEndDate;
    }

    /**
     * Sets the value of the positionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPositionEndDate(XMLGregorianCalendar value) {
        this.positionEndDate = value;
    }

    /**
     * Gets the value of the positionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPositionStartDate() {
        return positionStartDate;
    }

    /**
     * Sets the value of the positionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPositionStartDate(XMLGregorianCalendar value) {
        this.positionStartDate = value;
    }

}
