package com.internetbanking.soap.model.TransferRes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Data
public class TransferReq {
    private String ref;
    private String product;
    private String fromAccNo;
    private String fromAccCcy;
    private String fromAccBranch;
    private String toAccNo;
    private String toAccCcy;
    private String toAccBranch;
    private BigDecimal fromAmount;
    private BigDecimal toAmount;
    private String remark;
    private String narative;
    private String fee;

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
