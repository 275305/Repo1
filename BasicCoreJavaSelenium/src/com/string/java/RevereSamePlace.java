package com.string.java;

import java.util.Arrays;

public class RevereSamePlace {

	public static void main(String[] args) {

		String strOrg = "this is hyderabad";
		String arr[] = strOrg.split(" ");
		for (int i = 0; i < arr.length; i++) {

			char chararr[] = arr[i].toCharArray();
		
			for (int j = chararr.length - 1; j >= 0; j--) {
				System.out.print(chararr[j]);
			}
			System.out.print(" ");

		}
	}

}
