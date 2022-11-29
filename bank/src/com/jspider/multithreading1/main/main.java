package com.jspider.multithreading1.main;

import com.jspider.multithreading1.resources.Account;
import com.jspider.multithreading1.threads.Husband;
import com.jspider.multithreading1.threads.Wife;

public class main 
{
	public static void main(String[] args) 
	{
		Account account = new Account(5000);
		Husband husband = new Husband(account);
		Wife wife = new Wife(account);
		husband.start();
		wife.start();
	}
}
