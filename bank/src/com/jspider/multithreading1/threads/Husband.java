package com.jspider.multithreading1.threads;

import com.jspider.multithreading1.resources.Account;

public class Husband extends Thread
{
	Account a1;

	public Husband(Account a1) 
	{
		super();
		this.a1 = a1;
	}
	@Override
	public void run() {
		super.run();
		a1.deposit(1000);
		a1.withdraw(500);
	}
	
	
}
