
package com.mrted.ws.documents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for langCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="langCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XX"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="DN"/>
 *     &lt;enumeration value="EL"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="EN"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="FL"/>
 *     &lt;enumeration value="FN"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="JA"/>
 *     &lt;enumeration value="KO"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="NW"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="UA"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="MX"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="WA"/>
 *     &lt;enumeration value="CA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "langCode")
@XmlEnum
public enum LangCode {

    XX,
    AR,
    BG,
    BR,
    CH,
    CN,
    CS,
    CY,
    DE,
    DN,
    EL,
    US,
    EN,
    ET,
    FL,
    FN,
    FR,
    GL,
    HR,
    HU,
    IS,
    IT,
    JA,
    KO,
    LT,
    LV,
    MY,
    NL,
    NW,
    PL,
    PT,
    RO,
    RU,
    SK,
    SL,
    SP,
    SR,
    SW,
    TH,
    TR,
    TW,
    UA,
    UK,
    VI,
    ID,
    MX,
    AT,
    WA,
    CA;

    public String value() {
        return name();
    }

    public static LangCode fromValue(String v) {
        return valueOf(v);
    }

}
