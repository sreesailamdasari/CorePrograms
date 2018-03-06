package com.core.collections.map;

import java.util.IdentityHashMap;

public class IdentityHashMapProg {
	public static void main(String[] args) {
		// hash map: Juvm will use .equals() for identify the duplicate object
		// which is meant for content comparision
		// identity hashmap : jvm wll use == for identify the duplicate keys for
		// reference(address) comparision
		IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		identityHashMap.put(1, "AA");
		identityHashMap.put(2, "AA");
		identityHashMap.put(1, "AA");
		System.out.println(identityHashMap);
	}
}
