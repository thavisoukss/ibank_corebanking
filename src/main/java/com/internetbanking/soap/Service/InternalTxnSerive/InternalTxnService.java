package com.internetbanking.soap.Service.InternalTxnSerive;

import com.internetbanking.soap.Client.SoapClient;
import com.internetbanking.soap.Client.ValidateRespone;
import com.internetbanking.soap.Dao.ImpStoreTxnDao;
import com.internetbanking.soap.model.RevertSalReq.IbReversalReq;
import com.internetbanking.soap.model.RevertSalReq.RevertRes;
import com.internetbanking.soap.model.StoreTxn.StoreTxnInternalReq;
import com.internetbanking.soap.model.StoreTxn.UpdateTxnInternalRes;
import com.internetbanking.soap.model.TransferRes.ApiResponse;
import com.internetbanking.soap.model.TransferRes.MessageResponse;
import com.internetbanking.soap.model.TransferRes.TransferReq;
import com.internetbanking.soap.model.TransferRes.TransferRes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.internetbanking.soap.transfer.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class InternalTxnService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    SoapClient soapClient;

    @Autowired
    ValidateRespone validateRespone;

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    ImpStoreTxnDao impStoreTxnDao;


    @Value("${transfer.source}")
    private String TRAN_SOURCE;
    @Value("${transfer.ubscomp}")
    private String TRAN_UBSCOMP;
    @Value("${transfer.userid}")
    private String TRAN_USERID;
    @Value("${transfer.branch}")
    private String TRAN_BRANCH;
    @Value("${transfer.service}")
    private String TRAN_SERVICE;
    @Value("${transfer.operation}")
    private String TRAN_OPERATION;
    @Value("${transfer.sourceoperation}")
    private String TRAN_SOURCEOPERATION;

    @Value("${revert.source}")
    private String REV_SOURCE;
    @Value("${revert.ubscomp}")
    private String REV_UBSCOMP;
    @Value("${revert.userid}")
    private String REV_USERID;
    @Value("${revert.branch}")
    private String REV_BRANCH;
    @Value("${revert.service}")
    private String REV_SERVICE;
    @Value("${revert.operation}")
    private String REV_OPERATION;
    @Value("${revert.sourceoperation}")
    private String REV_SOURCEOPERATION;



    public ApiResponse internalTransfer(TransferReq transferReq , String ref){

        ObjectMapper mapper = new ObjectMapper();
        ApiResponse apiResponse = new ApiResponse();
        MessageResponse obj = new MessageResponse();
        CREATECONTRACTFSFSRES result = new CREATECONTRACTFSFSRES();

        CREATECONTRACTFSFSREQ createTxn = new CREATECONTRACTFSFSREQ();

        UpdateTxnInternalRes updateTxnInternalRes = new UpdateTxnInternalRes();


        try {

//   set object soap transaction

            createTxn = setSoapTxnReq(transferReq);

//   call  soap webservice create transaction

            result = soapClient.trnsfer(createTxn);

        }catch (Exception e){
            e.printStackTrace();
            apiResponse.setCode("01");
            apiResponse.setMessage("transfer error ");
            apiResponse.setTxnId(transferReq.getRef());
            apiResponse.setMessageType("Transfer");
            apiResponse.setDataRes(obj);
            return apiResponse;
        }

        try {

            // Convert XML response to JSON
            String json = objectMapper.writeValueAsString(result);
            TransferRes transferRes = objectMapper.readValue(json, TransferRes.class);
            apiResponse  = validateRespone.convertTransferRes(transferRes,transferReq.getRef());

            /* ----- Store update transaction -------*/

            updateTxnInternalRes.setObjRes(transferReq.getRef());
            String objRes = mapper.writeValueAsString(result);
            String ftObj = mapper.writeValueAsString(apiResponse);
            updateTxnInternalRes.setRef(transferReq.getRef());
            updateTxnInternalRes.setObjRes(objRes);
            updateTxnInternalRes.setCoreBankingRef(ftObj);

            UpdateTxn(updateTxnInternalRes , ref);



        } catch (JsonProcessingException e) {
            e.printStackTrace();
            apiResponse.setCode("01");
            apiResponse.setMessage("convert json eror ");
            apiResponse.setTxnId(transferReq.getRef());
            apiResponse.setMessageType("Transfer");
            apiResponse.setDataRes(obj);
            return apiResponse;
        }


        return  apiResponse;
    }

    public CREATECONTRACTFSFSREQ setSoapTxnReq (TransferReq transferReq){

        CREATECONTRACTFSFSREQ req = new CREATECONTRACTFSFSREQ();
        FCUBSHEADERType header = new FCUBSHEADERType();
        ContractFullType data = new ContractFullType();
        CREATECONTRACTFSFSREQ.FCUBSBODY body = new CREATECONTRACTFSFSREQ.FCUBSBODY();


        header.setSOURCE(TRAN_SOURCE);
        header.setUBSCOMP(UBSCOMPType.valueOf(TRAN_UBSCOMP));
        header.setUSERID(TRAN_USERID);
        header.setBRANCH(TRAN_BRANCH);
        header.setSERVICE(TRAN_SERVICE);
        header.setOPERATION(TRAN_OPERATION);
        header.setSOURCEOPERATION(TRAN_SOURCEOPERATION);


        data.setPROD(transferReq.getProduct());
        data.setDBTACC(transferReq.getFromAccNo());
        data.setDBTBRN(transferReq.getFromAccBranch());
        data.setDRCCY(transferReq.getFromAccCcy());
        data.setDRAMOUNT(transferReq.getFromAmount());
        data.setCRACC(transferReq.getToAccNo());
        data.setCRBRN(transferReq.getToAccBranch());
        data.setCRCCY(transferReq.getToAccCcy());
        data.setCRAMT(transferReq.getToAmount());

        body.setContractDetailsFull(data);
        req.setFCUBSHEADER(header);
        req.setFCUBSBODY(body);

        return req;
    }



    public ApiResponse reversal (IbReversalReq obj , String ref){

        REVERSECONTRACTFSFSREQ revertObj = new REVERSECONTRACTFSFSREQ();
        REVERSECONTRACTFSFSRES resObj = new REVERSECONTRACTFSFSRES();

        ApiResponse result = new ApiResponse();

        try {

            logger.info("*************** convert obj Json to XML *************");

            revertObj = setReversalObj(obj);

            logger.info("*************** call  Soap Webservice  revert  *************");

            resObj = soapClient.revert(revertObj);

            logger.info("*************** convert obj XML to JsonSting *************");

            String json = objectMapper.writeValueAsString(resObj);
            logger.info(json);


            RevertRes revertRes = objectMapper.readValue(json, RevertRes.class);
            result  = validateRespone.convertReversl(revertRes,obj.getRef());

            return result;


        }catch (Exception e){
            e.printStackTrace();

            result.setCode("01");
            result.setMessage("convert json eror ");
            result.setTxnId(obj.getRef());
            result.setMessageType("Transfer");
            result.setDataRes(obj);
            return result;
        }


    }

    public REVERSECONTRACTFSFSREQ setReversalObj (IbReversalReq obj){

        REVERSECONTRACTFSFSREQ  res = new REVERSECONTRACTFSFSREQ();
        FCUBSHEADERType fcubsheaderType = new FCUBSHEADERType();
        REVERSECONTRACTFSFSREQ.FCUBSBODY fcubsbody = new REVERSECONTRACTFSFSREQ.FCUBSBODY();

        ContractFullType body = new ContractFullType();

        fcubsheaderType.setSOURCE(REV_SOURCE);
        fcubsheaderType.setUBSCOMP(UBSCOMPType.valueOf(REV_UBSCOMP));
        fcubsheaderType.setUSERID(REV_USERID);
        fcubsheaderType.setBRANCH(REV_BRANCH);
        fcubsheaderType.setSERVICE(REV_SERVICE);
        fcubsheaderType.setOPERATION(REV_OPERATION);
        fcubsheaderType.setSOURCEOPERATION(REV_SOURCEOPERATION);

        res.setFCUBSHEADER(fcubsheaderType);
        body.setCONTREFNO(obj.getFt());
        fcubsbody.setContractDetailsFull(body);

        res.setFCUBSHEADER(fcubsheaderType);
        res.setFCUBSBODY(fcubsbody);

        return  res;


    }

    @Async
    public void  UpdateTxn (UpdateTxnInternalRes  data ,  String ref){

        try {
            impStoreTxnDao.UpdateTxnRes(data ,ref);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Async
    public void  StoreTxn (StoreTxnInternalReq  data , String ref) {

        try {
            impStoreTxnDao.StoreTxnReq(data , ref);
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
