
package com.myidtravel.login.bos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmploymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmploymentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="absent"/>
 *     &lt;enumeration value="temporary"/>
 *     &lt;enumeration value="retired"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmploymentStatus")
@XmlEnum
public enum EmploymentStatus {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("absent")
    ABSENT("absent"),
    @XmlEnumValue("temporary")
    TEMPORARY("temporary"),
    @XmlEnumValue("retired")
    RETIRED("retired");
    private final String value;

    EmploymentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmploymentStatus fromValue(String v) {
        for (EmploymentStatus c: EmploymentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
