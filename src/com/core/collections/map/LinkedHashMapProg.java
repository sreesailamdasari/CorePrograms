package com.core.collections.map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapProg {
	public static void main(String[] args) {
		/**
		 * same like hashMap but 
		 * underlying DS is LinkedList + Hashtable
		 * insertion order is preserved.
		*/
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		System.out.println(linkedHashMap.size());
		linkedHashMap.put(1, "AA");
		linkedHashMap.put(3, "BB");
		linkedHashMap.put(4, "CC");
		linkedHashMap.put(2, "DD");
		linkedHashMap.put(7, "EE");
		linkedHashMap.put(6, "FF");
		System.out.println(linkedHashMap);
		System.out.println(new TreeMap<>(linkedHashMap));

	}
}
