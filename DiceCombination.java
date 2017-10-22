/**
 * 
 */
package com.self;

/**
 * @author Kunal
 *
 */
public class DiceCombination {
	static int diceCombinations(int sum) {
		int sides[] = { 1, 2, 3, 4, 5, 6 };
		int totalSides = 6;
		int dp[][] = new int[totalSides + 1][sum + 1];

		for (int i = 0; i <= totalSides; ++i) {
			dp[i][0] = 1;
		}
		for (int i = 1; i <= totalSides; ++i) {
			for (int j = 1; j <= sum; ++j) {
				dp[i][j] = 0;
				for (int k = 0; k <= j / sides[i - 1]; ++k) {
					dp[i][j] += dp[i - 1][j - k * sides[i - 1]];
				}
			}
		}

		return dp[totalSides][sum];

	}

	public static void main(String... args) {
		System.out.println(diceCombinations(610));
	}
}
