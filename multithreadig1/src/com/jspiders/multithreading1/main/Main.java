package com.jspiders.multithreading1.main;

import com.jspiders.multithreading.object.MyThread;
import com.jspiders.multithreading.object.MyThread1;

public class Main {
	public static void main(String[] args) {
		
		
		MyThread mythread =new MyThread();
		mythread.run();
		MyThread1 myThread1=new MyThread1();
		myThread1.run();
	}

}
