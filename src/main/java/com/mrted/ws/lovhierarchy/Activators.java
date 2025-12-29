
package com.mrted.ws.lovhierarchy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activators">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vlov" type="{http://ws.mrted.com/}uuidIdPairDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activators", propOrder = {
    "vlov"
})
public class Activators {

    protected List<UuidIdPairDto> vlov;

    /**
     * Gets the value of the vlov property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vlov property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVlov().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UuidIdPairDto }
     * 
     * 
     */
    public List<UuidIdPairDto> getVlov() {
        if (vlov == null) {
            vlov = new ArrayList<UuidIdPairDto>();
        }
        return this.vlov;
    }

}
