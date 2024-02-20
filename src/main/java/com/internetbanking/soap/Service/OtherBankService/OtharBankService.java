package com.internetbanking.soap.Service.OtherBankService;

import com.google.gson.Gson;
import com.internetbanking.soap.Client.ValidateRespone;
import com.internetbanking.soap.model.OtherBankTransfer.OtherBankCreateTxnReq;
import com.internetbanking.soap.model.OtherBankTransfer.OtherBankCreateTxnRes;
import com.internetbanking.soap.model.OtherBankTransfer.QueryInfoOtherBankReq;
import com.internetbanking.soap.model.OtherBankTransfer.QueryInfoOtherBankRes;
import com.internetbanking.soap.model.TransferRes.ApiResponse;
import lombok.Data;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Component
public class OtharBankService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ValidateRespone validateRespone;

    @Value("${other.transfer.getInfo}")
    private String UrlGetInfo;

    @Value("${other.transfer.transfers}")
    private String UrlTransfer;



    public ApiResponse otherBankGetInfo (QueryInfoOtherBankReq data , String ref){

        ApiResponse response = new ApiResponse();
        QueryInfoOtherBankRes queryInfoOtherBankRes = new QueryInfoOtherBankRes();

        try {
            logger.info("************ start call api lapnet getinfo **************");
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-User-Id", data.getFromuser());
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<QueryInfoOtherBankReq> request = new HttpEntity<>(data,headers);


            // send POST request
            ResponseEntity<String> res = restTemplate.exchange(UrlGetInfo, HttpMethod.POST, request, String.class);

            logger.info("************  data respone from  lapnet getinfo  **************");
            /*  -----  validate http status code ---  */

            String httpCode = validateRespone.ValidateHttpCode(res);
            logger.info(res.toString());

            if(httpCode != "00"){
                response.setCode("01");
                response.setMessage("Service not avalible");
                return  response;
            }

            String json = res.getBody();
            Gson gson = new Gson();
            queryInfoOtherBankRes = gson.fromJson(json, QueryInfoOtherBankRes.class);

            response.setMessage("success");
            response.setCode("00");
            response.setDataRes(queryInfoOtherBankRes);

        } catch (Exception e) {
            e.printStackTrace();
            response.setCode("01");
            response.setMessage("Service not avalible");
            return  response;
        }

return response;
    }

    public  ApiResponse otherBankTransfer (OtherBankCreateTxnReq data , String ref){
        ApiResponse response = new ApiResponse();
        OtherBankCreateTxnRes otherBankCreateTxnRes = new OtherBankCreateTxnRes();

        try {
            logger.info("************ start call api lapnet transfer  **************");
            HttpHeaders headers = new HttpHeaders();
            headers.set("X-User-Id", data.getFromuser());
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
            requestFactory.setConnectTimeout(700000);
            restTemplate.setRequestFactory(requestFactory);

            HttpEntity<OtherBankCreateTxnReq> request = new HttpEntity<>(data,headers);


            // send POST request
            ResponseEntity<String> res = restTemplate.exchange(UrlTransfer, HttpMethod.PATCH, request, String.class);

            logger.info("************  data respone from  lapnet transfer  **************");
            /*  -----  validate http status code ---  */

            String httpCode = validateRespone.ValidateHttpCode(res);
            logger.info(res.toString());

            if(httpCode != "00"){
                response.setCode("01");
                response.setMessage("Service not avalible");
                return  response;
            }

            String json = res.getBody();
            Gson gson = new Gson();
            otherBankCreateTxnRes = gson.fromJson(json, OtherBankCreateTxnRes.class);
            if(otherBankCreateTxnRes.getResult().equals("OK")){
                response.setMessage("success");
                response.setCode("00");
                response.setDataRes(otherBankCreateTxnRes);
                return response;
            }
            response.setMessage("fail");
            response.setCode("01");
            response.setDataRes(otherBankCreateTxnRes);
            return response;


        } catch (Exception e) {
            e.printStackTrace();
            response.setCode("01");
            response.setMessage("Service not avalible");
            return  response;
        }


    }
}
