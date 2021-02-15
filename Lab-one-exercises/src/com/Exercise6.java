package com;
import java.util.*;
import static java.lang.Math.*;
public class Exercise6 {

	public static void main(String[] args) {
		int sum = 0 , sum1 = 0; 
		double diff; 
		double b , c;
Scanner sc = new Scanner(System.in);
System.out.print("Enter  number- ");
int a = sc.nextInt();
for (int i = 1; i <= a; ++i) {
	sum+=i;
}
b = pow(sum , 2);
System.out.println(b);
for(int i=1; i<=a ; i++)
{
c = pow(i , 2);
sum1+=c;		
}
System.out.println(sum1);
diff = b - sum1;
System.out.println(diff);


	}

}
