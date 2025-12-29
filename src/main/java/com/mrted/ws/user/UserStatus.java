
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "userStatus")
@XmlEnum
public enum UserStatus {

    ALL,
    ACTIVE,
    INACTIVE;

    public String value() {
        return name();
    }

    public static UserStatus fromValue(String v) {
        return valueOf(v);
    }

}
