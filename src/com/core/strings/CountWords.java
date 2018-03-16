package com.core.strings;

public class CountWords {
	public static void main(String[] args) {
		String str = "Java is a Java it's234 like a+) Sea                 ";
		// TYPE==1
		String[] words = str.split(" ");
		// length of the words
		System.out.println(words.length + "\n*************");
		for (String word : words) {
			System.out.println(word);
		}
		// TYPE==2
		int count = 1;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
