
package com.mrted.ws.configfields;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freeFormFieldEntryDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freeFormFieldEntryDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}genericLovDto">
 *       &lt;sequence>
 *         &lt;element name="dataFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freeFormFieldEntryDto", propOrder = {
    "dataFormat",
    "required"
})
public class FreeFormFieldEntryDto
    extends GenericLovDto
{

    @XmlElement(required = true)
    protected String dataFormat;
    @XmlElement(defaultValue = "true")
    protected boolean required;

    /**
     * Gets the value of the dataFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFormat() {
        return dataFormat;
    }

    /**
     * Sets the value of the dataFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFormat(String value) {
        this.dataFormat = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

}
