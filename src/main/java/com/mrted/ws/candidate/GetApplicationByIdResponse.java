
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getApplicationByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getApplicationByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.mrted.com/}application" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getApplicationByIdResponse", propOrder = {
    "application"
})
public class GetApplicationByIdResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected ApplicationDto application;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationDto }
     *     
     */
    public ApplicationDto getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationDto }
     *     
     */
    public void setApplication(ApplicationDto value) {
        this.application = value;
    }

}
