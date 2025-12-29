
package com.mrted.ws.candidate;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chargeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="defCondFrom" type="{http://ws.mrted.com/}defCondFrom" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="overAll" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="payRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="paySupplier" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://ws.mrted.com/}rateType" minOccurs="0"/>
 *         &lt;element name="rateUnit" type="{http://ws.mrted.com/}rateUnit" minOccurs="0"/>
 *         &lt;element name="supplierCharge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="supplierRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rate", propOrder = {
    "chargeRate",
    "defCondFrom",
    "id",
    "overAll",
    "payRate",
    "paySupplier",
    "rateType",
    "rateUnit",
    "supplierCharge",
    "supplierRate"
})
public class Rate {

    protected BigDecimal chargeRate;
    protected DefCondFrom defCondFrom;
    protected Long id;
    protected BigDecimal overAll;
    protected BigDecimal payRate;
    protected BigDecimal paySupplier;
    protected RateType rateType;
    protected RateUnit rateUnit;
    protected BigDecimal supplierCharge;
    protected BigDecimal supplierRate;

    /**
     * Gets the value of the chargeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeRate() {
        return chargeRate;
    }

    /**
     * Sets the value of the chargeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeRate(BigDecimal value) {
        this.chargeRate = value;
    }

    /**
     * Gets the value of the defCondFrom property.
     * 
     * @return
     *     possible object is
     *     {@link DefCondFrom }
     *     
     */
    public DefCondFrom getDefCondFrom() {
        return defCondFrom;
    }

    /**
     * Sets the value of the defCondFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefCondFrom }
     *     
     */
    public void setDefCondFrom(DefCondFrom value) {
        this.defCondFrom = value;
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
     * Gets the value of the overAll property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverAll() {
        return overAll;
    }

    /**
     * Sets the value of the overAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverAll(BigDecimal value) {
        this.overAll = value;
    }

    /**
     * Gets the value of the payRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayRate() {
        return payRate;
    }

    /**
     * Sets the value of the payRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayRate(BigDecimal value) {
        this.payRate = value;
    }

    /**
     * Gets the value of the paySupplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaySupplier() {
        return paySupplier;
    }

    /**
     * Sets the value of the paySupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaySupplier(BigDecimal value) {
        this.paySupplier = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setRateType(RateType value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the rateUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RateUnit }
     *     
     */
    public RateUnit getRateUnit() {
        return rateUnit;
    }

    /**
     * Sets the value of the rateUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateUnit }
     *     
     */
    public void setRateUnit(RateUnit value) {
        this.rateUnit = value;
    }

    /**
     * Gets the value of the supplierCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSupplierCharge() {
        return supplierCharge;
    }

    /**
     * Sets the value of the supplierCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSupplierCharge(BigDecimal value) {
        this.supplierCharge = value;
    }

    /**
     * Gets the value of the supplierRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSupplierRate() {
        return supplierRate;
    }

    /**
     * Sets the value of the supplierRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSupplierRate(BigDecimal value) {
        this.supplierRate = value;
    }

}
