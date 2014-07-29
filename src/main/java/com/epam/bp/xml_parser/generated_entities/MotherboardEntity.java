
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MotherboardEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MotherboardEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="socket" type="{http://www.example.com/HwShop}SocketType"/>
 *         &lt;element name="vgaOnboard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="raidOnboard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="formfactorMb" type="{http://www.example.com/HwShop}FormFactorMbType"/>
 *         &lt;element name="sataCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="usbCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ddrCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxRamSizeGb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MotherboardEntity", namespace = "http://www.example.com/HwShop", propOrder = {
    "socket",
    "vgaOnboard",
    "raidOnboard",
    "formfactorMb",
    "sataCount",
    "usbCount",
    "ddrCount",
    "maxRamSizeGb"
})
public class MotherboardEntity {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SocketType socket;
    protected boolean vgaOnboard;
    protected boolean raidOnboard;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FormFactorMbType formfactorMb;
    protected int sataCount;
    protected int usbCount;
    protected int ddrCount;
    protected int maxRamSizeGb;

    /**
     * Gets the value of the socket property.
     * 
     * @return
     *     possible object is
     *     {@link SocketType }
     *     
     */
    public SocketType getSocket() {
        return socket;
    }

    /**
     * Sets the value of the socket property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocketType }
     *     
     */
    public void setSocket(SocketType value) {
        this.socket = value;
    }

    /**
     * Gets the value of the vgaOnboard property.
     * 
     */
    public boolean isVgaOnboard() {
        return vgaOnboard;
    }

    /**
     * Sets the value of the vgaOnboard property.
     * 
     */
    public void setVgaOnboard(boolean value) {
        this.vgaOnboard = value;
    }

    /**
     * Gets the value of the raidOnboard property.
     * 
     */
    public boolean isRaidOnboard() {
        return raidOnboard;
    }

    /**
     * Sets the value of the raidOnboard property.
     * 
     */
    public void setRaidOnboard(boolean value) {
        this.raidOnboard = value;
    }

    /**
     * Gets the value of the formfactorMb property.
     * 
     * @return
     *     possible object is
     *     {@link FormFactorMbType }
     *     
     */
    public FormFactorMbType getFormfactorMb() {
        return formfactorMb;
    }

    /**
     * Sets the value of the formfactorMb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormFactorMbType }
     *     
     */
    public void setFormfactorMb(FormFactorMbType value) {
        this.formfactorMb = value;
    }

    /**
     * Gets the value of the sataCount property.
     * 
     */
    public int getSataCount() {
        return sataCount;
    }

    /**
     * Sets the value of the sataCount property.
     * 
     */
    public void setSataCount(int value) {
        this.sataCount = value;
    }

    /**
     * Gets the value of the usbCount property.
     * 
     */
    public int getUsbCount() {
        return usbCount;
    }

    /**
     * Sets the value of the usbCount property.
     * 
     */
    public void setUsbCount(int value) {
        this.usbCount = value;
    }

    /**
     * Gets the value of the ddrCount property.
     * 
     */
    public int getDdrCount() {
        return ddrCount;
    }

    /**
     * Sets the value of the ddrCount property.
     * 
     */
    public void setDdrCount(int value) {
        this.ddrCount = value;
    }

    /**
     * Gets the value of the maxRamSizeGb property.
     * 
     */
    public int getMaxRamSizeGb() {
        return maxRamSizeGb;
    }

    /**
     * Sets the value of the maxRamSizeGb property.
     * 
     */
    public void setMaxRamSizeGb(int value) {
        this.maxRamSizeGb = value;
    }

}
