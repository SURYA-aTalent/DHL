
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="displayConsents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationById", propOrder = {
    "applicationId",
    "displayConsents"
})
public class GetApplicationById {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long applicationId;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Boolean displayConsents;

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the displayConsents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayConsents() {
        return displayConsents;
    }

    /**
     * Sets the value of the displayConsents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayConsents(Boolean value) {
        this.displayConsents = value;
    }

}
