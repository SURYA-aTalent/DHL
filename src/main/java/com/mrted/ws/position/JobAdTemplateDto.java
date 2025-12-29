
package com.mrted.ws.position;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jobAdTemplateDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jobAdTemplateDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalDepartments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="additionalDepartment" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="allFieldsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="anyFieldLocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="confProperties" type="{http://ws.mrted.com/}confPropertiesType" minOccurs="0"/>
 *         &lt;element name="departmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="images" type="{http://ws.mrted.com/}imagesType" minOccurs="0"/>
 *         &lt;element name="jobdescFields" type="{http://ws.mrted.com/}jobAdField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plainText" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="primaryLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strapline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="videos" type="{http://ws.mrted.com/}videosType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jobAdTemplateDto", propOrder = {
    "additionalDepartments",
    "allFieldsLocked",
    "anyFieldLocked",
    "confProperties",
    "departmentId",
    "id",
    "images",
    "jobdescFields",
    "plainText",
    "primaryLanguage",
    "strapline",
    "title",
    "hidden",
    "videos"
})
public class JobAdTemplateDto {

    protected JobAdTemplateDto.AdditionalDepartments additionalDepartments;
    protected boolean allFieldsLocked;
    protected boolean anyFieldLocked;
    protected ConfPropertiesType confProperties;
    protected Long departmentId;
    protected Long id;
    protected ImagesType images;
    protected List<JobAdField> jobdescFields;
    protected boolean plainText;
    protected String primaryLanguage;
    protected String strapline;
    protected String title;
    protected Boolean hidden;
    protected VideosType videos;

    /**
     * Gets the value of the additionalDepartments property.
     * 
     * @return
     *     possible object is
     *     {@link JobAdTemplateDto.AdditionalDepartments }
     *     
     */
    public JobAdTemplateDto.AdditionalDepartments getAdditionalDepartments() {
        return additionalDepartments;
    }

    /**
     * Sets the value of the additionalDepartments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobAdTemplateDto.AdditionalDepartments }
     *     
     */
    public void setAdditionalDepartments(JobAdTemplateDto.AdditionalDepartments value) {
        this.additionalDepartments = value;
    }

    /**
     * Gets the value of the allFieldsLocked property.
     * 
     */
    public boolean isAllFieldsLocked() {
        return allFieldsLocked;
    }

    /**
     * Sets the value of the allFieldsLocked property.
     * 
     */
    public void setAllFieldsLocked(boolean value) {
        this.allFieldsLocked = value;
    }

    /**
     * Gets the value of the anyFieldLocked property.
     * 
     */
    public boolean isAnyFieldLocked() {
        return anyFieldLocked;
    }

    /**
     * Sets the value of the anyFieldLocked property.
     * 
     */
    public void setAnyFieldLocked(boolean value) {
        this.anyFieldLocked = value;
    }

    /**
     * Gets the value of the confProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ConfPropertiesType }
     *     
     */
    public ConfPropertiesType getConfProperties() {
        return confProperties;
    }

    /**
     * Sets the value of the confProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfPropertiesType }
     *     
     */
    public void setConfProperties(ConfPropertiesType value) {
        this.confProperties = value;
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
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ImagesType }
     *     
     */
    public ImagesType getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagesType }
     *     
     */
    public void setImages(ImagesType value) {
        this.images = value;
    }

    /**
     * Gets the value of the jobdescFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobdescFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobdescFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobAdField }
     * 
     * 
     */
    public List<JobAdField> getJobdescFields() {
        if (jobdescFields == null) {
            jobdescFields = new ArrayList<JobAdField>();
        }
        return this.jobdescFields;
    }

    /**
     * Gets the value of the plainText property.
     * 
     */
    public boolean isPlainText() {
        return plainText;
    }

    /**
     * Sets the value of the plainText property.
     * 
     */
    public void setPlainText(boolean value) {
        this.plainText = value;
    }

    /**
     * Gets the value of the primaryLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    /**
     * Sets the value of the primaryLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLanguage(String value) {
        this.primaryLanguage = value;
    }

    /**
     * Gets the value of the strapline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrapline() {
        return strapline;
    }

    /**
     * Sets the value of the strapline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrapline(String value) {
        this.strapline = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the videos property.
     * 
     * @return
     *     possible object is
     *     {@link VideosType }
     *     
     */
    public VideosType getVideos() {
        return videos;
    }

    /**
     * Sets the value of the videos property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideosType }
     *     
     */
    public void setVideos(VideosType value) {
        this.videos = value;
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
     *         &lt;element name="additionalDepartment" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
        "additionalDepartment"
    })
    public static class AdditionalDepartments {

        @XmlElement(type = Integer.class)
        protected List<Integer> additionalDepartment;

        /**
         * Gets the value of the additionalDepartment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalDepartment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalDepartment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getAdditionalDepartment() {
            if (additionalDepartment == null) {
                additionalDepartment = new ArrayList<Integer>();
            }
            return this.additionalDepartment;
        }

    }

}
