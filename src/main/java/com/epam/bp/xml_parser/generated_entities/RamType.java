
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RamType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RamType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DDR2"/>
 *     &lt;enumeration value="DDR3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RamType", namespace = "http://www.example.com/HwShop")
@XmlEnum
public enum RamType {

    @XmlEnumValue("DDR2")
    DDR_2("DDR2"),
    @XmlEnumValue("DDR3")
    DDR_3("DDR3");
    private final String value;

    RamType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RamType fromValue(String v) {
        for (RamType c: RamType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
