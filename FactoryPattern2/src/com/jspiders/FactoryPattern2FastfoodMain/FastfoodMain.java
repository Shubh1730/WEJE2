package com.jspiders.FactoryPattern2FastfoodMain;

import java.util.Scanner;

import com.jspiders.FactoryPattern2.Fastfood.Burger;
import com.jspiders.FactoryPattern2.Fastfood.ColdCoffee;
import com.jspiders.FactoryPattern2.Fastfood.Fries;
import com.jspiders.FactoryPattern2.Fastfood.Pasta;
import com.jspiders.FactoryPattern2.Fastfood.Pizza;
import com.jspiders.FactoryPattern2.interpace.Fastfood;

public class FastfoodMain {
	static boolean loop=true;
	static Fastfood fastfood;
	
	public static void main(String[] args) {
		while (loop) {
			try {
				fastfoodFactory().OrderNow();
			} catch (NullPointerException e) {
				System.out.println("No food available on this number");
			}
		}
	}
	public static Fastfood fastfoodFactory() {
		System.out.println("Select a snacks to eat =>\n"
				+ "Press 1 for Pizza \n"
				+ "Press 2 for Burger \n"
				+ "Press 3 for Pasta \n"
				+ "Press 4 for Fries \n"
				+ "Press 5 for Cold Coffee");
		
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		scanner.close();
		
		switch (choose) {
		case 1:
			fastfood=new Pizza();
			loop=false;
			return fastfood;
		case 2:
			fastfood=new Burger();
			loop=false;
			return fastfood;
		case 3:
			fastfood=new Pasta();
			loop=false;
			return fastfood;
		case 4:
			fastfood=new Fries();
			loop=false;
			return fastfood;
		case 5:
			fastfood=new ColdCoffee();
			loop=false;
			return fastfood;

		default:
			System.out.println("Invalid Choice");
			loop = false;
			return fastfood;
		}
		
		
	} 

}
