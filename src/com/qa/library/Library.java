package com.qa.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Item> items = new ArrayList<>();
	private List<Person> people = new ArrayList<>();
	
	public Library() {
		
	}

	public List<Item> getItems() {
		return items;
	}

	public void addItem(Item item) {
		items.add(item);
		System.out.println("Added item: " + item.getName());
	}
	
	public void addItems(List<Item> items) {
		for (Item item : items) {
			items.add(item);
		}
	}
	
	public void checkoutItem(Item item) {
		item.setIsCheckedOut(true);
		System.out.println("Checked out: " + item.getName());
	}
	
	public void checkinItem(Item item) {
		item.setIsCheckedOut(false);
		System.out.println("Checked in: " + item.getName());
	}
	
	public void removeItem(Item item) {
		items.remove(item);
		System.out.println("Removed item: " + item.getName() + " with ID: " + item.getId());
	}
	
	public void removeItem(int id) {
		for (Item item : items) {
			if (item.getId() == id) {
				items.remove(item);
				System.out.println("Removed item: " + item.getName() + " with ID: " + item.getId());
				break;
			}
		}
	}
	
	public void registerPerson(Person p) {
		people.add(p);
	}
	
	public void deletePerson(Person p) {
		people.remove(p);
	}
	
	public void deletePerson(int id) {
		for (Person p : people) {
			if (p.getId() == id) {
				people.remove(p);
				break;
			}
		}
	}
	
	public void updatePerson(Person p, int telephoneNo, String name) {
		p.setTelephoneNo(telephoneNo);
		p.setName(name);
	}
	
	public void updatePerson(int id, int telephoneNo, String name) {
		for (Person p : people) {
			if (p.getId() == id) {
				p.setTelephoneNo(telephoneNo);
				p.setName(name);
				break;
			}
		}
	}
}
