
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLovHierarchyMemberById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLovHierarchyMemberById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hierarchyMemberId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLovHierarchyMemberById", propOrder = {
    "hierarchyMemberId"
})
public class GetLovHierarchyMemberById {

    protected Long hierarchyMemberId;

    /**
     * Gets the value of the hierarchyMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHierarchyMemberId() {
        return hierarchyMemberId;
    }

    /**
     * Sets the value of the hierarchyMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHierarchyMemberId(Long value) {
        this.hierarchyMemberId = value;
    }

}
