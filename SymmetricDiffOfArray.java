package com.self;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 * @author Kunal
 *
 *
 *         "Symmetric Difference of Arrays"
 * 
 *         Input: two arrays of integers Output: one array of integers which
 *         occur in only one (not both) arrays
 * 
 *         Test case: Input: [ 1, 7, 8, 2, 4, 5 ] [ 3, 5, 1, 7, 6, 9 ]
 * 
 *         Output: [8, 2, 4, 3, 6, 9 ]
 */

public class SymmetricDiffOfArray {

	public static void main(String... args) {
		int[] arr1 = new int[] { 1, 7, 8, 2, 4, 5 };
		int[] arr2 = new int[] { 3, 5, 1, 7, 6, 9 };

		Set<Integer> val1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		Set<Integer> val2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

		Set<Integer> union = new LinkedHashSet<>(val1);
		union.addAll(val2);

		Set<Integer> interSection = new LinkedHashSet<>(val2);
		interSection.retainAll(val1);

		union.removeAll(interSection);

		System.out.println(union);

	}

}
