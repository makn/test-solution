package com.microservices.currencyexchangerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.currencyexchangerservice.CurrencyExchangeService;
import com.microservices.currencyexchangerservice.model.CurrencyExchangeBean;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private CurrencyExchangeService currencyExchangeService;
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/exchange-rates")
	public List<CurrencyExchangeBean> getExchange(){
		return currencyExchangeService.getExchanger();
	}

}
