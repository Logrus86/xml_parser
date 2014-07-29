
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormFactorMbType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormFactorMbType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATX"/>
 *     &lt;enumeration value="MICROATX"/>
 *     &lt;enumeration value="MINI_ITX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FormFactorMbType", namespace = "http://www.example.com/HwShop")
@XmlEnum
public enum FormFactorMbType {

    ATX,
    MICROATX,
    MINI_ITX;

    public String value() {
        return name();
    }

    public static FormFactorMbType fromValue(String v) {
        return valueOf(v);
    }

}
