
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for questionBaseDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="questionBaseDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="answerValidation" type="{http://ws.mrted.com/}answerValidationDto" minOccurs="0"/>
 *         &lt;element name="competencyCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localizedLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lovName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="questionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="questionLayout" type="{http://ws.mrted.com/}questionLayoutDto" minOccurs="0"/>
 *         &lt;element name="repeatable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "questionBaseDto", propOrder = {
    "answerValidation",
    "competencyCategoryName",
    "label",
    "localizedLabel",
    "lovName",
    "order",
    "questionId",
    "questionLayout",
    "repeatable",
    "type"
})
@XmlSeeAlso({
    AssignedQuestionDto.class
})
public class QuestionBaseDto {

    protected AnswerValidationDto answerValidation;
    protected String competencyCategoryName;
    protected String label;
    protected String localizedLabel;
    protected String lovName;
    protected Long order;
    protected Long questionId;
    protected QuestionLayoutDto questionLayout;
    protected boolean repeatable;
    protected String type;

    /**
     * Gets the value of the answerValidation property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerValidationDto }
     *     
     */
    public AnswerValidationDto getAnswerValidation() {
        return answerValidation;
    }

    /**
     * Sets the value of the answerValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerValidationDto }
     *     
     */
    public void setAnswerValidation(AnswerValidationDto value) {
        this.answerValidation = value;
    }

    /**
     * Gets the value of the competencyCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetencyCategoryName() {
        return competencyCategoryName;
    }

    /**
     * Sets the value of the competencyCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetencyCategoryName(String value) {
        this.competencyCategoryName = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the localizedLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizedLabel() {
        return localizedLabel;
    }

    /**
     * Sets the value of the localizedLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizedLabel(String value) {
        this.localizedLabel = value;
    }

    /**
     * Gets the value of the lovName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLovName() {
        return lovName;
    }

    /**
     * Sets the value of the lovName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLovName(String value) {
        this.lovName = value;
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
     * Gets the value of the questionLayout property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionLayoutDto }
     *     
     */
    public QuestionLayoutDto getQuestionLayout() {
        return questionLayout;
    }

    /**
     * Sets the value of the questionLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionLayoutDto }
     *     
     */
    public void setQuestionLayout(QuestionLayoutDto value) {
        this.questionLayout = value;
    }

    /**
     * Gets the value of the repeatable property.
     * 
     */
    public boolean isRepeatable() {
        return repeatable;
    }

    /**
     * Sets the value of the repeatable property.
     * 
     */
    public void setRepeatable(boolean value) {
        this.repeatable = value;
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

}
