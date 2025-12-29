
package com.mrted.ws.candidate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for questionAnsweredDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="questionAnsweredDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="answerTextValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="children" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="childQuestionAnswered" type="{http://ws.mrted.com/}questionAnsweredDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="competencyOption" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lovValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="questionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="selectedAssignedOptionIds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assignedOptionId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "questionAnsweredDto", propOrder = {
    "answerTextValue",
    "children",
    "competencyOption",
    "index",
    "lovValue",
    "questionId",
    "selectedAssignedOptionIds"
})
public class QuestionAnsweredDto {

    protected String answerTextValue;
    protected QuestionAnsweredDto.Children children;
    protected Long competencyOption;
    protected Integer index;
    protected String lovValue;
    protected Long questionId;
    protected QuestionAnsweredDto.SelectedAssignedOptionIds selectedAssignedOptionIds;

    /**
     * Gets the value of the answerTextValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerTextValue() {
        return answerTextValue;
    }

    /**
     * Sets the value of the answerTextValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerTextValue(String value) {
        this.answerTextValue = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionAnsweredDto.Children }
     *     
     */
    public QuestionAnsweredDto.Children getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionAnsweredDto.Children }
     *     
     */
    public void setChildren(QuestionAnsweredDto.Children value) {
        this.children = value;
    }

    /**
     * Gets the value of the competencyOption property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompetencyOption() {
        return competencyOption;
    }

    /**
     * Sets the value of the competencyOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompetencyOption(Long value) {
        this.competencyOption = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Gets the value of the lovValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLovValue() {
        return lovValue;
    }

    /**
     * Sets the value of the lovValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLovValue(String value) {
        this.lovValue = value;
    }

    /**
     * Gets the value of the questionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * Sets the value of the questionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuestionId(Long value) {
        this.questionId = value;
    }

    /**
     * Gets the value of the selectedAssignedOptionIds property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionAnsweredDto.SelectedAssignedOptionIds }
     *     
     */
    public QuestionAnsweredDto.SelectedAssignedOptionIds getSelectedAssignedOptionIds() {
        return selectedAssignedOptionIds;
    }

    /**
     * Sets the value of the selectedAssignedOptionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionAnsweredDto.SelectedAssignedOptionIds }
     *     
     */
    public void setSelectedAssignedOptionIds(QuestionAnsweredDto.SelectedAssignedOptionIds value) {
        this.selectedAssignedOptionIds = value;
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
     *         &lt;element name="childQuestionAnswered" type="{http://ws.mrted.com/}questionAnsweredDto" maxOccurs="unbounded" minOccurs="0"/>
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
        "childQuestionAnswered"
    })
    public static class Children {

        protected List<QuestionAnsweredDto> childQuestionAnswered;

        /**
         * Gets the value of the childQuestionAnswered property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childQuestionAnswered property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildQuestionAnswered().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link QuestionAnsweredDto }
         * 
         * 
         */
        public List<QuestionAnsweredDto> getChildQuestionAnswered() {
            if (childQuestionAnswered == null) {
                childQuestionAnswered = new ArrayList<QuestionAnsweredDto>();
            }
            return this.childQuestionAnswered;
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
     *         &lt;element name="assignedOptionId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
        "assignedOptionId"
    })
    public static class SelectedAssignedOptionIds {

        @XmlElement(type = Long.class)
        protected List<Long> assignedOptionId;

        /**
         * Gets the value of the assignedOptionId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assignedOptionId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssignedOptionId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getAssignedOptionId() {
            if (assignedOptionId == null) {
                assignedOptionId = new ArrayList<Long>();
            }
            return this.assignedOptionId;
        }

    }

}
