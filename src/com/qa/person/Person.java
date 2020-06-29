package com.qa.person;

import java.util.List;

public class Person {
	private String name;
	private String jobTitle;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, String jobTitle, int age) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
	}

	@Override
	public String toString() {
		return "NAME     : " + this.name
			 + "\nAGE      : " + this.age
 		 	 + "\nJOB TITLE: " + this.jobTitle + "\n";
	}
	
	public static Person findPerson(List<Person> people, String name) {
		for (Person p : people) {
			if (p.name.toLowerCase().equals(name.toLowerCase())) {
				return p;
			}
		}
		return new Person();
	}
}
