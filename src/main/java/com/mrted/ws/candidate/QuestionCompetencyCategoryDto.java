
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for questionCompetencyCategoryDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="questionCompetencyCategoryDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="options" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="option" type="{http://ws.mrted.com/}questionCompetencyCategoryDto" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "questionCompetencyCategoryDto", propOrder = {
    "id",
    "name",
    "nameLabel",
    "description",
    "descriptionLabel",
    "options"
})
public class QuestionCompetencyCategoryDto {

    protected Long id;
    protected String name;
    protected String nameLabel;
    protected String description;
    protected String descriptionLabel;
    protected QuestionCompetencyCategoryDto.Options options;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLabel() {
        return nameLabel;
    }

    /**
     * Sets the value of the nameLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLabel(String value) {
        this.nameLabel = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionLabel() {
        return descriptionLabel;
    }

    /**
     * Sets the value of the descriptionLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionLabel(String value) {
        this.descriptionLabel = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionCompetencyCategoryDto.Options }
     *     
     */
    public QuestionCompetencyCategoryDto.Options getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionCompetencyCategoryDto.Options }
     *     
     */
    public void setOptions(QuestionCompetencyCategoryDto.Options value) {
        this.options = value;
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
     *         &lt;element name="option" type="{http://ws.mrted.com/}questionCompetencyCategoryDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "option"
    })
    public static class Options {

        protected List<QuestionCompetencyCategoryDto> option;

        /**
         * Gets the value of the option property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the option property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QuestionCompetencyCategoryDto }
         * 
         * 
         */
        public List<QuestionCompetencyCategoryDto> getOption() {
            if (option == null) {
                option = new ArrayList<QuestionCompetencyCategoryDto>();
            }
            return this.option;
        }

    }

}
