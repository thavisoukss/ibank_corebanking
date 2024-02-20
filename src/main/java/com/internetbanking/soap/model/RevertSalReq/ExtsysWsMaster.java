package com.internetbanking.soap.model.RevertSalReq;

import lombok.Data;

import java.util.List;

@Data
public class ExtsysWsMaster {
    public Object keyid;
    public List<Object> extsysWsDetails;
}
