
package com.mrted.ws.candidate;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contractorContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contractorContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benchmarkRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="contractorType" type="{http://ws.mrted.com/}contractorType" minOccurs="0"/>
 *         &lt;element name="flexibilityMaxDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="flexibilityMinDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gainShareRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="standardCurrency" type="{http://ws.mrted.com/}currency" minOccurs="0"/>
 *         &lt;element name="standardPeriod" type="{http://ws.mrted.com/}compensationPeriod" minOccurs="0"/>
 *         &lt;element name="totalClientRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalCostCurrency" type="{http://ws.mrted.com/}currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractorContract", propOrder = {
    "additionalInfo",
    "benchmarkRate",
    "contractorType",
    "flexibilityMaxDate",
    "flexibilityMinDate",
    "gainShareRate",
    "standardCurrency",
    "standardPeriod",
    "totalClientRate",
    "totalCost",
    "totalCostCurrency"
})
public class ContractorContract {

    protected String additionalInfo;
    protected BigDecimal benchmarkRate;
    protected ContractorType contractorType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flexibilityMaxDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar flexibilityMinDate;
    protected BigDecimal gainShareRate;
    protected Currency standardCurrency;
    protected CompensationPeriod standardPeriod;
    protected BigDecimal totalClientRate;
    protected BigDecimal totalCost;
    protected Currency totalCostCurrency;

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the benchmarkRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBenchmarkRate() {
        return benchmarkRate;
    }

    /**
     * Sets the value of the benchmarkRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBenchmarkRate(BigDecimal value) {
        this.benchmarkRate = value;
    }

    /**
     * Gets the value of the contractorType property.
     * 
     * @return
     *     possible object is
     *     {@link ContractorType }
     *     
     */
    public ContractorType getContractorType() {
        return contractorType;
    }

    /**
     * Sets the value of the contractorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractorType }
     *     
     */
    public void setContractorType(ContractorType value) {
        this.contractorType = value;
    }

    /**
     * Gets the value of the flexibilityMaxDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlexibilityMaxDate() {
        return flexibilityMaxDate;
    }

    /**
     * Sets the value of the flexibilityMaxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlexibilityMaxDate(XMLGregorianCalendar value) {
        this.flexibilityMaxDate = value;
    }

    /**
     * Gets the value of the flexibilityMinDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFlexibilityMinDate() {
        return flexibilityMinDate;
    }

    /**
     * Sets the value of the flexibilityMinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFlexibilityMinDate(XMLGregorianCalendar value) {
        this.flexibilityMinDate = value;
    }

    /**
     * Gets the value of the gainShareRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGainShareRate() {
        return gainShareRate;
    }

    /**
     * Sets the value of the gainShareRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGainShareRate(BigDecimal value) {
        this.gainShareRate = value;
    }

    /**
     * Gets the value of the standardCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getStandardCurrency() {
        return standardCurrency;
    }

    /**
     * Sets the value of the standardCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setStandardCurrency(Currency value) {
        this.standardCurrency = value;
    }

    /**
     * Gets the value of the standardPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationPeriod }
     *     
     */
    public CompensationPeriod getStandardPeriod() {
        return standardPeriod;
    }

    /**
     * Sets the value of the standardPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationPeriod }
     *     
     */
    public void setStandardPeriod(CompensationPeriod value) {
        this.standardPeriod = value;
    }

    /**
     * Gets the value of the totalClientRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalClientRate() {
        return totalClientRate;
    }

    /**
     * Sets the value of the totalClientRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalClientRate(BigDecimal value) {
        this.totalClientRate = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCost(BigDecimal value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the totalCostCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getTotalCostCurrency() {
        return totalCostCurrency;
    }

    /**
     * Sets the value of the totalCostCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setTotalCostCurrency(Currency value) {
        this.totalCostCurrency = value;
    }

}
