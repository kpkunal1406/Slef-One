/**
 * 
 */
package com.self;

import java.math.BigInteger;

/**
 * @author Kunal
 *
 */
public class LargeFib {

	// Function to Generate nth Fibonacci number
	public void generateFib(long n) {
		BigInteger arr1[][] = { { BigInteger.ONE, BigInteger.ONE }, { BigInteger.ONE, BigInteger.ZERO } };
		if (n == 0)
			System.out.println("First Fibonacci number : 0");
		else {
			power(arr1, n - 1);
			System.out.println(n + " th Fibonacci number : " + arr1[0][0]);
		}
	}

	// Function raise matrix to power n recursively
	private void power(BigInteger arr1[][], long n) {
		if (n == 0 || n == 1)
			return;
		BigInteger arr2[][] = { { BigInteger.ONE, BigInteger.ONE }, { BigInteger.ONE, BigInteger.ZERO } };
		power(arr1, n / 2);
		multiply(arr1, arr1);
		if (n % 2 != 0)
			multiply(arr1, arr2);
	}

	// Function to multiply two 2 d matrices
	private void multiply(BigInteger arr1[][], BigInteger arr2[][]) {
		BigInteger a = (arr1[0][0].multiply(arr2[0][0])).add(arr1[0][1].multiply(arr2[1][0]));
		BigInteger b = (arr1[0][0].multiply(arr2[0][1])).add(arr1[0][1].multiply(arr2[1][1]));
		BigInteger c = (arr1[1][0].multiply(arr2[0][0])).add(arr1[1][1].multiply(arr2[1][0]));
		BigInteger d = (arr1[1][0].multiply(arr2[0][1])).add(arr1[1][1].multiply(arr2[1][1]));
		arr1[0][0] = a;
		arr1[0][1] = b;
		arr1[1][0] = c;
		arr1[1][1] = d;
	}

	public static void main(String[] args) {

		LargeFib largeFib = new LargeFib();
		largeFib.generateFib(8181);
	}

}
