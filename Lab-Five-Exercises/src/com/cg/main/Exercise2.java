package com.cg.main;

import com.cg.Exception.InvalidFirstName;
import com.cg.Exception.InvalidLastName;
import com.cg.bean.FirstAndLastNames;

public class Exercise2 {

	public static void main(String[] args) {
		 
		FirstAndLastNames nam = new FirstAndLastNames();
		try {
			nam.setFirstName("");
		} catch (InvalidFirstName e) {
			// TODO Auto-generated catch block
			System.out.println(e);;
		}
		try {
			nam.setLastName("");
		} catch (InvalidLastName e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

 	 

}