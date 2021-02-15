package com;

import java.time.LocalDate;
import java.time.Period;
public class Exercise9 {
	/*
	 * Write a Java program that displays the number of characters, lines and words
	 * in a text?
	 */
		public static void acceptdate(String dateInput) {
			
		}
	
	public static void main(String[] args) {
		 
	      LocalDate date1 = LocalDate.of(2019, 2, 12);
	      LocalDate date2 = LocalDate.now();
	      Period p = Period.between(date1, date2);
	      System.out.println("Years (Difference) = "+p.getYears());
	      System.out.println("Month (Difference) = "+p.getMonths());
	      System.out.println("Days (Difference) = "+p.getDays());
		   }
}
