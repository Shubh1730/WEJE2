package com.jspider.Threadclass.main;

import com.jspider.Threadclass.MyThread;

public class MythreadMain {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
	}
}
