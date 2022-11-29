package com.jspiders.multithreading.main;

import com.jspiders.multithreading.Thread.my1;
import com.jspiders.multithreading.Thread.my2;

public class mainMethod 
{
	public static void main(String [] args)
	{
		my1 a1=new my1();
		a1.start();
		my2 a2= new my2();
		Thread t1= new Thread(a2);
		t1.start();
	}

}
