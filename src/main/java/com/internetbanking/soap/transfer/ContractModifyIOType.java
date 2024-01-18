
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
 * <p>Java class for Contract-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONTREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="USERREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DBTACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EXG_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DBTBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DR_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MCKNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECK_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHRGBEARER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSGCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRIBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRIBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACCTINGASOF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MULTCUSTTRNASF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MULTI_CREDIT_REF_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNTYPECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKDTTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHKR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHKDTTIME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROCESSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BYORDEROF6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INTRMKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTREFRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="BANKOPERCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSTRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUBSYSSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUREVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VIRTUAL_ACC_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cust-Cover-Details" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
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
 *         &lt;element name="Taxes" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnTax-Modify-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="TXNUDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSFTService}TXNUDFDETAILSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Misdetails" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnMIS-Modify-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Extsys-Ws-Master" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnExtsysDtls-Modify-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Settlements" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnSetlDtls-Modify-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Advices" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnAdvDtls-Modify-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Prjdet" type="{http://fcubs.ofss.com/service/FCUBSFTService}Ftcprjft-Modify-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Charges" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnOldChg-Modify-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Chgclmdet" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnChgClm-Modify-IO-Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract-Modify-IO-Type", propOrder = {
    "contrefno",
    "userrefno",
    "dbtacc",
    "cracc",
    "crbrn",
    "crccy",
    "cramt",
    "exgrate",
    "dbtbrn",
    "drccy",
    "dramount",
    "mckno",
    "checknumber",
    "chrgbearer",
    "rtcd",
    "msgcd",
    "driban",
    "criban",
    "acctingasof",
    "multcusttrnasf",
    "multicreditrefno",
    "txntypecd",
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
    "maker",
    "makdttime",
    "chkr",
    "chkdttime",
    "authstat",
    "processtat",
    "byorderof6",
    "intrmks",
    "rtrefrs",
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
    "bankopercd",
    "instrcd",
    "subsysstat",
    "curevnt",
    "virtualaccno",
    "custCoverDetails",
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
public class ContractModifyIOType {

    @XmlElement(name = "CONTREFNO", required = true)
    protected String contrefno;
    @XmlElement(name = "USERREFNO")
    protected String userrefno;
    @XmlElement(name = "DBTACC")
    protected String dbtacc;
    @XmlElement(name = "CRACC")
    protected String cracc;
    @XmlElement(name = "CRBRN")
    protected String crbrn;
    @XmlElement(name = "CRCCY")
    protected String crccy;
    @XmlElement(name = "CRAMT")
    protected BigDecimal cramt;
    @XmlElement(name = "EXG_RATE")
    protected BigDecimal exgrate;
    @XmlElement(name = "DBTBRN")
    protected String dbtbrn;
    @XmlElement(name = "DRCCY")
    protected String drccy;
    @XmlElement(name = "DR_AMOUNT")
    protected BigDecimal dramount;
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
    @XmlElement(name = "DRIBAN")
    protected String driban;
    @XmlElement(name = "CRIBAN")
    protected String criban;
    @XmlElement(name = "ACCTINGASOF")
    protected String acctingasof;
    @XmlElement(name = "MULTCUSTTRNASF")
    protected String multcusttrnasf;
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
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKDTTIME")
    protected String makdttime;
    @XmlElement(name = "CHKR")
    protected String chkr;
    @XmlElement(name = "CHKDTTIME")
    protected String chkdttime;
    @XmlElement(name = "AUTHSTAT")
    protected String authstat;
    @XmlElement(name = "PROCESSTAT")
    protected String processtat;
    @XmlElement(name = "BYORDEROF6")
    protected String byorderof6;
    @XmlElement(name = "INTRMKS")
    protected String intrmks;
    @XmlElement(name = "RTREFRS")
    protected String rtrefrs;
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
    @XmlElement(name = "BANKOPERCD")
    protected String bankopercd;
    @XmlElement(name = "INSTRCD")
    protected String instrcd;
    @XmlElement(name = "SUBSYSSTAT")
    protected String subsysstat;
    @XmlElement(name = "CUREVNT")
    protected String curevnt;
    @XmlElement(name = "VIRTUAL_ACC_NO")
    protected String virtualaccno;
    @XmlElement(name = "Cust-Cover-Details")
    protected CustCoverDetails custCoverDetails;
    @XmlElement(name = "Taxes")
    protected TxnTaxModifyIOType taxes;
    @XmlElement(name = "TXNUDFDETAILS")
    protected List<TXNUDFDETAILSType> txnudfdetails;
    @XmlElement(name = "Misdetails")
    protected TxnMISModifyIOType misdetails;
    @XmlElement(name = "Extsys-Ws-Master")
    protected TxnExtsysDtlsModifyIOType extsysWsMaster;
    @XmlElement(name = "Settlements")
    protected TxnSetlDtlsModifyIOType settlements;
    @XmlElement(name = "Advices")
    protected TxnAdvDtlsModifyIOType advices;
    @XmlElement(name = "Prjdet")
    protected FtcprjftModifyIOType prjdet;
    @XmlElement(name = "Charges")
    protected TxnOldChgModifyIOType charges;
    @XmlElement(name = "Chgclmdet")
    protected TxnChgClmModifyIOType chgclmdet;

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
     * Gets the value of the multcusttrnasf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMULTCUSTTRNASF() {
        return multcusttrnasf;
    }

    /**
     * Sets the value of the multcusttrnasf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMULTCUSTTRNASF(String value) {
        this.multcusttrnasf = value;
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
     * Gets the value of the maker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKER() {
        return maker;
    }

    /**
     * Sets the value of the maker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKER(String value) {
        this.maker = value;
    }

    /**
     * Gets the value of the makdttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKDTTIME() {
        return makdttime;
    }

    /**
     * Sets the value of the makdttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKDTTIME(String value) {
        this.makdttime = value;
    }

    /**
     * Gets the value of the chkr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHKR() {
        return chkr;
    }

    /**
     * Sets the value of the chkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHKR(String value) {
        this.chkr = value;
    }

    /**
     * Gets the value of the chkdttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHKDTTIME() {
        return chkdttime;
    }

    /**
     * Sets the value of the chkdttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHKDTTIME(String value) {
        this.chkdttime = value;
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

    /**
     * Gets the value of the processtat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROCESSTAT() {
        return processtat;
    }

    /**
     * Sets the value of the processtat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROCESSTAT(String value) {
        this.processtat = value;
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
     * Gets the value of the subsysstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBSYSSTAT() {
        return subsysstat;
    }

    /**
     * Sets the value of the subsysstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBSYSSTAT(String value) {
        this.subsysstat = value;
    }

    /**
     * Gets the value of the curevnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUREVNT() {
        return curevnt;
    }

    /**
     * Sets the value of the curevnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUREVNT(String value) {
        this.curevnt = value;
    }

    /**
     * Gets the value of the virtualaccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIRTUALACCNO() {
        return virtualaccno;
    }

    /**
     * Sets the value of the virtualaccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIRTUALACCNO(String value) {
        this.virtualaccno = value;
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
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TxnTaxModifyIOType }
     *     
     */
    public TxnTaxModifyIOType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnTaxModifyIOType }
     *     
     */
    public void setTaxes(TxnTaxModifyIOType value) {
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
     *     {@link TxnMISModifyIOType }
     *     
     */
    public TxnMISModifyIOType getMisdetails() {
        return misdetails;
    }

    /**
     * Sets the value of the misdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnMISModifyIOType }
     *     
     */
    public void setMisdetails(TxnMISModifyIOType value) {
        this.misdetails = value;
    }

    /**
     * Gets the value of the extsysWsMaster property.
     * 
     * @return
     *     possible object is
     *     {@link TxnExtsysDtlsModifyIOType }
     *     
     */
    public TxnExtsysDtlsModifyIOType getExtsysWsMaster() {
        return extsysWsMaster;
    }

    /**
     * Sets the value of the extsysWsMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnExtsysDtlsModifyIOType }
     *     
     */
    public void setExtsysWsMaster(TxnExtsysDtlsModifyIOType value) {
        this.extsysWsMaster = value;
    }

    /**
     * Gets the value of the settlements property.
     * 
     * @return
     *     possible object is
     *     {@link TxnSetlDtlsModifyIOType }
     *     
     */
    public TxnSetlDtlsModifyIOType getSettlements() {
        return settlements;
    }

    /**
     * Sets the value of the settlements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnSetlDtlsModifyIOType }
     *     
     */
    public void setSettlements(TxnSetlDtlsModifyIOType value) {
        this.settlements = value;
    }

    /**
     * Gets the value of the advices property.
     * 
     * @return
     *     possible object is
     *     {@link TxnAdvDtlsModifyIOType }
     *     
     */
    public TxnAdvDtlsModifyIOType getAdvices() {
        return advices;
    }

    /**
     * Sets the value of the advices property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnAdvDtlsModifyIOType }
     *     
     */
    public void setAdvices(TxnAdvDtlsModifyIOType value) {
        this.advices = value;
    }

    /**
     * Gets the value of the prjdet property.
     * 
     * @return
     *     possible object is
     *     {@link FtcprjftModifyIOType }
     *     
     */
    public FtcprjftModifyIOType getPrjdet() {
        return prjdet;
    }

    /**
     * Sets the value of the prjdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FtcprjftModifyIOType }
     *     
     */
    public void setPrjdet(FtcprjftModifyIOType value) {
        this.prjdet = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link TxnOldChgModifyIOType }
     *     
     */
    public TxnOldChgModifyIOType getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnOldChgModifyIOType }
     *     
     */
    public void setCharges(TxnOldChgModifyIOType value) {
        this.charges = value;
    }

    /**
     * Gets the value of the chgclmdet property.
     * 
     * @return
     *     possible object is
     *     {@link TxnChgClmModifyIOType }
     *     
     */
    public TxnChgClmModifyIOType getChgclmdet() {
        return chgclmdet;
    }

    /**
     * Sets the value of the chgclmdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnChgClmModifyIOType }
     *     
     */
    public void setChgclmdet(TxnChgClmModifyIOType value) {
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

}
