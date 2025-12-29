
package com.mrted.ws.position;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionsByObsIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionsByObsIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionsByObsIdResponseDto" type="{http://ws.mrted.com/}positionsByObsIdResponseDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionsByObsIdResponse", propOrder = {
    "positionsByObsIdResponseDto"
})
public class GetPositionsByObsIdResponse {

    protected List<PositionsByObsIdResponseDto> positionsByObsIdResponseDto;

    /**
     * Gets the value of the positionsByObsIdResponseDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionsByObsIdResponseDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionsByObsIdResponseDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionsByObsIdResponseDto }
     * 
     * 
     */
    public List<PositionsByObsIdResponseDto> getPositionsByObsIdResponseDto() {
        if (positionsByObsIdResponseDto == null) {
            positionsByObsIdResponseDto = new ArrayList<PositionsByObsIdResponseDto>();
        }
        return this.positionsByObsIdResponseDto;
    }

}
