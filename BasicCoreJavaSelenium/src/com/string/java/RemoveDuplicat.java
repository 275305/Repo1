package com.string.java;

public class RemoveDuplicat {
	
	public static void main(String[] args) {
		String str="abcdabcd";
		 char str1[]=str.toCharArray();
		int i,j, k = 0;
		for ( i = 0; i < str.length(); i++) {
			for (j = 0; j < i; j++) {
				if (str1[i] == str1[j])
				{
					break;
				}
			}//for
			if (str1[i] != str1[j]) {
				str1[k++] = str1[i];
			}
	        System.out.print(k-1);
	     }//for
	}//main
}
