package com.internetbanking.soap.Client;

import com.internetbanking.soap.SMS.SendSMS;
import com.internetbanking.soap.SMS.SendSMSResponse;
import com.internetbanking.soap.newmodel.QUERYACCTRNSIOFSREQ;
import com.internetbanking.soap.newmodel.QUERYACCTRNSIOFSRES;
import com.internetbanking.soap.transfer.CREATECONTRACTFSFSREQ;
import com.internetbanking.soap.transfer.CREATECONTRACTFSFSRES;
import com.internetbanking.soap.transfer.REVERSECONTRACTFSFSREQ;
import com.internetbanking.soap.transfer.REVERSECONTRACTFSFSRES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

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

    public REVERSECONTRACTFSFSRES revert (REVERSECONTRACTFSFSREQ req) {

        REVERSECONTRACTFSFSRES res = (REVERSECONTRACTFSFSRES) getWebServiceTemplate().marshalSendAndReceive("http://10.0.32.154:9991/FCUBSFTService/FCUBSFTService",req);
        //    logger.info(res.getFCUBSBODY().toString());
        return res;
    }


    public SendSMSResponse sendSMS (SendSMS sendSMS) {

        //SendSMSResponse res = new SendSMSResponse();
       // SendSMSResponse res = (SendSMSResponse) getWebServiceTemplate().marshalSendAndReceive("http://ltcservice.laotel.com:5577/Services",sendSMS);

        SendSMSResponse res = (SendSMSResponse)  getWebServiceTemplate().marshalSendAndReceive("http://10.0.0.81:9000/Services.asmx?op=sendSMS",sendSMS,new WebServiceMessageCallback() {
            public void doWithMessage(WebServiceMessage message)
            {
                ((SoapMessage)message).setSoapAction("http://Services.laotel.com/sendSMS");
            }
        });
           logger.info(res.getSendSMSResult().toString());
        return res;
    }





}
