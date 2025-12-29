
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrganizationStructureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrganizationStructureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizationStructure" type="{http://ws.mrted.com/}organizationStructureDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrganizationStructureResponse", propOrder = {
    "organizationStructure"
})
public class GetOrganizationStructureResponse {

    protected OrganizationStructureDto organizationStructure;

    /**
     * Gets the value of the organizationStructure property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationStructureDto }
     *     
     */
    public OrganizationStructureDto getOrganizationStructure() {
        return organizationStructure;
    }

    /**
     * Sets the value of the organizationStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationStructureDto }
     *     
     */
    public void setOrganizationStructure(OrganizationStructureDto value) {
        this.organizationStructure = value;
    }

}
