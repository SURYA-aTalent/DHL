
package com.mrted.ws.configfields;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genericLovDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genericLovDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}genericLov">
 *       &lt;sequence>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="new-data-value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="new-value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lov_id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericLovDto", propOrder = {
    "hidden",
    "newDataValue",
    "newValue",
    "order",
    "lovId"
})
@XmlSeeAlso({
    FreeFormFieldEntryDto.class
})
public class GenericLovDto
    extends GenericLov
{

    @XmlElement(defaultValue = "false")
    protected boolean hidden;
    @XmlElementRef(name = "new-data-value", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> newDataValue;
    @XmlElementRef(name = "new-value", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newValue;
    protected int order;
    @XmlElementRef(name = "lov_id", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lovId;

    /**
     * Gets the value of the hidden property.
     * 
     */
    public boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     */
    public void setHidden(boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the newDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNewDataValue() {
        return newDataValue;
    }

    /**
     * Sets the value of the newDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNewDataValue(JAXBElement<BigDecimal> value) {
        this.newDataValue = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewValue(JAXBElement<String> value) {
        this.newValue = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Gets the value of the lovId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLovId() {
        return lovId;
    }

    /**
     * Sets the value of the lovId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLovId(JAXBElement<Long> value) {
        this.lovId = value;
    }

}
