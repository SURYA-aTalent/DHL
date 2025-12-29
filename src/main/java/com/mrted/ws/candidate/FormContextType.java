
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formContextType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="formContextType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="Opening"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "formContextType")
@XmlEnum
public enum FormContextType {

    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Opening")
    OPENING("Opening");
    private final String value;

    FormContextType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormContextType fromValue(String v) {
        for (FormContextType c: FormContextType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
