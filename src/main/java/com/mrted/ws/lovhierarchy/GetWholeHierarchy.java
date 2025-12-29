
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getWholeHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWholeHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lovType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWholeHierarchy", propOrder = {
    "lovType",
    "departmentId"
})
public class GetWholeHierarchy {

    protected Integer lovType;
    protected Long departmentId;

    /**
     * Gets the value of the lovType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLovType() {
        return lovType;
    }

    /**
     * Sets the value of the lovType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLovType(Integer value) {
        this.lovType = value;
    }

    /**
     * Gets the value of the departmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the value of the departmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepartmentId(Long value) {
        this.departmentId = value;
    }

}
