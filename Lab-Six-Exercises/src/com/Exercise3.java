package com;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
	/*
	 * Create a method which accepts an array of numbers and 
	 * returns the numbers and
	 * their squares in Hashmap
	 */
	
	private static Map getSquares(int[] arr) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int c1:arr) {
			hm.put(c1, c1*c1);
			 
			}
		return hm;
		}
		
	
	
	public static void main(String[] args) {

		int[] arr = {1,5,7,8,9,10};
		System.out.println(getSquares(arr));

	}

}
