
package com.mrted.ws.lovhierarchy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLovsByUnlockersWithFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLovsByUnlockersWithFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinationLovId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parentLovs" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filterDptId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="filterRecType" type="{http://ws.mrted.com/}recruitmentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLovsByUnlockersWithFilter", propOrder = {
    "destinationLovId",
    "parentLovs",
    "language",
    "filterDptId",
    "filterRecType"
})
public class GetLovsByUnlockersWithFilter {

    protected Long destinationLovId;
    @XmlElement(type = Long.class)
    protected List<Long> parentLovs;
    protected String language;
    protected Long filterDptId;
    @XmlSchemaType(name = "string")
    protected RecruitmentType filterRecType;

    /**
     * Gets the value of the destinationLovId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestinationLovId() {
        return destinationLovId;
    }

    /**
     * Sets the value of the destinationLovId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestinationLovId(Long value) {
        this.destinationLovId = value;
    }

    /**
     * Gets the value of the parentLovs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentLovs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentLovs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getParentLovs() {
        if (parentLovs == null) {
            parentLovs = new ArrayList<Long>();
        }
        return this.parentLovs;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the filterDptId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFilterDptId() {
        return filterDptId;
    }

    /**
     * Sets the value of the filterDptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFilterDptId(Long value) {
        this.filterDptId = value;
    }

    /**
     * Gets the value of the filterRecType property.
     * 
     * @return
     *     possible object is
     *     {@link RecruitmentType }
     *     
     */
    public RecruitmentType getFilterRecType() {
        return filterRecType;
    }

    /**
     * Sets the value of the filterRecType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecruitmentType }
     *     
     */
    public void setFilterRecType(RecruitmentType value) {
        this.filterRecType = value;
    }

}
