
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBasicStructuredDocumentDtoByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBasicStructuredDocumentDtoByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="structuredDocumentDto" type="{http://ws.mrted.com/}structuredDocumentDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBasicStructuredDocumentDtoByIdResponse", propOrder = {
    "structuredDocumentDto"
})
public class GetBasicStructuredDocumentDtoByIdResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected StructuredDocumentDto structuredDocumentDto;

    /**
     * Gets the value of the structuredDocumentDto property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDocumentDto }
     *     
     */
    public StructuredDocumentDto getStructuredDocumentDto() {
        return structuredDocumentDto;
    }

    /**
     * Sets the value of the structuredDocumentDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDocumentDto }
     *     
     */
    public void setStructuredDocumentDto(StructuredDocumentDto value) {
        this.structuredDocumentDto = value;
    }

}
