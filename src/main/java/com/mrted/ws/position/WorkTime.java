
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeCount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="workPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workTime", propOrder = {
    "timeCount",
    "workPeriod",
    "workUnit"
})
public class WorkTime {

    protected Float timeCount;
    protected String workPeriod;
    protected String workUnit;

    /**
     * Gets the value of the timeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeCount() {
        return timeCount;
    }

    /**
     * Sets the value of the timeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeCount(Float value) {
        this.timeCount = value;
    }

    /**
     * Gets the value of the workPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkPeriod() {
        return workPeriod;
    }

    /**
     * Sets the value of the workPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkPeriod(String value) {
        this.workPeriod = value;
    }

    /**
     * Gets the value of the workUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkUnit() {
        return workUnit;
    }

    /**
     * Sets the value of the workUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkUnit(String value) {
        this.workUnit = value;
    }

}
