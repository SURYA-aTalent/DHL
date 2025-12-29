
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userConfigParams.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userConfigParams">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOTIFICATION_INTERVAL"/>
 *     &lt;enumeration value="NOTIFICATION_STATUS"/>
 *     &lt;enumeration value="DISABLE_LOGIN_PAGE"/>
 *     &lt;enumeration value="ALERT_CANDIDATE"/>
 *     &lt;enumeration value="ALERT_MESSAGE"/>
 *     &lt;enumeration value="ALERT_TIMESHEETS"/>
 *     &lt;enumeration value="MESSAGE_FORMAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "userConfigParams")
@XmlEnum
public enum UserConfigParams {

    NOTIFICATION_INTERVAL,
    NOTIFICATION_STATUS,
    DISABLE_LOGIN_PAGE,
    ALERT_CANDIDATE,
    ALERT_MESSAGE,
    ALERT_TIMESHEETS,
    MESSAGE_FORMAT;

    public String value() {
        return name();
    }

    public static UserConfigParams fromValue(String v) {
        return valueOf(v);
    }

}
