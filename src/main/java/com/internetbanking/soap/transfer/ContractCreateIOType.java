
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
 * <p>Java class for Contract-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONTREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USERREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DBTACC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CRACC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DRVALDT" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="CRBRN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CRCCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CRAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CRVALDT" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="EXG_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DBTBRN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DRCCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DR_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="SPREADCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MCKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHRGBEARER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSGCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOURCEREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCTINGASOF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MULTI_CREDIT_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNTYPECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OURCORRESPREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECEIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AWI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MESSAGEREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AWI5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AWI6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ULTIBEN6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EXTDEALRF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DELIVERY_ADD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OVEROVERDRFT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENTDET1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENTDET2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENTDET3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYMENTDET4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="BYORDEROF6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INTRMKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMITMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAXNUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MOBNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EMAILID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="RATEREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RATE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RATE_SERIAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BOOKDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="BANKOPERCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSTRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USRREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MODCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ONCEAUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cust-Cover-Details" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDCUST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDCUST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDCUST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDCUST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDCUST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDIARY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDIARY2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMED3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMED4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDIARY5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCWITHINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCWITHINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCWITHINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCWITHINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCWITHINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ULTBEN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ULTBEN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ULTBEN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ULTBEN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ULTBEN5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMITINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMITINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMITINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMITINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDR_TO_RCVR_INFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDR_TO_RCVR_INFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDR_TO_RCVR_INFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDR_TO_RCVR_INFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDR_TO_RCVR_INFO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SNDR_TO_RCVR_INFO6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Stop-Payment" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="PMTCHKRECVED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DRAUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REFUNDCOVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHKNOTDEBITED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHKLOST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STMTNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="STMTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="NARRATIVE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NARRATIVE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NARRATIVE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NARRATIVE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NARRATIVE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NARRATIVE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REJECT_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Notif-Err-Log" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ERR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Taxes" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnTax-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="TXNUDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSFTService}TXNUDFDETAILSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Misdetails" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnMIS-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Extsys-Ws-Master" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnExtsysDtls-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Settlements" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnSetlDtls-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Advices" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnAdvDtls-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Prjdet" type="{http://fcubs.ofss.com/service/FCUBSFTService}Ftcprjft-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Charges" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnOldChg-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Chgclmdet" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnChgClm-Create-IO-Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract-Create-IO-Type", propOrder = {
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
    "chrgbearer",
    "rtcd",
    "msgcd",
    "sourcerefno",
    "acctingasof",
    "multicreditrefno",
    "txntypecd",
    "ourcorrespreq",
    "receiver",
    "awi",
    "messageref",
    "awi5",
    "awi6",
    "ultiben6",
    "extdealrf",
    "deliveryadd1",
    "deliveryadd2",
    "deliveryadd3",
    "deliveryadd4",
    "overoverdrft",
    "paymentdet1",
    "paymentdet2",
    "paymentdet3",
    "paymentdet4",
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
    "byorderof6",
    "intrmks",
    "remitmsg",
    "upld",
    "faxnumber",
    "mobno",
    "emailid",
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
    "rateref",
    "ratedate",
    "rateserial",
    "bookdt",
    "bankopercd",
    "instrcd",
    "usrref",
    "prdcd",
    "cpty",
    "modcd",
    "conccy",
    "source",
    "txnstat",
    "onceauth",
    "custCoverDetails",
    "stopPayment",
    "notifErrLog",
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
public class ContractCreateIOType {

    @XmlElement(name = "CONTREFNO", required = true)
    protected String contrefno;
    @XmlElement(name = "PROD")
    protected String prod;
    @XmlElement(name = "USERREFNO")
    protected String userrefno;
    @XmlElement(name = "DBTACC", required = true)
    protected String dbtacc;
    @XmlElement(name = "CRACC", required = true)
    protected String cracc;
    @XmlElement(name = "DRVALDT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar drvaldt;
    @XmlElement(name = "CRBRN", required = true)
    protected String crbrn;
    @XmlElement(name = "CRCCY", required = true)
    protected String crccy;
    @XmlElement(name = "CRAMT", required = true)
    protected BigDecimal cramt;
    @XmlElement(name = "CRVALDT", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crvaldt;
    @XmlElement(name = "EXG_RATE")
    protected BigDecimal exgrate;
    @XmlElement(name = "DBTBRN", required = true)
    protected String dbtbrn;
    @XmlElement(name = "DRCCY", required = true)
    protected String drccy;
    @XmlElement(name = "DR_AMOUNT", required = true)
    protected BigDecimal dramount;
    @XmlElement(name = "SPREADCD")
    protected String spreadcd;
    @XmlElement(name = "MCKNO")
    protected String mckno;
    @XmlElement(name = "CHECK_NUMBER")
    protected String checknumber;
    @XmlElement(name = "CHRGBEARER")
    protected String chrgbearer;
    @XmlElement(name = "RTCD")
    protected String rtcd;
    @XmlElement(name = "MSGCD")
    protected String msgcd;
    @XmlElement(name = "SOURCEREFNO")
    protected String sourcerefno;
    @XmlElement(name = "ACCTINGASOF")
    protected String acctingasof;
    @XmlElement(name = "MULTI_CREDIT_REF_NO")
    protected String multicreditrefno;
    @XmlElement(name = "TXNTYPECD")
    protected String txntypecd;
    @XmlElement(name = "OURCORRESPREQ")
    protected String ourcorrespreq;
    @XmlElement(name = "RECEIVER")
    protected String receiver;
    @XmlElement(name = "AWI")
    protected String awi;
    @XmlElement(name = "MESSAGEREF")
    protected String messageref;
    @XmlElement(name = "AWI5")
    protected String awi5;
    @XmlElement(name = "AWI6")
    protected String awi6;
    @XmlElement(name = "ULTIBEN6")
    protected String ultiben6;
    @XmlElement(name = "EXTDEALRF")
    protected String extdealrf;
    @XmlElement(name = "DELIVERY_ADD1")
    protected String deliveryadd1;
    @XmlElement(name = "DELIVERY_ADD2")
    protected String deliveryadd2;
    @XmlElement(name = "DELIVERY_ADD3")
    protected String deliveryadd3;
    @XmlElement(name = "DELIVERY_ADD4")
    protected String deliveryadd4;
    @XmlElement(name = "OVEROVERDRFT")
    protected String overoverdrft;
    @XmlElement(name = "PAYMENTDET1")
    protected String paymentdet1;
    @XmlElement(name = "PAYMENTDET2")
    protected String paymentdet2;
    @XmlElement(name = "PAYMENTDET3")
    protected String paymentdet3;
    @XmlElement(name = "PAYMENTDET4")
    protected String paymentdet4;
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
    @XmlElement(name = "BYORDEROF6")
    protected String byorderof6;
    @XmlElement(name = "INTRMKS")
    protected String intrmks;
    @XmlElement(name = "REMITMSG")
    protected String remitmsg;
    @XmlElement(name = "UPLD")
    protected String upld;
    @XmlElement(name = "FAXNUMBER")
    protected String faxnumber;
    @XmlElement(name = "MOBNO")
    protected String mobno;
    @XmlElement(name = "EMAILID")
    protected String emailid;
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
    @XmlElement(name = "RATEREF")
    protected String rateref;
    @XmlElement(name = "RATE_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ratedate;
    @XmlElement(name = "RATE_SERIAL")
    protected BigDecimal rateserial;
    @XmlElement(name = "BOOKDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookdt;
    @XmlElement(name = "BANKOPERCD")
    protected String bankopercd;
    @XmlElement(name = "INSTRCD")
    protected String instrcd;
    @XmlElement(name = "USRREF")
    protected String usrref;
    @XmlElement(name = "PRDCD")
    protected String prdcd;
    @XmlElement(name = "CPTY")
    protected String cpty;
    @XmlElement(name = "MODCD")
    protected String modcd;
    @XmlElement(name = "CONCCY")
    protected String conccy;
    @XmlElement(name = "SOURCE")
    protected String source;
    @XmlElement(name = "TXNSTAT")
    protected String txnstat;
    @XmlElement(name = "ONCEAUTH")
    protected String onceauth;
    @XmlElement(name = "Cust-Cover-Details")
    protected CustCoverDetails custCoverDetails;
    @XmlElement(name = "Stop-Payment")
    protected StopPayment stopPayment;
    @XmlElement(name = "Notif-Err-Log")
    protected NotifErrLog notifErrLog;
    @XmlElement(name = "Taxes")
    protected TxnTaxCreateIOType taxes;
    @XmlElement(name = "TXNUDFDETAILS")
    protected List<TXNUDFDETAILSType> txnudfdetails;
    @XmlElement(name = "Misdetails")
    protected TxnMISCreateIOType misdetails;
    @XmlElement(name = "Extsys-Ws-Master")
    protected TxnExtsysDtlsCreateIOType extsysWsMaster;
    @XmlElement(name = "Settlements")
    protected TxnSetlDtlsCreateIOType settlements;
    @XmlElement(name = "Advices")
    protected TxnAdvDtlsCreateIOType advices;
    @XmlElement(name = "Prjdet")
    protected FtcprjftCreateIOType prjdet;
    @XmlElement(name = "Charges")
    protected TxnOldChgCreateIOType charges;
    @XmlElement(name = "Chgclmdet")
    protected TxnChgClmCreateIOType chgclmdet;

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
     * Gets the value of the chrgbearer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHRGBEARER() {
        return chrgbearer;
    }

    /**
     * Sets the value of the chrgbearer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHRGBEARER(String value) {
        this.chrgbearer = value;
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
     * Gets the value of the txntypecd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNTYPECD() {
        return txntypecd;
    }

    /**
     * Sets the value of the txntypecd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNTYPECD(String value) {
        this.txntypecd = value;
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
     * Gets the value of the messageref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGEREF() {
        return messageref;
    }

    /**
     * Sets the value of the messageref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGEREF(String value) {
        this.messageref = value;
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
     * Gets the value of the extdealrf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTDEALRF() {
        return extdealrf;
    }

    /**
     * Sets the value of the extdealrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXTDEALRF(String value) {
        this.extdealrf = value;
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
     * Gets the value of the overoverdrft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOVEROVERDRFT() {
        return overoverdrft;
    }

    /**
     * Sets the value of the overoverdrft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOVEROVERDRFT(String value) {
        this.overoverdrft = value;
    }

    /**
     * Gets the value of the paymentdet1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTDET1() {
        return paymentdet1;
    }

    /**
     * Sets the value of the paymentdet1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTDET1(String value) {
        this.paymentdet1 = value;
    }

    /**
     * Gets the value of the paymentdet2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTDET2() {
        return paymentdet2;
    }

    /**
     * Sets the value of the paymentdet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTDET2(String value) {
        this.paymentdet2 = value;
    }

    /**
     * Gets the value of the paymentdet3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTDET3() {
        return paymentdet3;
    }

    /**
     * Sets the value of the paymentdet3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTDET3(String value) {
        this.paymentdet3 = value;
    }

    /**
     * Gets the value of the paymentdet4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTDET4() {
        return paymentdet4;
    }

    /**
     * Sets the value of the paymentdet4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTDET4(String value) {
        this.paymentdet4 = value;
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
     * Gets the value of the byorderof6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBYORDEROF6() {
        return byorderof6;
    }

    /**
     * Sets the value of the byorderof6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBYORDEROF6(String value) {
        this.byorderof6 = value;
    }

    /**
     * Gets the value of the intrmks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTRMKS() {
        return intrmks;
    }

    /**
     * Sets the value of the intrmks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTRMKS(String value) {
        this.intrmks = value;
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
     * Gets the value of the faxnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAXNUMBER() {
        return faxnumber;
    }

    /**
     * Sets the value of the faxnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAXNUMBER(String value) {
        this.faxnumber = value;
    }

    /**
     * Gets the value of the mobno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOBNO() {
        return mobno;
    }

    /**
     * Sets the value of the mobno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOBNO(String value) {
        this.mobno = value;
    }

    /**
     * Gets the value of the emailid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMAILID() {
        return emailid;
    }

    /**
     * Sets the value of the emailid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMAILID(String value) {
        this.emailid = value;
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
     * Gets the value of the rateref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATEREF() {
        return rateref;
    }

    /**
     * Sets the value of the rateref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATEREF(String value) {
        this.rateref = value;
    }

    /**
     * Gets the value of the ratedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRATEDATE() {
        return ratedate;
    }

    /**
     * Sets the value of the ratedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRATEDATE(XMLGregorianCalendar value) {
        this.ratedate = value;
    }

    /**
     * Gets the value of the rateserial property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRATESERIAL() {
        return rateserial;
    }

    /**
     * Sets the value of the rateserial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRATESERIAL(BigDecimal value) {
        this.rateserial = value;
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
     * Gets the value of the bankopercd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKOPERCD() {
        return bankopercd;
    }

    /**
     * Sets the value of the bankopercd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKOPERCD(String value) {
        this.bankopercd = value;
    }

    /**
     * Gets the value of the instrcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRCD() {
        return instrcd;
    }

    /**
     * Sets the value of the instrcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRCD(String value) {
        this.instrcd = value;
    }

    /**
     * Gets the value of the usrref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRREF() {
        return usrref;
    }

    /**
     * Sets the value of the usrref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRREF(String value) {
        this.usrref = value;
    }

    /**
     * Gets the value of the prdcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDCD() {
        return prdcd;
    }

    /**
     * Sets the value of the prdcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDCD(String value) {
        this.prdcd = value;
    }

    /**
     * Gets the value of the cpty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPTY() {
        return cpty;
    }

    /**
     * Sets the value of the cpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPTY(String value) {
        this.cpty = value;
    }

    /**
     * Gets the value of the modcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODCD() {
        return modcd;
    }

    /**
     * Sets the value of the modcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODCD(String value) {
        this.modcd = value;
    }

    /**
     * Gets the value of the conccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONCCY() {
        return conccy;
    }

    /**
     * Sets the value of the conccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONCCY(String value) {
        this.conccy = value;
    }

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
     * Gets the value of the txnstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNSTAT() {
        return txnstat;
    }

    /**
     * Sets the value of the txnstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNSTAT(String value) {
        this.txnstat = value;
    }

    /**
     * Gets the value of the onceauth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONCEAUTH() {
        return onceauth;
    }

    /**
     * Sets the value of the onceauth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONCEAUTH(String value) {
        this.onceauth = value;
    }

    /**
     * Gets the value of the custCoverDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustCoverDetails }
     *     
     */
    public CustCoverDetails getCustCoverDetails() {
        return custCoverDetails;
    }

    /**
     * Sets the value of the custCoverDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustCoverDetails }
     *     
     */
    public void setCustCoverDetails(CustCoverDetails value) {
        this.custCoverDetails = value;
    }

    /**
     * Gets the value of the stopPayment property.
     * 
     * @return
     *     possible object is
     *     {@link StopPayment }
     *     
     */
    public StopPayment getStopPayment() {
        return stopPayment;
    }

    /**
     * Sets the value of the stopPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPayment }
     *     
     */
    public void setStopPayment(StopPayment value) {
        this.stopPayment = value;
    }

    /**
     * Gets the value of the notifErrLog property.
     * 
     * @return
     *     possible object is
     *     {@link NotifErrLog }
     *     
     */
    public NotifErrLog getNotifErrLog() {
        return notifErrLog;
    }

    /**
     * Sets the value of the notifErrLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifErrLog }
     *     
     */
    public void setNotifErrLog(NotifErrLog value) {
        this.notifErrLog = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TxnTaxCreateIOType }
     *     
     */
    public TxnTaxCreateIOType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnTaxCreateIOType }
     *     
     */
    public void setTaxes(TxnTaxCreateIOType value) {
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
     *     {@link TxnMISCreateIOType }
     *     
     */
    public TxnMISCreateIOType getMisdetails() {
        return misdetails;
    }

    /**
     * Sets the value of the misdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnMISCreateIOType }
     *     
     */
    public void setMisdetails(TxnMISCreateIOType value) {
        this.misdetails = value;
    }

    /**
     * Gets the value of the extsysWsMaster property.
     * 
     * @return
     *     possible object is
     *     {@link TxnExtsysDtlsCreateIOType }
     *     
     */
    public TxnExtsysDtlsCreateIOType getExtsysWsMaster() {
        return extsysWsMaster;
    }

    /**
     * Sets the value of the extsysWsMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnExtsysDtlsCreateIOType }
     *     
     */
    public void setExtsysWsMaster(TxnExtsysDtlsCreateIOType value) {
        this.extsysWsMaster = value;
    }

    /**
     * Gets the value of the settlements property.
     * 
     * @return
     *     possible object is
     *     {@link TxnSetlDtlsCreateIOType }
     *     
     */
    public TxnSetlDtlsCreateIOType getSettlements() {
        return settlements;
    }

    /**
     * Sets the value of the settlements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnSetlDtlsCreateIOType }
     *     
     */
    public void setSettlements(TxnSetlDtlsCreateIOType value) {
        this.settlements = value;
    }

    /**
     * Gets the value of the advices property.
     * 
     * @return
     *     possible object is
     *     {@link TxnAdvDtlsCreateIOType }
     *     
     */
    public TxnAdvDtlsCreateIOType getAdvices() {
        return advices;
    }

    /**
     * Sets the value of the advices property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnAdvDtlsCreateIOType }
     *     
     */
    public void setAdvices(TxnAdvDtlsCreateIOType value) {
        this.advices = value;
    }

    /**
     * Gets the value of the prjdet property.
     * 
     * @return
     *     possible object is
     *     {@link FtcprjftCreateIOType }
     *     
     */
    public FtcprjftCreateIOType getPrjdet() {
        return prjdet;
    }

    /**
     * Sets the value of the prjdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FtcprjftCreateIOType }
     *     
     */
    public void setPrjdet(FtcprjftCreateIOType value) {
        this.prjdet = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link TxnOldChgCreateIOType }
     *     
     */
    public TxnOldChgCreateIOType getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnOldChgCreateIOType }
     *     
     */
    public void setCharges(TxnOldChgCreateIOType value) {
        this.charges = value;
    }

    /**
     * Gets the value of the chgclmdet property.
     * 
     * @return
     *     possible object is
     *     {@link TxnChgClmCreateIOType }
     *     
     */
    public TxnChgClmCreateIOType getChgclmdet() {
        return chgclmdet;
    }

    /**
     * Sets the value of the chgclmdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnChgClmCreateIOType }
     *     
     */
    public void setChgclmdet(TxnChgClmCreateIOType value) {
        this.chgclmdet = value;
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
     *         &lt;element name="FCCREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDCUST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDCUST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDCUST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDCUST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDCUST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDIARY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDIARY2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMED3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMED4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDIARY5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCWITHINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCWITHINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCWITHINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCWITHINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCWITHINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ULTBEN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ULTBEN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ULTBEN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ULTBEN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ULTBEN5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMITINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMITINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMITINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMITINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDR_TO_RCVR_INFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDR_TO_RCVR_INFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDR_TO_RCVR_INFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDR_TO_RCVR_INFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDR_TO_RCVR_INFO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SNDR_TO_RCVR_INFO6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "fccref",
        "ordcust1",
        "ordcust2",
        "ordcust3",
        "ordcust4",
        "ordcust5",
        "ordinst1",
        "ordinst2",
        "ordinst3",
        "ordinst4",
        "ordinst5",
        "intermediary1",
        "intermediary2",
        "intermed3",
        "intermed4",
        "intermediary5",
        "accwithinst1",
        "accwithinst2",
        "accwithinst3",
        "accwithinst4",
        "accwithinst5",
        "ultben1",
        "ultben2",
        "ultben3",
        "ultben4",
        "ultben5",
        "remitinfo1",
        "remitinfo2",
        "remitinfo3",
        "remitinfo4",
        "sndrtorcvrinfo1",
        "sndrtorcvrinfo2",
        "sndrtorcvrinfo3",
        "sndrtorcvrinfo4",
        "sndrtorcvrinfo5",
        "sndrtorcvrinfo6",
        "ccy",
        "amt"
    })
    public static class CustCoverDetails {

        @XmlElement(name = "FCCREF")
        protected String fccref;
        @XmlElement(name = "ORDCUST1")
        protected String ordcust1;
        @XmlElement(name = "ORDCUST2")
        protected String ordcust2;
        @XmlElement(name = "ORDCUST3")
        protected String ordcust3;
        @XmlElement(name = "ORDCUST4")
        protected String ordcust4;
        @XmlElement(name = "ORDCUST5")
        protected String ordcust5;
        @XmlElement(name = "ORDINST1")
        protected String ordinst1;
        @XmlElement(name = "ORDINST2")
        protected String ordinst2;
        @XmlElement(name = "ORDINST3")
        protected String ordinst3;
        @XmlElement(name = "ORDINST4")
        protected String ordinst4;
        @XmlElement(name = "ORDINST5")
        protected String ordinst5;
        @XmlElement(name = "INTERMEDIARY1")
        protected String intermediary1;
        @XmlElement(name = "INTERMEDIARY2")
        protected String intermediary2;
        @XmlElement(name = "INTERMED3")
        protected String intermed3;
        @XmlElement(name = "INTERMED4")
        protected String intermed4;
        @XmlElement(name = "INTERMEDIARY5")
        protected String intermediary5;
        @XmlElement(name = "ACCWITHINST1")
        protected String accwithinst1;
        @XmlElement(name = "ACCWITHINST2")
        protected String accwithinst2;
        @XmlElement(name = "ACCWITHINST3")
        protected String accwithinst3;
        @XmlElement(name = "ACCWITHINST4")
        protected String accwithinst4;
        @XmlElement(name = "ACCWITHINST5")
        protected String accwithinst5;
        @XmlElement(name = "ULTBEN1")
        protected String ultben1;
        @XmlElement(name = "ULTBEN2")
        protected String ultben2;
        @XmlElement(name = "ULTBEN3")
        protected String ultben3;
        @XmlElement(name = "ULTBEN4")
        protected String ultben4;
        @XmlElement(name = "ULTBEN5")
        protected String ultben5;
        @XmlElement(name = "REMITINFO1")
        protected String remitinfo1;
        @XmlElement(name = "REMITINFO2")
        protected String remitinfo2;
        @XmlElement(name = "REMITINFO3")
        protected String remitinfo3;
        @XmlElement(name = "REMITINFO4")
        protected String remitinfo4;
        @XmlElement(name = "SNDR_TO_RCVR_INFO1")
        protected String sndrtorcvrinfo1;
        @XmlElement(name = "SNDR_TO_RCVR_INFO2")
        protected String sndrtorcvrinfo2;
        @XmlElement(name = "SNDR_TO_RCVR_INFO3")
        protected String sndrtorcvrinfo3;
        @XmlElement(name = "SNDR_TO_RCVR_INFO4")
        protected String sndrtorcvrinfo4;
        @XmlElement(name = "SNDR_TO_RCVR_INFO5")
        protected String sndrtorcvrinfo5;
        @XmlElement(name = "SNDR_TO_RCVR_INFO6")
        protected String sndrtorcvrinfo6;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "AMT")
        protected BigDecimal amt;

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
         * Gets the value of the ordcust1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDCUST1() {
            return ordcust1;
        }

        /**
         * Sets the value of the ordcust1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDCUST1(String value) {
            this.ordcust1 = value;
        }

        /**
         * Gets the value of the ordcust2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDCUST2() {
            return ordcust2;
        }

        /**
         * Sets the value of the ordcust2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDCUST2(String value) {
            this.ordcust2 = value;
        }

        /**
         * Gets the value of the ordcust3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDCUST3() {
            return ordcust3;
        }

        /**
         * Sets the value of the ordcust3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDCUST3(String value) {
            this.ordcust3 = value;
        }

        /**
         * Gets the value of the ordcust4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDCUST4() {
            return ordcust4;
        }

        /**
         * Sets the value of the ordcust4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDCUST4(String value) {
            this.ordcust4 = value;
        }

        /**
         * Gets the value of the ordcust5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDCUST5() {
            return ordcust5;
        }

        /**
         * Sets the value of the ordcust5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDCUST5(String value) {
            this.ordcust5 = value;
        }

        /**
         * Gets the value of the ordinst1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDINST1() {
            return ordinst1;
        }

        /**
         * Sets the value of the ordinst1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDINST1(String value) {
            this.ordinst1 = value;
        }

        /**
         * Gets the value of the ordinst2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDINST2() {
            return ordinst2;
        }

        /**
         * Sets the value of the ordinst2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDINST2(String value) {
            this.ordinst2 = value;
        }

        /**
         * Gets the value of the ordinst3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDINST3() {
            return ordinst3;
        }

        /**
         * Sets the value of the ordinst3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDINST3(String value) {
            this.ordinst3 = value;
        }

        /**
         * Gets the value of the ordinst4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDINST4() {
            return ordinst4;
        }

        /**
         * Sets the value of the ordinst4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDINST4(String value) {
            this.ordinst4 = value;
        }

        /**
         * Gets the value of the ordinst5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDINST5() {
            return ordinst5;
        }

        /**
         * Sets the value of the ordinst5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDINST5(String value) {
            this.ordinst5 = value;
        }

        /**
         * Gets the value of the intermediary1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDIARY1() {
            return intermediary1;
        }

        /**
         * Sets the value of the intermediary1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDIARY1(String value) {
            this.intermediary1 = value;
        }

        /**
         * Gets the value of the intermediary2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDIARY2() {
            return intermediary2;
        }

        /**
         * Sets the value of the intermediary2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDIARY2(String value) {
            this.intermediary2 = value;
        }

        /**
         * Gets the value of the intermed3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMED3() {
            return intermed3;
        }

        /**
         * Sets the value of the intermed3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMED3(String value) {
            this.intermed3 = value;
        }

        /**
         * Gets the value of the intermed4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMED4() {
            return intermed4;
        }

        /**
         * Sets the value of the intermed4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMED4(String value) {
            this.intermed4 = value;
        }

        /**
         * Gets the value of the intermediary5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDIARY5() {
            return intermediary5;
        }

        /**
         * Sets the value of the intermediary5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDIARY5(String value) {
            this.intermediary5 = value;
        }

        /**
         * Gets the value of the accwithinst1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCWITHINST1() {
            return accwithinst1;
        }

        /**
         * Sets the value of the accwithinst1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCWITHINST1(String value) {
            this.accwithinst1 = value;
        }

        /**
         * Gets the value of the accwithinst2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCWITHINST2() {
            return accwithinst2;
        }

        /**
         * Sets the value of the accwithinst2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCWITHINST2(String value) {
            this.accwithinst2 = value;
        }

        /**
         * Gets the value of the accwithinst3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCWITHINST3() {
            return accwithinst3;
        }

        /**
         * Sets the value of the accwithinst3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCWITHINST3(String value) {
            this.accwithinst3 = value;
        }

        /**
         * Gets the value of the accwithinst4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCWITHINST4() {
            return accwithinst4;
        }

        /**
         * Sets the value of the accwithinst4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCWITHINST4(String value) {
            this.accwithinst4 = value;
        }

        /**
         * Gets the value of the accwithinst5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCWITHINST5() {
            return accwithinst5;
        }

        /**
         * Sets the value of the accwithinst5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCWITHINST5(String value) {
            this.accwithinst5 = value;
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
         * Gets the value of the remitinfo1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMITINFO1() {
            return remitinfo1;
        }

        /**
         * Sets the value of the remitinfo1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMITINFO1(String value) {
            this.remitinfo1 = value;
        }

        /**
         * Gets the value of the remitinfo2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMITINFO2() {
            return remitinfo2;
        }

        /**
         * Sets the value of the remitinfo2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMITINFO2(String value) {
            this.remitinfo2 = value;
        }

        /**
         * Gets the value of the remitinfo3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMITINFO3() {
            return remitinfo3;
        }

        /**
         * Sets the value of the remitinfo3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMITINFO3(String value) {
            this.remitinfo3 = value;
        }

        /**
         * Gets the value of the remitinfo4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREMITINFO4() {
            return remitinfo4;
        }

        /**
         * Sets the value of the remitinfo4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREMITINFO4(String value) {
            this.remitinfo4 = value;
        }

        /**
         * Gets the value of the sndrtorcvrinfo1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDRTORCVRINFO1() {
            return sndrtorcvrinfo1;
        }

        /**
         * Sets the value of the sndrtorcvrinfo1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDRTORCVRINFO1(String value) {
            this.sndrtorcvrinfo1 = value;
        }

        /**
         * Gets the value of the sndrtorcvrinfo2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDRTORCVRINFO2() {
            return sndrtorcvrinfo2;
        }

        /**
         * Sets the value of the sndrtorcvrinfo2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDRTORCVRINFO2(String value) {
            this.sndrtorcvrinfo2 = value;
        }

        /**
         * Gets the value of the sndrtorcvrinfo3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDRTORCVRINFO3() {
            return sndrtorcvrinfo3;
        }

        /**
         * Sets the value of the sndrtorcvrinfo3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDRTORCVRINFO3(String value) {
            this.sndrtorcvrinfo3 = value;
        }

        /**
         * Gets the value of the sndrtorcvrinfo4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDRTORCVRINFO4() {
            return sndrtorcvrinfo4;
        }

        /**
         * Sets the value of the sndrtorcvrinfo4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDRTORCVRINFO4(String value) {
            this.sndrtorcvrinfo4 = value;
        }

        /**
         * Gets the value of the sndrtorcvrinfo5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDRTORCVRINFO5() {
            return sndrtorcvrinfo5;
        }

        /**
         * Sets the value of the sndrtorcvrinfo5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDRTORCVRINFO5(String value) {
            this.sndrtorcvrinfo5 = value;
        }

        /**
         * Gets the value of the sndrtorcvrinfo6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNDRTORCVRINFO6() {
            return sndrtorcvrinfo6;
        }

        /**
         * Sets the value of the sndrtorcvrinfo6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNDRTORCVRINFO6(String value) {
            this.sndrtorcvrinfo6 = value;
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
         * Gets the value of the amt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMT() {
            return amt;
        }

        /**
         * Sets the value of the amt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMT(BigDecimal value) {
            this.amt = value;
        }

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
     *         &lt;element name="ERR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "errcode"
    })
    public static class NotifErrLog {

        @XmlElement(name = "ERR_CODE")
        protected String errcode;

        /**
         * Gets the value of the errcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getERRCODE() {
            return errcode;
        }

        /**
         * Sets the value of the errcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setERRCODE(String value) {
            this.errcode = value;
        }

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
     *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="PMTCHKRECVED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DRAUTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REFUNDCOVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHKNOTDEBITED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHKLOST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STMTNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="STMTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="NARRATIVE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NARRATIVE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NARRATIVE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NARRATIVE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NARRATIVE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NARRATIVE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REJECT_REASON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "esn",
        "pmtchkrecved",
        "drauth",
        "refundcover",
        "chknotdebited",
        "chklost",
        "accnt",
        "stmtno",
        "stmtdt",
        "narrative1",
        "narrative2",
        "narrative3",
        "narrative4",
        "narrative5",
        "narrative6",
        "rejectreason"
    })
    public static class StopPayment {

        @XmlElement(name = "ESN")
        protected BigDecimal esn;
        @XmlElement(name = "PMTCHKRECVED")
        protected String pmtchkrecved;
        @XmlElement(name = "DRAUTH")
        protected String drauth;
        @XmlElement(name = "REFUNDCOVER")
        protected String refundcover;
        @XmlElement(name = "CHKNOTDEBITED")
        protected String chknotdebited;
        @XmlElement(name = "CHKLOST")
        protected String chklost;
        @XmlElement(name = "ACCNT")
        protected String accnt;
        @XmlElement(name = "STMTNO")
        protected BigDecimal stmtno;
        @XmlElement(name = "STMTDT")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar stmtdt;
        @XmlElement(name = "NARRATIVE1")
        protected String narrative1;
        @XmlElement(name = "NARRATIVE2")
        protected String narrative2;
        @XmlElement(name = "NARRATIVE3")
        protected String narrative3;
        @XmlElement(name = "NARRATIVE4")
        protected String narrative4;
        @XmlElement(name = "NARRATIVE5")
        protected String narrative5;
        @XmlElement(name = "NARRATIVE6")
        protected String narrative6;
        @XmlElement(name = "REJECT_REASON")
        protected String rejectreason;

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
         * Gets the value of the pmtchkrecved property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPMTCHKRECVED() {
            return pmtchkrecved;
        }

        /**
         * Sets the value of the pmtchkrecved property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPMTCHKRECVED(String value) {
            this.pmtchkrecved = value;
        }

        /**
         * Gets the value of the drauth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRAUTH() {
            return drauth;
        }

        /**
         * Sets the value of the drauth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRAUTH(String value) {
            this.drauth = value;
        }

        /**
         * Gets the value of the refundcover property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFUNDCOVER() {
            return refundcover;
        }

        /**
         * Sets the value of the refundcover property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFUNDCOVER(String value) {
            this.refundcover = value;
        }

        /**
         * Gets the value of the chknotdebited property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHKNOTDEBITED() {
            return chknotdebited;
        }

        /**
         * Sets the value of the chknotdebited property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHKNOTDEBITED(String value) {
            this.chknotdebited = value;
        }

        /**
         * Gets the value of the chklost property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHKLOST() {
            return chklost;
        }

        /**
         * Sets the value of the chklost property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHKLOST(String value) {
            this.chklost = value;
        }

        /**
         * Gets the value of the accnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCNT() {
            return accnt;
        }

        /**
         * Sets the value of the accnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCNT(String value) {
            this.accnt = value;
        }

        /**
         * Gets the value of the stmtno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSTMTNO() {
            return stmtno;
        }

        /**
         * Sets the value of the stmtno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSTMTNO(BigDecimal value) {
            this.stmtno = value;
        }

        /**
         * Gets the value of the stmtdt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSTMTDT() {
            return stmtdt;
        }

        /**
         * Sets the value of the stmtdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSTMTDT(XMLGregorianCalendar value) {
            this.stmtdt = value;
        }

        /**
         * Gets the value of the narrative1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE1() {
            return narrative1;
        }

        /**
         * Sets the value of the narrative1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE1(String value) {
            this.narrative1 = value;
        }

        /**
         * Gets the value of the narrative2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE2() {
            return narrative2;
        }

        /**
         * Sets the value of the narrative2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE2(String value) {
            this.narrative2 = value;
        }

        /**
         * Gets the value of the narrative3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE3() {
            return narrative3;
        }

        /**
         * Sets the value of the narrative3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE3(String value) {
            this.narrative3 = value;
        }

        /**
         * Gets the value of the narrative4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE4() {
            return narrative4;
        }

        /**
         * Sets the value of the narrative4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE4(String value) {
            this.narrative4 = value;
        }

        /**
         * Gets the value of the narrative5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE5() {
            return narrative5;
        }

        /**
         * Sets the value of the narrative5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE5(String value) {
            this.narrative5 = value;
        }

        /**
         * Gets the value of the narrative6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNARRATIVE6() {
            return narrative6;
        }

        /**
         * Sets the value of the narrative6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNARRATIVE6(String value) {
            this.narrative6 = value;
        }

        /**
         * Gets the value of the rejectreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREJECTREASON() {
            return rejectreason;
        }

        /**
         * Sets the value of the rejectreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREJECTREASON(String value) {
            this.rejectreason = value;
        }

    }

}
