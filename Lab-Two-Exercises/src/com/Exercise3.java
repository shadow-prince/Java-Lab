package com;
import java.util.*;
/*
 * Create a method which accepts an integer array, 
 * reverse the numbers in the array
 * and returns the resulting array in sorted order
*/

public class Exercise3 {
	
	public static int getsorted(int[] inputArray) {
		int arraySize=inputArray.length;
		System.out.println(arraySize);
		int[] outputArray = new int[inputArray.length];
		for(int a=0;a<arraySize;a++) {
			StringBuffer xd = new StringBuffer();
			xd.append(Integer.toString(inputArray[a]));
			xd.reverse();
			//System.out.println(xd);
			outputArray[a]=Integer.parseInt(xd.toString());
		}
		Arrays.sort(outputArray);
		for(int j:outputArray) {
			System.out.print(j +" ");
		}
		
		return 0;
	}

	public static void main(String[] args) {
		int a[] = {12,15,81,10,41,27};
		
		getsorted(a);
		
	}

}
