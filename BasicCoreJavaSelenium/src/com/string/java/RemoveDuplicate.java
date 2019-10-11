package com.string.java;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String str = "abcabcabc";
		char str1[] = str.toCharArray();
		int len = str.length();

		System.out.println(removeDuplicate(str1, len));
	}

	private static String removeDuplicate(char[] str1, int len) {
		int j, k = 0;
		for (int i = 0; i < len; i++) {
			for (j = 0; j < i; j++) {
				if (str1[i] == str1[j]) {
					break;
				}
			}
			if (str1[i] == str1[j]) {
				str1[k++] = str1[i];
			}
		}
		
		String dup=String.valueOf(Arrays.copyOf(str1, k));
		return dup;
	}
}