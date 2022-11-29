package com.jspiders.FileHandling.files;

import java.io.File;

public class FileInfo {

		public static void main(String[] args) {
			File file= new File("C:\\FileMgr\\DemoFile.txt");
			
			if (file.canRead()) {
				System.out.println("File is Readable");
			} else {
				System.out.println("File is not Readable");
			}
			if (file.canWrite()) {
				System.out.println("File is Writeable");
			} else {
				System.out.println("File is not Writeable");
			}
			if (file.canExecute()) {
				System.out.println("File is Executable");
			} else {
				System.out.println("File is not Executeable");
			}
			System.out.println(file.length());
		}
}
