package com.core.strings;

import java.util.HashSet;

public class EqualsAndHashCode {
	public static void main(String[] args) {
		/*
		 * 
		 * String obj="emp"; StringBuffer sb=new StringBuffer("emp");
		 * System.out.println(obj==sb);
		 */

		Employee emp1 = new Employee(1, "SS");
		Employee emp2 = new Employee(2, "SS");
		Employee emp3 = new Employee(3, "SS");
		Employee emp4 = new Employee(2, "SS");

		HashSet<Employee> hashSet = new HashSet<>();
		hashSet.add(emp1);
		hashSet.add(emp2);
		hashSet.add(emp3);

		/*
		 * Hashing retrieval is a two-step process.
		 * 
		 * Find the right bucket (using hashCode()) Search the bucket for the right
		 * element (using equals() )
		 * 
		 * 
		 */ System.out.println("contains: " + hashSet.contains(emp4));

		System.out.println("emp1 hashcode :" + emp1.hashCode());
		System.out.println("emp2 hashcode :" + emp2.hashCode());
		System.out.println("emp3 hashcode :" + emp3.hashCode());
		System.out.println("emp4 hashcode :" + emp4.hashCode());
		System.out.println(emp1.equals(emp2));
	}

}