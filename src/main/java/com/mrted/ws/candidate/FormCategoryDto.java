
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formCategoryDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formCategoryDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="localDescription" type="{http://ws.mrted.com/}keyNameDto" minOccurs="0"/>
 *         &lt;element name="localName" type="{http://ws.mrted.com/}keyNameDto" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isdisplayActions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formCategoryDto", propOrder = {
    "description",
    "id",
    "localDescription",
    "localName",
    "name",
    "templateType",
    "isdisplayActions"
})
public class FormCategoryDto {

    protected String description;
    protected Long id;
    protected KeyNameDto localDescription;
    protected KeyNameDto localName;
    protected String name;
    protected String templateType;
    protected Boolean isdisplayActions;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the localDescription property.
     * 
     * @return
     *     possible object is
     *     {@link KeyNameDto }
     *     
     */
    public KeyNameDto getLocalDescription() {
        return localDescription;
    }

    /**
     * Sets the value of the localDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyNameDto }
     *     
     */
    public void setLocalDescription(KeyNameDto value) {
        this.localDescription = value;
    }

    /**
     * Gets the value of the localName property.
     * 
     * @return
     *     possible object is
     *     {@link KeyNameDto }
     *     
     */
    public KeyNameDto getLocalName() {
        return localName;
    }

    /**
     * Sets the value of the localName property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyNameDto }
     *     
     */
    public void setLocalName(KeyNameDto value) {
        this.localName = value;
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

    /**
     * Gets the value of the templateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * Sets the value of the templateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateType(String value) {
        this.templateType = value;
    }

    /**
     * Gets the value of the isdisplayActions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsdisplayActions() {
        return isdisplayActions;
    }

    /**
     * Sets the value of the isdisplayActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsdisplayActions(Boolean value) {
        this.isdisplayActions = value;
    }

}
