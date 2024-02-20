package com.internetbanking.soap.model.RevertSalReq;

import lombok.Data;

import java.util.List;

@Data
public class Fcubsbody {

    public ContractDetailsFull contractDetailsFull;
    public List<Error> fcubserrorresp;
    public List<Fcubswarningresp> fcubswarningresp;
}
