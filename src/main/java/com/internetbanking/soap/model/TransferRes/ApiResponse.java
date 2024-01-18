package com.internetbanking.soap.model.TransferRes;

import lombok.Data;

@Data
public class ApiResponse {
    private String code;
    private String message;
    private String txnId;
    private String messageType;
    private  Object dataRes;

}
