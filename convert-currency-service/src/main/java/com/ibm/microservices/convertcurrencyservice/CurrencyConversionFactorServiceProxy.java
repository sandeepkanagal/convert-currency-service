package com.ibm.microservices.convertcurrencyservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="currency-conversion-factor-service", url="localhost:8000") //Without Ribbon
@FeignClient(name="currency-conversion-factor-service")    //With Ribbon
@RibbonClient(name="currency-conversion-factor-service")
public interface CurrencyConversionFactorServiceProxy {
	
	@GetMapping("/currency-conversion-factor/from/{from}/to/{to}")
	public CurrencyConversionBean getConversionFactor(@PathVariable("from") String from, @PathVariable("to") String to);

}
