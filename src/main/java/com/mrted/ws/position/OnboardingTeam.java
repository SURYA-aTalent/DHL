
package com.mrted.ws.position;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for onboardingTeam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="onboardingTeam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="onboardingCoordinator" type="{http://ws.mrted.com/}onboardingUserDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onboardingHR" type="{http://ws.mrted.com/}onboardingUserDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onboardingIT" type="{http://ws.mrted.com/}onboardingUserDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onboardingMentor" type="{http://ws.mrted.com/}onboardingUserDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onboardingOther" type="{http://ws.mrted.com/}onboardingUserDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onboardingPayroll" type="{http://ws.mrted.com/}onboardingUserDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onboardingSecurity" type="{http://ws.mrted.com/}onboardingUserDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "onboardingTeam", propOrder = {
    "onboardingCoordinator",
    "onboardingHR",
    "onboardingIT",
    "onboardingMentor",
    "onboardingOther",
    "onboardingPayroll",
    "onboardingSecurity"
})
public class OnboardingTeam {

    protected List<OnboardingUserDTO> onboardingCoordinator;
    protected List<OnboardingUserDTO> onboardingHR;
    protected List<OnboardingUserDTO> onboardingIT;
    protected List<OnboardingUserDTO> onboardingMentor;
    protected List<OnboardingUserDTO> onboardingOther;
    protected List<OnboardingUserDTO> onboardingPayroll;
    protected List<OnboardingUserDTO> onboardingSecurity;

    /**
     * Gets the value of the onboardingCoordinator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onboardingCoordinator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnboardingCoordinator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnboardingUserDTO }
     * 
     * 
     */
    public List<OnboardingUserDTO> getOnboardingCoordinator() {
        if (onboardingCoordinator == null) {
            onboardingCoordinator = new ArrayList<OnboardingUserDTO>();
        }
        return this.onboardingCoordinator;
    }

    /**
     * Gets the value of the onboardingHR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onboardingHR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnboardingHR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnboardingUserDTO }
     * 
     * 
     */
    public List<OnboardingUserDTO> getOnboardingHR() {
        if (onboardingHR == null) {
            onboardingHR = new ArrayList<OnboardingUserDTO>();
        }
        return this.onboardingHR;
    }

    /**
     * Gets the value of the onboardingIT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onboardingIT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnboardingIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnboardingUserDTO }
     * 
     * 
     */
    public List<OnboardingUserDTO> getOnboardingIT() {
        if (onboardingIT == null) {
            onboardingIT = new ArrayList<OnboardingUserDTO>();
        }
        return this.onboardingIT;
    }

    /**
     * Gets the value of the onboardingMentor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onboardingMentor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnboardingMentor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnboardingUserDTO }
     * 
     * 
     */
    public List<OnboardingUserDTO> getOnboardingMentor() {
        if (onboardingMentor == null) {
            onboardingMentor = new ArrayList<OnboardingUserDTO>();
        }
        return this.onboardingMentor;
    }

    /**
     * Gets the value of the onboardingOther property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onboardingOther property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnboardingOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnboardingUserDTO }
     * 
     * 
     */
    public List<OnboardingUserDTO> getOnboardingOther() {
        if (onboardingOther == null) {
            onboardingOther = new ArrayList<OnboardingUserDTO>();
        }
        return this.onboardingOther;
    }

    /**
     * Gets the value of the onboardingPayroll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onboardingPayroll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnboardingPayroll().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnboardingUserDTO }
     * 
     * 
     */
    public List<OnboardingUserDTO> getOnboardingPayroll() {
        if (onboardingPayroll == null) {
            onboardingPayroll = new ArrayList<OnboardingUserDTO>();
        }
        return this.onboardingPayroll;
    }

    /**
     * Gets the value of the onboardingSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onboardingSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnboardingSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnboardingUserDTO }
     * 
     * 
     */
    public List<OnboardingUserDTO> getOnboardingSecurity() {
        if (onboardingSecurity == null) {
            onboardingSecurity = new ArrayList<OnboardingUserDTO>();
        }
        return this.onboardingSecurity;
    }

}
