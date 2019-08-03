package com.string;

import java.util.Scanner;

public class PrimeNumber {
	// print the duplicate character from given string
	public static void main(String[] args) {
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number");
		int num = sc.nextInt();

		/*prime numbers between 1 to 100*/
		for(int j=1;j<=num;j++){
			
		for (int i = 2; i <= j; i++) {
			if (j % i == 0) {
                   c=c+1;
			  }
			
			}
		if(c==1)
			System.out.println("prime no"+j);
		c=0;
		/*else 
			System.out.println("not prime"+num);*/
		}
	}

}
