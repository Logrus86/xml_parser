
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RamEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RamEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capacityMb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxFrequencyMHz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RamType" type="{http://www.example.com/HwShop}RamType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RamEntity", namespace = "http://www.example.com/HwShop", propOrder = {
    "capacityMb",
    "maxFrequencyMHz",
    "ramType"
})
public class RamEntity {

    protected int capacityMb;
    protected int maxFrequencyMHz;
    @XmlElement(name = "RamType", required = true)
    @XmlSchemaType(name = "string")
    protected RamType ramType;

    /**
     * Gets the value of the capacityMb property.
     * 
     */
    public int getCapacityMb() {
        return capacityMb;
    }

    /**
     * Sets the value of the capacityMb property.
     * 
     */
    public void setCapacityMb(int value) {
        this.capacityMb = value;
    }

    /**
     * Gets the value of the maxFrequencyMHz property.
     * 
     */
    public int getMaxFrequencyMHz() {
        return maxFrequencyMHz;
    }

    /**
     * Sets the value of the maxFrequencyMHz property.
     * 
     */
    public void setMaxFrequencyMHz(int value) {
        this.maxFrequencyMHz = value;
    }

    /**
     * Gets the value of the ramType property.
     * 
     * @return
     *     possible object is
     *     {@link RamType }
     *     
     */
    public RamType getRamType() {
        return ramType;
    }

    /**
     * Sets the value of the ramType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RamType }
     *     
     */
    public void setRamType(RamType value) {
        this.ramType = value;
    }

}
