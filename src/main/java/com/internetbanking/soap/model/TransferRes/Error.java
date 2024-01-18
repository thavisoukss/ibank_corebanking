package com.internetbanking.soap.model.TransferRes;

import lombok.Data;
import java.util.List;


@Data
public class Error {
    List<ErrorDetail>  error;
}
