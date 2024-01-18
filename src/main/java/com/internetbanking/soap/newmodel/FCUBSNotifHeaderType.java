
package com.internetbanking.soap.newmodel;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FCUBS_NotifHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCUBS_NotifHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSGID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NOTIF_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NOTIF_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MODULEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FCUBS_NotifHeaderType", propOrder = {
    "source",
    "msgid",
    "notifrefno",
    "branch",
    "notifcode",
    "destination",
    "moduleid"
})
public class FCUBSNotifHeaderType {

    @XmlElement(name = "SOURCE")
    protected String source;
    @XmlElement(name = "MSGID", required = true)
    protected String msgid;
    @XmlElement(name = "NOTIF_REF_NO", required = true)
    protected String notifrefno;
    @XmlElement(name = "BRANCH", required = true)
    protected String branch;
    @XmlElement(name = "NOTIF_CODE", required = true)
    protected String notifcode;
    @XmlElement(name = "DESTINATION")
    protected String destination;
    @XmlElement(name = "MODULEID")
    protected String moduleid;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the msgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGID() {
        return msgid;
    }

    /**
     * Sets the value of the msgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGID(String value) {
        this.msgid = value;
    }

    /**
     * Gets the value of the notifrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFREFNO() {
        return notifrefno;
    }

    /**
     * Sets the value of the notifrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFREFNO(String value) {
        this.notifrefno = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCH(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the notifcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFCODE() {
        return notifcode;
    }

    /**
     * Sets the value of the notifcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFCODE(String value) {
        this.notifcode = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATION() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATION(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the moduleid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODULEID() {
        return moduleid;
    }

    /**
     * Sets the value of the moduleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODULEID(String value) {
        this.moduleid = value;
    }

}
