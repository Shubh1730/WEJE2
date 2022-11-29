package com.jspiders.FileHandling.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterFile {
	public static void main(String[] args) {
		File file = new File("C:\\J2EE\\fileHandling\\dummy Folder\\CharFile.txt");
		try {
			if (file.exists()) {
				System.out.println("File is exists");
			} else {
				file.createNewFile();
				file.setReadable(true);
				file.setReadable(true);
				System.out.println("File is Created");
			}
			FileWriter fileWriter= new FileWriter(file);
			fileWriter.write("Aa meri jaan");
			System.out.println("Content written to file");
			fileWriter.close();
			
			FileReader fileReader=new FileReader(file);
			System.out.println(fileReader.read());
			System.out.println("Content read from file");
			fileReader.close();
			
			Scanner scanner=new Scanner (file);
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}
			 catch (IOException e) {
				e.printStackTrace();
			}
		}	
}
