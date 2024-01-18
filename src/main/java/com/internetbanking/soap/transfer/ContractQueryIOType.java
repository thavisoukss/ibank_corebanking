
package com.internetbanking.soap.transfer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contract-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract-Query-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONTREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USERREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOURCEREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOURCECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract-Query-IO-Type", propOrder = {
    "contrefno",
    "userrefno",
    "sourcerefno",
    "sourcecd"
})
public class ContractQueryIOType {

    @XmlElement(name = "CONTREFNO", required = true)
    protected String contrefno;
    @XmlElement(name = "USERREFNO")
    protected String userrefno;
    @XmlElement(name = "SOURCEREFNO")
    protected String sourcerefno;
    @XmlElement(name = "SOURCECD")
    protected String sourcecd;

    /**
     * Gets the value of the contrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTREFNO() {
        return contrefno;
    }

    /**
     * Sets the value of the contrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTREFNO(String value) {
        this.contrefno = value;
    }

    /**
     * Gets the value of the userrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERREFNO() {
        return userrefno;
    }

    /**
     * Sets the value of the userrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERREFNO(String value) {
        this.userrefno = value;
    }

    /**
     * Gets the value of the sourcerefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCEREFNO() {
        return sourcerefno;
    }

    /**
     * Sets the value of the sourcerefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCEREFNO(String value) {
        this.sourcerefno = value;
    }

    /**
     * Gets the value of the sourcecd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCECD() {
        return sourcecd;
    }

    /**
     * Sets the value of the sourcecd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCECD(String value) {
        this.sourcecd = value;
    }

}
