
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for personalData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personalData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="citizenship" type="{http://ws.mrted.com/}citizenship" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateOfBirthString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://ws.mrted.com/}language" minOccurs="0"/>
 *         &lt;element name="maritalStatus" type="{http://ws.mrted.com/}maritalStatus" minOccurs="0"/>
 *         &lt;element name="numberOfChildren" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://ws.mrted.com/}sex" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalData", propOrder = {
    "citizenship",
    "dateOfBirth",
    "dateOfBirthString",
    "language",
    "maritalStatus",
    "numberOfChildren",
    "sex"
})
public class PersonalData {

    protected Citizenship citizenship;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected String dateOfBirthString;
    protected Language language;
    protected MaritalStatus maritalStatus;
    protected Integer numberOfChildren;
    protected Sex sex;

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link Citizenship }
     *     
     */
    public Citizenship getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link Citizenship }
     *     
     */
    public void setCitizenship(Citizenship value) {
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
     * Gets the value of the dateOfBirthString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirthString() {
        return dateOfBirthString;
    }

    /**
     * Sets the value of the dateOfBirthString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirthString(String value) {
        this.dateOfBirthString = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatus }
     *     
     */
    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatus }
     *     
     */
    public void setMaritalStatus(MaritalStatus value) {
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
     *     {@link Sex }
     *     
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sex }
     *     
     */
    public void setSex(Sex value) {
        this.sex = value;
    }

}
