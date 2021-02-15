package com;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Create a method which accepts an integer array and 
removes all the duplicates in
the array. Return the resulting array in descending order
*/
public class Exercise4 {

	 private static void modifyArray(Integer[] arr) {
		 int end = arr.length;
		 Set<Integer> set = new HashSet<Integer>();

		 for(int i = 0; i < end; i++){
		   set.add(arr[i]);
		 }
		 Iterator it = set.iterator();
		 while(it.hasNext()) {
		   System.out.println(it.next());
		 } 
	 
	    }
	
	
	public static void main(String[] args) {
		Integer[] inputArray = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };
			modifyArray(inputArray);
	}

}
