
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTaggedUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTaggedUsers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="tagTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTaggedUsers", propOrder = {
    "tagName",
    "tagTypeName"
})
public class GetTaggedUsers {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String tagName;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String tagTypeName;

    /**
     * Gets the value of the tagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Sets the value of the tagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

    /**
     * Gets the value of the tagTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagTypeName() {
        return tagTypeName;
    }

    /**
     * Sets the value of the tagTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagTypeName(String value) {
        this.tagTypeName = value;
    }

}
