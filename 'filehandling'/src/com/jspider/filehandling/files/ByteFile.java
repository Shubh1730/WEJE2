package com.jspider.filehandling.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFile {
	public static void main(String[] args) {
		File file =new File("ByteStream.txt");
		try {
		if(file.exists())
		{
			System.out.println("The File allready exists");
		}
		else
		{
			file.setReadable(true);
			file.setExecutable(true);
			
			file.createNewFile();
			System.out.println("File created");
		}
				
				
				FileOutputStream opStream=new FileOutputStream(file);
				String name="shubham";
				byte []b=name.getBytes();
				
				opStream.write(b);
				System.out.println("Written from file");
				opStream.close();
				
				FileInputStream ipStream=new FileInputStream(file);
				System.out.println(ipStream.read());
				System.out.println("printed from file");
				ipStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}


