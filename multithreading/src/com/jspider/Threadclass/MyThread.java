package com.jspider.Threadclass;

public class MyThread extends Thread {
	public void run() { 
		for(int i=1;i<=3;i++) {
			System.out.println("thread is running");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
