
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTaggedDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTaggedDocuments">
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
@XmlType(name = "getTaggedDocuments", propOrder = {
    "tagName",
    "tagTypeName"
})
public class GetTaggedDocuments {

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
