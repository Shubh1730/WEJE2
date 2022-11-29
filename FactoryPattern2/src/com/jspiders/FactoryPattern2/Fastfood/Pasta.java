package com.jspiders.FactoryPattern2.Fastfood;

import com.jspiders.FactoryPattern2.interpace.Fastfood;

public class Pasta implements Fastfood{
	
	@Override
	public void OrderNow() {
		System.out.println("Friends ordering Pasta");
	}

}
