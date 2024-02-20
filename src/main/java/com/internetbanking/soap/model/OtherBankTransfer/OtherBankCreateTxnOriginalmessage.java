package com.internetbanking.soap.model.OtherBankTransfer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.Data;

@Data
public class OtherBankCreateTxnOriginalmessage {
    private String frommember;
    private String fromuser;
    private String fromaccount;
    private String totype;
    private String toaccount;
    private String tomember;
    private String reference;
    private String time;
    private String amount;
    private String fee;
    private String ccy;
    private String purpose;

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
