package com.qa.maths;

public class Calculator {
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int subtraction(int num1, int num2) {
		return num1 - num2;
	}
	
	public static double division(double num1, double num2) {
		if (num1 < num2) {
			return num1 / num2;
		}
		System.out.println("Division cannot be performed!");
		return 0.0;
	}
}
