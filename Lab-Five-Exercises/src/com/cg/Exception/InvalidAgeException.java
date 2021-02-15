package com.cg.Exception;

public class InvalidAgeException extends Exception {
	public String Mesg;
	public InvalidAgeException() {
		this.Mesg = "Invalid age! Age must be above 15";
	}
	@Override
	public String toString() {
		 
		return this.Mesg;
	}
	}
	