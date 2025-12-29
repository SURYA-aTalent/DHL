
package com.mrted.ws.documents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for complex-assigned-question complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complex-assigned-question">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}assigned-question">
 *       &lt;sequence>
 *         &lt;element name="children" minOccurs="0">
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complex-assigned-question", propOrder = {
    "children"
})
public class ComplexAssignedQuestion
    extends AssignedQuestion2
{

    protected ComplexAssignedQuestion.Children children;

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexAssignedQuestion.Children }
     *     
     */
    public ComplexAssignedQuestion.Children getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexAssignedQuestion.Children }
     *     
     */
    public void setChildren(ComplexAssignedQuestion.Children value) {
        this.children = value;
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
    public static class Children {

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
