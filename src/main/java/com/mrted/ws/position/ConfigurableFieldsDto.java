
package com.mrted.ws.position;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configurableFieldsDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configurableFieldsDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeFormFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="freeFormField" type="{http://ws.mrted.com/}freeFormFieldDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lovs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lov" type="{http://ws.mrted.com/}confLovDto" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "configurableFieldsDto", propOrder = {
    "freeFormFields",
    "lovs"
})
public class ConfigurableFieldsDto {

    protected ConfigurableFieldsDto.FreeFormFields freeFormFields;
    protected ConfigurableFieldsDto.Lovs lovs;

    /**
     * Gets the value of the freeFormFields property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurableFieldsDto.FreeFormFields }
     *     
     */
    public ConfigurableFieldsDto.FreeFormFields getFreeFormFields() {
        return freeFormFields;
    }

    /**
     * Sets the value of the freeFormFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurableFieldsDto.FreeFormFields }
     *     
     */
    public void setFreeFormFields(ConfigurableFieldsDto.FreeFormFields value) {
        this.freeFormFields = value;
    }

    /**
     * Gets the value of the lovs property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurableFieldsDto.Lovs }
     *     
     */
    public ConfigurableFieldsDto.Lovs getLovs() {
        return lovs;
    }

    /**
     * Sets the value of the lovs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurableFieldsDto.Lovs }
     *     
     */
    public void setLovs(ConfigurableFieldsDto.Lovs value) {
        this.lovs = value;
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
     *         &lt;element name="freeFormField" type="{http://ws.mrted.com/}freeFormFieldDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "freeFormField"
    })
    public static class FreeFormFields {

        protected List<FreeFormFieldDto> freeFormField;

        /**
         * Gets the value of the freeFormField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the freeFormField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFreeFormField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FreeFormFieldDto }
         * 
         * 
         */
        public List<FreeFormFieldDto> getFreeFormField() {
            if (freeFormField == null) {
                freeFormField = new ArrayList<FreeFormFieldDto>();
            }
            return this.freeFormField;
        }

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
     *         &lt;element name="lov" type="{http://ws.mrted.com/}confLovDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "lov"
    })
    public static class Lovs {

        protected List<ConfLovDto> lov;

        /**
         * Gets the value of the lov property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lov property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLov().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConfLovDto }
         * 
         * 
         */
        public List<ConfLovDto> getLov() {
            if (lov == null) {
                lov = new ArrayList<ConfLovDto>();
            }
            return this.lov;
        }

    }

}
