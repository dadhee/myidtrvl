
package com.myidtravel.login.bos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Employment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="eID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="secondaryID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subCategory" type="{http://bos.login.myidtravel.com}Category" />
 *       &lt;attribute name="department" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="laborGroup" type="{http://bos.login.myidtravel.com}LaborGroup" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="doj" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="dot" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="employmentStatus" type="{http://bos.login.myidtravel.com}EmploymentStatus" />
 *       &lt;attribute name="FKZeichen" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oalTravelEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employment")
public class Employment {

    @XmlAttribute(name = "eID", required = true)
    protected String eid;
    @XmlAttribute
    protected String secondaryID;
    @XmlAttribute
    protected String subCompany;
    @XmlAttribute
    protected Category subCategory;
    @XmlAttribute
    protected String department;
    @XmlAttribute
    protected LaborGroup laborGroup;
    @XmlAttribute
    protected String group;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar doj;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dot;
    @XmlAttribute
    protected EmploymentStatus employmentStatus;
    @XmlAttribute(name = "FKZeichen")
    protected String fkZeichen;
    @XmlAttribute
    protected Boolean oalTravelEligible;

    /**
     * Gets the value of the eid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEID() {
        return eid;
    }

    /**
     * Sets the value of the eid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEID(String value) {
        this.eid = value;
    }

    /**
     * Gets the value of the secondaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryID() {
        return secondaryID;
    }

    /**
     * Sets the value of the secondaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryID(String value) {
        this.secondaryID = value;
    }

    /**
     * Gets the value of the subCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCompany() {
        return subCompany;
    }

    /**
     * Sets the value of the subCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCompany(String value) {
        this.subCompany = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setSubCategory(Category value) {
        this.subCategory = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the laborGroup property.
     * 
     * @return
     *     possible object is
     *     {@link LaborGroup }
     *     
     */
    public LaborGroup getLaborGroup() {
        return laborGroup;
    }

    /**
     * Sets the value of the laborGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaborGroup }
     *     
     */
    public void setLaborGroup(LaborGroup value) {
        this.laborGroup = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the doj property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDoj() {
        return doj;
    }

    /**
     * Sets the value of the doj property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDoj(XMLGregorianCalendar value) {
        this.doj = value;
    }

    /**
     * Gets the value of the dot property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDot() {
        return dot;
    }

    /**
     * Sets the value of the dot property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDot(XMLGregorianCalendar value) {
        this.dot = value;
    }

    /**
     * Gets the value of the employmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentStatus }
     *     
     */
    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentStatus }
     *     
     */
    public void setEmploymentStatus(EmploymentStatus value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the fkZeichen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKZeichen() {
        return fkZeichen;
    }

    /**
     * Sets the value of the fkZeichen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKZeichen(String value) {
        this.fkZeichen = value;
    }

    /**
     * Gets the value of the oalTravelEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOalTravelEligible() {
        return oalTravelEligible;
    }

    /**
     * Sets the value of the oalTravelEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOalTravelEligible(Boolean value) {
        this.oalTravelEligible = value;
    }

}
