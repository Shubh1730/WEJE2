package com.jspider.filehandling.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Charactarfile {
	public static void main(String[] args) {
		File file=new File("characterStream.txt");
		try {
			if(file.exists())
			{
				System.out.println("File is allready exists");
			}
			else
			{
				file.createNewFile();
				file.setReadable(true);
				file.setExecutable(true);
				System.out.println("file are created");
			}
			FileWriter fwrite=new FileWriter(file);
			fwrite.write("ha meri jaan");
			System.out.println("content Written to file");
			fwrite.close();
			
			FileReader freader=new FileReader(file);
			System.out.println(freader.read());
			System.out.println("content read from file");
			freader.close();
			
			Scanner sc=new Scanner(file);
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
