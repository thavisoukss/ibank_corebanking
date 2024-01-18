package com.internetbanking.soap.model.TransferRes;

import lombok.Data;

@Data
public class StopPayment {
    private String referenceno;
    private float esn;
    private String pmtchkrecved = null;
    private String drauth = null;
    private String refundcover = null;
    private String chknotdebited = null;
    private String chklost = null;
    private String accnt = null;
    private String stmtno = null;
    private String stmtdt = null;
    private String narrative1 = null;
    private String narrative2 = null;
    private String narrative3 = null;
    private String narrative4 = null;
    private String narrative5 = null;
    private String narrative6 = null;
    private String rejectreason = null;
}
