
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for selectedOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selectedOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assignedOption" type="{http://ws.mrted.com/}assignedOption" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectedOption", propOrder = {
    "assignedOption",
    "id"
})
public class SelectedOption {

    protected AssignedOption assignedOption;
    protected Long id;

    /**
     * Gets the value of the assignedOption property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedOption }
     *     
     */
    public AssignedOption getAssignedOption() {
        return assignedOption;
    }

    /**
     * Sets the value of the assignedOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedOption }
     *     
     */
    public void setAssignedOption(AssignedOption value) {
        this.assignedOption = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

}
