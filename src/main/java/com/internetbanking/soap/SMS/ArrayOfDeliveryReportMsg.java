
package com.internetbanking.soap.SMS;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf_deliveryReportMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_deliveryReportMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_deliveryReportMsg" type="{http://Services.laotel.com/}_deliveryReportMsg" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_deliveryReportMsg", propOrder = {
    "deliveryReportMsg"
})
public class ArrayOfDeliveryReportMsg {

    @XmlElement(name = "_deliveryReportMsg", nillable = true)
    protected List<DeliveryReportMsg> deliveryReportMsg;

    /**
     * Gets the value of the deliveryReportMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryReportMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryReportMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryReportMsg }
     * 
     * 
     */
    public List<DeliveryReportMsg> getDeliveryReportMsg() {
        if (deliveryReportMsg == null) {
            deliveryReportMsg = new ArrayList<DeliveryReportMsg>();
        }
        return this.deliveryReportMsg;
    }

}
