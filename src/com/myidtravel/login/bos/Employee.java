
package com.myidtravel.login.bos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employment" type="{http://bos.login.myidtravel.com}Employment"/>
 *         &lt;element name="accounting" type="{http://bos.login.myidtravel.com}Accounting" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://bos.login.myidtravel.com}Contact" minOccurs="0"/>
 *         &lt;element name="lock-date" type="{http://bos.login.myidtravel.com}LockDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ptc-allotment" type="{http://bos.login.myidtravel.com}PTCAllotment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entitled-person" type="{http://bos.login.myidtravel.com}EntitledPerson" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ptc" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="middlename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salutation" type="{http://bos.login.myidtravel.com}Salutation" />
 *       &lt;attribute name="gender" type="{http://bos.login.myidtravel.com}Gender" />
 *       &lt;attribute name="dob" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="dhc" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="countryOfRes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tourCodeExt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employee", propOrder = {
    "employment",
    "accounting",
    "contact",
    "lockDate",
    "ptcAllotment",
    "entitledPerson"
})
public class Employee {

    @XmlElement(required = true)
    protected Employment employment;
    protected Accounting accounting;
    protected Contact contact;
    @XmlElement(name = "lock-date", nillable = true)
    protected List<LockDate> lockDate;
    @XmlElement(name = "ptc-allotment", nillable = true)
    protected List<PTCAllotment> ptcAllotment;
    @XmlElement(name = "entitled-person", nillable = true)
    protected List<EntitledPerson> entitledPerson;
    @XmlAttribute(required = true)
    protected String ptc;
    @XmlAttribute(required = true)
    protected String lastname;
    @XmlAttribute(required = true)
    protected String firstname;
    @XmlAttribute
    protected String middlename;
    @XmlAttribute
    protected Salutation salutation;
    @XmlAttribute
    protected Gender gender;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlAttribute
    protected Boolean dhc;
    @XmlAttribute
    protected String currency;
    @XmlAttribute
    protected String countryOfRes;
    @XmlAttribute
    protected String tourCodeExt;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String extension;

    /**
     * Gets the value of the employment property.
     * 
     * @return
     *     possible object is
     *     {@link Employment }
     *     
     */
    public Employment getEmployment() {
        return employment;
    }

    /**
     * Sets the value of the employment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employment }
     *     
     */
    public void setEmployment(Employment value) {
        this.employment = value;
    }

    /**
     * Gets the value of the accounting property.
     * 
     * @return
     *     possible object is
     *     {@link Accounting }
     *     
     */
    public Accounting getAccounting() {
        return accounting;
    }

    /**
     * Sets the value of the accounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accounting }
     *     
     */
    public void setAccounting(Accounting value) {
        this.accounting = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the lockDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lockDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLockDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LockDate }
     * 
     * 
     */
    public List<LockDate> getLockDate() {
        if (lockDate == null) {
            lockDate = new ArrayList<LockDate>();
        }
        return this.lockDate;
    }

    /**
     * Gets the value of the ptcAllotment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcAllotment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtcAllotment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCAllotment }
     * 
     * 
     */
    public List<PTCAllotment> getPtcAllotment() {
        if (ptcAllotment == null) {
            ptcAllotment = new ArrayList<PTCAllotment>();
        }
        return this.ptcAllotment;
    }

    /**
     * Gets the value of the entitledPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entitledPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitledPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitledPerson }
     * 
     * 
     */
    public List<EntitledPerson> getEntitledPerson() {
        if (entitledPerson == null) {
            entitledPerson = new ArrayList<EntitledPerson>();
        }
        return this.entitledPerson;
    }

    /**
     * Gets the value of the ptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtc() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtc(String value) {
        this.ptc = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link Salutation }
     *     
     */
    public Salutation getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Salutation }
     *     
     */
    public void setSalutation(Salutation value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDob(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the dhc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDhc() {
        return dhc;
    }

    /**
     * Sets the value of the dhc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDhc(Boolean value) {
        this.dhc = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the countryOfRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfRes() {
        return countryOfRes;
    }

    /**
     * Sets the value of the countryOfRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfRes(String value) {
        this.countryOfRes = value;
    }

    /**
     * Gets the value of the tourCodeExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCodeExt() {
        return tourCodeExt;
    }

    /**
     * Sets the value of the tourCodeExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCodeExt(String value) {
        this.tourCodeExt = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}
