package com.string;

import java.util.Scanner;

public class StringReverseAtPlace {
  //how to reverse the string at same place.
	public static void main(String[] args) {
		int i,j, len;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str = sc.nextLine();
		System.out.println("original string is:" + str);

		String[] s1 = str.split("\\s+");
        int lens1=s1.length;
		for (i = 0; i < s1.length; i++) {
			System.out.println("s1[i]="+i+s1[i]);
			
			char[] arr = s1[i].toCharArray();

			len = arr.length - 1;

			for (j = len; j >= 0; j--) {

				System.out.print(arr[j]);

			}

			System.out.print(" ");
		}

	}
}
