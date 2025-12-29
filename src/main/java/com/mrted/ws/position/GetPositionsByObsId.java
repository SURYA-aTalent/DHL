
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionsByObsId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionsByObsId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestbyobsid" type="{http://ws.mrted.com/}requestbyobsidDto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionsByObsId", propOrder = {
    "requestbyobsid"
})
public class GetPositionsByObsId {

    @XmlElement(required = true)
    protected RequestbyobsidDto requestbyobsid;

    /**
     * Gets the value of the requestbyobsid property.
     * 
     * @return
     *     possible object is
     *     {@link RequestbyobsidDto }
     *     
     */
    public RequestbyobsidDto getRequestbyobsid() {
        return requestbyobsid;
    }

    /**
     * Sets the value of the requestbyobsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestbyobsidDto }
     *     
     */
    public void setRequestbyobsid(RequestbyobsidDto value) {
        this.requestbyobsid = value;
    }

}
