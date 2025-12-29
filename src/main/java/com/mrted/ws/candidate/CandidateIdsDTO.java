
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateIdsDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="candidateIdsDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="candidateId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidateIdsDTO", propOrder = {
    "result",
    "numberOfPages"
})
public class CandidateIdsDTO {

    @XmlElement(required = true)
    protected CandidateIdsDTO.Result result;
    protected Integer numberOfPages;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateIdsDTO.Result }
     *     
     */
    public CandidateIdsDTO.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateIdsDTO.Result }
     *     
     */
    public void setResult(CandidateIdsDTO.Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the numberOfPages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPages(Integer value) {
        this.numberOfPages = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="candidateId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "candidateId"
    })
    public static class Result {

        @XmlElement(type = Long.class)
        protected List<Long> candidateId;

        /**
         * Gets the value of the candidateId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the candidateId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCandidateId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getCandidateId() {
            if (candidateId == null) {
                candidateId = new ArrayList<Long>();
            }
            return this.candidateId;
        }

    }

}
