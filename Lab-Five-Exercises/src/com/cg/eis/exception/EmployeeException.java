package com.cg.eis.exception;

public class EmployeeException extends Exception {
	public String Mesg;
	public EmployeeException() {
		this.Mesg = "Salary should not be less than Rs.3000";
	}
	 
	public String toString() { 
		return this.Mesg;
	}
}
