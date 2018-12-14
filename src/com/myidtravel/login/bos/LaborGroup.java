
package com.myidtravel.login.bos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LaborGroup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LaborGroup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pilot"/>
 *     &lt;enumeration value="Cabin"/>
 *     &lt;enumeration value="Ground"/>
 *     &lt;enumeration value="SVP"/>
 *     &lt;enumeration value="VP"/>
 *     &lt;enumeration value="EXEC"/>
 *     &lt;enumeration value="Director"/>
 *     &lt;enumeration value="FoundingOfficer"/>
 *     &lt;enumeration value="FoundingDirector"/>
 *     &lt;enumeration value="Flight"/>
 *     &lt;enumeration value="Inflight"/>
 *     &lt;enumeration value="Provisional"/>
 *     &lt;enumeration value="MGR"/>
 *     &lt;enumeration value="BOD"/>
 *     &lt;enumeration value="Retiree"/>
 *     &lt;enumeration value="Permanent"/>
 *     &lt;enumeration value="President"/>
 *     &lt;enumeration value="Globalia"/>
 *     &lt;enumeration value="Probation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LaborGroup")
@XmlEnum
public enum LaborGroup {

    @XmlEnumValue("Pilot")
    PILOT("Pilot"),
    @XmlEnumValue("Cabin")
    CABIN("Cabin"),
    @XmlEnumValue("Ground")
    GROUND("Ground"),
    SVP("SVP"),
    VP("VP"),
    EXEC("EXEC"),
    @XmlEnumValue("Director")
    DIRECTOR("Director"),
    @XmlEnumValue("FoundingOfficer")
    FOUNDING_OFFICER("FoundingOfficer"),
    @XmlEnumValue("FoundingDirector")
    FOUNDING_DIRECTOR("FoundingDirector"),
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),
    @XmlEnumValue("Inflight")
    INFLIGHT("Inflight"),
    @XmlEnumValue("Provisional")
    PROVISIONAL("Provisional"),
    MGR("MGR"),
    BOD("BOD"),
    @XmlEnumValue("Retiree")
    RETIREE("Retiree"),
    @XmlEnumValue("Permanent")
    PERMANENT("Permanent"),
    @XmlEnumValue("President")
    PRESIDENT("President"),
    @XmlEnumValue("Globalia")
    GLOBALIA("Globalia"),
    @XmlEnumValue("Probation")
    PROBATION("Probation");
    private final String value;

    LaborGroup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LaborGroup fromValue(String v) {
        for (LaborGroup c: LaborGroup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
