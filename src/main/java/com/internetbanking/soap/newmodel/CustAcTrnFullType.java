
package com.internetbanking.soap.newmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustAcTrn-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustAcTrn-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MODULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENTRYSRNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUSTACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EVENTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DRCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="START_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DRCRBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RELTDREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RELTDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FROMDATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TODATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EXECRUNBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SEARCHCRITERIA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CALLFORMDTLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCNO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NO_OF_TRNS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Transaction-Details" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MODULECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TRNREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACSRNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TXNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EVENTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="DRCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="LCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="RUNN_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="DRCRBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RELTDREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RELTDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDTEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EXT_TRN_CODE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustAcTrn-Full-Type", propOrder = {
    "module",
    "fccref",
    "entrysrno",
    "brn",
    "custacno",
    "ccy",
    "txncd",
    "eventcode",
    "esn",
    "txndt",
    "valdt",
    "drcr",
    "fcyamt",
    "xrate",
    "lcyamt",
    "startbal",
    "drcrbal",
    "reltdref",
    "reltdacc",
    "txnccy",
    "remarks",
    "fromdate",
    "todate",
    "execrunbal",
    "searchcriteria",
    "callformdtls",
    "accno1",
    "nooftrns",
    "transactionDetails"
})
public class CustAcTrnFullType {

    @XmlElement(name = "MODULE")
    protected String module;
    @XmlElement(name = "FCCREF")
    protected String fccref;
    @XmlElement(name = "ENTRYSRNO")
    protected BigDecimal entrysrno;
    @XmlElement(name = "BRN")
    protected String brn;
    @XmlElement(name = "CUSTACNO")
    protected String custacno;
    @XmlElement(name = "CCY")
    protected String ccy;
    @XmlElement(name = "TXNCD")
    protected String txncd;
    @XmlElement(name = "EVENTCODE")
    protected String eventcode;
    @XmlElement(name = "ESN")
    protected BigDecimal esn;
    @XmlElement(name = "TXNDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar txndt;
    @XmlElement(name = "VALDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valdt;
    @XmlElement(name = "DRCR")
    protected String drcr;
    @XmlElement(name = "FCYAMT")
    protected BigDecimal fcyamt;
    @XmlElement(name = "XRATE")
    protected BigDecimal xrate;
    @XmlElement(name = "LCYAMT")
    protected BigDecimal lcyamt;
    @XmlElement(name = "START_BAL")
    protected BigDecimal startbal;
    @XmlElement(name = "DRCRBAL")
    protected String drcrbal;
    @XmlElement(name = "RELTDREF")
    protected String reltdref;
    @XmlElement(name = "RELTDACC")
    protected String reltdacc;
    @XmlElement(name = "TXNCCY")
    protected String txnccy;
    @XmlElement(name = "REMARKS")
    protected String remarks;
    @XmlElement(name = "FROMDATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromdate;
    @XmlElement(name = "TODATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar todate;
    @XmlElement(name = "EXECRUNBAL")
    protected String execrunbal;
    @XmlElement(name = "SEARCHCRITERIA")
    protected String searchcriteria;
    @XmlElement(name = "CALLFORMDTLS")
    protected String callformdtls;
    @XmlElement(name = "ACCNO1")
    protected String accno1;
    @XmlElement(name = "NO_OF_TRNS")
    protected BigDecimal nooftrns;
    @XmlElement(name = "Transaction-Details")
    protected List<TransactionDetails> transactionDetails;

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
     * Gets the value of the brn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRN() {
        return brn;
    }

    /**
     * Sets the value of the brn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRN(String value) {
        this.brn = value;
    }

    /**
     * Gets the value of the custacno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTACNO() {
        return custacno;
    }

    /**
     * Sets the value of the custacno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTACNO(String value) {
        this.custacno = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCY(String value) {
        this.ccy = value;
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
     * Gets the value of the fcyamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFCYAMT() {
        return fcyamt;
    }

    /**
     * Sets the value of the fcyamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFCYAMT(BigDecimal value) {
        this.fcyamt = value;
    }

    /**
     * Gets the value of the xrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXRATE() {
        return xrate;
    }

    /**
     * Sets the value of the xrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXRATE(BigDecimal value) {
        this.xrate = value;
    }

    /**
     * Gets the value of the lcyamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCYAMT() {
        return lcyamt;
    }

    /**
     * Sets the value of the lcyamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCYAMT(BigDecimal value) {
        this.lcyamt = value;
    }

    /**
     * Gets the value of the startbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSTARTBAL() {
        return startbal;
    }

    /**
     * Sets the value of the startbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSTARTBAL(BigDecimal value) {
        this.startbal = value;
    }

    /**
     * Gets the value of the drcrbal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRCRBAL() {
        return drcrbal;
    }

    /**
     * Sets the value of the drcrbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRCRBAL(String value) {
        this.drcrbal = value;
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
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKS() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKS(String value) {
        this.remarks = value;
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
     * Gets the value of the execrunbal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXECRUNBAL() {
        return execrunbal;
    }

    /**
     * Sets the value of the execrunbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXECRUNBAL(String value) {
        this.execrunbal = value;
    }

    /**
     * Gets the value of the searchcriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEARCHCRITERIA() {
        return searchcriteria;
    }

    /**
     * Sets the value of the searchcriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEARCHCRITERIA(String value) {
        this.searchcriteria = value;
    }

    /**
     * Gets the value of the callformdtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALLFORMDTLS() {
        return callformdtls;
    }

    /**
     * Sets the value of the callformdtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALLFORMDTLS(String value) {
        this.callformdtls = value;
    }

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

    /**
     * Gets the value of the transactionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transactionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionDetails }
     * 
     * 
     */
    public List<TransactionDetails> getTransactionDetails() {
        if (transactionDetails == null) {
            transactionDetails = new ArrayList<TransactionDetails>();
        }
        return this.transactionDetails;
    }


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
     *         &lt;element name="MODULECODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TRNREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACSRNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="BRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TXNCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EVENTCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="TXNDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="VALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="DRCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="XRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="LCYAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="RUNN_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="DRCRBAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RELTDREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RELTDACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDTEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EXT_TRN_CODE_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "modulecode",
        "trnref",
        "acsrno",
        "brn",
        "acc",
        "ccy",
        "txncd",
        "eventcode",
        "esn",
        "txndt",
        "valdt",
        "drcr",
        "fcyamt",
        "xrate",
        "lcyamt",
        "runnbal",
        "drcrbal",
        "reltdref",
        "reltdacc",
        "addtext",
        "exttrncodedesc",
        "authstat"
    })
    public static class TransactionDetails {

        @XmlElement(name = "MODULECODE")
        protected String modulecode;
        @XmlElement(name = "TRNREF")
        protected String trnref;
        @XmlElement(name = "ACSRNO")
        protected BigDecimal acsrno;
        @XmlElement(name = "BRN")
        protected String brn;
        @XmlElement(name = "ACC")
        protected String acc;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "TXNCD")
        protected String txncd;
        @XmlElement(name = "EVENTCODE")
        protected String eventcode;
        @XmlElement(name = "ESN")
        protected BigDecimal esn;
        @XmlElement(name = "TXNDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar txndt;
        @XmlElement(name = "VALDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar valdt;
        @XmlElement(name = "DRCR")
        protected String drcr;
        @XmlElement(name = "FCYAMT")
        protected BigDecimal fcyamt;
        @XmlElement(name = "XRATE")
        protected BigDecimal xrate;
        @XmlElement(name = "LCYAMT")
        protected BigDecimal lcyamt;
        @XmlElement(name = "RUNN_BAL")
        protected BigDecimal runnbal;
        @XmlElement(name = "DRCRBAL")
        protected String drcrbal;
        @XmlElement(name = "RELTDREF")
        protected String reltdref;
        @XmlElement(name = "RELTDACC")
        protected String reltdacc;
        @XmlElement(name = "ADDTEXT")
        protected String addtext;
        @XmlElement(name = "EXT_TRN_CODE_DESC")
        protected String exttrncodedesc;
        @XmlElement(name = "AUTHSTAT")
        protected String authstat;

        /**
         * Gets the value of the modulecode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMODULECODE() {
            return modulecode;
        }

        /**
         * Sets the value of the modulecode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMODULECODE(String value) {
            this.modulecode = value;
        }

        /**
         * Gets the value of the trnref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRNREF() {
            return trnref;
        }

        /**
         * Sets the value of the trnref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRNREF(String value) {
            this.trnref = value;
        }

        /**
         * Gets the value of the acsrno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getACSRNO() {
            return acsrno;
        }

        /**
         * Sets the value of the acsrno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setACSRNO(BigDecimal value) {
            this.acsrno = value;
        }

        /**
         * Gets the value of the brn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRN() {
            return brn;
        }

        /**
         * Sets the value of the brn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRN(String value) {
            this.brn = value;
        }

        /**
         * Gets the value of the acc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACC() {
            return acc;
        }

        /**
         * Sets the value of the acc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACC(String value) {
            this.acc = value;
        }

        /**
         * Gets the value of the ccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCCY() {
            return ccy;
        }

        /**
         * Sets the value of the ccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCCY(String value) {
            this.ccy = value;
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
         * Gets the value of the fcyamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFCYAMT() {
            return fcyamt;
        }

        /**
         * Sets the value of the fcyamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFCYAMT(BigDecimal value) {
            this.fcyamt = value;
        }

        /**
         * Gets the value of the xrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getXRATE() {
            return xrate;
        }

        /**
         * Sets the value of the xrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setXRATE(BigDecimal value) {
            this.xrate = value;
        }

        /**
         * Gets the value of the lcyamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLCYAMT() {
            return lcyamt;
        }

        /**
         * Sets the value of the lcyamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLCYAMT(BigDecimal value) {
            this.lcyamt = value;
        }

        /**
         * Gets the value of the runnbal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRUNNBAL() {
            return runnbal;
        }

        /**
         * Sets the value of the runnbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRUNNBAL(BigDecimal value) {
            this.runnbal = value;
        }

        /**
         * Gets the value of the drcrbal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRCRBAL() {
            return drcrbal;
        }

        /**
         * Sets the value of the drcrbal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRCRBAL(String value) {
            this.drcrbal = value;
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
         * Gets the value of the addtext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDTEXT() {
            return addtext;
        }

        /**
         * Sets the value of the addtext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDTEXT(String value) {
            this.addtext = value;
        }

        /**
         * Gets the value of the exttrncodedesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEXTTRNCODEDESC() {
            return exttrncodedesc;
        }

        /**
         * Sets the value of the exttrncodedesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEXTTRNCODEDESC(String value) {
            this.exttrncodedesc = value;
        }

        /**
         * Gets the value of the authstat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTHSTAT() {
            return authstat;
        }

        /**
         * Sets the value of the authstat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTHSTAT(String value) {
            this.authstat = value;
        }

    }

}
