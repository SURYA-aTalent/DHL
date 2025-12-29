
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStructuredDocumentById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStructuredDocumentById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="qualified"/>
 *         &lt;element name="showLocalizedValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="langCode" type="{http://ws.mrted.com/}langCode" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStructuredDocumentById", propOrder = {
    "documentId",
    "showLocalizedValues",
    "langCode"
})
public class GetStructuredDocumentById {

    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Long documentId;
    @XmlElement(namespace = "http://ws.mrted.com/")
    protected Boolean showLocalizedValues;
    @XmlElement(namespace = "http://ws.mrted.com/")
    @XmlSchemaType(name = "string")
    protected LangCode langCode;

    /**
     * Gets the value of the documentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentId() {
        return documentId;
    }

    /**
     * Sets the value of the documentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentId(Long value) {
        this.documentId = value;
    }

    /**
     * Gets the value of the showLocalizedValues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowLocalizedValues() {
        return showLocalizedValues;
    }

    /**
     * Sets the value of the showLocalizedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLocalizedValues(Boolean value) {
        this.showLocalizedValues = value;
    }

    /**
     * Gets the value of the langCode property.
     * 
     * @return
     *     possible object is
     *     {@link LangCode }
     *     
     */
    public LangCode getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangCode }
     *     
     */
    public void setLangCode(LangCode value) {
        this.langCode = value;
    }

}
