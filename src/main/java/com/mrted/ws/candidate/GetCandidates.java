
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCandidates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCandidates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="qualified"/>
 *         &lt;element name="candidate" type="{http://ws.mrted.com/}candidateSearchCriteriaDTO" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCandidates", propOrder = {
    "page",
    "candidate"
})
public class GetCandidates {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Integer page;
    @XmlElement(namespace = "http://ws.mrted.com/", required = true)
    protected CandidateSearchCriteriaDTO candidate;

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPage(Integer value) {
        this.page = value;
    }

    /**
     * Gets the value of the candidate property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateSearchCriteriaDTO }
     *     
     */
    public CandidateSearchCriteriaDTO getCandidate() {
        return candidate;
    }

    /**
     * Sets the value of the candidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateSearchCriteriaDTO }
     *     
     */
    public void setCandidate(CandidateSearchCriteriaDTO value) {
        this.candidate = value;
    }

}
