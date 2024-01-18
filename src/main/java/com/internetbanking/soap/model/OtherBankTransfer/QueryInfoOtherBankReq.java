package com.internetbanking.soap.model.OtherBankTransfer;

import lombok.Data;

@Data
public class QueryInfoOtherBankReq {
    private String fromuser;
    private String fromaccount;
    private String tomember;
    private String toaccount;
    private String totype;
    private String amount;

}
