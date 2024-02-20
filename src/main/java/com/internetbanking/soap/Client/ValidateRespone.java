package com.internetbanking.soap.Client;

import com.internetbanking.soap.model.RevertSalReq.RevertRes;
import com.internetbanking.soap.model.TransferRes.TransferRes;
import com.internetbanking.soap.model.TransferRes.ApiResponse;

import com.internetbanking.soap.model.TransferRes.Error;
import com.internetbanking.soap.model.TransferRes.MessageResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


@Component
public class ValidateRespone {

    @Autowired
    private ObjectMapper objectMapper;

    public ApiResponse convertTransferRes(TransferRes data , String txnId){
        MessageResponse obj = new MessageResponse();
        List<Error> errormsg = new ArrayList<>();
        ApiResponse  ressult = new ApiResponse();


        
        if(data.getFcubsbody() == null){
            ressult.setCode("01");
            ressult.setMessage("connection time out");
            ressult.setTxnId(txnId);
            ressult.setMessageType("Transfer");
            ressult.setDataRes(obj);
            return ressult;
        } else if (data.getFcubsbody().getContractDetailsFull().getContrefno() == null) {

            errormsg = convertError(data.getFcubsbody().getFcubserrorresp());
            int  index = errormsg.get(0).getError().size();

            ressult.setCode("01");
            ressult.setMessage(errormsg.get(0).getError().get(index -1).getEdesc());
            ressult.setTxnId(txnId);
            ressult.setMessageType("Transfer");
            ressult.setDataRes(obj);
            return ressult;
        }
        obj.setRef(txnId);
        obj.setFT(data.getFcubsbody().getContractDetailsFull().getContrefno());
        ressult.setCode("00");
        ressult.setMessage("success");
        ressult.setTxnId(txnId);
        ressult.setMessageType("Transfer");
        ressult.setDataRes(obj);
        return ressult;
    }

    public ApiResponse convertReversl(RevertRes data , String txnId){
        MessageResponse obj = new MessageResponse();
        ApiResponse  ressult = new ApiResponse();



        if(data.getFcubsbody() == null){
            ressult.setCode("01");
            ressult.setMessage("connection time out");
            ressult.setTxnId(txnId);
            ressult.setMessageType("Reversal");
            ressult.setDataRes(obj);
            return ressult;
        } else if (!data.getFcubsheader().getMsgstat().equals("SUCCESS")) {

//            errormsg = convertError(data.getFcubsbody().getFcubserrorresp());
//            int  index = errormsg.get(0).getError().size();

            ressult.setCode("01");
            ressult.setMessage(data.getFcubsbody().getFcubserrorresp().get(0).getError().get(0).getEdesc());
            ressult.setTxnId(txnId);
            ressult.setMessageType("Reversal");
            ressult.setDataRes(obj);
            return ressult;
        }
        obj.setRef(txnId);
        obj.setFT(data.getFcubsbody().getContractDetailsFull().getContrefno());
        ressult.setCode("00");
        ressult.setMessage("success");
        ressult.setTxnId(txnId);
        ressult.setMessageType("Transfer");
        ressult.setDataRes(obj);
        return ressult;
    }

    public List<Error> convertError (Object obj){

        ObjectMapper Obj = new ObjectMapper();
        List<Error> result = new ArrayList<>();

        try {


            String jsonStr = Obj.writeValueAsString(obj);
            Error[] resultObj = Obj.readValue(jsonStr , Error[].class);
             result = new ArrayList(Arrays.asList(resultObj));
        }

        catch (IOException e) {
            e.printStackTrace();
            return result;
        }

        return result;

    }

    public String GenerateInterRef ( String func){
        Random rand = new Random();
        DateFormat dateref = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        int random = rand.nextInt((999-100)+1)+100;
        String ref = func+dateref.format(date)+random;
        return ref;
    }
    public String ValidateHttpCode (ResponseEntity<String> object){

        if(!object.getStatusCode().is2xxSuccessful()){
            return  "01";
        }
        return "00";

    }

}
