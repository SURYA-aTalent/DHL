
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for freeFormFieldDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freeFormFieldDto">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="keygroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keyfield" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lovId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freeFormFieldDto", propOrder = {
    "value"
})
public class FreeFormFieldDto {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "keygroup")
    protected String keygroup;
    @XmlAttribute(name = "keyfield")
    protected String keyfield;
    @XmlAttribute(name = "lovId")
    protected Long lovId;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the keygroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeygroup() {
        return keygroup;
    }

    /**
     * Sets the value of the keygroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeygroup(String value) {
        this.keygroup = value;
    }

    /**
     * Gets the value of the keyfield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyfield() {
        return keyfield;
    }

    /**
     * Sets the value of the keyfield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyfield(String value) {
        this.keyfield = value;
    }

    /**
     * Gets the value of the lovId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLovId() {
        return lovId;
    }

    /**
     * Sets the value of the lovId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLovId(Long value) {
        this.lovId = value;
    }

}
