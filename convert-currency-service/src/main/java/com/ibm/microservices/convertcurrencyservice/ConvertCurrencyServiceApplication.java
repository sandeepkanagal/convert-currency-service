package com.ibm.microservices.convertcurrencyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.ibm.microservices.convertcurrencyservice")
@EnableDiscoveryClient
public class ConvertCurrencyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertCurrencyServiceApplication.class, args);
	}
	
}
