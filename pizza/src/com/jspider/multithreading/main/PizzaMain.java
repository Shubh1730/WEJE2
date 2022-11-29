package com.jspider.multithreading.main;

import com.jspider.multithreading.resouce.Pizza;
import com.jspider.multithreading.thread.Cafe;
import com.jspider.multithreading.thread.Friend;

public class PizzaMain 
{
	public static void main(String[] args) {
		Pizza pizza = new Pizza(30);
		Friend friend =new Friend(pizza);
		Cafe cafe = new Cafe(pizza);
		friend.start();
		cafe.start();
	}
}
