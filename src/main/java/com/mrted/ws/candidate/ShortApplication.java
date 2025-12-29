
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for shortApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shortApplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currentPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://ws.mrted.com/}location" minOccurs="0"/>
 *         &lt;element name="currentCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shortApplication", propOrder = {
    "name",
    "email",
    "applicantId",
    "currentPosition",
    "location",
    "currentCompany",
    "lastModified",
    "status",
    "link"
})
public class ShortApplication {

    protected String name;
    protected String email;
    protected Long applicantId;
    protected String currentPosition;
    protected Location location;
    protected String currentCompany;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastModified;
    protected String status;
    protected String link;

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
     * Gets the value of the applicantId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicantId() {
        return applicantId;
    }

    /**
     * Sets the value of the applicantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicantId(Long value) {
        this.applicantId = value;
    }

    /**
     * Gets the value of the currentPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPosition() {
        return currentPosition;
    }

    /**
     * Sets the value of the currentPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPosition(String value) {
        this.currentPosition = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the currentCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentCompany() {
        return currentCompany;
    }

    /**
     * Sets the value of the currentCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentCompany(String value) {
        this.currentCompany = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
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
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

}
