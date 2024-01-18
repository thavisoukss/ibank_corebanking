
package com.internetbanking.soap.transfer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchRestriction-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchRestriction-Modify-IO-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CCYLST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BRNLST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLASCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Branch-List" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BRNDISALOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ccy-List" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BGTDLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "BranchRestriction-Modify-IO-Type", propOrder = {
    "ccylst",
    "brnlst",
    "clascd",
    "branchList",
    "ccyList"
})
public class BranchRestrictionModifyIOType {

    @XmlElement(name = "CCYLST")
    protected String ccylst;
    @XmlElement(name = "BRNLST")
    protected String brnlst;
    @XmlElement(name = "CLASCD")
    protected String clascd;
    @XmlElement(name = "Branch-List", required = true)
    protected List<BranchList> branchList;
    @XmlElement(name = "Ccy-List", required = true)
    protected List<CcyList> ccyList;

    /**
     * Gets the value of the ccylst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCYLST() {
        return ccylst;
    }

    /**
     * Sets the value of the ccylst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCYLST(String value) {
        this.ccylst = value;
    }

    /**
     * Gets the value of the brnlst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRNLST() {
        return brnlst;
    }

    /**
     * Sets the value of the brnlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRNLST(String value) {
        this.brnlst = value;
    }

    /**
     * Gets the value of the clascd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASCD() {
        return clascd;
    }

    /**
     * Sets the value of the clascd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASCD(String value) {
        this.clascd = value;
    }

    /**
     * Gets the value of the branchList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the branchList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchList }
     * 
     * 
     */
    public List<BranchList> getBranchList() {
        if (branchList == null) {
            branchList = new ArrayList<BranchList>();
        }
        return this.branchList;
    }

    /**
     * Gets the value of the ccyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ccyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CcyList }
     * 
     * 
     */
    public List<CcyList> getCcyList() {
        if (ccyList == null) {
            ccyList = new ArrayList<CcyList>();
        }
        return this.ccyList;
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
     *         &lt;element name="BRNDISALOW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "brndisalow"
    })
    public static class BranchList {

        @XmlElement(name = "BRNDISALOW")
        protected String brndisalow;

        /**
         * Gets the value of the brndisalow property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBRNDISALOW() {
            return brndisalow;
        }

        /**
         * Sets the value of the brndisalow property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBRNDISALOW(String value) {
            this.brndisalow = value;
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
     *         &lt;element name="BGTDLCCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "bgtdlccy"
    })
    public static class CcyList {

        @XmlElement(name = "BGTDLCCY")
        protected String bgtdlccy;

        /**
         * Gets the value of the bgtdlccy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBGTDLCCY() {
            return bgtdlccy;
        }

        /**
         * Sets the value of the bgtdlccy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBGTDLCCY(String value) {
            this.bgtdlccy = value;
        }

    }

}
