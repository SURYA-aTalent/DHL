
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="consentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TALENT_POOL"/>
 *     &lt;enumeration value="APPLICATION"/>
 *     &lt;enumeration value="LINKEDIN_RSC"/>
 *     &lt;enumeration value="ALL_CONTEXT_CONSENT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "consentType")
@XmlEnum
public enum ConsentType {

    TALENT_POOL,
    APPLICATION,
    LINKEDIN_RSC,
    ALL_CONTEXT_CONSENT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ConsentType fromValue(String v) {
        return valueOf(v);
    }

}
