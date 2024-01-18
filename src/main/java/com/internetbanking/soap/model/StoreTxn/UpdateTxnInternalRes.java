package com.internetbanking.soap.model.StoreTxn;

import lombok.Data;

@Data
public class UpdateTxnInternalRes {
    private String ref;
    private String coreBankingRef;
    private String objRes;
}
