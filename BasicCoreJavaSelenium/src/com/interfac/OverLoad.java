package com.interfac;

public class OverLoad {
	
	int a,b;
	public static void sum(int a, int b){
		
		System.out.println(a+b);
	}
	
	public static void sum(int b, float a){
		System.out.println(a+b);
	}

	public static void sum(int a, double b){
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		OverLoad.sum(10, 20.0);
	}
}
