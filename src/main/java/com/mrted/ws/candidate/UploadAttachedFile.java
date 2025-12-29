
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadAttachedFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadAttachedFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ws.mrted.com/}attachedFile" minOccurs="0"/>
 *         &lt;element name="candidateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="applicationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadAttachedFile", propOrder = {
    "attachedFile",
    "candidateId",
    "applicationId"
})
public class UploadAttachedFile {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected AttachedFileDto attachedFile;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long candidateId;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long applicationId;

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

    /**
     * Gets the value of the candidateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCandidateId() {
        return candidateId;
    }

    /**
     * Sets the value of the candidateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCandidateId(Long value) {
        this.candidateId = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setApplicationId(Long value) {
        this.applicationId = value;
    }

}
