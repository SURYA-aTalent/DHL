
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="documentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BO_CP"/>
 *     &lt;enumeration value="BO_CPE"/>
 *     &lt;enumeration value="BO_CPI"/>
 *     &lt;enumeration value="BO_CPEC"/>
 *     &lt;enumeration value="BO_CPIC"/>
 *     &lt;enumeration value="FO_CP"/>
 *     &lt;enumeration value="FO_PIF"/>
 *     &lt;enumeration value="FO_RPM"/>
 *     &lt;enumeration value="FO_CNT"/>
 *     &lt;enumeration value="BEST_PIF"/>
 *     &lt;enumeration value="PROFILE"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="RESUME"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="COVER_LETTER"/>
 *     &lt;enumeration value="COVERLETTER"/>
 *     &lt;enumeration value="DQ"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="Q"/>
 *     &lt;enumeration value="MAIL"/>
 *     &lt;enumeration value="SEARCH"/>
 *     &lt;enumeration value="AGENCY_CONTRACT"/>
 *     &lt;enumeration value="DOCUMENT_PACK"/>
 *     &lt;enumeration value="EXPENSE"/>
 *     &lt;enumeration value="EXTSYSATTACHMENT"/>
 *     &lt;enumeration value="PHOTO"/>
 *     &lt;enumeration value="PORTRAIT"/>
 *     &lt;enumeration value="THUMBNAIL"/>
 *     &lt;enumeration value="OFFER_LETTER"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="BGCK_REP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "documentType")
@XmlEnum
public enum DocumentType {

    BO_CP,
    BO_CPE,
    BO_CPI,
    BO_CPEC,
    BO_CPIC,
    FO_CP,
    FO_PIF,
    FO_RPM,
    FO_CNT,
    BEST_PIF,
    PROFILE,
    R,
    RESUME,
    CL,
    COVER_LETTER,
    COVERLETTER,
    DQ,
    I,
    Q,
    MAIL,
    SEARCH,
    AGENCY_CONTRACT,
    DOCUMENT_PACK,
    EXPENSE,
    EXTSYSATTACHMENT,
    PHOTO,
    PORTRAIT,
    THUMBNAIL,
    OFFER_LETTER,
    OTHER,
    BGCK_REP;

    public String value() {
        return name();
    }

    public static DocumentType fromValue(String v) {
        return valueOf(v);
    }

}
