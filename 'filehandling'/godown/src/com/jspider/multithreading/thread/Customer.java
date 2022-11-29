package com.jspider.multithreading.thread;

import com.jspider.multithreading.resource.Godown;

public class Customer extends Thread{

	Godown godown;
	int product;

	public Customer(Godown godown,int product) 
	{
		this.godown = godown;
		this.product= product;
	}
	
	@Override
	public void run() {
		godown.orderProduct(product);
	}
}
