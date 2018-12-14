
package com.myidtravel.login.bos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="leisure"/>
 *     &lt;enumeration value="duty"/>
 *     &lt;enumeration value="choose"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OpMode")
@XmlEnum
public enum OpMode {

    @XmlEnumValue("leisure")
    LEISURE("leisure"),
    @XmlEnumValue("duty")
    DUTY("duty"),
    @XmlEnumValue("choose")
    CHOOSE("choose");
    private final String value;

    OpMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpMode fromValue(String v) {
        for (OpMode c: OpMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
