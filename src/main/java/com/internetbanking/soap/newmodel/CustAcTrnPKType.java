
package com.internetbanking.soap.newmodel;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustAcTrn-PK-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustAcTrn-PK-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACCNO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENTRYSRNO" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TXNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EVENTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="FROMDATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RELTDREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="RELTDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TODATE" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="MODULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NO_OF_TRNS" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustAcTrn-PK-Type", propOrder = {
    "accno1",
    "entrysrno",
    "fccref",
    "esn",
    "txncd",
    "eventcode",
    "valdt",
    "fromdate",
    "reltdref",
    "drcr",
    "txnccy",
    "txndt",
    "reltdacc",
    "todate",
    "module",
    "nooftrns"
})
public class CustAcTrnPKType {

    @XmlElement(name = "ACCNO1")
    protected String accno1;
    @XmlElement(name = "ENTRYSRNO", required = true)
    protected BigDecimal entrysrno;
    @XmlElement(name = "FCCREF")
    protected String fccref;
    @XmlElement(name = "ESN", required = true)
    protected BigDecimal esn;
    @XmlElement(name = "TXNCD")
    protected String txncd;
    @XmlElement(name = "EVENTCODE")
    protected String eventcode;
    @XmlElement(name = "VALDT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdt;
    @XmlElement(name = "FROMDATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromdate;
    @XmlElement(name = "RELTDREF")
    protected String reltdref;
    @XmlElement(name = "DRCR")
    protected String drcr;
    @XmlElement(name = "TXNCCY")
    protected String txnccy;
    @XmlElement(name = "TXNDT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar txndt;
    @XmlElement(name = "RELTDACC")
    protected String reltdacc;
    @XmlElement(name = "TODATE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar todate;
    @XmlElement(name = "MODULE")
    protected String module;
    @XmlElement(name = "NO_OF_TRNS", required = true)
    protected BigDecimal nooftrns;

    /**
     * Gets the value of the accno1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCNO1() {
        return accno1;
    }

    /**
     * Sets the value of the accno1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCNO1(String value) {
        this.accno1 = value;
    }

    /**
     * Gets the value of the entrysrno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getENTRYSRNO() {
        return entrysrno;
    }

    /**
     * Sets the value of the entrysrno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setENTRYSRNO(BigDecimal value) {
        this.entrysrno = value;
    }

    /**
     * Gets the value of the fccref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCCREF() {
        return fccref;
    }

    /**
     * Sets the value of the fccref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCCREF(String value) {
        this.fccref = value;
    }

    /**
     * Gets the value of the esn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getESN() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setESN(BigDecimal value) {
        this.esn = value;
    }

    /**
     * Gets the value of the txncd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNCD() {
        return txncd;
    }

    /**
     * Sets the value of the txncd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNCD(String value) {
        this.txncd = value;
    }

    /**
     * Gets the value of the eventcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEVENTCODE() {
        return eventcode;
    }

    /**
     * Sets the value of the eventcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEVENTCODE(String value) {
        this.eventcode = value;
    }

    /**
     * Gets the value of the valdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVALDT() {
        return valdt;
    }

    /**
     * Sets the value of the valdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVALDT(XMLGregorianCalendar value) {
        this.valdt = value;
    }

    /**
     * Gets the value of the fromdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFROMDATE() {
        return fromdate;
    }

    /**
     * Sets the value of the fromdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFROMDATE(XMLGregorianCalendar value) {
        this.fromdate = value;
    }

    /**
     * Gets the value of the reltdref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELTDREF() {
        return reltdref;
    }

    /**
     * Sets the value of the reltdref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELTDREF(String value) {
        this.reltdref = value;
    }

    /**
     * Gets the value of the drcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRCR() {
        return drcr;
    }

    /**
     * Sets the value of the drcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRCR(String value) {
        this.drcr = value;
    }

    /**
     * Gets the value of the txnccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNCCY() {
        return txnccy;
    }

    /**
     * Sets the value of the txnccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNCCY(String value) {
        this.txnccy = value;
    }

    /**
     * Gets the value of the txndt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTXNDT() {
        return txndt;
    }

    /**
     * Sets the value of the txndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTXNDT(XMLGregorianCalendar value) {
        this.txndt = value;
    }

    /**
     * Gets the value of the reltdacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELTDACC() {
        return reltdacc;
    }

    /**
     * Sets the value of the reltdacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELTDACC(String value) {
        this.reltdacc = value;
    }

    /**
     * Gets the value of the todate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTODATE() {
        return todate;
    }

    /**
     * Sets the value of the todate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTODATE(XMLGregorianCalendar value) {
        this.todate = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODULE() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODULE(String value) {
        this.module = value;
    }

    /**
     * Gets the value of the nooftrns property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNOOFTRNS() {
        return nooftrns;
    }

    /**
     * Sets the value of the nooftrns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNOOFTRNS(BigDecimal value) {
        this.nooftrns = value;
    }

}
