package com.qa.coins;

import java.util.ArrayList;

public class Till {
	public Till() {
		
	}
	
	public void payment(double cost, double amount) {
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int twos = 0;
		int ones = 0;
		
		// Work out amount left
		double leftOver = amount - cost;
		System.out.println("Left over: " + leftOver);
		
		// check for multiple of 20
		if (leftOver % 20 == 0) {
			System.out.println("multiple of 20");
			System.out.println(leftOver / 20);
			twenties = (int)leftOver / 20;
			leftOver -= 20 * twenties;
			System.out.println(leftOver);
		}
		
		// check for multiple of 10
		if (leftOver % 10 == 0) {
			System.out.println("multiple of 10");
			System.out.println(leftOver / 10);
			tens = (int)leftOver / 10;
			leftOver -= 10 * tens;
			System.out.println(leftOver);
		}
		
		// check for multiple of 5
		if (leftOver % 5 == 0) {
			System.out.println("multiple of 5");
			System.out.println(leftOver / 5);
			fives = (int)leftOver / 5;
			leftOver -= 5 * fives;
			System.out.println(leftOver);
		}
		
		// check for multiple of 2
		if (leftOver % 2 == 0) {
			System.out.println("multiple of 2");
			System.out.println(leftOver / 2);
			twos = (int)leftOver / 2;
			leftOver -= 2 * twos;
			System.out.println(leftOver);
		}
		
		// check for multiple of 1
		if (leftOver % 1 == 0) {
			System.out.println("multiple of 1");
			System.out.println(leftOver / 1);
			ones = (int)leftOver / 1;
			leftOver -= 1 * ones;
			System.out.println(leftOver);
		}
		
	}
}
