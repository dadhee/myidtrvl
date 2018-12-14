
package com.myidtravel.login.bos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutyTravel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyTravel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eligibleForAirlines" type="{http://bos.login.myidtravel.com}Airlines" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dutyServiceClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dutyPriority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="paymentAccount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="travelOrder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="travelOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyTravel", propOrder = {
    "eligibleForAirlines"
})
public class DutyTravel {

    protected Airlines eligibleForAirlines;
    @XmlAttribute
    protected String dutyServiceClass;
    @XmlAttribute
    protected String dutyPriority;
    @XmlAttribute
    protected String paymentAccount;
    @XmlAttribute
    protected String travelOrder;
    @XmlAttribute
    protected String travelOrderNumber;

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
     * Gets the value of the dutyServiceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyServiceClass() {
        return dutyServiceClass;
    }

    /**
     * Sets the value of the dutyServiceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyServiceClass(String value) {
        this.dutyServiceClass = value;
    }

    /**
     * Gets the value of the dutyPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyPriority() {
        return dutyPriority;
    }

    /**
     * Sets the value of the dutyPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyPriority(String value) {
        this.dutyPriority = value;
    }

    /**
     * Gets the value of the paymentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccount() {
        return paymentAccount;
    }

    /**
     * Sets the value of the paymentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccount(String value) {
        this.paymentAccount = value;
    }

    /**
     * Gets the value of the travelOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelOrder() {
        return travelOrder;
    }

    /**
     * Sets the value of the travelOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelOrder(String value) {
        this.travelOrder = value;
    }

    /**
     * Gets the value of the travelOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelOrderNumber() {
        return travelOrderNumber;
    }

    /**
     * Sets the value of the travelOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelOrderNumber(String value) {
        this.travelOrderNumber = value;
    }

}
