package com.internetbanking.soap.SMS;

import lombok.Data;

@Data
public class SendSMSRequestObj {
    HeaderRequestObj header;
    public String msisdn;
    public String headerSMS;
    public String message;
    public String sms_type;

    @Override
    public String toString() {
        return "SendSMSRequestObj{" +
                "header=" + header +
                ", msisdn='" + msisdn + '\'' +
                ", headerSMS='" + headerSMS + '\'' +
                ", message='" + message + '\'' +
                ", sms_type='" + sms_type + '\'' +
                '}';
    }
}
