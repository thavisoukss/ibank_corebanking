package com.internetbanking.soap.model.TransferRes;

import lombok.Data;

@Data
public class Chgclmdet {
    private String conrefno;
    private String latevnseqno = null;
    private String chgclaimDetails = null;

}
