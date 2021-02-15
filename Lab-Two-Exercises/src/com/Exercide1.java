package com;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Create a method which accepts an array of integer elements and return the
 * second smallest element in the array
 */

public class Exercide1 {
	
	public static int getSecondSmallest(int[] numbArray) {
		Arrays.sort(numbArray);
		int secondHighest = numbArray.length-2;
		/*
		 * System.out.println(numbArray.length); for(int a: numbArray) {
		 * System.out.println(a); }
		 */
		return numbArray[secondHighest];
		// numbArray[numbArray[secondHighest-1]];
		
	}
	
	public static void main(String[] args) {
		
	int[] a = {1,2,5,8,2,1};
	//getSecondSmallest(a);
		System.out.println("The second largest number is "+getSecondSmallest(a));
		
		
	}

}
