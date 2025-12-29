
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passwordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="passwordType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="CONTRACT"/>
 *     &lt;enumeration value="AGENCYPORTAL"/>
 *     &lt;enumeration value="CANDIDATEPORTAL"/>
 *     &lt;enumeration value="CUSTOM"/>
 *     &lt;enumeration value="EMAILCONTACT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "passwordType")
@XmlEnum
public enum PasswordType {

    SYSTEM,
    CONTRACT,
    AGENCYPORTAL,
    CANDIDATEPORTAL,
    CUSTOM,
    EMAILCONTACT;

    public String value() {
        return name();
    }

    public static PasswordType fromValue(String v) {
        return valueOf(v);
    }

}
