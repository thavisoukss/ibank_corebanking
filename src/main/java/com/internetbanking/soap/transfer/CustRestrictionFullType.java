
package com.internetbanking.soap.transfer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustRestriction-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustRestriction-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CATGLIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLASCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cust-Categories" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CATGDSAW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Customers" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CSTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ALWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustRestriction-Full-Type", propOrder = {
    "catglis",
    "clascd",
    "custCategories",
    "customers"
})
public class CustRestrictionFullType {

    @XmlElement(name = "CATGLIS")
    protected String catglis;
    @XmlElement(name = "CLASCD")
    protected String clascd;
    @XmlElement(name = "Cust-Categories")
    protected List<CustCategories> custCategories;
    @XmlElement(name = "Customers")
    protected List<Customers> customers;

    /**
     * Gets the value of the catglis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATGLIS() {
        return catglis;
    }

    /**
     * Sets the value of the catglis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATGLIS(String value) {
        this.catglis = value;
    }

    /**
     * Gets the value of the clascd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASCD() {
        return clascd;
    }

    /**
     * Sets the value of the clascd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASCD(String value) {
        this.clascd = value;
    }

    /**
     * Gets the value of the custCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the custCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustCategories }
     * 
     * 
     */
    public List<CustCategories> getCustCategories() {
        if (custCategories == null) {
            custCategories = new ArrayList<CustCategories>();
        }
        return this.custCategories;
    }

    /**
     * Gets the value of the customers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customers }
     * 
     * 
     */
    public List<Customers> getCustomers() {
        if (customers == null) {
            customers = new ArrayList<Customers>();
        }
        return this.customers;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CATGDSAW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "catgdsaw",
        "description"
    })
    public static class CustCategories {

        @XmlElement(name = "CATGDSAW")
        protected String catgdsaw;
        @XmlElement(name = "DESCRIPTION")
        protected String description;

        /**
         * Gets the value of the catgdsaw property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCATGDSAW() {
            return catgdsaw;
        }

        /**
         * Sets the value of the catgdsaw property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCATGDSAW(String value) {
            this.catgdsaw = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESCRIPTION() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESCRIPTION(String value) {
            this.description = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CSTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CUSTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ALWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cstid",
        "custname",
        "alwd"
    })
    public static class Customers {

        @XmlElement(name = "CSTID")
        protected String cstid;
        @XmlElement(name = "CUSTNAME")
        protected String custname;
        @XmlElement(name = "ALWD")
        protected String alwd;

        /**
         * Gets the value of the cstid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCSTID() {
            return cstid;
        }

        /**
         * Sets the value of the cstid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCSTID(String value) {
            this.cstid = value;
        }

        /**
         * Gets the value of the custname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTNAME() {
            return custname;
        }

        /**
         * Sets the value of the custname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTNAME(String value) {
            this.custname = value;
        }

        /**
         * Gets the value of the alwd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getALWD() {
            return alwd;
        }

        /**
         * Sets the value of the alwd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setALWD(String value) {
            this.alwd = value;
        }

    }

}
