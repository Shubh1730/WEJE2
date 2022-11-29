package com.jspiders.FileHandling.files;

import java.io.File;
import java.io.IOException;

public class DemoFiles {
	public static void main(String[] args) {
		File file= new File("C:\\FileMgr\\DemoFile.txt");
		try {
			file.createNewFile();
			System.out.println("File is Created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
