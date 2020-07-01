package com.qa.library;

import java.util.ArrayList;
import java.util.List;

public class Magazine extends Item implements Readable {
	private List<String> celebs = new ArrayList<>();
	
	public Magazine() {
		super();
	}
	
	public Magazine(String name, double price, boolean isCheckedOut) {
		super(name, price, isCheckedOut);
	}
	
	public Magazine(String name, double price, boolean isCheckedOut, List<String> celebs) {
		super(name, price, isCheckedOut);
		this.celebs = celebs;
	}
	
	public List<String> getCelebs() {
		return this.celebs;
	}
	
	public void setCelebs(List<String> celebs) {
		this.celebs = celebs;
	}

	@Override
	public void reading() {
		System.out.println("I am reading a magazine...");
	}
}
