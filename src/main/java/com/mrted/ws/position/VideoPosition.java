
package com.mrted.ws.position;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for videoPosition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="videoPosition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Video1"/>
 *     &lt;enumeration value="Video2"/>
 *     &lt;enumeration value="Video3"/>
 *     &lt;enumeration value="Video4"/>
 *     &lt;enumeration value="Video5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "videoPosition")
@XmlEnum
public enum VideoPosition {

    @XmlEnumValue("Video1")
    VIDEO_1("Video1"),
    @XmlEnumValue("Video2")
    VIDEO_2("Video2"),
    @XmlEnumValue("Video3")
    VIDEO_3("Video3"),
    @XmlEnumValue("Video4")
    VIDEO_4("Video4"),
    @XmlEnumValue("Video5")
    VIDEO_5("Video5");
    private final String value;

    VideoPosition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VideoPosition fromValue(String v) {
        for (VideoPosition c: VideoPosition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
