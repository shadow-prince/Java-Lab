package com;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise5 {
	/*
	 * Create a method which accepts an array of 
	 * integer elements and return the
	 * second smallest element in the array
	 */
	private static Integer getSecondSmallest(Integer[] array) {
		List<Integer> li = new ArrayList<Integer>();
		for(int i:array) {
			li.add(i);
		}
		Collections.sort(li);
		System.out.println("Sorted array :" +li);
		 
		return li.get(1);
	}
	
	public static void main(String[] args) {
		
		Integer[] arr = {1,5,8,2,7,95,25,70};
		
		System.out.println("Second smallest no :" +getSecondSmallest(arr));;
		

	}

}
