
package com.myidtravel.login.bos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Salutation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Salutation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MRS"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="CHD"/>
 *     &lt;enumeration value="INF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Salutation")
@XmlEnum
public enum Salutation {

    MR,
    MRS,
    MS,
    CHD,
    INF;

    public String value() {
        return name();
    }

    public static Salutation fromValue(String v) {
        return valueOf(v);
    }

}
