package com.string.java;

import java.util.Scanner;

public class PrimeTest {
	
	
	public static void main(String[] args) {
		int f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		 int number=sc.nextInt();
		 
		 for(int i=2;i<=number;i++){
			 if(number%i==0){
				 f=f+1;
			 }
		 }
		 if(f==1)
			 System.out.println("prime Number");
		 else
			 System.out.println("not prime");
	}

}
