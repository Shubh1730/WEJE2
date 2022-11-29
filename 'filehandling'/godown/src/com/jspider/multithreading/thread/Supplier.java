package com.jspider.multithreading.thread;

import com.jspider.multithreading.resource.Godown;

public class Supplier extends Thread{
	Godown godown;
	int product;

	public Supplier(Godown godown,int product) 
	{
		this.godown = godown;
		this.product= product;
	}
	
	@Override
	public void run() {
		godown.restockProduct(product);
	}
}
