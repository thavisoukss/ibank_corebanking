
package com.internetbanking.soap.transfer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contract-Delete-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract-Delete-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONTREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract-Delete-IO-Type", propOrder = {
    "contrefno"
})
public class ContractDeleteIOType {

    @XmlElement(name = "CONTREFNO", required = true)
    protected String contrefno;

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

}
