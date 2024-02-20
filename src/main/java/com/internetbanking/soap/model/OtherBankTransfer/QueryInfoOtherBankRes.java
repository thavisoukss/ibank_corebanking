package com.internetbanking.soap.model.OtherBankTransfer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.Data;

@Data
public class QueryInfoOtherBankRes {
private String result;
    private String reference;
    private String time;
    private OtherBankInfoOriginalmessageRes originalmessage;
    private String accountname;
    private String accountlocation;
    private String accountphone;
    private String invoice;
    private String terminal;
    private String amount;
    private String purposerequired;
    private String purpose;
    private String accountccy;
    private String data;
    private OtherBankInfoFeelistRes feelist;

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();

        String jsonString = "";
        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            jsonString = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

}
