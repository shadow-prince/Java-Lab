package com;

class powerOfTwo{
	public void checkerPower(int number) {
		int two =2,rem=0;
		while(number%2==0) {
			number = number/two;
		}
		System.out.println(number==1);
		}
	}


public class Exercise8 {

	public static void main(String[] args) {
	 
		powerOfTwo obj = new powerOfTwo();
		obj.checkerPower(20);
	}

}
