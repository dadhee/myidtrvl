
package com.myidtravel.login.bos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LeisureTravel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeisureTravel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eligibleForAirlines" type="{http://bos.login.myidtravel.com}Airlines" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="leisurePriority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leisureServiceClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeisureTravel", propOrder = {
    "eligibleForAirlines"
})
public class LeisureTravel {

    protected Airlines eligibleForAirlines;
    @XmlAttribute
    protected String leisurePriority;
    @XmlAttribute
    protected String leisureServiceClass;

    /**
     * Gets the value of the eligibleForAirlines property.
     * 
     * @return
     *     possible object is
     *     {@link Airlines }
     *     
     */
    public Airlines getEligibleForAirlines() {
        return eligibleForAirlines;
    }

    /**
     * Sets the value of the eligibleForAirlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Airlines }
     *     
     */
    public void setEligibleForAirlines(Airlines value) {
        this.eligibleForAirlines = value;
    }

    /**
     * Gets the value of the leisurePriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeisurePriority() {
        return leisurePriority;
    }

    /**
     * Sets the value of the leisurePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeisurePriority(String value) {
        this.leisurePriority = value;
    }

    /**
     * Gets the value of the leisureServiceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeisureServiceClass() {
        return leisureServiceClass;
    }

    /**
     * Sets the value of the leisureServiceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeisureServiceClass(String value) {
        this.leisureServiceClass = value;
    }

}
