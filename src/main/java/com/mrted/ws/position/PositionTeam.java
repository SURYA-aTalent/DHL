
package com.mrted.ws.position;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionTeam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionTeam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approver" type="{http://ws.mrted.com/}approverDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operational" type="{http://ws.mrted.com/}teamMemberDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recruiter2OutOfTlk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recruiter3OutOfTlk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recruiter" type="{http://ws.mrted.com/}teamMemberDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionTeam", propOrder = {
    "approver",
    "operational",
    "recruiter2OutOfTlk",
    "recruiter3OutOfTlk",
    "recruiter"
})
public class PositionTeam {

    protected List<ApproverDto> approver;
    protected List<TeamMemberDto> operational;
    protected Boolean recruiter2OutOfTlk;
    protected Boolean recruiter3OutOfTlk;
    protected List<TeamMemberDto> recruiter;

    /**
     * Gets the value of the approver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApproverDto }
     * 
     * 
     */
    public List<ApproverDto> getApprover() {
        if (approver == null) {
            approver = new ArrayList<ApproverDto>();
        }
        return this.approver;
    }

    /**
     * Gets the value of the operational property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operational property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperational().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberDto }
     * 
     * 
     */
    public List<TeamMemberDto> getOperational() {
        if (operational == null) {
            operational = new ArrayList<TeamMemberDto>();
        }
        return this.operational;
    }

    /**
     * Gets the value of the recruiter2OutOfTlk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecruiter2OutOfTlk() {
        return recruiter2OutOfTlk;
    }

    /**
     * Sets the value of the recruiter2OutOfTlk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecruiter2OutOfTlk(Boolean value) {
        this.recruiter2OutOfTlk = value;
    }

    /**
     * Gets the value of the recruiter3OutOfTlk property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecruiter3OutOfTlk() {
        return recruiter3OutOfTlk;
    }

    /**
     * Sets the value of the recruiter3OutOfTlk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecruiter3OutOfTlk(Boolean value) {
        this.recruiter3OutOfTlk = value;
    }

    /**
     * Gets the value of the recruiter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recruiter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecruiter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberDto }
     * 
     * 
     */
    public List<TeamMemberDto> getRecruiter() {
        if (recruiter == null) {
            recruiter = new ArrayList<TeamMemberDto>();
        }
        return this.recruiter;
    }

}
