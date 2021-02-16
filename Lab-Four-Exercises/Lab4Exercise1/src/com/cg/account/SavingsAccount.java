package com.cg.account;

public class SavingsAccount extends Account {
	private final double minBalance = 2000;
	
	@Override
	public void withdraw(double amt) {
		 if(getBalance() > minBalance) {
			if(amt<(getBalance()-minBalance)) {
				setBalance(getBalance()-amt);
				System.out.println("\tWithdraw susscesful!");
				System.out.println("\tWithdrawn Rs."+amt);
				System.out.println("\tCurrent balance Rs."+getBalance());
			}
			
		 }
		 else {
				System.out.println("\t!!Withdraw not possible!!");

		 }
		
	}

	@Override
	public void deposit(double amt) {
	 setBalance(getBalance()+amt);
	 System.out.println("\t*** Deposited Rs."+amt+"******");
		
	}

}
