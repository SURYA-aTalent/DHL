
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for teamType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="teamType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RECRUITING_TEAM"/>
 *     &lt;enumeration value="OPERATIONAL_TEAM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "teamType")
@XmlEnum
public enum TeamType {

    RECRUITING_TEAM,
    OPERATIONAL_TEAM;

    public String value() {
        return name();
    }

    public static TeamType fromValue(String v) {
        return valueOf(v);
    }

}
