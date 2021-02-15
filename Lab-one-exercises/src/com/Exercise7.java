package com;


class checkNumber{
	public boolean checker(int number) {
		int num=0;
		boolean flag=false;
		num=number%10;
		while(number!=0) {
			if((number%10)<num) {
				flag = true;
				return flag;
			}
			number = number/10;
		}
		return flag;
	}
}


public class Exercise7 {

	public static void main(String[] args) {
		checkNumber obj = new checkNumber();
		System.out.println(obj.checker(12345));

	}

}
