package com.qa.accounts;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts = new ArrayList<>();
	
	public Bank() {
		
	}
	
	public void addAccount(Account acc) {
		accounts.add(acc);
	}
	
	public void closeAccount(int acctNum) {
		for (Account acct: accounts) {
			// set the account to null, it will be auto garbage collected
			if (acct.getAccountNumber() == acctNum) {
				accounts.remove(acct);
				break;
			}
		}
	}
	
	public void payDividend(Account acc) {
		
	}
	
	public void update() {
		for (Account acc : accounts) {
			if (acc instanceof SavingsAccount) {
				((SavingsAccount) acc).addInterest();
			} else if (acc instanceof CurrentAccount) {
				double odLimit = ((CurrentAccount) acc).getOverdraftLimit();
				if (acc.getBalance() < odLimit) {
					System.out.println("Overdraft Warning Letter Sent!");
				}
			}
		}
	}
}
