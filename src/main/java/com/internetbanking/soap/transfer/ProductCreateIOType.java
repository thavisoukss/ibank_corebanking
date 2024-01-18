
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
 * <p>Java class for Product-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRDDESC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRDSLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRDGRP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRDSTRTDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PRDENDDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PRDRMRKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GEN103P" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRBACKVLDYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CRBACKVLDAYS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TRANSFRTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COVREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMITMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUPRESBVPMTMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTTYP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SPRDCD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RTCD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MSGCD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RTREFRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTVAROVDLMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RTVARMAXLMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MCKREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MCKACGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DAOGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPLITDRCRLIQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUTRVLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CROSSCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTOODOVERRIDE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CUTOFFDAYSREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REKEYOFCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REKEYOFAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REKEYOFVLDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SPCIALCLG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLGNETWRK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REKEYOFDRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REKEYOFCRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DRBACKVAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRBACKVL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFRALREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VALIDTBENEFCRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ALLOWMSGBFRACCTING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ALLOWCHGWHOMCHANGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHGWHOM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BENIBANMAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MULTCUSTTRNASF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RTGSPRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYMTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FINYCOPYNETWRK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BNKPRIORITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SENDRNOTIFREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REKEYREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYMTBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GENMT102P" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPDRCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPCRCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPCRVALDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPCRAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPDRVALDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPPRDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPBOOKDATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPDRAMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPULTBENACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUPULTBENADDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Charge-Details" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="COMPNENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="EVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BASISAMNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BASISAMNTCATG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACQREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SETTLMNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHNGDRGAMNDMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STPAPPLICTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADVCHRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Tax-Scheme" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SCHME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Tax-Details" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BASISAMNTAG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="COMPTATIONEVNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TAXTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Prod-Cust-Restrictions" type="{http://fcubs.ofss.com/service/FCUBSFTService}CustRestriction-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Role-To-Head-Mapping" type="{http://fcubs.ofss.com/service/FCUBSFTService}RoleToHeadMapping-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Product-Fields" type="{http://fcubs.ofss.com/service/FCUBSFTService}ProductUDF-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Product-Events" type="{http://fcubs.ofss.com/service/FCUBSFTService}ProdEventDtls-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Product-Mis-Details" type="{http://fcubs.ofss.com/service/FCUBSFTService}ProdMisDetails-Create-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Branch-Ccy-Restrictions" type="{http://fcubs.ofss.com/service/FCUBSFTService}BranchRestriction-Create-IO-Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product-Create-IO-Type", propOrder = {
    "prdcd",
    "prddesc",
    "prdslg",
    "prdgrp",
    "prdstrtdt",
    "prdenddt",
    "prdrmrks",
    "prdtyp",
    "gen103P",
    "drbackvldys",
    "crbackvldays",
    "transfrtyp",
    "covreqd",
    "remitmsg",
    "supresbvpmtmsg",
    "rttyp",
    "sprdcd",
    "rtcd",
    "msgcd",
    "rtrefrs",
    "rtvarovdlmt",
    "rtvarmaxlmt",
    "mckreqd",
    "mckacgl",
    "daogl",
    "splitdrcrliqd",
    "futrvld",
    "crossccy",
    "autoodoverride",
    "cutoffdaysreq",
    "rekeyofccy",
    "rekeyofamt",
    "rekeyofvldt",
    "spcialclg",
    "clgnetwrk",
    "rekeyofdracc",
    "rekeyofcracc",
    "drbackval",
    "crbackvl",
    "refralreqd",
    "validtbenefcry",
    "allowmsgbfraccting",
    "allowchgwhomchange",
    "chgwhom",
    "benibanmand",
    "multcusttrnasf",
    "rtgsprd",
    "paymttyp",
    "finycopynetwrk",
    "bnkpriority",
    "sendrnotifreqd",
    "rekeyreq",
    "paymtby",
    "genmt102P",
    "dupdrccy",
    "dupcrccy",
    "dupcrvaldate",
    "dupcramt",
    "dupdrvaldate",
    "dupprdcd",
    "dupbookdate",
    "dupdramt",
    "dupultbenacc",
    "dupultbenaddr",
    "chargeDetails",
    "taxScheme",
    "prodCustRestrictions",
    "roleToHeadMapping",
    "productFields",
    "productEvents",
    "productMisDetails",
    "branchCcyRestrictions"
})
public class ProductCreateIOType {

    @XmlElement(name = "PRDCD", required = true)
    protected String prdcd;
    @XmlElement(name = "PRDDESC", required = true)
    protected String prddesc;
    @XmlElement(name = "PRDSLG")
    protected String prdslg;
    @XmlElement(name = "PRDGRP", required = true)
    protected String prdgrp;
    @XmlElement(name = "PRDSTRTDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prdstrtdt;
    @XmlElement(name = "PRDENDDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prdenddt;
    @XmlElement(name = "PRDRMRKS")
    protected String prdrmrks;
    @XmlElement(name = "PRDTYP")
    protected String prdtyp;
    @XmlElement(name = "GEN103P")
    protected String gen103P;
    @XmlElement(name = "DRBACKVLDYS")
    protected BigDecimal drbackvldys;
    @XmlElement(name = "CRBACKVLDAYS")
    protected BigDecimal crbackvldays;
    @XmlElement(name = "TRANSFRTYP")
    protected String transfrtyp;
    @XmlElement(name = "COVREQD")
    protected String covreqd;
    @XmlElement(name = "REMITMSG")
    protected String remitmsg;
    @XmlElement(name = "SUPRESBVPMTMSG")
    protected String supresbvpmtmsg;
    @XmlElement(name = "RTTYP", required = true)
    protected String rttyp;
    @XmlElement(name = "SPRDCD", required = true)
    protected String sprdcd;
    @XmlElement(name = "RTCD", required = true)
    protected String rtcd;
    @XmlElement(name = "MSGCD", required = true)
    protected String msgcd;
    @XmlElement(name = "RTREFRS")
    protected String rtrefrs;
    @XmlElement(name = "RTVAROVDLMT")
    protected BigDecimal rtvarovdlmt;
    @XmlElement(name = "RTVARMAXLMT")
    protected BigDecimal rtvarmaxlmt;
    @XmlElement(name = "MCKREQD")
    protected String mckreqd;
    @XmlElement(name = "MCKACGL")
    protected String mckacgl;
    @XmlElement(name = "DAOGL")
    protected String daogl;
    @XmlElement(name = "SPLITDRCRLIQD")
    protected String splitdrcrliqd;
    @XmlElement(name = "FUTRVLD")
    protected String futrvld;
    @XmlElement(name = "CROSSCCY")
    protected String crossccy;
    @XmlElement(name = "AUTOODOVERRIDE")
    protected String autoodoverride;
    @XmlElement(name = "CUTOFFDAYSREQ")
    protected String cutoffdaysreq;
    @XmlElement(name = "REKEYOFCCY")
    protected String rekeyofccy;
    @XmlElement(name = "REKEYOFAMT")
    protected String rekeyofamt;
    @XmlElement(name = "REKEYOFVLDT")
    protected String rekeyofvldt;
    @XmlElement(name = "SPCIALCLG")
    protected String spcialclg;
    @XmlElement(name = "CLGNETWRK")
    protected String clgnetwrk;
    @XmlElement(name = "REKEYOFDRACC")
    protected String rekeyofdracc;
    @XmlElement(name = "REKEYOFCRACC")
    protected String rekeyofcracc;
    @XmlElement(name = "DRBACKVAL")
    protected String drbackval;
    @XmlElement(name = "CRBACKVL")
    protected String crbackvl;
    @XmlElement(name = "REFRALREQD")
    protected String refralreqd;
    @XmlElement(name = "VALIDTBENEFCRY")
    protected String validtbenefcry;
    @XmlElement(name = "ALLOWMSGBFRACCTING")
    protected String allowmsgbfraccting;
    @XmlElement(name = "ALLOWCHGWHOMCHANGE")
    protected String allowchgwhomchange;
    @XmlElement(name = "CHGWHOM", required = true)
    protected String chgwhom;
    @XmlElement(name = "BENIBANMAND")
    protected String benibanmand;
    @XmlElement(name = "MULTCUSTTRNASF")
    protected String multcusttrnasf;
    @XmlElement(name = "RTGSPRD")
    protected String rtgsprd;
    @XmlElement(name = "PAYMTTYP")
    protected String paymttyp;
    @XmlElement(name = "FINYCOPYNETWRK")
    protected String finycopynetwrk;
    @XmlElement(name = "BNKPRIORITY")
    protected String bnkpriority;
    @XmlElement(name = "SENDRNOTIFREQD")
    protected String sendrnotifreqd;
    @XmlElement(name = "REKEYREQ")
    protected String rekeyreq;
    @XmlElement(name = "PAYMTBY")
    protected String paymtby;
    @XmlElement(name = "GENMT102P")
    protected String genmt102P;
    @XmlElement(name = "DUPDRCCY")
    protected String dupdrccy;
    @XmlElement(name = "DUPCRCCY")
    protected String dupcrccy;
    @XmlElement(name = "DUPCRVALDATE")
    protected String dupcrvaldate;
    @XmlElement(name = "DUPCRAMT")
    protected String dupcramt;
    @XmlElement(name = "DUPDRVALDATE")
    protected String dupdrvaldate;
    @XmlElement(name = "DUPPRDCD")
    protected String dupprdcd;
    @XmlElement(name = "DUPBOOKDATE")
    protected String dupbookdate;
    @XmlElement(name = "DUPDRAMT")
    protected String dupdramt;
    @XmlElement(name = "DUPULTBENACC")
    protected String dupultbenacc;
    @XmlElement(name = "DUPULTBENADDR")
    protected String dupultbenaddr;
    @XmlElement(name = "Charge-Details")
    protected List<ChargeDetails> chargeDetails;
    @XmlElement(name = "Tax-Scheme")
    protected TaxScheme taxScheme;
    @XmlElement(name = "Prod-Cust-Restrictions")
    protected CustRestrictionCreateIOType prodCustRestrictions;
    @XmlElement(name = "Role-To-Head-Mapping")
    protected RoleToHeadMappingCreateIOType roleToHeadMapping;
    @XmlElement(name = "Product-Fields")
    protected ProductUDFCreateIOType productFields;
    @XmlElement(name = "Product-Events")
    protected ProdEventDtlsCreateIOType productEvents;
    @XmlElement(name = "Product-Mis-Details")
    protected ProdMisDetailsCreateIOType productMisDetails;
    @XmlElement(name = "Branch-Ccy-Restrictions")
    protected BranchRestrictionCreateIOType branchCcyRestrictions;

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
     * Gets the value of the prddesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDDESC() {
        return prddesc;
    }

    /**
     * Sets the value of the prddesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDDESC(String value) {
        this.prddesc = value;
    }

    /**
     * Gets the value of the prdslg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDSLG() {
        return prdslg;
    }

    /**
     * Sets the value of the prdslg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDSLG(String value) {
        this.prdslg = value;
    }

    /**
     * Gets the value of the prdgrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDGRP() {
        return prdgrp;
    }

    /**
     * Sets the value of the prdgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDGRP(String value) {
        this.prdgrp = value;
    }

    /**
     * Gets the value of the prdstrtdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRDSTRTDT() {
        return prdstrtdt;
    }

    /**
     * Sets the value of the prdstrtdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRDSTRTDT(XMLGregorianCalendar value) {
        this.prdstrtdt = value;
    }

    /**
     * Gets the value of the prdenddt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPRDENDDT() {
        return prdenddt;
    }

    /**
     * Sets the value of the prdenddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPRDENDDT(XMLGregorianCalendar value) {
        this.prdenddt = value;
    }

    /**
     * Gets the value of the prdrmrks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDRMRKS() {
        return prdrmrks;
    }

    /**
     * Sets the value of the prdrmrks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDRMRKS(String value) {
        this.prdrmrks = value;
    }

    /**
     * Gets the value of the prdtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRDTYP() {
        return prdtyp;
    }

    /**
     * Sets the value of the prdtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRDTYP(String value) {
        this.prdtyp = value;
    }

    /**
     * Gets the value of the gen103P property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGEN103P() {
        return gen103P;
    }

    /**
     * Sets the value of the gen103P property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGEN103P(String value) {
        this.gen103P = value;
    }

    /**
     * Gets the value of the drbackvldys property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDRBACKVLDYS() {
        return drbackvldys;
    }

    /**
     * Sets the value of the drbackvldys property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDRBACKVLDYS(BigDecimal value) {
        this.drbackvldys = value;
    }

    /**
     * Gets the value of the crbackvldays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCRBACKVLDAYS() {
        return crbackvldays;
    }

    /**
     * Sets the value of the crbackvldays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCRBACKVLDAYS(BigDecimal value) {
        this.crbackvldays = value;
    }

    /**
     * Gets the value of the transfrtyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSFRTYP() {
        return transfrtyp;
    }

    /**
     * Sets the value of the transfrtyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSFRTYP(String value) {
        this.transfrtyp = value;
    }

    /**
     * Gets the value of the covreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOVREQD() {
        return covreqd;
    }

    /**
     * Sets the value of the covreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOVREQD(String value) {
        this.covreqd = value;
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
     * Gets the value of the supresbvpmtmsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPRESBVPMTMSG() {
        return supresbvpmtmsg;
    }

    /**
     * Sets the value of the supresbvpmtmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPRESBVPMTMSG(String value) {
        this.supresbvpmtmsg = value;
    }

    /**
     * Gets the value of the rttyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTTYP() {
        return rttyp;
    }

    /**
     * Sets the value of the rttyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTTYP(String value) {
        this.rttyp = value;
    }

    /**
     * Gets the value of the sprdcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPRDCD() {
        return sprdcd;
    }

    /**
     * Sets the value of the sprdcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPRDCD(String value) {
        this.sprdcd = value;
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
     * Gets the value of the rtvarovdlmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRTVAROVDLMT() {
        return rtvarovdlmt;
    }

    /**
     * Sets the value of the rtvarovdlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRTVAROVDLMT(BigDecimal value) {
        this.rtvarovdlmt = value;
    }

    /**
     * Gets the value of the rtvarmaxlmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRTVARMAXLMT() {
        return rtvarmaxlmt;
    }

    /**
     * Sets the value of the rtvarmaxlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRTVARMAXLMT(BigDecimal value) {
        this.rtvarmaxlmt = value;
    }

    /**
     * Gets the value of the mckreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCKREQD() {
        return mckreqd;
    }

    /**
     * Sets the value of the mckreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCKREQD(String value) {
        this.mckreqd = value;
    }

    /**
     * Gets the value of the mckacgl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCKACGL() {
        return mckacgl;
    }

    /**
     * Sets the value of the mckacgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCKACGL(String value) {
        this.mckacgl = value;
    }

    /**
     * Gets the value of the daogl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDAOGL() {
        return daogl;
    }

    /**
     * Sets the value of the daogl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDAOGL(String value) {
        this.daogl = value;
    }

    /**
     * Gets the value of the splitdrcrliqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPLITDRCRLIQD() {
        return splitdrcrliqd;
    }

    /**
     * Sets the value of the splitdrcrliqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPLITDRCRLIQD(String value) {
        this.splitdrcrliqd = value;
    }

    /**
     * Gets the value of the futrvld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUTRVLD() {
        return futrvld;
    }

    /**
     * Sets the value of the futrvld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUTRVLD(String value) {
        this.futrvld = value;
    }

    /**
     * Gets the value of the crossccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCROSSCCY() {
        return crossccy;
    }

    /**
     * Sets the value of the crossccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCROSSCCY(String value) {
        this.crossccy = value;
    }

    /**
     * Gets the value of the autoodoverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTOODOVERRIDE() {
        return autoodoverride;
    }

    /**
     * Sets the value of the autoodoverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTOODOVERRIDE(String value) {
        this.autoodoverride = value;
    }

    /**
     * Gets the value of the cutoffdaysreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUTOFFDAYSREQ() {
        return cutoffdaysreq;
    }

    /**
     * Sets the value of the cutoffdaysreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUTOFFDAYSREQ(String value) {
        this.cutoffdaysreq = value;
    }

    /**
     * Gets the value of the rekeyofccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREKEYOFCCY() {
        return rekeyofccy;
    }

    /**
     * Sets the value of the rekeyofccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREKEYOFCCY(String value) {
        this.rekeyofccy = value;
    }

    /**
     * Gets the value of the rekeyofamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREKEYOFAMT() {
        return rekeyofamt;
    }

    /**
     * Sets the value of the rekeyofamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREKEYOFAMT(String value) {
        this.rekeyofamt = value;
    }

    /**
     * Gets the value of the rekeyofvldt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREKEYOFVLDT() {
        return rekeyofvldt;
    }

    /**
     * Sets the value of the rekeyofvldt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREKEYOFVLDT(String value) {
        this.rekeyofvldt = value;
    }

    /**
     * Gets the value of the spcialclg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPCIALCLG() {
        return spcialclg;
    }

    /**
     * Sets the value of the spcialclg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPCIALCLG(String value) {
        this.spcialclg = value;
    }

    /**
     * Gets the value of the clgnetwrk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLGNETWRK() {
        return clgnetwrk;
    }

    /**
     * Sets the value of the clgnetwrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLGNETWRK(String value) {
        this.clgnetwrk = value;
    }

    /**
     * Gets the value of the rekeyofdracc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREKEYOFDRACC() {
        return rekeyofdracc;
    }

    /**
     * Sets the value of the rekeyofdracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREKEYOFDRACC(String value) {
        this.rekeyofdracc = value;
    }

    /**
     * Gets the value of the rekeyofcracc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREKEYOFCRACC() {
        return rekeyofcracc;
    }

    /**
     * Sets the value of the rekeyofcracc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREKEYOFCRACC(String value) {
        this.rekeyofcracc = value;
    }

    /**
     * Gets the value of the drbackval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRBACKVAL() {
        return drbackval;
    }

    /**
     * Sets the value of the drbackval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRBACKVAL(String value) {
        this.drbackval = value;
    }

    /**
     * Gets the value of the crbackvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRBACKVL() {
        return crbackvl;
    }

    /**
     * Sets the value of the crbackvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRBACKVL(String value) {
        this.crbackvl = value;
    }

    /**
     * Gets the value of the refralreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFRALREQD() {
        return refralreqd;
    }

    /**
     * Sets the value of the refralreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFRALREQD(String value) {
        this.refralreqd = value;
    }

    /**
     * Gets the value of the validtbenefcry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDTBENEFCRY() {
        return validtbenefcry;
    }

    /**
     * Sets the value of the validtbenefcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDTBENEFCRY(String value) {
        this.validtbenefcry = value;
    }

    /**
     * Gets the value of the allowmsgbfraccting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWMSGBFRACCTING() {
        return allowmsgbfraccting;
    }

    /**
     * Sets the value of the allowmsgbfraccting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWMSGBFRACCTING(String value) {
        this.allowmsgbfraccting = value;
    }

    /**
     * Gets the value of the allowchgwhomchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWCHGWHOMCHANGE() {
        return allowchgwhomchange;
    }

    /**
     * Sets the value of the allowchgwhomchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWCHGWHOMCHANGE(String value) {
        this.allowchgwhomchange = value;
    }

    /**
     * Gets the value of the chgwhom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHGWHOM() {
        return chgwhom;
    }

    /**
     * Sets the value of the chgwhom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHGWHOM(String value) {
        this.chgwhom = value;
    }

    /**
     * Gets the value of the benibanmand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBENIBANMAND() {
        return benibanmand;
    }

    /**
     * Sets the value of the benibanmand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBENIBANMAND(String value) {
        this.benibanmand = value;
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
     * Gets the value of the rtgsprd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTGSPRD() {
        return rtgsprd;
    }

    /**
     * Sets the value of the rtgsprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTGSPRD(String value) {
        this.rtgsprd = value;
    }

    /**
     * Gets the value of the paymttyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMTTYP() {
        return paymttyp;
    }

    /**
     * Sets the value of the paymttyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMTTYP(String value) {
        this.paymttyp = value;
    }

    /**
     * Gets the value of the finycopynetwrk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINYCOPYNETWRK() {
        return finycopynetwrk;
    }

    /**
     * Sets the value of the finycopynetwrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINYCOPYNETWRK(String value) {
        this.finycopynetwrk = value;
    }

    /**
     * Gets the value of the bnkpriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBNKPRIORITY() {
        return bnkpriority;
    }

    /**
     * Sets the value of the bnkpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBNKPRIORITY(String value) {
        this.bnkpriority = value;
    }

    /**
     * Gets the value of the sendrnotifreqd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDRNOTIFREQD() {
        return sendrnotifreqd;
    }

    /**
     * Sets the value of the sendrnotifreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDRNOTIFREQD(String value) {
        this.sendrnotifreqd = value;
    }

    /**
     * Gets the value of the rekeyreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREKEYREQ() {
        return rekeyreq;
    }

    /**
     * Sets the value of the rekeyreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREKEYREQ(String value) {
        this.rekeyreq = value;
    }

    /**
     * Gets the value of the paymtby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMTBY() {
        return paymtby;
    }

    /**
     * Sets the value of the paymtby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMTBY(String value) {
        this.paymtby = value;
    }

    /**
     * Gets the value of the genmt102P property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENMT102P() {
        return genmt102P;
    }

    /**
     * Sets the value of the genmt102P property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENMT102P(String value) {
        this.genmt102P = value;
    }

    /**
     * Gets the value of the dupdrccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPDRCCY() {
        return dupdrccy;
    }

    /**
     * Sets the value of the dupdrccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPDRCCY(String value) {
        this.dupdrccy = value;
    }

    /**
     * Gets the value of the dupcrccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPCRCCY() {
        return dupcrccy;
    }

    /**
     * Sets the value of the dupcrccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPCRCCY(String value) {
        this.dupcrccy = value;
    }

    /**
     * Gets the value of the dupcrvaldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPCRVALDATE() {
        return dupcrvaldate;
    }

    /**
     * Sets the value of the dupcrvaldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPCRVALDATE(String value) {
        this.dupcrvaldate = value;
    }

    /**
     * Gets the value of the dupcramt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPCRAMT() {
        return dupcramt;
    }

    /**
     * Sets the value of the dupcramt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPCRAMT(String value) {
        this.dupcramt = value;
    }

    /**
     * Gets the value of the dupdrvaldate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPDRVALDATE() {
        return dupdrvaldate;
    }

    /**
     * Sets the value of the dupdrvaldate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPDRVALDATE(String value) {
        this.dupdrvaldate = value;
    }

    /**
     * Gets the value of the dupprdcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPPRDCD() {
        return dupprdcd;
    }

    /**
     * Sets the value of the dupprdcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPPRDCD(String value) {
        this.dupprdcd = value;
    }

    /**
     * Gets the value of the dupbookdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPBOOKDATE() {
        return dupbookdate;
    }

    /**
     * Sets the value of the dupbookdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPBOOKDATE(String value) {
        this.dupbookdate = value;
    }

    /**
     * Gets the value of the dupdramt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPDRAMT() {
        return dupdramt;
    }

    /**
     * Sets the value of the dupdramt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPDRAMT(String value) {
        this.dupdramt = value;
    }

    /**
     * Gets the value of the dupultbenacc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPULTBENACC() {
        return dupultbenacc;
    }

    /**
     * Sets the value of the dupultbenacc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPULTBENACC(String value) {
        this.dupultbenacc = value;
    }

    /**
     * Gets the value of the dupultbenaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUPULTBENADDR() {
        return dupultbenaddr;
    }

    /**
     * Sets the value of the dupultbenaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUPULTBENADDR(String value) {
        this.dupultbenaddr = value;
    }

    /**
     * Gets the value of the chargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeDetails }
     * 
     * 
     */
    public List<ChargeDetails> getChargeDetails() {
        if (chargeDetails == null) {
            chargeDetails = new ArrayList<ChargeDetails>();
        }
        return this.chargeDetails;
    }

    /**
     * Gets the value of the taxScheme property.
     * 
     * @return
     *     possible object is
     *     {@link TaxScheme }
     *     
     */
    public TaxScheme getTaxScheme() {
        return taxScheme;
    }

    /**
     * Sets the value of the taxScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxScheme }
     *     
     */
    public void setTaxScheme(TaxScheme value) {
        this.taxScheme = value;
    }

    /**
     * Gets the value of the prodCustRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link CustRestrictionCreateIOType }
     *     
     */
    public CustRestrictionCreateIOType getProdCustRestrictions() {
        return prodCustRestrictions;
    }

    /**
     * Sets the value of the prodCustRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustRestrictionCreateIOType }
     *     
     */
    public void setProdCustRestrictions(CustRestrictionCreateIOType value) {
        this.prodCustRestrictions = value;
    }

    /**
     * Gets the value of the roleToHeadMapping property.
     * 
     * @return
     *     possible object is
     *     {@link RoleToHeadMappingCreateIOType }
     *     
     */
    public RoleToHeadMappingCreateIOType getRoleToHeadMapping() {
        return roleToHeadMapping;
    }

    /**
     * Sets the value of the roleToHeadMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleToHeadMappingCreateIOType }
     *     
     */
    public void setRoleToHeadMapping(RoleToHeadMappingCreateIOType value) {
        this.roleToHeadMapping = value;
    }

    /**
     * Gets the value of the productFields property.
     * 
     * @return
     *     possible object is
     *     {@link ProductUDFCreateIOType }
     *     
     */
    public ProductUDFCreateIOType getProductFields() {
        return productFields;
    }

    /**
     * Sets the value of the productFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductUDFCreateIOType }
     *     
     */
    public void setProductFields(ProductUDFCreateIOType value) {
        this.productFields = value;
    }

    /**
     * Gets the value of the productEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ProdEventDtlsCreateIOType }
     *     
     */
    public ProdEventDtlsCreateIOType getProductEvents() {
        return productEvents;
    }

    /**
     * Sets the value of the productEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdEventDtlsCreateIOType }
     *     
     */
    public void setProductEvents(ProdEventDtlsCreateIOType value) {
        this.productEvents = value;
    }

    /**
     * Gets the value of the productMisDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProdMisDetailsCreateIOType }
     *     
     */
    public ProdMisDetailsCreateIOType getProductMisDetails() {
        return productMisDetails;
    }

    /**
     * Sets the value of the productMisDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdMisDetailsCreateIOType }
     *     
     */
    public void setProductMisDetails(ProdMisDetailsCreateIOType value) {
        this.productMisDetails = value;
    }

    /**
     * Gets the value of the branchCcyRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link BranchRestrictionCreateIOType }
     *     
     */
    public BranchRestrictionCreateIOType getBranchCcyRestrictions() {
        return branchCcyRestrictions;
    }

    /**
     * Sets the value of the branchCcyRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchRestrictionCreateIOType }
     *     
     */
    public void setBranchCcyRestrictions(BranchRestrictionCreateIOType value) {
        this.branchCcyRestrictions = value;
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
     *         &lt;element name="COMPNENT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="EVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BASISAMNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BASISAMNTCATG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACQREQD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SETTLMNTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHNGDRGAMNDMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STPAPPLICTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADVCHRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "compnent",
        "evnt",
        "rule",
        "basisamnttyp",
        "basisamntcatg",
        "acqreqd",
        "settlmntccy",
        "chngdrgamndmnt",
        "stpappliction",
        "advchrg"
    })
    public static class ChargeDetails {

        @XmlElement(name = "COMPNENT", required = true)
        protected String compnent;
        @XmlElement(name = "EVNT")
        protected String evnt;
        @XmlElement(name = "RULE")
        protected String rule;
        @XmlElement(name = "BASISAMNTTYP")
        protected String basisamnttyp;
        @XmlElement(name = "BASISAMNTCATG")
        protected String basisamntcatg;
        @XmlElement(name = "ACQREQD")
        protected String acqreqd;
        @XmlElement(name = "SETTLMNTCCY")
        protected String settlmntccy;
        @XmlElement(name = "CHNGDRGAMNDMNT")
        protected String chngdrgamndmnt;
        @XmlElement(name = "STPAPPLICTION")
        protected String stpappliction;
        @XmlElement(name = "ADVCHRG")
        protected String advchrg;

        /**
         * Gets the value of the compnent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPNENT() {
            return compnent;
        }

        /**
         * Sets the value of the compnent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPNENT(String value) {
            this.compnent = value;
        }

        /**
         * Gets the value of the evnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEVNT() {
            return evnt;
        }

        /**
         * Sets the value of the evnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEVNT(String value) {
            this.evnt = value;
        }

        /**
         * Gets the value of the rule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRULE() {
            return rule;
        }

        /**
         * Sets the value of the rule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRULE(String value) {
            this.rule = value;
        }

        /**
         * Gets the value of the basisamnttyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBASISAMNTTYP() {
            return basisamnttyp;
        }

        /**
         * Sets the value of the basisamnttyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBASISAMNTTYP(String value) {
            this.basisamnttyp = value;
        }

        /**
         * Gets the value of the basisamntcatg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBASISAMNTCATG() {
            return basisamntcatg;
        }

        /**
         * Sets the value of the basisamntcatg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBASISAMNTCATG(String value) {
            this.basisamntcatg = value;
        }

        /**
         * Gets the value of the acqreqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACQREQD() {
            return acqreqd;
        }

        /**
         * Sets the value of the acqreqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACQREQD(String value) {
            this.acqreqd = value;
        }

        /**
         * Gets the value of the settlmntccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSETTLMNTCCY() {
            return settlmntccy;
        }

        /**
         * Sets the value of the settlmntccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSETTLMNTCCY(String value) {
            this.settlmntccy = value;
        }

        /**
         * Gets the value of the chngdrgamndmnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHNGDRGAMNDMNT() {
            return chngdrgamndmnt;
        }

        /**
         * Sets the value of the chngdrgamndmnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHNGDRGAMNDMNT(String value) {
            this.chngdrgamndmnt = value;
        }

        /**
         * Gets the value of the stpappliction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTPAPPLICTION() {
            return stpappliction;
        }

        /**
         * Sets the value of the stpappliction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTPAPPLICTION(String value) {
            this.stpappliction = value;
        }

        /**
         * Gets the value of the advchrg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADVCHRG() {
            return advchrg;
        }

        /**
         * Sets the value of the advchrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADVCHRG(String value) {
            this.advchrg = value;
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
     *         &lt;element name="SCHME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Tax-Details" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BASISAMNTAG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="COMPTATIONEVNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TAXTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "schme",
        "taxDetails"
    })
    public static class TaxScheme {

        @XmlElement(name = "SCHME")
        protected String schme;
        @XmlElement(name = "Tax-Details")
        protected List<TaxDetails> taxDetails;

        /**
         * Gets the value of the schme property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCHME() {
            return schme;
        }

        /**
         * Sets the value of the schme property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCHME(String value) {
            this.schme = value;
        }

        /**
         * Gets the value of the taxDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the taxDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxDetails }
         * 
         * 
         */
        public List<TaxDetails> getTaxDetails() {
            if (taxDetails == null) {
                taxDetails = new ArrayList<TaxDetails>();
            }
            return this.taxDetails;
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
         *         &lt;element name="BASISAMNTAG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="COMPTATIONEVNT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TAXTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "basisamntag",
            "comptationevnt",
            "taxtyp"
        })
        public static class TaxDetails {

            @XmlElement(name = "BASISAMNTAG", required = true)
            protected String basisamntag;
            @XmlElement(name = "COMPTATIONEVNT", required = true)
            protected String comptationevnt;
            @XmlElement(name = "TAXTYP")
            protected String taxtyp;

            /**
             * Gets the value of the basisamntag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBASISAMNTAG() {
                return basisamntag;
            }

            /**
             * Sets the value of the basisamntag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBASISAMNTAG(String value) {
                this.basisamntag = value;
            }

            /**
             * Gets the value of the comptationevnt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMPTATIONEVNT() {
                return comptationevnt;
            }

            /**
             * Sets the value of the comptationevnt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMPTATIONEVNT(String value) {
                this.comptationevnt = value;
            }

            /**
             * Gets the value of the taxtyp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAXTYP() {
                return taxtyp;
            }

            /**
             * Sets the value of the taxtyp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAXTYP(String value) {
                this.taxtyp = value;
            }

        }

    }

}
