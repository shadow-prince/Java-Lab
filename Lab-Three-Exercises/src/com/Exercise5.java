package com;

public class Exercise5 {

	
	/*
	 * Create a method that accepts a number and modifies it such that the each of
	 * the digit in the newly formed number is equal to the difference between two
	 * consecutive digits in the original number. The digit in the units place can
	 * be left as it is
	 */
	public static void countLinesAndLetters(String sentence) {
		System.out.println("Total number of letters : "+sentence.replace(" ","").length());
		int wordCount = 0;  
        
        for(int i = 0; i < sentence.length()-1; i++) {  
            
            if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {  
                wordCount++;  
            }  
        }  
        
        wordCount++;
        System.out.println("Total number of words: " + wordCount); 
	}
	public static void main(String[] args) 	{
		String inputString = "Nobita life is changed forever the day Doraemon, a cat-like robot from the future, pops out of a time portal";
		countLinesAndLetters(inputString);
	}

}
