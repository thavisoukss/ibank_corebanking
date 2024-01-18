
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
 * <p>Java class for TxnTax-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxnTax-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONREFNO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LATEVNSEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Tax" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SCHEME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Tax-Details" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BASISAMNTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="COMPUEVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="Rule-Details" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="COMPUTATIONDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                       &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="EFFECTIVEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                                       &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="BASISAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="BASISAMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
@XmlType(name = "TxnTax-Modify-IO-Type", propOrder = {
    "conrefno",
    "latevnseqno",
    "tax"
})
public class TxnTaxModifyIOType {

    @XmlElement(name = "CONREFNO", required = true)
    protected String conrefno;
    @XmlElement(name = "LATEVNSEQNO")
    protected BigDecimal latevnseqno;
    @XmlElement(name = "Tax")
    protected Tax tax;

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
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link Tax }
     *     
     */
    public Tax getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax }
     *     
     */
    public void setTax(Tax value) {
        this.tax = value;
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
     *         &lt;element name="SCHEME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Tax-Details" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BASISAMNTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="COMPUEVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="Rule-Details" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="COMPUTATIONDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="EFFECTIVEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                             &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="BASISAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="BASISAMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "scheme",
        "waiver",
        "taxDetails"
    })
    public static class Tax {

        @XmlElement(name = "SCHEME")
        protected String scheme;
        @XmlElement(name = "WAIVER")
        protected String waiver;
        @XmlElement(name = "Tax-Details", required = true)
        protected List<TaxDetails> taxDetails;

        /**
         * Gets the value of the scheme property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSCHEME() {
            return scheme;
        }

        /**
         * Sets the value of the scheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSCHEME(String value) {
            this.scheme = value;
        }

        /**
         * Gets the value of the waiver property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWAIVER() {
            return waiver;
        }

        /**
         * Sets the value of the waiver property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWAIVER(String value) {
            this.waiver = value;
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
         *         &lt;element name="BASISAMNTAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="COMPUEVNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="WAIVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="Rule-Details" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="COMPUTATIONDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="EFFECTIVEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *                   &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="BASISAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="BASISAMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "basisamntag",
            "compuevnt",
            "waiver",
            "esn",
            "ruleDetails"
        })
        public static class TaxDetails {

            @XmlElement(name = "BASISAMNTAG")
            protected String basisamntag;
            @XmlElement(name = "COMPUEVNT")
            protected String compuevnt;
            @XmlElement(name = "WAIVER")
            protected String waiver;
            @XmlElement(name = "ESN", required = true)
            protected BigDecimal esn;
            @XmlElement(name = "Rule-Details", required = true)
            protected List<RuleDetails> ruleDetails;

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
             * Gets the value of the compuevnt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOMPUEVNT() {
                return compuevnt;
            }

            /**
             * Sets the value of the compuevnt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOMPUEVNT(String value) {
                this.compuevnt = value;
            }

            /**
             * Gets the value of the waiver property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWAIVER() {
                return waiver;
            }

            /**
             * Sets the value of the waiver property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWAIVER(String value) {
                this.waiver = value;
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
             * Gets the value of the ruleDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a <CODE>set</CODE> method for the ruleDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRuleDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RuleDetails }
             * 
             * 
             */
            public List<RuleDetails> getRuleDetails() {
                if (ruleDetails == null) {
                    ruleDetails = new ArrayList<RuleDetails>();
                }
                return this.ruleDetails;
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
             *         &lt;element name="COMPUTATIONDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="ESN" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="EFFECTIVEDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
             *         &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="BASISAMT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="BASISAMTCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "computationdt",
                "ccy",
                "amt",
                "esn",
                "effectivedt",
                "stat",
                "basisamt",
                "basisamtccy"
            })
            public static class RuleDetails {

                @XmlElement(name = "COMPUTATIONDT")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar computationdt;
                @XmlElement(name = "CCY")
                protected String ccy;
                @XmlElement(name = "AMT")
                protected BigDecimal amt;
                @XmlElement(name = "ESN", required = true)
                protected BigDecimal esn;
                @XmlElement(name = "EFFECTIVEDT")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar effectivedt;
                @XmlElement(name = "STAT")
                protected String stat;
                @XmlElement(name = "BASISAMT")
                protected BigDecimal basisamt;
                @XmlElement(name = "BASISAMTCCY")
                protected String basisamtccy;

                /**
                 * Gets the value of the computationdt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCOMPUTATIONDT() {
                    return computationdt;
                }

                /**
                 * Sets the value of the computationdt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCOMPUTATIONDT(XMLGregorianCalendar value) {
                    this.computationdt = value;
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
                 * Gets the value of the effectivedt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEFFECTIVEDT() {
                    return effectivedt;
                }

                /**
                 * Sets the value of the effectivedt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setEFFECTIVEDT(XMLGregorianCalendar value) {
                    this.effectivedt = value;
                }

                /**
                 * Gets the value of the stat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSTAT() {
                    return stat;
                }

                /**
                 * Sets the value of the stat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSTAT(String value) {
                    this.stat = value;
                }

                /**
                 * Gets the value of the basisamt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getBASISAMT() {
                    return basisamt;
                }

                /**
                 * Sets the value of the basisamt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setBASISAMT(BigDecimal value) {
                    this.basisamt = value;
                }

                /**
                 * Gets the value of the basisamtccy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBASISAMTCCY() {
                    return basisamtccy;
                }

                /**
                 * Sets the value of the basisamtccy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBASISAMTCCY(String value) {
                    this.basisamtccy = value;
                }

            }

        }

    }

}
