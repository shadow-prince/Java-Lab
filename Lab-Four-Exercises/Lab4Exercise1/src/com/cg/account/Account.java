package com.cg.account;

import com.cg.persn.Person;

public abstract class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	abstract void withdraw(double amt);
	abstract void deposit(double amt);
	
	 
}
