
package com.mrted.ws.lovhierarchy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLovsAvilableForHierarchingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLovsAvilableForHierarchingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getLovsAvilableForHierarching" type="{http://ws.mrted.com/}genericLovForHierarchingDto" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLovsAvilableForHierarchingResponse", propOrder = {
    "getLovsAvilableForHierarching"
})
public class GetLovsAvilableForHierarchingResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected List<GenericLovForHierarchingDto> getLovsAvilableForHierarching;

    /**
     * Gets the value of the getLovsAvilableForHierarching property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getLovsAvilableForHierarching property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetLovsAvilableForHierarching().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericLovForHierarchingDto }
     * 
     * 
     */
    public List<GenericLovForHierarchingDto> getGetLovsAvilableForHierarching() {
        if (getLovsAvilableForHierarching == null) {
            getLovsAvilableForHierarching = new ArrayList<GenericLovForHierarchingDto>();
        }
        return this.getLovsAvilableForHierarching;
    }

}
