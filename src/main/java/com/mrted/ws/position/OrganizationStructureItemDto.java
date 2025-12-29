
package com.mrted.ws.position;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationStructureItemDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationStructureItemDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subDepartments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="department" type="{http://ws.mrted.com/}organizationStructureItemDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfJobs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parentDepartmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organizationStructureItemDto", propOrder = {
    "subDepartments",
    "departmentId",
    "level",
    "name",
    "numberOfJobs",
    "parentDepartmentId"
})
public class OrganizationStructureItemDto {

    protected OrganizationStructureItemDto.SubDepartments subDepartments;
    protected Long departmentId;
    protected Integer level;
    protected String name;
    protected Long numberOfJobs;
    protected Long parentDepartmentId;

    /**
     * Gets the value of the subDepartments property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationStructureItemDto.SubDepartments }
     *     
     */
    public OrganizationStructureItemDto.SubDepartments getSubDepartments() {
        return subDepartments;
    }

    /**
     * Sets the value of the subDepartments property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationStructureItemDto.SubDepartments }
     *     
     */
    public void setSubDepartments(OrganizationStructureItemDto.SubDepartments value) {
        this.subDepartments = value;
    }

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
     *     {@link Integer }
     *     
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevel(Integer value) {
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
     * Gets the value of the numberOfJobs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfJobs() {
        return numberOfJobs;
    }

    /**
     * Sets the value of the numberOfJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfJobs(Long value) {
        this.numberOfJobs = value;
    }

    /**
     * Gets the value of the parentDepartmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentDepartmentId() {
        return parentDepartmentId;
    }

    /**
     * Sets the value of the parentDepartmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentDepartmentId(Long value) {
        this.parentDepartmentId = value;
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
     *         &lt;element name="department" type="{http://ws.mrted.com/}organizationStructureItemDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "department"
    })
    public static class SubDepartments {

        protected List<OrganizationStructureItemDto> department;

        /**
         * Gets the value of the department property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the department property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDepartment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationStructureItemDto }
         * 
         * 
         */
        public List<OrganizationStructureItemDto> getDepartment() {
            if (department == null) {
                department = new ArrayList<OrganizationStructureItemDto>();
            }
            return this.department;
        }

    }

}
