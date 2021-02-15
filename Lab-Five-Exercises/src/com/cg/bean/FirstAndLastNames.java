package com.cg.bean;

import com.cg.Exception.InvalidFirstName;
import com.cg.Exception.InvalidLastName;

public class FirstAndLastNames {
	private String FirstName;
	private String LastName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) throws InvalidFirstName {
		if(firstName.isEmpty()) {
			throw new InvalidFirstName();
		}
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) throws InvalidLastName {
		if(lastName.isEmpty()) {
			throw new InvalidLastName();
		}
		LastName = lastName;
	}
}
