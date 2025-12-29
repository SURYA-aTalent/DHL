
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for personalDataDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personalDataDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="academicTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="citizenship" type="{http://ws.mrted.com/}simpleLovValueDto" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="language" type="{http://ws.mrted.com/}simpleLovValueDto" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://ws.mrted.com/}simpleLovValueDto" minOccurs="0"/>
 *         &lt;element name="numberOfChildren" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://ws.mrted.com/}simpleLovValueDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalDataDto", propOrder = {
    "academicTitle",
    "citizenship",
    "dateOfBirth",
    "language",
    "maritalStatus",
    "numberOfChildren",
    "sex"
})
public class PersonalDataDto {

    protected String academicTitle;
    protected SimpleLovValueDto citizenship;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected SimpleLovValueDto language;
    protected SimpleLovValueDto maritalStatus;
    protected Integer numberOfChildren;
    protected SimpleLovValueDto sex;

    /**
     * Gets the value of the academicTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicTitle() {
        return academicTitle;
    }

    /**
     * Sets the value of the academicTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicTitle(String value) {
        this.academicTitle = value;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleLovValueDto }
     *     
     */
    public SimpleLovValueDto getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleLovValueDto }
     *     
     */
    public void setCitizenship(SimpleLovValueDto value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleLovValueDto }
     *     
     */
    public SimpleLovValueDto getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleLovValueDto }
     *     
     */
    public void setLanguage(SimpleLovValueDto value) {
        this.language = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleLovValueDto }
     *     
     */
    public SimpleLovValueDto getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleLovValueDto }
     *     
     */
    public void setMaritalStatus(SimpleLovValueDto value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the numberOfChildren property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    /**
     * Sets the value of the numberOfChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfChildren(Integer value) {
        this.numberOfChildren = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleLovValueDto }
     *     
     */
    public SimpleLovValueDto getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleLovValueDto }
     *     
     */
    public void setSex(SimpleLovValueDto value) {
        this.sex = value;
    }

}
