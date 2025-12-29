
package com.mrted.ws.candidate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reflectiveLov complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reflectiveLov">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mrted.com/}lov">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reflectiveLov")
@XmlSeeAlso({
    Language.class,
    RegularLov.class
})
public abstract class ReflectiveLov
    extends Lov
{


}
