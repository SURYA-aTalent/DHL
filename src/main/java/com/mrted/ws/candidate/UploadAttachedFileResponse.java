
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadAttachedFileResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadAttachedFileResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachedFileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadAttachedFileResponse", propOrder = {
    "attachedFileId"
})
public class UploadAttachedFileResponse {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long attachedFileId;

    /**
     * Gets the value of the attachedFileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttachedFileId() {
        return attachedFileId;
    }

    /**
     * Sets the value of the attachedFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttachedFileId(Long value) {
        this.attachedFileId = value;
    }

}
