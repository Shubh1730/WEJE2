package com.jspiders.multithreading.object;

public class MyThread extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("THIS is my thread");
		}
	}


}