
package com.internetbanking.soap.SMS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buyPackageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="buyPackageRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://Services.laotel.com/}headerRequest" minOccurs="0"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pk_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pk_code" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buyPackageRequest", propOrder = {
    "header",
    "msisdn",
    "pkType",
    "pkCode"
})
public class BuyPackageRequest {

    protected HeaderRequest header;
    protected String msisdn;
    @XmlElement(name = "pk_type")
    protected String pkType;
    @XmlElement(name = "pk_code")
    protected long pkCode;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderRequest }
     *     
     */
    public HeaderRequest getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderRequest }
     *     
     */
    public void setHeader(HeaderRequest value) {
        this.header = value;
    }

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the pkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkType() {
        return pkType;
    }

    /**
     * Sets the value of the pkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkType(String value) {
        this.pkType = value;
    }

    /**
     * Gets the value of the pkCode property.
     * 
     */
    public long getPkCode() {
        return pkCode;
    }

    /**
     * Sets the value of the pkCode property.
     * 
     */
    public void setPkCode(long value) {
        this.pkCode = value;
    }

}
