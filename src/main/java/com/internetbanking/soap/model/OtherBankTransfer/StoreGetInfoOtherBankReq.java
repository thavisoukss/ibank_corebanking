package com.internetbanking.soap.model.OtherBankTransfer;

import lombok.Data;

@Data
public class StoreGetInfoOtherBankReq {

    private String ref;
    private String reqObj;
    private String bankName;
    private String accountName;

}
