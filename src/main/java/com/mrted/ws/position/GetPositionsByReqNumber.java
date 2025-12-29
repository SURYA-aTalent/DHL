
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionsByReqNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionsByReqNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reqNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionsByReqNumber", propOrder = {
    "reqNumber"
})
public class GetPositionsByReqNumber {

    protected String reqNumber;

    /**
     * Gets the value of the reqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqNumber() {
        return reqNumber;
    }

    /**
     * Sets the value of the reqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqNumber(String value) {
        this.reqNumber = value;
    }

}
