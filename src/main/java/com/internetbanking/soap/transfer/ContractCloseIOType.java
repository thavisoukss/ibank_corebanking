
package com.internetbanking.soap.transfer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contract-Close-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract-Close-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONTREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Taxes" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnTax-Close-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="TXNUDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSFTService}TXNUDFDETAILSType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Misdetails" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnMIS-Close-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Extsys-Ws-Master" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnExtsysDtls-Close-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Settlements" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnSetlDtls-Close-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Advices" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnAdvDtls-Close-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Prjdet" type="{http://fcubs.ofss.com/service/FCUBSFTService}Ftcprjft-Close-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Charges" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnOldChg-Close-IO-Type" minOccurs="0"/&gt;
 *         &lt;element name="Chgclmdet" type="{http://fcubs.ofss.com/service/FCUBSFTService}TxnChgClm-Close-IO-Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract-Close-IO-Type", propOrder = {
    "contrefno",
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
public class ContractCloseIOType {

    @XmlElement(name = "CONTREFNO", required = true)
    protected String contrefno;
    @XmlElement(name = "Taxes")
    protected TxnTaxCloseIOType taxes;
    @XmlElement(name = "TXNUDFDETAILS")
    protected List<TXNUDFDETAILSType> txnudfdetails;
    @XmlElement(name = "Misdetails")
    protected TxnMISCloseIOType misdetails;
    @XmlElement(name = "Extsys-Ws-Master")
    protected TxnExtsysDtlsCloseIOType extsysWsMaster;
    @XmlElement(name = "Settlements")
    protected TxnSetlDtlsCloseIOType settlements;
    @XmlElement(name = "Advices")
    protected TxnAdvDtlsCloseIOType advices;
    @XmlElement(name = "Prjdet")
    protected FtcprjftCloseIOType prjdet;
    @XmlElement(name = "Charges")
    protected TxnOldChgCloseIOType charges;
    @XmlElement(name = "Chgclmdet")
    protected TxnChgClmCloseIOType chgclmdet;

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
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TxnTaxCloseIOType }
     *     
     */
    public TxnTaxCloseIOType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnTaxCloseIOType }
     *     
     */
    public void setTaxes(TxnTaxCloseIOType value) {
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
     *     {@link TxnMISCloseIOType }
     *     
     */
    public TxnMISCloseIOType getMisdetails() {
        return misdetails;
    }

    /**
     * Sets the value of the misdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnMISCloseIOType }
     *     
     */
    public void setMisdetails(TxnMISCloseIOType value) {
        this.misdetails = value;
    }

    /**
     * Gets the value of the extsysWsMaster property.
     * 
     * @return
     *     possible object is
     *     {@link TxnExtsysDtlsCloseIOType }
     *     
     */
    public TxnExtsysDtlsCloseIOType getExtsysWsMaster() {
        return extsysWsMaster;
    }

    /**
     * Sets the value of the extsysWsMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnExtsysDtlsCloseIOType }
     *     
     */
    public void setExtsysWsMaster(TxnExtsysDtlsCloseIOType value) {
        this.extsysWsMaster = value;
    }

    /**
     * Gets the value of the settlements property.
     * 
     * @return
     *     possible object is
     *     {@link TxnSetlDtlsCloseIOType }
     *     
     */
    public TxnSetlDtlsCloseIOType getSettlements() {
        return settlements;
    }

    /**
     * Sets the value of the settlements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnSetlDtlsCloseIOType }
     *     
     */
    public void setSettlements(TxnSetlDtlsCloseIOType value) {
        this.settlements = value;
    }

    /**
     * Gets the value of the advices property.
     * 
     * @return
     *     possible object is
     *     {@link TxnAdvDtlsCloseIOType }
     *     
     */
    public TxnAdvDtlsCloseIOType getAdvices() {
        return advices;
    }

    /**
     * Sets the value of the advices property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnAdvDtlsCloseIOType }
     *     
     */
    public void setAdvices(TxnAdvDtlsCloseIOType value) {
        this.advices = value;
    }

    /**
     * Gets the value of the prjdet property.
     * 
     * @return
     *     possible object is
     *     {@link FtcprjftCloseIOType }
     *     
     */
    public FtcprjftCloseIOType getPrjdet() {
        return prjdet;
    }

    /**
     * Sets the value of the prjdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FtcprjftCloseIOType }
     *     
     */
    public void setPrjdet(FtcprjftCloseIOType value) {
        this.prjdet = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link TxnOldChgCloseIOType }
     *     
     */
    public TxnOldChgCloseIOType getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnOldChgCloseIOType }
     *     
     */
    public void setCharges(TxnOldChgCloseIOType value) {
        this.charges = value;
    }

    /**
     * Gets the value of the chgclmdet property.
     * 
     * @return
     *     possible object is
     *     {@link TxnChgClmCloseIOType }
     *     
     */
    public TxnChgClmCloseIOType getChgclmdet() {
        return chgclmdet;
    }

    /**
     * Sets the value of the chgclmdet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnChgClmCloseIOType }
     *     
     */
    public void setChgclmdet(TxnChgClmCloseIOType value) {
        this.chgclmdet = value;
    }

}
