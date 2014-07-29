
package com.epam.bp.xml_parser.generated_entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoCardChipsetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VideoCardChipsetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RADEON"/>
 *     &lt;enumeration value="GEFORCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VideoCardChipsetType", namespace = "http://www.example.com/HwShop")
@XmlEnum
public enum VideoCardChipsetType {

    RADEON,
    GEFORCE;

    public String value() {
        return name();
    }

    public static VideoCardChipsetType fromValue(String v) {
        return valueOf(v);
    }

}
