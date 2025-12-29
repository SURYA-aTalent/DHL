
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for downloadSharedDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downloadSharedDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="templateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadSharedDocument", propOrder = {
    "templateId"
})
public class DownloadSharedDocument {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long templateId;

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemplateId(Long value) {
        this.templateId = value;
    }

}
