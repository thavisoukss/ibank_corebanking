
package com.internetbanking.soap.SMS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkBalanceSimasterResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkBalanceSimasterResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://Services.laotel.com/}headerResult" minOccurs="0"/&gt;
 *         &lt;element name="LtcTopupBalance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TplusTopupBalance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="LtcVolumnData" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="responeMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkBalanceSimasterResult", propOrder = {
    "header",
    "ltcTopupBalance",
    "tplusTopupBalance",
    "ltcVolumnData",
    "responeMsg"
})
public class CheckBalanceSimasterResult {

    protected HeaderResult header;
    @XmlElement(name = "LtcTopupBalance")
    protected long ltcTopupBalance;
    @XmlElement(name = "TplusTopupBalance")
    protected long tplusTopupBalance;
    @XmlElement(name = "LtcVolumnData")
    protected long ltcVolumnData;
    protected String responeMsg;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderResult }
     *     
     */
    public HeaderResult getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderResult }
     *     
     */
    public void setHeader(HeaderResult value) {
        this.header = value;
    }

    /**
     * Gets the value of the ltcTopupBalance property.
     * 
     */
    public long getLtcTopupBalance() {
        return ltcTopupBalance;
    }

    /**
     * Sets the value of the ltcTopupBalance property.
     * 
     */
    public void setLtcTopupBalance(long value) {
        this.ltcTopupBalance = value;
    }

    /**
     * Gets the value of the tplusTopupBalance property.
     * 
     */
    public long getTplusTopupBalance() {
        return tplusTopupBalance;
    }

    /**
     * Sets the value of the tplusTopupBalance property.
     * 
     */
    public void setTplusTopupBalance(long value) {
        this.tplusTopupBalance = value;
    }

    /**
     * Gets the value of the ltcVolumnData property.
     * 
     */
    public long getLtcVolumnData() {
        return ltcVolumnData;
    }

    /**
     * Sets the value of the ltcVolumnData property.
     * 
     */
    public void setLtcVolumnData(long value) {
        this.ltcVolumnData = value;
    }

    /**
     * Gets the value of the responeMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponeMsg() {
        return responeMsg;
    }

    /**
     * Sets the value of the responeMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponeMsg(String value) {
        this.responeMsg = value;
    }

}
