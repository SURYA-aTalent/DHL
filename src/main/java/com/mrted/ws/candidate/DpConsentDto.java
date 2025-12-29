
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dpConsentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dpConsentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="introductionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "dpConsentDto", propOrder = {
    "id",
    "type",
    "fullText",
    "introductionText",
    "department"
})
public class DpConsentDto {

    protected Long id;
    protected String type;
    protected String fullText;
    protected String introductionText;
    protected DpConsentDto.Department department;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the fullText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullText() {
        return fullText;
    }

    /**
     * Sets the value of the fullText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullText(String value) {
        this.fullText = value;
    }

    /**
     * Gets the value of the introductionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntroductionText() {
        return introductionText;
    }

    /**
     * Sets the value of the introductionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntroductionText(String value) {
        this.introductionText = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link DpConsentDto.Department }
     *     
     */
    public DpConsentDto.Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link DpConsentDto.Department }
     *     
     */
    public void setDepartment(DpConsentDto.Department value) {
        this.department = value;
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
     *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
        "departmentId",
        "level",
        "name",
        "parentId"
    })
    public static class Department {

        protected Long departmentId;
        protected Long level;
        protected String name;
        protected Long parentId;

        /**
         * Gets the value of the departmentId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getDepartmentId() {
            return departmentId;
        }

        /**
         * Sets the value of the departmentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setDepartmentId(Long value) {
            this.departmentId = value;
        }

        /**
         * Gets the value of the level property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getLevel() {
            return level;
        }

        /**
         * Sets the value of the level property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setLevel(Long value) {
            this.level = value;
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
         * Gets the value of the parentId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getParentId() {
            return parentId;
        }

        /**
         * Sets the value of the parentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setParentId(Long value) {
            this.parentId = value;
        }

    }

}
