package com.internetbanking.soap.model.TransferRes;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Data
public class TransferReq {
    private String ref;
    private String product;
    private String fromAccNo;
    private String fromAccCcy;
    private String fromAccBranch;
    private String toAccNo;
    private String toAccCcy;
    private String toAccBranch;
    private BigDecimal fromAmount;
    private BigDecimal toAmount;
    private String remark;
    private String narative;
    private String fee;
}
