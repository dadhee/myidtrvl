
package com.myidtravel.login.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.myidtravel.login.bos.MyIDTravelLoginRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://bos.login.myidtravel.com}MyIDTravelLoginRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "login"
})
@XmlRootElement(name = "login")
public class Login {

    @XmlElementRef(name = "login", namespace = "http://service.login.myidtravel.com", type = JAXBElement.class)
    protected JAXBElement<MyIDTravelLoginRequest> login;

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MyIDTravelLoginRequest }{@code >}
     *     
     */
    public JAXBElement<MyIDTravelLoginRequest> getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MyIDTravelLoginRequest }{@code >}
     *     
     */
    public void setLogin(JAXBElement<MyIDTravelLoginRequest> value) {
        this.login = ((JAXBElement<MyIDTravelLoginRequest> ) value);
    }

}
