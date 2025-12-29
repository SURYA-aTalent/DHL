
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignedVideoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignedVideoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://ws.mrted.com/}videoPosition" minOccurs="0"/>
 *         &lt;element name="videoUrlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignedVideoDto", propOrder = {
    "id",
    "position",
    "videoUrlId"
})
public class AssignedVideoDto {

    protected String id;
    @XmlSchemaType(name = "string")
    protected VideoPosition position;
    protected String videoUrlId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPosition }
     *     
     */
    public VideoPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPosition }
     *     
     */
    public void setPosition(VideoPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the videoUrlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoUrlId() {
        return videoUrlId;
    }

    /**
     * Sets the value of the videoUrlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoUrlId(String value) {
        this.videoUrlId = value;
    }

}
