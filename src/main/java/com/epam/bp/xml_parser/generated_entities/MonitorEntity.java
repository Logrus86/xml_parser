
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitorEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitorEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displaySizeInches" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vgaOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dviOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hdmiOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="speakersBuiltin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "MonitorEntity", namespace = "http://www.example.com/HwShop", propOrder = {
    "displaySizeInches",
    "vgaOut",
    "dviOut",
    "hdmiOut",
    "speakersBuiltin",
    "displayResolution"
})
public class MonitorEntity {

    protected int displaySizeInches;
    protected boolean vgaOut;
    protected boolean dviOut;
    protected boolean hdmiOut;
    protected boolean speakersBuiltin;
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
     * Gets the value of the vgaOut property.
     * 
     */
    public boolean isVgaOut() {
        return vgaOut;
    }

    /**
     * Sets the value of the vgaOut property.
     * 
     */
    public void setVgaOut(boolean value) {
        this.vgaOut = value;
    }

    /**
     * Gets the value of the dviOut property.
     * 
     */
    public boolean isDviOut() {
        return dviOut;
    }

    /**
     * Sets the value of the dviOut property.
     * 
     */
    public void setDviOut(boolean value) {
        this.dviOut = value;
    }

    /**
     * Gets the value of the hdmiOut property.
     * 
     */
    public boolean isHdmiOut() {
        return hdmiOut;
    }

    /**
     * Sets the value of the hdmiOut property.
     * 
     */
    public void setHdmiOut(boolean value) {
        this.hdmiOut = value;
    }

    /**
     * Gets the value of the speakersBuiltin property.
     * 
     */
    public boolean isSpeakersBuiltin() {
        return speakersBuiltin;
    }

    /**
     * Sets the value of the speakersBuiltin property.
     * 
     */
    public void setSpeakersBuiltin(boolean value) {
        this.speakersBuiltin = value;
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
