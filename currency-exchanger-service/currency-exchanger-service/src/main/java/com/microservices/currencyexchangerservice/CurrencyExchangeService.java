package com.microservices.currencyexchangerservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.currencyexchangerservice.Entity.CurrencyExchange;
import com.microservices.currencyexchangerservice.model.CurrencyExchangeBean;
import com.microservices.currencyexchangerservice.repository.ExchangerRepository;

@Service
public class CurrencyExchangeService {
	
	@Autowired
	private ExchangerRepository exchangerRepository;
	
	public List<CurrencyExchangeBean> getExchanger(){
		List<CurrencyExchange> ce = exchangerRepository.findAll();
		List<CurrencyExchangeBean> beans = new ArrayList<>();
		if(ce != null && !ce.isEmpty()){
			for(CurrencyExchange c : ce){
				CurrencyExchangeBean cbean =  new CurrencyExchangeBean(c.getId(), c.getCurrency(), 
						c.getMonthOne(), c.getMonthTwo(), c.getMonthThree(), 
						c.getMonthFour(), c.getMonthFive(), c.getMonthSix());
				beans.add(cbean);
			}
		}
		return beans;
	}
	
}
