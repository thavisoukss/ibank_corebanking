package com.internetbanking.soap.model.OtherBankTransfer;

import lombok.Data;

@Data
public class OtherBankCreateTxnReq {
    private String fromuser;
    private String fromaccount;
    private String tomember;
    private String toaccount;
    private String totype;
    private String amount;
    private String reference;
    private String time;
    private String fee;
    private String ccy;
    private String purpose;

}
