package com.interfac;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		
		int num=12345;
		int rem=0;
		while(num>0){
			
			rem=num%10+rem;
			rem=10*rem;
			num=num/10;
			
		}
		
		System.out.println(num);
	}

}
