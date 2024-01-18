package com.internetbanking.soap.Dao;

import com.internetbanking.soap.model.OtherBankTransfer.StoreGetInfoOtherBankReq;
import com.internetbanking.soap.model.OtherBankTransfer.UpdateGetInfoOtherBankRes;
import com.internetbanking.soap.model.StoreTxn.StoreTxnInternalReq;
import com.internetbanking.soap.model.StoreTxn.UpdateTxnInternalRes;

public interface StoreTxnDao {
    int StoreTxnReq (StoreTxnInternalReq data);
    int UpdateTxnRes(UpdateTxnInternalRes data);

    int StoreGetInfoOtherBank (StoreGetInfoOtherBankReq data);
    int UpdateGetInfoOtherBank (UpdateGetInfoOtherBankRes data);
}
