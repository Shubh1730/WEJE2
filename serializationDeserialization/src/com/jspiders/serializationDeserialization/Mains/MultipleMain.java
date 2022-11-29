package com.jspiders.serializationDeserialization.Mains;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.jspiders.serializationDeserialization.User.MultipleUser;

public class MultipleMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many number of users you want");
		int noOfUser= scanner.nextInt();
		for (int i = 1; i <= noOfUser; i++) {
			System.out.println("Enter Id");
			int id= scanner.nextInt();
			System.out.println("Enter UserName");
			String userName= scanner.next();
			System.out.println("Enter Password");
			String password = scanner.next();
			
			MultipleUser multipleUser=new MultipleUser(id, userName, password);
			
			try {
				FileOutputStream fileOutputStream= new FileOutputStream("C:\\J2EE\\fileHandling\\dummy Folder\\RTX.txt");
				ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
				
				objectOutputStream.writeObject(multipleUser);
				System.out.println("Object Written");
				objectOutputStream.flush();
				objectOutputStream.close();
				
				FileInputStream fileInputStream = new FileInputStream("C:\\J2EE\\fileHandling\\dummy Folder\\RTX.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				
				MultipleUser readObject= (MultipleUser) objectInputStream.readObject();
				System.out.println(readObject);
				objectInputStream.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}scanner.close();
	}
}
