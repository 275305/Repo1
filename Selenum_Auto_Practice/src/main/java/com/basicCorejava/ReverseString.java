package com.basicCorejava;

import java.util.Scanner;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String inputStr=sc.next();
		char[] arr=inputStr.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
				
	}

}
