package com.jspiders.FactoryPattern2.Fastfood;

import com.jspiders.FactoryPattern2.interpace.Fastfood;

public class ColdCoffee implements Fastfood{
	
	@Override
	public void OrderNow() {
		System.out.println("Friends ordering ColdCoffee");
	}

}
