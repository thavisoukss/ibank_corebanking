
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
 *         &lt;element name="cancelTransactionResult" type="{http://Services.laotel.com/}headerResult" minOccurs="0"/&gt;
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
    "cancelTransactionResult"
})
@XmlRootElement(name = "cancelTransactionResponse")
public class CancelTransactionResponse {

    protected HeaderResult cancelTransactionResult;

    /**
     * Gets the value of the cancelTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderResult }
     *     
     */
    public HeaderResult getCancelTransactionResult() {
        return cancelTransactionResult;
    }

    /**
     * Sets the value of the cancelTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderResult }
     *     
     */
    public void setCancelTransactionResult(HeaderResult value) {
        this.cancelTransactionResult = value;
    }

}
