package com.string.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateChar {
	
	public static void main(String[] args) {
	
		String str="abcdabcd";
		 Set set=new HashSet();
		 for(int i=0;i<str.length();i++){
		  char c=str.charAt(i);
		  set.add(c);
		 }
		 
		 //System.out.println(set);
		 Iterator<Character> itr=set.iterator();
		 while(itr.hasNext()){
			 System.out.print(itr.next());
		 }
		 
		 
	}
      
	
}
