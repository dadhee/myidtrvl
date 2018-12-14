
package com.myidtravel.login.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.myidtravel.login.bos.MyIDTravelLoginRequest;
import com.myidtravel.login.bos.MyIDTravelLoginResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.myidtravel.login.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginLogin_QNAME = new QName("http://service.login.myidtravel.com", "login");
    private final static QName _LoginResponseReturn_QNAME = new QName("http://service.login.myidtravel.com", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.myidtravel.login.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyIDTravelLoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.login.myidtravel.com", name = "login", scope = Login.class)
    public JAXBElement<MyIDTravelLoginRequest> createLoginLogin(MyIDTravelLoginRequest value) {
        return new JAXBElement<MyIDTravelLoginRequest>(_LoginLogin_QNAME, MyIDTravelLoginRequest.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyIDTravelLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.login.myidtravel.com", name = "return", scope = LoginResponse.class)
    public JAXBElement<MyIDTravelLoginResponse> createLoginResponseReturn(MyIDTravelLoginResponse value) {
        return new JAXBElement<MyIDTravelLoginResponse>(_LoginResponseReturn_QNAME, MyIDTravelLoginResponse.class, LoginResponse.class, value);
    }

}
