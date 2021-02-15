package com;

import java.util.Arrays;

public class Exercise8 {
	
	private static boolean positiveString(String inputString) {
		char inpu[] = inputString.toCharArray();
		String copyString = String.copyValueOf(inpu);
		
		Arrays.sort(inpu);
		return(new String(copyString).equals(new String(inpu)));

	}

	public static void main(String[] args) {
	 
		String inputString = "ANT";
		
		System.out.println(positiveString(inputString)); 
	}

}
