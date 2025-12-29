
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latCoordinate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lngCoordinate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalWebSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preferredComChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = {
    "address1",
    "address2",
    "alternateEmail",
    "city",
    "country",
    "fax",
    "homePhone",
    "latCoordinate",
    "lngCoordinate",
    "mobilePhone",
    "personalWebSite",
    "preferredComChannel",
    "regionName",
    "workPhone",
    "zip"
})
public class Address {

    protected String address1;
    protected String address2;
    protected String alternateEmail;
    protected String city;
    protected String country;
    protected String fax;
    protected String homePhone;
    protected Double latCoordinate;
    protected Double lngCoordinate;
    protected String mobilePhone;
    protected String personalWebSite;
    protected String preferredComChannel;
    protected String regionName;
    protected String workPhone;
    protected String zip;

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the alternateEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateEmail() {
        return alternateEmail;
    }

    /**
     * Sets the value of the alternateEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateEmail(String value) {
        this.alternateEmail = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the latCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatCoordinate() {
        return latCoordinate;
    }

    /**
     * Sets the value of the latCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatCoordinate(Double value) {
        this.latCoordinate = value;
    }

    /**
     * Gets the value of the lngCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLngCoordinate() {
        return lngCoordinate;
    }

    /**
     * Sets the value of the lngCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLngCoordinate(Double value) {
        this.lngCoordinate = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the personalWebSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalWebSite() {
        return personalWebSite;
    }

    /**
     * Sets the value of the personalWebSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalWebSite(String value) {
        this.personalWebSite = value;
    }

    /**
     * Gets the value of the preferredComChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredComChannel() {
        return preferredComChannel;
    }

    /**
     * Sets the value of the preferredComChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredComChannel(String value) {
        this.preferredComChannel = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the workPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * Sets the value of the workPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPhone(String value) {
        this.workPhone = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

}
