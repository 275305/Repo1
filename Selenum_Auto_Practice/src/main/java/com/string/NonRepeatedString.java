package com.string;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatedString {
	// print the non-repeated or unique character 
	public static void main(String[] args) {

		String str = "State";
		System.out.println("Original String is:" + str);
		char[] arr = str.toCharArray();
		// convert set to array
		Set<Character> set = new HashSet<Character>();
		for (char c : str.toCharArray()) {

			set.add(c);

		}

		System.out.print("non Repeated Charecter :" +set);
	}

}
