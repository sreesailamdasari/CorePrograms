package com.core.strings;

public class CountOfWords {
	public static void main(String[] args) {
		String str = "A global leader in consulting, technology and outsourcing services, we offer an array of integrated services combining top-of-the-range technology with deep sector expertise.";

		String[] str1 = str.split(" ");
		for (String s : str1) {
			System.out.println(s);
		}
		System.out.println(str1.length);
	}
}