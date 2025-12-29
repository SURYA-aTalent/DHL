
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrganizationStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrganizationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizationLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrganizationStructure", propOrder = {
    "organizationLevel"
})
public class GetOrganizationStructure {

    protected Integer organizationLevel;

    /**
     * Gets the value of the organizationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrganizationLevel() {
        return organizationLevel;
    }

    /**
     * Sets the value of the organizationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrganizationLevel(Integer value) {
        this.organizationLevel = value;
    }

}
