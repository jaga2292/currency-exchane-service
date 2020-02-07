package com.microservice.webservice.currencyexchaneservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepo extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from,String to);
}
