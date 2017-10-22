package com.self;

public class BubbleSort {
	public static void main(String... strings) {

		int[] arr = new int[] { 4, 5, 1, 9, 2 };

		boolean isSorted = false;
		int lastIndex = arr.length - 1;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < lastIndex; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isSorted = false;
				}
			}
			lastIndex--;

		}
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
