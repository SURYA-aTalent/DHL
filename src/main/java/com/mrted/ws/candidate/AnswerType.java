
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for answerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="answerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="free_text"/>
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="url"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="number"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="date_time"/>
 *     &lt;enumeration value="phone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "answerType")
@XmlEnum
public enum AnswerType {

    @XmlEnumValue("free_text")
    FREE_TEXT("free_text"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("url")
    URL("url"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("number")
    NUMBER("number"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("date_time")
    DATE_TIME("date_time"),
    @XmlEnumValue("phone")
    PHONE("phone");
    private final String value;

    AnswerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnswerType fromValue(String v) {
        for (AnswerType c: AnswerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
