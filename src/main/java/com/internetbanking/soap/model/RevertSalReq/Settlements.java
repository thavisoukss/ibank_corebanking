package com.internetbanking.soap.model.RevertSalReq;

import lombok.Data;

import java.util.List;

@Data
public class Settlements {
    public String conrefno;
    public int latevnseqno;
    public List<ContractSettlement> contractSettlement;
}
