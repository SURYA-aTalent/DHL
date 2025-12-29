
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getConsentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getConsentsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dpConsentDto" type="{http://ws.mrted.com/}dpConsentDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getConsentsResponse", propOrder = {
    "dpConsentDto"
})
public class GetConsentsResponse {

    protected List<DpConsentDto> dpConsentDto;

    /**
     * Gets the value of the dpConsentDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dpConsentDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDpConsentDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DpConsentDto }
     * 
     * 
     */
    public List<DpConsentDto> getDpConsentDto() {
        if (dpConsentDto == null) {
            dpConsentDto = new ArrayList<DpConsentDto>();
        }
        return this.dpConsentDto;
    }

}
