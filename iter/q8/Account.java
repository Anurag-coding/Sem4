package com.iter.q8;
public abstract class Account {
	protected int accountNumber ;
	protected double balance;
	Account(int accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	abstract void deposit();
	abstract void withdraw();
}