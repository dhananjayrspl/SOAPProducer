package com.rsoft.soapservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.rsoft.netsuit.soap.config","com.rsoft.netsuit.soap.endpoint","com.rsoft.netsuit.soap.repo"} )
public class SoapservicesApplication {

    public static void main(String[] args) {
	SpringApplication.run(SoapservicesApplication.class, args);
    }
    
}
