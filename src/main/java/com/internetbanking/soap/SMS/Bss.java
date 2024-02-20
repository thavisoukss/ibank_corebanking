
package com.internetbanking.soap.SMS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _bss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_bss"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="payment_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receipt_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remain_amount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="err_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="err_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_bss", propOrder = {
    "id",
    "paymentId",
    "receiptNo",
    "remainAmount",
    "errCode",
    "errDesc"
})
public class Bss {

    protected long id;
    @XmlElement(name = "payment_id")
    protected String paymentId;
    @XmlElement(name = "receipt_no")
    protected String receiptNo;
    @XmlElement(name = "remain_amount")
    protected long remainAmount;
    @XmlElement(name = "err_code")
    protected String errCode;
    @XmlElement(name = "err_desc")
    protected String errDesc;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the receiptNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNo() {
        return receiptNo;
    }

    /**
     * Sets the value of the receiptNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptNo(String value) {
        this.receiptNo = value;
    }

    /**
     * Gets the value of the remainAmount property.
     * 
     */
    public long getRemainAmount() {
        return remainAmount;
    }

    /**
     * Sets the value of the remainAmount property.
     * 
     */
    public void setRemainAmount(long value) {
        this.remainAmount = value;
    }

    /**
     * Gets the value of the errCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrCode(String value) {
        this.errCode = value;
    }

    /**
     * Gets the value of the errDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrDesc() {
        return errDesc;
    }

    /**
     * Sets the value of the errDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrDesc(String value) {
        this.errDesc = value;
    }

}
