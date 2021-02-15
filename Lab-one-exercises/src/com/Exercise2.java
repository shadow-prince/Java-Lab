package com;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		
		switch (a) {
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("ready");
			break;
		case "Green":
			System.out.println("go");
			break;
		default:
			System.out.println("Not a traffic light!!!!!");
			break;
		}

	}

}
