
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for teamMemberDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="teamMemberDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}userDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="lovValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="order" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "teamMemberDto")
@XmlSeeAlso({
    ApproverDto.class
})
public class TeamMemberDto
    extends UserDto
{

    @XmlAttribute(name = "lovValue")
    protected String lovValue;
    @XmlAttribute(name = "order", required = true)
    protected int order;

    /**
     * Gets the value of the lovValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLovValue() {
        return lovValue;
    }

    /**
     * Sets the value of the lovValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLovValue(String value) {
        this.lovValue = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

}
