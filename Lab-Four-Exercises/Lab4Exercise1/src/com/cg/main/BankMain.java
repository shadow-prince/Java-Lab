package com.cg.main;

import com.cg.account.CurrentAccount;
import com.cg.account.SavingsAccount;
import com.cg.persn.Person;

public class BankMain {

	public static void main(String[] args) {
		
		String name = "Sai kishore";
		int age = 24;
		System.out.println("===========Savings Account=========");
		 Person p = new Person(); 
		 p.setName(name); p.setAge(age);
		  
		 
		SavingsAccount sa = new SavingsAccount();
		sa.setAccHolder(p);
		
		System.out.println("Name "+ sa.getAccHolder().getName());
		System.out.println("Age "+sa.getAccHolder().getAge());
		
		
		sa.withdraw(251);
		sa.deposit(2500);
		sa.withdraw(251);
		//sa.getAccNum();
		System.out.println("===========Current Account=========");
		CurrentAccount ca = new CurrentAccount();
		ca.setAccHolder(p);
		System.out.println("Name "+ ca.getAccHolder().getName());
		System.out.println("Age "+ca.getAccHolder().getAge());
		ca.deposit(5000);
		ca.withdraw(5000);
	}

}
