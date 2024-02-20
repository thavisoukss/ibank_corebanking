
package com.internetbanking.soap.SMS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkBalanceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkBalanceResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://Services.laotel.com/}headerResult" minOccurs="0"/&gt;
 *         &lt;element name="networkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="packageDetail" type="{http://Services.laotel.com/}ArrayOfPackageDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkBalanceResult", propOrder = {
    "header",
    "networkType",
    "type",
    "balance",
    "packageDetail"
})
public class CheckBalanceResult {

    protected HeaderResult header;
    protected String networkType;
    protected int type;
    protected long balance;
    protected ArrayOfPackageDetail packageDetail;

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
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     */
    public long getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(long value) {
        this.balance = value;
    }

    /**
     * Gets the value of the packageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPackageDetail }
     *     
     */
    public ArrayOfPackageDetail getPackageDetail() {
        return packageDetail;
    }

    /**
     * Sets the value of the packageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPackageDetail }
     *     
     */
    public void setPackageDetail(ArrayOfPackageDetail value) {
        this.packageDetail = value;
    }

}
