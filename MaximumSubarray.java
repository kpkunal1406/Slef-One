package com.self;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarray {
	private static int solveContinuous(int[] a) {
		int sum = a[0];
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > sum + a[i]) {
				sum = a[i];
			} else {
				sum += a[i];
			}

			max = Math.max(sum, max);
		}

		return max;
	}

	private static int solveNonContinuous(int[] a) {
		Arrays.sort(a);

		int i = a.length - 1;
		int sum = 0;

		do {
			sum += a[i];
			i--;
		} while (i >= 0 && sum + a[i] >= sum);

		return sum;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream(System.getProperty("user.home") + "/" + "in.txt"));
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		for (int t = 1; t <= tests; t++) {
			int n = in.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}

			System.out.println(solveContinuous(a) + " " + solveNonContinuous(a));

		}
	}
}
