package com.string;

import java.util.Scanner;

//Write a program to Test Prime Number or Not.
public class PrimeNumber {
	public static void main(String[] args) {
		int c = 0, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number");
		int num = sc.nextInt();
		for (i = 2; i <= num; i++) {
			if (num % i == 0) {
				c = c + 1;
			}
		}
		if (c == 1)
			System.out.println("prime number: "+num);
		else
			System.out.println("Not Prime: "+ num);
	}

}
