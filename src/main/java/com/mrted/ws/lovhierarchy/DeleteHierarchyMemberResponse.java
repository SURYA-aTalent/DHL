
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteHierarchyMemberResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteHierarchyMemberResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteHierarchyMember" type="{http://ws.mrted.com/}operationResultDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteHierarchyMemberResponse", propOrder = {
    "deleteHierarchyMember"
})
public class DeleteHierarchyMemberResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected OperationResultDto deleteHierarchyMember;

    /**
     * Gets the value of the deleteHierarchyMember property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResultDto }
     *     
     */
    public OperationResultDto getDeleteHierarchyMember() {
        return deleteHierarchyMember;
    }

    /**
     * Sets the value of the deleteHierarchyMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResultDto }
     *     
     */
    public void setDeleteHierarchyMember(OperationResultDto value) {
        this.deleteHierarchyMember = value;
    }

}
