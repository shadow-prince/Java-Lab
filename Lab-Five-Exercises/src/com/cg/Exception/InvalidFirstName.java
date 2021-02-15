package com.cg.Exception;

public class InvalidFirstName extends Exception {
	public String Mesg;
	public InvalidFirstName() {
		this.Mesg = "Invalid First name!Must not be blank";
	}
	@Override
	public String toString() {
		 
		return this.Mesg;
	}
}
