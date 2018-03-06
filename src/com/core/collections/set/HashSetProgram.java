package com.core.collections.set;

import java.util.HashSet;
import java.util.Set;

// 1.2 V
public class HashSetProgram {
	/**
	 * HashSet: Implemented based on Hashtable Data Structure  
	 * If we want to insert the objects where Duplicates are not allowed
	 * and insertion order is not preserved(it is based on hashcode) we can go for hashset
	 * null insertion is possible for only one time
	 * Heterogeneous object allowed
	 * best suitable for searching 
	 * implements Serializable,Clonable and RandomAccess interfaces 
	 * Default capacity is 16
	 * fill ratio or load factor is 75%
	 *
	 **/
	public static void main(String[] args) {

		// constructors
		Set<Object> hashSet = new HashSet<>();
		// we can specify the size of the set object
		Set<Object> hashSet1 = new HashSet<>(16); 
//		Set<Object> hashSet2 = new HashSet<>(c) c is nothing but collectoin object
		// second argument is nothing but fill ration which means the hashset
		// object is filled with 50% then it is saying that create the hashset object
		Set<Object> hashSe3 = new HashSet<>(16, 50.00f);

		hashSet.add("C");
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add("Z");
		hashSet.add(1);
		hashSet.add("A");
		hashSet.add(null);
		System.out.println(hashSet.add("C"));
		System.out.println(hashSet);
	}
}
