package com.internetbanking.soap.model.RevertSalReq;

import lombok.Data;

import java.util.List;

@Data
public class Charges {
    public String conrefno;
    public int evenseqno;
    public List<ChgDetail> chgDetails;
}
