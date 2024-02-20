package com.internetbanking.soap.model.RevertSalReq;

import lombok.Data;

@Data
public class AdviceDetail {
    public String msgtyp;
    public String suprs;
    public int priority;
    public Object medium;
    public Object receiver;
}
