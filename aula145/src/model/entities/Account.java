package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithrawLimit() {
		return withdrawLimit;
	}

	public void setWithrawLimit(Double withrawLimit) {
		this.withdrawLimit = withrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Not enought balance");
		}
		balance -= amount;
	}
	
	
	
	
}
