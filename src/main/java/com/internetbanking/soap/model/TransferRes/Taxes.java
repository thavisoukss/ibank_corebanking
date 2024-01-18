package com.internetbanking.soap.model.TransferRes;

import lombok.Data;

@Data
public class Taxes {
    private String conrefno;
    private float latevnseqno;
    private String tax = null;
}
