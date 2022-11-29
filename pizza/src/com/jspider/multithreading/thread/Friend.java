package com.jspider.multithreading.thread;

import com.jspider.multithreading.resouce.Pizza;

public class Friend extends Thread{
	Pizza pizza;

	public Friend(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public void run() {
		pizza.bakePizza(10);
	}
}
