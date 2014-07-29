
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotebookEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotebookEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displaySizeInches" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cpu" type="{http://www.example.com/HwShop}CpuEntity"/>
 *         &lt;element name="Hdd" type="{http://www.example.com/HwShop}HddEntity"/>
 *         &lt;element name="Ram" type="{http://www.example.com/HwShop}RamEntity"/>
 *         &lt;element name="Videocard" type="{http://www.example.com/HwShop}VideocardEntity"/>
 *         &lt;element name="displayResolution" type="{http://www.example.com/HwShop}DisplayResolutionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotebookEntity", namespace = "http://www.example.com/HwShop", propOrder = {
    "displaySizeInches",
    "cpu",
    "hdd",
    "ram",
    "videocard",
    "displayResolution"
})
public class NotebookEntity {

    protected int displaySizeInches;
    @XmlElement(name = "Cpu", required = true)
    protected CpuEntity cpu;
    @XmlElement(name = "Hdd", required = true)
    protected HddEntity hdd;
    @XmlElement(name = "Ram", required = true)
    protected RamEntity ram;
    @XmlElement(name = "Videocard", required = true)
    protected VideocardEntity videocard;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DisplayResolutionType displayResolution;

    /**
     * Gets the value of the displaySizeInches property.
     * 
     */
    public int getDisplaySizeInches() {
        return displaySizeInches;
    }

    /**
     * Sets the value of the displaySizeInches property.
     * 
     */
    public void setDisplaySizeInches(int value) {
        this.displaySizeInches = value;
    }

    /**
     * Gets the value of the cpu property.
     * 
     * @return
     *     possible object is
     *     {@link CpuEntity }
     *     
     */
    public CpuEntity getCpu() {
        return cpu;
    }

    /**
     * Sets the value of the cpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpuEntity }
     *     
     */
    public void setCpu(CpuEntity value) {
        this.cpu = value;
    }

    /**
     * Gets the value of the hdd property.
     * 
     * @return
     *     possible object is
     *     {@link HddEntity }
     *     
     */
    public HddEntity getHdd() {
        return hdd;
    }

    /**
     * Sets the value of the hdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HddEntity }
     *     
     */
    public void setHdd(HddEntity value) {
        this.hdd = value;
    }

    /**
     * Gets the value of the ram property.
     * 
     * @return
     *     possible object is
     *     {@link RamEntity }
     *     
     */
    public RamEntity getRam() {
        return ram;
    }

    /**
     * Sets the value of the ram property.
     * 
     * @param value
     *     allowed object is
     *     {@link RamEntity }
     *     
     */
    public void setRam(RamEntity value) {
        this.ram = value;
    }

    /**
     * Gets the value of the videocard property.
     * 
     * @return
     *     possible object is
     *     {@link VideocardEntity }
     *     
     */
    public VideocardEntity getVideocard() {
        return videocard;
    }

    /**
     * Sets the value of the videocard property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideocardEntity }
     *     
     */
    public void setVideocard(VideocardEntity value) {
        this.videocard = value;
    }

    /**
     * Gets the value of the displayResolution property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayResolutionType }
     *     
     */
    public DisplayResolutionType getDisplayResolution() {
        return displayResolution;
    }

    /**
     * Sets the value of the displayResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayResolutionType }
     *     
     */
    public void setDisplayResolution(DisplayResolutionType value) {
        this.displayResolution = value;
    }

}
