
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignedQuestionDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignedQuestionDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}questionBaseDto">
 *       &lt;sequence>
 *         &lt;element name="assignedOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ws.mrted.com/}assignedOption" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assignedQuestionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="children" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ws.mrted.com/}assignedQuestion" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localizedValues" type="{http://ws.mrted.com/}localizedValues" minOccurs="0"/>
 *         &lt;element name="scoreMultiplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tempImagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignedQuestionDto", propOrder = {
    "assignedOptions",
    "assignedQuestionId",
    "children",
    "documentType",
    "localizedValues",
    "scoreMultiplier",
    "tempImagePath"
})
public class AssignedQuestionDto
    extends QuestionBaseDto
{

    protected AssignedQuestionDto.AssignedOptions assignedOptions;
    protected Long assignedQuestionId;
    protected AssignedQuestionDto.Children children;
    protected String documentType;
    protected LocalizedValues localizedValues;
    protected Long scoreMultiplier;
    protected String tempImagePath;

    /**
     * Gets the value of the assignedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedQuestionDto.AssignedOptions }
     *     
     */
    public AssignedQuestionDto.AssignedOptions getAssignedOptions() {
        return assignedOptions;
    }

    /**
     * Sets the value of the assignedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedQuestionDto.AssignedOptions }
     *     
     */
    public void setAssignedOptions(AssignedQuestionDto.AssignedOptions value) {
        this.assignedOptions = value;
    }

    /**
     * Gets the value of the assignedQuestionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssignedQuestionId() {
        return assignedQuestionId;
    }

    /**
     * Sets the value of the assignedQuestionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssignedQuestionId(Long value) {
        this.assignedQuestionId = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedQuestionDto.Children }
     *     
     */
    public AssignedQuestionDto.Children getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedQuestionDto.Children }
     *     
     */
    public void setChildren(AssignedQuestionDto.Children value) {
        this.children = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the localizedValues property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizedValues }
     *     
     */
    public LocalizedValues getLocalizedValues() {
        return localizedValues;
    }

    /**
     * Sets the value of the localizedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizedValues }
     *     
     */
    public void setLocalizedValues(LocalizedValues value) {
        this.localizedValues = value;
    }

    /**
     * Gets the value of the scoreMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScoreMultiplier() {
        return scoreMultiplier;
    }

    /**
     * Sets the value of the scoreMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScoreMultiplier(Long value) {
        this.scoreMultiplier = value;
    }

    /**
     * Gets the value of the tempImagePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempImagePath() {
        return tempImagePath;
    }

    /**
     * Sets the value of the tempImagePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempImagePath(String value) {
        this.tempImagePath = value;
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
     *         &lt;element ref="{http://ws.mrted.com/}assignedOption" maxOccurs="unbounded" minOccurs="0"/>
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
        "assignedOption"
    })
    public static class AssignedOptions {

        @XmlElement(namespace = "http://ws.mrted.com/", nillable = true)
        protected List<Object> assignedOption;

        /**
         * Gets the value of the assignedOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assignedOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssignedOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAssignedOption() {
            if (assignedOption == null) {
                assignedOption = new ArrayList<Object>();
            }
            return this.assignedOption;
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
     *         &lt;element ref="{http://ws.mrted.com/}assignedQuestion" maxOccurs="unbounded" minOccurs="0"/>
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
        "assignedQuestion"
    })
    public static class Children {

        @XmlElement(namespace = "http://ws.mrted.com/", nillable = true)
        protected List<Object> assignedQuestion;

        /**
         * Gets the value of the assignedQuestion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assignedQuestion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssignedQuestion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAssignedQuestion() {
            if (assignedQuestion == null) {
                assignedQuestion = new ArrayList<Object>();
            }
            return this.assignedQuestion;
        }

    }

}
