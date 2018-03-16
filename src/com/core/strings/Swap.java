package com.core.strings;

// swap two strings without using 3rd string 
public class Swap {
	public static void main(String[] args) {
		String s1 = "First";
		String s2 = "Second";
		s1 = s1 + s2;
		System.out.println(s1);
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println(s1 + "-" + s2);

		int a = 10;
		int b = 19;
		a = a + b;

		b = a - b;
		a = a - b;
		System.out.println(a + "--" + b);
	}
}
