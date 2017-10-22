package com.self;

public class PairOfNumbers {

	public static void main(String... strings) {
		int arr[] = new int[] { 66, 10, 18, 11, 21, 28, 31, 38, 40, 55, 60, 62 };

		int sum = arr[0],length = arr[1];
		int pairCount = 0;

		for (int i = 2; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (sum == (arr[i] + arr[j])) {
					System.out.println(arr[i] + "  "+arr[j]);
					pairCount++;
					break;
				}
			}
			if(pairCount ==1)
				break;
		}

		System.out.println(pairCount);
	}
	// public static void main(String[] args) throws FileNotFoundException {
	// System.setIn(new FileInputStream(System.getProperty("user.home") + "/" +
	// "in.txt"));
	// Scanner in = new Scanner(System.in);
	//
	// int n = in.nextInt();
	// int m = in.nextInt();
	// int[] a = new int[m];
	//
	// for (int i=0; i<m; i++) {
	// int num = in.nextInt();
	// a[i] = num;
	// }
	//
	// Map<Integer, Integer> num2index = new HashMap<Integer, Integer>();
	// for (int i=0; i<m; i++) {
	// num2index.put(a[i], i);
	// }
	//
	// for (int i=0; i<a.length; i++) {
	// if (num2index.containsKey(n-a[i]) && num2index.get(n-a[i]) != i) {
	// System.out.println("1");
	// return;
	// }
	// }
	//
	// System.out.println("0");
	// }
}
