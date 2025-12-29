
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for archivedCandidatesFiltersDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="archivedCandidatesFiltersDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="archiveDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="archiveDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expectedArchiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="markedForArchivization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="departmentIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "archivedCandidatesFiltersDto", propOrder = {
    "firstName",
    "lastName",
    "email",
    "archiveDateFrom",
    "archiveDateTo",
    "expectedArchiveDate",
    "markedForArchivization",
    "departmentIds"
})
public class ArchivedCandidatesFiltersDto {

    protected String firstName;
    protected String lastName;
    protected String email;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar archiveDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar archiveDateTo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedArchiveDate;
    protected Boolean markedForArchivization;
    @XmlElement(type = Long.class)
    protected List<Long> departmentIds;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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
     * Gets the value of the archiveDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchiveDateFrom() {
        return archiveDateFrom;
    }

    /**
     * Sets the value of the archiveDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArchiveDateFrom(XMLGregorianCalendar value) {
        this.archiveDateFrom = value;
    }

    /**
     * Gets the value of the archiveDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchiveDateTo() {
        return archiveDateTo;
    }

    /**
     * Sets the value of the archiveDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArchiveDateTo(XMLGregorianCalendar value) {
        this.archiveDateTo = value;
    }

    /**
     * Gets the value of the expectedArchiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedArchiveDate() {
        return expectedArchiveDate;
    }

    /**
     * Sets the value of the expectedArchiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedArchiveDate(XMLGregorianCalendar value) {
        this.expectedArchiveDate = value;
    }

    /**
     * Gets the value of the markedForArchivization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkedForArchivization() {
        return markedForArchivization;
    }

    /**
     * Sets the value of the markedForArchivization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkedForArchivization(Boolean value) {
        this.markedForArchivization = value;
    }

    /**
     * Gets the value of the departmentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departmentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartmentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDepartmentIds() {
        if (departmentIds == null) {
            departmentIds = new ArrayList<Long>();
        }
        return this.departmentIds;
    }

}
