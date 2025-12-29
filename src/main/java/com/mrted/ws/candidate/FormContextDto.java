
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formContextDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formContextDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contextType" type="{http://ws.mrted.com/}formContextType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="linkedId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formContextDto", propOrder = {
    "contextType",
    "id",
    "linkedId"
})
public class FormContextDto {

    @XmlSchemaType(name = "string")
    protected FormContextType contextType;
    protected Long id;
    protected Long linkedId;

    /**
     * Gets the value of the contextType property.
     * 
     * @return
     *     possible object is
     *     {@link FormContextType }
     *     
     */
    public FormContextType getContextType() {
        return contextType;
    }

    /**
     * Sets the value of the contextType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormContextType }
     *     
     */
    public void setContextType(FormContextType value) {
        this.contextType = value;
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

    /**
     * Gets the value of the linkedId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLinkedId() {
        return linkedId;
    }

    /**
     * Sets the value of the linkedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLinkedId(Long value) {
        this.linkedId = value;
    }

}
