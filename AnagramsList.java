package com.self;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramsList {

	public static void main(String... strings) {
		List<List<String>> result = new ArrayList<>();

		HashMap<String, List<String>> map = new HashMap<>();

		for (String str : strings) {
			char[] arr = new char[26];

			for (int i = 0; i < str.length(); i++) {
				arr[str.charAt(i) - 'a']++;
			}

			String ns = new String(arr);

			if (map.containsKey(ns)) {
				map.get(ns).add(str);
			} else {
				ArrayList<String> al = new ArrayList<String>();
				al.add(str);
				map.put(ns, al);
			}
		}
		result.addAll(map.values());
	}

}
