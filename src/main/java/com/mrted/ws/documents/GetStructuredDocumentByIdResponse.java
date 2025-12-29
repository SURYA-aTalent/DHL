
package com.mrted.ws.documents;

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
 *         &lt;element ref="{http://ws.mrted.com/}structuredDocument" minOccurs="0"/>
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
    "structuredDocument"
})
public class GetStructuredDocumentByIdResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected StructuredDocument structuredDocument;

    /**
     * Gets the value of the structuredDocument property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDocument }
     *     
     */
    public StructuredDocument getStructuredDocument() {
        return structuredDocument;
    }

    /**
     * Sets the value of the structuredDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDocument }
     *     
     */
    public void setStructuredDocument(StructuredDocument value) {
        this.structuredDocument = value;
    }

}
