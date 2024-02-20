package com.internetbanking.soap.Service.InternalTxnSerive;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.internetbanking.soap.Client.SoapClient;
import com.internetbanking.soap.Client.ValidateRespone;
import com.internetbanking.soap.Dao.ImpStoreTxnDao;
import com.internetbanking.soap.model.RevertSalReq.IbReversalReq;
import com.internetbanking.soap.model.TransferRes.ApiResponse;
import com.internetbanking.soap.transfer.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class ReverSalService {

    private final Logger logger = LoggerFactory.getLogger(getClass());


//    @Autowired
//    SoapClient soapClient;

    @Autowired
    ValidateRespone validateRespone;

    @Autowired
    private ObjectMapper objectMapper;



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





}
