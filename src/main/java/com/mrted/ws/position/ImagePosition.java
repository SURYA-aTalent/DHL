
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imagePosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="imagePosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Header1"/>
 *     &lt;enumeration value="Header2"/>
 *     &lt;enumeration value="TopOfJobDescription"/>
 *     &lt;enumeration value="Bottom"/>
 *     &lt;enumeration value="Logo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "imagePosition")
@XmlEnum
public enum ImagePosition {

    @XmlEnumValue("Header1")
    HEADER_1("Header1"),
    @XmlEnumValue("Header2")
    HEADER_2("Header2"),
    @XmlEnumValue("TopOfJobDescription")
    TOP_OF_JOB_DESCRIPTION("TopOfJobDescription"),
    @XmlEnumValue("Bottom")
    BOTTOM("Bottom"),
    @XmlEnumValue("Logo")
    LOGO("Logo");
    private final String value;

    ImagePosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImagePosition fromValue(String v) {
        for (ImagePosition c: ImagePosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
