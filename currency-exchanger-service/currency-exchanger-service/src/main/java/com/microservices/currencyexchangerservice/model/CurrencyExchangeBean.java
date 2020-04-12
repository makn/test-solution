package com.microservices.currencyexchangerservice.model;

public class CurrencyExchangeBean {
	private Long id;
	private String currency;
	private String monthOne;
	private String monthTwo;
	private String monthThree;
	private String monthFour;
	private String monthFive;
	private String monthSix;
	
	
	public CurrencyExchangeBean(Long id, String currency, String monthOne, String monthTwo, String monthThree,
			String monthFour, String monthFive, String monthSix) {
		super();
		this.id = id;
		this.currency = currency;
		this.monthOne = monthOne;
		this.monthTwo = monthTwo;
		this.monthThree = monthThree;
		this.monthFour = monthFour;
		this.monthFive = monthFive;
		this.monthSix = monthSix;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getMonthOne() {
		return monthOne;
	}
	public void setMonthOne(String monthOne) {
		this.monthOne = monthOne;
	}
	public String getMonthTwo() {
		return monthTwo;
	}
	public void setMonthTwo(String monthTwo) {
		this.monthTwo = monthTwo;
	}
	public String getMonthThree() {
		return monthThree;
	}
	public void setMonthThree(String monthThree) {
		this.monthThree = monthThree;
	}
	public String getMonthFour() {
		return monthFour;
	}
	public void setMonthFour(String monthFour) {
		this.monthFour = monthFour;
	}
	public String getMonthFive() {
		return monthFive;
	}
	public void setMonthFive(String monthFive) {
		this.monthFive = monthFive;
	}
	public String getMonthSix() {
		return monthSix;
	}
	public void setMonthSix(String monthSix) {
		this.monthSix = monthSix;
	}
	
	
}
