
package com.internetbanking.soap.newmodel;

import java.util.ArrayList;
import java.util.List;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FCUBS_HEADERType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FCUBS_HEADERType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UBSCOMP" type="{http://fcubs.ofss.com/service/FCUBSACService}UBSCOMPType"/&gt;
 *         &lt;element name="MSGID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CORRELID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ENTITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MODULEID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SERVICE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPERATION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SOURCE_OPERATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOURCE_USERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESTINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MULTITRIPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FUNCTIONID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MSGSTAT" type="{http://fcubs.ofss.com/service/FCUBSACService}MsgStatType" minOccurs="0"/&gt;
 *         &lt;element name="SNAPSHOTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADDL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PARAM" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "FCUBS_HEADERType", propOrder = {
    "source",
    "ubscomp",
    "msgid",
    "correlid",
    "userid",
    "entity",
    "branch",
    "moduleid",
    "service",
    "operation",
    "sourceoperation",
    "sourceuserid",
    "destination",
    "multitripid",
    "functionid",
    "action",
    "msgstat",
    "snapshotid",
    "password",
    "addl"
})
public class FCUBSHEADERType  {

    @XmlElement(name = "SOURCE", required = true)
    protected String source;
    @XmlElement(name = "UBSCOMP", required = true)
    @XmlSchemaType(name = "string")
    protected UBSCOMPType ubscomp;
    @XmlElement(name = "MSGID")
    protected String msgid;
    @XmlElement(name = "CORRELID")
    protected String correlid;
    @XmlElement(name = "USERID", required = true)
    protected String userid;
    @XmlElement(name = "ENTITY")
    protected String entity;
    @XmlElement(name = "BRANCH", required = true)
    protected String branch;
    @XmlElement(name = "MODULEID")
    protected String moduleid;
    @XmlElement(name = "SERVICE", required = true)
    protected String service;
    @XmlElement(name = "OPERATION", required = true)
    protected String operation;
    @XmlElement(name = "SOURCE_OPERATION")
    protected String sourceoperation;
    @XmlElement(name = "SOURCE_USERID")
    protected String sourceuserid;
    @XmlElement(name = "DESTINATION")
    protected String destination;
    @XmlElement(name = "MULTITRIPID")
    protected String multitripid;
    @XmlElement(name = "FUNCTIONID")
    protected String functionid;
    @XmlElement(name = "ACTION")
    protected String action;
    @XmlElement(name = "MSGSTAT")
    @XmlSchemaType(name = "string")
    protected MsgStatType msgstat;
    @XmlElement(name = "SNAPSHOTID")
    protected String snapshotid;
    @XmlElement(name = "PASSWORD")
    protected String password;
    @XmlElement(name = "ADDL")
    protected ADDL addl;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the ubscomp property.
     * 
     * @return
     *     possible object is
     *     {@link UBSCOMPType }
     *     
     */
    public UBSCOMPType getUBSCOMP() {
        return ubscomp;
    }

    /**
     * Sets the value of the ubscomp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UBSCOMPType }
     *     
     */
    public void setUBSCOMP(UBSCOMPType value) {
        this.ubscomp = value;
    }

    /**
     * Gets the value of the msgid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSGID() {
        return msgid;
    }

    /**
     * Sets the value of the msgid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSGID(String value) {
        this.msgid = value;
    }

    /**
     * Gets the value of the correlid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORRELID() {
        return correlid;
    }

    /**
     * Sets the value of the correlid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORRELID(String value) {
        this.correlid = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTITY() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTITY(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCH(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the moduleid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODULEID() {
        return moduleid;
    }

    /**
     * Sets the value of the moduleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODULEID(String value) {
        this.moduleid = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICE() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICE(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATION() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATION(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the sourceoperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCEOPERATION() {
        return sourceoperation;
    }

    /**
     * Sets the value of the sourceoperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCEOPERATION(String value) {
        this.sourceoperation = value;
    }

    /**
     * Gets the value of the sourceuserid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCEUSERID() {
        return sourceuserid;
    }

    /**
     * Sets the value of the sourceuserid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCEUSERID(String value) {
        this.sourceuserid = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATION() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATION(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the multitripid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMULTITRIPID() {
        return multitripid;
    }

    /**
     * Sets the value of the multitripid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMULTITRIPID(String value) {
        this.multitripid = value;
    }

    /**
     * Gets the value of the functionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNCTIONID() {
        return functionid;
    }

    /**
     * Sets the value of the functionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNCTIONID(String value) {
        this.functionid = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTION() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTION(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the msgstat property.
     * 
     * @return
     *     possible object is
     *     {@link MsgStatType }
     *     
     */
    public MsgStatType getMSGSTAT() {
        return msgstat;
    }

    /**
     * Sets the value of the msgstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgStatType }
     *     
     */
    public void setMSGSTAT(MsgStatType value) {
        this.msgstat = value;
    }

    /**
     * Gets the value of the snapshotid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNAPSHOTID() {
        return snapshotid;
    }

    /**
     * Sets the value of the snapshotid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNAPSHOTID(String value) {
        this.snapshotid = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSWORD() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSWORD(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the addl property.
     * 
     * @return
     *     possible object is
     *     {@link ADDL }
     *     
     */
    public ADDL getADDL() {
        return addl;
    }

    /**
     * Sets the value of the addl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ADDL }
     *     
     */
    public void setADDL(ADDL value) {
        this.addl = value;
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
     *         &lt;element name="PARAM" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "param"
    })
    public static class ADDL {

        @XmlElement(name = "PARAM")
        protected List<PARAM> param;

        /**
         * Gets the value of the param property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the param property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPARAM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PARAM }
         * 
         * 
         */
        public List<PARAM> getPARAM() {
            if (param == null) {
                param = new ArrayList<PARAM>();
            }
            return this.param;
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
         *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "name",
            "value"
        })
        public static class PARAM {

            @XmlElement(name = "NAME", required = true)
            protected String name;
            @XmlElement(name = "VALUE", required = true)
            protected String value;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNAME() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNAME(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALUE() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVALUE(String value) {
                this.value = value;
            }

        }

    }

}
