
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocketType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SocketType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LGA1150"/>
 *     &lt;enumeration value="LGA1155"/>
 *     &lt;enumeration value="LGA1156"/>
 *     &lt;enumeration value="FM1"/>
 *     &lt;enumeration value="FM2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SocketType", namespace = "http://www.example.com/HwShop")
@XmlEnum
public enum SocketType {

    @XmlEnumValue("LGA1150")
    LGA_1150("LGA1150"),
    @XmlEnumValue("LGA1155")
    LGA_1155("LGA1155"),
    @XmlEnumValue("LGA1156")
    LGA_1156("LGA1156"),
    @XmlEnumValue("FM1")
    FM_1("FM1"),
    @XmlEnumValue("FM2")
    FM_2("FM2");
    private final String value;

    SocketType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SocketType fromValue(String v) {
        for (SocketType c: SocketType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
