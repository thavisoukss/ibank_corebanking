
package com.internetbanking.soap.transfer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ERRORDETAILSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ERRORDETAILSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ECODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EDESC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ERRORDETAILSType", propOrder = {
    "ecode",
    "edesc"
})
public class ERRORDETAILSType {

    @XmlElement(name = "ECODE", required = true)
    protected String ecode;
    @XmlElement(name = "EDESC", required = true)
    protected String edesc;

    /**
     * Gets the value of the ecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECODE() {
        return ecode;
    }

    /**
     * Sets the value of the ecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECODE(String value) {
        this.ecode = value;
    }

    /**
     * Gets the value of the edesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDESC() {
        return edesc;
    }

    /**
     * Sets the value of the edesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDESC(String value) {
        this.edesc = value;
    }

}
