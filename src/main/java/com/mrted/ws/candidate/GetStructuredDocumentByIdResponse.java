
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStructuredDocumentByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStructuredDocumentByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://ws.mrted.com/}structuredDocument" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStructuredDocumentByIdResponse", propOrder = {
    "type"
})
public class GetStructuredDocumentByIdResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected StructuredDocument type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDocument }
     *     
     */
    public StructuredDocument getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDocument }
     *     
     */
    public void setType(StructuredDocument value) {
        this.type = value;
    }

}
