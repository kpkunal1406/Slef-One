package com.self;

import java.util.HashMap;
import java.util.Scanner;

public class TriesContactsSearch {

	public static void main(String... strings) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Tri trie = new Tri();
		for (int i = 0; i < n; i++) {
			String operation = scan.next();
			String contact = scan.next();
			if (operation.equals("add")) {
				trie.add(contact);
			} else if (operation.equals("find")) {
				System.out.println(trie.find(contact));
			}
		}
		scan.close();
	}

}

class TriNode {
	private HashMap<Character, TriNode> children = new HashMap<>();
	public int size;

	public void putIfChildAbsent(char c) {
		children.putIfAbsent(c, new TriNode());
	}

	public TriNode getChild(char ch) {
		return children.get(ch);

	}
}

class Tri {
	TriNode root = new TriNode();

	public Tri() {

	}

	public void add(String str) {
		TriNode curr = root;
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			curr.putIfChildAbsent(ch);
			curr = curr.getChild(ch);
			curr.size++;
		}
	}

	public int find(String prefix) {
		TriNode curr = root;

		/* Traverse down tree to end of our prefix */
		for (int i = 0; i < prefix.length(); i++) {
			Character ch = prefix.charAt(i);
			curr = curr.getChild(ch);
			if (curr == null) {
				return 0;
			}
		}
		return curr.size;
	}
}
