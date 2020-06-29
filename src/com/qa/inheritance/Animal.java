package com.qa.inheritance;

public class Animal {
	private String name;
	private int age = 0;
	private int legs = 4;
	
	// Getters and Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getLegs() {
		return this.legs;
	}
}
