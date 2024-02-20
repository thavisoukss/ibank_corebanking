
package com.internetbanking.soap.SMS;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _sms_dr_rp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_sms_dr_rp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sms_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sms_header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dr_date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
@XmlType(name = "_sms_dr_rp", propOrder = {
    "smsId",
    "smsHeader",
    "msisdn",
    "drDate",
    "errDesc"
})
public class SmsDrRp {

    @XmlElement(name = "sms_id")
    protected String smsId;
    @XmlElement(name = "sms_header")
    protected String smsHeader;
    protected String msisdn;
    @XmlElement(name = "dr_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar drDate;
    @XmlElement(name = "err_desc")
    protected String errDesc;

    /**
     * Gets the value of the smsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsId() {
        return smsId;
    }

    /**
     * Sets the value of the smsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsId(String value) {
        this.smsId = value;
    }

    /**
     * Gets the value of the smsHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsHeader() {
        return smsHeader;
    }

    /**
     * Sets the value of the smsHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsHeader(String value) {
        this.smsHeader = value;
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
     * Gets the value of the drDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDrDate() {
        return drDate;
    }

    /**
     * Sets the value of the drDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDrDate(XMLGregorianCalendar value) {
        this.drDate = value;
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
