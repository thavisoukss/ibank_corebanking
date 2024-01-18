package com.internetbanking.soap.Service.InternalTxnSerive;

import com.internetbanking.soap.Client.SoapClient;
import com.internetbanking.soap.Client.ValidateRespone;
import com.internetbanking.soap.model.TransferRes.ApiResponse;
import com.internetbanking.soap.model.TransferRes.MessageResponse;
import com.internetbanking.soap.model.TransferRes.TransferReq;
import com.internetbanking.soap.model.TransferRes.TransferRes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.internetbanking.soap.transfer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InternalTxnService {

    @Autowired
    SoapClient soapClient;

    @Autowired
    ValidateRespone validateRespone;

    @Autowired
    private ObjectMapper objectMapper;


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



    public ApiResponse internalTransfer(TransferReq transferReq){

        ApiResponse apiResponse = new ApiResponse();
        MessageResponse obj = new MessageResponse();
        CREATECONTRACTFSFSRES result = new CREATECONTRACTFSFSRES();

        CREATECONTRACTFSFSREQ createTxn = new CREATECONTRACTFSFSREQ();


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


}
