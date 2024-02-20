
package com.internetbanking.soap.SMS;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _deliveryReportMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_deliveryReportMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dr" type="{http://Services.laotel.com/}_sms_dr" minOccurs="0"/&gt;
 *         &lt;element name="dr_repon" type="{http://Services.laotel.com/}_sms_dr_rp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_deliveryReportMsg", propOrder = {
    "dr",
    "drRepon"
})
public class DeliveryReportMsg {

    protected SmsDr dr;
    @XmlElement(name = "dr_repon")
    protected SmsDrRp drRepon;

    /**
     * Gets the value of the dr property.
     * 
     * @return
     *     possible object is
     *     {@link SmsDr }
     *     
     */
    public SmsDr getDr() {
        return dr;
    }

    /**
     * Sets the value of the dr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsDr }
     *     
     */
    public void setDr(SmsDr value) {
        this.dr = value;
    }

    /**
     * Gets the value of the drRepon property.
     * 
     * @return
     *     possible object is
     *     {@link SmsDrRp }
     *     
     */
    public SmsDrRp getDrRepon() {
        return drRepon;
    }

    /**
     * Sets the value of the drRepon property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsDrRp }
     *     
     */
    public void setDrRepon(SmsDrRp value) {
        this.drRepon = value;
    }

}
