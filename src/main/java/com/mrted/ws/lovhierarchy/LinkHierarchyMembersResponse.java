
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for linkHierarchyMembersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="linkHierarchyMembersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="linkHierarchyMembers" type="{http://ws.mrted.com/}lovHierarchyMemberDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkHierarchyMembersResponse", propOrder = {
    "linkHierarchyMembers"
})
public class LinkHierarchyMembersResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected LovHierarchyMemberDto linkHierarchyMembers;

    /**
     * Gets the value of the linkHierarchyMembers property.
     * 
     * @return
     *     possible object is
     *     {@link LovHierarchyMemberDto }
     *     
     */
    public LovHierarchyMemberDto getLinkHierarchyMembers() {
        return linkHierarchyMembers;
    }

    /**
     * Sets the value of the linkHierarchyMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovHierarchyMemberDto }
     *     
     */
    public void setLinkHierarchyMembers(LovHierarchyMemberDto value) {
        this.linkHierarchyMembers = value;
    }

}
