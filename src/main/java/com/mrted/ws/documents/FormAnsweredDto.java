
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formAnsweredDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formAnsweredDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="questionsAnswered" type="{http://ws.mrted.com/}questionsAnsweredDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formAnsweredDto", propOrder = {
    "questionsAnswered"
})
public class FormAnsweredDto {

    protected QuestionsAnsweredDto questionsAnswered;

    /**
     * Gets the value of the questionsAnswered property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionsAnsweredDto }
     *     
     */
    public QuestionsAnsweredDto getQuestionsAnswered() {
        return questionsAnswered;
    }

    /**
     * Sets the value of the questionsAnswered property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionsAnsweredDto }
     *     
     */
    public void setQuestionsAnswered(QuestionsAnsweredDto value) {
        this.questionsAnswered = value;
    }

}
