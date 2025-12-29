
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateSingleHierarchyMemberResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateSingleHierarchyMemberResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateSingleHierarchyMember" type="{http://ws.mrted.com/}operationResultDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSingleHierarchyMemberResponse", propOrder = {
    "updateSingleHierarchyMember"
})
public class UpdateSingleHierarchyMemberResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected OperationResultDto updateSingleHierarchyMember;

    /**
     * Gets the value of the updateSingleHierarchyMember property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResultDto }
     *     
     */
    public OperationResultDto getUpdateSingleHierarchyMember() {
        return updateSingleHierarchyMember;
    }

    /**
     * Sets the value of the updateSingleHierarchyMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResultDto }
     *     
     */
    public void setUpdateSingleHierarchyMember(OperationResultDto value) {
        this.updateSingleHierarchyMember = value;
    }

}
