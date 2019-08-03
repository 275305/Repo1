package com.string;

import java.util.Scanner;

public class ReverseNumber {
	// print the duplicate character from given string
	public static void main(String[] args) {
		int sum = 0, rem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number");
		int num = sc.nextInt();

		while (num > 0) {
			rem = num % 10;

			sum = (sum * 10) + rem;

			num = num / 10;

		}
		System.out.println("reverse no is" + sum);
	}

}
