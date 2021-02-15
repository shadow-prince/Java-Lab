package com.cg.Exception;

public class InvalidLastName extends Exception {
	public String Mesg;
	public InvalidLastName() {
		this.Mesg = "Invalid Last name! Must not be blank";
	}
	@Override
	public String toString() {
		 
		return this.Mesg;
	}

}
