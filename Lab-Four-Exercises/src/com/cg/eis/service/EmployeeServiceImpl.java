package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Override
	public String findInsuranceScheme(Employee emp) {
		
		double sal = emp.getSalary();
		String desig = emp.getDesignation();
		if((sal>=400000 && sal <500000)&&(desig.equals("Senior Analyst")))
		{
			return "Scheme 1";
			
		}
		else if ((sal>=300000 && sal <400000)&&(desig.equals("Jr Analyst")))
				{
					return "Scheme 2";
					
				}
		else if ((sal>=200000 && sal <300000)&&(desig.equals("Technician")))
		{
			return "Scheme 3";
			
		}
		else  
		{
			return "Scheme 4";
			
		}
		
	}

	@Override
	public Employee getEmployeeDetails(int id, String name, double salary, String designation) {
			 
		Employee emp = new Employee();
			
			emp.setName(name);
			
			emp.setId(id);
			
			emp.setDesignation(designation);
			
			emp.setSalary(salary);
			return emp;		
	}

	@Override
	public void displayEmployeeDetails(Employee emp1) {
	 
		System.out.println("Employee Name : "+emp1.getId());
		System.out.println("Employee ID :"+emp1.getId());
		System.out.println("Employee salary :"+emp1.getSalary());
		System.out.println("Employee designation :"+emp1.getDesignation());
	}
}
