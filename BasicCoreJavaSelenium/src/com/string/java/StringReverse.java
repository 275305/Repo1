package com.string.java;

public class StringReverse {
	
	public static void main(String[] args) {
		   String strRev="abcd";
		   char arr[]=strRev.toCharArray();
		   
		   int len=arr.length;
		   for(int i=len-1;i<strRev.length();i--){
			   System.out.println(arr[i]);
		   }
		   
		   
	}

}
