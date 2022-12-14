package com.jspiders.jdbc1;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class JdbcPrepared {
	private static Connection connection;
	private static PreparedStatement preparedstatement;
	private static int result;
	private static Properties properties=new Properties();
	private static FileReader filereader;
	private static String filepath = "C:\\Users\\Shubham\\eclipse-workspace\\jdbc\\resources\\dburl_info.properies";
	private static String query;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		try {
			filereader=new FileReader(filepath);			
			properties.load(filereader);
			
			Class.forName(properties.getProperty("driverpath"));
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties.getProperty("user"),properties.getProperty("password"));
			
			query="insert into Student values(?,?,?)";
			preparedstatement=connection.prepareStatement(query);
			
			System.out.println("enter id for student");
			int id = sc.nextInt();
			
			System.out.println("enter student name");
			String name = sc.next();
			
			System.out.println("enter email");
			String email = sc.next();
			
			preparedstatement.setInt(1, id);
			preparedstatement.setString(2, name);
			preparedstatement.setString(3,email);
			
			result=preparedstatement.executeUpdate();
			System.out.println(result+"rows(s) affected");
		}
		
		catch (Exception e) {
			
			e.printStackTrace();			
		}
				
	}
	

}
