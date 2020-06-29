package com.qa.accounts;

public class CurrentAccount extends Account {
	
	private double overdraftLimit;

	public CurrentAccount(int a) {
		super(a);
	}
	
	public double getOverdraftLimit() {
		return this.overdraftLimit;
	}
	
	public void setOverdraftLimit(double lim) {
		this.overdraftLimit = lim;
	}
}
