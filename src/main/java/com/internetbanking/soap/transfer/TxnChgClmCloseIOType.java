
package com.internetbanking.soap.transfer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TxnChgClm-Close-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxnChgClm-Close-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxnChgClm-Close-IO-Type", propOrder = {
    "conrefno"
})
public class TxnChgClmCloseIOType {

    @XmlElement(name = "CONREFNO")
    protected String conrefno;

    /**
     * Gets the value of the conrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONREFNO() {
        return conrefno;
    }

    /**
     * Sets the value of the conrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONREFNO(String value) {
        this.conrefno = value;
    }

}