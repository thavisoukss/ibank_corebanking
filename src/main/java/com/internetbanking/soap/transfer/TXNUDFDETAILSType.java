
package com.internetbanking.soap.transfer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TXNUDFDETAILSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TXNUDFDETAILSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FLDNAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FLDVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TXNUDFDETAILSType", propOrder = {
    "fldname",
    "fldval"
})
public class TXNUDFDETAILSType {

    @XmlElement(name = "FLDNAME", required = true)
    protected String fldname;
    @XmlElement(name = "FLDVAL")
    protected String fldval;

    /**
     * Gets the value of the fldname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLDNAME() {
        return fldname;
    }

    /**
     * Sets the value of the fldname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLDNAME(String value) {
        this.fldname = value;
    }

    /**
     * Gets the value of the fldval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLDVAL() {
        return fldval;
    }

    /**
     * Sets the value of the fldval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLDVAL(String value) {
        this.fldval = value;
    }

}
