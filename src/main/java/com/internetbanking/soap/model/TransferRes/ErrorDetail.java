package com.internetbanking.soap.model.TransferRes;

import lombok.Data;

@Data
public class ErrorDetail {
    private String ecode;
    private String edesc;
}
