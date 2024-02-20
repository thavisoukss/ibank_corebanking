
package com.internetbanking.soap.SMS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkTransactionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkTransactionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://Services.laotel.com/}headerResult" minOccurs="0"/&gt;
 *         &lt;element name="trans_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ocsDetail" type="{http://Services.laotel.com/}_ocs" minOccurs="0"/&gt;
 *         &lt;element name="billDetail" type="{http://Services.laotel.com/}_bss" minOccurs="0"/&gt;
 *         &lt;element name="requestDetail" type="{http://Services.laotel.com/}_incomming" minOccurs="0"/&gt;
 *         &lt;element name="responDetail" type="{http://Services.laotel.com/}_outgoing" minOccurs="0"/&gt;
 *         &lt;element name="paymetDetail" type="{http://Services.laotel.com/}_payment" minOccurs="0"/&gt;
 *         &lt;element name="topupDetail" type="{http://Services.laotel.com/}_topup" minOccurs="0"/&gt;
 *         &lt;element name="requestSendSMS" type="{http://Services.laotel.com/}_send_sms" minOccurs="0"/&gt;
 *         &lt;element name="responSendSMS" type="{http://Services.laotel.com/}_send_sms_rp" minOccurs="0"/&gt;
 *         &lt;element name="submitMassageDetail" type="{http://Services.laotel.com/}_bdg" minOccurs="0"/&gt;
 *         &lt;element name="deliveryReportMsg" type="{http://Services.laotel.com/}ArrayOf_deliveryReportMsg" minOccurs="0"/&gt;
 *         &lt;element name="addpackageDetail" type="{http://Services.laotel.com/}_addpk" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkTransactionResult", propOrder = {
    "header",
    "transType",
    "ocsDetail",
    "billDetail",
    "requestDetail",
    "responDetail",
    "paymetDetail",
    "topupDetail",
    "requestSendSMS",
    "responSendSMS",
    "submitMassageDetail",
    "deliveryReportMsg",
    "addpackageDetail"
})
public class CheckTransactionResult {

    protected HeaderResult header;
    @XmlElement(name = "trans_type")
    protected String transType;
    protected Ocs ocsDetail;
    protected Bss billDetail;
    protected Incomming requestDetail;
    protected Outgoing responDetail;
    protected Payment2 paymetDetail;
    protected Topup2 topupDetail;
    protected SendSMS requestSendSMS;
    protected SendSmsRp responSendSMS;
    protected Bdg submitMassageDetail;
    protected ArrayOfDeliveryReportMsg deliveryReportMsg;
    protected Addpk addpackageDetail;

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
     * Gets the value of the transType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransType() {
        return transType;
    }

    /**
     * Sets the value of the transType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransType(String value) {
        this.transType = value;
    }

    /**
     * Gets the value of the ocsDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Ocs }
     *     
     */
    public Ocs getOcsDetail() {
        return ocsDetail;
    }

    /**
     * Sets the value of the ocsDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ocs }
     *     
     */
    public void setOcsDetail(Ocs value) {
        this.ocsDetail = value;
    }

    /**
     * Gets the value of the billDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Bss }
     *     
     */
    public Bss getBillDetail() {
        return billDetail;
    }

    /**
     * Sets the value of the billDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bss }
     *     
     */
    public void setBillDetail(Bss value) {
        this.billDetail = value;
    }

    /**
     * Gets the value of the requestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Incomming }
     *     
     */
    public Incomming getRequestDetail() {
        return requestDetail;
    }

    /**
     * Sets the value of the requestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incomming }
     *     
     */
    public void setRequestDetail(Incomming value) {
        this.requestDetail = value;
    }

    /**
     * Gets the value of the responDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Outgoing }
     *     
     */
    public Outgoing getResponDetail() {
        return responDetail;
    }

    /**
     * Sets the value of the responDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Outgoing }
     *     
     */
    public void setResponDetail(Outgoing value) {
        this.responDetail = value;
    }

    /**
     * Gets the value of the paymetDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Payment2 }
     *     
     */
    public Payment2 getPaymetDetail() {
        return paymetDetail;
    }

    /**
     * Sets the value of the paymetDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment2 }
     *     
     */
    public void setPaymetDetail(Payment2 value) {
        this.paymetDetail = value;
    }

    /**
     * Gets the value of the topupDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Topup2 }
     *     
     */
    public Topup2 getTopupDetail() {
        return topupDetail;
    }

    /**
     * Sets the value of the topupDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Topup2 }
     *     
     */
    public void setTopupDetail(Topup2 value) {
        this.topupDetail = value;
    }

    /**
     * Gets the value of the requestSendSMS property.
     * 
     * @return
     *     possible object is
     *     {@link SendSMS }
     *     
     */
    public SendSMS getRequestSendSMS() {
        return requestSendSMS;
    }

    /**
     * Sets the value of the requestSendSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendSMS }
     *     
     */
    public void setRequestSendSMS(SendSMS value) {
        this.requestSendSMS = value;
    }

    /**
     * Gets the value of the responSendSMS property.
     * 
     * @return
     *     possible object is
     *     {@link SendSmsRp }
     *     
     */
    public SendSmsRp getResponSendSMS() {
        return responSendSMS;
    }

    /**
     * Sets the value of the responSendSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendSmsRp }
     *     
     */
    public void setResponSendSMS(SendSmsRp value) {
        this.responSendSMS = value;
    }

    /**
     * Gets the value of the submitMassageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Bdg }
     *     
     */
    public Bdg getSubmitMassageDetail() {
        return submitMassageDetail;
    }

    /**
     * Sets the value of the submitMassageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bdg }
     *     
     */
    public void setSubmitMassageDetail(Bdg value) {
        this.submitMassageDetail = value;
    }

    /**
     * Gets the value of the deliveryReportMsg property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeliveryReportMsg }
     *     
     */
    public ArrayOfDeliveryReportMsg getDeliveryReportMsg() {
        return deliveryReportMsg;
    }

    /**
     * Sets the value of the deliveryReportMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeliveryReportMsg }
     *     
     */
    public void setDeliveryReportMsg(ArrayOfDeliveryReportMsg value) {
        this.deliveryReportMsg = value;
    }

    /**
     * Gets the value of the addpackageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Addpk }
     *     
     */
    public Addpk getAddpackageDetail() {
        return addpackageDetail;
    }

    /**
     * Sets the value of the addpackageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addpk }
     *     
     */
    public void setAddpackageDetail(Addpk value) {
        this.addpackageDetail = value;
    }

}
