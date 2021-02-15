package com;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter  number- ");  
		 
		int i , t1 = 0 , t2 = 1 , nextterm;
		Scanner n= new Scanner(System.in); 
		int a= n.nextInt();  
		System.out.println("FIBONACCI");
		for(i = 1; i<=a; ++i)
		{
			System.out.println(t1);
			nextterm = t1 + t2;
			t1 = t2;
			t2 = nextterm;
	}

}
}