
package com.internetbanking.soap.transfer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TxnAdvDtls-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxnAdvDtls-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LATEVNSEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="LATVERNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Advice-Details" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MSGTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SUPRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PRIORITY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="MEDIUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RECEIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TxnAdvDtls-Modify-IO-Type", propOrder = {
    "conrefno",
    "latevnseqno",
    "latverno",
    "adviceDetails"
})
public class TxnAdvDtlsModifyIOType {

    @XmlElement(name = "CONREFNO", required = true)
    protected String conrefno;
    @XmlElement(name = "LATEVNSEQNO")
    protected BigDecimal latevnseqno;
    @XmlElement(name = "LATVERNO")
    protected BigDecimal latverno;
    @XmlElement(name = "Advice-Details", required = true)
    protected List<AdviceDetails> adviceDetails;

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
     * Gets the value of the latverno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLATVERNO() {
        return latverno;
    }

    /**
     * Sets the value of the latverno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLATVERNO(BigDecimal value) {
        this.latverno = value;
    }

    /**
     * Gets the value of the adviceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the adviceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdviceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdviceDetails }
     * 
     * 
     */
    public List<AdviceDetails> getAdviceDetails() {
        if (adviceDetails == null) {
            adviceDetails = new ArrayList<AdviceDetails>();
        }
        return this.adviceDetails;
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
     *         &lt;element name="MSGTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SUPRS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PRIORITY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="MEDIUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RECEIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "msgtyp",
        "suprs",
        "priority",
        "medium",
        "receiver"
    })
    public static class AdviceDetails {

        @XmlElement(name = "MSGTYP")
        protected String msgtyp;
        @XmlElement(name = "SUPRS")
        protected String suprs;
        @XmlElement(name = "PRIORITY")
        protected BigDecimal priority;
        @XmlElement(name = "MEDIUM")
        protected String medium;
        @XmlElement(name = "RECEIVER")
        protected String receiver;

        /**
         * Gets the value of the msgtyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMSGTYP() {
            return msgtyp;
        }

        /**
         * Sets the value of the msgtyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMSGTYP(String value) {
            this.msgtyp = value;
        }

        /**
         * Gets the value of the suprs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUPRS() {
            return suprs;
        }

        /**
         * Sets the value of the suprs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUPRS(String value) {
            this.suprs = value;
        }

        /**
         * Gets the value of the priority property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPRIORITY() {
            return priority;
        }

        /**
         * Sets the value of the priority property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPRIORITY(BigDecimal value) {
            this.priority = value;
        }

        /**
         * Gets the value of the medium property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMEDIUM() {
            return medium;
        }

        /**
         * Sets the value of the medium property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMEDIUM(String value) {
            this.medium = value;
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

    }

}
