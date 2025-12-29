
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getConsents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getConsents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://ws.mrted.com/}ConsentSearchCriteriaDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConsents", propOrder = {
    "filter"
})
public class GetConsents {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected ConsentSearchCriteriaDto filter;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentSearchCriteriaDto }
     *     
     */
    public ConsentSearchCriteriaDto getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentSearchCriteriaDto }
     *     
     */
    public void setFilter(ConsentSearchCriteriaDto value) {
        this.filter = value;
    }

}
