package com.general;

public class SumBitDiffOfPairs {

	public static void main(String args[]) {

		int[] arr = { 1, 3, 5 };
		int pair = arr.length;
		int ans = 0;
		for (int i = 0; i < 32; i++) {
			int count = 0;
			for (int j = 0; j < pair; j++) {
				if ((arr[j] & (1 << i)) == 1) {
					count++;
				}
			}
			ans += (count * (pair - count) * 2);
		}

		System.out.println(ans);

	}
}
