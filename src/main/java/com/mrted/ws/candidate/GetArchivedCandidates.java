
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getArchivedCandidates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getArchivedCandidates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="archivedCandidatesFilters" type="{http://ws.mrted.com/}archivedCandidatesFiltersDto" minOccurs="0" form="qualified"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArchivedCandidates", propOrder = {
    "archivedCandidatesFilters",
    "page"
})
public class GetArchivedCandidates {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected ArchivedCandidatesFiltersDto archivedCandidatesFilters;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected int page;

    /**
     * Gets the value of the archivedCandidatesFilters property.
     * 
     * @return
     *     possible object is
     *     {@link ArchivedCandidatesFiltersDto }
     *     
     */
    public ArchivedCandidatesFiltersDto getArchivedCandidatesFilters() {
        return archivedCandidatesFilters;
    }

    /**
     * Sets the value of the archivedCandidatesFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchivedCandidatesFiltersDto }
     *     
     */
    public void setArchivedCandidatesFilters(ArchivedCandidatesFiltersDto value) {
        this.archivedCandidatesFilters = value;
    }

    /**
     * Gets the value of the page property.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

}
