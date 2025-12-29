
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfValuesDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfValuesDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lovName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="values" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ws.mrted.com/}lovValue" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "listOfValuesDto", propOrder = {
    "lovName",
    "values"
})
public class ListOfValuesDto {

    protected String lovName;
    protected ListOfValuesDto.Values values;

    /**
     * Gets the value of the lovName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLovName() {
        return lovName;
    }

    /**
     * Sets the value of the lovName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLovName(String value) {
        this.lovName = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfValuesDto.Values }
     *     
     */
    public ListOfValuesDto.Values getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfValuesDto.Values }
     *     
     */
    public void setValues(ListOfValuesDto.Values value) {
        this.values = value;
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
     *         &lt;element ref="{http://ws.mrted.com/}lovValue" maxOccurs="unbounded" minOccurs="0"/>
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
        "lovValue"
    })
    public static class Values {

        @XmlElement(namespace = "http://ws.mrted.com/", nillable = true)
        protected List<Object> lovValue;

        /**
         * Gets the value of the lovValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lovValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLovValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getLovValue() {
            if (lovValue == null) {
                lovValue = new ArrayList<Object>();
            }
            return this.lovValue;
        }

    }

}
