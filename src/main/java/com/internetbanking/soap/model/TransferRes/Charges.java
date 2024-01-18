package com.internetbanking.soap.model.TransferRes;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Charges {
    private String conrefno;
    private float evenseqno;
    ArrayList<Object> chgDetails = new ArrayList<Object>();


}
