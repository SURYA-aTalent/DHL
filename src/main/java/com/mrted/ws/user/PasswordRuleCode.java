
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passwordRuleCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="passwordRuleCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ChangeSystemPassword"/>
 *     &lt;enumeration value="BlockLogin"/>
 *     &lt;enumeration value="BlockLoginUnused"/>
 *     &lt;enumeration value="ExpirationPeriod"/>
 *     &lt;enumeration value="MinimumLength"/>
 *     &lt;enumeration value="MixedCase"/>
 *     &lt;enumeration value="Numbers"/>
 *     &lt;enumeration value="SpecialChars"/>
 *     &lt;enumeration value="History"/>
 *     &lt;enumeration value="PersonalAttributes"/>
 *     &lt;enumeration value="SendReminderExpiration"/>
 *     &lt;enumeration value="DisableChangePasswAU"/>
 *     &lt;enumeration value="DisableChangeSecQaAU"/>
 *     &lt;enumeration value="DisableChangePasswMSS"/>
 *     &lt;enumeration value="DisableChangeSecQaMSS"/>
 *     &lt;enumeration value="DoNotAllowStoreCompanyName"/>
 *     &lt;enumeration value="DoNotAllowStoreLogin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "passwordRuleCode")
@XmlEnum
public enum PasswordRuleCode {

    @XmlEnumValue("ChangeSystemPassword")
    CHANGE_SYSTEM_PASSWORD("ChangeSystemPassword"),
    @XmlEnumValue("BlockLogin")
    BLOCK_LOGIN("BlockLogin"),
    @XmlEnumValue("BlockLoginUnused")
    BLOCK_LOGIN_UNUSED("BlockLoginUnused"),
    @XmlEnumValue("ExpirationPeriod")
    EXPIRATION_PERIOD("ExpirationPeriod"),
    @XmlEnumValue("MinimumLength")
    MINIMUM_LENGTH("MinimumLength"),
    @XmlEnumValue("MixedCase")
    MIXED_CASE("MixedCase"),
    @XmlEnumValue("Numbers")
    NUMBERS("Numbers"),
    @XmlEnumValue("SpecialChars")
    SPECIAL_CHARS("SpecialChars"),
    @XmlEnumValue("History")
    HISTORY("History"),
    @XmlEnumValue("PersonalAttributes")
    PERSONAL_ATTRIBUTES("PersonalAttributes"),
    @XmlEnumValue("SendReminderExpiration")
    SEND_REMINDER_EXPIRATION("SendReminderExpiration"),
    @XmlEnumValue("DisableChangePasswAU")
    DISABLE_CHANGE_PASSW_AU("DisableChangePasswAU"),
    @XmlEnumValue("DisableChangeSecQaAU")
    DISABLE_CHANGE_SEC_QA_AU("DisableChangeSecQaAU"),
    @XmlEnumValue("DisableChangePasswMSS")
    DISABLE_CHANGE_PASSW_MSS("DisableChangePasswMSS"),
    @XmlEnumValue("DisableChangeSecQaMSS")
    DISABLE_CHANGE_SEC_QA_MSS("DisableChangeSecQaMSS"),
    @XmlEnumValue("DoNotAllowStoreCompanyName")
    DO_NOT_ALLOW_STORE_COMPANY_NAME("DoNotAllowStoreCompanyName"),
    @XmlEnumValue("DoNotAllowStoreLogin")
    DO_NOT_ALLOW_STORE_LOGIN("DoNotAllowStoreLogin");
    private final String value;

    PasswordRuleCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PasswordRuleCode fromValue(String v) {
        for (PasswordRuleCode c: PasswordRuleCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
