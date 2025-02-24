package com.iter.q8;
public class BankingApp {
	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount(257469987,224545.4,782.9);
		s1.deposit(35500);
		s1.withdraw(58032);
		currentAccount c1 = new currentAccount(78996458,5874.8,2667);
		c1.deposit(5768);
		c1.withdraw(165366);
	}
}
