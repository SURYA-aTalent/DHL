
package com.mrted.ws.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userData" type="{http://ws.mrted.com/}userDataSoapDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserDataResponse", propOrder = {
    "userData"
})
public class GetUserDataResponse {

    protected List<UserDataSoapDto> userData;

    /**
     * Gets the value of the userData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserDataSoapDto }
     * 
     * 
     */
    public List<UserDataSoapDto> getUserData() {
        if (userData == null) {
            userData = new ArrayList<UserDataSoapDto>();
        }
        return this.userData;
    }

}
