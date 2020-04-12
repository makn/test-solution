package com.microservices.currencyexchangerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.currencyexchangerservice.Entity.CurrencyExchange;

@Repository
public interface ExchangerRepository extends JpaRepository<CurrencyExchange, Long> {
	

}
