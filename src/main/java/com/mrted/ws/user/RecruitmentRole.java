
package com.mrted.ws.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recruitmentRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="recruitmentRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HeadOfHrOrVpOfHr"/>
 *     &lt;enumeration value="HeadOfTalentAcquisitionOrRecruitmentManager"/>
 *     &lt;enumeration value="RpoAccountManagerOrDirector"/>
 *     &lt;enumeration value="HrAdministratorOrHrGeneralist"/>
 *     &lt;enumeration value="HiringManagerOrLineManager"/>
 *     &lt;enumeration value="RecruiterOrResourcer"/>
 *     &lt;enumeration value="TalentLinkSystemAdministrator"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "recruitmentRole")
@XmlEnum
public enum RecruitmentRole {

    @XmlEnumValue("HeadOfHrOrVpOfHr")
    HEAD_OF_HR_OR_VP_OF_HR("HeadOfHrOrVpOfHr"),
    @XmlEnumValue("HeadOfTalentAcquisitionOrRecruitmentManager")
    HEAD_OF_TALENT_ACQUISITION_OR_RECRUITMENT_MANAGER("HeadOfTalentAcquisitionOrRecruitmentManager"),
    @XmlEnumValue("RpoAccountManagerOrDirector")
    RPO_ACCOUNT_MANAGER_OR_DIRECTOR("RpoAccountManagerOrDirector"),
    @XmlEnumValue("HrAdministratorOrHrGeneralist")
    HR_ADMINISTRATOR_OR_HR_GENERALIST("HrAdministratorOrHrGeneralist"),
    @XmlEnumValue("HiringManagerOrLineManager")
    HIRING_MANAGER_OR_LINE_MANAGER("HiringManagerOrLineManager"),
    @XmlEnumValue("RecruiterOrResourcer")
    RECRUITER_OR_RESOURCER("RecruiterOrResourcer"),
    @XmlEnumValue("TalentLinkSystemAdministrator")
    TALENT_LINK_SYSTEM_ADMINISTRATOR("TalentLinkSystemAdministrator"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RecruitmentRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecruitmentRole fromValue(String v) {
        for (RecruitmentRole c: RecruitmentRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
