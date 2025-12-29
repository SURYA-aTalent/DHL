
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authorizedRecruitment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorizedRecruitment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalCandidate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorizedRecruitment", propOrder = {
    "employee",
    "externalCandidate"
})
public class AuthorizedRecruitment {

    protected Boolean employee;
    protected Boolean externalCandidate;

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployee(Boolean value) {
        this.employee = value;
    }

    /**
     * Gets the value of the externalCandidate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalCandidate() {
        return externalCandidate;
    }

    /**
     * Sets the value of the externalCandidate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalCandidate(Boolean value) {
        this.externalCandidate = value;
    }

}
