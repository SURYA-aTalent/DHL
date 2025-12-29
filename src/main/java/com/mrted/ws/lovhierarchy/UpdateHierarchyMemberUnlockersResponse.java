
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateHierarchyMemberUnlockersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateHierarchyMemberUnlockersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateHierarchyMemberUnlockers" type="{http://ws.mrted.com/}operationResultDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateHierarchyMemberUnlockersResponse", propOrder = {
    "updateHierarchyMemberUnlockers"
})
public class UpdateHierarchyMemberUnlockersResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected OperationResultDto updateHierarchyMemberUnlockers;

    /**
     * Gets the value of the updateHierarchyMemberUnlockers property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResultDto }
     *     
     */
    public OperationResultDto getUpdateHierarchyMemberUnlockers() {
        return updateHierarchyMemberUnlockers;
    }

    /**
     * Sets the value of the updateHierarchyMemberUnlockers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResultDto }
     *     
     */
    public void setUpdateHierarchyMemberUnlockers(OperationResultDto value) {
        this.updateHierarchyMemberUnlockers = value;
    }

}
