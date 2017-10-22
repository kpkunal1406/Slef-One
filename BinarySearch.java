package com.general;

public class BinarySearch {

	public static void main(String... args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(BinarySearch.binarySearch(arr, 20));

	}

	private static boolean binarySearch(int[] arr, int key) {
		int lowerBound = 0;
		int upperBound = arr.length - 1;
		int currIn = 0;

		while (true) {
			currIn = (lowerBound + upperBound) / 2;
			if (arr[currIn] == key) {
				return true;
			} else if (lowerBound > upperBound) {
				return false;
			} else {
				if (arr[currIn] < key) {
					lowerBound = currIn + 1;
				} else {
					upperBound = currIn - 1;
				}
			}
		}

	}
}
