
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
 * <p>Java class for TxnMIS-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxnMIS-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MISGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RELACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RELETED_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MISHEAD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RATEFLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POOLCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFINANCE_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="REFRATETYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CALCMETH1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFSPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="REFRATECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COSTCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COSTCD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COSTCD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COSTCD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COSTCD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MISGRPCOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MISGRPTXN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMPMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNDMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNDMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNDMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNDMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNDMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNDMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNDMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNDMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNDMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNDMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MISGRPFUN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TRANMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNMIS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNMIS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNMIS3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNMIS4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNMIS5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNMIS6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNMIS7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNMIS8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNMIS9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNMIS10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Txnmisdetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Compmisdetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Fundmisdetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Control" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Balance-Trnsfer-Log-Details" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PERIOD_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FIN_YEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REFERENCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TRANSFER_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MIS_CLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TXN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="OLD_MIS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NEW_MIS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="EX_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "TxnMIS-Full-Type", propOrder = {
    "conrefno",
    "misgrp",
    "relacc",
    "reletedreference",
    "mishead",
    "rateflg",
    "poolcd",
    "refinancerate",
    "refratetyp",
    "calcmeth1",
    "refspread",
    "refratecd",
    "costcd1",
    "costcd2",
    "costcd3",
    "costcd4",
    "costcd5",
    "txnmis1",
    "txnmis10",
    "txnmis2",
    "txnmis3",
    "txnmis4",
    "txnmis5",
    "txnmis6",
    "txnmis7",
    "txnmis8",
    "txnmis9",
    "misgrpcomp",
    "misgrptxn",
    "compmis1",
    "compmis10",
    "compmis2",
    "compmis3",
    "compmis4",
    "compmis5",
    "compmis6",
    "compmis7",
    "compmis8",
    "compmis9",
    "fundmis1",
    "fundmis10",
    "fundmis2",
    "fundmis3",
    "fundmis4",
    "fundmis5",
    "fundmis6",
    "fundmis7",
    "fundmis8",
    "fundmis9",
    "misgrpfun",
    "tranmis1",
    "tranmis2",
    "tranmis3",
    "tranmis4",
    "tranmis5",
    "tranmis6",
    "tranmis7",
    "tranmis8",
    "tranmis9",
    "tranmis10",
    "commis1",
    "commis2",
    "commis3",
    "commis4",
    "commis5",
    "commis6",
    "commis7",
    "commis8",
    "commis9",
    "commis10",
    "funmis1",
    "funmis2",
    "funmis3",
    "funmis4",
    "funmis5",
    "funmis6",
    "funmis7",
    "funmis8",
    "funmis9",
    "funmis10",
    "txnmisdetails",
    "compmisdetails",
    "fundmisdetails",
    "control",
    "balanceTrnsferLogDetails"
})
public class TxnMISFullType {

    @XmlElement(name = "CONREFNO", required = true)
    protected String conrefno;
    @XmlElement(name = "MISGRP")
    protected String misgrp;
    @XmlElement(name = "RELACC")
    protected String relacc;
    @XmlElement(name = "RELETED_REFERENCE")
    protected String reletedreference;
    @XmlElement(name = "MISHEAD")
    protected String mishead;
    @XmlElement(name = "RATEFLG")
    protected String rateflg;
    @XmlElement(name = "POOLCD")
    protected String poolcd;
    @XmlElement(name = "REFINANCE_RATE")
    protected BigDecimal refinancerate;
    @XmlElement(name = "REFRATETYP")
    protected String refratetyp;
    @XmlElement(name = "CALCMETH1")
    protected String calcmeth1;
    @XmlElement(name = "REFSPREAD")
    protected BigDecimal refspread;
    @XmlElement(name = "REFRATECD")
    protected String refratecd;
    @XmlElement(name = "COSTCD1")
    protected String costcd1;
    @XmlElement(name = "COSTCD2")
    protected String costcd2;
    @XmlElement(name = "COSTCD3")
    protected String costcd3;
    @XmlElement(name = "COSTCD4")
    protected String costcd4;
    @XmlElement(name = "COSTCD5")
    protected String costcd5;
    @XmlElement(name = "TXNMIS1")
    protected String txnmis1;
    @XmlElement(name = "TXNMIS10")
    protected String txnmis10;
    @XmlElement(name = "TXNMIS2")
    protected String txnmis2;
    @XmlElement(name = "TXNMIS3")
    protected String txnmis3;
    @XmlElement(name = "TXNMIS4")
    protected String txnmis4;
    @XmlElement(name = "TXNMIS5")
    protected String txnmis5;
    @XmlElement(name = "TXNMIS6")
    protected String txnmis6;
    @XmlElement(name = "TXNMIS7")
    protected String txnmis7;
    @XmlElement(name = "TXNMIS8")
    protected String txnmis8;
    @XmlElement(name = "TXNMIS9")
    protected String txnmis9;
    @XmlElement(name = "MISGRPCOMP")
    protected String misgrpcomp;
    @XmlElement(name = "MISGRPTXN")
    protected String misgrptxn;
    @XmlElement(name = "COMPMIS1")
    protected String compmis1;
    @XmlElement(name = "COMPMIS10")
    protected String compmis10;
    @XmlElement(name = "COMPMIS2")
    protected String compmis2;
    @XmlElement(name = "COMPMIS3")
    protected String compmis3;
    @XmlElement(name = "COMPMIS4")
    protected String compmis4;
    @XmlElement(name = "COMPMIS5")
    protected String compmis5;
    @XmlElement(name = "COMPMIS6")
    protected String compmis6;
    @XmlElement(name = "COMPMIS7")
    protected String compmis7;
    @XmlElement(name = "COMPMIS8")
    protected String compmis8;
    @XmlElement(name = "COMPMIS9")
    protected String compmis9;
    @XmlElement(name = "FUNDMIS1")
    protected String fundmis1;
    @XmlElement(name = "FUNDMIS10")
    protected String fundmis10;
    @XmlElement(name = "FUNDMIS2")
    protected String fundmis2;
    @XmlElement(name = "FUNDMIS3")
    protected String fundmis3;
    @XmlElement(name = "FUNDMIS4")
    protected String fundmis4;
    @XmlElement(name = "FUNDMIS5")
    protected String fundmis5;
    @XmlElement(name = "FUNDMIS6")
    protected String fundmis6;
    @XmlElement(name = "FUNDMIS7")
    protected String fundmis7;
    @XmlElement(name = "FUNDMIS8")
    protected String fundmis8;
    @XmlElement(name = "FUNDMIS9")
    protected String fundmis9;
    @XmlElement(name = "MISGRPFUN")
    protected String misgrpfun;
    @XmlElement(name = "TRANMIS1")
    protected String tranmis1;
    @XmlElement(name = "TRANMIS2")
    protected String tranmis2;
    @XmlElement(name = "TRANMIS3")
    protected String tranmis3;
    @XmlElement(name = "TRANMIS4")
    protected String tranmis4;
    @XmlElement(name = "TRANMIS5")
    protected String tranmis5;
    @XmlElement(name = "TRANMIS6")
    protected String tranmis6;
    @XmlElement(name = "TRANMIS7")
    protected String tranmis7;
    @XmlElement(name = "TRANMIS8")
    protected String tranmis8;
    @XmlElement(name = "TRANMIS9")
    protected String tranmis9;
    @XmlElement(name = "TRANMIS10")
    protected String tranmis10;
    @XmlElement(name = "COMMIS1")
    protected String commis1;
    @XmlElement(name = "COMMIS2")
    protected String commis2;
    @XmlElement(name = "COMMIS3")
    protected String commis3;
    @XmlElement(name = "COMMIS4")
    protected String commis4;
    @XmlElement(name = "COMMIS5")
    protected String commis5;
    @XmlElement(name = "COMMIS6")
    protected String commis6;
    @XmlElement(name = "COMMIS7")
    protected String commis7;
    @XmlElement(name = "COMMIS8")
    protected String commis8;
    @XmlElement(name = "COMMIS9")
    protected String commis9;
    @XmlElement(name = "COMMIS10")
    protected String commis10;
    @XmlElement(name = "FUNMIS1")
    protected String funmis1;
    @XmlElement(name = "FUNMIS2")
    protected String funmis2;
    @XmlElement(name = "FUNMIS3")
    protected String funmis3;
    @XmlElement(name = "FUNMIS4")
    protected String funmis4;
    @XmlElement(name = "FUNMIS5")
    protected String funmis5;
    @XmlElement(name = "FUNMIS6")
    protected String funmis6;
    @XmlElement(name = "FUNMIS7")
    protected String funmis7;
    @XmlElement(name = "FUNMIS8")
    protected String funmis8;
    @XmlElement(name = "FUNMIS9")
    protected String funmis9;
    @XmlElement(name = "FUNMIS10")
    protected String funmis10;
    @XmlElement(name = "Txnmisdetails")
    protected List<Txnmisdetails> txnmisdetails;
    @XmlElement(name = "Compmisdetails")
    protected List<Compmisdetails> compmisdetails;
    @XmlElement(name = "Fundmisdetails")
    protected List<Fundmisdetails> fundmisdetails;
    @XmlElement(name = "Control")
    protected Control control;
    @XmlElement(name = "Balance-Trnsfer-Log-Details")
    protected List<BalanceTrnsferLogDetails> balanceTrnsferLogDetails;

    /**
     * Gets the value of the conrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONREFNO() {
        return conrefno;
    }

    /**
     * Sets the value of the conrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONREFNO(String value) {
        this.conrefno = value;
    }

    /**
     * Gets the value of the misgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISGRP() {
        return misgrp;
    }

    /**
     * Sets the value of the misgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISGRP(String value) {
        this.misgrp = value;
    }

    /**
     * Gets the value of the relacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELACC() {
        return relacc;
    }

    /**
     * Sets the value of the relacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELACC(String value) {
        this.relacc = value;
    }

    /**
     * Gets the value of the reletedreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELETEDREFERENCE() {
        return reletedreference;
    }

    /**
     * Sets the value of the reletedreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELETEDREFERENCE(String value) {
        this.reletedreference = value;
    }

    /**
     * Gets the value of the mishead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISHEAD() {
        return mishead;
    }

    /**
     * Sets the value of the mishead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISHEAD(String value) {
        this.mishead = value;
    }

    /**
     * Gets the value of the rateflg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRATEFLG() {
        return rateflg;
    }

    /**
     * Sets the value of the rateflg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRATEFLG(String value) {
        this.rateflg = value;
    }

    /**
     * Gets the value of the poolcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOOLCD() {
        return poolcd;
    }

    /**
     * Sets the value of the poolcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOOLCD(String value) {
        this.poolcd = value;
    }

    /**
     * Gets the value of the refinancerate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREFINANCERATE() {
        return refinancerate;
    }

    /**
     * Sets the value of the refinancerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREFINANCERATE(BigDecimal value) {
        this.refinancerate = value;
    }

    /**
     * Gets the value of the refratetyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFRATETYP() {
        return refratetyp;
    }

    /**
     * Sets the value of the refratetyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFRATETYP(String value) {
        this.refratetyp = value;
    }

    /**
     * Gets the value of the calcmeth1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALCMETH1() {
        return calcmeth1;
    }

    /**
     * Sets the value of the calcmeth1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALCMETH1(String value) {
        this.calcmeth1 = value;
    }

    /**
     * Gets the value of the refspread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREFSPREAD() {
        return refspread;
    }

    /**
     * Sets the value of the refspread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREFSPREAD(BigDecimal value) {
        this.refspread = value;
    }

    /**
     * Gets the value of the refratecd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFRATECD() {
        return refratecd;
    }

    /**
     * Sets the value of the refratecd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFRATECD(String value) {
        this.refratecd = value;
    }

    /**
     * Gets the value of the costcd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTCD1() {
        return costcd1;
    }

    /**
     * Sets the value of the costcd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTCD1(String value) {
        this.costcd1 = value;
    }

    /**
     * Gets the value of the costcd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTCD2() {
        return costcd2;
    }

    /**
     * Sets the value of the costcd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTCD2(String value) {
        this.costcd2 = value;
    }

    /**
     * Gets the value of the costcd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTCD3() {
        return costcd3;
    }

    /**
     * Sets the value of the costcd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTCD3(String value) {
        this.costcd3 = value;
    }

    /**
     * Gets the value of the costcd4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTCD4() {
        return costcd4;
    }

    /**
     * Sets the value of the costcd4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTCD4(String value) {
        this.costcd4 = value;
    }

    /**
     * Gets the value of the costcd5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTCD5() {
        return costcd5;
    }

    /**
     * Sets the value of the costcd5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTCD5(String value) {
        this.costcd5 = value;
    }

    /**
     * Gets the value of the txnmis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNMIS1() {
        return txnmis1;
    }

    /**
     * Sets the value of the txnmis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNMIS1(String value) {
        this.txnmis1 = value;
    }

    /**
     * Gets the value of the txnmis10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNMIS10() {
        return txnmis10;
    }

    /**
     * Sets the value of the txnmis10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNMIS10(String value) {
        this.txnmis10 = value;
    }

    /**
     * Gets the value of the txnmis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNMIS2() {
        return txnmis2;
    }

    /**
     * Sets the value of the txnmis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNMIS2(String value) {
        this.txnmis2 = value;
    }

    /**
     * Gets the value of the txnmis3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNMIS3() {
        return txnmis3;
    }

    /**
     * Sets the value of the txnmis3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNMIS3(String value) {
        this.txnmis3 = value;
    }

    /**
     * Gets the value of the txnmis4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNMIS4() {
        return txnmis4;
    }

    /**
     * Sets the value of the txnmis4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNMIS4(String value) {
        this.txnmis4 = value;
    }

    /**
     * Gets the value of the txnmis5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNMIS5() {
        return txnmis5;
    }

    /**
     * Sets the value of the txnmis5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNMIS5(String value) {
        this.txnmis5 = value;
    }

    /**
     * Gets the value of the txnmis6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNMIS6() {
        return txnmis6;
    }

    /**
     * Sets the value of the txnmis6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNMIS6(String value) {
        this.txnmis6 = value;
    }

    /**
     * Gets the value of the txnmis7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNMIS7() {
        return txnmis7;
    }

    /**
     * Sets the value of the txnmis7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNMIS7(String value) {
        this.txnmis7 = value;
    }

    /**
     * Gets the value of the txnmis8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNMIS8() {
        return txnmis8;
    }

    /**
     * Sets the value of the txnmis8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNMIS8(String value) {
        this.txnmis8 = value;
    }

    /**
     * Gets the value of the txnmis9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXNMIS9() {
        return txnmis9;
    }

    /**
     * Sets the value of the txnmis9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXNMIS9(String value) {
        this.txnmis9 = value;
    }

    /**
     * Gets the value of the misgrpcomp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISGRPCOMP() {
        return misgrpcomp;
    }

    /**
     * Sets the value of the misgrpcomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISGRPCOMP(String value) {
        this.misgrpcomp = value;
    }

    /**
     * Gets the value of the misgrptxn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISGRPTXN() {
        return misgrptxn;
    }

    /**
     * Sets the value of the misgrptxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISGRPTXN(String value) {
        this.misgrptxn = value;
    }

    /**
     * Gets the value of the compmis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPMIS1() {
        return compmis1;
    }

    /**
     * Sets the value of the compmis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPMIS1(String value) {
        this.compmis1 = value;
    }

    /**
     * Gets the value of the compmis10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPMIS10() {
        return compmis10;
    }

    /**
     * Sets the value of the compmis10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPMIS10(String value) {
        this.compmis10 = value;
    }

    /**
     * Gets the value of the compmis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPMIS2() {
        return compmis2;
    }

    /**
     * Sets the value of the compmis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPMIS2(String value) {
        this.compmis2 = value;
    }

    /**
     * Gets the value of the compmis3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPMIS3() {
        return compmis3;
    }

    /**
     * Sets the value of the compmis3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPMIS3(String value) {
        this.compmis3 = value;
    }

    /**
     * Gets the value of the compmis4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPMIS4() {
        return compmis4;
    }

    /**
     * Sets the value of the compmis4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPMIS4(String value) {
        this.compmis4 = value;
    }

    /**
     * Gets the value of the compmis5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPMIS5() {
        return compmis5;
    }

    /**
     * Sets the value of the compmis5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPMIS5(String value) {
        this.compmis5 = value;
    }

    /**
     * Gets the value of the compmis6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPMIS6() {
        return compmis6;
    }

    /**
     * Sets the value of the compmis6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPMIS6(String value) {
        this.compmis6 = value;
    }

    /**
     * Gets the value of the compmis7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPMIS7() {
        return compmis7;
    }

    /**
     * Sets the value of the compmis7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPMIS7(String value) {
        this.compmis7 = value;
    }

    /**
     * Gets the value of the compmis8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPMIS8() {
        return compmis8;
    }

    /**
     * Sets the value of the compmis8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPMIS8(String value) {
        this.compmis8 = value;
    }

    /**
     * Gets the value of the compmis9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPMIS9() {
        return compmis9;
    }

    /**
     * Sets the value of the compmis9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPMIS9(String value) {
        this.compmis9 = value;
    }

    /**
     * Gets the value of the fundmis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDMIS1() {
        return fundmis1;
    }

    /**
     * Sets the value of the fundmis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDMIS1(String value) {
        this.fundmis1 = value;
    }

    /**
     * Gets the value of the fundmis10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDMIS10() {
        return fundmis10;
    }

    /**
     * Sets the value of the fundmis10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDMIS10(String value) {
        this.fundmis10 = value;
    }

    /**
     * Gets the value of the fundmis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDMIS2() {
        return fundmis2;
    }

    /**
     * Sets the value of the fundmis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDMIS2(String value) {
        this.fundmis2 = value;
    }

    /**
     * Gets the value of the fundmis3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDMIS3() {
        return fundmis3;
    }

    /**
     * Sets the value of the fundmis3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDMIS3(String value) {
        this.fundmis3 = value;
    }

    /**
     * Gets the value of the fundmis4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDMIS4() {
        return fundmis4;
    }

    /**
     * Sets the value of the fundmis4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDMIS4(String value) {
        this.fundmis4 = value;
    }

    /**
     * Gets the value of the fundmis5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDMIS5() {
        return fundmis5;
    }

    /**
     * Sets the value of the fundmis5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDMIS5(String value) {
        this.fundmis5 = value;
    }

    /**
     * Gets the value of the fundmis6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDMIS6() {
        return fundmis6;
    }

    /**
     * Sets the value of the fundmis6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDMIS6(String value) {
        this.fundmis6 = value;
    }

    /**
     * Gets the value of the fundmis7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDMIS7() {
        return fundmis7;
    }

    /**
     * Sets the value of the fundmis7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDMIS7(String value) {
        this.fundmis7 = value;
    }

    /**
     * Gets the value of the fundmis8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDMIS8() {
        return fundmis8;
    }

    /**
     * Sets the value of the fundmis8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDMIS8(String value) {
        this.fundmis8 = value;
    }

    /**
     * Gets the value of the fundmis9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNDMIS9() {
        return fundmis9;
    }

    /**
     * Sets the value of the fundmis9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNDMIS9(String value) {
        this.fundmis9 = value;
    }

    /**
     * Gets the value of the misgrpfun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMISGRPFUN() {
        return misgrpfun;
    }

    /**
     * Sets the value of the misgrpfun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMISGRPFUN(String value) {
        this.misgrpfun = value;
    }

    /**
     * Gets the value of the tranmis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANMIS1() {
        return tranmis1;
    }

    /**
     * Sets the value of the tranmis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANMIS1(String value) {
        this.tranmis1 = value;
    }

    /**
     * Gets the value of the tranmis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANMIS2() {
        return tranmis2;
    }

    /**
     * Sets the value of the tranmis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANMIS2(String value) {
        this.tranmis2 = value;
    }

    /**
     * Gets the value of the tranmis3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANMIS3() {
        return tranmis3;
    }

    /**
     * Sets the value of the tranmis3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANMIS3(String value) {
        this.tranmis3 = value;
    }

    /**
     * Gets the value of the tranmis4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANMIS4() {
        return tranmis4;
    }

    /**
     * Sets the value of the tranmis4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANMIS4(String value) {
        this.tranmis4 = value;
    }

    /**
     * Gets the value of the tranmis5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANMIS5() {
        return tranmis5;
    }

    /**
     * Sets the value of the tranmis5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANMIS5(String value) {
        this.tranmis5 = value;
    }

    /**
     * Gets the value of the tranmis6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANMIS6() {
        return tranmis6;
    }

    /**
     * Sets the value of the tranmis6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANMIS6(String value) {
        this.tranmis6 = value;
    }

    /**
     * Gets the value of the tranmis7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANMIS7() {
        return tranmis7;
    }

    /**
     * Sets the value of the tranmis7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANMIS7(String value) {
        this.tranmis7 = value;
    }

    /**
     * Gets the value of the tranmis8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANMIS8() {
        return tranmis8;
    }

    /**
     * Sets the value of the tranmis8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANMIS8(String value) {
        this.tranmis8 = value;
    }

    /**
     * Gets the value of the tranmis9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANMIS9() {
        return tranmis9;
    }

    /**
     * Sets the value of the tranmis9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANMIS9(String value) {
        this.tranmis9 = value;
    }

    /**
     * Gets the value of the tranmis10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANMIS10() {
        return tranmis10;
    }

    /**
     * Sets the value of the tranmis10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANMIS10(String value) {
        this.tranmis10 = value;
    }

    /**
     * Gets the value of the commis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMIS1() {
        return commis1;
    }

    /**
     * Sets the value of the commis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMIS1(String value) {
        this.commis1 = value;
    }

    /**
     * Gets the value of the commis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMIS2() {
        return commis2;
    }

    /**
     * Sets the value of the commis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMIS2(String value) {
        this.commis2 = value;
    }

    /**
     * Gets the value of the commis3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMIS3() {
        return commis3;
    }

    /**
     * Sets the value of the commis3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMIS3(String value) {
        this.commis3 = value;
    }

    /**
     * Gets the value of the commis4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMIS4() {
        return commis4;
    }

    /**
     * Sets the value of the commis4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMIS4(String value) {
        this.commis4 = value;
    }

    /**
     * Gets the value of the commis5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMIS5() {
        return commis5;
    }

    /**
     * Sets the value of the commis5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMIS5(String value) {
        this.commis5 = value;
    }

    /**
     * Gets the value of the commis6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMIS6() {
        return commis6;
    }

    /**
     * Sets the value of the commis6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMIS6(String value) {
        this.commis6 = value;
    }

    /**
     * Gets the value of the commis7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMIS7() {
        return commis7;
    }

    /**
     * Sets the value of the commis7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMIS7(String value) {
        this.commis7 = value;
    }

    /**
     * Gets the value of the commis8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMIS8() {
        return commis8;
    }

    /**
     * Sets the value of the commis8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMIS8(String value) {
        this.commis8 = value;
    }

    /**
     * Gets the value of the commis9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMIS9() {
        return commis9;
    }

    /**
     * Sets the value of the commis9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMIS9(String value) {
        this.commis9 = value;
    }

    /**
     * Gets the value of the commis10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMIS10() {
        return commis10;
    }

    /**
     * Sets the value of the commis10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMIS10(String value) {
        this.commis10 = value;
    }

    /**
     * Gets the value of the funmis1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNMIS1() {
        return funmis1;
    }

    /**
     * Sets the value of the funmis1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNMIS1(String value) {
        this.funmis1 = value;
    }

    /**
     * Gets the value of the funmis2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNMIS2() {
        return funmis2;
    }

    /**
     * Sets the value of the funmis2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNMIS2(String value) {
        this.funmis2 = value;
    }

    /**
     * Gets the value of the funmis3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNMIS3() {
        return funmis3;
    }

    /**
     * Sets the value of the funmis3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNMIS3(String value) {
        this.funmis3 = value;
    }

    /**
     * Gets the value of the funmis4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNMIS4() {
        return funmis4;
    }

    /**
     * Sets the value of the funmis4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNMIS4(String value) {
        this.funmis4 = value;
    }

    /**
     * Gets the value of the funmis5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNMIS5() {
        return funmis5;
    }

    /**
     * Sets the value of the funmis5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNMIS5(String value) {
        this.funmis5 = value;
    }

    /**
     * Gets the value of the funmis6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNMIS6() {
        return funmis6;
    }

    /**
     * Sets the value of the funmis6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNMIS6(String value) {
        this.funmis6 = value;
    }

    /**
     * Gets the value of the funmis7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNMIS7() {
        return funmis7;
    }

    /**
     * Sets the value of the funmis7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNMIS7(String value) {
        this.funmis7 = value;
    }

    /**
     * Gets the value of the funmis8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNMIS8() {
        return funmis8;
    }

    /**
     * Sets the value of the funmis8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNMIS8(String value) {
        this.funmis8 = value;
    }

    /**
     * Gets the value of the funmis9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNMIS9() {
        return funmis9;
    }

    /**
     * Sets the value of the funmis9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNMIS9(String value) {
        this.funmis9 = value;
    }

    /**
     * Gets the value of the funmis10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNMIS10() {
        return funmis10;
    }

    /**
     * Sets the value of the funmis10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNMIS10(String value) {
        this.funmis10 = value;
    }

    /**
     * Gets the value of the txnmisdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the txnmisdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxnmisdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Txnmisdetails }
     * 
     * 
     */
    public List<Txnmisdetails> getTxnmisdetails() {
        if (txnmisdetails == null) {
            txnmisdetails = new ArrayList<Txnmisdetails>();
        }
        return this.txnmisdetails;
    }

    /**
     * Gets the value of the compmisdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the compmisdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompmisdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Compmisdetails }
     * 
     * 
     */
    public List<Compmisdetails> getCompmisdetails() {
        if (compmisdetails == null) {
            compmisdetails = new ArrayList<Compmisdetails>();
        }
        return this.compmisdetails;
    }

    /**
     * Gets the value of the fundmisdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fundmisdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundmisdetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fundmisdetails }
     * 
     * 
     */
    public List<Fundmisdetails> getFundmisdetails() {
        if (fundmisdetails == null) {
            fundmisdetails = new ArrayList<Fundmisdetails>();
        }
        return this.fundmisdetails;
    }

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link Control }
     *     
     */
    public Control getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link Control }
     *     
     */
    public void setControl(Control value) {
        this.control = value;
    }

    /**
     * Gets the value of the balanceTrnsferLogDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the balanceTrnsferLogDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalanceTrnsferLogDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceTrnsferLogDetails }
     * 
     * 
     */
    public List<BalanceTrnsferLogDetails> getBalanceTrnsferLogDetails() {
        if (balanceTrnsferLogDetails == null) {
            balanceTrnsferLogDetails = new ArrayList<BalanceTrnsferLogDetails>();
        }
        return this.balanceTrnsferLogDetails;
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
     *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PERIOD_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FIN_YEAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GL_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REFERENCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TRANSFER_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MIS_CLASS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TXN_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="OLD_MIS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NEW_MIS_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="EX_RATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
        "branch",
        "periodcode",
        "finyear",
        "referenceno",
        "glcode",
        "referencetype",
        "transferind",
        "misclass",
        "txndate",
        "oldmiscode",
        "newmiscode",
        "ccy",
        "amount",
        "exrate"
    })
    public static class BalanceTrnsferLogDetails {

        @XmlElement(name = "BRANCH")
        protected String branch;
        @XmlElement(name = "PERIOD_CODE")
        protected String periodcode;
        @XmlElement(name = "FIN_YEAR")
        protected String finyear;
        @XmlElement(name = "REFERENCE_NO")
        protected String referenceno;
        @XmlElement(name = "GL_CODE")
        protected String glcode;
        @XmlElement(name = "REFERENCE_TYPE")
        protected String referencetype;
        @XmlElement(name = "TRANSFER_IND")
        protected String transferind;
        @XmlElement(name = "MIS_CLASS")
        protected String misclass;
        @XmlElement(name = "TXN_DATE")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar txndate;
        @XmlElement(name = "OLD_MIS_CODE")
        protected String oldmiscode;
        @XmlElement(name = "NEW_MIS_CODE")
        protected String newmiscode;
        @XmlElement(name = "CCY")
        protected String ccy;
        @XmlElement(name = "AMOUNT")
        protected BigDecimal amount;
        @XmlElement(name = "EX_RATE")
        protected BigDecimal exrate;

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
         * Gets the value of the periodcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERIODCODE() {
            return periodcode;
        }

        /**
         * Sets the value of the periodcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERIODCODE(String value) {
            this.periodcode = value;
        }

        /**
         * Gets the value of the finyear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFINYEAR() {
            return finyear;
        }

        /**
         * Sets the value of the finyear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFINYEAR(String value) {
            this.finyear = value;
        }

        /**
         * Gets the value of the referenceno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFERENCENO() {
            return referenceno;
        }

        /**
         * Sets the value of the referenceno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFERENCENO(String value) {
            this.referenceno = value;
        }

        /**
         * Gets the value of the glcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGLCODE() {
            return glcode;
        }

        /**
         * Sets the value of the glcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGLCODE(String value) {
            this.glcode = value;
        }

        /**
         * Gets the value of the referencetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFERENCETYPE() {
            return referencetype;
        }

        /**
         * Sets the value of the referencetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFERENCETYPE(String value) {
            this.referencetype = value;
        }

        /**
         * Gets the value of the transferind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRANSFERIND() {
            return transferind;
        }

        /**
         * Sets the value of the transferind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRANSFERIND(String value) {
            this.transferind = value;
        }

        /**
         * Gets the value of the misclass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMISCLASS() {
            return misclass;
        }

        /**
         * Sets the value of the misclass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMISCLASS(String value) {
            this.misclass = value;
        }

        /**
         * Gets the value of the txndate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTXNDATE() {
            return txndate;
        }

        /**
         * Sets the value of the txndate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTXNDATE(XMLGregorianCalendar value) {
            this.txndate = value;
        }

        /**
         * Gets the value of the oldmiscode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOLDMISCODE() {
            return oldmiscode;
        }

        /**
         * Sets the value of the oldmiscode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOLDMISCODE(String value) {
            this.oldmiscode = value;
        }

        /**
         * Gets the value of the newmiscode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNEWMISCODE() {
            return newmiscode;
        }

        /**
         * Sets the value of the newmiscode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNEWMISCODE(String value) {
            this.newmiscode = value;
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
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAMOUNT() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAMOUNT(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the exrate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXRATE() {
            return exrate;
        }

        /**
         * Sets the value of the exrate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXRATE(BigDecimal value) {
            this.exrate = value;
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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Compmisdetails {


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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Control {


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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Fundmisdetails {


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
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Txnmisdetails {


    }

}
