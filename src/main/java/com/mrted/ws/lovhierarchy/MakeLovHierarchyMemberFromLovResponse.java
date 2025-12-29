
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for makeLovHierarchyMemberFromLovResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="makeLovHierarchyMemberFromLovResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="makeLovHierarchyMemberFromLov" type="{http://ws.mrted.com/}lovHierarchyMemberDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeLovHierarchyMemberFromLovResponse", propOrder = {
    "makeLovHierarchyMemberFromLov"
})
public class MakeLovHierarchyMemberFromLovResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected LovHierarchyMemberDto makeLovHierarchyMemberFromLov;

    /**
     * Gets the value of the makeLovHierarchyMemberFromLov property.
     * 
     * @return
     *     possible object is
     *     {@link LovHierarchyMemberDto }
     *     
     */
    public LovHierarchyMemberDto getMakeLovHierarchyMemberFromLov() {
        return makeLovHierarchyMemberFromLov;
    }

    /**
     * Sets the value of the makeLovHierarchyMemberFromLov property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovHierarchyMemberDto }
     *     
     */
    public void setMakeLovHierarchyMemberFromLov(LovHierarchyMemberDto value) {
        this.makeLovHierarchyMemberFromLov = value;
    }

}
