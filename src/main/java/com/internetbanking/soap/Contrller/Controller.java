package com.internetbanking.soap.Contrller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.internetbanking.soap.Client.ValidateRespone;
import com.internetbanking.soap.SMS.SendSMS;
import com.internetbanking.soap.SMS.SendSMSResponse;
import com.internetbanking.soap.SMS.SendSmsRequest;
import com.internetbanking.soap.SMS.SmsReq;
import com.internetbanking.soap.Service.InternalTxnSerive.InternalTxnService;
import com.internetbanking.soap.Service.OtherBankService.OtharBankService;
import com.internetbanking.soap.Service.SendSMS.SendSMSService;
import com.internetbanking.soap.model.OtherBankTransfer.OtherBankCreateTxnReq;
import com.internetbanking.soap.model.OtherBankTransfer.QueryInfoOtherBankReq;
import com.internetbanking.soap.model.RevertSalReq.IbReversalReq;
import com.internetbanking.soap.model.StoreTxn.StoreTxnInternalReq;
import com.internetbanking.soap.model.TransferRes.ApiResponse;
import com.internetbanking.soap.model.TransferRes.MessageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("${base_url}")
public class Controller {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    InternalTxnService internalTxnService;

     @Autowired
    ValidateRespone validateRespone;

     @Autowired
     OtharBankService otharBankService;

    @Autowired
    SendSMSService sendSMSService;

//    @Autowired
//    ReverSalService reverSalService;


//    @PostMapping(value = "/transfer",produces = {MediaType.APPLICATION_JSON_VALUE})
//    public ApiResponse transfer(@RequestBody TransferReq transferReq) {
//
//        ObjectMapper mapper = new ObjectMapper();
//        ApiResponse apiResponse = new ApiResponse();
//        MessageResponse obj = new MessageResponse();
//
//       String ref = validateRespone.GenerateInterRef("IBIN");
//
//
//        StoreTxnInternalReq storeTxnInternalReq = new StoreTxnInternalReq();
//        String objTransfer = "";
//
//        try {
//            objTransfer= mapper.writeValueAsString(transferReq);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//
//        storeTxnInternalReq.setRef(transferReq.getRef());
//        storeTxnInternalReq.setReqObj(objTransfer);
//        storeTxnInternalReq.setAmount(String.valueOf(transferReq.getToAmount()));
//        storeTxnInternalReq.setToAccNo(transferReq.getToAccNo());
//        storeTxnInternalReq.setFromAccNo(transferReq.getFromAccNo());
//        storeTxnInternalReq.setFee(transferReq.getFee());
//
//        /* ---- store txn obj ----------*/
//
//        internalTxnService.StoreTxn(storeTxnInternalReq , ref);
//
//        try {
//
//            apiResponse = internalTxnService.internalTransfer(transferReq , ref) ;
//
//        }catch (Exception e){
//            e.printStackTrace();
//            apiResponse.setCode("01");
//            apiResponse.setMessage("transfer error ");
//            apiResponse.setTxnId(transferReq.getRef());
//            apiResponse.setMessageType("Transfer");
//            apiResponse.setDataRes(obj);
//            return apiResponse;
//        }
//
//        return apiResponse;
//    }

    @PostMapping(value = "/getinfoOtherbank",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ApiResponse getinfoOtherbank(@RequestBody QueryInfoOtherBankReq queryInfoOtherBankReq) {

        logger.info(queryInfoOtherBankReq.toString());

        ObjectMapper mapper = new ObjectMapper();
        ApiResponse apiResponse = new ApiResponse();
        MessageResponse obj = new MessageResponse();

        String ref = validateRespone.GenerateInterRef("OTHERINFO");

        StoreTxnInternalReq storeTxnInternalReq = new StoreTxnInternalReq();
        String objTransfer = "";

        try {
            objTransfer= mapper.writeValueAsString(queryInfoOtherBankReq);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        storeTxnInternalReq.setRef(queryInfoOtherBankReq.getFromuser());
        storeTxnInternalReq.setReqObj(objTransfer);
        storeTxnInternalReq.setAmount("");
        storeTxnInternalReq.setToAccNo(queryInfoOtherBankReq.getToaccount());
        storeTxnInternalReq.setFromAccNo("");
        storeTxnInternalReq.setFee("");

        /* ---- store txn obj ----------*/

       // internalTxnService.StoreTxn(storeTxnInternalReq , ref);

        try {

            apiResponse = otharBankService.otherBankGetInfo(queryInfoOtherBankReq , ref) ;


        }catch (Exception e){
            e.printStackTrace();
            apiResponse.setCode("01");
            apiResponse.setMessage("transfer error ");
            //apiResponse.setTxnId(transferReq.getRef());
            apiResponse.setMessageType("Transfer");
            apiResponse.setDataRes(obj);
            return apiResponse;
        }

        return apiResponse;
    }


    @PostMapping(value = "/otherbankTransfer",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ApiResponse OtherbankTransfer(@RequestBody OtherBankCreateTxnReq otherBankCreateTxnReq) {

        logger.info(otherBankCreateTxnReq.toString());

        ObjectMapper mapper = new ObjectMapper();
        ApiResponse apiResponse = new ApiResponse();
        MessageResponse obj = new MessageResponse();

        String ref = validateRespone.GenerateInterRef("OTHERTXN");

        StoreTxnInternalReq storeTxnInternalReq = new StoreTxnInternalReq();
        String objTransfer = "";

        try {
            objTransfer= mapper.writeValueAsString(otherBankCreateTxnReq);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        storeTxnInternalReq.setRef(otherBankCreateTxnReq.getFromuser());
        storeTxnInternalReq.setReqObj(objTransfer);
        storeTxnInternalReq.setAmount(otherBankCreateTxnReq.getAmount());
        storeTxnInternalReq.setToAccNo(otherBankCreateTxnReq.getToaccount());
        storeTxnInternalReq.setFromAccNo(otherBankCreateTxnReq.getFromaccount());
        storeTxnInternalReq.setFee(otherBankCreateTxnReq.getFee());

        /* ---- store txn obj ----------*/

        // internalTxnService.StoreTxn(storeTxnInternalReq , ref);

        try {

            apiResponse = otharBankService.otherBankTransfer(otherBankCreateTxnReq , ref) ;


        }catch (Exception e){
            e.printStackTrace();
            apiResponse.setCode("01");
            apiResponse.setMessage("transfer error ");
            //apiResponse.setTxnId(transferReq.getRef());
            apiResponse.setMessageType("Transfer");
            apiResponse.setDataRes(obj);
            return apiResponse;
        }

        return apiResponse;
    }


    @PostMapping(value = "/RevertCoreBanking",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ApiResponse RevertCoreBanking(@RequestBody IbReversalReq req) {

        logger.info(String.valueOf(req));

        ObjectMapper mapper = new ObjectMapper();
        ApiResponse apiResponse = new ApiResponse();
        MessageResponse obj = new MessageResponse();

        String ref = validateRespone.GenerateInterRef("REVERT");

        StoreTxnInternalReq storeTxnInternalReq = new StoreTxnInternalReq();
        String objTransfer = "";

        try {
            objTransfer= mapper.writeValueAsString(req);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

//        storeTxnInternalReq.setRef(otherBankCreateTxnReq.getFromuser());
//        storeTxnInternalReq.setReqObj(objTransfer);
//        storeTxnInternalReq.setAmount(otherBankCreateTxnReq.getAmount());
//        storeTxnInternalReq.setToAccNo(otherBankCreateTxnReq.getToaccount());
//        storeTxnInternalReq.setFromAccNo(otherBankCreateTxnReq.getFromaccount());
//        storeTxnInternalReq.setFee(otherBankCreateTxnReq.getFee());

        /* ---- store txn obj ----------*/

        // internalTxnService.StoreTxn(storeTxnInternalReq , ref);

        try {

            apiResponse = internalTxnService.reversal(req , ref) ;

        }catch (Exception e){
            e.printStackTrace();
            apiResponse.setCode("01");
            apiResponse.setMessage("transfer error ");
            //apiResponse.setTxnId(transferReq.getRef());
            apiResponse.setMessageType("Transfer");
            apiResponse.setDataRes(obj);
            return apiResponse;
        }

        return apiResponse;
    }

    @PostMapping(value = "/SendSMS" )
    public ApiResponse SendSMS(@RequestBody SmsReq smsReq) {
        ApiResponse response = new ApiResponse();
        SendSmsRequest sendSmsRequest = new SendSmsRequest();

        try {

            response =  sendSMSService.sendSMS(smsReq);
        }catch (Exception e){
            e.printStackTrace();
            response.setCode("01");
            response.setMessage("send sms fail");
            return response;
        }

        return  response ;
    }
}
