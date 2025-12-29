
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateHierarchyMemberUnlockers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateHierarchyMemberUnlockers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://ws.mrted.com/}lovHierarchyMemberDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateHierarchyMemberUnlockers", propOrder = {
    "arg0"
})
public class UpdateHierarchyMemberUnlockers {

    protected LovHierarchyMemberDto arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link LovHierarchyMemberDto }
     *     
     */
    public LovHierarchyMemberDto getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovHierarchyMemberDto }
     *     
     */
    public void setArg0(LovHierarchyMemberDto value) {
        this.arg0 = value;
    }

}
