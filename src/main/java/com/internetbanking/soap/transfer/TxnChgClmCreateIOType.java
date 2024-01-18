
package com.internetbanking.soap.transfer;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TxnChgClm-Create-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxnChgClm-Create-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CONREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LATEVNSEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Chgclaim-Details" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ORDINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AWI1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AWI2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AWI3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AWI4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AWI5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SENDRRECV1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SENDRRECV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SENDRRECV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SENDRRECV4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SENDRRECV5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHGREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHGCCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="CHGDET1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHGDET2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHGDET3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHGDET4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHGDET5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CHGDET6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TxnChgClm-Create-IO-Type", propOrder = {
    "conrefno",
    "latevnseqno",
    "chgclaimDetails"
})
public class TxnChgClmCreateIOType {

    @XmlElement(name = "CONREFNO")
    protected String conrefno;
    @XmlElement(name = "LATEVNSEQNO")
    protected BigDecimal latevnseqno;
    @XmlElement(name = "Chgclaim-Details")
    protected ChgclaimDetails chgclaimDetails;

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
     * Gets the value of the chgclaimDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ChgclaimDetails }
     *     
     */
    public ChgclaimDetails getChgclaimDetails() {
        return chgclaimDetails;
    }

    /**
     * Sets the value of the chgclaimDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgclaimDetails }
     *     
     */
    public void setChgclaimDetails(ChgclaimDetails value) {
        this.chgclaimDetails = value;
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
     *         &lt;element name="ORDINST2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AWI1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AWI2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AWI3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AWI4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AWI5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SENDRRECV1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SENDRRECV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SENDRRECV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SENDRRECV4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SENDRRECV5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHGREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHGCCY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CHGAMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="CHGDET1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHGDET2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHGDET3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHGDET4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHGDET5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CHGDET6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDINST1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "ordinst2",
        "ordinst3",
        "ordinst4",
        "ordinst5",
        "awi1",
        "awi2",
        "awi3",
        "awi4",
        "awi5",
        "sendrrecv1",
        "sendrrecv2",
        "sendrrecv3",
        "sendrrecv4",
        "sendrrecv5",
        "chgrefno",
        "chgccy",
        "chgamt",
        "chgdet1",
        "chgdet2",
        "chgdet3",
        "chgdet4",
        "chgdet5",
        "chgdet6",
        "ordinst1"
    })
    public static class ChgclaimDetails {

        @XmlElement(name = "ORDINST2")
        protected String ordinst2;
        @XmlElement(name = "ORDINST3")
        protected String ordinst3;
        @XmlElement(name = "ORDINST4")
        protected String ordinst4;
        @XmlElement(name = "ORDINST5")
        protected String ordinst5;
        @XmlElement(name = "AWI1")
        protected String awi1;
        @XmlElement(name = "AWI2")
        protected String awi2;
        @XmlElement(name = "AWI3")
        protected String awi3;
        @XmlElement(name = "AWI4")
        protected String awi4;
        @XmlElement(name = "AWI5")
        protected String awi5;
        @XmlElement(name = "SENDRRECV1")
        protected String sendrrecv1;
        @XmlElement(name = "SENDRRECV2")
        protected String sendrrecv2;
        @XmlElement(name = "SENDRRECV3")
        protected String sendrrecv3;
        @XmlElement(name = "SENDRRECV4")
        protected String sendrrecv4;
        @XmlElement(name = "SENDRRECV5")
        protected String sendrrecv5;
        @XmlElement(name = "CHGREFNO")
        protected String chgrefno;
        @XmlElement(name = "CHGCCY", required = true)
        protected String chgccy;
        @XmlElement(name = "CHGAMT", required = true)
        protected BigDecimal chgamt;
        @XmlElement(name = "CHGDET1")
        protected String chgdet1;
        @XmlElement(name = "CHGDET2")
        protected String chgdet2;
        @XmlElement(name = "CHGDET3")
        protected String chgdet3;
        @XmlElement(name = "CHGDET4")
        protected String chgdet4;
        @XmlElement(name = "CHGDET5")
        protected String chgdet5;
        @XmlElement(name = "CHGDET6")
        protected String chgdet6;
        @XmlElement(name = "ORDINST1")
        protected String ordinst1;

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
         * Gets the value of the awi1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAWI1() {
            return awi1;
        }

        /**
         * Sets the value of the awi1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAWI1(String value) {
            this.awi1 = value;
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
         * Gets the value of the sendrrecv1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSENDRRECV1() {
            return sendrrecv1;
        }

        /**
         * Sets the value of the sendrrecv1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSENDRRECV1(String value) {
            this.sendrrecv1 = value;
        }

        /**
         * Gets the value of the sendrrecv2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSENDRRECV2() {
            return sendrrecv2;
        }

        /**
         * Sets the value of the sendrrecv2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSENDRRECV2(String value) {
            this.sendrrecv2 = value;
        }

        /**
         * Gets the value of the sendrrecv3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSENDRRECV3() {
            return sendrrecv3;
        }

        /**
         * Sets the value of the sendrrecv3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSENDRRECV3(String value) {
            this.sendrrecv3 = value;
        }

        /**
         * Gets the value of the sendrrecv4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSENDRRECV4() {
            return sendrrecv4;
        }

        /**
         * Sets the value of the sendrrecv4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSENDRRECV4(String value) {
            this.sendrrecv4 = value;
        }

        /**
         * Gets the value of the sendrrecv5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSENDRRECV5() {
            return sendrrecv5;
        }

        /**
         * Sets the value of the sendrrecv5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSENDRRECV5(String value) {
            this.sendrrecv5 = value;
        }

        /**
         * Gets the value of the chgrefno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGREFNO() {
            return chgrefno;
        }

        /**
         * Sets the value of the chgrefno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGREFNO(String value) {
            this.chgrefno = value;
        }

        /**
         * Gets the value of the chgccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGCCY() {
            return chgccy;
        }

        /**
         * Sets the value of the chgccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGCCY(String value) {
            this.chgccy = value;
        }

        /**
         * Gets the value of the chgamt property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCHGAMT() {
            return chgamt;
        }

        /**
         * Sets the value of the chgamt property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCHGAMT(BigDecimal value) {
            this.chgamt = value;
        }

        /**
         * Gets the value of the chgdet1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGDET1() {
            return chgdet1;
        }

        /**
         * Sets the value of the chgdet1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGDET1(String value) {
            this.chgdet1 = value;
        }

        /**
         * Gets the value of the chgdet2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGDET2() {
            return chgdet2;
        }

        /**
         * Sets the value of the chgdet2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGDET2(String value) {
            this.chgdet2 = value;
        }

        /**
         * Gets the value of the chgdet3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGDET3() {
            return chgdet3;
        }

        /**
         * Sets the value of the chgdet3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGDET3(String value) {
            this.chgdet3 = value;
        }

        /**
         * Gets the value of the chgdet4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGDET4() {
            return chgdet4;
        }

        /**
         * Sets the value of the chgdet4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGDET4(String value) {
            this.chgdet4 = value;
        }

        /**
         * Gets the value of the chgdet5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGDET5() {
            return chgdet5;
        }

        /**
         * Sets the value of the chgdet5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGDET5(String value) {
            this.chgdet5 = value;
        }

        /**
         * Gets the value of the chgdet6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHGDET6() {
            return chgdet6;
        }

        /**
         * Sets the value of the chgdet6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHGDET6(String value) {
            this.chgdet6 = value;
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

    }

}
