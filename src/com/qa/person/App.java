package com.qa.person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {
	public static void main(String args[]) {
		List<Person> developers = new ArrayList<>();
		
		Person p1 = new Person("Fred", "Senior Developer", 404);
		Person p2 = new Person("Elijah", "Junior Developer", 22);
		Person p3 = new Person("Bobby", "Lazy Developer", 16);
		Person p4 = new Person("Grok", "He does something...", 21);
		
		developers.add(p1);
		developers.add(p2);
		developers.add(p3);
		developers.add(p4);
		
		Person foundElijah = Person.findPerson(developers, "Elijah");
		Person foundFred = Person.findPerson(developers, "Fred");
		
		System.out.println(foundElijah.toString());
		System.out.println(foundFred.toString());
		System.out.println("--- toString and findPerson test ends here ---\n");
		
		System.out.println("--- Stream starts here ---");
		// Stream instantiation
		Stream<Person> devs = developers.stream();
		// Stream pipeline
		devs.forEach(dev -> System.out.println(dev));
	}
}
