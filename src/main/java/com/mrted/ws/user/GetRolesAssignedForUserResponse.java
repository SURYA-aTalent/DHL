
package com.mrted.ws.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRolesAssignedForUserResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRolesAssignedForUserResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userRoleAssignment" type="{http://ws.mrted.com/}roleAssignmentDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRolesAssignedForUserResponse", propOrder = {
    "userRoleAssignment"
})
public class GetRolesAssignedForUserResponse {

    protected List<RoleAssignmentDto> userRoleAssignment;

    /**
     * Gets the value of the userRoleAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userRoleAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserRoleAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleAssignmentDto }
     * 
     * 
     */
    public List<RoleAssignmentDto> getUserRoleAssignment() {
        if (userRoleAssignment == null) {
            userRoleAssignment = new ArrayList<RoleAssignmentDto>();
        }
        return this.userRoleAssignment;
    }

}
