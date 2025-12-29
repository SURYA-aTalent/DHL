
package com.mrted.ws.position;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for totalCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="totalCost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "totalCost", propOrder = {
    "currency",
    "maximum",
    "minimum"
})
public class TotalCost {

    protected String currency;
    protected BigDecimal maximum;
    protected BigDecimal minimum;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximum(BigDecimal value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimum(BigDecimal value) {
        this.minimum = value;
    }

}
