
package com.internetbanking.soap.transfer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MT101-Delete-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MT101-Delete-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SENDERSREFMAND" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MT101-Delete-IO-Type", propOrder = {
    "sendersrefmand"
})
public class MT101DeleteIOType {

    @XmlElement(name = "SENDERSREFMAND", required = true)
    protected String sendersrefmand;

    /**
     * Gets the value of the sendersrefmand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERSREFMAND() {
        return sendersrefmand;
    }

    /**
     * Sets the value of the sendersrefmand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERSREFMAND(String value) {
        this.sendersrefmand = value;
    }

}
