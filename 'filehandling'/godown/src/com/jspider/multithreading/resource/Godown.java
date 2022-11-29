package com.jspider.multithreading.resource;

public class Godown {
	int Product;

	public Godown(int product) {
//		System.out.println("Products in store is " + this.Product);
		this.Product = product;
	}

	public int checkProduct() {
		return this.Product;
	}

	public synchronized void orderProduct(int product) {
		System.out.println("Ordering " + product + " Products");
		if (product > checkProduct()) {
			//System.out.println(product + " product are not available please wait");
			System.out.println("From your order of "+product+" only "+checkProduct()+" are present. Wait for Restock" );

			try {

				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Now " + checkProduct() + " Products are available in store");
		System.out.println(product + " Product delivered");
		this.Product -= product;
		System.out.println("After delivery " + checkProduct() + " Products available");
	}

	public synchronized void restockProduct(int product) {
		this.Product += product;
		System.out.println("Requesting " + product + " Products for Restock from godown");
		this.notify();
	}
}
