package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2 {
	/*Create a method that accepts a character array and count the
	 *  number of times each character is present in the array
	 * 
	 * 
	*/
	
	
	@SuppressWarnings("rawtypes")
	
	public static Map countChars(char[] arr){
		Map<Character, Integer> hm = new HashMap<Character, Integer>(); 
		
		/*
		 * for (char i : arr) { Integer j = hm.get(i); hm.put(i, (j == null) ? 1 : j +
		 * 1); }
		 */
		
		for(char c1:arr) {
			if(hm.containsKey(c1)) {
				int a=hm.get(c1);
				hm.put(c1, a+1);
				
			}
			else {
				hm.put(c1, 1);
			}
		}
		
		return hm;
		
	}
	
	
	public static void main(String[] args) {
	
	//	String[] c = {"a","b","c","d","a","b"};
		String str = "saiKishore";
		char[] c = str.toCharArray();
		
		System.out.println(countChars(c));
		
	}

}
