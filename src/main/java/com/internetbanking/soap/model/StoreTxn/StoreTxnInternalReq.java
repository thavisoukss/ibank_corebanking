package com.internetbanking.soap.model.StoreTxn;

import lombok.Data;

@Data
public class StoreTxnInternalReq {
    private String ref;
    private String reqObj;
    private String fromAccNo;
    private String toAccNo;
    private String amount;
    private String fee;

}
