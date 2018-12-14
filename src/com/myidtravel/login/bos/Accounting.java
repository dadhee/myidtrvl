
package com.myidtravel.login.bos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accounting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accounting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="costCenter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="setOfBooks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="salaryDeduction" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="employeeBenefitTaxable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accounting")
public class Accounting {

    @XmlAttribute
    protected String costCenter;
    @XmlAttribute
    protected String setOfBooks;
    @XmlAttribute
    protected Boolean salaryDeduction;
    @XmlAttribute
    protected Boolean employeeBenefitTaxable;

    /**
     * Gets the value of the costCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Sets the value of the costCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * Gets the value of the setOfBooks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetOfBooks() {
        return setOfBooks;
    }

    /**
     * Sets the value of the setOfBooks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetOfBooks(String value) {
        this.setOfBooks = value;
    }

    /**
     * Gets the value of the salaryDeduction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSalaryDeduction() {
        return salaryDeduction;
    }

    /**
     * Sets the value of the salaryDeduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSalaryDeduction(Boolean value) {
        this.salaryDeduction = value;
    }

    /**
     * Gets the value of the employeeBenefitTaxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmployeeBenefitTaxable() {
        return employeeBenefitTaxable;
    }

    /**
     * Sets the value of the employeeBenefitTaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmployeeBenefitTaxable(Boolean value) {
        this.employeeBenefitTaxable = value;
    }

}
