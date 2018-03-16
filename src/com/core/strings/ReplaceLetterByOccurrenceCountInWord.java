package com.core.strings;

import java.util.ArrayList;

public class ReplaceLetterByOccurrenceCountInWord {
	public static void main(String[] args) {
		String str = "Opentext is text from next";
		int count = 0;
		String[] words = str.split(" ");
		// HashMap<Character, Integer> hashMap = new HashMap<>();
		ArrayList list = new ArrayList<>();
		for (String word : words) {
			for (int i = 0; i < word.length(); i++) {
				char[] ch = word.toCharArray();
				// System.out.println(ch[i]);
				if (ch[i] == 't') {
					count = count + 1;
					list.add(count);

				} else if (ch[i] != 't') {
					list.add(ch[i]);
				}
			}
			count = 0;
			list.add('-');
		}
		System.out.println(list);
		String s=null;
		for (int i = 0; i < list.size(); i++) {
			s = list.get(i).toString();
			s=s.replace('-', ' ');
//			System.out.print(s);
//			String[] ws=s.split(" ");
//			System.out.println(ws);
		}
		System.out.println("printing :"+s);

	}

}
/*
 * Open1ex2 is 1ex2 from nex1
 */

/*
 * char[] ch = word.toCharArray(); for (int i = 0; i < ch.length; i++) { int
 * count = 1; if (ch[i] == 't') { word.replace(ch[i], ch[count]); //
 * System.out.println(word); count++; } } // System.out.println(word);
 */