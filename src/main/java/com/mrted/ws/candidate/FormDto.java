
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="formId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masterLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formCategory" type="{http://ws.mrted.com/}formCategoryDto" minOccurs="0"/>
 *         &lt;element name="formContexts" type="{http://ws.mrted.com/}formContextDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="competencyCategories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="competencyCategory" type="{http://ws.mrted.com/}questionCompetencyCategoryDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assignedQuestions" minOccurs="0">
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
 *         &lt;element name="lovs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://ws.mrted.com/}listOfValues" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="answerableManyTimes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="translatedLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="archive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="formDivider" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hasAccessToViewForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="creationUser" type="{http://ws.mrted.com/}userDto" minOccurs="0"/>
 *         &lt;element name="updationuser" type="{http://ws.mrted.com/}userDto" minOccurs="0"/>
 *         &lt;element name="dataPrivacy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formDto", propOrder = {
    "formId",
    "name",
    "description",
    "comment",
    "masterLanguage",
    "displayType",
    "formCategory",
    "formContexts",
    "competencyCategories",
    "assignedQuestions",
    "lovs",
    "departmentId",
    "answerableManyTimes",
    "translatedLanguage",
    "archive",
    "formDivider",
    "hasAccessToViewForm",
    "creationUser",
    "updationuser",
    "dataPrivacy"
})
public class FormDto {

    protected Long formId;
    protected String name;
    protected String description;
    protected String comment;
    protected String masterLanguage;
    protected String displayType;
    protected FormCategoryDto formCategory;
    protected List<FormContextDto> formContexts;
    protected FormDto.CompetencyCategories competencyCategories;
    protected FormDto.AssignedQuestions assignedQuestions;
    protected FormDto.Lovs lovs;
    protected Long departmentId;
    protected Boolean answerableManyTimes;
    protected String translatedLanguage;
    protected Boolean archive;
    protected Long formDivider;
    protected Boolean hasAccessToViewForm;
    protected UserDto creationUser;
    protected UserDto updationuser;
    protected String dataPrivacy;

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFormId(Long value) {
        this.formId = value;
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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the masterLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterLanguage() {
        return masterLanguage;
    }

    /**
     * Sets the value of the masterLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterLanguage(String value) {
        this.masterLanguage = value;
    }

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayType(String value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the formCategory property.
     * 
     * @return
     *     possible object is
     *     {@link FormCategoryDto }
     *     
     */
    public FormCategoryDto getFormCategory() {
        return formCategory;
    }

    /**
     * Sets the value of the formCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormCategoryDto }
     *     
     */
    public void setFormCategory(FormCategoryDto value) {
        this.formCategory = value;
    }

    /**
     * Gets the value of the formContexts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formContexts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormContexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormContextDto }
     * 
     * 
     */
    public List<FormContextDto> getFormContexts() {
        if (formContexts == null) {
            formContexts = new ArrayList<FormContextDto>();
        }
        return this.formContexts;
    }

    /**
     * Gets the value of the competencyCategories property.
     * 
     * @return
     *     possible object is
     *     {@link FormDto.CompetencyCategories }
     *     
     */
    public FormDto.CompetencyCategories getCompetencyCategories() {
        return competencyCategories;
    }

    /**
     * Sets the value of the competencyCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormDto.CompetencyCategories }
     *     
     */
    public void setCompetencyCategories(FormDto.CompetencyCategories value) {
        this.competencyCategories = value;
    }

    /**
     * Gets the value of the assignedQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link FormDto.AssignedQuestions }
     *     
     */
    public FormDto.AssignedQuestions getAssignedQuestions() {
        return assignedQuestions;
    }

    /**
     * Sets the value of the assignedQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormDto.AssignedQuestions }
     *     
     */
    public void setAssignedQuestions(FormDto.AssignedQuestions value) {
        this.assignedQuestions = value;
    }

    /**
     * Gets the value of the lovs property.
     * 
     * @return
     *     possible object is
     *     {@link FormDto.Lovs }
     *     
     */
    public FormDto.Lovs getLovs() {
        return lovs;
    }

    /**
     * Sets the value of the lovs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormDto.Lovs }
     *     
     */
    public void setLovs(FormDto.Lovs value) {
        this.lovs = value;
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
     * Gets the value of the answerableManyTimes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnswerableManyTimes() {
        return answerableManyTimes;
    }

    /**
     * Sets the value of the answerableManyTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswerableManyTimes(Boolean value) {
        this.answerableManyTimes = value;
    }

    /**
     * Gets the value of the translatedLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslatedLanguage() {
        return translatedLanguage;
    }

    /**
     * Sets the value of the translatedLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslatedLanguage(String value) {
        this.translatedLanguage = value;
    }

    /**
     * Gets the value of the archive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArchive() {
        return archive;
    }

    /**
     * Sets the value of the archive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchive(Boolean value) {
        this.archive = value;
    }

    /**
     * Gets the value of the formDivider property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFormDivider() {
        return formDivider;
    }

    /**
     * Sets the value of the formDivider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFormDivider(Long value) {
        this.formDivider = value;
    }

    /**
     * Gets the value of the hasAccessToViewForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAccessToViewForm() {
        return hasAccessToViewForm;
    }

    /**
     * Sets the value of the hasAccessToViewForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAccessToViewForm(Boolean value) {
        this.hasAccessToViewForm = value;
    }

    /**
     * Gets the value of the creationUser property.
     * 
     * @return
     *     possible object is
     *     {@link UserDto }
     *     
     */
    public UserDto getCreationUser() {
        return creationUser;
    }

    /**
     * Sets the value of the creationUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDto }
     *     
     */
    public void setCreationUser(UserDto value) {
        this.creationUser = value;
    }

    /**
     * Gets the value of the updationuser property.
     * 
     * @return
     *     possible object is
     *     {@link UserDto }
     *     
     */
    public UserDto getUpdationuser() {
        return updationuser;
    }

    /**
     * Sets the value of the updationuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDto }
     *     
     */
    public void setUpdationuser(UserDto value) {
        this.updationuser = value;
    }

    /**
     * Gets the value of the dataPrivacy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPrivacy() {
        return dataPrivacy;
    }

    /**
     * Sets the value of the dataPrivacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPrivacy(String value) {
        this.dataPrivacy = value;
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
    public static class AssignedQuestions {

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
     *         &lt;element name="competencyCategory" type="{http://ws.mrted.com/}questionCompetencyCategoryDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "competencyCategory"
    })
    public static class CompetencyCategories {

        protected List<QuestionCompetencyCategoryDto> competencyCategory;

        /**
         * Gets the value of the competencyCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the competencyCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompetencyCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QuestionCompetencyCategoryDto }
         * 
         * 
         */
        public List<QuestionCompetencyCategoryDto> getCompetencyCategory() {
            if (competencyCategory == null) {
                competencyCategory = new ArrayList<QuestionCompetencyCategoryDto>();
            }
            return this.competencyCategory;
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
     *         &lt;element ref="{http://ws.mrted.com/}listOfValues" maxOccurs="unbounded" minOccurs="0"/>
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
        "listOfValues"
    })
    public static class Lovs {

        @XmlElement(namespace = "http://ws.mrted.com/")
        protected List<ListOfValuesDto> listOfValues;

        /**
         * Gets the value of the listOfValues property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listOfValues property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListOfValues().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListOfValuesDto }
         * 
         * 
         */
        public List<ListOfValuesDto> getListOfValues() {
            if (listOfValues == null) {
                listOfValues = new ArrayList<ListOfValuesDto>();
            }
            return this.listOfValues;
        }

    }

}
