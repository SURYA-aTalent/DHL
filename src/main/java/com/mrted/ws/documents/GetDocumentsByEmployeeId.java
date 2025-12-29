
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDocumentsByEmployeeId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDocumentsByEmployeeId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="positionAssignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocumentsByEmployeeId", propOrder = {
    "employeeId",
    "positionAssignId"
})
public class GetDocumentsByEmployeeId {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long employeeId;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long positionAssignId;

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmployeeId(Long value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the positionAssignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPositionAssignId() {
        return positionAssignId;
    }

    /**
     * Sets the value of the positionAssignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPositionAssignId(Long value) {
        this.positionAssignId = value;
    }

}
