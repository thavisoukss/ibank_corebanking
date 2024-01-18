
package com.internetbanking.soap.transfer;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ftcprjft-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ftcprjft-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRJNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UNITPAYMNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UNITID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEPTFRNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONREFNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LATEVNSEQNO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ftcprjft-Full-Type", propOrder = {
    "prjname",
    "unitpaymnt",
    "unitid",
    "deptfrno",
    "conrefno",
    "latevnseqno"
})
public class FtcprjftFullType {

    @XmlElement(name = "PRJNAME")
    protected String prjname;
    @XmlElement(name = "UNITPAYMNT")
    protected String unitpaymnt;
    @XmlElement(name = "UNITID")
    protected String unitid;
    @XmlElement(name = "DEPTFRNO")
    protected String deptfrno;
    @XmlElement(name = "CONREFNO")
    protected String conrefno;
    @XmlElement(name = "LATEVNSEQNO")
    protected BigDecimal latevnseqno;

    /**
     * Gets the value of the prjname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRJNAME() {
        return prjname;
    }

    /**
     * Sets the value of the prjname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRJNAME(String value) {
        this.prjname = value;
    }

    /**
     * Gets the value of the unitpaymnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITPAYMNT() {
        return unitpaymnt;
    }

    /**
     * Sets the value of the unitpaymnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITPAYMNT(String value) {
        this.unitpaymnt = value;
    }

    /**
     * Gets the value of the unitid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITID() {
        return unitid;
    }

    /**
     * Sets the value of the unitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITID(String value) {
        this.unitid = value;
    }

    /**
     * Gets the value of the deptfrno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTFRNO() {
        return deptfrno;
    }

    /**
     * Sets the value of the deptfrno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPTFRNO(String value) {
        this.deptfrno = value;
    }

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

}
