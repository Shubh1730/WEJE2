package com.jspider.Threadclass.main;

import com.jspider.Threadclass.MyThread1;

public class myThreadMain1 {
	public static void main(String[] args) {
		
		
		
		MyThread1 mythread = new MyThread1();
		
		Thread thread = new Thread(mythread);
		thread.start();
	}
}
