
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tag">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="labeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://ws.mrted.com/}tagType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tag", propOrder = {
    "labeKey",
    "name",
    "type"
})
public class Tag
    extends BaseEntity
{

    protected String labeKey;
    protected String name;
    protected TagType type;

    /**
     * Gets the value of the labeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabeKey() {
        return labeKey;
    }

    /**
     * Sets the value of the labeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabeKey(String value) {
        this.labeKey = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TagType }
     *     
     */
    public TagType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagType }
     *     
     */
    public void setType(TagType value) {
        this.type = value;
    }

}
