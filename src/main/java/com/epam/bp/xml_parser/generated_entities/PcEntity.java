
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PcEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PcEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cpu" type="{http://www.example.com/HwShop}CpuEntity"/>
 *         &lt;element name="Hdd" type="{http://www.example.com/HwShop}HddEntity"/>
 *         &lt;element name="Ram" type="{http://www.example.com/HwShop}RamEntity"/>
 *         &lt;element name="Videocard" type="{http://www.example.com/HwShop}VideocardEntity"/>
 *         &lt;element name="Monitor" type="{http://www.example.com/HwShop}MonitorEntity"/>
 *         &lt;element name="mouseAndKeyboardIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="speakersIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PreinstalledOs" type="{http://www.example.com/HwShop}PreinstalledOsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PcEntity", namespace = "http://www.example.com/HwShop", propOrder = {
    "cpu",
    "hdd",
    "ram",
    "videocard",
    "monitor",
    "mouseAndKeyboardIncluded",
    "speakersIncluded",
    "preinstalledOs"
})
public class PcEntity {

    @XmlElement(name = "Cpu", required = true)
    protected CpuEntity cpu;
    @XmlElement(name = "Hdd", required = true)
    protected HddEntity hdd;
    @XmlElement(name = "Ram", required = true)
    protected RamEntity ram;
    @XmlElement(name = "Videocard", required = true)
    protected VideocardEntity videocard;
    @XmlElement(name = "Monitor", required = true)
    protected MonitorEntity monitor;
    protected boolean mouseAndKeyboardIncluded;
    protected boolean speakersIncluded;
    @XmlElement(name = "PreinstalledOs", required = true)
    @XmlSchemaType(name = "string")
    protected PreinstalledOsType preinstalledOs;

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
     * Gets the value of the monitor property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorEntity }
     *     
     */
    public MonitorEntity getMonitor() {
        return monitor;
    }

    /**
     * Sets the value of the monitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorEntity }
     *     
     */
    public void setMonitor(MonitorEntity value) {
        this.monitor = value;
    }

    /**
     * Gets the value of the mouseAndKeyboardIncluded property.
     * 
     */
    public boolean isMouseAndKeyboardIncluded() {
        return mouseAndKeyboardIncluded;
    }

    /**
     * Sets the value of the mouseAndKeyboardIncluded property.
     * 
     */
    public void setMouseAndKeyboardIncluded(boolean value) {
        this.mouseAndKeyboardIncluded = value;
    }

    /**
     * Gets the value of the speakersIncluded property.
     * 
     */
    public boolean isSpeakersIncluded() {
        return speakersIncluded;
    }

    /**
     * Sets the value of the speakersIncluded property.
     * 
     */
    public void setSpeakersIncluded(boolean value) {
        this.speakersIncluded = value;
    }

    /**
     * Gets the value of the preinstalledOs property.
     * 
     * @return
     *     possible object is
     *     {@link PreinstalledOsType }
     *     
     */
    public PreinstalledOsType getPreinstalledOs() {
        return preinstalledOs;
    }

    /**
     * Sets the value of the preinstalledOs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreinstalledOsType }
     *     
     */
    public void setPreinstalledOs(PreinstalledOsType value) {
        this.preinstalledOs = value;
    }

}
