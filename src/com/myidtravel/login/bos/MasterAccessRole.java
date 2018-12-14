
package com.myidtravel.login.bos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MasterAccessRole.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MasterAccessRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MA_DUTY"/>
 *     &lt;enumeration value="MA_LEISURE"/>
 *     &lt;enumeration value="DELEGATE_DUTY"/>
 *     &lt;enumeration value="DELEGATE_LEISURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MasterAccessRole")
@XmlEnum
public enum MasterAccessRole {

    MA_DUTY,
    MA_LEISURE,
    DELEGATE_DUTY,
    DELEGATE_LEISURE;

    public String value() {
        return name();
    }

    public static MasterAccessRole fromValue(String v) {
        return valueOf(v);
    }

}
