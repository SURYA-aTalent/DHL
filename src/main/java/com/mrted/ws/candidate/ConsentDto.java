
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for consentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="introductionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="defaultConsent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="current" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="user" type="{http://ws.mrted.com/}userDto" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="uniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consentDto", propOrder = {
    "id",
    "type",
    "language",
    "introductionText",
    "fullText",
    "department",
    "defaultConsent",
    "current",
    "version",
    "user",
    "createdDate",
    "uniqueIdentifier"
})
public class ConsentDto {

    protected Long id;
    protected String type;
    protected String language;
    protected String introductionText;
    protected String fullText;
    protected ConsentDto.Department department;
    protected boolean defaultConsent;
    protected boolean current;
    protected Long version;
    protected UserDto user;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String uniqueIdentifier;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the introductionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroductionText() {
        return introductionText;
    }

    /**
     * Sets the value of the introductionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroductionText(String value) {
        this.introductionText = value;
    }

    /**
     * Gets the value of the fullText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullText() {
        return fullText;
    }

    /**
     * Sets the value of the fullText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullText(String value) {
        this.fullText = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentDto.Department }
     *     
     */
    public ConsentDto.Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentDto.Department }
     *     
     */
    public void setDepartment(ConsentDto.Department value) {
        this.department = value;
    }

    /**
     * Gets the value of the defaultConsent property.
     * 
     */
    public boolean isDefaultConsent() {
        return defaultConsent;
    }

    /**
     * Sets the value of the defaultConsent property.
     * 
     */
    public void setDefaultConsent(boolean value) {
        this.defaultConsent = value;
    }

    /**
     * Gets the value of the current property.
     * 
     */
    public boolean isCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     */
    public void setCurrent(boolean value) {
        this.current = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserDto }
     *     
     */
    public UserDto getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDto }
     *     
     */
    public void setUser(UserDto value) {
        this.user = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the uniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    /**
     * Sets the value of the uniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueIdentifier(String value) {
        this.uniqueIdentifier = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "level",
        "name"
    })
    public static class Department {

        protected Long level;
        protected String name;

        /**
         * Gets the value of the level property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setLevel(Long value) {
            this.level = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
