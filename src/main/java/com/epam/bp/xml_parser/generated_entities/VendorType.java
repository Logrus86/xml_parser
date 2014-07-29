
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VendorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VendorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMD"/>
 *     &lt;enumeration value="INTEL"/>
 *     &lt;enumeration value="NVIDIA"/>
 *     &lt;enumeration value="ASUS"/>
 *     &lt;enumeration value="HP"/>
 *     &lt;enumeration value="DELL"/>
 *     &lt;enumeration value="LENOVO"/>
 *     &lt;enumeration value="ACER"/>
 *     &lt;enumeration value="SAMSUNG"/>
 *     &lt;enumeration value="APPLE"/>
 *     &lt;enumeration value="TOSHIBA"/>
 *     &lt;enumeration value="GIGABYTE"/>
 *     &lt;enumeration value="MSI"/>
 *     &lt;enumeration value="PHILLIPS"/>
 *     &lt;enumeration value="SONY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VendorType", namespace = "http://www.example.com/HwShop")
@XmlEnum
public enum VendorType {

    AMD,
    INTEL,
    NVIDIA,
    ASUS,
    HP,
    DELL,
    LENOVO,
    ACER,
    SAMSUNG,
    APPLE,
    TOSHIBA,
    GIGABYTE,
    MSI,
    PHILLIPS,
    SONY;

    public String value() {
        return name();
    }

    public static VendorType fromValue(String v) {
        return valueOf(v);
    }

}
