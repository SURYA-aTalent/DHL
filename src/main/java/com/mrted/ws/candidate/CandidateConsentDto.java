
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for candidateConsentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="candidateConsentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consentDto" type="{http://ws.mrted.com/}consentDto" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastGrantedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastRevokedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastRequestedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastRequestedUser" type="{http://ws.mrted.com/}userDto" minOccurs="0"/>
 *         &lt;element name="lastGrantedUser" type="{http://ws.mrted.com/}userDto" minOccurs="0"/>
 *         &lt;element name="lastRevokedUser" type="{http://ws.mrted.com/}userDto" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidateConsentDto", propOrder = {
    "consentDto",
    "status",
    "lastGrantedDate",
    "lastRevokedDate",
    "lastRequestedDate",
    "lastRequestedUser",
    "lastGrantedUser",
    "lastRevokedUser",
    "comment",
    "consentType"
})
public class CandidateConsentDto {

    protected ConsentDto consentDto;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastGrantedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRevokedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRequestedDate;
    protected UserDto lastRequestedUser;
    protected UserDto lastGrantedUser;
    protected UserDto lastRevokedUser;
    protected String comment;
    protected String consentType;

    /**
     * Gets the value of the consentDto property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentDto }
     *     
     */
    public ConsentDto getConsentDto() {
        return consentDto;
    }

    /**
     * Sets the value of the consentDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentDto }
     *     
     */
    public void setConsentDto(ConsentDto value) {
        this.consentDto = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the lastGrantedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastGrantedDate() {
        return lastGrantedDate;
    }

    /**
     * Sets the value of the lastGrantedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastGrantedDate(XMLGregorianCalendar value) {
        this.lastGrantedDate = value;
    }

    /**
     * Gets the value of the lastRevokedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRevokedDate() {
        return lastRevokedDate;
    }

    /**
     * Sets the value of the lastRevokedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRevokedDate(XMLGregorianCalendar value) {
        this.lastRevokedDate = value;
    }

    /**
     * Gets the value of the lastRequestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRequestedDate() {
        return lastRequestedDate;
    }

    /**
     * Sets the value of the lastRequestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRequestedDate(XMLGregorianCalendar value) {
        this.lastRequestedDate = value;
    }

    /**
     * Gets the value of the lastRequestedUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserDto }
     *     
     */
    public UserDto getLastRequestedUser() {
        return lastRequestedUser;
    }

    /**
     * Sets the value of the lastRequestedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDto }
     *     
     */
    public void setLastRequestedUser(UserDto value) {
        this.lastRequestedUser = value;
    }

    /**
     * Gets the value of the lastGrantedUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserDto }
     *     
     */
    public UserDto getLastGrantedUser() {
        return lastGrantedUser;
    }

    /**
     * Sets the value of the lastGrantedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDto }
     *     
     */
    public void setLastGrantedUser(UserDto value) {
        this.lastGrantedUser = value;
    }

    /**
     * Gets the value of the lastRevokedUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserDto }
     *     
     */
    public UserDto getLastRevokedUser() {
        return lastRevokedUser;
    }

    /**
     * Sets the value of the lastRevokedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDto }
     *     
     */
    public void setLastRevokedUser(UserDto value) {
        this.lastRevokedUser = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the consentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentType() {
        return consentType;
    }

    /**
     * Sets the value of the consentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentType(String value) {
        this.consentType = value;
    }

}
