
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for makeLovHierarchyMemberFromLov complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="makeLovHierarchyMemberFromLov">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lovId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeLovHierarchyMemberFromLov", propOrder = {
    "lovId"
})
public class MakeLovHierarchyMemberFromLov {

    protected Long lovId;

    /**
     * Gets the value of the lovId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLovId() {
        return lovId;
    }

    /**
     * Sets the value of the lovId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLovId(Long value) {
        this.lovId = value;
    }

}
