
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for onboardingUserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="onboardingUserType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MENTOR"/>
 *     &lt;enumeration value="ONBOARDING_CO_ORDINATOR"/>
 *     &lt;enumeration value="ONBOARDING_HR"/>
 *     &lt;enumeration value="ONBOARDING_MANAGER"/>
 *     &lt;enumeration value="ONBOARDING_IT"/>
 *     &lt;enumeration value="SECURITY"/>
 *     &lt;enumeration value="PAYROLL"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "onboardingUserType")
@XmlEnum
public enum OnboardingUserType {

    MENTOR,
    ONBOARDING_CO_ORDINATOR,
    ONBOARDING_HR,
    ONBOARDING_MANAGER,
    ONBOARDING_IT,
    SECURITY,
    PAYROLL,
    OTHER;

    public String value() {
        return name();
    }

    public static OnboardingUserType fromValue(String v) {
        return valueOf(v);
    }

}
