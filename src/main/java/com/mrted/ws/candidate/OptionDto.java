
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for optionDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="optionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hasScore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="localizedLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="optionScore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unlocalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "optionDto", propOrder = {
    "_default",
    "hasScore",
    "localizedLabel",
    "optionId",
    "optionScore",
    "order",
    "unlocalValue"
})
@XmlSeeAlso({
    AssignedOptionDto.class
})
public class OptionDto {

    @XmlElement(name = "default")
    protected boolean _default;
    protected boolean hasScore;
    protected String localizedLabel;
    protected Long optionId;
    protected Long optionScore;
    protected Long order;
    protected String unlocalValue;

    /**
     * Gets the value of the default property.
     * 
     */
    public boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     */
    public void setDefault(boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the hasScore property.
     * 
     */
    public boolean isHasScore() {
        return hasScore;
    }

    /**
     * Sets the value of the hasScore property.
     * 
     */
    public void setHasScore(boolean value) {
        this.hasScore = value;
    }

    /**
     * Gets the value of the localizedLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizedLabel() {
        return localizedLabel;
    }

    /**
     * Sets the value of the localizedLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizedLabel(String value) {
        this.localizedLabel = value;
    }

    /**
     * Gets the value of the optionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptionId() {
        return optionId;
    }

    /**
     * Sets the value of the optionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptionId(Long value) {
        this.optionId = value;
    }

    /**
     * Gets the value of the optionScore property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptionScore() {
        return optionScore;
    }

    /**
     * Sets the value of the optionScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptionScore(Long value) {
        this.optionScore = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrder(Long value) {
        this.order = value;
    }

    /**
     * Gets the value of the unlocalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnlocalValue() {
        return unlocalValue;
    }

    /**
     * Sets the value of the unlocalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnlocalValue(String value) {
        this.unlocalValue = value;
    }

}
