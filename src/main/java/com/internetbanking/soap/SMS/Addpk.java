
package com.internetbanking.soap.SMS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _addpk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_addpk"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="err_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pk_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pk_type_rq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pk_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="err_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rp_trans_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_addpk", propOrder = {
    "id",
    "errCode",
    "pkType",
    "pkTypeRq",
    "pkCode",
    "errDesc",
    "rpTransId"
})
public class Addpk {

    protected long id;
    @XmlElement(name = "err_code")
    protected String errCode;
    @XmlElement(name = "pk_type")
    protected String pkType;
    @XmlElement(name = "pk_type_rq")
    protected String pkTypeRq;
    @XmlElement(name = "pk_code")
    protected String pkCode;
    @XmlElement(name = "err_desc")
    protected String errDesc;
    @XmlElement(name = "rp_trans_id")
    protected String rpTransId;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the errCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrCode(String value) {
        this.errCode = value;
    }

    /**
     * Gets the value of the pkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkType() {
        return pkType;
    }

    /**
     * Sets the value of the pkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkType(String value) {
        this.pkType = value;
    }

    /**
     * Gets the value of the pkTypeRq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkTypeRq() {
        return pkTypeRq;
    }

    /**
     * Sets the value of the pkTypeRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkTypeRq(String value) {
        this.pkTypeRq = value;
    }

    /**
     * Gets the value of the pkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkCode() {
        return pkCode;
    }

    /**
     * Sets the value of the pkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkCode(String value) {
        this.pkCode = value;
    }

    /**
     * Gets the value of the errDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrDesc() {
        return errDesc;
    }

    /**
     * Sets the value of the errDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrDesc(String value) {
        this.errDesc = value;
    }

    /**
     * Gets the value of the rpTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpTransId() {
        return rpTransId;
    }

    /**
     * Sets the value of the rpTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpTransId(String value) {
        this.rpTransId = value;
    }

}
