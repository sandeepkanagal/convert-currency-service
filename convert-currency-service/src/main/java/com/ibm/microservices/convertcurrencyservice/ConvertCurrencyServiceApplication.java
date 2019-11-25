package com.ibm.microservices.convertcurrencyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.ibm.microservices.convertcurrencyservice")
@EnableDiscoveryClient
@RibbonClient(name = "convert-currency-service", configuration = LocalRibbonClientConfiguration.class)
public class ConvertCurrencyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertCurrencyServiceApplication.class, args);
	}
	
}
