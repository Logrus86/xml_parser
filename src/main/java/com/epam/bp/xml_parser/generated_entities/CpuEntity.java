
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CpuEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CpuEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequencyMHz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coreQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="techProcessNm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="socket" type="{http://www.example.com/HwShop}SocketType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpuEntity", namespace = "http://www.example.com/HwShop", propOrder = {
    "frequencyMHz",
    "coreQuantity",
    "techProcessNm",
    "socket"
})
public class CpuEntity {

    protected int frequencyMHz;
    protected int coreQuantity;
    protected int techProcessNm;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SocketType socket;

    /**
     * Gets the value of the frequencyMHz property.
     * 
     */
    public int getFrequencyMHz() {
        return frequencyMHz;
    }

    /**
     * Sets the value of the frequencyMHz property.
     * 
     */
    public void setFrequencyMHz(int value) {
        this.frequencyMHz = value;
    }

    /**
     * Gets the value of the coreQuantity property.
     * 
     */
    public int getCoreQuantity() {
        return coreQuantity;
    }

    /**
     * Sets the value of the coreQuantity property.
     * 
     */
    public void setCoreQuantity(int value) {
        this.coreQuantity = value;
    }

    /**
     * Gets the value of the techProcessNm property.
     * 
     */
    public int getTechProcessNm() {
        return techProcessNm;
    }

    /**
     * Sets the value of the techProcessNm property.
     * 
     */
    public void setTechProcessNm(int value) {
        this.techProcessNm = value;
    }

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

}
