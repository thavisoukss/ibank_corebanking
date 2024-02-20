
package com.internetbanking.soap.SMS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packageDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PK_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PK_CODE" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PK_CHG" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="DAYS" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="QTAVALUE" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PK_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PK_TYPE_RQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHG_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packageDetail", propOrder = {
    "pktype",
    "status",
    "pkcode",
    "pkchg",
    "days",
    "qtavalue",
    "pkdesc",
    "pktyperq",
    "chgtype"
})
public class PackageDetail {

    @XmlElement(name = "PK_TYPE")
    protected String pktype;
    protected boolean status;
    @XmlElement(name = "PK_CODE")
    protected long pkcode;
    @XmlElement(name = "PK_CHG")
    protected long pkchg;
    @XmlElement(name = "DAYS")
    protected double days;
    @XmlElement(name = "QTAVALUE")
    protected long qtavalue;
    @XmlElement(name = "PK_DESC")
    protected String pkdesc;
    @XmlElement(name = "PK_TYPE_RQ")
    protected String pktyperq;
    @XmlElement(name = "CHG_TYPE")
    protected String chgtype;

    /**
     * Gets the value of the pktype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKTYPE() {
        return pktype;
    }

    /**
     * Sets the value of the pktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKTYPE(String value) {
        this.pktype = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the pkcode property.
     * 
     */
    public long getPKCODE() {
        return pkcode;
    }

    /**
     * Sets the value of the pkcode property.
     * 
     */
    public void setPKCODE(long value) {
        this.pkcode = value;
    }

    /**
     * Gets the value of the pkchg property.
     * 
     */
    public long getPKCHG() {
        return pkchg;
    }

    /**
     * Sets the value of the pkchg property.
     * 
     */
    public void setPKCHG(long value) {
        this.pkchg = value;
    }

    /**
     * Gets the value of the days property.
     * 
     */
    public double getDAYS() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     */
    public void setDAYS(double value) {
        this.days = value;
    }

    /**
     * Gets the value of the qtavalue property.
     * 
     */
    public long getQTAVALUE() {
        return qtavalue;
    }

    /**
     * Sets the value of the qtavalue property.
     * 
     */
    public void setQTAVALUE(long value) {
        this.qtavalue = value;
    }

    /**
     * Gets the value of the pkdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKDESC() {
        return pkdesc;
    }

    /**
     * Sets the value of the pkdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKDESC(String value) {
        this.pkdesc = value;
    }

    /**
     * Gets the value of the pktyperq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPKTYPERQ() {
        return pktyperq;
    }

    /**
     * Sets the value of the pktyperq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPKTYPERQ(String value) {
        this.pktyperq = value;
    }

    /**
     * Gets the value of the chgtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGTYPE() {
        return chgtype;
    }

    /**
     * Sets the value of the chgtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGTYPE(String value) {
        this.chgtype = value;
    }

}
