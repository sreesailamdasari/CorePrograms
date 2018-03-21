package com.core.util;

import java.util.Stack;

public class ParenthasisMatching {
	public static void main(String[] args) {
		if (isPrenthasis("(3+(7*9)+1)"))
			System.out.println("MATCH");
		else
			System.out.println("NO MATCH");
	}
	private static boolean isPrenthasis(String string) {
		char[] ch = string.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] == '(')
				stack.push(ch[i]);
			else if (ch[i] == ')')
				if (stack.isEmpty())
					return false;
				else if (stack.peek() == '(')
					stack.pop();
				else
					return true;
		}
		return stack.isEmpty();
	}
}