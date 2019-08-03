package com.string;

public class UniqueCharecter {
	
	
	public static void main(String[] args) {

		int i, j, c = 0;
		String str = "abc def abc";

		char[] arr = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			for (j = i; j < str.length(); j++) {
				if (arr[i] != arr[j] && arr[i] != ' ') {
					c = c + 1;
										
				}
			for(int k=0;k<=c;k++){
				System.out.println(arr[k]);
			}
			/*if(c==1)
				System.out.print(arr[j] + " " + c);
			c=0;*/
			}
		}

	}



}
