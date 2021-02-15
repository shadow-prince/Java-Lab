package com.cg.bean;

import com.cg.Exception.InvalidAgeException;

public class User {
	private String Name;
	private int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age)throws InvalidAgeException  {
		if(age<=15) {
			throw new InvalidAgeException();
		}
		else {
			this.age = age;
		}
		
	}
	
}
