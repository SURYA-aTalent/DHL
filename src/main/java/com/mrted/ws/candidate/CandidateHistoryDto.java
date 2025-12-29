
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateHistoryDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="candidateHistoryDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="candidateHistoryEntries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="candidateHistoryEntry" type="{http://ws.mrted.com/}candidateHistoryEntryDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="manualCandidateHistoryEntries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="candidateHistoryEntry" type="{http://ws.mrted.com/}candidateHistoryEntryDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidateHistoryDto", propOrder = {
    "candidateHistoryEntries",
    "manualCandidateHistoryEntries"
})
public class CandidateHistoryDto {

    protected CandidateHistoryDto.CandidateHistoryEntries candidateHistoryEntries;
    protected CandidateHistoryDto.ManualCandidateHistoryEntries manualCandidateHistoryEntries;

    /**
     * Gets the value of the candidateHistoryEntries property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateHistoryDto.CandidateHistoryEntries }
     *     
     */
    public CandidateHistoryDto.CandidateHistoryEntries getCandidateHistoryEntries() {
        return candidateHistoryEntries;
    }

    /**
     * Sets the value of the candidateHistoryEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateHistoryDto.CandidateHistoryEntries }
     *     
     */
    public void setCandidateHistoryEntries(CandidateHistoryDto.CandidateHistoryEntries value) {
        this.candidateHistoryEntries = value;
    }

    /**
     * Gets the value of the manualCandidateHistoryEntries property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateHistoryDto.ManualCandidateHistoryEntries }
     *     
     */
    public CandidateHistoryDto.ManualCandidateHistoryEntries getManualCandidateHistoryEntries() {
        return manualCandidateHistoryEntries;
    }

    /**
     * Sets the value of the manualCandidateHistoryEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateHistoryDto.ManualCandidateHistoryEntries }
     *     
     */
    public void setManualCandidateHistoryEntries(CandidateHistoryDto.ManualCandidateHistoryEntries value) {
        this.manualCandidateHistoryEntries = value;
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
     *         &lt;element name="candidateHistoryEntry" type="{http://ws.mrted.com/}candidateHistoryEntryDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "candidateHistoryEntry"
    })
    public static class CandidateHistoryEntries {

        protected List<CandidateHistoryEntryDto> candidateHistoryEntry;

        /**
         * Gets the value of the candidateHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the candidateHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCandidateHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CandidateHistoryEntryDto }
         * 
         * 
         */
        public List<CandidateHistoryEntryDto> getCandidateHistoryEntry() {
            if (candidateHistoryEntry == null) {
                candidateHistoryEntry = new ArrayList<CandidateHistoryEntryDto>();
            }
            return this.candidateHistoryEntry;
        }

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
     *         &lt;element name="candidateHistoryEntry" type="{http://ws.mrted.com/}candidateHistoryEntryDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "candidateHistoryEntry"
    })
    public static class ManualCandidateHistoryEntries {

        protected List<CandidateHistoryEntryDto> candidateHistoryEntry;

        /**
         * Gets the value of the candidateHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the candidateHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCandidateHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CandidateHistoryEntryDto }
         * 
         * 
         */
        public List<CandidateHistoryEntryDto> getCandidateHistoryEntry() {
            if (candidateHistoryEntry == null) {
                candidateHistoryEntry = new ArrayList<CandidateHistoryEntryDto>();
            }
            return this.candidateHistoryEntry;
        }

    }

}
