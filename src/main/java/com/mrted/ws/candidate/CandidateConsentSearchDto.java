
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateConsentSearchDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="candidateConsentSearchDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://ws.mrted.com/}consentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://ws.mrted.com/}candidateConsentStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidateConsentSearchDto", propOrder = {
    "type",
    "status"
})
public class CandidateConsentSearchDto {

    @XmlSchemaType(name = "string")
    protected List<ConsentType> type;
    @XmlSchemaType(name = "string")
    protected List<CandidateConsentStatus> status;

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsentType }
     * 
     * 
     */
    public List<ConsentType> getType() {
        if (type == null) {
            type = new ArrayList<ConsentType>();
        }
        return this.type;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CandidateConsentStatus }
     * 
     * 
     */
    public List<CandidateConsentStatus> getStatus() {
        if (status == null) {
            status = new ArrayList<CandidateConsentStatus>();
        }
        return this.status;
    }

}
