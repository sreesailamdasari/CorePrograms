package com.core.collections.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapPrograms {
	public static void main(String[] args) {
		/**
		 * insertion order not preserved , it is based on hashcode only it will insert the data
		 * not thread safe
		 * performence is high
		*/
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("java", 5);
		hashMap.put("spring", 8);
		hashMap.put("jpa", 7);
		hashMap.put("rest", 1);
		hashMap.put("heroku", 6);
		hashMap.put("boot", 4);
		hashMap.put("maven", 9);
		// hashMap.put(null, 22);// only once allowed
		// hashMap.put(null, 202); // if we are inserting null while sorting the
		// data we will get null pointer exception
		System.out.println(hashMap);
		System.out.println("******************************");
		// to get the synchornized hashMap
		Map<?, ?> synchhashMap = Collections.synchronizedMap(hashMap);
		System.out.println(synchhashMap);
		System.out.println("Read key value pairs by using Iterator");
		Iterator itr = hashMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}

		hashMap.entrySet().stream().forEach(entry -> System.out.print(entry.getKey() + "--" + entry.getValue() + " "));
		System.out.println();
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		Set<?> set = hashMap.entrySet();
		System.out.println(set);
		System.out.println("***** Sorting *****");

		TreeMap<String, Integer> treemap = new TreeMap<>(hashMap);
		System.out.println(treemap);

		System.out.println("****** Map to List ******");
		List<String> listKeys = new ArrayList<>(hashMap.keySet());
		System.out.println(listKeys);
		List<Integer> listValues = new ArrayList<>(hashMap.values());
		System.out.println(listValues);
		System.out.println("***** By using Lambda exp to ");
		System.out.println(hashMap.keySet().stream().collect(Collectors.toList()));
	}
}
