
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detailedApplicationDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailedApplicationDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountOfResultPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="applicantTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="new" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inProcess" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="offered" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hired" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="closed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="applicant" type="{http://ws.mrted.com/}shortApplication" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailedApplicationDto", propOrder = {
    "amountOfResultPages",
    "applicantTotal",
    "_new",
    "inProcess",
    "offered",
    "hired",
    "closed",
    "applicant"
})
public class DetailedApplicationDto {

    protected Integer amountOfResultPages;
    protected Integer applicantTotal;
    @XmlElement(name = "new")
    protected Integer _new;
    protected Integer inProcess;
    protected Integer offered;
    protected Integer hired;
    protected Integer closed;
    protected List<ShortApplication> applicant;

    /**
     * Gets the value of the amountOfResultPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmountOfResultPages() {
        return amountOfResultPages;
    }

    /**
     * Sets the value of the amountOfResultPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmountOfResultPages(Integer value) {
        this.amountOfResultPages = value;
    }

    /**
     * Gets the value of the applicantTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicantTotal() {
        return applicantTotal;
    }

    /**
     * Sets the value of the applicantTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicantTotal(Integer value) {
        this.applicantTotal = value;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNew(Integer value) {
        this._new = value;
    }

    /**
     * Gets the value of the inProcess property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInProcess() {
        return inProcess;
    }

    /**
     * Sets the value of the inProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInProcess(Integer value) {
        this.inProcess = value;
    }

    /**
     * Gets the value of the offered property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffered() {
        return offered;
    }

    /**
     * Sets the value of the offered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffered(Integer value) {
        this.offered = value;
    }

    /**
     * Gets the value of the hired property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHired() {
        return hired;
    }

    /**
     * Sets the value of the hired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHired(Integer value) {
        this.hired = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClosed(Integer value) {
        this.closed = value;
    }

    /**
     * Gets the value of the applicant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShortApplication }
     * 
     * 
     */
    public List<ShortApplication> getApplicant() {
        if (applicant == null) {
            applicant = new ArrayList<ShortApplication>();
        }
        return this.applicant;
    }

}
