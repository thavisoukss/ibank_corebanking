
package com.internetbanking.soap.transfer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TxnSetlDtls-Liquidate-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxnSetlDtls-Liquidate-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LATEVNSEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Contract-Settlement" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IBANACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CUSTSPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="SPREADDEFN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COMPNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TAGCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="NETIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ERICCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ERIAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="GENMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RATECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Settlement-Detail" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="INSTRCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INSTRCD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INSTRCD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INSTRCD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ITIMEIND1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ITIMEIND2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ITIMEIND3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INSTRCD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CONTREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="COMPNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BANKOPERCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="INSTRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TRNSTYPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REGREP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REGREP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REGREP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ENVCONT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ENVCONT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ENVCONT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ENVCONT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ENVCONT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Lcl_Clearing" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCVRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCVRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCVRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCVRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRPART" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="ULTBANDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDLINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDLINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDLINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ADDLINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NIPPAYER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="SUPPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PAYERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PMNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="NOOFDEC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="ADDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SNDRRCVRINFO6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DECLARTION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                             &lt;element name="REPRES1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REPRES2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REPRES3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REPRES4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="RCVRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxnSetlDtls-Liquidate-IO-Type", propOrder = {
    "conrefno",
    "latevnseqno",
    "contractSettlement"
})
public class TxnSetlDtlsLiquidateIOType {

    @XmlElement(name = "CONREFNO", required = true)
    protected String conrefno;
    @XmlElement(name = "LATEVNSEQNO")
    protected BigDecimal latevnseqno;
    @XmlElement(name = "Contract-Settlement", required = true)
    protected List<ContractSettlement> contractSettlement;

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
     * Gets the value of the latevnseqno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLATEVNSEQNO() {
        return latevnseqno;
    }

    /**
     * Sets the value of the latevnseqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLATEVNSEQNO(BigDecimal value) {
        this.latevnseqno = value;
    }

    /**
     * Gets the value of the contractSettlement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contractSettlement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractSettlement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractSettlement }
     * 
     * 
     */
    public List<ContractSettlement> getContractSettlement() {
        if (contractSettlement == null) {
            contractSettlement = new ArrayList<ContractSettlement>();
        }
        return this.contractSettlement;
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
     *         &lt;element name="IBANACNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CUSTSPREAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="SPREADDEFN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COMPNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TAGCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCBRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EXRATE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="NETIND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ERICCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ERIAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="GENMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RATECD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Settlement-Detail" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="INSTRCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INSTRCD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INSTRCD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INSTRCD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ITIMEIND1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ITIMEIND2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ITIMEIND3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INSTRCD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CONTREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="COMPNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BANKOPERCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="INSTRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TRNSTYPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REGREP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REGREP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REGREP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ENVCONT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ENVCONT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ENVCONT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ENVCONT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ENVCONT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Lcl_Clearing" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCVRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCVRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCVRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCVRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRPART" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="ULTBANDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDLINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDLINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDLINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ADDLINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NIPPAYER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="SUPPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PAYERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PMNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="NOOFDEC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="ADDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SNDRRCVRINFO6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DECLARTION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                   &lt;element name="REPRES1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REPRES2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REPRES3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REPRES4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="RCVRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "ibanacno",
        "custspread",
        "spreaddefn",
        "compnt",
        "tagccy",
        "accbrn",
        "accccy",
        "exrate",
        "netind",
        "ericcy",
        "eriamt",
        "genmsg",
        "ratecd",
        "acc",
        "settlementDetail",
        "lclClearing"
    })
    public static class ContractSettlement {

        @XmlElement(name = "IBANACNO")
        protected String ibanacno;
        @XmlElement(name = "CUSTSPREAD")
        protected BigDecimal custspread;
        @XmlElement(name = "SPREADDEFN")
        protected String spreaddefn;
        @XmlElement(name = "COMPNT")
        protected String compnt;
        @XmlElement(name = "TAGCCY")
        protected String tagccy;
        @XmlElement(name = "ACCBRN")
        protected String accbrn;
        @XmlElement(name = "ACCCCY")
        protected String accccy;
        @XmlElement(name = "EXRATE")
        protected BigDecimal exrate;
        @XmlElement(name = "NETIND")
        protected String netind;
        @XmlElement(name = "ERICCY")
        protected String ericcy;
        @XmlElement(name = "ERIAMT")
        protected BigDecimal eriamt;
        @XmlElement(name = "GENMSG")
        protected String genmsg;
        @XmlElement(name = "RATECD")
        protected String ratecd;
        @XmlElement(name = "ACC")
        protected String acc;
        @XmlElement(name = "Settlement-Detail")
        protected SettlementDetail settlementDetail;
        @XmlElement(name = "Lcl_Clearing")
        protected LclClearing lclClearing;

        /**
         * Gets the value of the ibanacno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIBANACNO() {
            return ibanacno;
        }

        /**
         * Sets the value of the ibanacno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIBANACNO(String value) {
            this.ibanacno = value;
        }

        /**
         * Gets the value of the custspread property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCUSTSPREAD() {
            return custspread;
        }

        /**
         * Sets the value of the custspread property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCUSTSPREAD(BigDecimal value) {
            this.custspread = value;
        }

        /**
         * Gets the value of the spreaddefn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSPREADDEFN() {
            return spreaddefn;
        }

        /**
         * Sets the value of the spreaddefn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSPREADDEFN(String value) {
            this.spreaddefn = value;
        }

        /**
         * Gets the value of the compnt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOMPNT() {
            return compnt;
        }

        /**
         * Sets the value of the compnt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOMPNT(String value) {
            this.compnt = value;
        }

        /**
         * Gets the value of the tagccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTAGCCY() {
            return tagccy;
        }

        /**
         * Sets the value of the tagccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTAGCCY(String value) {
            this.tagccy = value;
        }

        /**
         * Gets the value of the accbrn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCBRN() {
            return accbrn;
        }

        /**
         * Sets the value of the accbrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCBRN(String value) {
            this.accbrn = value;
        }

        /**
         * Gets the value of the accccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCCCY() {
            return accccy;
        }

        /**
         * Sets the value of the accccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCCCY(String value) {
            this.accccy = value;
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

        /**
         * Gets the value of the netind property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNETIND() {
            return netind;
        }

        /**
         * Sets the value of the netind property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNETIND(String value) {
            this.netind = value;
        }

        /**
         * Gets the value of the ericcy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getERICCY() {
            return ericcy;
        }

        /**
         * Sets the value of the ericcy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setERICCY(String value) {
            this.ericcy = value;
        }

        /**
         * Gets the value of the eriamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getERIAMT() {
            return eriamt;
        }

        /**
         * Sets the value of the eriamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setERIAMT(BigDecimal value) {
            this.eriamt = value;
        }

        /**
         * Gets the value of the genmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGENMSG() {
            return genmsg;
        }

        /**
         * Sets the value of the genmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGENMSG(String value) {
            this.genmsg = value;
        }

        /**
         * Gets the value of the ratecd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRATECD() {
            return ratecd;
        }

        /**
         * Sets the value of the ratecd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRATECD(String value) {
            this.ratecd = value;
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
         * Gets the value of the settlementDetail property.
         * 
         * @return
         *     possible object is
         *     {@link SettlementDetail }
         *     
         */
        public SettlementDetail getSettlementDetail() {
            return settlementDetail;
        }

        /**
         * Sets the value of the settlementDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link SettlementDetail }
         *     
         */
        public void setSettlementDetail(SettlementDetail value) {
            this.settlementDetail = value;
        }

        /**
         * Gets the value of the lclClearing property.
         * 
         * @return
         *     possible object is
         *     {@link LclClearing }
         *     
         */
        public LclClearing getLclClearing() {
            return lclClearing;
        }

        /**
         * Sets the value of the lclClearing property.
         * 
         * @param value
         *     allowed object is
         *     {@link LclClearing }
         *     
         */
        public void setLclClearing(LclClearing value) {
            this.lclClearing = value;
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
         *         &lt;element name="AMTTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCVRCUSTNAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCVRCUSTNAME2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCVRCUSTNAME3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCVRCUSTNAME4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRPART" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="ULTBANDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDLINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDLINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDLINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ADDLINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NIPPAYER" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="SUPPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PAYERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PMNTTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="NOOFDEC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="ADDID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SNDRRCVRINFO6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DECLARTION" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="REPRES1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REPRES2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REPRES3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REPRES4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="RCVRACC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "amttag",
            "sndrcustname1",
            "sndrcustname2",
            "sndrcustname3",
            "sndrcustname4",
            "rcvrcustname1",
            "rcvrcustname2",
            "rcvrcustname3",
            "rcvrcustname4",
            "sndrrcvrpart",
            "ultbandcd",
            "addlinfo1",
            "addlinfo2",
            "addlinfo3",
            "addlinfo4",
            "nippayer",
            "suppid",
            "payerid",
            "pmnttyp",
            "noofdec",
            "addid",
            "sndrrcvrinfo1",
            "sndrrcvrinfo2",
            "sndrrcvrinfo3",
            "sndrrcvrinfo4",
            "sndrrcvrinfo5",
            "sndrrcvrinfo6",
            "declartion",
            "repres1",
            "repres2",
            "repres3",
            "repres4",
            "rcvracc"
        })
        public static class LclClearing {

            @XmlElement(name = "AMTTAG")
            protected String amttag;
            @XmlElement(name = "SNDRCUSTNAME1")
            protected String sndrcustname1;
            @XmlElement(name = "SNDRCUSTNAME2")
            protected String sndrcustname2;
            @XmlElement(name = "SNDRCUSTNAME3")
            protected String sndrcustname3;
            @XmlElement(name = "SNDRCUSTNAME4")
            protected String sndrcustname4;
            @XmlElement(name = "RCVRCUSTNAME1")
            protected String rcvrcustname1;
            @XmlElement(name = "RCVRCUSTNAME2")
            protected String rcvrcustname2;
            @XmlElement(name = "RCVRCUSTNAME3")
            protected String rcvrcustname3;
            @XmlElement(name = "RCVRCUSTNAME4")
            protected String rcvrcustname4;
            @XmlElement(name = "SNDRRCVRPART")
            protected BigDecimal sndrrcvrpart;
            @XmlElement(name = "ULTBANDCD")
            protected String ultbandcd;
            @XmlElement(name = "ADDLINFO1")
            protected String addlinfo1;
            @XmlElement(name = "ADDLINFO2")
            protected String addlinfo2;
            @XmlElement(name = "ADDLINFO3")
            protected String addlinfo3;
            @XmlElement(name = "ADDLINFO4")
            protected String addlinfo4;
            @XmlElement(name = "NIPPAYER")
            protected BigDecimal nippayer;
            @XmlElement(name = "SUPPID")
            protected String suppid;
            @XmlElement(name = "PAYERID")
            protected String payerid;
            @XmlElement(name = "PMNTTYP")
            protected String pmnttyp;
            @XmlElement(name = "NOOFDEC")
            protected BigDecimal noofdec;
            @XmlElement(name = "ADDID")
            protected String addid;
            @XmlElement(name = "SNDRRCVRINFO1")
            protected String sndrrcvrinfo1;
            @XmlElement(name = "SNDRRCVRINFO2")
            protected String sndrrcvrinfo2;
            @XmlElement(name = "SNDRRCVRINFO3")
            protected String sndrrcvrinfo3;
            @XmlElement(name = "SNDRRCVRINFO4")
            protected String sndrrcvrinfo4;
            @XmlElement(name = "SNDRRCVRINFO5")
            protected String sndrrcvrinfo5;
            @XmlElement(name = "SNDRRCVRINFO6")
            protected String sndrrcvrinfo6;
            @XmlElement(name = "DECLARTION")
            protected BigDecimal declartion;
            @XmlElement(name = "REPRES1")
            protected String repres1;
            @XmlElement(name = "REPRES2")
            protected String repres2;
            @XmlElement(name = "REPRES3")
            protected String repres3;
            @XmlElement(name = "REPRES4")
            protected String repres4;
            @XmlElement(name = "RCVRACC")
            protected String rcvracc;

            /**
             * Gets the value of the amttag property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAMTTAG() {
                return amttag;
            }

            /**
             * Sets the value of the amttag property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAMTTAG(String value) {
                this.amttag = value;
            }

            /**
             * Gets the value of the sndrcustname1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRCUSTNAME1() {
                return sndrcustname1;
            }

            /**
             * Sets the value of the sndrcustname1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRCUSTNAME1(String value) {
                this.sndrcustname1 = value;
            }

            /**
             * Gets the value of the sndrcustname2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRCUSTNAME2() {
                return sndrcustname2;
            }

            /**
             * Sets the value of the sndrcustname2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRCUSTNAME2(String value) {
                this.sndrcustname2 = value;
            }

            /**
             * Gets the value of the sndrcustname3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRCUSTNAME3() {
                return sndrcustname3;
            }

            /**
             * Sets the value of the sndrcustname3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRCUSTNAME3(String value) {
                this.sndrcustname3 = value;
            }

            /**
             * Gets the value of the sndrcustname4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRCUSTNAME4() {
                return sndrcustname4;
            }

            /**
             * Sets the value of the sndrcustname4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRCUSTNAME4(String value) {
                this.sndrcustname4 = value;
            }

            /**
             * Gets the value of the rcvrcustname1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVRCUSTNAME1() {
                return rcvrcustname1;
            }

            /**
             * Sets the value of the rcvrcustname1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVRCUSTNAME1(String value) {
                this.rcvrcustname1 = value;
            }

            /**
             * Gets the value of the rcvrcustname2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVRCUSTNAME2() {
                return rcvrcustname2;
            }

            /**
             * Sets the value of the rcvrcustname2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVRCUSTNAME2(String value) {
                this.rcvrcustname2 = value;
            }

            /**
             * Gets the value of the rcvrcustname3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVRCUSTNAME3() {
                return rcvrcustname3;
            }

            /**
             * Sets the value of the rcvrcustname3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVRCUSTNAME3(String value) {
                this.rcvrcustname3 = value;
            }

            /**
             * Gets the value of the rcvrcustname4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVRCUSTNAME4() {
                return rcvrcustname4;
            }

            /**
             * Sets the value of the rcvrcustname4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVRCUSTNAME4(String value) {
                this.rcvrcustname4 = value;
            }

            /**
             * Gets the value of the sndrrcvrpart property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSNDRRCVRPART() {
                return sndrrcvrpart;
            }

            /**
             * Sets the value of the sndrrcvrpart property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSNDRRCVRPART(BigDecimal value) {
                this.sndrrcvrpart = value;
            }

            /**
             * Gets the value of the ultbandcd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getULTBANDCD() {
                return ultbandcd;
            }

            /**
             * Sets the value of the ultbandcd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setULTBANDCD(String value) {
                this.ultbandcd = value;
            }

            /**
             * Gets the value of the addlinfo1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDLINFO1() {
                return addlinfo1;
            }

            /**
             * Sets the value of the addlinfo1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDLINFO1(String value) {
                this.addlinfo1 = value;
            }

            /**
             * Gets the value of the addlinfo2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDLINFO2() {
                return addlinfo2;
            }

            /**
             * Sets the value of the addlinfo2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDLINFO2(String value) {
                this.addlinfo2 = value;
            }

            /**
             * Gets the value of the addlinfo3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDLINFO3() {
                return addlinfo3;
            }

            /**
             * Sets the value of the addlinfo3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDLINFO3(String value) {
                this.addlinfo3 = value;
            }

            /**
             * Gets the value of the addlinfo4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDLINFO4() {
                return addlinfo4;
            }

            /**
             * Sets the value of the addlinfo4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDLINFO4(String value) {
                this.addlinfo4 = value;
            }

            /**
             * Gets the value of the nippayer property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNIPPAYER() {
                return nippayer;
            }

            /**
             * Sets the value of the nippayer property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNIPPAYER(BigDecimal value) {
                this.nippayer = value;
            }

            /**
             * Gets the value of the suppid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSUPPID() {
                return suppid;
            }

            /**
             * Sets the value of the suppid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSUPPID(String value) {
                this.suppid = value;
            }

            /**
             * Gets the value of the payerid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAYERID() {
                return payerid;
            }

            /**
             * Sets the value of the payerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAYERID(String value) {
                this.payerid = value;
            }

            /**
             * Gets the value of the pmnttyp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPMNTTYP() {
                return pmnttyp;
            }

            /**
             * Sets the value of the pmnttyp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPMNTTYP(String value) {
                this.pmnttyp = value;
            }

            /**
             * Gets the value of the noofdec property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNOOFDEC() {
                return noofdec;
            }

            /**
             * Sets the value of the noofdec property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNOOFDEC(BigDecimal value) {
                this.noofdec = value;
            }

            /**
             * Gets the value of the addid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getADDID() {
                return addid;
            }

            /**
             * Sets the value of the addid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setADDID(String value) {
                this.addid = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO1() {
                return sndrrcvrinfo1;
            }

            /**
             * Sets the value of the sndrrcvrinfo1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO1(String value) {
                this.sndrrcvrinfo1 = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO2() {
                return sndrrcvrinfo2;
            }

            /**
             * Sets the value of the sndrrcvrinfo2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO2(String value) {
                this.sndrrcvrinfo2 = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO3() {
                return sndrrcvrinfo3;
            }

            /**
             * Sets the value of the sndrrcvrinfo3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO3(String value) {
                this.sndrrcvrinfo3 = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO4() {
                return sndrrcvrinfo4;
            }

            /**
             * Sets the value of the sndrrcvrinfo4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO4(String value) {
                this.sndrrcvrinfo4 = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO5() {
                return sndrrcvrinfo5;
            }

            /**
             * Sets the value of the sndrrcvrinfo5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO5(String value) {
                this.sndrrcvrinfo5 = value;
            }

            /**
             * Gets the value of the sndrrcvrinfo6 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSNDRRCVRINFO6() {
                return sndrrcvrinfo6;
            }

            /**
             * Sets the value of the sndrrcvrinfo6 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSNDRRCVRINFO6(String value) {
                this.sndrrcvrinfo6 = value;
            }

            /**
             * Gets the value of the declartion property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDECLARTION() {
                return declartion;
            }

            /**
             * Sets the value of the declartion property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDECLARTION(BigDecimal value) {
                this.declartion = value;
            }

            /**
             * Gets the value of the repres1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREPRES1() {
                return repres1;
            }

            /**
             * Sets the value of the repres1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREPRES1(String value) {
                this.repres1 = value;
            }

            /**
             * Gets the value of the repres2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREPRES2() {
                return repres2;
            }

            /**
             * Sets the value of the repres2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREPRES2(String value) {
                this.repres2 = value;
            }

            /**
             * Gets the value of the repres3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREPRES3() {
                return repres3;
            }

            /**
             * Sets the value of the repres3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREPRES3(String value) {
                this.repres3 = value;
            }

            /**
             * Gets the value of the repres4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getREPRES4() {
                return repres4;
            }

            /**
             * Sets the value of the repres4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setREPRES4(String value) {
                this.repres4 = value;
            }

            /**
             * Gets the value of the rcvracc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRCVRACC() {
                return rcvracc;
            }

            /**
             * Sets the value of the rcvracc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRCVRACC(String value) {
                this.rcvracc = value;
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
         *         &lt;element name="INSTRCD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INSTRCD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INSTRCD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INSTRCD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ITIMEIND1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ITIMEIND2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ITIMEIND3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INSTRCD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CONTREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *         &lt;element name="COMPNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BANKOPERCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="INSTRCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TRNSTYPCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REGREP1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REGREP2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REGREP3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ENVCONT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ENVCONT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ENVCONT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ENVCONT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ENVCONT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "instrcd1",
            "instrcd2",
            "instrcd3",
            "instrcd4",
            "itimeind1",
            "itimeind2",
            "itimeind3",
            "instrcd5",
            "contrefno",
            "esn",
            "compnt",
            "bankopercd",
            "instrcd",
            "trnstypcd",
            "regrep1",
            "regrep2",
            "regrep3",
            "envcont1",
            "envcont2",
            "envcont3",
            "envcont4",
            "envcont5"
        })
        public static class SettlementDetail {

            @XmlElement(name = "INSTRCD1")
            protected String instrcd1;
            @XmlElement(name = "INSTRCD2")
            protected String instrcd2;
            @XmlElement(name = "INSTRCD3")
            protected String instrcd3;
            @XmlElement(name = "INSTRCD4")
            protected String instrcd4;
            @XmlElement(name = "ITIMEIND1")
            protected String itimeind1;
            @XmlElement(name = "ITIMEIND2")
            protected String itimeind2;
            @XmlElement(name = "ITIMEIND3")
            protected String itimeind3;
            @XmlElement(name = "INSTRCD5")
            protected String instrcd5;
            @XmlElement(name = "CONTREFNO")
            protected String contrefno;
            @XmlElement(name = "ESN")
            protected BigDecimal esn;
            @XmlElement(name = "COMPNT")
            protected String compnt;
            @XmlElement(name = "BANKOPERCD")
            protected String bankopercd;
            @XmlElement(name = "INSTRCD")
            protected String instrcd;
            @XmlElement(name = "TRNSTYPCD")
            protected String trnstypcd;
            @XmlElement(name = "REGREP1")
            protected String regrep1;
            @XmlElement(name = "REGREP2")
            protected String regrep2;
            @XmlElement(name = "REGREP3")
            protected String regrep3;
            @XmlElement(name = "ENVCONT1")
            protected String envcont1;
            @XmlElement(name = "ENVCONT2")
            protected String envcont2;
            @XmlElement(name = "ENVCONT3")
            protected String envcont3;
            @XmlElement(name = "ENVCONT4")
            protected String envcont4;
            @XmlElement(name = "ENVCONT5")
            protected String envcont5;

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
             * Gets the value of the itimeind1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getITIMEIND1() {
                return itimeind1;
            }

            /**
             * Sets the value of the itimeind1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setITIMEIND1(String value) {
                this.itimeind1 = value;
            }

            /**
             * Gets the value of the itimeind2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getITIMEIND2() {
                return itimeind2;
            }

            /**
             * Sets the value of the itimeind2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setITIMEIND2(String value) {
                this.itimeind2 = value;
            }

            /**
             * Gets the value of the itimeind3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getITIMEIND3() {
                return itimeind3;
            }

            /**
             * Sets the value of the itimeind3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setITIMEIND3(String value) {
                this.itimeind3 = value;
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
             * Gets the value of the compnt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMPNT() {
                return compnt;
            }

            /**
             * Sets the value of the compnt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMPNT(String value) {
                this.compnt = value;
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
             * Gets the value of the trnstypcd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTRNSTYPCD() {
                return trnstypcd;
            }

            /**
             * Sets the value of the trnstypcd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTRNSTYPCD(String value) {
                this.trnstypcd = value;
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
             * Gets the value of the envcont1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENVCONT1() {
                return envcont1;
            }

            /**
             * Sets the value of the envcont1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENVCONT1(String value) {
                this.envcont1 = value;
            }

            /**
             * Gets the value of the envcont2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENVCONT2() {
                return envcont2;
            }

            /**
             * Sets the value of the envcont2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENVCONT2(String value) {
                this.envcont2 = value;
            }

            /**
             * Gets the value of the envcont3 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENVCONT3() {
                return envcont3;
            }

            /**
             * Sets the value of the envcont3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENVCONT3(String value) {
                this.envcont3 = value;
            }

            /**
             * Gets the value of the envcont4 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENVCONT4() {
                return envcont4;
            }

            /**
             * Sets the value of the envcont4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENVCONT4(String value) {
                this.envcont4 = value;
            }

            /**
             * Gets the value of the envcont5 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getENVCONT5() {
                return envcont5;
            }

            /**
             * Sets the value of the envcont5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setENVCONT5(String value) {
                this.envcont5 = value;
            }

        }

    }

}
