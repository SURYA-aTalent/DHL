
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignedQuestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignedQuestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasChildren" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="privateQuestion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="repeatable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="scoreMultiplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{http://ws.mrted.com/}questionType" minOccurs="0"/>
 *         &lt;element name="unlocalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="questionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="localizedValues" type="{http://ws.mrted.com/}localizedValues" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignedQuestion", propOrder = {
    "hasChildren",
    "id",
    "order",
    "privateQuestion",
    "repeatable",
    "scoreMultiplier",
    "type",
    "unlocalValue",
    "questionId",
    "localizedValues"
})
public class AssignedQuestion {

    protected boolean hasChildren;
    protected Long id;
    protected Long order;
    protected boolean privateQuestion;
    protected boolean repeatable;
    protected Long scoreMultiplier;
    @XmlSchemaType(name = "string")
    protected QuestionType type;
    protected String unlocalValue;
    protected Long questionId;
    protected LocalizedValues localizedValues;

    /**
     * Gets the value of the hasChildren property.
     * 
     */
    public boolean isHasChildren() {
        return hasChildren;
    }

    /**
     * Sets the value of the hasChildren property.
     * 
     */
    public void setHasChildren(boolean value) {
        this.hasChildren = value;
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
     * Gets the value of the privateQuestion property.
     * 
     */
    public boolean isPrivateQuestion() {
        return privateQuestion;
    }

    /**
     * Sets the value of the privateQuestion property.
     * 
     */
    public void setPrivateQuestion(boolean value) {
        this.privateQuestion = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionType }
     *     
     */
    public QuestionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionType }
     *     
     */
    public void setType(QuestionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the unlocalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnlocalValue() {
        return unlocalValue;
    }

    /**
     * Sets the value of the unlocalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnlocalValue(String value) {
        this.unlocalValue = value;
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

}
