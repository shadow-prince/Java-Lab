package com;


public class Exercise4 {
	
	private static int modifyNumber(int number1) {
		String n=Integer.toString(number1);
		String outPut = "";
		try {
			for(int i =0;i<n.length();i++) {
				char a = n.charAt(i);
				char b = n.charAt(i+1);
				int x = (int)a;
				int y = (int)b;
				outPut+=Math.abs(x-y);
				//System.out.print();
			}
			}
			catch (StringIndexOutOfBoundsException e) {
				//System.out.print(n.substring(n.length()-1));
				outPut+=n.substring(n.length()-1);
			}
		return Integer.parseInt(outPut);

	}
 
	
	public static void main(String[] args)
	{
		 
		int n = 45862;
		/*
		 * for(char a:n.toCharArray()) { System.out.println(a); }
		 */
		
			System.out.println(modifyNumber(n));
		}
		
	}
