package com.internetbanking.soap.SMS;

import lombok.Data;

@Data
public class HeaderRequestObj {
    public String userid ;
    public String key ;
    public String trans_id ;
    public String verson ;

    @Override
    public String toString() {
        return "HeaderRequestObj{" +
                "userid='" + userid + '\'' +
                ", key='" + key + '\'' +
                ", trans_id='" + trans_id + '\'' +
                ", verson='" + verson + '\'' +
                '}';
    }
}
