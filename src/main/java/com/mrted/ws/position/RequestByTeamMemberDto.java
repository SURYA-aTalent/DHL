
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestByTeamMemberDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestByTeamMemberDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}requestParamsDto">
 *       &lt;sequence>
 *         &lt;element name="teamType" type="{http://ws.mrted.com/}teamType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestByTeamMemberDto", propOrder = {
    "teamType"
})
public class RequestByTeamMemberDto
    extends RequestParamsDto
{

    @XmlSchemaType(name = "string")
    protected TeamType teamType;

    /**
     * Gets the value of the teamType property.
     * 
     * @return
     *     possible object is
     *     {@link TeamType }
     *     
     */
    public TeamType getTeamType() {
        return teamType;
    }

    /**
     * Sets the value of the teamType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamType }
     *     
     */
    public void setTeamType(TeamType value) {
        this.teamType = value;
    }

}
