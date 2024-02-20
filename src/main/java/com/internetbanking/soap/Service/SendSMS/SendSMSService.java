package com.internetbanking.soap.Service.SendSMS;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.internetbanking.soap.Client.SoapClient;
import com.internetbanking.soap.SMS.*;
import com.internetbanking.soap.model.OtherBankTransfer.QueryInfoOtherBankReq;
import com.internetbanking.soap.model.TransferRes.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Service
public class SendSMSService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    SoapClient soapClient;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    RestTemplate restTemplate;

    @Value("${sms.generateKey}")
    private String UrlSendSMS;

    public ApiResponse sendSMS (SmsReq smsReq){
        ApiResponse apiResponse = new ApiResponse();

        Random random = new Random();
        SendSMSReqObj sendSMSReqObj = new SendSMSReqObj();
        int randomNum = random.nextInt((999-100)+1)+100;
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyMMddHHss");
        String txnId = "SMS"+dateFormat.format(date) + randomNum;

        ObjectMapper mapper = new ObjectMapper();
        SendSmsRequest request = new SendSmsRequest();
        SendSMS sendSMS = new SendSMS();
        SendSMSResponse result = new SendSMSResponse();

        SendSMSResponse result1 = new SendSMSResponse();
         HeaderRequest header = new HeaderRequest();



        try {
            logger.info(" ****************  call API generate keyId *********************** ");

            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> req = new HttpEntity<String>(headers);
            ResponseEntity<String> res = restTemplate.exchange(UrlSendSMS +"encrypt?dt="+txnId+smsReq.getMobileNo()+"", HttpMethod.GET, req,String.class);
            logger.info(res.toString());

            logger.info("******************* set object send sms ************* ");

            header.setKey(res.getBody());
            header.setUserid("STB");
            header.setTrans_id(txnId);
            request.setHeader(header);
            request.setHeaderSMS("1881");
            request.setMsisdn(smsReq.getMobileNo());
            request.setMessage(smsReq.getMessage());
            sendSMS.setMsg(request);

            String json1 = objectMapper.writeValueAsString(sendSMS);
            logger.info(json1);
            sendSMSReqObj = objectMapper.readValue(json1, SendSMSReqObj.class);
            logger.info(sendSMSReqObj.toString());

            logger.info(" ****************  call API  send  sms  *********************** ");

            result =    soapClient.sendSMS(sendSMS);
            logger.info(result.toString());

            logger.info("**************** convert to json object ****************** ");
            String json = objectMapper.writeValueAsString(result);
            logger.info(json);
             result1 = objectMapper.readValue(json, SendSMSResponse.class);
             logger.info(result1.toString());

            apiResponse.setCode("00");
            apiResponse.setMessage("success");
            apiResponse.setDataRes(result1);

        }catch (Exception e){
            e.printStackTrace();



        }

        return apiResponse;
    }

}
