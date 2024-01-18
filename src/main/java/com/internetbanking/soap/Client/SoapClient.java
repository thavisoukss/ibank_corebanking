package com.internetbanking.soap.Client;

import com.internetbanking.soap.newmodel.QUERYACCTRNSIOFSREQ;
import com.internetbanking.soap.newmodel.QUERYACCTRNSIOFSRES;
import com.internetbanking.soap.transfer.CREATECONTRACTFSFSREQ;
import com.internetbanking.soap.transfer.CREATECONTRACTFSFSRES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapClient extends WebServiceGatewaySupport {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    public QUERYACCTRNSIOFSRES getStatment(QUERYACCTRNSIOFSREQ req) {

        QUERYACCTRNSIOFSRES res = (QUERYACCTRNSIOFSRES) getWebServiceTemplate().marshalSendAndReceive("http://10.0.32.154:9991/FCUBSACService/FCUBSACService",req);
        logger.info(res.getFCUBSBODY().toString());
        return res;
    }

    public CREATECONTRACTFSFSRES trnsfer (CREATECONTRACTFSFSREQ req) {

        CREATECONTRACTFSFSRES res = (CREATECONTRACTFSFSRES) getWebServiceTemplate().marshalSendAndReceive("http://10.0.32.154:9991/FCUBSFTService/FCUBSFTService",req);
    //    logger.info(res.getFCUBSBODY().toString());
        return res;
    }

}
