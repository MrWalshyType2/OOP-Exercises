package com.qa.maths;

public class App {
	public static void main(String args[]) {
		int add = Calculator.addition(20, 25); // 45
		int multiply = Calculator.multiplication(5, 5); // 25
		int subtract = Calculator.subtraction(35, 17); // 18
		double divide = Calculator.division(10, 20); // 0.5
		
		System.out.println("add: " + add);
		System.out.println("multiply: " + multiply);
		System.out.println("subtract: " + subtract);
		System.out.println("divide: " + divide);
	}
}
