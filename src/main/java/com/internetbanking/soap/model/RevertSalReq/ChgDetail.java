package com.internetbanking.soap.model.RevertSalReq;

import lombok.Data;

@Data
public class ChgDetail {

    public String component;
    public String ccy;
    public int amt;
    public String status;
    public Object rate;
    public String event;
    public String waiver;
}
