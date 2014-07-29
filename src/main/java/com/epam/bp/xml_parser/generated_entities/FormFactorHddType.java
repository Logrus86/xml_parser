
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormFactorHddType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormFactorHddType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCHES2DOT5"/>
 *     &lt;enumeration value="INCHES3DOT5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FormFactorHddType", namespace = "http://www.example.com/HwShop")
@XmlEnum
public enum FormFactorHddType {

    @XmlEnumValue("INCHES2DOT5")
    INCHES_2_DOT_5("INCHES2DOT5"),
    @XmlEnumValue("INCHES3DOT5")
    INCHES_3_DOT_5("INCHES3DOT5");
    private final String value;

    FormFactorHddType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormFactorHddType fromValue(String v) {
        for (FormFactorHddType c: FormFactorHddType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
