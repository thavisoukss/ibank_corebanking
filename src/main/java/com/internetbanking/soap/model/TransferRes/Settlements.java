package com.internetbanking.soap.model.TransferRes;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Settlements {

    private String conrefno;
    private float latevnseqno;
    ArrayList<Object> contractSettlement = new ArrayList<Object>();

}
