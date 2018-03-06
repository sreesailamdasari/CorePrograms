package com.core.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class OccurencesOfString {
	public static void main(String[] args) {
		String str = "Jjava Jee and programing1234121@";

		HashMap<Character, Integer> hashMap = new HashMap<>();

		str = str.replace(" ", "");
		System.out.println(str);
		char[] ch = str.toCharArray();
		for (char ch1 : ch) {
			if (hashMap.containsKey(ch1)) {
				hashMap.put(ch1, hashMap.get(ch1) + 1);
			} else
				hashMap.put(ch1, 1);
		}
		System.out.println(hashMap);

		Set<Character> charsInString = hashMap.keySet();
		System.out.println("duplicates string:"+charsInString);
		for (Character c : charsInString) {
			if (hashMap.get(c) > 1) {
				System.out.println("chars "+c +":" + hashMap.get(c));
			}
		}

		while (str.length() > 0) {
			char ch1 = str.charAt(0);
			// System.out.println(ch1+" --"+countChar(str,ch1));
			str = str.replace("" + ch1, "");
		}

	}

	public static int countChar(String str, char ch) {
		int count = 0;
		while (str.indexOf(ch) != -1) {
			count++;
			str = str.substring(str.indexOf(ch) + 1);
		}
		return count;
	}
}
