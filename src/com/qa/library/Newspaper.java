package com.qa.library;

public class Newspaper extends Item implements Readable {
	private boolean hasAds;
	
	public Newspaper() {
		super();
	}
	
	public Newspaper(String name, double price, boolean isCheckedOut) {
		super(name, price, isCheckedOut);
	}
	
	public Newspaper(String name, double price, boolean isCheckedOut, boolean hasAds) {
		super(name, price, isCheckedOut);
		this.hasAds = hasAds;
	}
	
	public boolean getHasAds() {
		return this.hasAds;
	}
	
	public void setHasAds(boolean b) {
		this.hasAds = b;
	}
	
	@Override
	public void reading() {
		System.out.println("I am reading a newspaper...");
	}
}
