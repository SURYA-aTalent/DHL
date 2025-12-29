
package com.mrted.ws.lovhierarchy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTEGER"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="POSITIVE_INTEGER"/>
 *     &lt;enumeration value="NUMERICAL"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataType")
@XmlEnum
public enum DataType {

    INTEGER,
    TEXT,
    POSITIVE_INTEGER,
    NUMERICAL,
    BOOLEAN;

    public String value() {
        return name();
    }

    public static DataType fromValue(String v) {
        return valueOf(v);
    }

}
