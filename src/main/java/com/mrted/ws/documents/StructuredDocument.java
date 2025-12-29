
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for structuredDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="structuredDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}document">
 *       &lt;sequence>
 *         &lt;element name="answers" type="{http://ws.mrted.com/}gfDocument" minOccurs="0"/>
 *         &lt;element name="formCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "structuredDocument", propOrder = {
    "answers",
    "formCreationDate",
    "lastModified",
    "readOnly",
    "id"
})
public class StructuredDocument
    extends Document
{

    protected GfDocument answers;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar formCreationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    protected boolean readOnly;
    protected Long id;

    /**
     * Gets the value of the answers property.
     * 
     * @return
     *     possible object is
     *     {@link GfDocument }
     *     
     */
    public GfDocument getAnswers() {
        return answers;
    }

    /**
     * Sets the value of the answers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GfDocument }
     *     
     */
    public void setAnswers(GfDocument value) {
        this.answers = value;
    }

    /**
     * Gets the value of the formCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFormCreationDate() {
        return formCreationDate;
    }

    /**
     * Sets the value of the formCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFormCreationDate(XMLGregorianCalendar value) {
        this.formCreationDate = value;
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
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

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

}
