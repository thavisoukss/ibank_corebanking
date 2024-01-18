
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
 * <p>Java class for MT101-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MT101-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CUSTOMERNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SENDERSREFMAND" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CUSTREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSTRPARTY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSTRPARTY2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ORDACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDENTCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PARTYIDENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ORDADDLINE1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ORDADDLINE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ORDADDLINE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ORDADDLINE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACSERVICEINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACSERVICEINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECEIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REQUESTEXECDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AUTHORIZATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CHECKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MODNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TXNSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sequence-B" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TXNCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TXNAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="EXCHANGERATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="TXNREF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FXDEALREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDNCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDLN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDLN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDLN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTERMEDLN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AWIBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AWIPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AWINCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AWILN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AWILN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AWILN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ADDLN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENIDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENLN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENLN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENLN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BENLN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMITINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMITINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMITINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMITINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REGINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REGINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REGINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORGORDCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORGORDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CHGDET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHGACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTRCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTRCD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTRCD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTRCD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTRCD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTRCD6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTRPTY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INSTRPTY2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OCACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OCIDENTIFYCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OCPTYIDENTIFY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OCADDLN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OCADDLN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OCADDLN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OCADDLN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACSERVINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="BICCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "MT101-Full-Type", propOrder = {
    "customerno",
    "sendersrefmand",
    "custrefno",
    "instrparty1",
    "instrparty2",
    "ordaccno",
    "identcd",
    "partyident",
    "ordaddline1",
    "ordaddline2",
    "ordaddline3",
    "ordaddline4",
    "acserviceinst1",
    "acserviceinst2",
    "receiver",
    "requestexecdt",
    "authorization",
    "maker",
    "makerstamp",
    "checker",
    "checkerstamp",
    "modno",
    "txnstat",
    "authstat",
    "sequenceB"
})
public class MT101FullType {

    @XmlElement(name = "CUSTOMERNO")
    protected String customerno;
    @XmlElement(name = "SENDERSREFMAND", required = true)
    protected String sendersrefmand;
    @XmlElement(name = "CUSTREFNO")
    protected String custrefno;
    @XmlElement(name = "INSTRPARTY1")
    protected String instrparty1;
    @XmlElement(name = "INSTRPARTY2")
    protected String instrparty2;
    @XmlElement(name = "ORDACCNO")
    protected String ordaccno;
    @XmlElement(name = "IDENTCD")
    protected String identcd;
    @XmlElement(name = "PARTYIDENT")
    protected String partyident;
    @XmlElement(name = "ORDADDLINE1")
    protected String ordaddline1;
    @XmlElement(name = "ORDADDLINE2")
    protected String ordaddline2;
    @XmlElement(name = "ORDADDLINE3")
    protected String ordaddline3;
    @XmlElement(name = "ORDADDLINE4")
    protected String ordaddline4;
    @XmlElement(name = "ACSERVICEINST1")
    protected String acserviceinst1;
    @XmlElement(name = "ACSERVICEINST2")
    protected String acserviceinst2;
    @XmlElement(name = "RECEIVER")
    protected String receiver;
    @XmlElement(name = "REQUESTEXECDT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestexecdt;
    @XmlElement(name = "AUTHORIZATION")
    protected String authorization;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "CHECKER")
    protected String checker;
    @XmlElement(name = "CHECKERSTAMP")
    protected String checkerstamp;
    @XmlElement(name = "MODNO")
    protected BigDecimal modno;
    @XmlElement(name = "TXNSTAT")
    protected String txnstat;
    @XmlElement(name = "AUTHSTAT")
    protected String authstat;
    @XmlElement(name = "Sequence-B", required = true)
    protected List<SequenceB> sequenceB;

    /**
     * Gets the value of the customerno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTOMERNO() {
        return customerno;
    }

    /**
     * Sets the value of the customerno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTOMERNO(String value) {
        this.customerno = value;
    }

    /**
     * Gets the value of the sendersrefmand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDERSREFMAND() {
        return sendersrefmand;
    }

    /**
     * Sets the value of the sendersrefmand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDERSREFMAND(String value) {
        this.sendersrefmand = value;
    }

    /**
     * Gets the value of the custrefno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSTREFNO() {
        return custrefno;
    }

    /**
     * Sets the value of the custrefno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSTREFNO(String value) {
        this.custrefno = value;
    }

    /**
     * Gets the value of the instrparty1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRPARTY1() {
        return instrparty1;
    }

    /**
     * Sets the value of the instrparty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRPARTY1(String value) {
        this.instrparty1 = value;
    }

    /**
     * Gets the value of the instrparty2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTRPARTY2() {
        return instrparty2;
    }

    /**
     * Sets the value of the instrparty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTRPARTY2(String value) {
        this.instrparty2 = value;
    }

    /**
     * Gets the value of the ordaccno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDACCNO() {
        return ordaccno;
    }

    /**
     * Sets the value of the ordaccno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDACCNO(String value) {
        this.ordaccno = value;
    }

    /**
     * Gets the value of the identcd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTCD() {
        return identcd;
    }

    /**
     * Sets the value of the identcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTCD(String value) {
        this.identcd = value;
    }

    /**
     * Gets the value of the partyident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTYIDENT() {
        return partyident;
    }

    /**
     * Sets the value of the partyident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTYIDENT(String value) {
        this.partyident = value;
    }

    /**
     * Gets the value of the ordaddline1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDADDLINE1() {
        return ordaddline1;
    }

    /**
     * Sets the value of the ordaddline1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDADDLINE1(String value) {
        this.ordaddline1 = value;
    }

    /**
     * Gets the value of the ordaddline2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDADDLINE2() {
        return ordaddline2;
    }

    /**
     * Sets the value of the ordaddline2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDADDLINE2(String value) {
        this.ordaddline2 = value;
    }

    /**
     * Gets the value of the ordaddline3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDADDLINE3() {
        return ordaddline3;
    }

    /**
     * Sets the value of the ordaddline3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDADDLINE3(String value) {
        this.ordaddline3 = value;
    }

    /**
     * Gets the value of the ordaddline4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDADDLINE4() {
        return ordaddline4;
    }

    /**
     * Sets the value of the ordaddline4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDADDLINE4(String value) {
        this.ordaddline4 = value;
    }

    /**
     * Gets the value of the acserviceinst1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSERVICEINST1() {
        return acserviceinst1;
    }

    /**
     * Sets the value of the acserviceinst1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSERVICEINST1(String value) {
        this.acserviceinst1 = value;
    }

    /**
     * Gets the value of the acserviceinst2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACSERVICEINST2() {
        return acserviceinst2;
    }

    /**
     * Sets the value of the acserviceinst2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACSERVICEINST2(String value) {
        this.acserviceinst2 = value;
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
     * Gets the value of the requestexecdt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getREQUESTEXECDT() {
        return requestexecdt;
    }

    /**
     * Sets the value of the requestexecdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setREQUESTEXECDT(XMLGregorianCalendar value) {
        this.requestexecdt = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTHORIZATION() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTHORIZATION(String value) {
        this.authorization = value;
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
     * Gets the value of the makerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERSTAMP() {
        return makerstamp;
    }

    /**
     * Sets the value of the makerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERSTAMP(String value) {
        this.makerstamp = value;
    }

    /**
     * Gets the value of the checker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKER() {
        return checker;
    }

    /**
     * Sets the value of the checker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKER(String value) {
        this.checker = value;
    }

    /**
     * Gets the value of the checkerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHECKERSTAMP() {
        return checkerstamp;
    }

    /**
     * Sets the value of the checkerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHECKERSTAMP(String value) {
        this.checkerstamp = value;
    }

    /**
     * Gets the value of the modno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMODNO() {
        return modno;
    }

    /**
     * Sets the value of the modno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMODNO(BigDecimal value) {
        this.modno = value;
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
     * Gets the value of the sequenceB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sequenceB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceB }
     * 
     * 
     */
    public List<SequenceB> getSequenceB() {
        if (sequenceB == null) {
            sequenceB = new ArrayList<SequenceB>();
        }
        return this.sequenceB;
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
     *         &lt;element name="TXNCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TXNAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="EXCHANGERATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="TXNREF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FXDEALREF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDNCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDLN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDLN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDLN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTERMEDLN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AWIBIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AWIPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AWINCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AWILN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AWILN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AWILN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ADDLN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENIDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENLN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENLN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENLN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BENLN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMITINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMITINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMITINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMITINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REGINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REGINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REGINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORGORDCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORGORDAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CHGDET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHGACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTRCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTRCD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTRCD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTRCD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTRCD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTRCD6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTRPTY1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INSTRPTY2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OCACCNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OCIDENTIFYCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OCPTYIDENTIFY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OCADDLN1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OCADDLN2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OCADDLN3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OCADDLN4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACSERVINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="BICCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "txnccy",
        "txnamt",
        "exchangerate",
        "txnref",
        "fxdealref",
        "intermedbic",
        "intermedpid",
        "intermedncc",
        "intermedln1",
        "intermedln2",
        "intermedln3",
        "intermedln4",
        "awibic",
        "awipid",
        "awincc",
        "awiln1",
        "awiln2",
        "awiln3",
        "addln4",
        "benacc",
        "benidcd",
        "benln1",
        "benln2",
        "benln3",
        "benln4",
        "remitinfo1",
        "remitinfo2",
        "remitinfo3",
        "remitinfo4",
        "reginfo1",
        "reginfo2",
        "reginfo3",
        "orgordccy",
        "orgordamt",
        "chgdet",
        "chgacc",
        "instrcd1",
        "instrcd2",
        "instrcd3",
        "instrcd4",
        "instrcd5",
        "instrcd6",
        "instrpty1",
        "instrpty2",
        "ocaccno",
        "ocidentifycd",
        "ocptyidentify",
        "ocaddln1",
        "ocaddln2",
        "ocaddln3",
        "ocaddln4",
        "acservinst1",
        "biccode"
    })
    public static class SequenceB {

        @XmlElement(name = "TXNCCY")
        protected String txnccy;
        @XmlElement(name = "TXNAMT")
        protected BigDecimal txnamt;
        @XmlElement(name = "EXCHANGERATE")
        protected BigDecimal exchangerate;
        @XmlElement(name = "TXNREF", required = true)
        protected String txnref;
        @XmlElement(name = "FXDEALREF")
        protected String fxdealref;
        @XmlElement(name = "INTERMEDBIC")
        protected String intermedbic;
        @XmlElement(name = "INTERMEDPID")
        protected String intermedpid;
        @XmlElement(name = "INTERMEDNCC")
        protected String intermedncc;
        @XmlElement(name = "INTERMEDLN1")
        protected String intermedln1;
        @XmlElement(name = "INTERMEDLN2")
        protected String intermedln2;
        @XmlElement(name = "INTERMEDLN3")
        protected String intermedln3;
        @XmlElement(name = "INTERMEDLN4")
        protected String intermedln4;
        @XmlElement(name = "AWIBIC")
        protected String awibic;
        @XmlElement(name = "AWIPID")
        protected String awipid;
        @XmlElement(name = "AWINCC")
        protected String awincc;
        @XmlElement(name = "AWILN1")
        protected String awiln1;
        @XmlElement(name = "AWILN2")
        protected String awiln2;
        @XmlElement(name = "AWILN3")
        protected String awiln3;
        @XmlElement(name = "ADDLN4")
        protected String addln4;
        @XmlElement(name = "BENACC")
        protected String benacc;
        @XmlElement(name = "BENIDCD")
        protected String benidcd;
        @XmlElement(name = "BENLN1")
        protected String benln1;
        @XmlElement(name = "BENLN2")
        protected String benln2;
        @XmlElement(name = "BENLN3")
        protected String benln3;
        @XmlElement(name = "BENLN4")
        protected String benln4;
        @XmlElement(name = "REMITINFO1")
        protected String remitinfo1;
        @XmlElement(name = "REMITINFO2")
        protected String remitinfo2;
        @XmlElement(name = "REMITINFO3")
        protected String remitinfo3;
        @XmlElement(name = "REMITINFO4")
        protected String remitinfo4;
        @XmlElement(name = "REGINFO1")
        protected String reginfo1;
        @XmlElement(name = "REGINFO2")
        protected String reginfo2;
        @XmlElement(name = "REGINFO3")
        protected String reginfo3;
        @XmlElement(name = "ORGORDCCY")
        protected String orgordccy;
        @XmlElement(name = "ORGORDAMT")
        protected BigDecimal orgordamt;
        @XmlElement(name = "CHGDET")
        protected String chgdet;
        @XmlElement(name = "CHGACC")
        protected String chgacc;
        @XmlElement(name = "INSTRCD1")
        protected String instrcd1;
        @XmlElement(name = "INSTRCD2")
        protected String instrcd2;
        @XmlElement(name = "INSTRCD3")
        protected String instrcd3;
        @XmlElement(name = "INSTRCD4")
        protected String instrcd4;
        @XmlElement(name = "INSTRCD5")
        protected String instrcd5;
        @XmlElement(name = "INSTRCD6")
        protected String instrcd6;
        @XmlElement(name = "INSTRPTY1")
        protected String instrpty1;
        @XmlElement(name = "INSTRPTY2")
        protected String instrpty2;
        @XmlElement(name = "OCACCNO")
        protected String ocaccno;
        @XmlElement(name = "OCIDENTIFYCD")
        protected String ocidentifycd;
        @XmlElement(name = "OCPTYIDENTIFY")
        protected String ocptyidentify;
        @XmlElement(name = "OCADDLN1")
        protected String ocaddln1;
        @XmlElement(name = "OCADDLN2")
        protected String ocaddln2;
        @XmlElement(name = "OCADDLN3")
        protected String ocaddln3;
        @XmlElement(name = "OCADDLN4")
        protected String ocaddln4;
        @XmlElement(name = "ACSERVINST1")
        protected String acservinst1;
        @XmlElement(name = "BICCODE")
        protected String biccode;

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
         * Gets the value of the txnamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTXNAMT() {
            return txnamt;
        }

        /**
         * Sets the value of the txnamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTXNAMT(BigDecimal value) {
            this.txnamt = value;
        }

        /**
         * Gets the value of the exchangerate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEXCHANGERATE() {
            return exchangerate;
        }

        /**
         * Sets the value of the exchangerate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEXCHANGERATE(BigDecimal value) {
            this.exchangerate = value;
        }

        /**
         * Gets the value of the txnref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTXNREF() {
            return txnref;
        }

        /**
         * Sets the value of the txnref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTXNREF(String value) {
            this.txnref = value;
        }

        /**
         * Gets the value of the fxdealref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFXDEALREF() {
            return fxdealref;
        }

        /**
         * Sets the value of the fxdealref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFXDEALREF(String value) {
            this.fxdealref = value;
        }

        /**
         * Gets the value of the intermedbic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDBIC() {
            return intermedbic;
        }

        /**
         * Sets the value of the intermedbic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDBIC(String value) {
            this.intermedbic = value;
        }

        /**
         * Gets the value of the intermedpid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDPID() {
            return intermedpid;
        }

        /**
         * Sets the value of the intermedpid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDPID(String value) {
            this.intermedpid = value;
        }

        /**
         * Gets the value of the intermedncc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDNCC() {
            return intermedncc;
        }

        /**
         * Sets the value of the intermedncc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDNCC(String value) {
            this.intermedncc = value;
        }

        /**
         * Gets the value of the intermedln1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDLN1() {
            return intermedln1;
        }

        /**
         * Sets the value of the intermedln1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDLN1(String value) {
            this.intermedln1 = value;
        }

        /**
         * Gets the value of the intermedln2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDLN2() {
            return intermedln2;
        }

        /**
         * Sets the value of the intermedln2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDLN2(String value) {
            this.intermedln2 = value;
        }

        /**
         * Gets the value of the intermedln3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDLN3() {
            return intermedln3;
        }

        /**
         * Sets the value of the intermedln3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDLN3(String value) {
            this.intermedln3 = value;
        }

        /**
         * Gets the value of the intermedln4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINTERMEDLN4() {
            return intermedln4;
        }

        /**
         * Sets the value of the intermedln4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINTERMEDLN4(String value) {
            this.intermedln4 = value;
        }

        /**
         * Gets the value of the awibic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAWIBIC() {
            return awibic;
        }

        /**
         * Sets the value of the awibic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAWIBIC(String value) {
            this.awibic = value;
        }

        /**
         * Gets the value of the awipid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAWIPID() {
            return awipid;
        }

        /**
         * Sets the value of the awipid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAWIPID(String value) {
            this.awipid = value;
        }

        /**
         * Gets the value of the awincc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAWINCC() {
            return awincc;
        }

        /**
         * Sets the value of the awincc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAWINCC(String value) {
            this.awincc = value;
        }

        /**
         * Gets the value of the awiln1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAWILN1() {
            return awiln1;
        }

        /**
         * Sets the value of the awiln1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAWILN1(String value) {
            this.awiln1 = value;
        }

        /**
         * Gets the value of the awiln2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAWILN2() {
            return awiln2;
        }

        /**
         * Sets the value of the awiln2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAWILN2(String value) {
            this.awiln2 = value;
        }

        /**
         * Gets the value of the awiln3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAWILN3() {
            return awiln3;
        }

        /**
         * Sets the value of the awiln3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAWILN3(String value) {
            this.awiln3 = value;
        }

        /**
         * Gets the value of the addln4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getADDLN4() {
            return addln4;
        }

        /**
         * Sets the value of the addln4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setADDLN4(String value) {
            this.addln4 = value;
        }

        /**
         * Gets the value of the benacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENACC() {
            return benacc;
        }

        /**
         * Sets the value of the benacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENACC(String value) {
            this.benacc = value;
        }

        /**
         * Gets the value of the benidcd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENIDCD() {
            return benidcd;
        }

        /**
         * Sets the value of the benidcd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENIDCD(String value) {
            this.benidcd = value;
        }

        /**
         * Gets the value of the benln1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENLN1() {
            return benln1;
        }

        /**
         * Sets the value of the benln1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENLN1(String value) {
            this.benln1 = value;
        }

        /**
         * Gets the value of the benln2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENLN2() {
            return benln2;
        }

        /**
         * Sets the value of the benln2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENLN2(String value) {
            this.benln2 = value;
        }

        /**
         * Gets the value of the benln3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENLN3() {
            return benln3;
        }

        /**
         * Sets the value of the benln3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENLN3(String value) {
            this.benln3 = value;
        }

        /**
         * Gets the value of the benln4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBENLN4() {
            return benln4;
        }

        /**
         * Sets the value of the benln4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBENLN4(String value) {
            this.benln4 = value;
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
         * Gets the value of the reginfo1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREGINFO1() {
            return reginfo1;
        }

        /**
         * Sets the value of the reginfo1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREGINFO1(String value) {
            this.reginfo1 = value;
        }

        /**
         * Gets the value of the reginfo2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREGINFO2() {
            return reginfo2;
        }

        /**
         * Sets the value of the reginfo2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREGINFO2(String value) {
            this.reginfo2 = value;
        }

        /**
         * Gets the value of the reginfo3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREGINFO3() {
            return reginfo3;
        }

        /**
         * Sets the value of the reginfo3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREGINFO3(String value) {
            this.reginfo3 = value;
        }

        /**
         * Gets the value of the orgordccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORGORDCCY() {
            return orgordccy;
        }

        /**
         * Sets the value of the orgordccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORGORDCCY(String value) {
            this.orgordccy = value;
        }

        /**
         * Gets the value of the orgordamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getORGORDAMT() {
            return orgordamt;
        }

        /**
         * Sets the value of the orgordamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setORGORDAMT(BigDecimal value) {
            this.orgordamt = value;
        }

        /**
         * Gets the value of the chgdet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGDET() {
            return chgdet;
        }

        /**
         * Sets the value of the chgdet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGDET(String value) {
            this.chgdet = value;
        }

        /**
         * Gets the value of the chgacc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGACC() {
            return chgacc;
        }

        /**
         * Sets the value of the chgacc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGACC(String value) {
            this.chgacc = value;
        }

        /**
         * Gets the value of the instrcd1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRCD1() {
            return instrcd1;
        }

        /**
         * Sets the value of the instrcd1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRCD1(String value) {
            this.instrcd1 = value;
        }

        /**
         * Gets the value of the instrcd2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRCD2() {
            return instrcd2;
        }

        /**
         * Sets the value of the instrcd2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRCD2(String value) {
            this.instrcd2 = value;
        }

        /**
         * Gets the value of the instrcd3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRCD3() {
            return instrcd3;
        }

        /**
         * Sets the value of the instrcd3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRCD3(String value) {
            this.instrcd3 = value;
        }

        /**
         * Gets the value of the instrcd4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRCD4() {
            return instrcd4;
        }

        /**
         * Sets the value of the instrcd4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRCD4(String value) {
            this.instrcd4 = value;
        }

        /**
         * Gets the value of the instrcd5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRCD5() {
            return instrcd5;
        }

        /**
         * Sets the value of the instrcd5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRCD5(String value) {
            this.instrcd5 = value;
        }

        /**
         * Gets the value of the instrcd6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRCD6() {
            return instrcd6;
        }

        /**
         * Sets the value of the instrcd6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRCD6(String value) {
            this.instrcd6 = value;
        }

        /**
         * Gets the value of the instrpty1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRPTY1() {
            return instrpty1;
        }

        /**
         * Sets the value of the instrpty1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRPTY1(String value) {
            this.instrpty1 = value;
        }

        /**
         * Gets the value of the instrpty2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTRPTY2() {
            return instrpty2;
        }

        /**
         * Sets the value of the instrpty2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTRPTY2(String value) {
            this.instrpty2 = value;
        }

        /**
         * Gets the value of the ocaccno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOCACCNO() {
            return ocaccno;
        }

        /**
         * Sets the value of the ocaccno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOCACCNO(String value) {
            this.ocaccno = value;
        }

        /**
         * Gets the value of the ocidentifycd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOCIDENTIFYCD() {
            return ocidentifycd;
        }

        /**
         * Sets the value of the ocidentifycd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOCIDENTIFYCD(String value) {
            this.ocidentifycd = value;
        }

        /**
         * Gets the value of the ocptyidentify property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOCPTYIDENTIFY() {
            return ocptyidentify;
        }

        /**
         * Sets the value of the ocptyidentify property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOCPTYIDENTIFY(String value) {
            this.ocptyidentify = value;
        }

        /**
         * Gets the value of the ocaddln1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOCADDLN1() {
            return ocaddln1;
        }

        /**
         * Sets the value of the ocaddln1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOCADDLN1(String value) {
            this.ocaddln1 = value;
        }

        /**
         * Gets the value of the ocaddln2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOCADDLN2() {
            return ocaddln2;
        }

        /**
         * Sets the value of the ocaddln2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOCADDLN2(String value) {
            this.ocaddln2 = value;
        }

        /**
         * Gets the value of the ocaddln3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOCADDLN3() {
            return ocaddln3;
        }

        /**
         * Sets the value of the ocaddln3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOCADDLN3(String value) {
            this.ocaddln3 = value;
        }

        /**
         * Gets the value of the ocaddln4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOCADDLN4() {
            return ocaddln4;
        }

        /**
         * Sets the value of the ocaddln4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOCADDLN4(String value) {
            this.ocaddln4 = value;
        }

        /**
         * Gets the value of the acservinst1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACSERVINST1() {
            return acservinst1;
        }

        /**
         * Sets the value of the acservinst1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACSERVINST1(String value) {
            this.acservinst1 = value;
        }

        /**
         * Gets the value of the biccode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBICCODE() {
            return biccode;
        }

        /**
         * Sets the value of the biccode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBICCODE(String value) {
            this.biccode = value;
        }

    }

}
