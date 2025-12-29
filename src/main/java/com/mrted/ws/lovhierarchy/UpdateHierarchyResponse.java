
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateHierarchyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateHierarchyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateHierarchy" type="{http://ws.mrted.com/}operationResultDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateHierarchyResponse", propOrder = {
    "updateHierarchy"
})
public class UpdateHierarchyResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected OperationResultDto updateHierarchy;

    /**
     * Gets the value of the updateHierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResultDto }
     *     
     */
    public OperationResultDto getUpdateHierarchy() {
        return updateHierarchy;
    }

    /**
     * Sets the value of the updateHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResultDto }
     *     
     */
    public void setUpdateHierarchy(OperationResultDto value) {
        this.updateHierarchy = value;
    }

}
