package com.qa.accounts;

public class SavingsAccount extends Account {
	
	private double interest;
	
	public SavingsAccount(int a) {
		super(a);
	}
	
	public void addInterest() {
		this.deposit(this.getBalance() * (interest / 100));
	}
}
