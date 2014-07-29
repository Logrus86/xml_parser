
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Cpu" type="{http://www.example.com/HwShop}CpuEntity"/>
 *         &lt;element name="Hdd" type="{http://www.example.com/HwShop}HddEntity"/>
 *         &lt;element name="Monitor" type="{http://www.example.com/HwShop}MonitorEntity"/>
 *         &lt;element name="Motherboard" type="{http://www.example.com/HwShop}MotherboardEntity"/>
 *         &lt;element name="Ram" type="{http://www.example.com/HwShop}RamEntity"/>
 *         &lt;element name="VideoCard" type="{http://www.example.com/HwShop}VideocardEntity"/>
 *         &lt;element name="Notebook" type="{http://www.example.com/HwShop}NotebookEntity"/>
 *         &lt;element name="Pc" type="{http://www.example.com/HwShop}PcEntity"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WareType", namespace = "http://www.example.com/HwShop", propOrder = {
    "cpu",
    "hdd",
    "monitor",
    "motherboard",
    "ram",
    "videoCard",
    "notebook",
    "pc"
})
public class WareType {

    @XmlElement(name = "Cpu")
    protected CpuEntity cpu;
    @XmlElement(name = "Hdd")
    protected HddEntity hdd;
    @XmlElement(name = "Monitor")
    protected MonitorEntity monitor;
    @XmlElement(name = "Motherboard")
    protected MotherboardEntity motherboard;
    @XmlElement(name = "Ram")
    protected RamEntity ram;
    @XmlElement(name = "VideoCard")
    protected VideocardEntity videoCard;
    @XmlElement(name = "Notebook")
    protected NotebookEntity notebook;
    @XmlElement(name = "Pc")
    protected PcEntity pc;

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
     * Gets the value of the motherboard property.
     * 
     * @return
     *     possible object is
     *     {@link MotherboardEntity }
     *     
     */
    public MotherboardEntity getMotherboard() {
        return motherboard;
    }

    /**
     * Sets the value of the motherboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link MotherboardEntity }
     *     
     */
    public void setMotherboard(MotherboardEntity value) {
        this.motherboard = value;
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
     * Gets the value of the videoCard property.
     * 
     * @return
     *     possible object is
     *     {@link VideocardEntity }
     *     
     */
    public VideocardEntity getVideoCard() {
        return videoCard;
    }

    /**
     * Sets the value of the videoCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideocardEntity }
     *     
     */
    public void setVideoCard(VideocardEntity value) {
        this.videoCard = value;
    }

    /**
     * Gets the value of the notebook property.
     * 
     * @return
     *     possible object is
     *     {@link NotebookEntity }
     *     
     */
    public NotebookEntity getNotebook() {
        return notebook;
    }

    /**
     * Sets the value of the notebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotebookEntity }
     *     
     */
    public void setNotebook(NotebookEntity value) {
        this.notebook = value;
    }

    /**
     * Gets the value of the pc property.
     * 
     * @return
     *     possible object is
     *     {@link PcEntity }
     *     
     */
    public PcEntity getPc() {
        return pc;
    }

    /**
     * Sets the value of the pc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PcEntity }
     *     
     */
    public void setPc(PcEntity value) {
        this.pc = value;
    }

}
