package com.qa.library;

public class Book extends Item implements Readable {
	private boolean rareBook;
	
	public Book() {
		super();
	}
	
	public Book(String name, double price, boolean isCheckedOut) {
		super(name, price, isCheckedOut);
	}
	
	public Book(String name, double price, boolean isCheckedOut, boolean rareBook) {
		super(name, price, isCheckedOut);
		this.rareBook = rareBook;
	}
	
	public void setRareBook(boolean b) {
		this.rareBook = b;
	}
	
	public boolean getIsRare() {
		return this.rareBook;
	}
	
	@Override
	public void reading() {
		System.out.println("I am reading a book...");
	}
}
