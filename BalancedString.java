package com.self;

import java.util.Stack;

public class BalancedString {
	public static void main(String... args) {

		System.out.println(BalancedString.isStringBalanced("a(bcd)d"));
		System.out.println(BalancedString.isStringBalanced("(kjds(hfkj)sdh"));
		System.out.println(BalancedString.isStringBalanced("(sfdsf)(fsfsf"));
		System.out.println(BalancedString.isStringBalanced("{[]}()"));
		System.out.println(BalancedString.isStringBalanced(""));
	}

	private static boolean isStringBalanced(String val) {

		Stack<Character> stack = new Stack<>();

		if (val == null) {
			return false;
		}

		for (Character c : val.toCharArray()) {
			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);
			} else if (c == '}') {
				if (stack.isEmpty() || stack.pop() != '{')
					return false;
			} else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(')
					return false;
			} else if (c == ']') {
				if (stack.isEmpty() || stack.pop() != '[')
					return false;
			}

		}

		return stack.isEmpty();

	}
}
