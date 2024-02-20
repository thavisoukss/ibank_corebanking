package com.internetbanking.soap.Client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("com.internetbanking.soap.*");
        return marshaller;
    }


    @Bean
    public SoapClient soapClientClient(Jaxb2Marshaller marshaller ) {
        SoapClient client = new SoapClient();
       client.setDefaultUri("http://10.0.32.154:9991/FCUBSACService/FCUBSACService");
       // client.setDefaultUri("http://ltcservice.laotel.com:5577/Services");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }



}
