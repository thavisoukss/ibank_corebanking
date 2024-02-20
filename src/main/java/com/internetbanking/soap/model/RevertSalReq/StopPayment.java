package com.internetbanking.soap.model.RevertSalReq;

import lombok.Data;

@Data
public class StopPayment {
    public String referenceno;
    public int esn;
    public Object pmtchkrecved;
    public Object drauth;
    public Object refundcover;
    public Object chknotdebited;
    public Object chklost;
    public Object accnt;
    public Object stmtno;
    public Object stmtdt;
    public Object narrative1;
    public Object narrative2;
    public Object narrative3;
    public Object narrative4;
    public Object narrative5;
    public Object narrative6;
    public Object rejectreason;
}
