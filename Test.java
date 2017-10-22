package com.general;

import java.util.Scanner;

public class Test {

	private static final int ESCAPE_TOKEN = -128;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int totalEX = sc.nextInt();
		int length = sc.nextInt();
		Long[][] times = new Long[length][2];
		for (int i = 0; i < length; i++) {
			times[i][0] = sc.nextLong();
			times[i][1] = sc.nextLong();
		}
		
		int count=0;
		for(int i=0 ;i<times.length-1;i++){
			if(times[i][1] > times[i+1][1]){
				count++;
			}
		}
	}

}
