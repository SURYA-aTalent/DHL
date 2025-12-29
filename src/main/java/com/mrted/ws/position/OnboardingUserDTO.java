
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for onboardingUserDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="onboardingUserDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}userDto">
 *       &lt;sequence>
 *         &lt;element name="onboardingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="onboardingUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="onboardingUserType" type="{http://ws.mrted.com/}onboardingUserType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "onboardingUserDTO", propOrder = {
    "onboardingId",
    "userId",
    "onboardingUserName",
    "onboardingUserType"
})
public class OnboardingUserDTO
    extends UserDto
{

    protected Long onboardingId;
    protected Long userId;
    protected String onboardingUserName;
    @XmlSchemaType(name = "string")
    protected OnboardingUserType onboardingUserType;

    /**
     * Gets the value of the onboardingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOnboardingId() {
        return onboardingId;
    }

    /**
     * Sets the value of the onboardingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOnboardingId(Long value) {
        this.onboardingId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the onboardingUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnboardingUserName() {
        return onboardingUserName;
    }

    /**
     * Sets the value of the onboardingUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnboardingUserName(String value) {
        this.onboardingUserName = value;
    }

    /**
     * Gets the value of the onboardingUserType property.
     * 
     * @return
     *     possible object is
     *     {@link OnboardingUserType }
     *     
     */
    public OnboardingUserType getOnboardingUserType() {
        return onboardingUserType;
    }

    /**
     * Sets the value of the onboardingUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnboardingUserType }
     *     
     */
    public void setOnboardingUserType(OnboardingUserType value) {
        this.onboardingUserType = value;
    }

}
