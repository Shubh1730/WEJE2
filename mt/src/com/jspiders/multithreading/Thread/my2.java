package com.jspiders.multithreading.Thread;

public class my2 implements Runnable
{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("2 is output");
		}
	}
}
