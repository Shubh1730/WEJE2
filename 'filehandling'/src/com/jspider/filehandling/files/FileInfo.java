package com.jspider.filehandling.files;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File  file=new File("C:\\FileMgr\\DemoFile.txt");
		
		if (file.canRead()) {
			System.out.println("FIle is Readable");
		} else {
			System.out.println("File is NOt Readable");
		}
		
		
		if (file.canWrite()) {
			System.out.println("File is writable");	
		} else {
			System.out.println("FIle is not writable");
		}
		
		if (file.canExecute()) {
			System.out.println("File is executable");
		} else {
			System.out.println("File is not executable");
		}
		System.out.println(file.length());
		
	}
}
