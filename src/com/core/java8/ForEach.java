package com.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Java 8 has introduced forEach method in java.lang.Iterable interface so that
 * while writing code we focus on business logic only. forEach method takes
 * java.util.function.Consumer object as argument, so it helps in having our
 * business logic at a separate location that we can reuse
 */
public class ForEach {
	public static void main(String[] args) {
//		Iterable<T>
		List<Person> persons = Arrays.asList(new Person(1, "Sree", "Dasari"), new Person(2, "Loki", "Putta"),
				new Person(3, "Java", "Hibernate"));
		// before sort
		persons.forEach(p -> System.out.println("person" + p));
		// sort by using java 8
		Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		// after sort
		persons.forEach(p -> System.out.println("person" + p));
		
		// creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);
		// traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iterator Value::" + i);
		}

		// by using the forEach() ====> type 1
		myList.forEach(p -> System.out.println("forEach() value : " + p));
		// traversing through forEach method of Iterable with anonymous class
		// ====> type 2
		myList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("forEach anonymous class value::" + t);
			}

		});

		// traversing with Consumer interface implementation
		// ====> type 3 by creating the MyConsumer class and implementing the conusumer interface 
		MyConsumer action = new MyConsumer();
		myList.forEach(action);

	}

}

// Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::" + t);
	}
}
