package com.core.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSort {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(25, 15648, "sree@id.com"), new Person(26, 35620, "madi@id.com"),
				new Person(30, 45621, "loki@id.com"), new Person(29, 51245, "dd@id.com"),
				new Person(45, 45621, "sree@id.com"), new Person(29, 51245, "sree@id.com"));
		// method referecne sorting
		persons.sort(Comparator.comparing(Person::getSalary).thenComparing(Person::getAge).reversed());

		/*
		 * Collections.sort(persons, new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person p1, Person p2) { if
		 * (p1.getSalary() > p2.getSalary() && p1.getAge() < p2.getAge()) return
		 * 1; else if (p1.getSalary() < p2.getSalary() && p1.getAge() >
		 * p2.getAge()) return -1; else return 0; }
		 * 
		 * });
		 */
		persons.forEach(p -> System.out.println(p));
	}
}
