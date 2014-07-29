
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HwShopEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HwShopEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Wares" type="{http://www.example.com/HwShop}WaresEntity"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HwShopEntity", namespace = "http://www.example.com/HwShop", propOrder = {
    "title",
    "address",
    "wares"
})
public class HwShopEntity {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Wares", required = true)
    protected WaresEntity wares;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the wares property.
     * 
     * @return
     *     possible object is
     *     {@link WaresEntity }
     *     
     */
    public WaresEntity getWares() {
        return wares;
    }

    /**
     * Sets the value of the wares property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaresEntity }
     *     
     */
    public void setWares(WaresEntity value) {
        this.wares = value;
    }

}
