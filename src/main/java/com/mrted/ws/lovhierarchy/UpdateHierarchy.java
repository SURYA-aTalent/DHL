
package com.mrted.ws.lovhierarchy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hlov" type="{http://ws.mrted.com/}lovHierarchyMemberDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateHierarchy", propOrder = {
    "hlov"
})
public class UpdateHierarchy {

    protected List<LovHierarchyMemberDto> hlov;

    /**
     * Gets the value of the hlov property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hlov property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHlov().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LovHierarchyMemberDto }
     * 
     * 
     */
    public List<LovHierarchyMemberDto> getHlov() {
        if (hlov == null) {
            hlov = new ArrayList<LovHierarchyMemberDto>();
        }
        return this.hlov;
    }

}
