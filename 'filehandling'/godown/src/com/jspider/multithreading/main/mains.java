package com.jspider.multithreading.main;

import com.jspider.multithreading.resource.Godown;
import com.jspider.multithreading.thread.Customer;
import com.jspider.multithreading.thread.Supplier;

public class mains 
{
	public static void main(String[] args) {
		
		Godown godown= new Godown(100);
		
		Customer customer1= new Customer(godown,50);
		Customer customer2= new Customer(godown,70);
		Supplier supplier= new Supplier(godown,50);
		
		customer1.start();
		customer2.start();
		supplier.start();
	}
}
