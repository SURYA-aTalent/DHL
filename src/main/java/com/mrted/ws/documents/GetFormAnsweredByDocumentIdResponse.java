
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFormAnsweredByDocumentIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFormAnsweredByDocumentIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formAnsweredDto" type="{http://ws.mrted.com/}formAnsweredDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFormAnsweredByDocumentIdResponse", propOrder = {
    "formAnsweredDto"
})
public class GetFormAnsweredByDocumentIdResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected FormAnsweredDto formAnsweredDto;

    /**
     * Gets the value of the formAnsweredDto property.
     * 
     * @return
     *     possible object is
     *     {@link FormAnsweredDto }
     *     
     */
    public FormAnsweredDto getFormAnsweredDto() {
        return formAnsweredDto;
    }

    /**
     * Sets the value of the formAnsweredDto property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormAnsweredDto }
     *     
     */
    public void setFormAnsweredDto(FormAnsweredDto value) {
        this.formAnsweredDto = value;
    }

}
