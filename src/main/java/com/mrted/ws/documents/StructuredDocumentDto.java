
package com.mrted.ws.documents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for structuredDocumentDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="structuredDocumentDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="questions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element ref="{http://ws.mrted.com/}question"/>
 *                     &lt;element ref="{http://ws.mrted.com/}complex-question"/>
 *                   &lt;/choice>
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
@XmlType(name = "structuredDocumentDto", propOrder = {
    "id",
    "questions"
})
public class StructuredDocumentDto {

    protected Long id;
    protected StructuredDocumentDto.Questions questions;

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
     * Gets the value of the questions property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDocumentDto.Questions }
     *     
     */
    public StructuredDocumentDto.Questions getQuestions() {
        return questions;
    }

    /**
     * Sets the value of the questions property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDocumentDto.Questions }
     *     
     */
    public void setQuestions(StructuredDocumentDto.Questions value) {
        this.questions = value;
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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element ref="{http://ws.mrted.com/}question"/>
     *           &lt;element ref="{http://ws.mrted.com/}complex-question"/>
     *         &lt;/choice>
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
        "questionOrComplexQuestion"
    })
    public static class Questions {

        @XmlElements({
            @XmlElement(name = "question", namespace = "http://ws.mrted.com/", type = SimpleAssignedQuestion.class),
            @XmlElement(name = "complex-question", namespace = "http://ws.mrted.com/", type = ComplexAssignedQuestion.class)
        })
        protected List<AssignedQuestion2> questionOrComplexQuestion;

        /**
         * Gets the value of the questionOrComplexQuestion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the questionOrComplexQuestion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQuestionOrComplexQuestion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleAssignedQuestion }
         * {@link ComplexAssignedQuestion }
         * 
         * 
         */
        public List<AssignedQuestion2> getQuestionOrComplexQuestion() {
            if (questionOrComplexQuestion == null) {
                questionOrComplexQuestion = new ArrayList<AssignedQuestion2>();
            }
            return this.questionOrComplexQuestion;
        }

    }

}
