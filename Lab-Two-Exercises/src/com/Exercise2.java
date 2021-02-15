package com;

import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

/*
Exercise 2: Create a method that can accept an array of String objects andsort in alphabetical
order. The elements in the left half should be completely in uppercase and the elements in the
right half should be completely in lower case. Return the resulting array.
Note: If there are odd number of String objects, then (n/2) +1 elements should be in
UPPPERCASE
*/

public class Exercise2 {
	
	public static String sortStrings(String inputString) {
		int inputLength;
		if(inputString.length()%2==0)
		{
			inputLength = inputString.length()/2;
		}
		else {
			inputLength = (inputString.length()/2)+1;
		}
		String left = inputString.substring(0, inputLength).toUpperCase();
		String right = inputString.substring(inputLength,inputString.length());
		return left+right;
	}

	public static void main(String[] args) {
		System.out.println("Enter String : ");
		Scanner s = new Scanner(System.in);
		String inputString = s.next();
		
		System.out.println(sortStrings(inputString));
		
		
		
	}
	

}
