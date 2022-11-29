package com.jspiders.multithreading.Thread;

public class my1 extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("1 is printing");
		}
	}
}
