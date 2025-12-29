
package com.mrted.ws.documents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for localizedValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="localizedValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="localizedValue" type="{http://ws.mrted.com/}localizedValueDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "localizedValues", propOrder = {
    "localizedValue"
})
public class LocalizedValues {

    protected List<LocalizedValueDto> localizedValue;

    /**
     * Gets the value of the localizedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localizedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalizedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalizedValueDto }
     * 
     * 
     */
    public List<LocalizedValueDto> getLocalizedValue() {
        if (localizedValue == null) {
            localizedValue = new ArrayList<LocalizedValueDto>();
        }
        return this.localizedValue;
    }

}
