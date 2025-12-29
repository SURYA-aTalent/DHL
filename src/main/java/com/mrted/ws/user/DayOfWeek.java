
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dayOfWeek.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dayOfWeek">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUNDAY"/>
 *     &lt;enumeration value="MONDAY"/>
 *     &lt;enumeration value="TUESDAY"/>
 *     &lt;enumeration value="WEDNESDAY"/>
 *     &lt;enumeration value="THURSDAY"/>
 *     &lt;enumeration value="FRIDAY"/>
 *     &lt;enumeration value="SATURDAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dayOfWeek")
@XmlEnum
public enum DayOfWeek {

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public String value() {
        return name();
    }

    public static DayOfWeek fromValue(String v) {
        return valueOf(v);
    }

}
