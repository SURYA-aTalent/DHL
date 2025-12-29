
package com.mrted.ws.configfields;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeUserDataEntryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeUserDataEntryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://ws.mrted.com/}operationResultDto" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeUserDataEntryResponse", propOrder = {
    "result"
})
public class RemoveUserDataEntryResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected OperationResultDto result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link OperationResultDto }
     *     
     */
    public OperationResultDto getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationResultDto }
     *     
     */
    public void setResult(OperationResultDto value) {
        this.result = value;
    }

}
