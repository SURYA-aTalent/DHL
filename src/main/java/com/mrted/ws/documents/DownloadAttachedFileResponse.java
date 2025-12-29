
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadAttachedFileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadAttachedFileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.mrted.com/}attachedFile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadAttachedFileResponse", propOrder = {
    "attachedFile"
})
public class DownloadAttachedFileResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected AttachedFileDto attachedFile;

    /**
     * Gets the value of the attachedFile property.
     * 
     * @return
     *     possible object is
     *     {@link AttachedFileDto }
     *     
     */
    public AttachedFileDto getAttachedFile() {
        return attachedFile;
    }

    /**
     * Sets the value of the attachedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedFileDto }
     *     
     */
    public void setAttachedFile(AttachedFileDto value) {
        this.attachedFile = value;
    }

}
