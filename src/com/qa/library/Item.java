package com.qa.library;

public abstract class Item {
	private static int idCount = 0;
	private int id;
	private String name;
	private double price;
	private boolean isCheckedOut;
	
	public Item() {
		this.id = idCount;
		idCount++;
	}
	
	public Item(String name, double price, boolean isCheckedOut) {
		this.id = idCount;
		this.name = name;
		this.price = price;
		this.isCheckedOut = isCheckedOut;
		
		idCount++;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setIsCheckedOut(boolean b) {
		this.isCheckedOut = b;
	}
	
	public boolean getIsCheckedOut() {
		return this.isCheckedOut;
	}
}
