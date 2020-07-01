package com.qa.library;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String args[]) {
		Library mainLibrary = new Library();
		
		mainLibrary.addItem(new Book("Harry Potter & The Philosphers Stone", 
							1.50, false, true));
		mainLibrary.addItem(new Book("Harry Potter & The Chamber of Secrets", 
							1.50, true, false));
		mainLibrary.addItem(new Book("Harry Potter & The Prisoner of Askaban", 
							1.50, true, false));
		mainLibrary.addItem(new Book("Harry Potter & The Goblet of Fire", 
							1.50, false, true));
		mainLibrary.addItem(new Book("Harry Potter & The Order of the Pheonix", 
							1.50, false, true));
		mainLibrary.addItem(new Book("Harry Potter & The Half-Blood Prince", 
							1.50, false, true));
		mainLibrary.addItem(new Book("Harry Potter & The Deathly Hallows", 
							1.50, false, true));
		
		List<String> someCelebs = new ArrayList<>();
		someCelebs.add("Dwayne Johnson");
		someCelebs.add("Scarlett Johansson");
		mainLibrary.addItem(new Magazine("Top Celebs", 3.00, false, someCelebs));
		
		mainLibrary.registerPerson(new Person(Long.parseLong("07943654542"), "Fred Gherkin"));
		mainLibrary.registerPerson(new Person(Long.parseLong("07933644562"), "Grok Gublin"));
	}
}
