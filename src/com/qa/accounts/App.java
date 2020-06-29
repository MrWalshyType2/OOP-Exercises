package com.qa.accounts;

public class App {
	public static void main(String args[]) {
		Account normAcc1 = new Account(1);
		Account normAcc2 = new Account(2);
		
		// can i use Account alongside SavingsAccount
		Account savingsAcc1 = new SavingsAccount(3);
		Account savingsAcc2 = new SavingsAccount(4);
		
		Account currentAcc1 = new CurrentAccount(5);
		Account currentAcc2 = new CurrentAccount(6);
		
		Bank bank = new Bank();
		bank.addAccount(normAcc1);
		bank.addAccount(normAcc2);
		bank.addAccount(savingsAcc1);
		bank.addAccount(savingsAcc2);
		bank.addAccount(currentAcc1);
		bank.addAccount(currentAcc2);
		bank.update();
	}
}
