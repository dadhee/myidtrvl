
package com.myidtravel.login.bos;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MyIDTravelLoginRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyIDTravelLoginRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee" type="{http://bos.login.myidtravel.com}Employee"/>
 *         &lt;element name="dutyTravel" type="{http://bos.login.myidtravel.com}DutyTravel" minOccurs="0"/>
 *         &lt;element name="leisureTravel" type="{http://bos.login.myidtravel.com}LeisureTravel" minOccurs="0"/>
 *         &lt;element name="booking" type="{http://bos.login.myidtravel.com}Booking" minOccurs="0"/>
 *         &lt;element name="routeInfo" type="{http://bos.login.myidtravel.com}RouteInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="master-access" type="{http://bos.login.myidtravel.com}MasterAccess" minOccurs="0"/>
 *         &lt;element name="admin-access" type="{http://bos.login.myidtravel.com}AdminAccess" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ac" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="opMode" use="required" type="{http://bos.login.myidtravel.com}OpMode" />
 *       &lt;attribute name="prefLanguage" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyIDTravelLoginRequest", propOrder = {
    "employee",
    "dutyTravel",
    "leisureTravel",
    "booking",
    "routeInfo",
    "masterAccess",
    "adminAccess"
})
public class MyIDTravelLoginRequest {

    @XmlElement(required = true)
    protected Employee employee;
    protected DutyTravel dutyTravel;
    protected LeisureTravel leisureTravel;
    protected Booking booking;
    protected List<RouteInfo> routeInfo;
    @XmlElement(name = "master-access")
    protected MasterAccess masterAccess;
    @XmlElement(name = "admin-access")
    protected AdminAccess adminAccess;
    @XmlAttribute(required = true)
    protected String ac;
    @XmlAttribute(name = "aID")
    protected BigInteger aid;
    @XmlAttribute(required = true)
    protected OpMode opMode;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String prefLanguage;
    @XmlAttribute
    protected String action;

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEmployee(Employee value) {
        this.employee = value;
    }

    /**
     * Gets the value of the dutyTravel property.
     * 
     * @return
     *     possible object is
     *     {@link DutyTravel }
     *     
     */
    public DutyTravel getDutyTravel() {
        return dutyTravel;
    }

    /**
     * Sets the value of the dutyTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyTravel }
     *     
     */
    public void setDutyTravel(DutyTravel value) {
        this.dutyTravel = value;
    }

    /**
     * Gets the value of the leisureTravel property.
     * 
     * @return
     *     possible object is
     *     {@link LeisureTravel }
     *     
     */
    public LeisureTravel getLeisureTravel() {
        return leisureTravel;
    }

    /**
     * Sets the value of the leisureTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeisureTravel }
     *     
     */
    public void setLeisureTravel(LeisureTravel value) {
        this.leisureTravel = value;
    }

    /**
     * Gets the value of the booking property.
     * 
     * @return
     *     possible object is
     *     {@link Booking }
     *     
     */
    public Booking getBooking() {
        return booking;
    }

    /**
     * Sets the value of the booking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking }
     *     
     */
    public void setBooking(Booking value) {
        this.booking = value;
    }

    /**
     * Gets the value of the routeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteInfo }
     * 
     * 
     */
    public List<RouteInfo> getRouteInfo() {
        if (routeInfo == null) {
            routeInfo = new ArrayList<RouteInfo>();
        }
        return this.routeInfo;
    }

    /**
     * Gets the value of the masterAccess property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAccess }
     *     
     */
    public MasterAccess getMasterAccess() {
        return masterAccess;
    }

    /**
     * Sets the value of the masterAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAccess }
     *     
     */
    public void setMasterAccess(MasterAccess value) {
        this.masterAccess = value;
    }

    /**
     * Gets the value of the adminAccess property.
     * 
     * @return
     *     possible object is
     *     {@link AdminAccess }
     *     
     */
    public AdminAccess getAdminAccess() {
        return adminAccess;
    }

    /**
     * Sets the value of the adminAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminAccess }
     *     
     */
    public void setAdminAccess(AdminAccess value) {
        this.adminAccess = value;
    }

    /**
     * Gets the value of the ac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAc() {
        return ac;
    }

    /**
     * Sets the value of the ac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAc(String value) {
        this.ac = value;
    }

    /**
     * Gets the value of the aid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAID() {
        return aid;
    }

    /**
     * Sets the value of the aid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAID(BigInteger value) {
        this.aid = value;
    }

    /**
     * Gets the value of the opMode property.
     * 
     * @return
     *     possible object is
     *     {@link OpMode }
     *     
     */
    public OpMode getOpMode() {
        return opMode;
    }

    /**
     * Sets the value of the opMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpMode }
     *     
     */
    public void setOpMode(OpMode value) {
        this.opMode = value;
    }

    /**
     * Gets the value of the prefLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefLanguage() {
        return prefLanguage;
    }

    /**
     * Sets the value of the prefLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefLanguage(String value) {
        this.prefLanguage = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

}
