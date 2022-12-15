package com.jspiders.multithreading.object;

public class MyThread1 implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++)
		{
			System.out.println("MY THREAD1 IS");
		}
		
	}

}
