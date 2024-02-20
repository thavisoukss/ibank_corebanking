
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
 *         &lt;element name="checkTransactionResult" type="{http://Services.laotel.com/}checkTransactionResult" minOccurs="0"/&gt;
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
    "checkTransactionResult"
})
@XmlRootElement(name = "checkTransactionResponse")
public class CheckTransactionResponse {

    protected CheckTransactionResult checkTransactionResult;

    /**
     * Gets the value of the checkTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link CheckTransactionResult }
     *     
     */
    public CheckTransactionResult getCheckTransactionResult() {
        return checkTransactionResult;
    }

    /**
     * Sets the value of the checkTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckTransactionResult }
     *     
     */
    public void setCheckTransactionResult(CheckTransactionResult value) {
        this.checkTransactionResult = value;
    }

}
