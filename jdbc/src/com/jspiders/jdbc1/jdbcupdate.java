package com.jspiders.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbcupdate {
	
	private static Connection connection;
	private static Statement statement;
	private static int result;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=(Connection) DriverManager.getConnection("jdbc:mysql://"+"localhost:3306/weje2?"+"user=root&password=root");
			
			statement=connection.createStatement();
			  result=statement.executeUpdate("update Student set name='Vaishu' where id=5");
			  System.out.println(result+"rows affected");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(connection!=null)
			{
				try {
					connection.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			if(statement!=null)
			{
				try {
					statement.close();
				} catch (SQLException e) {
				e.printStackTrace();
				}
			}
		}
	}
}
