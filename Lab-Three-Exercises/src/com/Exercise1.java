package com;

import java.util.StringTokenizer;

/*
 * Write a Java program that reads a line of integers and then displays each integer
 * and the sum of all integers. (Use String Tokenizer class)?
*/

public class Exercise1 {

	public static void main(String[] args) {

		String lineOfIntegers = "1 7 4 2 1";
		int sum=0,temp;
		StringTokenizer s = new StringTokenizer(lineOfIntegers);
		while(s.hasMoreTokens()) {
			//System.out.println(s.nextToken());
			temp=Integer.parseInt(s.nextToken());
			System.out.println(temp);
			
			sum+=temp;
			
		}
		System.out.println("The sum is: "+sum);
	}

}
