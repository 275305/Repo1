package com.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortingNumber {
	
	public static void main(String[] args) {
		Integer arr[]= {5,4,3,2,1,5,4,3,2,1};
		
		Set<Integer> setSort=new HashSet<Integer>(Arrays.asList(arr));
		
		System.out.println("sorted Arrays"+setSort);
		 
	}

}
