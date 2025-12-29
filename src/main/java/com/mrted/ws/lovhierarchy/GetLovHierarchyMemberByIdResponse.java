
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLovHierarchyMemberByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLovHierarchyMemberByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getLovHierarchyMemberById" type="{http://ws.mrted.com/}lovHierarchyMemberDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLovHierarchyMemberByIdResponse", propOrder = {
    "getLovHierarchyMemberById"
})
public class GetLovHierarchyMemberByIdResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected LovHierarchyMemberDto getLovHierarchyMemberById;

    /**
     * Gets the value of the getLovHierarchyMemberById property.
     * 
     * @return
     *     possible object is
     *     {@link LovHierarchyMemberDto }
     *     
     */
    public LovHierarchyMemberDto getGetLovHierarchyMemberById() {
        return getLovHierarchyMemberById;
    }

    /**
     * Sets the value of the getLovHierarchyMemberById property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovHierarchyMemberDto }
     *     
     */
    public void setGetLovHierarchyMemberById(LovHierarchyMemberDto value) {
        this.getLovHierarchyMemberById = value;
    }

}
