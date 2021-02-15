package com;
import java.util.*;

public class Exercise1 {
	static int sumOfDigits(int number){
		int sum = 0;
		int cubes = 0;
		while(number !=0) {
			sum = number%10;
			
			cubes += sum*sum*sum;
			number/=10;
		}
		return cubes;
	}
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in); 
		//Create a method to find the sum of the cubes of the digits of an n digit number
		System.out.print("Enter  number- ");  
		int a= sc.nextInt();   

		System.out.println("Total= " + sumOfDigits(a) );  
	}

}
