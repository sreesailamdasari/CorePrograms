package com.core.collections.set;

import java.util.LinkedHashSet;

// 1.4 V
public class LinkedHashSetProgram {
	/**
	 * LinkedHashSet: 
	 * same as like Hashset but few differences are there
	 * Implemented based on Hashtable and LinkedList Data Structures
	 * and insertion order is preserved 
	 *   
	 **/
	public static void main(String[] args) {

		LinkedHashSet<Object> linkedHashSet =  new LinkedHashSet<>();
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		linkedHashSet.add("Z");
		linkedHashSet.add(1);
		linkedHashSet.add("A");
		linkedHashSet.add(null);
		System.out.println(linkedHashSet.add("C"));
		System.out.println(linkedHashSet);
	}
}
