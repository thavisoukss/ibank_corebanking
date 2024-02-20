
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
 *         &lt;element name="sendSMSSPResult" type="{http://Services.laotel.com/}headerResult" minOccurs="0"/&gt;
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
    "sendSMSSPResult"
})
@XmlRootElement(name = "sendSMSSPResponse")
public class SendSMSSPResponse {

    protected HeaderResult sendSMSSPResult;

    /**
     * Gets the value of the sendSMSSPResult property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderResult }
     *     
     */
    public HeaderResult getSendSMSSPResult() {
        return sendSMSSPResult;
    }

    /**
     * Sets the value of the sendSMSSPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderResult }
     *     
     */
    public void setSendSMSSPResult(HeaderResult value) {
        this.sendSMSSPResult = value;
    }

}