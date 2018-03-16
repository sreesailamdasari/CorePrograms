package com.core.strings;

public class ReverseOfAString {
	public static void main(String[] args) {
		String string = "JAVA";
		// TYPE==StringBuffer
		StringBuffer sb = new StringBuffer(string);
		System.out.println("Using StringBuffer : " + sb.reverse());

		// TYPE==2 Iterative methods
		// using length() and charAt() methods
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
		System.out.println("");
		// using toCharArray()
		char[] ch = string.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println("");
		System.out.println("Using Recursive method");
		// TYPE ==3 Recursive Method
		System.out.println(recursiveMethod(string));
		// TYPE == 4 Reverse the words in given sentence
		System.out.println("Reverse words in a given sentence");
		reverseWordsInASentence("oops in java");
	}
	
	private static void reverseWordsInASentence(String string) {
		String[] words = string.split(" ");
		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}

	}

	static String recursiveMethod(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
	/**
		1st Call —>   recursiveMethod(“JAVA”)            
		2nd Call —> recursiveMethod(“AVA”) + “J”
		3rd Call —>  (recursiveMethod(“VA”) + “A”) + “J”
		4th call —>  ((recursiveMethod(“A”) + “V”)+”A”) + “J”
	 */
	
	
}
