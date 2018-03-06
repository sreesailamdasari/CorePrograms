package com.core.strings;

public class RepetedString {
	public static void main(String[] args) {

		String s1 = "abcabcdbcdfbc";
		String s2 = "bc";
		
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == s2.charAt(0)) {
				for (int j = i + 1; j < s1.length(); j++) {
					if (s1.charAt(j) == s2.charAt(1)) {
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}