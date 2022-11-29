package com.jspiders.serializationDeserialization.Mains;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspiders.serializationDeserialization.User.User;

public class Mains {
	
	public static void main(String[] args) {
		User user= new User(1, "Abhishek", "Abhi123");
		
		
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("C:\\J2EE\\fileHandling\\dummy Folder\\Serial.txt");
			ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(user);
			System.out.println("Object Written");
			objectOutputStream.flush();
			objectOutputStream.close();
			
			FileInputStream fileInputStream= new FileInputStream("C:\\J2EE\\fileHandling\\dummy Folder\\Serial.txt");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			User readObject=(User) objectInputStream.readObject();
			System.out.println(readObject);
			objectInputStream.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
