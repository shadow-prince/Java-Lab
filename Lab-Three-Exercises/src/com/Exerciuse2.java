package com;

/*
 * Create a class containing a method to create the mirror image of a String. 
 * The method should return the two Strings separated with a pipe(|) symbol 
*/

public class Exerciuse2 {
	
	public static String getImage(String original) {
		String out=original;
		StringBuffer s = new StringBuffer(original);	
		
		return out+"|"+s.reverse();
	}
		
	public static void main(String[] args) {
		System.out.println(getImage("EARTH"));
	}

}
