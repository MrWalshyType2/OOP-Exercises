package com.qa.taxes;

public class App {
	public static void main(String args[]) {
		Tax taxMachine = new Tax();
		
		System.out.println(taxMachine.getTax(100000)); // 25,000
	}
}
