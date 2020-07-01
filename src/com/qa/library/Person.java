package com.qa.library;

public class Person {
	private static int idCount = 0;
	private int id;
	private long telephoneNo;
	private String name;
	
	public Person() {
		this.id = idCount;
		idCount++;
	}
	
	public Person(long telephoneNo, String name) {
		this.id = idCount;
		this.telephoneNo = telephoneNo;
		this.name = name;
		
		System.out.println("Added: " + this.name + "\n" 
						 + "ID   : " + this.id + "\n"
						 + "Tele : " + this.telephoneNo);
		idCount++;
	}
	
	public int getId() {
		return this.id;
	}

	public long getTelephoneNo() {
		return this.telephoneNo;
	}

	public void setTelephoneNo(long telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
