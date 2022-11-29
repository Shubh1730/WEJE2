package com.jspiders.FileHandling.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFile {
	public static void main(String[] args) {
		File file = new File("C:\\J2EE\\fileHandling\\dummy Folder\\fileDemo.txt");
		try {
		if (file.exists()) 
		{
			System.out.println("File is already exists");
		} 
		else 
		{
			file.setExecutable(true);
			file.setReadable(true);
			
				file.createNewFile();
				System.out.println("File is created");
		}		
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				String name= "Abhishek";
				byte[]b=name.getBytes();
				
				fileOutputStream.write(b);
				System.out.println("written from file");
				fileOutputStream.close();
				
				FileInputStream fileInputStream= new FileInputStream(file);
				System.out.println(fileInputStream.read());
				System.out.println("Printed from file");
				fileInputStream.close();
		
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
}
