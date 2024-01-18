
package com.internetbanking.soap.transfer;

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
 * <p>Java class for Contract-Liquidate-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract-Liquidate-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONTREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USERREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DBTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRVALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CRBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CRVALDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EXG_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DBTBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DR_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SPREADCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MCKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSGCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOURCEREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRIBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRIBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCTINGASOF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MULTI_CREDIT_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OURCORRESPREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECEIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AWI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AWI5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AWI6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTIBEN6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BYORDEROF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BYORDEROF2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BYORDEROF3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BYORDEROF4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTBEN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTBEN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTBEN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTBEN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BYORDEROF5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTBEN5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AWI2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AWI3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AWI4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMITMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTREFRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGREP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGREP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGREP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENVCONTENT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENVCONTENT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENVCONTENT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENVCONTENT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENVCONTENT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOCIALSECNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BOOKDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Taxes" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnTax-Liquidate-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="TXNUDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSFTService}TXNUDFDETAILSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Misdetails" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnMIS-Liquidate-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Extsys-Ws-Master" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnExtsysDtls-Liquidate-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Settlements" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnSetlDtls-Liquidate-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Advices" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnAdvDtls-Liquidate-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Prjdet" type="{http://fcubs.ofss.com/service/FCUBSFTService}Ftcprjft-Liquidate-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Charges" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnOldChg-Liquidate-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Chgclmdet" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnChgClm-Liquidate-IO-Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract-Liquidate-IO-Type", propOrder = {
    "contrefno",
    "prod",
    "userrefno",
    "dbtacc",
    "cracc",
    "drvaldt",
    "crbrn",
    "crccy",
    "cramt",
    "crvaldt",
    "exgrate",
    "dbtbrn",
    "drccy",
    "dramount",
    "spreadcd",
    "mckno",
    "checknumber",
    "rtcd",
    "msgcd",
    "sourcerefno",
    "driban",
    "criban",
    "acctingasof",
    "multicreditrefno",
    "ourcorrespreq",
    "receiver",
    "awi",
    "awi5",
    "awi6",
    "ultiben6",
    "deliveryadd1",
    "deliveryadd2",
    "deliveryadd3",
    "deliveryadd4",
    "byorderof1",
    "byorderof2",
    "byorderof3",
    "byorderof4",
    "ultben1",
    "ultben2",
    "ultben3",
    "ultben4",
    "byorderof5",
    "ultben5",
    "awi2",
    "awi3",
    "awi4",
    "remitmsg",
    "rtrefrs",
    "upld",
    "regrep1",
    "regrep2",
    "regrep3",
    "envcontent1",
    "envcontent2",
    "envcontent3",
    "envcontent4",
    "envcontent5",
    "socialsecno",
    "deliverymode",
    "bookdt",
    "taxes",
    "txnudfdetails",
    "misdetails",
    "extsysWsMaster",
    "settlements",
    "advices",
    "prjdet",
    "charges",
    "chgclmdet"
})
public class ContractLiquidateIOType {

    @XmlElement(name = "CONTREFNO", required = true)
    protected String contrefno;
    @XmlElement(name = "PROD")
    protected String prod;
    @XmlElement(name = "USERREFNO")
    protected String userrefno;
    @XmlElement(name = "DBTACC")
    protected String dbtacc;
    @XmlElement(name = "CRACC")
    protected String cracc;
    @XmlElement(name = "DRVALDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar drvaldt;
    @XmlElement(name = "CRBRN")
    protected String crbrn;
    @XmlElement(name = "CRCCY")
    protected String crccy;
    @XmlElement(name = "CRAMT")
    protected BigDecimal cramt;
    @XmlElement(name = "CRVALDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crvaldt;
    @XmlElement(name = "EXG_RATE")
    protected BigDecimal exgrate;
    @XmlElement(name = "DBTBRN")
    protected String dbtbrn;
    @XmlElement(name = "DRCCY")
    protected String drccy;
    @XmlElement(name = "DR_AMOUNT")
    protected BigDecimal dramount;
    @XmlElement(name = "SPREADCD")
    protected String spreadcd;
    @XmlElement(name = "MCKNO")
    protected String mckno;
    @XmlElement(name = "CHECK_NUMBER")
    protected String checknumber;
    @XmlElement(name = "RTCD")
    protected String rtcd;
    @XmlElement(name = "MSGCD")
    protected String msgcd;
    @XmlElement(name = "SOURCEREFNO")
    protected String sourcerefno;
    @XmlElement(name = "DRIBAN")
    protected String driban;
    @XmlElement(name = "CRIBAN")
    protected String criban;
    @XmlElement(name = "ACCTINGASOF")
    protected String acctingasof;
    @XmlElement(name = "MULTI_CREDIT_REF_NO")
    protected String multicreditrefno;
    @XmlElement(name = "OURCORRESPREQ")
    protected String ourcorrespreq;
    @XmlElement(name = "RECEIVER")
    protected String receiver;
    @XmlElement(name = "AWI")
    protected String awi;
    @XmlElement(name = "AWI5")
    protected String awi5;
    @XmlElement(name = "AWI6")
    protected String awi6;
    @XmlElement(name = "ULTIBEN6")
    protected String ultiben6;
    @XmlElement(name = "DELIVERY_ADD1")
    protected String deliveryadd1;
    @XmlElement(name = "DELIVERY_ADD2")
    protected String deliveryadd2;
    @XmlElement(name = "DELIVERY_ADD3")
    protected String deliveryadd3;
    @XmlElement(name = "DELIVERY_ADD4")
    protected String deliveryadd4;
    @XmlElement(name = "BYORDEROF1")
    protected String byorderof1;
    @XmlElement(name = "BYORDEROF2")
    protected String byorderof2;
    @XmlElement(name = "BYORDEROF3")
    protected String byorderof3;
    @XmlElement(name = "BYORDEROF4")
    protected String byorderof4;
    @XmlElement(name = "ULTBEN1")
    protected String ultben1;
    @XmlElement(name = "ULTBEN2")
    protected String ultben2;
    @XmlElement(name = "ULTBEN3")
    protected String ultben3;
    @XmlElement(name = "ULTBEN4")
    protected String ultben4;
    @XmlElement(name = "BYORDEROF5")
    protected String byorderof5;
    @XmlElement(name = "ULTBEN5")
    protected String ultben5;
    @XmlElement(name = "AWI2")
    protected String awi2;
    @XmlElement(name = "AWI3")
    protected String awi3;
    @XmlElement(name = "AWI4")
    protected String awi4;
    @XmlElement(name = "REMITMSG")
    protected String remitmsg;
    @XmlElement(name = "RTREFRS")
    protected String rtrefrs;
    @XmlElement(name = "UPLD")
    protected String upld;
    @XmlElement(name = "REGREP1")
    protected String regrep1;
    @XmlElement(name = "REGREP2")
    protected String regrep2;
    @XmlElement(name = "REGREP3")
    protected String regrep3;
    @XmlElement(name = "ENVCONTENT1")
    protected String envcontent1;
    @XmlElement(name = "ENVCONTENT2")
    protected String envcontent2;
    @XmlElement(name = "ENVCONTENT3")
    protected String envcontent3;
    @XmlElement(name = "ENVCONTENT4")
    protected String envcontent4;
    @XmlElement(name = "ENVCONTENT5")
    protected String envcontent5;
    @XmlElement(name = "SOCIALSECNO")
    protected String socialsecno;
    @XmlElement(name = "DELIVERY_MODE")
    protected String deliverymode;
    @XmlElement(name = "BOOKDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookdt;
    @XmlElement(name = "Taxes")
    protected TxnTaxLiquidateIOType taxes;
    @XmlElement(name = "TXNUDFDETAILS")
    protected List<TXNUDFDETAILSType> txnudfdetails;
    @XmlElement(name = "Misdetails")
    protected TxnMISLiquidateIOType misdetails;
    @XmlElement(name = "Extsys-Ws-Master")
    protected TxnExtsysDtlsLiquidateIOType extsysWsMaster;
    @XmlElement(name = "Settlements")
    protected TxnSetlDtlsLiquidateIOType settlements;
    @XmlElement(name = "Advices")
    protected TxnAdvDtlsLiquidateIOType advices;
    @XmlElement(name = "Prjdet")
    protected FtcprjftLiquidateIOType prjdet;
    @XmlElement(name = "Charges")
    protected TxnOldChgLiquidateIOType charges;
    @XmlElement(name = "Chgclmdet")
    protected TxnChgClmLiquidateIOType chgclmdet;

    /**
     * Gets the value of the contrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTREFNO() {
        return contrefno;
    }

    /**
     * Sets the value of the contrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTREFNO(String value) {
        this.contrefno = value;
    }

    /**
     * Gets the value of the prod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROD() {
        return prod;
    }

    /**
     * Sets the value of the prod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROD(String value) {
        this.prod = value;
    }

    /**
     * Gets the value of the userrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERREFNO() {
        return userrefno;
    }

    /**
     * Sets the value of the userrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERREFNO(String value) {
        this.userrefno = value;
    }

    /**
     * Gets the value of the dbtacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBTACC() {
        return dbtacc;
    }

    /**
     * Sets the value of the dbtacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBTACC(String value) {
        this.dbtacc = value;
    }

    /**
     * Gets the value of the cracc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRACC() {
        return cracc;
    }

    /**
     * Sets the value of the cracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRACC(String value) {
        this.cracc = value;
    }

    /**
     * Gets the value of the drvaldt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDRVALDT() {
        return drvaldt;
    }

    /**
     * Sets the value of the drvaldt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDRVALDT(XMLGregorianCalendar value) {
        this.drvaldt = value;
    }

    /**
     * Gets the value of the crbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRBRN() {
        return crbrn;
    }

    /**
     * Sets the value of the crbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRBRN(String value) {
        this.crbrn = value;
    }

    /**
     * Gets the value of the crccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRCCY() {
        return crccy;
    }

    /**
     * Sets the value of the crccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRCCY(String value) {
        this.crccy = value;
    }

    /**
     * Gets the value of the cramt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRAMT() {
        return cramt;
    }

    /**
     * Sets the value of the cramt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRAMT(BigDecimal value) {
        this.cramt = value;
    }

    /**
     * Gets the value of the crvaldt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCRVALDT() {
        return crvaldt;
    }

    /**
     * Sets the value of the crvaldt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCRVALDT(XMLGregorianCalendar value) {
        this.crvaldt = value;
    }

    /**
     * Gets the value of the exgrate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEXGRATE() {
        return exgrate;
    }

    /**
     * Sets the value of the exgrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEXGRATE(BigDecimal value) {
        this.exgrate = value;
    }

    /**
     * Gets the value of the dbtbrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBTBRN() {
        return dbtbrn;
    }

    /**
     * Sets the value of the dbtbrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBTBRN(String value) {
        this.dbtbrn = value;
    }

    /**
     * Gets the value of the drccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRCCY() {
        return drccy;
    }

    /**
     * Sets the value of the drccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRCCY(String value) {
        this.drccy = value;
    }

    /**
     * Gets the value of the dramount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRAMOUNT() {
        return dramount;
    }

    /**
     * Sets the value of the dramount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRAMOUNT(BigDecimal value) {
        this.dramount = value;
    }

    /**
     * Gets the value of the spreadcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPREADCD() {
        return spreadcd;
    }

    /**
     * Sets the value of the spreadcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPREADCD(String value) {
        this.spreadcd = value;
    }

    /**
     * Gets the value of the mckno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCKNO() {
        return mckno;
    }

    /**
     * Sets the value of the mckno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCKNO(String value) {
        this.mckno = value;
    }

    /**
     * Gets the value of the checknumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKNUMBER() {
        return checknumber;
    }

    /**
     * Sets the value of the checknumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKNUMBER(String value) {
        this.checknumber = value;
    }

    /**
     * Gets the value of the rtcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTCD() {
        return rtcd;
    }

    /**
     * Sets the value of the rtcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTCD(String value) {
        this.rtcd = value;
    }

    /**
     * Gets the value of the msgcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGCD() {
        return msgcd;
    }

    /**
     * Sets the value of the msgcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGCD(String value) {
        this.msgcd = value;
    }

    /**
     * Gets the value of the sourcerefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCEREFNO() {
        return sourcerefno;
    }

    /**
     * Sets the value of the sourcerefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCEREFNO(String value) {
        this.sourcerefno = value;
    }

    /**
     * Gets the value of the driban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRIBAN() {
        return driban;
    }

    /**
     * Sets the value of the driban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRIBAN(String value) {
        this.driban = value;
    }

    /**
     * Gets the value of the criban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRIBAN() {
        return criban;
    }

    /**
     * Sets the value of the criban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRIBAN(String value) {
        this.criban = value;
    }

    /**
     * Gets the value of the acctingasof property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCTINGASOF() {
        return acctingasof;
    }

    /**
     * Sets the value of the acctingasof property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCTINGASOF(String value) {
        this.acctingasof = value;
    }

    /**
     * Gets the value of the multicreditrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMULTICREDITREFNO() {
        return multicreditrefno;
    }

    /**
     * Sets the value of the multicreditrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMULTICREDITREFNO(String value) {
        this.multicreditrefno = value;
    }

    /**
     * Gets the value of the ourcorrespreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOURCORRESPREQ() {
        return ourcorrespreq;
    }

    /**
     * Sets the value of the ourcorrespreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOURCORRESPREQ(String value) {
        this.ourcorrespreq = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVER() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVER(String value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the awi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWI() {
        return awi;
    }

    /**
     * Sets the value of the awi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWI(String value) {
        this.awi = value;
    }

    /**
     * Gets the value of the awi5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWI5() {
        return awi5;
    }

    /**
     * Sets the value of the awi5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWI5(String value) {
        this.awi5 = value;
    }

    /**
     * Gets the value of the awi6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWI6() {
        return awi6;
    }

    /**
     * Sets the value of the awi6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWI6(String value) {
        this.awi6 = value;
    }

    /**
     * Gets the value of the ultiben6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTIBEN6() {
        return ultiben6;
    }

    /**
     * Sets the value of the ultiben6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTIBEN6(String value) {
        this.ultiben6 = value;
    }

    /**
     * Gets the value of the deliveryadd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD1() {
        return deliveryadd1;
    }

    /**
     * Sets the value of the deliveryadd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD1(String value) {
        this.deliveryadd1 = value;
    }

    /**
     * Gets the value of the deliveryadd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD2() {
        return deliveryadd2;
    }

    /**
     * Sets the value of the deliveryadd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD2(String value) {
        this.deliveryadd2 = value;
    }

    /**
     * Gets the value of the deliveryadd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD3() {
        return deliveryadd3;
    }

    /**
     * Sets the value of the deliveryadd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD3(String value) {
        this.deliveryadd3 = value;
    }

    /**
     * Gets the value of the deliveryadd4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYADD4() {
        return deliveryadd4;
    }

    /**
     * Sets the value of the deliveryadd4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYADD4(String value) {
        this.deliveryadd4 = value;
    }

    /**
     * Gets the value of the byorderof1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYORDEROF1() {
        return byorderof1;
    }

    /**
     * Sets the value of the byorderof1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYORDEROF1(String value) {
        this.byorderof1 = value;
    }

    /**
     * Gets the value of the byorderof2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYORDEROF2() {
        return byorderof2;
    }

    /**
     * Sets the value of the byorderof2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYORDEROF2(String value) {
        this.byorderof2 = value;
    }

    /**
     * Gets the value of the byorderof3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYORDEROF3() {
        return byorderof3;
    }

    /**
     * Sets the value of the byorderof3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYORDEROF3(String value) {
        this.byorderof3 = value;
    }

    /**
     * Gets the value of the byorderof4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYORDEROF4() {
        return byorderof4;
    }

    /**
     * Sets the value of the byorderof4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYORDEROF4(String value) {
        this.byorderof4 = value;
    }

    /**
     * Gets the value of the ultben1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBEN1() {
        return ultben1;
    }

    /**
     * Sets the value of the ultben1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBEN1(String value) {
        this.ultben1 = value;
    }

    /**
     * Gets the value of the ultben2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBEN2() {
        return ultben2;
    }

    /**
     * Sets the value of the ultben2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBEN2(String value) {
        this.ultben2 = value;
    }

    /**
     * Gets the value of the ultben3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBEN3() {
        return ultben3;
    }

    /**
     * Sets the value of the ultben3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBEN3(String value) {
        this.ultben3 = value;
    }

    /**
     * Gets the value of the ultben4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBEN4() {
        return ultben4;
    }

    /**
     * Sets the value of the ultben4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBEN4(String value) {
        this.ultben4 = value;
    }

    /**
     * Gets the value of the byorderof5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYORDEROF5() {
        return byorderof5;
    }

    /**
     * Sets the value of the byorderof5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYORDEROF5(String value) {
        this.byorderof5 = value;
    }

    /**
     * Gets the value of the ultben5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULTBEN5() {
        return ultben5;
    }

    /**
     * Sets the value of the ultben5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULTBEN5(String value) {
        this.ultben5 = value;
    }

    /**
     * Gets the value of the awi2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWI2() {
        return awi2;
    }

    /**
     * Sets the value of the awi2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWI2(String value) {
        this.awi2 = value;
    }

    /**
     * Gets the value of the awi3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWI3() {
        return awi3;
    }

    /**
     * Sets the value of the awi3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWI3(String value) {
        this.awi3 = value;
    }

    /**
     * Gets the value of the awi4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWI4() {
        return awi4;
    }

    /**
     * Sets the value of the awi4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWI4(String value) {
        this.awi4 = value;
    }

    /**
     * Gets the value of the remitmsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMITMSG() {
        return remitmsg;
    }

    /**
     * Sets the value of the remitmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMITMSG(String value) {
        this.remitmsg = value;
    }

    /**
     * Gets the value of the rtrefrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTREFRS() {
        return rtrefrs;
    }

    /**
     * Sets the value of the rtrefrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTREFRS(String value) {
        this.rtrefrs = value;
    }

    /**
     * Gets the value of the upld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPLD() {
        return upld;
    }

    /**
     * Sets the value of the upld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPLD(String value) {
        this.upld = value;
    }

    /**
     * Gets the value of the regrep1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGREP1() {
        return regrep1;
    }

    /**
     * Sets the value of the regrep1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGREP1(String value) {
        this.regrep1 = value;
    }

    /**
     * Gets the value of the regrep2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGREP2() {
        return regrep2;
    }

    /**
     * Sets the value of the regrep2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGREP2(String value) {
        this.regrep2 = value;
    }

    /**
     * Gets the value of the regrep3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGREP3() {
        return regrep3;
    }

    /**
     * Sets the value of the regrep3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGREP3(String value) {
        this.regrep3 = value;
    }

    /**
     * Gets the value of the envcontent1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENVCONTENT1() {
        return envcontent1;
    }

    /**
     * Sets the value of the envcontent1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENVCONTENT1(String value) {
        this.envcontent1 = value;
    }

    /**
     * Gets the value of the envcontent2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENVCONTENT2() {
        return envcontent2;
    }

    /**
     * Sets the value of the envcontent2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENVCONTENT2(String value) {
        this.envcontent2 = value;
    }

    /**
     * Gets the value of the envcontent3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENVCONTENT3() {
        return envcontent3;
    }

    /**
     * Sets the value of the envcontent3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENVCONTENT3(String value) {
        this.envcontent3 = value;
    }

    /**
     * Gets the value of the envcontent4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENVCONTENT4() {
        return envcontent4;
    }

    /**
     * Sets the value of the envcontent4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENVCONTENT4(String value) {
        this.envcontent4 = value;
    }

    /**
     * Gets the value of the envcontent5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENVCONTENT5() {
        return envcontent5;
    }

    /**
     * Sets the value of the envcontent5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENVCONTENT5(String value) {
        this.envcontent5 = value;
    }

    /**
     * Gets the value of the socialsecno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOCIALSECNO() {
        return socialsecno;
    }

    /**
     * Sets the value of the socialsecno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOCIALSECNO(String value) {
        this.socialsecno = value;
    }

    /**
     * Gets the value of the deliverymode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDELIVERYMODE() {
        return deliverymode;
    }

    /**
     * Sets the value of the deliverymode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDELIVERYMODE(String value) {
        this.deliverymode = value;
    }

    /**
     * Gets the value of the bookdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBOOKDT() {
        return bookdt;
    }

    /**
     * Sets the value of the bookdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBOOKDT(XMLGregorianCalendar value) {
        this.bookdt = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TxnTaxLiquidateIOType }
     *     
     */
    public TxnTaxLiquidateIOType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnTaxLiquidateIOType }
     *     
     */
    public void setTaxes(TxnTaxLiquidateIOType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the txnudfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the txnudfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTXNUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TXNUDFDETAILSType }
     * 
     * 
     */
    public List<TXNUDFDETAILSType> getTXNUDFDETAILS() {
        if (txnudfdetails == null) {
            txnudfdetails = new ArrayList<TXNUDFDETAILSType>();
        }
        return this.txnudfdetails;
    }

    /**
     * Gets the value of the misdetails property.
     * 
     * @return
     *     possible object is
     *     {@link TxnMISLiquidateIOType }
     *     
     */
    public TxnMISLiquidateIOType getMisdetails() {
        return misdetails;
    }

    /**
     * Sets the value of the misdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnMISLiquidateIOType }
     *     
     */
    public void setMisdetails(TxnMISLiquidateIOType value) {
        this.misdetails = value;
    }

    /**
     * Gets the value of the extsysWsMaster property.
     * 
     * @return
     *     possible object is
     *     {@link TxnExtsysDtlsLiquidateIOType }
     *     
     */
    public TxnExtsysDtlsLiquidateIOType getExtsysWsMaster() {
        return extsysWsMaster;
    }

    /**
     * Sets the value of the extsysWsMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnExtsysDtlsLiquidateIOType }
     *     
     */
    public void setExtsysWsMaster(TxnExtsysDtlsLiquidateIOType value) {
        this.extsysWsMaster = value;
    }

    /**
     * Gets the value of the settlements property.
     * 
     * @return
     *     possible object is
     *     {@link TxnSetlDtlsLiquidateIOType }
     *     
     */
    public TxnSetlDtlsLiquidateIOType getSettlements() {
        return settlements;
    }

    /**
     * Sets the value of the settlements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnSetlDtlsLiquidateIOType }
     *     
     */
    public void setSettlements(TxnSetlDtlsLiquidateIOType value) {
        this.settlements = value;
    }

    /**
     * Gets the value of the advices property.
     * 
     * @return
     *     possible object is
     *     {@link TxnAdvDtlsLiquidateIOType }
     *     
     */
    public TxnAdvDtlsLiquidateIOType getAdvices() {
        return advices;
    }

    /**
     * Sets the value of the advices property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnAdvDtlsLiquidateIOType }
     *     
     */
    public void setAdvices(TxnAdvDtlsLiquidateIOType value) {
        this.advices = value;
    }

    /**
     * Gets the value of the prjdet property.
     * 
     * @return
     *     possible object is
     *     {@link FtcprjftLiquidateIOType }
     *     
     */
    public FtcprjftLiquidateIOType getPrjdet() {
        return prjdet;
    }

    /**
     * Sets the value of the prjdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FtcprjftLiquidateIOType }
     *     
     */
    public void setPrjdet(FtcprjftLiquidateIOType value) {
        this.prjdet = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link TxnOldChgLiquidateIOType }
     *     
     */
    public TxnOldChgLiquidateIOType getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnOldChgLiquidateIOType }
     *     
     */
    public void setCharges(TxnOldChgLiquidateIOType value) {
        this.charges = value;
    }

    /**
     * Gets the value of the chgclmdet property.
     * 
     * @return
     *     possible object is
     *     {@link TxnChgClmLiquidateIOType }
     *     
     */
    public TxnChgClmLiquidateIOType getChgclmdet() {
        return chgclmdet;
    }

    /**
     * Sets the value of the chgclmdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnChgClmLiquidateIOType }
     *     
     */
    public void setChgclmdet(TxnChgClmLiquidateIOType value) {
        this.chgclmdet = value;
    }

}
