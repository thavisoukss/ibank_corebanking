
package com.internetbanking.soap.transfer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleToHeadMapping-Full-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleToHeadMapping-Full-Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CLASCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CLASDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mapping-Details" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ACCTRL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ROLDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ACCTHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GLDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RoleToHeadMapping-Full-Type", propOrder = {
    "clascd",
    "clasdesc",
    "mappingDetails"
})
public class RoleToHeadMappingFullType {

    @XmlElement(name = "CLASCD")
    protected String clascd;
    @XmlElement(name = "CLASDESC")
    protected String clasdesc;
    @XmlElement(name = "Mapping-Details")
    protected List<MappingDetails> mappingDetails;

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
     * Gets the value of the clasdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASDESC() {
        return clasdesc;
    }

    /**
     * Sets the value of the clasdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASDESC(String value) {
        this.clasdesc = value;
    }

    /**
     * Gets the value of the mappingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mappingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMappingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MappingDetails }
     * 
     * 
     */
    public List<MappingDetails> getMappingDetails() {
        if (mappingDetails == null) {
            mappingDetails = new ArrayList<MappingDetails>();
        }
        return this.mappingDetails;
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
     *         &lt;element name="ACCTRL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ROLDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ACCTHD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GLDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "acctrl",
        "roldesc",
        "accthd",
        "gldesc"
    })
    public static class MappingDetails {

        @XmlElement(name = "ACCTRL")
        protected String acctrl;
        @XmlElement(name = "ROLDESC")
        protected String roldesc;
        @XmlElement(name = "ACCTHD")
        protected String accthd;
        @XmlElement(name = "GLDESC")
        protected String gldesc;

        /**
         * Gets the value of the acctrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCTRL() {
            return acctrl;
        }

        /**
         * Sets the value of the acctrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCTRL(String value) {
            this.acctrl = value;
        }

        /**
         * Gets the value of the roldesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROLDESC() {
            return roldesc;
        }

        /**
         * Sets the value of the roldesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROLDESC(String value) {
            this.roldesc = value;
        }

        /**
         * Gets the value of the accthd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACCTHD() {
            return accthd;
        }

        /**
         * Sets the value of the accthd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACCTHD(String value) {
            this.accthd = value;
        }

        /**
         * Gets the value of the gldesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGLDESC() {
            return gldesc;
        }

        /**
         * Sets the value of the gldesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGLDESC(String value) {
            this.gldesc = value;
        }

    }

}
