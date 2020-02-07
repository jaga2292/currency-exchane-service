package com.microservice.webservice.currencyexchaneservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrenyExchangeController {

	@Autowired
	Environment env;
	@Autowired
	CurrencyRepo currencyRepo;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveValue(@PathVariable String from, @PathVariable String to) {

		System.out.println("fROM"+from+"==>"+to);
		ExchangeValue exchangeValue = currencyRepo.findByFromAndTo(from, to);
		
		exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return exchangeValue;

	}
}
