package com.internetbanking.soap.Dao;

import com.internetbanking.soap.model.OtherBankTransfer.StoreGetInfoOtherBankReq;
import com.internetbanking.soap.model.OtherBankTransfer.UpdateGetInfoOtherBankRes;
import com.internetbanking.soap.model.StoreTxn.StoreTxnInternalReq;
import com.internetbanking.soap.model.StoreTxn.UpdateTxnInternalRes;

public interface StoreTxnDao {
    int StoreTxnReq (StoreTxnInternalReq data , String ref_info);
    int UpdateTxnRes(UpdateTxnInternalRes data , String ref_info);

    int StoreGetInfoOtherBank (StoreGetInfoOtherBankReq data);
    int UpdateGetInfoOtherBank (UpdateGetInfoOtherBankRes data);
}
