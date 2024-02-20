
package com.internetbanking.soap.SMS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="checkBalanceResult" type="{http://Services.laotel.com/}checkBalanceResult" minOccurs="0"/&gt;
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
    "checkBalanceResult"
})
@XmlRootElement(name = "checkBalanceResponse")
public class CheckBalanceResponse {

    protected CheckBalanceResult checkBalanceResult;

    /**
     * Gets the value of the checkBalanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckBalanceResult }
     *     
     */
    public CheckBalanceResult getCheckBalanceResult() {
        return checkBalanceResult;
    }

    /**
     * Sets the value of the checkBalanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckBalanceResult }
     *     
     */
    public void setCheckBalanceResult(CheckBalanceResult value) {
        this.checkBalanceResult = value;
    }

}
