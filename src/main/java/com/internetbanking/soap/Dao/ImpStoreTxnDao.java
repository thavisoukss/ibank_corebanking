package com.internetbanking.soap.Dao;

import com.internetbanking.soap.model.OtherBankTransfer.StoreGetInfoOtherBankReq;
import com.internetbanking.soap.model.OtherBankTransfer.UpdateGetInfoOtherBankRes;
import com.internetbanking.soap.model.StoreTxn.StoreTxnInternalReq;
import com.internetbanking.soap.model.StoreTxn.UpdateTxnInternalRes;

public class ImpStoreTxnDao implements StoreTxnDao{


    @Override
    public int StoreTxnReq(StoreTxnInternalReq data) {

         String ref = data.getRef();
         String reqObj = data.getReqObj();
         String fromAccNo = data.getFromAccNo();
         String toAccNo = data.getToAccNo();
         String amount = data.getAmount();
         String fee = data.getFee();

        try {
            String SQL = " insert into ";

        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int UpdateTxnRes(UpdateTxnInternalRes data) {

         String ref = data.getRef();
         String coreBankingRef = data.getCoreBankingRef();
         String objRes = data.getObjRes();


        try {
            String SQL = " insert into ";

        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int StoreGetInfoOtherBank(StoreGetInfoOtherBankReq data) {
        return 0;
    }

    @Override
    public int UpdateGetInfoOtherBank(UpdateGetInfoOtherBankRes data) {
        return 0;
    }
}
