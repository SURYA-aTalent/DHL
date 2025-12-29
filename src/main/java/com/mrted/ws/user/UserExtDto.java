
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userExtDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userExtDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}userDto">
 *       &lt;sequence>
 *         &lt;element name="dateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstDayOfWeek" type="{http://ws.mrted.com/}dayOfWeek" minOccurs="0"/>
 *         &lt;element name="language" type="{http://ws.mrted.com/}langCode" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwordType" type="{http://ws.mrted.com/}passwordType" minOccurs="0"/>
 *         &lt;element name="timeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recruitmentRole" type="{http://ws.mrted.com/}recruitmentRole" minOccurs="0"/>
 *         &lt;element name="otherRecruitmentRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userExtDto", propOrder = {
    "dateFormat",
    "firstDayOfWeek",
    "language",
    "password",
    "passwordType",
    "timeFormat",
    "timeZone",
    "recruitmentRole",
    "otherRecruitmentRole"
})
public class UserExtDto
    extends UserDto
{

    protected String dateFormat;
    @XmlSchemaType(name = "string")
    protected DayOfWeek firstDayOfWeek;
    @XmlSchemaType(name = "string")
    protected LangCode language;
    protected String password;
    @XmlSchemaType(name = "string")
    protected PasswordType passwordType;
    protected String timeFormat;
    protected String timeZone;
    @XmlSchemaType(name = "string")
    protected RecruitmentRole recruitmentRole;
    protected String otherRecruitmentRole;

    /**
     * Gets the value of the dateFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets the value of the dateFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the firstDayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeek }
     *     
     */
    public DayOfWeek getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    /**
     * Sets the value of the firstDayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeek }
     *     
     */
    public void setFirstDayOfWeek(DayOfWeek value) {
        this.firstDayOfWeek = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LangCode }
     *     
     */
    public LangCode getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangCode }
     *     
     */
    public void setLanguage(LangCode value) {
        this.language = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the passwordType property.
     * 
     * @return
     *     possible object is
     *     {@link PasswordType }
     *     
     */
    public PasswordType getPasswordType() {
        return passwordType;
    }

    /**
     * Sets the value of the passwordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PasswordType }
     *     
     */
    public void setPasswordType(PasswordType value) {
        this.passwordType = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFormat(String value) {
        this.timeFormat = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the recruitmentRole property.
     * 
     * @return
     *     possible object is
     *     {@link RecruitmentRole }
     *     
     */
    public RecruitmentRole getRecruitmentRole() {
        return recruitmentRole;
    }

    /**
     * Sets the value of the recruitmentRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecruitmentRole }
     *     
     */
    public void setRecruitmentRole(RecruitmentRole value) {
        this.recruitmentRole = value;
    }

    /**
     * Gets the value of the otherRecruitmentRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRecruitmentRole() {
        return otherRecruitmentRole;
    }

    /**
     * Sets the value of the otherRecruitmentRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRecruitmentRole(String value) {
        this.otherRecruitmentRole = value;
    }

}
