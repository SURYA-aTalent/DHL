
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for editTagByCandidateID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editTagByCandidateID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="candidateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="tagTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="newTagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="newTagTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editTagByCandidateID", propOrder = {
    "candidateId",
    "tagName",
    "tagTypeName",
    "newTagName",
    "newTagTypeName"
})
public class EditTagByCandidateID {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long candidateId;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String tagName;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String tagTypeName;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String newTagName;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected String newTagTypeName;

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
     * Gets the value of the tagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Sets the value of the tagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

    /**
     * Gets the value of the tagTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagTypeName() {
        return tagTypeName;
    }

    /**
     * Sets the value of the tagTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagTypeName(String value) {
        this.tagTypeName = value;
    }

    /**
     * Gets the value of the newTagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewTagName() {
        return newTagName;
    }

    /**
     * Sets the value of the newTagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewTagName(String value) {
        this.newTagName = value;
    }

    /**
     * Gets the value of the newTagTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewTagTypeName() {
        return newTagTypeName;
    }

    /**
     * Sets the value of the newTagTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewTagTypeName(String value) {
        this.newTagTypeName = value;
    }

}
