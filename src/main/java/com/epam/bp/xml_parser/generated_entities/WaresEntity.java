
package com.epam.bp.xml_parser.generated_entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaresEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaresEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ware" type="{http://www.example.com/HwShop}WareEntity" maxOccurs="10" minOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WaresEntity", namespace = "http://www.example.com/HwShop", propOrder = {
    "ware"
})
public class WaresEntity {

    @XmlElement(name = "Ware", required = true)
    protected List<WareEntity> ware;

    /**
     * Gets the value of the ware property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ware property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WareEntity }
     * 
     * 
     */
    public List<WareEntity> getWare() {
        if (ware == null) {
            ware = new ArrayList<WareEntity>();
        }
        return this.ware;
    }

}
