
package com.mrted.ws.lovhierarchy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genericLovForHierarchingDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genericLovForHierarchingDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="translation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labels" type="{http://ws.mrted.com/}lovLabelsDto" minOccurs="0"/>
 *         &lt;element name="dataValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="activators" type="{http://ws.mrted.com/}activators" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genericLovForHierarchingDto", propOrder = {
    "name",
    "translation",
    "labels",
    "dataValue",
    "activators"
})
public class GenericLovForHierarchingDto {

    protected String name;
    protected String translation;
    protected LovLabelsDto labels;
    protected BigDecimal dataValue;
    protected List<Activators> activators;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "order")
    protected Integer order;
    @XmlAttribute(name = "uuid", required = true)
    protected String uuid;

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
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslation(String value) {
        this.translation = value;
    }

    /**
     * Gets the value of the labels property.
     * 
     * @return
     *     possible object is
     *     {@link LovLabelsDto }
     *     
     */
    public LovLabelsDto getLabels() {
        return labels;
    }

    /**
     * Sets the value of the labels property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovLabelsDto }
     *     
     */
    public void setLabels(LovLabelsDto value) {
        this.labels = value;
    }

    /**
     * Gets the value of the dataValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDataValue() {
        return dataValue;
    }

    /**
     * Sets the value of the dataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDataValue(BigDecimal value) {
        this.dataValue = value;
    }

    /**
     * Gets the value of the activators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activators }
     * 
     * 
     */
    public List<Activators> getActivators() {
        if (activators == null) {
            activators = new ArrayList<Activators>();
        }
        return this.activators;
    }

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
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
