
package com.mrted.ws.lovhierarchy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lovHierarchyMemberDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lovHierarchyMemberDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dep" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="translation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labels" type="{http://ws.mrted.com/}lovLabelsDto" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://ws.mrted.com/}dataType" minOccurs="0"/>
 *         &lt;element name="searchable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hparents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hlov" type="{http://ws.mrted.com/}lovHierarchyMemberDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vlovs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vlov" type="{http://ws.mrted.com/}genericLovForHierarchingDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="hiermemberid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="uuid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lovHierarchyMemberDto", propOrder = {
    "name",
    "departments",
    "translation",
    "labels",
    "dataType",
    "searchable",
    "hparents",
    "vlovs"
})
public class LovHierarchyMemberDto {

    protected String name;
    protected LovHierarchyMemberDto.Departments departments;
    protected String translation;
    protected LovLabelsDto labels;
    @XmlSchemaType(name = "string")
    protected DataType dataType;
    protected boolean searchable;
    protected LovHierarchyMemberDto.Hparents hparents;
    protected LovHierarchyMemberDto.Vlovs vlovs;
    @XmlAttribute(name = "delete")
    protected Boolean delete;
    @XmlAttribute(name = "hiermemberid")
    protected Long hiermemberid;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "order")
    protected Long order;
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
     * Gets the value of the departments property.
     * 
     * @return
     *     possible object is
     *     {@link LovHierarchyMemberDto.Departments }
     *     
     */
    public LovHierarchyMemberDto.Departments getDepartments() {
        return departments;
    }

    /**
     * Sets the value of the departments property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovHierarchyMemberDto.Departments }
     *     
     */
    public void setDepartments(LovHierarchyMemberDto.Departments value) {
        this.departments = value;
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
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataType(DataType value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the searchable property.
     * 
     */
    public boolean isSearchable() {
        return searchable;
    }

    /**
     * Sets the value of the searchable property.
     * 
     */
    public void setSearchable(boolean value) {
        this.searchable = value;
    }

    /**
     * Gets the value of the hparents property.
     * 
     * @return
     *     possible object is
     *     {@link LovHierarchyMemberDto.Hparents }
     *     
     */
    public LovHierarchyMemberDto.Hparents getHparents() {
        return hparents;
    }

    /**
     * Sets the value of the hparents property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovHierarchyMemberDto.Hparents }
     *     
     */
    public void setHparents(LovHierarchyMemberDto.Hparents value) {
        this.hparents = value;
    }

    /**
     * Gets the value of the vlovs property.
     * 
     * @return
     *     possible object is
     *     {@link LovHierarchyMemberDto.Vlovs }
     *     
     */
    public LovHierarchyMemberDto.Vlovs getVlovs() {
        return vlovs;
    }

    /**
     * Sets the value of the vlovs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LovHierarchyMemberDto.Vlovs }
     *     
     */
    public void setVlovs(LovHierarchyMemberDto.Vlovs value) {
        this.vlovs = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

    /**
     * Gets the value of the hiermemberid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHiermemberid() {
        return hiermemberid;
    }

    /**
     * Sets the value of the hiermemberid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHiermemberid(Long value) {
        this.hiermemberid = value;
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
     *     {@link Long }
     *     
     */
    public Long getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrder(Long value) {
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
     *         &lt;element name="dep" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
        "dep"
    })
    public static class Departments {

        @XmlElement(type = Long.class)
        protected List<Long> dep;

        /**
         * Gets the value of the dep property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dep property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDep().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getDep() {
            if (dep == null) {
                dep = new ArrayList<Long>();
            }
            return this.dep;
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
     *         &lt;element name="hlov" type="{http://ws.mrted.com/}lovHierarchyMemberDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "hlov"
    })
    public static class Hparents {

        protected List<LovHierarchyMemberDto> hlov;

        /**
         * Gets the value of the hlov property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hlov property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHlov().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LovHierarchyMemberDto }
         * 
         * 
         */
        public List<LovHierarchyMemberDto> getHlov() {
            if (hlov == null) {
                hlov = new ArrayList<LovHierarchyMemberDto>();
            }
            return this.hlov;
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
     *         &lt;element name="vlov" type="{http://ws.mrted.com/}genericLovForHierarchingDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "vlov"
    })
    public static class Vlovs {

        protected List<GenericLovForHierarchingDto> vlov;

        /**
         * Gets the value of the vlov property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vlov property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVlov().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GenericLovForHierarchingDto }
         * 
         * 
         */
        public List<GenericLovForHierarchingDto> getVlov() {
            if (vlov == null) {
                vlov = new ArrayList<GenericLovForHierarchingDto>();
            }
            return this.vlov;
        }

    }

}
