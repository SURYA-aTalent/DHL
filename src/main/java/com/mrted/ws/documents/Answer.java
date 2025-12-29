
package com.mrted.ws.documents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for answer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="answer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="assignedQuestion" type="{http://ws.mrted.com/}assignedQuestion" minOccurs="0"/>
 *         &lt;element name="children" type="{http://ws.mrted.com/}answer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creatorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAnswer" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="freeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCandidateAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="selectedOptions" type="{http://ws.mrted.com/}selectedOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "answer", propOrder = {
    "assignedQuestion",
    "children",
    "creationDate",
    "creatorType",
    "dateAnswer",
    "freeText",
    "isCandidateAnswer",
    "order",
    "selectedOptions",
    "id"
})
public class Answer
    extends BaseEntity
{

    protected AssignedQuestion assignedQuestion;
    @XmlElement(nillable = true)
    protected List<Answer> children;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String creatorType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAnswer;
    protected String freeText;
    protected boolean isCandidateAnswer;
    protected Long order;
    protected List<SelectedOption> selectedOptions;
    protected Long id;

    /**
     * Gets the value of the assignedQuestion property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedQuestion }
     *     
     */
    public AssignedQuestion getAssignedQuestion() {
        return assignedQuestion;
    }

    /**
     * Sets the value of the assignedQuestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedQuestion }
     *     
     */
    public void setAssignedQuestion(AssignedQuestion value) {
        this.assignedQuestion = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Answer }
     * 
     * 
     */
    public List<Answer> getChildren() {
        if (children == null) {
            children = new ArrayList<Answer>();
        }
        return this.children;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the creatorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorType() {
        return creatorType;
    }

    /**
     * Sets the value of the creatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorType(String value) {
        this.creatorType = value;
    }

    /**
     * Gets the value of the dateAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAnswer() {
        return dateAnswer;
    }

    /**
     * Sets the value of the dateAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAnswer(XMLGregorianCalendar value) {
        this.dateAnswer = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * Gets the value of the isCandidateAnswer property.
     * 
     */
    public boolean isIsCandidateAnswer() {
        return isCandidateAnswer;
    }

    /**
     * Sets the value of the isCandidateAnswer property.
     * 
     */
    public void setIsCandidateAnswer(boolean value) {
        this.isCandidateAnswer = value;
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
     * Gets the value of the selectedOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedOption }
     * 
     * 
     */
    public List<SelectedOption> getSelectedOptions() {
        if (selectedOptions == null) {
            selectedOptions = new ArrayList<SelectedOption>();
        }
        return this.selectedOptions;
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

}
