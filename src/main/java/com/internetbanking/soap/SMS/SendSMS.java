
package com.internetbanking.soap.SMS;

import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSMS", propOrder = {
        "msg"
})
@XmlRootElement(name = "sendSMS")
public class SendSMS {

    @XmlElement(name = "msg")
    protected SendSmsRequest msg;

    public SendSmsRequest getMsg() {
        return msg;
    }

    public void setMsg(SendSmsRequest msg) {
        this.msg = msg;
    }



}