package com.internetbanking.soap.Dao;

import com.internetbanking.soap.model.OtherBankTransfer.StoreGetInfoOtherBankReq;
import com.internetbanking.soap.model.OtherBankTransfer.UpdateGetInfoOtherBankRes;
import com.internetbanking.soap.model.StoreTxn.StoreTxnInternalReq;
import com.internetbanking.soap.model.StoreTxn.UpdateTxnInternalRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

@Repository
@Transactional
@Component
public class ImpStoreTxnDao implements StoreTxnDao{
@Autowired
@Qualifier("CoreJdbcTemplate")
public JdbcTemplate CoreJdbcTemplate;

    @Override
    public int StoreTxnReq(StoreTxnInternalReq data , String ref_info) {

        int i = 0 ;
         String ref = data.getRef();
         String reqObj = data.getReqObj();
         String fromAccNo = data.getFromAccNo();
         String toAccNo = data.getToAccNo();
         String amount = data.getAmount();
         String fee = data.getFee();
         String type = "internalTransfer";
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        try {

            i = CoreJdbcTemplate.update("insert into STORE_CORE_TXN (REF_INFO , REF , REQ_OBJ , FROM_ACC , TO_ACC , AMOUNT , FEE , TXN_TYPE , REQ) VALUES" +
                    " (?,?,?,?,?,?,?,?,?)" , ref_info,ref , reqObj , fromAccNo , toAccNo ,amount , fee,type, timestamp );

        }catch (Exception e){
            e.printStackTrace();
            return i;
        }
        return i;
    }

    @Override
    public int UpdateTxnRes(UpdateTxnInternalRes data , String ref_info) {

        int i = 0;
         String ref = data.getRef();
         String coreBankingRef = data.getCoreBankingRef();
         String objRes = data.getObjRes();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());


        try {

           String SQL ="update STORE_CORE_TXN set RES_OBJ = '"+coreBankingRef+"' , FT = '"+coreBankingRef+"', RES = SYSDATE  where REF_INFO =  '"+ref_info+"' ";

            System.out.printf(SQL);
           i = CoreJdbcTemplate.update(SQL);
        }catch (Exception e){
            e.printStackTrace();
            return i;
        }
        return i;
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
