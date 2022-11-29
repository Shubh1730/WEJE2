package com.jspider.multithreading.resouce;

public class Pizza {
	int noOfPizza;

	public Pizza(int noOfPizza) {
		System.out.println(noOfPizza+" Pizza's Available");
		this.noOfPizza = noOfPizza;
	}
	
	public int checkPizza()
	{
		return this.noOfPizza;
	}
	
	public synchronized void orderPizza(int noOfPizza)
	{
		System.out.println("Ordering "+ noOfPizza+" Pizza's");
		
		if (noOfPizza>checkPizza()) 
		{
			try {
				this.wait();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		this.noOfPizza -=noOfPizza;
		System.out.println("Successfully delivered "+noOfPizza+" Pizza's");
	}
	public synchronized void bakePizza(int noOfPizza)
	{
		this.noOfPizza += noOfPizza;
		System.out.println("Baking "+ noOfPizza+ " Pizza's for the order");
		System.out.println(checkPizza()+"Pizza's are Avaibale");
		this.notify();
	}

}
