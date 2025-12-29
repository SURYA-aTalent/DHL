
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for questionLayoutDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="questionLayoutDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="answerInline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="answerSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cssLayout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fontColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fontFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fontSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fontStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fontWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasTitle" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="imageHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="imageWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pleaseSelect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="presentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="questionInline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textDecoration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alphasort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasBorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "questionLayoutDto", propOrder = {
    "answerInline",
    "answerSize",
    "cssLayout",
    "description",
    "fontColor",
    "fontFamily",
    "fontSize",
    "fontStyle",
    "fontWeight",
    "hasTitle",
    "imageHeight",
    "imageWidth",
    "indentation",
    "pleaseSelect",
    "presentation",
    "questionInline",
    "textDecoration",
    "alphasort",
    "hasBorder"
})
public class QuestionLayoutDto {

    protected String answerInline;
    protected Integer answerSize;
    protected String cssLayout;
    protected String description;
    protected String fontColor;
    protected String fontFamily;
    protected String fontSize;
    protected String fontStyle;
    protected String fontWeight;
    protected boolean hasTitle;
    protected Integer imageHeight;
    protected Integer imageWidth;
    protected String indentation;
    protected boolean pleaseSelect;
    protected String presentation;
    protected String questionInline;
    protected String textDecoration;
    protected String alphasort;
    protected Boolean hasBorder;

    /**
     * Gets the value of the answerInline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerInline() {
        return answerInline;
    }

    /**
     * Sets the value of the answerInline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerInline(String value) {
        this.answerInline = value;
    }

    /**
     * Gets the value of the answerSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnswerSize() {
        return answerSize;
    }

    /**
     * Sets the value of the answerSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnswerSize(Integer value) {
        this.answerSize = value;
    }

    /**
     * Gets the value of the cssLayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCssLayout() {
        return cssLayout;
    }

    /**
     * Sets the value of the cssLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCssLayout(String value) {
        this.cssLayout = value;
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
     * Gets the value of the fontColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontColor() {
        return fontColor;
    }

    /**
     * Sets the value of the fontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontColor(String value) {
        this.fontColor = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontStyle(String value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the fontWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontWeight() {
        return fontWeight;
    }

    /**
     * Sets the value of the fontWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontWeight(String value) {
        this.fontWeight = value;
    }

    /**
     * Gets the value of the hasTitle property.
     * 
     */
    public boolean isHasTitle() {
        return hasTitle;
    }

    /**
     * Sets the value of the hasTitle property.
     * 
     */
    public void setHasTitle(boolean value) {
        this.hasTitle = value;
    }

    /**
     * Gets the value of the imageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageHeight() {
        return imageHeight;
    }

    /**
     * Sets the value of the imageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageHeight(Integer value) {
        this.imageHeight = value;
    }

    /**
     * Gets the value of the imageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageWidth() {
        return imageWidth;
    }

    /**
     * Sets the value of the imageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageWidth(Integer value) {
        this.imageWidth = value;
    }

    /**
     * Gets the value of the indentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndentation() {
        return indentation;
    }

    /**
     * Sets the value of the indentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndentation(String value) {
        this.indentation = value;
    }

    /**
     * Gets the value of the pleaseSelect property.
     * 
     */
    public boolean isPleaseSelect() {
        return pleaseSelect;
    }

    /**
     * Sets the value of the pleaseSelect property.
     * 
     */
    public void setPleaseSelect(boolean value) {
        this.pleaseSelect = value;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentation() {
        return presentation;
    }

    /**
     * Sets the value of the presentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentation(String value) {
        this.presentation = value;
    }

    /**
     * Gets the value of the questionInline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionInline() {
        return questionInline;
    }

    /**
     * Sets the value of the questionInline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionInline(String value) {
        this.questionInline = value;
    }

    /**
     * Gets the value of the textDecoration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextDecoration() {
        return textDecoration;
    }

    /**
     * Sets the value of the textDecoration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextDecoration(String value) {
        this.textDecoration = value;
    }

    /**
     * Gets the value of the alphasort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphasort() {
        return alphasort;
    }

    /**
     * Sets the value of the alphasort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphasort(String value) {
        this.alphasort = value;
    }

    /**
     * Gets the value of the hasBorder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBorder() {
        return hasBorder;
    }

    /**
     * Sets the value of the hasBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBorder(Boolean value) {
        this.hasBorder = value;
    }

}
