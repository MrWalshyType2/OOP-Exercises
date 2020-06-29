package com.qa.inheritance;

public class App {
	public static void main(String args[]) {
		Bird myBird = new Bird();
		Frog myFrog = new Frog();
		Horse myHorse = new Horse();
		
		myBird.setName("Ostrich");
		System.out.println(myBird.getName() + " has " + myBird.getWings() + " wings.");
	}
}
