package com.core.strings;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStringAndOccurences {

	public static void main(String[] args) {
		duplicateWords("Bread butter and bread");
	}

	private static void duplicateWords(String string) {
		String[] words = string.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String word : words) {
			if (hashMap.containsKey(word.toLowerCase())) {
				hashMap.put(word.toLowerCase(), hashMap.get(word.toLowerCase()) + 1);
			} else {
				hashMap.put(word.toLowerCase(), 1);
			}
		}
		// repeating each word
		System.out.println(hashMap);
		//
		Set<String> word = hashMap.keySet();
		for (String str : word) {
			// System.out.println(hashMap.get(str));
			if (hashMap.get(str) > 1) {
				System.out.println(str + " : " + hashMap.get(str));
			}
		}
	}
}
