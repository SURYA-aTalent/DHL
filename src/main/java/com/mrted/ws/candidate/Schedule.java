
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for schedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://ws.mrted.com/}scheduleType" minOccurs="0"/>
 *         &lt;element name="workAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="workPeriod" type="{http://ws.mrted.com/}workPeriod" minOccurs="0"/>
 *         &lt;element name="workUnit" type="{http://ws.mrted.com/}workUnit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedule", propOrder = {
    "type",
    "workAmount",
    "workPeriod",
    "workUnit"
})
public class Schedule {

    protected ScheduleType type;
    protected Float workAmount;
    protected WorkPeriod workPeriod;
    protected WorkUnit workUnit;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setType(ScheduleType value) {
        this.type = value;
    }

    /**
     * Gets the value of the workAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWorkAmount() {
        return workAmount;
    }

    /**
     * Sets the value of the workAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWorkAmount(Float value) {
        this.workAmount = value;
    }

    /**
     * Gets the value of the workPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link WorkPeriod }
     *     
     */
    public WorkPeriod getWorkPeriod() {
        return workPeriod;
    }

    /**
     * Sets the value of the workPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkPeriod }
     *     
     */
    public void setWorkPeriod(WorkPeriod value) {
        this.workPeriod = value;
    }

    /**
     * Gets the value of the workUnit property.
     * 
     * @return
     *     possible object is
     *     {@link WorkUnit }
     *     
     */
    public WorkUnit getWorkUnit() {
        return workUnit;
    }

    /**
     * Sets the value of the workUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkUnit }
     *     
     */
    public void setWorkUnit(WorkUnit value) {
        this.workUnit = value;
    }

}
