package com.cg.main;

import com.cg.Exception.InvalidAgeException;
import com.cg.bean.User;

public class Exercise1 {

	public static void main(String[] args) {
		 
	User us = new User();
		 try {
			us.setAge(15);
			 System.out.println(us.getAge());
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
	}

} 
	
			 

}