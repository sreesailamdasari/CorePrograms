package com.core.strings;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacterFromString {
	public static void main(String[] args) {
		String string = "sreesailamdasari";

		/*
		 * char[] ch = string.toCharArray(); for (int i = 0; i <= ch.length - 1;
		 * i++) { for (int j = i + 1; j < ch.length - 1; j++) { if (ch[i] ==
		 * ch[j]) { // System.out.println(ch[i]);s break; } else {
		 * System.out.println(ch[i]); // break; } } }
		 */
		int MAX = Integer.MIN_VALUE;
		char MAXCHAR=' ';
		Map<Character, Integer> linkedHashMap = new LinkedHashMap<>(string.length());
		for (Character c : string.toCharArray()) {
			linkedHashMap.put(c, linkedHashMap.containsKey(c) ? linkedHashMap.get(c) + 1 : 1);
			if (linkedHashMap.get(c) > MAX) {
				MAX = linkedHashMap.get(c);//to find the max repeted value
				MAXCHAR=c;
			}
		}
		System.out.println(MAX+"---"+MAXCHAR);
		
		System.out.println(linkedHashMap);
		ArrayList<Integer> list = new ArrayList<>();
		for (Entry<Character, Integer> entry : linkedHashMap.entrySet()) {
			list.add(entry.getValue());
		}
		/*
		 * for(int i=0;i<string.length();i++){ char ch=string.charAt(i);
		 * if(linkedHashMap.get(ch)==1){ System.out.println(ch); break;
		 * 
		 * } }
		 */
	}
}
