
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignedOptionDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignedOptionDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}optionDto">
 *       &lt;sequence>
 *         &lt;element name="assignedOptionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dependingQuestionIds">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assignedQuestionId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignedOptionDto", propOrder = {
    "assignedOptionId",
    "dependingQuestionIds"
})
public class AssignedOptionDto
    extends OptionDto
{

    protected Long assignedOptionId;
    @XmlElement(required = true)
    protected AssignedOptionDto.DependingQuestionIds dependingQuestionIds;

    /**
     * Gets the value of the assignedOptionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssignedOptionId() {
        return assignedOptionId;
    }

    /**
     * Sets the value of the assignedOptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssignedOptionId(Long value) {
        this.assignedOptionId = value;
    }

    /**
     * Gets the value of the dependingQuestionIds property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedOptionDto.DependingQuestionIds }
     *     
     */
    public AssignedOptionDto.DependingQuestionIds getDependingQuestionIds() {
        return dependingQuestionIds;
    }

    /**
     * Sets the value of the dependingQuestionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedOptionDto.DependingQuestionIds }
     *     
     */
    public void setDependingQuestionIds(AssignedOptionDto.DependingQuestionIds value) {
        this.dependingQuestionIds = value;
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
     *         &lt;element name="assignedQuestionId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
        "assignedQuestionId"
    })
    public static class DependingQuestionIds {

        @XmlElement(type = Long.class)
        protected List<Long> assignedQuestionId;

        /**
         * Gets the value of the assignedQuestionId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assignedQuestionId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssignedQuestionId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getAssignedQuestionId() {
            if (assignedQuestionId == null) {
                assignedQuestionId = new ArrayList<Long>();
            }
            return this.assignedQuestionId;
        }

    }

}
