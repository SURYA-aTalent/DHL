
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unLinkHierarchyMembersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unLinkHierarchyMembersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unLinkHierarchyMembers" type="{http://ws.mrted.com/}operationResultDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unLinkHierarchyMembersResponse", propOrder = {
    "unLinkHierarchyMembers"
})
public class UnLinkHierarchyMembersResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected OperationResultDto unLinkHierarchyMembers;

    /**
     * Gets the value of the unLinkHierarchyMembers property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResultDto }
     *     
     */
    public OperationResultDto getUnLinkHierarchyMembers() {
        return unLinkHierarchyMembers;
    }

    /**
     * Sets the value of the unLinkHierarchyMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResultDto }
     *     
     */
    public void setUnLinkHierarchyMembers(OperationResultDto value) {
        this.unLinkHierarchyMembers = value;
    }

}
