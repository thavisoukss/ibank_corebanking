package com.internetbanking.soap.model.OtherBankTransfer;

import lombok.Data;

@Data
public class StoreCreateTxnOtherBankReq {

    private String ref;
    private String refInfo;
    private String reqObj;
    private String fromAccNo;
   private String toAccNo;
    private String amount;
    private String fee;
}
