package com.core.util;

import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Fail-Safe iterators don’t throw any exceptions if the collection is modified
 * while iterating over it. Because, they iterate on the clone of the collection
 * not on the actual collection. So, any structural modifications done on the
 * actual collection goes unnoticed by these iterators. But, these iterators
 * have some drawbacks. One of them is that it is not always guaranteed that you
 * will get up-to-date data while iterating. Because any modifications to
 * collection after the iterator has been created is not updated in the
 * iterator. One more disadvantage of these iterators is that there will be
 * additional overhead of creating the copy of the collection in terms of both
 * time and memory.
 */
public class FailSafe {
	public static void main(String[] args) {
		// Creating a ConcurrentHashMap
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		// Adding elements to map
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		// Getting an Iterator from map
		// Iterator<String> it = map.keySet().iterator();
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			map.put("FIVE", 5); // This will not be reflected in the Iterator
		}
	}
}
