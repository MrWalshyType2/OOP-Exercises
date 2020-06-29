package com.qa.accounts;

public class App {
	public static void main(String args[]) {
		Bank bank = new Bank();
		bank.addAccount(new Account(1));
		bank.addAccount(new Account(2));
		bank.addAccount(new Account(3));
		bank.addAccount(new Account(4));
		bank.addAccount(new Account(5));
		bank.addAccount(new Account(6));
		bank.update();
		
		bank.closeAccount(5);
	}
}
