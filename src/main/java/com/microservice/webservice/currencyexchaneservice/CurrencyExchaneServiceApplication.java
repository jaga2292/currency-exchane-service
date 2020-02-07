package com.microservice.webservice.currencyexchaneservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CurrencyExchaneServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchaneServiceApplication.class, args);
	}

}
