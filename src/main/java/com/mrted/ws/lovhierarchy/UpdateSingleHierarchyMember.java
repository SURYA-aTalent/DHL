
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateSingleHierarchyMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateSingleHierarchyMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hlov" type="{http://ws.mrted.com/}lovHierarchyMemberDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSingleHierarchyMember", propOrder = {
    "hlov"
})
public class UpdateSingleHierarchyMember {

    protected LovHierarchyMemberDto hlov;

    /**
     * Gets the value of the hlov property.
     * 
     * @return
     *     possible object is
     *     {@link LovHierarchyMemberDto }
     *     
     */
    public LovHierarchyMemberDto getHlov() {
        return hlov;
    }

    /**
     * Sets the value of the hlov property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovHierarchyMemberDto }
     *     
     */
    public void setHlov(LovHierarchyMemberDto value) {
        this.hlov = value;
    }

}
