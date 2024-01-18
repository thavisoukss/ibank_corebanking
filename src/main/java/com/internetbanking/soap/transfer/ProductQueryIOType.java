
package com.internetbanking.soap.transfer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product-Query-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DUPULTBENACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPULTBENADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPORDCUSTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPORDCUSTADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product-Query-IO-Type", propOrder = {
    "prdcd",
    "dupultbenacc",
    "dupultbenaddr",
    "dupordcustacc",
    "dupordcustaddr"
})
public class ProductQueryIOType {

    @XmlElement(name = "PRDCD", required = true)
    protected String prdcd;
    @XmlElement(name = "DUPULTBENACC")
    protected String dupultbenacc;
    @XmlElement(name = "DUPULTBENADDR")
    protected String dupultbenaddr;
    @XmlElement(name = "DUPORDCUSTACC")
    protected String dupordcustacc;
    @XmlElement(name = "DUPORDCUSTADDR")
    protected String dupordcustaddr;

    /**
     * Gets the value of the prdcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDCD() {
        return prdcd;
    }

    /**
     * Sets the value of the prdcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDCD(String value) {
        this.prdcd = value;
    }

    /**
     * Gets the value of the dupultbenacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPULTBENACC() {
        return dupultbenacc;
    }

    /**
     * Sets the value of the dupultbenacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPULTBENACC(String value) {
        this.dupultbenacc = value;
    }

    /**
     * Gets the value of the dupultbenaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPULTBENADDR() {
        return dupultbenaddr;
    }

    /**
     * Sets the value of the dupultbenaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPULTBENADDR(String value) {
        this.dupultbenaddr = value;
    }

    /**
     * Gets the value of the dupordcustacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPORDCUSTACC() {
        return dupordcustacc;
    }

    /**
     * Sets the value of the dupordcustacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPORDCUSTACC(String value) {
        this.dupordcustacc = value;
    }

    /**
     * Gets the value of the dupordcustaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPORDCUSTADDR() {
        return dupordcustaddr;
    }

    /**
     * Sets the value of the dupordcustaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPORDCUSTADDR(String value) {
        this.dupordcustaddr = value;
    }

}
