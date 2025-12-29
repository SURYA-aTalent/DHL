
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for questionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="questionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="category_language_question"/>
 *     &lt;enumeration value="complex_assessment_results"/>
 *     &lt;enumeration value="complex_education"/>
 *     &lt;enumeration value="complex_employment"/>
 *     &lt;enumeration value="complex_language"/>
 *     &lt;enumeration value="complex_social_networking"/>
 *     &lt;enumeration value="complex_workday_accomplishments"/>
 *     &lt;enumeration value="complex_workday_awards"/>
 *     &lt;enumeration value="complex_workday_certifications"/>
 *     &lt;enumeration value="complex_workday_competency"/>
 *     &lt;enumeration value="complex_workday_education"/>
 *     &lt;enumeration value="complex_workday_external_job_history"/>
 *     &lt;enumeration value="complex_workday_language"/>
 *     &lt;enumeration value="complex_workday_memberships"/>
 *     &lt;enumeration value="complex_workday_responsibilities"/>
 *     &lt;enumeration value="complex_workday_training"/>
 *     &lt;enumeration value="complex_workday_work_experience"/>
 *     &lt;enumeration value="complex_workday_reference"/>
 *     &lt;enumeration value="complex_identification_data"/>
 *     &lt;enumeration value="dedicated"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="free_text"/>
 *     &lt;enumeration value="image"/>
 *     &lt;enumeration value="lov"/>
 *     &lt;enumeration value="multiple_choice"/>
 *     &lt;enumeration value="non_answer"/>
 *     &lt;enumeration value="section"/>
 *     &lt;enumeration value="single_choice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "questionType")
@XmlEnum
public enum QuestionType {

    @XmlEnumValue("category_language_question")
    CATEGORY_LANGUAGE_QUESTION("category_language_question"),
    @XmlEnumValue("complex_assessment_results")
    COMPLEX_ASSESSMENT_RESULTS("complex_assessment_results"),
    @XmlEnumValue("complex_education")
    COMPLEX_EDUCATION("complex_education"),
    @XmlEnumValue("complex_employment")
    COMPLEX_EMPLOYMENT("complex_employment"),
    @XmlEnumValue("complex_language")
    COMPLEX_LANGUAGE("complex_language"),
    @XmlEnumValue("complex_social_networking")
    COMPLEX_SOCIAL_NETWORKING("complex_social_networking"),
    @XmlEnumValue("complex_workday_accomplishments")
    COMPLEX_WORKDAY_ACCOMPLISHMENTS("complex_workday_accomplishments"),
    @XmlEnumValue("complex_workday_awards")
    COMPLEX_WORKDAY_AWARDS("complex_workday_awards"),
    @XmlEnumValue("complex_workday_certifications")
    COMPLEX_WORKDAY_CERTIFICATIONS("complex_workday_certifications"),
    @XmlEnumValue("complex_workday_competency")
    COMPLEX_WORKDAY_COMPETENCY("complex_workday_competency"),
    @XmlEnumValue("complex_workday_education")
    COMPLEX_WORKDAY_EDUCATION("complex_workday_education"),
    @XmlEnumValue("complex_workday_external_job_history")
    COMPLEX_WORKDAY_EXTERNAL_JOB_HISTORY("complex_workday_external_job_history"),
    @XmlEnumValue("complex_workday_language")
    COMPLEX_WORKDAY_LANGUAGE("complex_workday_language"),
    @XmlEnumValue("complex_workday_memberships")
    COMPLEX_WORKDAY_MEMBERSHIPS("complex_workday_memberships"),
    @XmlEnumValue("complex_workday_responsibilities")
    COMPLEX_WORKDAY_RESPONSIBILITIES("complex_workday_responsibilities"),
    @XmlEnumValue("complex_workday_training")
    COMPLEX_WORKDAY_TRAINING("complex_workday_training"),
    @XmlEnumValue("complex_workday_work_experience")
    COMPLEX_WORKDAY_WORK_EXPERIENCE("complex_workday_work_experience"),
    @XmlEnumValue("complex_workday_reference")
    COMPLEX_WORKDAY_REFERENCE("complex_workday_reference"),
    @XmlEnumValue("complex_identification_data")
    COMPLEX_IDENTIFICATION_DATA("complex_identification_data"),
    @XmlEnumValue("dedicated")
    DEDICATED("dedicated"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("free_text")
    FREE_TEXT("free_text"),
    @XmlEnumValue("image")
    IMAGE("image"),
    @XmlEnumValue("lov")
    LOV("lov"),
    @XmlEnumValue("multiple_choice")
    MULTIPLE_CHOICE("multiple_choice"),
    @XmlEnumValue("non_answer")
    NON_ANSWER("non_answer"),
    @XmlEnumValue("section")
    SECTION("section"),
    @XmlEnumValue("single_choice")
    SINGLE_CHOICE("single_choice");
    private final String value;

    QuestionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuestionType fromValue(String v) {
        for (QuestionType c: QuestionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
