package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Create a method which accepts an integer array,
 * reverse the numbers in the array
 * and returns the resulting array in sorted order
 */
public class Exercise7 {
	public static List<String> getSorted(int[] array) {
		
		List<String> lis = new ArrayList<String>();
		for(Integer i:array) {
			lis.add(i.toString());
		}
		lis.toArray();
		Collections.reverse(lis);
		return lis;
	}
	public static void main(String[] args) {
		 
		int[] a = {1,23,5,8,88,9};
	 
		System.out.println(getSorted(a));
	}

}
