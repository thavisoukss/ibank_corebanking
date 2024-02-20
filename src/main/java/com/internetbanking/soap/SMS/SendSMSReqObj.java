package com.internetbanking.soap.SMS;

import lombok.Data;

@Data
public class SendSMSReqObj {

    SendSMSRequestObj msg;

    @Override
    public String toString() {
        return "SendSMSReqObj{" +
                "msg=" + msg +
                '}';
    }
}
