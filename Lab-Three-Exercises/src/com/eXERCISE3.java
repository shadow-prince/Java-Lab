package com;

public class eXERCISE3 {

	
	/*
	 * private static String alterString(String inputString) {
	 * 
	 * //inputString.replaceAll(); return "[a-z[^aeiou]]"; }
	 */
	private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";

	private static String alterString(String inputString) {
		
		char[] chars = inputString.toLowerCase().toCharArray();
	    for (int i = 0; i < chars.length; i++) {
	        int idx = CONSONANTS.indexOf(chars[i]);
	        if (idx != -1)
	            chars[i] = CONSONANTS.charAt((idx + 1) % CONSONANTS.length());
	    }
	    return new String(chars);
		
	}
	
	public static void main(String[] args) {
	 
		String inputString="JAVA";
		System.out.println(alterString(inputString));
	}

}
