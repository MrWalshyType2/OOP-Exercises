package com.qa.hello_world;

public class App {
	public static void main(String args[]) {
		String message = "Hello World!";
		HelloWorld hw = new HelloWorld();
		
		hw.printString(message);
		System.out.println(hw.returnString(message));
	}
}
