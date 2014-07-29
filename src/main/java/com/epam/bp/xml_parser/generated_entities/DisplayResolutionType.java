
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayResolutionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisplayResolutionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="H1920V1080"/>
 *     &lt;enumeration value="H1366V768"/>
 *     &lt;enumeration value="H1600V900"/>
 *     &lt;enumeration value="H1920V1200"/>
 *     &lt;enumeration value="H2560V1080"/>
 *     &lt;enumeration value="H2560V1440"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisplayResolutionType", namespace = "http://www.example.com/HwShop")
@XmlEnum
public enum DisplayResolutionType {

    @XmlEnumValue("H1920V1080")
    H_1920_V_1080("H1920V1080"),
    @XmlEnumValue("H1366V768")
    H_1366_V_768("H1366V768"),
    @XmlEnumValue("H1600V900")
    H_1600_V_900("H1600V900"),
    @XmlEnumValue("H1920V1200")
    H_1920_V_1200("H1920V1200"),
    @XmlEnumValue("H2560V1080")
    H_2560_V_1080("H2560V1080"),
    @XmlEnumValue("H2560V1440")
    H_2560_V_1440("H2560V1440");
    private final String value;

    DisplayResolutionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisplayResolutionType fromValue(String v) {
        for (DisplayResolutionType c: DisplayResolutionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
