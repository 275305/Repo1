package com.string.java;

public class Stringpalindrome {

	public static void main(String[] args) {
  int i,j;
		String strRev = "madam";
		char arr[] = strRev.toCharArray();
		int len = arr.length;
		System.out.println(len-1);
		int len1=(len-1)/2; 
		
		for (i = 0,j=len-1; i<=len1; i++,j--) {
		 if(arr[i]==arr[j]){
			System.out.print("palindrome");
			break;
			}
		 else{
			 System.out.println("not palindrome");
			 break;
		 }
	       }
	}
}
