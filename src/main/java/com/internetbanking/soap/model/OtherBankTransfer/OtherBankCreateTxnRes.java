package com.internetbanking.soap.model.OtherBankTransfer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.Data;

@Data
public class OtherBankCreateTxnRes {
    private String result;
    private String reference;
    private String time;
    private String reverse_status;
    private int shouldrevert;
    OtherBankCreateTxnOriginalmessage originalmessage;

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
