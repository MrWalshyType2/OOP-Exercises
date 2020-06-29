package com.qa.taxes;

public class Tax {
	private int getTaxRate(int salary) {
		if (salary >= 45000) {
			return 25;
		} else if (salary >= 30000) {
			return 20;
		} else if (salary >= 20000) {
			return 15;
		} else if (salary >= 15000) {
			return 10;
		} else {
			return 0;
		}
	}
	
	public int getTax(int salary) {
		// formula to find % = original_value * taxRate/100
		int taxRate = getTaxRate(salary);
		int tax = salary * taxRate/100;
		return tax;
	}
}
