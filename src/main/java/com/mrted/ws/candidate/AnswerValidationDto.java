
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for answerValidationDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="answerValidationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="answerType" type="{http://ws.mrted.com/}answerType" minOccurs="0"/>
 *         &lt;element name="atLeast" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="atMost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="earlierThanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="laterThanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maximumLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maximumValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="minimumLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minimumValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="otherAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "answerValidationDto", propOrder = {
    "answerType",
    "atLeast",
    "atMost",
    "dateFormat",
    "earlierThanDate",
    "laterThanDate",
    "maximumLength",
    "maximumValue",
    "minimumLength",
    "minimumValue",
    "otherAvailable",
    "required"
})
public class AnswerValidationDto {

    @XmlSchemaType(name = "string")
    protected AnswerType answerType;
    protected Integer atLeast;
    protected Integer atMost;
    protected String dateFormat;
    protected String earlierThanDate;
    protected String laterThanDate;
    protected Integer maximumLength;
    protected Double maximumValue;
    protected Integer minimumLength;
    protected Double minimumValue;
    protected boolean otherAvailable;
    protected boolean required;

    /**
     * Gets the value of the answerType property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerType }
     *     
     */
    public AnswerType getAnswerType() {
        return answerType;
    }

    /**
     * Sets the value of the answerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerType }
     *     
     */
    public void setAnswerType(AnswerType value) {
        this.answerType = value;
    }

    /**
     * Gets the value of the atLeast property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAtLeast() {
        return atLeast;
    }

    /**
     * Sets the value of the atLeast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAtLeast(Integer value) {
        this.atLeast = value;
    }

    /**
     * Gets the value of the atMost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAtMost() {
        return atMost;
    }

    /**
     * Sets the value of the atMost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAtMost(Integer value) {
        this.atMost = value;
    }

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the earlierThanDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarlierThanDate() {
        return earlierThanDate;
    }

    /**
     * Sets the value of the earlierThanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarlierThanDate(String value) {
        this.earlierThanDate = value;
    }

    /**
     * Gets the value of the laterThanDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaterThanDate() {
        return laterThanDate;
    }

    /**
     * Sets the value of the laterThanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaterThanDate(String value) {
        this.laterThanDate = value;
    }

    /**
     * Gets the value of the maximumLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumLength() {
        return maximumLength;
    }

    /**
     * Sets the value of the maximumLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumLength(Integer value) {
        this.maximumLength = value;
    }

    /**
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumValue(Double value) {
        this.maximumValue = value;
    }

    /**
     * Gets the value of the minimumLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumLength() {
        return minimumLength;
    }

    /**
     * Sets the value of the minimumLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumLength(Integer value) {
        this.minimumLength = value;
    }

    /**
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumValue(Double value) {
        this.minimumValue = value;
    }

    /**
     * Gets the value of the otherAvailable property.
     * 
     */
    public boolean isOtherAvailable() {
        return otherAvailable;
    }

    /**
     * Sets the value of the otherAvailable property.
     * 
     */
    public void setOtherAvailable(boolean value) {
        this.otherAvailable = value;
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
