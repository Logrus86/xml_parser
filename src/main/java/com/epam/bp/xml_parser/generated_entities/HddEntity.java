
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HddEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HddEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capacityGb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rotatingSpeedRpm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="formfactorHdd" type="{http://www.example.com/HwShop}FormFactorHddType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HddEntity", namespace = "http://www.example.com/HwShop", propOrder = {
    "capacityGb",
    "rotatingSpeedRpm",
    "formfactorHdd"
})
public class HddEntity {

    protected int capacityGb;
    protected int rotatingSpeedRpm;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FormFactorHddType formfactorHdd;

    /**
     * Gets the value of the capacityGb property.
     * 
     */
    public int getCapacityGb() {
        return capacityGb;
    }

    /**
     * Sets the value of the capacityGb property.
     * 
     */
    public void setCapacityGb(int value) {
        this.capacityGb = value;
    }

    /**
     * Gets the value of the rotatingSpeedRpm property.
     * 
     */
    public int getRotatingSpeedRpm() {
        return rotatingSpeedRpm;
    }

    /**
     * Sets the value of the rotatingSpeedRpm property.
     * 
     */
    public void setRotatingSpeedRpm(int value) {
        this.rotatingSpeedRpm = value;
    }

    /**
     * Gets the value of the formfactorHdd property.
     * 
     * @return
     *     possible object is
     *     {@link FormFactorHddType }
     *     
     */
    public FormFactorHddType getFormfactorHdd() {
        return formfactorHdd;
    }

    /**
     * Sets the value of the formfactorHdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormFactorHddType }
     *     
     */
    public void setFormfactorHdd(FormFactorHddType value) {
        this.formfactorHdd = value;
    }

}
