
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionsByUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionsByUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestparam" type="{http://ws.mrted.com/}requestParamsDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionsByUser", propOrder = {
    "requestparam"
})
public class GetPositionsByUser {

    protected RequestParamsDto requestparam;

    /**
     * Gets the value of the requestparam property.
     * 
     * @return
     *     possible object is
     *     {@link RequestParamsDto }
     *     
     */
    public RequestParamsDto getRequestparam() {
        return requestparam;
    }

    /**
     * Sets the value of the requestparam property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestParamsDto }
     *     
     */
    public void setRequestparam(RequestParamsDto value) {
        this.requestparam = value;
    }

}
