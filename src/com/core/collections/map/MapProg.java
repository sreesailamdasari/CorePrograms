package com.core.collections.map;

import java.util.HashMap;

public class MapProg {
	int i;

	public MapProg(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return i + "";
	}

	@Override
	public int hashCode() {
		return i;
	}

	public static void main(String[] args) {
		/*
		 * HashMap<Integer, String> hashMap = new HashMap<>(); hashMap.put(1,
		 * "AA"); hashMap.put(2, "BB"); hashMap.put(3, "CC"); HashMap<Integer,
		 * String> hashMap1 = new HashMap<>();
		 * 
		 * hashMap1.put(1, "SS"); hashMap1.putAll(hashMap);
		 * System.out.println(hashMap1); System.out.println(hashMap);
		 */
		HashMap<Object, String> hashMap = new HashMap<>();
		hashMap.put(new MapProg(2), "AA");
		hashMap.put(new MapProg(7), "BB");
		hashMap.put(new MapProg(12), "CC");
		hashMap.put(new MapProg(23), "CC");
		hashMap.put(new MapProg(15), "CC");
		hashMap.put(new MapProg(16), "CC");
		hashMap.put(new MapProg(11), "CC");
		System.out.println(hashMap);

	}

}
