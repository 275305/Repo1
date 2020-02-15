package com.string;

import java.util.Scanner;

public class Armstrong {
	// print the duplicate character from given string
	public static void main(String[] args) {
		int sum = 0, rem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number");
		int num = sc.nextInt();
          int armStrong=num;
		while (num > 0) {
			rem = num % 10;

			
			sum = sum + (rem*rem*rem);

			num = num / 10;

		}
		if(armStrong==sum)
		System.out.println("armstrong no is: " + sum);
		else
			System.out.println("not armstrong number: "+sum);
	}

}
