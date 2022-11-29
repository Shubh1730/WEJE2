package com.jspider.multithreading1.threads;

import com.jspider.multithreading1.resources.Account;

public class Wife extends Thread
{
	Account a1;

	public Wife(Account a1) {
		super();
		this.a1 = a1;
	}
	@Override
	public void run() {
		super.run();
		a1.deposit(1500);
		a1.withdraw(1500);
	}
}
