
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for approverDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="approverDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}teamMemberDto">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="stepOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "approverDto")
public class ApproverDto
    extends TeamMemberDto
{

    @XmlAttribute(name = "stepOrder", required = true)
    protected int stepOrder;

    /**
     * Gets the value of the stepOrder property.
     * 
     */
    public int getStepOrder() {
        return stepOrder;
    }

    /**
     * Sets the value of the stepOrder property.
     * 
     */
    public void setStepOrder(int value) {
        this.stepOrder = value;
    }

}
