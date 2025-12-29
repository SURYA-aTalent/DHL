
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCurrentBoCpTemplateByTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCurrentBoCpTemplateByTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://ws.mrted.com/}formDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentBoCpTemplateByTypeResponse", propOrder = {
    "type"
})
public class GetCurrentBoCpTemplateByTypeResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected FormDto type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FormDto }
     *     
     */
    public FormDto getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormDto }
     *     
     */
    public void setType(FormDto value) {
        this.type = value;
    }

}
