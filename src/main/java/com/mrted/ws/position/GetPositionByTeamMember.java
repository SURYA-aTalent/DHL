
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionByTeamMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionByTeamMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestbyteammember" type="{http://ws.mrted.com/}requestByTeamMemberDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionByTeamMember", propOrder = {
    "requestbyteammember"
})
public class GetPositionByTeamMember {

    protected RequestByTeamMemberDto requestbyteammember;

    /**
     * Gets the value of the requestbyteammember property.
     * 
     * @return
     *     possible object is
     *     {@link RequestByTeamMemberDto }
     *     
     */
    public RequestByTeamMemberDto getRequestbyteammember() {
        return requestbyteammember;
    }

    /**
     * Sets the value of the requestbyteammember property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestByTeamMemberDto }
     *     
     */
    public void setRequestbyteammember(RequestByTeamMemberDto value) {
        this.requestbyteammember = value;
    }

}
