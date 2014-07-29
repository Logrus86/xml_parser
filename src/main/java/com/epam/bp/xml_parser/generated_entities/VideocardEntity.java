
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideocardEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideocardEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ramSizeMb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ramFrequencyMHz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cpuFrequencyMHz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="busWidthBit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VideoCardChipset" type="{http://www.example.com/HwShop}VideoCardChipsetType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideocardEntity", namespace = "http://www.example.com/HwShop", propOrder = {
    "ramSizeMb",
    "ramFrequencyMHz",
    "cpuFrequencyMHz",
    "busWidthBit",
    "videoCardChipset"
})
public class VideocardEntity {

    protected int ramSizeMb;
    protected int ramFrequencyMHz;
    protected int cpuFrequencyMHz;
    protected int busWidthBit;
    @XmlElement(name = "VideoCardChipset", required = true)
    @XmlSchemaType(name = "string")
    protected VideoCardChipsetType videoCardChipset;

    /**
     * Gets the value of the ramSizeMb property.
     * 
     */
    public int getRamSizeMb() {
        return ramSizeMb;
    }

    /**
     * Sets the value of the ramSizeMb property.
     * 
     */
    public void setRamSizeMb(int value) {
        this.ramSizeMb = value;
    }

    /**
     * Gets the value of the ramFrequencyMHz property.
     * 
     */
    public int getRamFrequencyMHz() {
        return ramFrequencyMHz;
    }

    /**
     * Sets the value of the ramFrequencyMHz property.
     * 
     */
    public void setRamFrequencyMHz(int value) {
        this.ramFrequencyMHz = value;
    }

    /**
     * Gets the value of the cpuFrequencyMHz property.
     * 
     */
    public int getCpuFrequencyMHz() {
        return cpuFrequencyMHz;
    }

    /**
     * Sets the value of the cpuFrequencyMHz property.
     * 
     */
    public void setCpuFrequencyMHz(int value) {
        this.cpuFrequencyMHz = value;
    }

    /**
     * Gets the value of the busWidthBit property.
     * 
     */
    public int getBusWidthBit() {
        return busWidthBit;
    }

    /**
     * Sets the value of the busWidthBit property.
     * 
     */
    public void setBusWidthBit(int value) {
        this.busWidthBit = value;
    }

    /**
     * Gets the value of the videoCardChipset property.
     * 
     * @return
     *     possible object is
     *     {@link VideoCardChipsetType }
     *     
     */
    public VideoCardChipsetType getVideoCardChipset() {
        return videoCardChipset;
    }

    /**
     * Sets the value of the videoCardChipset property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoCardChipsetType }
     *     
     */
    public void setVideoCardChipset(VideoCardChipsetType value) {
        this.videoCardChipset = value;
    }

}
