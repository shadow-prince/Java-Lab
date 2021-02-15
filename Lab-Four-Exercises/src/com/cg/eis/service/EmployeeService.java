package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
// i) Get employee details from user
	
	public Employee getEmployeeDetails(int id,String name,double salary,String designation);

	/*
	 * ii) Find the insurance scheme for an employee based on salary and designation
	 */
	
	public String findInsuranceScheme(Employee emp);
	
	//iii) Display all the details of an employee.
	
	public void displayEmployeeDetails(Employee emp);
	
	

}
