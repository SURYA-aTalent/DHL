
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simple-assigned-question complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simple-assigned-question">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}assigned-question">
 *       &lt;sequence>
 *         &lt;element name="answer" type="{http://ws.mrted.com/}answerDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simple-assigned-question", propOrder = {
    "answer"
})
public class SimpleAssignedQuestion
    extends AssignedQuestion
{

    protected AnswerDto answer;

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerDto }
     *     
     */
    public AnswerDto getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerDto }
     *     
     */
    public void setAnswer(AnswerDto value) {
        this.answer = value;
    }

}
