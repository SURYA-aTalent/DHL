
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candidateConsentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="candidateConsentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REQUESTED"/>
 *     &lt;enumeration value="GRANTED"/>
 *     &lt;enumeration value="REVOKED_BY_USER"/>
 *     &lt;enumeration value="WITHDRAWN_BY_CANDIDATE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "candidateConsentStatus")
@XmlEnum
public enum CandidateConsentStatus {

    REQUESTED,
    GRANTED,
    REVOKED_BY_USER,
    WITHDRAWN_BY_CANDIDATE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CandidateConsentStatus fromValue(String v) {
        return valueOf(v);
    }

}
