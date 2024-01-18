
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
 * <p>Java class for MultiJrnlAuth-Query-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiJrnlAuth-Query-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Csvw-Contract-Ovd--Auth" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OVD_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="CONFIRMED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTHBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTHDTSTAMP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="OVDREMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OVDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ERRCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "MultiJrnlAuth-Query-IO-Type", propOrder = {
    "referenceno",
    "csvwContractOvdAuth"
})
public class MultiJrnlAuthQueryIOType {

    @XmlElement(name = "REFERENCE_NO")
    protected String referenceno;
    @XmlElement(name = "Csvw-Contract-Ovd--Auth")
    protected List<CsvwContractOvdAuth> csvwContractOvdAuth;

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
     * Gets the value of the csvwContractOvdAuth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the csvwContractOvdAuth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsvwContractOvdAuth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CsvwContractOvdAuth }
     * 
     * 
     */
    public List<CsvwContractOvdAuth> getCsvwContractOvdAuth() {
        if (csvwContractOvdAuth == null) {
            csvwContractOvdAuth = new ArrayList<CsvwContractOvdAuth>();
        }
        return this.csvwContractOvdAuth;
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
     *         &lt;element name="OVD_SEQ_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="CONFIRMED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AUTHBY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AUTHDTSTAMP" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="OVDREMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OVDSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ERRCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "ovdseqno",
        "confirmed",
        "authby",
        "authdtstamp",
        "ovdremarks",
        "remarks",
        "ovdstatus",
        "errcode",
        "status"
    })
    public static class CsvwContractOvdAuth {

        @XmlElement(name = "OVD_SEQ_NO")
        protected BigDecimal ovdseqno;
        @XmlElement(name = "CONFIRMED")
        protected String confirmed;
        @XmlElement(name = "AUTHBY")
        protected String authby;
        @XmlElement(name = "AUTHDTSTAMP")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar authdtstamp;
        @XmlElement(name = "OVDREMARKS")
        protected String ovdremarks;
        @XmlElement(name = "REMARKS")
        protected String remarks;
        @XmlElement(name = "OVDSTATUS")
        protected String ovdstatus;
        @XmlElement(name = "ERRCODE")
        protected String errcode;
        @XmlElement(name = "STATUS")
        protected String status;

        /**
         * Gets the value of the ovdseqno property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOVDSEQNO() {
            return ovdseqno;
        }

        /**
         * Sets the value of the ovdseqno property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOVDSEQNO(BigDecimal value) {
            this.ovdseqno = value;
        }

        /**
         * Gets the value of the confirmed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONFIRMED() {
            return confirmed;
        }

        /**
         * Sets the value of the confirmed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONFIRMED(String value) {
            this.confirmed = value;
        }

        /**
         * Gets the value of the authby property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTHBY() {
            return authby;
        }

        /**
         * Sets the value of the authby property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTHBY(String value) {
            this.authby = value;
        }

        /**
         * Gets the value of the authdtstamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAUTHDTSTAMP() {
            return authdtstamp;
        }

        /**
         * Sets the value of the authdtstamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAUTHDTSTAMP(XMLGregorianCalendar value) {
            this.authdtstamp = value;
        }

        /**
         * Gets the value of the ovdremarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOVDREMARKS() {
            return ovdremarks;
        }

        /**
         * Sets the value of the ovdremarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOVDREMARKS(String value) {
            this.ovdremarks = value;
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
         * Gets the value of the ovdstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOVDSTATUS() {
            return ovdstatus;
        }

        /**
         * Sets the value of the ovdstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOVDSTATUS(String value) {
            this.ovdstatus = value;
        }

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

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATUS() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATUS(String value) {
            this.status = value;
        }

    }

}
