package com.iter.q8;
class SavingAccount extends Account {
	private double interestRate;
	public SavingAccount(int accountNumber,double balance,double interestRate) {
		super(accountNumber,balance);
		this.interestRate = interestRate;	
	}
	void deposit(double amt) {
		System.out.println("Deposited amount "+ amt);
		double intrest = (amt*interestRate)/100;
		balance += intrest+amt;
	}
	void withdraw(double amt) {
		if(balance >= amt) {
			balance-=amt;
			System.out.println("Withdraw successfull of amount "+amt);
		}
		else {
			System.out.println("Insufficient balance.......");
		}
	}
	@Override
	void deposit() {
		System.out.println("Amount deposited...");
	}
	@Override
	void withdraw() {
		System.out.println("Amount withdraw...");
		
		
	}
}


