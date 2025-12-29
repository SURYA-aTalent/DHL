
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCandidateHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCandidateHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="candidate" type="{http://ws.mrted.com/}candidateHistorySearchCriteriaDto" minOccurs="0" form="qualified"/>
 *         &lt;element name="filters" type="{http://ws.mrted.com/}candidateHistoryFiltersDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCandidateHistory", propOrder = {
    "candidate",
    "filters"
})
public class GetCandidateHistory {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected CandidateHistorySearchCriteriaDto candidate;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected CandidateHistoryFiltersDto filters;

    /**
     * Gets the value of the candidate property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateHistorySearchCriteriaDto }
     *     
     */
    public CandidateHistorySearchCriteriaDto getCandidate() {
        return candidate;
    }

    /**
     * Sets the value of the candidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateHistorySearchCriteriaDto }
     *     
     */
    public void setCandidate(CandidateHistorySearchCriteriaDto value) {
        this.candidate = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateHistoryFiltersDto }
     *     
     */
    public CandidateHistoryFiltersDto getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateHistoryFiltersDto }
     *     
     */
    public void setFilters(CandidateHistoryFiltersDto value) {
        this.filters = value;
    }

}
