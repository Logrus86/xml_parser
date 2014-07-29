
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreinstalledOsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreinstalledOsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="DOS"/>
 *     &lt;enumeration value="LINUX"/>
 *     &lt;enumeration value="MACOSX"/>
 *     &lt;enumeration value="MSWINDOWS7"/>
 *     &lt;enumeration value="MSWINDOWS8"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreinstalledOsType", namespace = "http://www.example.com/HwShop")
@XmlEnum
public enum PreinstalledOsType {

    NONE("NONE"),
    DOS("DOS"),
    LINUX("LINUX"),
    MACOSX("MACOSX"),
    @XmlEnumValue("MSWINDOWS7")
    MSWINDOWS_7("MSWINDOWS7"),
    @XmlEnumValue("MSWINDOWS8")
    MSWINDOWS_8("MSWINDOWS8");
    private final String value;

    PreinstalledOsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreinstalledOsType fromValue(String v) {
        for (PreinstalledOsType c: PreinstalledOsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
