package com.qa.singleton;

public class Singleton {
	// Class-member (static)
	private static final Singleton SINGLE = new Singleton();
	
	// Constructor
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		
		return SINGLE;
	}
}
