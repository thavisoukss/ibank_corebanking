
package com.internetbanking.soap.transfer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product-SummaryQuery-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product-SummaryQuery-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FETCH_PAGE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="FETCH_SIZE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXNSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRDGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRDSTATDT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LOWER_BOUND" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="UPPER_BOUND" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="EQUALS" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRDENDDT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LOWER_BOUND" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="UPPER_BOUND" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="EQUALS" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRODESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Query-Order-By" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ORDER_BY_FIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ORDER_BY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Query-Result" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TOTAL_RECORDS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="TOTAL_PAGES" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="CURRENT_PAGE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;element name="Record-Details" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RECORD_NO" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                             &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TXNSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRDGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PRDSTATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="PRDENDDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="PRODESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Product-SummaryQuery-Full-Type", propOrder = {
    "fetchpage",
    "fetchsize",
    "authstat",
    "txnstat",
    "prdcd",
    "prdgrp",
    "prdtyp",
    "prdstatdt",
    "prdenddt",
    "prodesc",
    "queryOrderBy",
    "queryResult"
})
public class ProductSummaryQueryFullType {

    @XmlElement(name = "FETCH_PAGE")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fetchpage;
    @XmlElement(name = "FETCH_SIZE")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fetchsize;
    @XmlElement(name = "AUTHSTAT")
    protected String authstat;
    @XmlElement(name = "TXNSTAT")
    protected String txnstat;
    @XmlElement(name = "PRDCD")
    protected String prdcd;
    @XmlElement(name = "PRDGRP")
    protected String prdgrp;
    @XmlElement(name = "PRDTYP")
    protected String prdtyp;
    @XmlElement(name = "PRDSTATDT")
    protected PRDSTATDT prdstatdt;
    @XmlElement(name = "PRDENDDT")
    protected PRDENDDT prdenddt;
    @XmlElement(name = "PRODESC")
    protected String prodesc;
    @XmlElement(name = "Query-Order-By")
    protected List<QueryOrderBy> queryOrderBy;
    @XmlElement(name = "Query-Result")
    protected QueryResult queryResult;

    /**
     * Gets the value of the fetchpage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFETCHPAGE() {
        return fetchpage;
    }

    /**
     * Sets the value of the fetchpage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFETCHPAGE(BigInteger value) {
        this.fetchpage = value;
    }

    /**
     * Gets the value of the fetchsize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFETCHSIZE() {
        return fetchsize;
    }

    /**
     * Sets the value of the fetchsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFETCHSIZE(BigInteger value) {
        this.fetchsize = value;
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
     * Gets the value of the prdstatdt property.
     * 
     * @return
     *     possible object is
     *     {@link PRDSTATDT }
     *     
     */
    public PRDSTATDT getPRDSTATDT() {
        return prdstatdt;
    }

    /**
     * Sets the value of the prdstatdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRDSTATDT }
     *     
     */
    public void setPRDSTATDT(PRDSTATDT value) {
        this.prdstatdt = value;
    }

    /**
     * Gets the value of the prdenddt property.
     * 
     * @return
     *     possible object is
     *     {@link PRDENDDT }
     *     
     */
    public PRDENDDT getPRDENDDT() {
        return prdenddt;
    }

    /**
     * Sets the value of the prdenddt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRDENDDT }
     *     
     */
    public void setPRDENDDT(PRDENDDT value) {
        this.prdenddt = value;
    }

    /**
     * Gets the value of the prodesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODESC() {
        return prodesc;
    }

    /**
     * Sets the value of the prodesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODESC(String value) {
        this.prodesc = value;
    }

    /**
     * Gets the value of the queryOrderBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the queryOrderBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryOrderBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryOrderBy }
     * 
     * 
     */
    public List<QueryOrderBy> getQueryOrderBy() {
        if (queryOrderBy == null) {
            queryOrderBy = new ArrayList<QueryOrderBy>();
        }
        return this.queryOrderBy;
    }

    /**
     * Gets the value of the queryResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResult }
     *     
     */
    public QueryResult getQueryResult() {
        return queryResult;
    }

    /**
     * Sets the value of the queryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResult }
     *     
     */
    public void setQueryResult(QueryResult value) {
        this.queryResult = value;
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
     *         &lt;element name="LOWER_BOUND" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="UPPER_BOUND" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="EQUALS" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
        "lowerbound",
        "upperbound",
        "equals"
    })
    public static class PRDENDDT {

        @XmlElement(name = "LOWER_BOUND")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar lowerbound;
        @XmlElement(name = "UPPER_BOUND")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar upperbound;
        @XmlElement(name = "EQUALS")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar equals;

        /**
         * Gets the value of the lowerbound property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLOWERBOUND() {
            return lowerbound;
        }

        /**
         * Sets the value of the lowerbound property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLOWERBOUND(XMLGregorianCalendar value) {
            this.lowerbound = value;
        }

        /**
         * Gets the value of the upperbound property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getUPPERBOUND() {
            return upperbound;
        }

        /**
         * Sets the value of the upperbound property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setUPPERBOUND(XMLGregorianCalendar value) {
            this.upperbound = value;
        }

        /**
         * Gets the value of the equals property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEQUALS() {
            return equals;
        }

        /**
         * Sets the value of the equals property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEQUALS(XMLGregorianCalendar value) {
            this.equals = value;
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
     *         &lt;element name="LOWER_BOUND" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="UPPER_BOUND" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="EQUALS" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
        "lowerbound",
        "upperbound",
        "equals"
    })
    public static class PRDSTATDT {

        @XmlElement(name = "LOWER_BOUND")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar lowerbound;
        @XmlElement(name = "UPPER_BOUND")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar upperbound;
        @XmlElement(name = "EQUALS")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar equals;

        /**
         * Gets the value of the lowerbound property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLOWERBOUND() {
            return lowerbound;
        }

        /**
         * Sets the value of the lowerbound property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLOWERBOUND(XMLGregorianCalendar value) {
            this.lowerbound = value;
        }

        /**
         * Gets the value of the upperbound property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getUPPERBOUND() {
            return upperbound;
        }

        /**
         * Sets the value of the upperbound property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setUPPERBOUND(XMLGregorianCalendar value) {
            this.upperbound = value;
        }

        /**
         * Gets the value of the equals property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEQUALS() {
            return equals;
        }

        /**
         * Sets the value of the equals property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEQUALS(XMLGregorianCalendar value) {
            this.equals = value;
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
     *         &lt;element name="ORDER_BY_FIELD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ORDER_BY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "orderbyfield",
        "orderbytype"
    })
    public static class QueryOrderBy {

        @XmlElement(name = "ORDER_BY_FIELD")
        protected String orderbyfield;
        @XmlElement(name = "ORDER_BY_TYPE")
        protected String orderbytype;

        /**
         * Gets the value of the orderbyfield property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDERBYFIELD() {
            return orderbyfield;
        }

        /**
         * Sets the value of the orderbyfield property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDERBYFIELD(String value) {
            this.orderbyfield = value;
        }

        /**
         * Gets the value of the orderbytype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORDERBYTYPE() {
            return orderbytype;
        }

        /**
         * Sets the value of the orderbytype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORDERBYTYPE(String value) {
            this.orderbytype = value;
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
     *         &lt;element name="TOTAL_RECORDS" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="TOTAL_PAGES" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="CURRENT_PAGE" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;element name="Record-Details" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RECORD_NO" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *                   &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TXNSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRDGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PRDSTATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="PRDENDDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="PRODESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "totalrecords",
        "totalpages",
        "currentpage",
        "recordDetails"
    })
    public static class QueryResult {

        @XmlElement(name = "TOTAL_RECORDS")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger totalrecords;
        @XmlElement(name = "TOTAL_PAGES")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger totalpages;
        @XmlElement(name = "CURRENT_PAGE")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger currentpage;
        @XmlElement(name = "Record-Details")
        protected List<RecordDetails> recordDetails;

        /**
         * Gets the value of the totalrecords property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTOTALRECORDS() {
            return totalrecords;
        }

        /**
         * Sets the value of the totalrecords property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTOTALRECORDS(BigInteger value) {
            this.totalrecords = value;
        }

        /**
         * Gets the value of the totalpages property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTOTALPAGES() {
            return totalpages;
        }

        /**
         * Sets the value of the totalpages property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTOTALPAGES(BigInteger value) {
            this.totalpages = value;
        }

        /**
         * Gets the value of the currentpage property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCURRENTPAGE() {
            return currentpage;
        }

        /**
         * Sets the value of the currentpage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCURRENTPAGE(BigInteger value) {
            this.currentpage = value;
        }

        /**
         * Gets the value of the recordDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the recordDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecordDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RecordDetails }
         * 
         * 
         */
        public List<RecordDetails> getRecordDetails() {
            if (recordDetails == null) {
                recordDetails = new ArrayList<RecordDetails>();
            }
            return this.recordDetails;
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
         *         &lt;element name="RECORD_NO" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
         *         &lt;element name="AUTHSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TXNSTAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRDCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRDGRP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRDTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PRDSTATDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="PRDENDDT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="PRODESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "recordno",
            "authstat",
            "txnstat",
            "prdcd",
            "prdgrp",
            "prdtyp",
            "prdstatdt",
            "prdenddt",
            "prodesc"
        })
        public static class RecordDetails {

            @XmlElement(name = "RECORD_NO")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger recordno;
            @XmlElement(name = "AUTHSTAT")
            protected String authstat;
            @XmlElement(name = "TXNSTAT")
            protected String txnstat;
            @XmlElement(name = "PRDCD")
            protected String prdcd;
            @XmlElement(name = "PRDGRP")
            protected String prdgrp;
            @XmlElement(name = "PRDTYP")
            protected String prdtyp;
            @XmlElement(name = "PRDSTATDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar prdstatdt;
            @XmlElement(name = "PRDENDDT")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar prdenddt;
            @XmlElement(name = "PRODESC")
            protected String prodesc;

            /**
             * Gets the value of the recordno property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRECORDNO() {
                return recordno;
            }

            /**
             * Sets the value of the recordno property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRECORDNO(BigInteger value) {
                this.recordno = value;
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
             * Gets the value of the prdstatdt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPRDSTATDT() {
                return prdstatdt;
            }

            /**
             * Sets the value of the prdstatdt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPRDSTATDT(XMLGregorianCalendar value) {
                this.prdstatdt = value;
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
             * Gets the value of the prodesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRODESC() {
                return prodesc;
            }

            /**
             * Sets the value of the prodesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRODESC(String value) {
                this.prodesc = value;
            }

        }

    }

}
