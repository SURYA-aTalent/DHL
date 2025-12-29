
package com.mrted.ws.position;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for videosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="videosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="key" type="{http://ws.mrted.com/}videoPosition" minOccurs="0"/>
 *                   &lt;element name="value" type="{http://ws.mrted.com/}assignedVideoDto" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "videosType", propOrder = {
    "entry"
})
public class VideosType {

    protected List<VideosType.Entry> entry;

    /**
     * Gets the value of the entry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideosType.Entry }
     * 
     * 
     */
    public List<VideosType.Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<VideosType.Entry>();
        }
        return this.entry;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="key" type="{http://ws.mrted.com/}videoPosition" minOccurs="0"/>
     *         &lt;element name="value" type="{http://ws.mrted.com/}assignedVideoDto" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class Entry {

        @XmlSchemaType(name = "string")
        protected VideoPosition key;
        protected AssignedVideoDto value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link VideoPosition }
         *     
         */
        public VideoPosition getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link VideoPosition }
         *     
         */
        public void setKey(VideoPosition value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link AssignedVideoDto }
         *     
         */
        public AssignedVideoDto getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link AssignedVideoDto }
         *     
         */
        public void setValue(AssignedVideoDto value) {
            this.value = value;
        }

    }

}
