package com.jspiders.seriliazationDeserialization.Main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspiders.seriliazationDeserialization.User.User;

public class Main {
	public static void main(String[] args) {
		User user=new User(1,"shubham","shubh123");
		
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("C:\\j2ee\\filehandling\\dummy\\serial.txt");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(user);
			System.out.println("object wriiten");
			objectOutputStream.flush();
			objectOutputStream.close();
			
			FileInputStream fileInputStream=new FileInputStream("C:\\j2ee\\filehandling\\dummy\\serial.txt");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			User readObject=(User) objectInputStream.readObject();
			System.out.println(readObject);
			objectInputStream.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		} 
		
	}

}
