package com.internetbanking.soap.model.TransferRes;


import lombok.Data;

import java.util.ArrayList;

@Data
public class Fcubsbody {
    ContractDetailsFull contractDetailsFull;
    ArrayList<Object> fcubserrorresp = new ArrayList<Object>();
    ArrayList<Object> fcubswarningresp = new ArrayList<Object>();
}
