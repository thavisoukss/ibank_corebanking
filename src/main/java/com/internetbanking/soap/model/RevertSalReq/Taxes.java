package com.internetbanking.soap.model.RevertSalReq;

import lombok.Data;

@Data
public class Taxes {

    public String conrefno;
    public int latevnseqno;
    public Object tax;
}
