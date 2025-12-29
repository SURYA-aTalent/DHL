
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Archive"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="UnderHiring"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "status")
@XmlEnum
public enum Status {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Archive")
    ARCHIVE("Archive"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("UnderHiring")
    UNDER_HIRING("UnderHiring");
    private final String value;

    Status(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Status fromValue(String v) {
        for (Status c: Status.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
