package com.internetbanking.soap.model.TransferRes;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ExtsysWsMaster {
    private String keyid = null;
    ArrayList<Object> extsysWsDetails = new ArrayList<Object>();
}
