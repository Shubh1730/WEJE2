package com.jspider.multithreading1.resources;

public class Account {
	
	double accountBal;

	public Account(double accountBal) 
	{
		super();
		this.accountBal = accountBal;
	}
	public void checkBal()
	{
		System.out.println(accountBal);
	}
	public void deposit (double amount)
	{
		accountBal += amount;
		checkBal();
	}
	public void withdraw (double amount)
	{
		if (amount<=accountBal) 
		{
			accountBal -= amount;
			checkBal();
		}
		else {System.out.println("Insufficient Balance");}
	}
}
