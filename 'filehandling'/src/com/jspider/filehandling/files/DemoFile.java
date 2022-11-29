package com.jspider.filehandling.files;

import java.io.File;
import java.io.IOException;

public class DemoFile {
	public static void main(String[] args) {
		File file =new File("C:\\FileMgr\\DemoFile.txt");
		try {
			file.createNewFile();
			System.out.println("File is Created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
