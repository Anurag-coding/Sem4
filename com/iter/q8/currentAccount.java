package com.iter.q8;
class currentAccount extends Account {
    private double overdraftLimit;
    public currentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited amount "+ amt);
    }
    public void withdraw(double amt) {
        if (balance + overdraftLimit >= amt) {
            balance -= amt;
            System.out.println("Withdraw successfull of amount " + amt);
        } 
        else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
	void deposit() {
		System.out.println("Amount deposited.. ");
	}
	void withdraw() {
		System.out.println("Amount withdraw..");
	}
}
