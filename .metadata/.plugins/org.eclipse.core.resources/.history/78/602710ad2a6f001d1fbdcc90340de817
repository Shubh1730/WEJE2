package com.jspider.multithreading.thread;

import com.jspider.multithreading.resouce.Pizza;

public class Cafe extends Thread{
	Pizza pizza;

	public Cafe(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public void run() {
		pizza.bakePizza(10);
	}
}
