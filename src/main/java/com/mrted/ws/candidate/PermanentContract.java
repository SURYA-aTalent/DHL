
package com.mrted.ws.candidate;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permanentContract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="permanentContract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fixedSalary" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fixedSalaryCurrency" type="{http://ws.mrted.com/}currency" minOccurs="0"/>
 *         &lt;element name="fixedSalaryPeriod" type="{http://ws.mrted.com/}compensationPeriod" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="probationaryPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relocation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="relocationCurrency" type="{http://ws.mrted.com/}currency" minOccurs="0"/>
 *         &lt;element name="variableSalary" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="variableSalaryCurrency" type="{http://ws.mrted.com/}currency" minOccurs="0"/>
 *         &lt;element name="variableSalaryPeriod" type="{http://ws.mrted.com/}compensationPeriod" minOccurs="0"/>
 *         &lt;element name="carAllowance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "permanentContract", propOrder = {
    "fixedSalary",
    "fixedSalaryCurrency",
    "fixedSalaryPeriod",
    "memo",
    "probationaryPeriod",
    "relocation",
    "relocationCurrency",
    "variableSalary",
    "variableSalaryCurrency",
    "variableSalaryPeriod",
    "carAllowance"
})
public class PermanentContract {

    protected BigDecimal fixedSalary;
    protected Currency fixedSalaryCurrency;
    protected CompensationPeriod fixedSalaryPeriod;
    protected String memo;
    protected String probationaryPeriod;
    protected BigDecimal relocation;
    protected Currency relocationCurrency;
    protected BigDecimal variableSalary;
    protected Currency variableSalaryCurrency;
    protected CompensationPeriod variableSalaryPeriod;
    protected Boolean carAllowance;

    /**
     * Gets the value of the fixedSalary property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedSalary() {
        return fixedSalary;
    }

    /**
     * Sets the value of the fixedSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedSalary(BigDecimal value) {
        this.fixedSalary = value;
    }

    /**
     * Gets the value of the fixedSalaryCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getFixedSalaryCurrency() {
        return fixedSalaryCurrency;
    }

    /**
     * Sets the value of the fixedSalaryCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setFixedSalaryCurrency(Currency value) {
        this.fixedSalaryCurrency = value;
    }

    /**
     * Gets the value of the fixedSalaryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationPeriod }
     *     
     */
    public CompensationPeriod getFixedSalaryPeriod() {
        return fixedSalaryPeriod;
    }

    /**
     * Sets the value of the fixedSalaryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationPeriod }
     *     
     */
    public void setFixedSalaryPeriod(CompensationPeriod value) {
        this.fixedSalaryPeriod = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the probationaryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbationaryPeriod() {
        return probationaryPeriod;
    }

    /**
     * Sets the value of the probationaryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbationaryPeriod(String value) {
        this.probationaryPeriod = value;
    }

    /**
     * Gets the value of the relocation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelocation() {
        return relocation;
    }

    /**
     * Sets the value of the relocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelocation(BigDecimal value) {
        this.relocation = value;
    }

    /**
     * Gets the value of the relocationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getRelocationCurrency() {
        return relocationCurrency;
    }

    /**
     * Sets the value of the relocationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setRelocationCurrency(Currency value) {
        this.relocationCurrency = value;
    }

    /**
     * Gets the value of the variableSalary property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVariableSalary() {
        return variableSalary;
    }

    /**
     * Sets the value of the variableSalary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVariableSalary(BigDecimal value) {
        this.variableSalary = value;
    }

    /**
     * Gets the value of the variableSalaryCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getVariableSalaryCurrency() {
        return variableSalaryCurrency;
    }

    /**
     * Sets the value of the variableSalaryCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setVariableSalaryCurrency(Currency value) {
        this.variableSalaryCurrency = value;
    }

    /**
     * Gets the value of the variableSalaryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationPeriod }
     *     
     */
    public CompensationPeriod getVariableSalaryPeriod() {
        return variableSalaryPeriod;
    }

    /**
     * Sets the value of the variableSalaryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationPeriod }
     *     
     */
    public void setVariableSalaryPeriod(CompensationPeriod value) {
        this.variableSalaryPeriod = value;
    }

    /**
     * Gets the value of the carAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCarAllowance() {
        return carAllowance;
    }

    /**
     * Sets the value of the carAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCarAllowance(Boolean value) {
        this.carAllowance = value;
    }

}
