package com.internetbanking.soap.model.RevertSalReq;

import lombok.Data;

import java.util.List;

@Data
public class Advices {
    public String conrefno;
    public int latevnseqno;
    public List<AdviceDetail> adviceDetails;
}
