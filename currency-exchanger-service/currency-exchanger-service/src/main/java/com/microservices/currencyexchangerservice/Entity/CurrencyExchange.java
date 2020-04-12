package com.microservices.currencyexchangerservice.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyExchange {
	@Id
	private Long id;
	@Column
	private String currency;
	@Column
	private String monthOne;
	@Column
	private String monthTwo;
	@Column
	private String monthThree;
	@Column
	private String monthFour;
	@Column
	private String monthFive;
	@Column
	private String monthSix;
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
