package com.internetbanking.soap.Contrller;





import com.internetbanking.soap.Client.SoapClient;
import com.internetbanking.soap.Service.InternalTxnSerive.InternalTxnService;
import com.internetbanking.soap.model.TransferRes.ApiResponse;
import com.internetbanking.soap.model.TransferRes.MessageResponse;
import com.internetbanking.soap.model.TransferRes.TransferReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@RestController
@RequestMapping("${base_url}")
public class Controller {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    SoapClient soapClient;

    @Autowired
    InternalTxnService internalTxnService;

//    @GetMapping(value = "",produces = {MediaType.APPLICATION_JSON_VALUE})
//    public QUERYACCTRNSIOFSRES Test() {
//
////        ObjectFactory objectFactory = new ObjectFactory();
//        QUERYACCTRNSIOFSREQ req = new QUERYACCTRNSIOFSREQ();
//        FCUBSHEADERType header = new FCUBSHEADERType();
//        QUERYACCTRNSIOFSREQ.FCUBSBODY body = new QUERYACCTRNSIOFSREQ.FCUBSBODY();
//        AccTrnsQueryIOType data = new AccTrnsQueryIOType();
//
//        QUERYACCTRNSIOFSRES result = new QUERYACCTRNSIOFSRES();
//
//        header.setSOURCE("GWDEXSYS");
//        header.setUBSCOMP(UBSCOMPType.valueOf("FCUBS"));
//        header.setUSERID("GWSYSTEM01");
//        header.setBRANCH("000");
//        header.setSERVICE("FCUBSACService");
//        header.setOPERATION("QueryCustAcTrn");
//        header.setSOURCEOPERATION("QueryCustAcTrn");
//        header.setMSGID("");
//        header.setCORRELID("");
//        header.setENTITY("");
//        header.setMODULEID("");
//        header.setSOURCEUSERID("");
//        header.setDESTINATION("");
//        header.setSOURCEUSERID("");
//        header.setMULTITRIPID("");
//        header.setFUNCTIONID("");
//        header.setACTION("");
//        header.setSNAPSHOTID("");
//        header.setPASSWORD("");
//
//
//        data.setACCNO("0105120006902");
//        data.setNUMOFTRN(BigDecimal.valueOf(2));
//        data.setACCBRN("001");
//        body.setAccDetailsIO(data);
//        req.setFCUBSHEADER(header);
//        req.setFCUBSBODY(body);
////        logger.info(result);
//
//        result = soapClient.getStatment(req);
//
//        logger.info(String.valueOf(result));
//        return result;
//
//    }

    @PostMapping(value = "/transfer",produces = {MediaType.APPLICATION_JSON_VALUE})
    public ApiResponse transfer(@RequestBody TransferReq transferReq) {

        ApiResponse apiResponse = new ApiResponse();
        MessageResponse obj = new MessageResponse();


        try {

            apiResponse = internalTxnService.internalTransfer(transferReq);

        }catch (Exception e){
            e.printStackTrace();
            apiResponse.setCode("01");
            apiResponse.setMessage("transfer error ");
            apiResponse.setTxnId(transferReq.getRef());
            apiResponse.setMessageType("Transfer");
            apiResponse.setDataRes(obj);
            return apiResponse;
        }
        return apiResponse;
    }

}
