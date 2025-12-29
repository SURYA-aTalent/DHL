
package com.mrted.ws.lovhierarchy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLovsByUnlockersWithFilterResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLovsByUnlockersWithFilterResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getLovsByUnlockers" type="{http://ws.mrted.com/}genericLovForHierarchingDto" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLovsByUnlockersWithFilterResponse", propOrder = {
    "getLovsByUnlockers"
})
public class GetLovsByUnlockersWithFilterResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected List<GenericLovForHierarchingDto> getLovsByUnlockers;

    /**
     * Gets the value of the getLovsByUnlockers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getLovsByUnlockers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetLovsByUnlockers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericLovForHierarchingDto }
     * 
     * 
     */
    public List<GenericLovForHierarchingDto> getGetLovsByUnlockers() {
        if (getLovsByUnlockers == null) {
            getLovsByUnlockers = new ArrayList<GenericLovForHierarchingDto>();
        }
        return this.getLovsByUnlockers;
    }

}
